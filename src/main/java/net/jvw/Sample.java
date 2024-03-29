package net.jvw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sample {

  private static final Logger LOG = LoggerFactory.getLogger(Sample.class);

  public Sample() {
    LOG.debug("Hello world");
    LOG.info("Hello world");
    LOG.warn("Hello world");
    LOG.error("Hello world");
  }
}