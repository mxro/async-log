package de.mxro.async.log.tests

import de.mxro.async.log.jre.Log
import de.oehme.xtend.junit.JUnit
import org.junit.Test

@JUnit
class TestStringLog {
	
	@Test
	def void test() {
		
		val log = Log.create
		
		log.record(Log.entry("log1", "123"));
		
		
		log.print
		
		log.stop.get
		
	}
	
}