package com.aptana.ide.syncing.tests;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.eclipse.core.runtime.Path;

import com.aptana.ide.core.io.LocalConnectionPoint;
import com.aptana.ide.filesystem.ftp.FTPConnectionPoint;

public class FTPSyncingTests extends SyncingTests
{

	@Override
	protected void setUp() throws Exception
	{
		File baseTempFile = File.createTempFile("test", ".txt"); //$NON-NLS-1$ //$NON-NLS-2$
		baseTempFile.deleteOnExit();
		
		File baseDirectory = baseTempFile.getParentFile();
		
		LocalConnectionPoint lcp = new LocalConnectionPoint();
		lcp.setPath(new Path(baseDirectory.getAbsolutePath()));
		clientManager = lcp;

		Properties props = new Properties();
		FileInputStream inStream = new FileInputStream(System.getenv().get("junit.properties"));
		props.load(inStream);

		FTPConnectionPoint ftpcp = new FTPConnectionPoint();
		ftpcp.setHost(props.getProperty("ftp.host")); //$NON-NLS-1$
		ftpcp.setLogin(props.getProperty("ftp.username")); //$NON-NLS-1$
		ftpcp.setPassword(props.getProperty("ftp.password").toCharArray());
		serverManager = ftpcp;

		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception
	{
		// TODO Auto-generated method stub
		super.tearDown();
	}

}
