package com.aptana.ide.epl;

import java.util.Collection;
import java.util.Hashtable;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin
{

	// The plug-in ID
	public static final String PLUGIN_ID = "com.aptana.ide.epl"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	private static Hashtable<String, Image> images;

	/**
	 * The constructor
	 */
	public Activator()
	{
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception
	{
		super.start(context);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception
	{
		plugin = null;
		if (images != null)
		{
			Collection<Image> imgs = images.values();
			for (Image image : imgs)
			{
				image.dispose();
			}
			images = null;
		}
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault()
	{
		return plugin;
	}

	/**
	 * returns image from cache or by loading it using plugin related path
	 * 
	 * @param path
	 * @return image
	 */
	public static Image getImage(String path)
	{
		if (images == null)
		{
			images = new Hashtable<String, Image>();
		}
		if (images.get(path) == null)
		{
			ImageDescriptor id = getImageDescriptor(path);

			if (id == null)
			{
				return null;
			}

			Image i = id.createImage();

			images.put(path, i);

			return i;
		}
		else
		{
			return (Image) images.get(path);
		}
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in relative path.
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path)
	{
		return AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, path); //$NON-NLS-1$
	}
}
