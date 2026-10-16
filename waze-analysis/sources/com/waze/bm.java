package com.waze;

import com.waze.jni.protos.DeeplinkUpdate;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class bm {
    public static final int $stable = 0;

    static final void onDeeplinkUpdateJNI$lambda$0(bm bmVar, DeeplinkUpdate deeplinkUpdate) {
        h.g.b.x.d(bmVar, "null cannot be cast to non-null type com.waze.DeeplinkUpdatesNativeManager");
        h.g.b.x.c(deeplinkUpdate);
        ((DeeplinkUpdatesNativeManager) bmVar).onDeeplinkUpdate$third_party_waze_client_android_project_waze_src_main_waze(deeplinkUpdate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void postInit$default(bm bmVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postInit");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        bmVar.postInit(lVar);
    }

    static final h.ab postInit$lambda$0(bm bmVar) {
        h.g.b.x.d(bmVar, "null cannot be cast to non-null type com.waze.DeeplinkUpdatesNativeManager");
        ((DeeplinkUpdatesNativeManager) bmVar).postInitNTV();
        return null;
    }

    protected final void onDeeplinkUpdateJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "update");
        try {
            NativeManager.runMainThreadTask(new bl(this, (DeeplinkUpdate) DeeplinkUpdate.parser().c(bArr), 0));
        } catch (com.google.v.eu unused) {
        }
    }

    public void postInit(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ba(this, 3), lVar != null ? new bb(lVar, 4) : null);
    }

    public final void postInit() {
        postInit$default(this, null, 1, null);
    }
}
