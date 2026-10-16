package com.waze.network;

import com.waze.NativeManager;
import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class j {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void OnGrpcCallResponse$default(j jVar, byte[] bArr, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: OnGrpcCallResponse");
        }
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        jVar.OnGrpcCallResponse(bArr, i2, lVar);
    }

    static final h.ab OnGrpcCallResponse$lambda$0(j jVar, byte[] bArr, int i2) {
        h.g.b.x.d(jVar, "null cannot be cast to non-null type com.waze.network.GrpcCallerNativeManager");
        ((GrpcCallerNativeManager) jVar).OnGrpcCallResponseNTV(bArr, i2);
        return null;
    }

    protected final void DoGRPCCallJNI(String str, String str2, String str3, byte[] bArr, int i2) {
        h.g.b.x.f(str, "packageName");
        h.g.b.x.f(str2, "serviceName");
        h.g.b.x.f(str3, "methodName");
        h.g.b.x.f(bArr, "requestBytes");
        ((GrpcCallerNativeManager) this).DoGRPCCall$third_party_waze_client_android_project_waze_src_main_waze(str, str2, str3, bArr, i2);
    }

    public void OnGrpcCallResponse(final byte[] bArr, final int i2, final h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.network.h
            @Override // com.waze.hw
            public final Object a() {
                j.OnGrpcCallResponse$lambda$0(this.f32384a, bArr, i2);
                return null;
            }
        }, lVar != null ? new com.waze.jni.a() { // from class: com.waze.network.i
            @Override // com.waze.jni.a
            public final void a(Object obj) {
                lVar.invoke((h.ab) obj);
            }
        } : null);
    }

    public void initNativeLayer() {
        ((GrpcCallerNativeManager) this).initNativeLayerNTV();
    }

    public final void OnGrpcCallResponse(byte[] bArr, int i2) {
        OnGrpcCallResponse$default(this, bArr, i2, null, 4, null);
    }
}
