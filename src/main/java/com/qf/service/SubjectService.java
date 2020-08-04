package com.qf.service;

import com.qf.pojo.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> findSubjects();

    Subject findSubjectById(Integer subject_id);
}
