package com.miga.springcloud.lab7sentenceserver.service;

import com.miga.springcloud.lab7sentenceserver.domain.Word;

public interface WordService {

    Word getSubject();
    Word getVerb();
    Word getArticle();
    Word getAdjective();
    Word getNoun();

}
