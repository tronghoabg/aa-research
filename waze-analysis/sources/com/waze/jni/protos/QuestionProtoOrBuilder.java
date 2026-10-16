package com.waze.jni.protos;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.QuestionProto;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface QuestionProtoOrBuilder extends fj {
    boolean getAlwaysShow();

    int getButtonOrientation();

    QuestionProto.CallToAction getCtas(int i2);

    int getCtasCount();

    List<QuestionProto.CallToAction> getCtasList();

    boolean getDismissible();

    int getDisplayTimeSec();

    QuestionProto.EncTemplate getEncTemplate();

    int getEncTemplateValue();

    String getImageUrl();

    v getImageUrlBytes();

    String getKey();

    v getKeyBytes();

    QuestionProto.Link getLinks(int i2);

    int getLinksCount();

    List<QuestionProto.Link> getLinksList();

    String getQuestionId();

    v getQuestionIdBytes();

    String getSubtitle();

    v getSubtitleBytes();

    String getText();

    v getTextBytes();

    boolean hasImageUrl();

    boolean hasKey();

    boolean hasQuestionId();

    boolean hasSubtitle();

    boolean hasText();
}
