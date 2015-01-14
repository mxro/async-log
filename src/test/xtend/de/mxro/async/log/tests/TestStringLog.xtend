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
	
	@Test
	def void test_filled() {
		
		val log = Logs.create(20)
		
		for (i: 1..100) {
			log.record(Logs.entry("log1", "entry "+i));
			
		}
		
		(log.retrieve("log1", StringLog).get.entries.size < 21) => true
		
		log.stop.get
		
	}
	
}