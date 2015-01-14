package de.mxro.async.log.tests

import de.mxro.async.log.jre.Logs
import de.mxro.async.log.values.StringLog
import de.oehme.xtend.junit.JUnit
import org.junit.Test

@JUnit
class TestStringLog {
	
	@Test
	def void test() {
		
		val log = Logs.create
		
		log.record(Logs.entry("log1", "entry 1"));
		log.record(Logs.entry("log1", "entry 2"));
		log.record(Logs.entry("log1", "entry 3"));
		
		log.retrieve("log1", StringLog).get.entries.size => 3
		
		log.stop.get
		
	}
	
}