package com.aptana.ide.filesystem.ftp.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
 
@RunWith(Suite.class)
@Suite.SuiteClasses({
	FTPConnectionTest.class,
	FTPConnectionWithBasePathTest.class,
	FTPCachedConnectionTest.class
})
public abstract class AllTests {
}
