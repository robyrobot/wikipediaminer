package org.wikipedia.miner.extract;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.FileReader;
import org.apache.avro.file.SeekableInput;
import org.apache.avro.mapred.FsInput;
import org.apache.avro.mapred.Pair;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.junit.Test;
import org.wikipedia.miner.extract.model.struct.PageDetail;

import static org.junit.Assert.assertNotNull;

public class AvroTestCase {



	@Test
	public void deserializeAvroData() {



	}
	

	
}
