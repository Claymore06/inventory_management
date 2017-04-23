package services;

import java.util.List;

import com.avaje.ebean.annotation.Transactional;
import com.google.inject.Singleton;

import models.TestEntity;
import play.Logger;

@Singleton
public class TestService {

	public List<TestEntity> findAllTestEntity() {
		Logger.info("レコード取得");
		return TestEntity.find.all();
	}

	@Transactional(readOnly = false)
	public void deleteOne(TestEntity target) {
		TestEntity.find.deleteById(target.id);
	}
}
