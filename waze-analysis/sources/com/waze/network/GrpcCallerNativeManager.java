package com.waze.network;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import e.a.cn;
import e.a.cp;
import e.a.cq;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GrpcCallerNativeManager extends j {
    public static final int $stable = 8;
    private final m grpcStub;

    public GrpcCallerNativeManager(m mVar) {
        h.g.b.x.f(mVar, "grpcStub");
        this.grpcStub = mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h.ab DoGRPCCall$lambda$0$0(String str, String str2, String str3, GrpcCallerNativeManager grpcCallerNativeManager, byte[] bArr, e.a.h.ae aeVar) {
        h.g.b.x.f(bArr, "request");
        h.g.b.x.f(aeVar, "observer");
        cn cnVarA = cq.a();
        cnVarA.f(cp.f46544a);
        cnVarA.b(str + "." + str2 + DomExceptionUtils.SEPARATOR + str3);
        cnVarA.e();
        cnVarA.c(new f());
        cnVarA.d(new f());
        e.a.h.s.e(grpcCallerNativeManager.grpcStub.getChannel().a(cnVarA.a(), grpcCallerNativeManager.grpcStub.getCallOptions()), bArr, aeVar);
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h.ab DoGRPCCall$lambda$0$1(GrpcCallerNativeManager grpcCallerNativeManager, int i2, byte[] bArr) {
        j.OnGrpcCallResponse$default(grpcCallerNativeManager, bArr, i2, null, 4, null);
        return h.ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void send(h.g.a.p<? super byte[], ? super e.a.h.ae<byte[]>, h.ab> pVar, byte[] bArr, h.g.a.l<? super byte[], h.ab> lVar) {
        pVar.invoke(bArr, new g(lVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DoGRPCCall$third_party_waze_client_android_project_waze_src_main_waze(java.lang.String r8, java.lang.String r9, java.lang.String r10, byte[] r11, int r12) {
        /*
            r7 = this;
            java.lang.String r0 = "packageName"
            h.g.b.x.f(r8, r0)
            java.lang.String r0 = "serviceName"
            h.g.b.x.f(r9, r0)
            java.lang.String r0 = "methodName"
            h.g.b.x.f(r10, r0)
            java.lang.String r0 = "requestBytes"
            h.g.b.x.f(r11, r0)
            r0 = r7
            com.waze.network.GrpcCallerNativeManager r0 = (com.waze.network.GrpcCallerNativeManager) r0     // Catch: java.lang.Throwable -> L2f
            com.waze.ab.c r1 = new com.waze.ab.c     // Catch: java.lang.Throwable -> L2f
            r6 = 6
            r5 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2d
            com.waze.main_screen.p.m r7 = new com.waze.main_screen.p.m     // Catch: java.lang.Throwable -> L2d
            r8 = 3
            r7.<init>(r5, r12, r8)     // Catch: java.lang.Throwable -> L2d
            r5.send(r1, r11, r7)     // Catch: java.lang.Throwable -> L2d
            h.ab r7 = h.ab.f48028a     // Catch: java.lang.Throwable -> L2d
            goto L36
        L2d:
            r0 = move-exception
            goto L31
        L2f:
            r0 = move-exception
            r5 = r7
        L31:
            r7 = r0
            java.lang.Object r7 = e.b.c.a(r7)
        L36:
            java.lang.Throwable r7 = h.m.c(r7)
            if (r7 == 0) goto L47
            r0 = r5
            com.waze.network.j r0 = (com.waze.network.j) r0
            r4 = 4
            r5 = 0
            r1 = 0
            r3 = 0
            r2 = r12
            com.waze.network.j.OnGrpcCallResponse$default(r0, r1, r2, r3, r4, r5)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.network.GrpcCallerNativeManager.DoGRPCCall$third_party_waze_client_android_project_waze_src_main_waze(java.lang.String, java.lang.String, java.lang.String, byte[], int):void");
    }

    public final native void OnGrpcCallResponseNTV(byte[] bArr, int i2);

    public final native void initNativeLayerNTV();
}
