package com.waze.jni.protos;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.common.SkinState;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface EtaLabelDataOrBuilder extends fj {
    int getBackgroundColor();

    int getDpi();

    String getImage();

    v getImageBytes();

    int getImageType();

    SkinState getSkinState();

    int getSkinStateValue();

    String getSubTitle();

    v getSubTitleBytes();

    int getSubtitleColor();

    String getTitle();

    v getTitleBytes();

    int getTitleColor();

    boolean hasImage();

    boolean hasImageType();

    boolean hasSubTitle();

    boolean hasSubtitleColor();
}
