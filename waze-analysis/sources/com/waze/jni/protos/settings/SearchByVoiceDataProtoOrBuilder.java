package com.waze.jni.protos.settings;

import com.google.v.fj;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface SearchByVoiceDataProtoOrBuilder extends fj {
    boolean containsSearchVoicesByKey(String str);

    int getSearchVoicesByKeyCount();

    Map<String, String> getSearchVoicesByKeyMap();

    String getSearchVoicesByKeyOrDefault(String str, String str2);

    String getSearchVoicesByKeyOrThrow(String str);
}
