package de.mxro.async.log.tests

import de.oehme.xtend.junit.JUnit
import org.junit.Test
import de.mxro.async.log.jre.Logs

@JUnit
class TestStringLog {
	
	@Test
	def void test() {
		
		val log = Logs.create
		
		log.record(Logs.entry("log1", "entry 1"));
		log.record(Logs.entry("log1", "entry 2"));
		log.record(Logs.entry("log1", "entry 3"));
		
		
		log.retrieve("log1")
		
		log.stop.get
		
	}
	
}