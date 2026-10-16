package com.waze.sound;

import com.waze.jni.protos.sound.VoiceAssetRequest;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ia implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f40215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40216b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f40217c;

    public /* synthetic */ ia(ib ibVar, VoiceAssetRequest voiceAssetRequest, int i2) {
        this.f40217c = i2;
        this.f40216b = ibVar;
        this.f40215a = voiceAssetRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f40217c != 0) {
            ib.requestVoiceAssetJNI$lambda$0((ib) this.f40216b, (VoiceAssetRequest) this.f40215a);
        } else {
            ib.playUrlJNI$lambda$0((ib) this.f40215a, (String) this.f40216b);
        }
    }

    public /* synthetic */ ia(ib ibVar, String str, int i2) {
        this.f40217c = i2;
        this.f40215a = ibVar;
        this.f40216b = str;
    }
}
