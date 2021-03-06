/**
 * This file Copyright (c) 2005-2010 Aptana, Inc. This program is
 * dual-licensed under both the Aptana Public License and the GNU General
 * Public license. You may elect to use one or the other of these licenses.
 * 
 * This program is distributed in the hope that it will be useful, but
 * AS-IS and WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE, TITLE, or
 * NONINFRINGEMENT. Redistribution, except as permitted by whichever of
 * the GPL or APL you select, is prohibited.
 *
 * 1. For the GPL license (GPL), you can redistribute and/or modify this
 * program under the terms of the GNU General Public License,
 * Version 3, as published by the Free Software Foundation.  You should
 * have received a copy of the GNU General Public License, Version 3 along
 * with this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * Aptana provides a special exception to allow redistribution of this file
 * with certain other free and open source software ("FOSS") code and certain additional terms
 * pursuant to Section 7 of the GPL. You may view the exception and these
 * terms on the web at http://www.aptana.com/legal/gpl/.
 * 
 * 2. For the Aptana Public License (APL), this program and the
 * accompanying materials are made available under the terms of the APL
 * v1.0 which accompanies this distribution, and is available at
 * http://www.aptana.com/legal/apl/.
 * 
 * You may view the GPL, Aptana's exception and additional terms, and the
 * APL in the file titled license.html at the root of the corresponding
 * plugin containing this source file.
 * 
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.ide.syncing.ui.wizards;

import org.eclipse.osgi.util.NLS;

/**
 * @author Pavel Petrochenko
 */
public class Messages extends NLS {

    private static final String BUNDLE_NAME = "com.aptana.ide.syncing.ui.wizards.messages"; //$NON-NLS-1$

    /**
     * SyncExportPage_Confirm_Overwrite
     */
    public static String SyncExportPage_Confirm_Overwrite;
    /**
     * SyncExportPage_DESCRIPTION
     */
    public static String SyncExportPage_DESCRIPTION;
    /**
     * SyncExportPage_Error
     */
    public static String SyncExportPage_Error;
    /**
     * SyncExportPage_NO_WARNING
     */
    public static String SyncExportPage_NO_WARNING;
    /**
     * SyncExportPage_NOT_WRITABLE
     */
    public static String SyncExportPage_NOT_WRITABLE;
    /**
     * SyncExportPage_Overwrite
     */
    public static String SyncExportPage_OPTIONS;
    /**
     * SyncExportPage_Overwrite
     */
    public static String SyncExportPage_Overwrite;
    /**
     * SyncExportPage_TITLE
     */
    public static String SyncExportPage_TITLE;
    /**
     * SyncExportPage_TO_FILE
     */
    public static String SyncExportPage_TO_FILE;
    /**
     * SyncImportPage_DESCRIPTION
     */
    public static String SyncImportPage_DESCRIPTION;
    /**
     * SyncImportPage_FILE_NOT_EXIST
     */
    public static String SyncImportPage_FILE_NOT_EXIST;
    /**
     * SyncImportPage_FILE_NOT_EXIST_DESC
     */
    public static String SyncImportPage_FILE_NOT_EXIST_DESC;
    /**
     * SyncImportPage_FILE_NOT_READABLE
     */
    public static String SyncImportPage_FILE_NOT_READABLE;
    /**
     * SyncImportPage_FILE_NOT_READABLE_DESC
     */
    public static String SyncImportPage_FILE_NOT_READABLE_DESC;
    /**
     * SyncImportPage_FROM_FILE
     */
    public static String SyncImportPage_FROM_FILE;
    /**
     * SyncImportPage_TITLE
     */
    public static String SyncImportPage_TITLE;

    public static String RemoteConnectionSelectionPage_Connections;
    public static String RemoteConnectionSelectionPage_ERR_SelectSiteOrCreateNewOne;
    public static String RemoteConnectionSelectionPage_LBL_DownloadOnFinish;
    public static String RemoteConnectionSelectionPage_LBL_NewConnection;
    public static String RemoteConnectionSelectionPage_LBL_Options;
    public static String RemoteConnectionSelectionPage_LBL_SelectRemoteLocationOfThisProject;

    public static String RemoteProjectWizard_LBL_CreateNameAndLocationForLocalProject;
    public static String RemoteProjectWizard_MSG_CreatingRemoteProject;
    public static String RemoteProjectWizard_TTL_ConnectHostedSiteWizard;
    public static String RemoteProjectWizard_TTL_CreateNewExistingHostedSiteProject;
    public static String RemoteProjectWizard_TTL_SelectRemoteConnection;
    public static String RemoteProjectWizard_UIJOB_Synchronizing;

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
