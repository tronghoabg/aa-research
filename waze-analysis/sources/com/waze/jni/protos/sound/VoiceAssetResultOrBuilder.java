package com.waze.jni.protos.sound;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.sound.VoiceAssetResult;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface VoiceAssetResultOrBuilder extends fj {
    VoiceAssetResult.Failure getFailure();

    String getRequestId();

    v getRequestIdBytes();

    VoiceAssetResult.ResultCase getResultCase();

    VoiceAssetResult.Success getSuccess();

    boolean hasFailure();

    boolean hasSuccess();
}
