package ga;

import Ef.H;
import a.AbstractC1304a;
import jf.C3109i;
import kotlin.jvm.internal.AbstractC3340k;
import u1.InterfaceC4220i;
import x1.C4449b;
import x1.C4452e;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final C4452e f35822c = AbstractC1304a.k("firebase_sessions_enabled");

    /* renamed from: d, reason: collision with root package name */
    public static final C4452e f35823d = new C4452e("firebase_sessions_sampling_rate");

    /* renamed from: e, reason: collision with root package name */
    public static final C4452e f35824e = new C4452e("firebase_sessions_restart_timeout");

    /* renamed from: f, reason: collision with root package name */
    public static final C4452e f35825f = new C4452e("firebase_sessions_cache_duration");

    /* renamed from: g, reason: collision with root package name */
    public static final C4452e f35826g = new C4452e("firebase_sessions_cache_updated_time");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4220i f35827a;

    /* renamed from: b, reason: collision with root package name */
    public f f35828b;

    public n(InterfaceC4220i interfaceC4220i) throws Throwable {
        this.f35827a = interfaceC4220i;
        H.I(C3109i.f38759a, new k(this, null));
    }

    public static final void a(n nVar, C4449b c4449b) {
        nVar.getClass();
        nVar.f35828b = new f((Boolean) c4449b.b(f35822c), (Double) c4449b.b(f35823d), (Integer) c4449b.b(f35824e), (Integer) c4449b.b(f35825f), (Long) c4449b.b(f35826g));
    }

    public final boolean b() {
        Integer num;
        f fVar = this.f35828b;
        if (fVar == null) {
            AbstractC3340k.m("sessionConfigs");
            throw null;
        }
        if (fVar != null) {
            Long l10 = fVar.f35801e;
            return l10 == null || (num = fVar.f35800d) == null || (System.currentTimeMillis() - l10.longValue()) / ((long) 1000) >= ((long) num.intValue());
        }
        AbstractC3340k.m("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(x1.C4452e r6, java.lang.Object r7, lf.AbstractC3464c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ga.l
            if (r0 == 0) goto L13
            r0 = r8
            ga.l r0 = (ga.l) r0
            int r1 = r0.f35817c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35817c = r1
            goto L18
        L13:
            ga.l r0 = new ga.l
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f35815a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f35817c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Fe.e.U(r8)     // Catch: java.io.IOException -> L27
            goto L58
        L27:
            r6 = move-exception
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            Fe.e.U(r8)
            u1.i r8 = r5.f35827a     // Catch: java.io.IOException -> L27
            ga.m r2 = new ga.m     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L27
            r0.f35817c = r3     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = android.support.v4.media.session.b.d0(r8, r2, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L58
            return r1
        L45:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to update cache config value: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L58:
            ef.C r6 = ef.C2515C.f34653a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.n.c(x1.e, java.lang.Object, lf.c):java.lang.Object");
    }
}
