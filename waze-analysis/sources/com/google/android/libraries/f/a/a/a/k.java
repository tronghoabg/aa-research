package com.google.android.libraries.f.a.a.a;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.common.internal.m;
import h.g.b.aq;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5938a;

    public k(Context context) {
        x.f(context, "applicationContext");
        this.f5938a = context;
    }

    private static final void d(aq aqVar) {
        m mVar;
        try {
            m mVar2 = (m) aqVar.f48105a;
            if ((mVar2 != null && mVar2.o()) || ((mVar = (m) aqVar.f48105a) != null && mVar.p())) {
                m mVar3 = (m) aqVar.f48105a;
                if (mVar3 != null) {
                    mVar3.N();
                }
            }
            Binder.flushPendingCommands();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.libraries.f.a.a.a.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.libraries.f.a.a.a.f
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.libraries.f.a.a.a.f r0 = (com.google.android.libraries.f.a.a.a.f) r0
            int r1 = r0.f5930c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5930c = r1
            goto L18
        L13:
            com.google.android.libraries.f.a.a.a.f r0 = new com.google.android.libraries.f.a.a.a.f
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f5928a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f5930c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            h.g.b.aq r8 = r0.f5931d
            r0 = r8
            h.g.b.aq r0 = (h.g.b.aq) r0
            e.b.c.b(r9)     // Catch: java.lang.Throwable -> L71
            goto L78
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            e.b.c.b(r9)
            kotlinx.coroutines.CompletableDeferred r9 = kotlinx.coroutines.bo.j()
            h.g.b.aq r2 = new h.g.b.aq
            r2.<init>()
            com.google.android.libraries.f.a.a.a.j r4 = new com.google.android.libraries.f.a.a.a.j
            r4.<init>(r9)
            com.google.android.libraries.f.a.a.a.h r5 = new com.google.android.libraries.f.a.a.a.h
            r5.<init>(r2, r8, r4, r9)
            com.google.android.libraries.f.a.a.a.i r4 = new com.google.android.libraries.f.a.a.a.i
            r4.<init>(r9)
            android.content.Context r8 = r8.f5938a
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            com.google.android.libraries.f.a.a.a.g r7 = new com.google.android.libraries.f.a.a.a.g
            r7.<init>(r5, r4, r8, r6)
            r2.f48105a = r7
            java.lang.Object r8 = r2.f48105a     // Catch: java.lang.Throwable -> L70
            com.google.android.libraries.f.a.a.a.g r8 = (com.google.android.libraries.f.a.a.a.g) r8     // Catch: java.lang.Throwable -> L70
            r8.M()     // Catch: java.lang.Throwable -> L70
            r0.f5931d = r2     // Catch: java.lang.Throwable -> L70
            r0.f5930c = r3     // Catch: java.lang.Throwable -> L70
            java.lang.Object r9 = r9.c(r0)     // Catch: java.lang.Throwable -> L70
            if (r9 == r1) goto L6f
            r8 = r2
            goto L78
        L6f:
            return r1
        L70:
            r8 = r2
        L71:
            com.google.android.libraries.f.a.a.a.b r9 = new com.google.android.libraries.f.a.a.a.b     // Catch: java.lang.Throwable -> L7c
            com.google.android.libraries.f.a.a.a.a r0 = com.google.android.libraries.f.a.a.a.a.f5924e     // Catch: java.lang.Throwable -> L7c
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L7c
        L78:
            d(r8)
            return r9
        L7c:
            r9 = move-exception
            d(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.f.a.a.a.k.a(h.c.e):java.lang.Object");
    }
}
