package org.resthub.identity.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Test;
import org.resthub.core.service.GenericResourceService;
import org.resthub.core.test.AbstractResourceServiceTest;
import org.resthub.identity.model.User;

public class TestUserService extends AbstractResourceServiceTest<User, GenericResourceService<User>> {

	@Inject
	@Named("userService")
	@Override
	public void setResourceService(GenericResourceService<User> resourceService) {
		super.setResourceService(resourceService);
	}
	
	@Override
    @Test(expected = UnsupportedOperationException.class)
    public void testUpdate() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
