package com.egnosistek.compmodservice.dao;

import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Repository
@Transactional
public interface CompModDao {

    //public List<String> getModel(int modelId);

}


