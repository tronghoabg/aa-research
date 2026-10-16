package com.waze.jni.protos.settings;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.settings.VoiceData;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface VoiceDataOrBuilder extends fj {
    String getDescription();

    v getDescriptionBytes();

    String getId();

    v getIdBytes();

    boolean getIsCurrentVoice();

    String getLang();

    v getLangBytes();

    String getName();

    v getNameBytes();

    String getShortName();

    v getShortNameBytes();

    VoiceData.Type getType();

    int getTypeValue();
}
