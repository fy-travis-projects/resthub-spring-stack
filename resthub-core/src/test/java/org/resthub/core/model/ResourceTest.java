package org.resthub.core.model;

import junit.framework.Assert;

import org.junit.Test;
import org.resthub.core.model.Resource;

public class ResourceTest {

	@SuppressWarnings("serial")
	class RedResource extends Resource {
		public RedResource() {
		}
		public RedResource(String ref) {
			super(ref);
		}
	}

	@SuppressWarnings("serial")
	class BlueResource extends Resource {
		public BlueResource() {
		}
		public BlueResource(String ref) {
			super(ref);
		}
	}

	@Test
	public void testSameResourcesEqualsShouldbeEquals() {
		Assert.assertTrue(new RedResource().equals(new RedResource()));
	}

	@Test
	public void testResourcesOfDifferentTypesShoudNotBeEquals() {
		Assert.assertFalse(new RedResource().equals(new BlueResource()));
	}

	@Test
	public void testResourcesWithSameIdShouldBeEquals() {
		RedResource r1 = new RedResource();
		r1.setId(123L);
		RedResource r2 = new RedResource();
		r2.setId(123L);
		Assert.assertTrue(r1.equals(r2));
	}

	@Test
	public void testResourcesWithDiffentIdShouldNotBeEquals() {
		RedResource r1 = new RedResource();
		r1.setId(123L);
		RedResource r2 = new RedResource();
		r2.setId(1234L);
		Assert.assertFalse(r1.equals(r2));
	}

	@Test
	public void testResourcesWithSameRefShouldBeEquals() {
		RedResource r1 = new RedResource("123");
		RedResource r2 = new RedResource("123");
		Assert.assertTrue(r1.equals(r2));
	}

	@Test
	public void testResourcesWithDiffentRefShouldNotBeEquals() {
		RedResource r1 = new RedResource("123");
		RedResource r2 = new RedResource("1234");
		Assert.assertFalse(r1.equals(r2));
	}

}