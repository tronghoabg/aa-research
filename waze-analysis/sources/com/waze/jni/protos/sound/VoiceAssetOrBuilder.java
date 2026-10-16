package com.waze.jni.protos.sound;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.sound.VoiceAsset;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface VoiceAssetOrBuilder extends fj {
    String getId();

    v getIdBytes();

    String getLanguage();

    v getLanguageBytes();

    String getLocale();

    v getLocaleBytes();

    VoiceAsset.Type getType();

    int getTypeValue();

    int getVersion();
}
