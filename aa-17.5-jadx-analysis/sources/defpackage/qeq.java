package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final /* synthetic */ class qeq implements xyc {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ qeq(Context context, Object obj, Object obj2, int i) {
        this.d = i;
        this.a = context;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Type inference failed for: r0v11, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, sid] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r4v9, types: [ackk, java.lang.Object] */
    @Override // defpackage.xyc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gu() {
        /*
            r4 = this;
            int r0 = r4.d
            if (r0 == 0) goto L91
            r1 = 1
            if (r0 == r1) goto L73
            r2 = 2
            if (r0 == r2) goto L63
            java.lang.Object r2 = r4.a
            r3 = 3
            if (r0 == r3) goto L34
            android.content.Context r2 = (android.content.Context) r2
            defpackage.zys.e(r2)
            java.lang.String r0 = "GMM_REALTIME_COUNTERS"
            shv r0 = defpackage.zvy.a(r2, r0)
            if (r0 != 0) goto L1e
            r4 = 0
            return r4
        L1e:
            java.lang.Object r1 = r4.b
            java.lang.Object r4 = r4.c
            zvx r3 = new zvx
            zyb r4 = (defpackage.zyb) r4
            r3.<init>()
            r0.e(r3)
            zyu r4 = new zyu
            tmb r3 = defpackage.zvy.a
            r4.<init>(r2, r3, r1, r0)
            return r4
        L34:
            android.content.Context r2 = (android.content.Context) r2
            boolean r0 = defpackage.lvl.ak(r2)
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r4.c
            java.lang.Object r0 = r0.a()
            achj r0 = (defpackage.achj) r0
            achh r0 = r0.g
            if (r0 != 0) goto L4a
            achh r0 = defpackage.achh.a
        L4a:
            boolean r0 = r0.b
            if (r0 != 0) goto L5e
        L4e:
            java.lang.Object r4 = r4.b
            java.lang.Object r4 = r4.a()
            pnh r4 = (defpackage.pnh) r4
            acdv r4 = r4.a
            boolean r4 = r4.M
            if (r4 == 0) goto L5d
            goto L5e
        L5d:
            r1 = 0
        L5e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            return r4
        L63:
            java.lang.Object r0 = r4.a
            java.lang.Object r1 = r4.b
            java.lang.Object r4 = r4.c
            sin r2 = new sin
            sio r4 = (defpackage.sio) r4
            java.lang.String r1 = (java.lang.String) r1
            r2.<init>(r4, r1, r0)
            return r2
        L73:
            java.lang.Object r0 = r4.a
            pyi r0 = (defpackage.pyi) r0
            android.content.SharedPreferences r0 = r0.b
            java.lang.Object r1 = r4.b
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L8e
            java.lang.Object r4 = r4.c
            java.lang.Object r4 = r4.gu()
            xxh r4 = defpackage.xxh.g(r4)
            return r4
        L8e:
            xvy r4 = defpackage.xvy.a
            return r4
        L91:
            int r0 = defpackage.qer.g
            java.lang.Object r0 = r4.c
            lwm r1 = new lwm
            java.lang.Object r0 = r0.gu()
            ltw r0 = (defpackage.ltw) r0
            java.lang.Object r2 = r4.b
            java.lang.Object r4 = r4.a
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Class r2 = (java.lang.Class) r2
            r1.<init>(r4, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qeq.gu():java.lang.Object");
    }

    public /* synthetic */ qeq(Object obj, Object obj2, xyc xycVar, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = xycVar;
    }

    public /* synthetic */ qeq(sio sioVar, String str, sid sidVar, int i) {
        this.d = i;
        this.c = sioVar;
        this.b = str;
        this.a = sidVar;
    }
}
