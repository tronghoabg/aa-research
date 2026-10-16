package defpackage;

import android.accounts.Account;

/* loaded from: classes2.dex */
public final class pwo {
    public long j;
    public vky k;
    public uzv a = uzv.a;
    public uzw b = uzw.a;
    public uzx c = uzx.a;
    public uzu d = uzu.a;
    public Account e = null;
    public final pxh f = pxh.a;
    public accb g = null;
    public abpc h = null;
    public pxj l = null;
    public uzt i = uzt.GMM_API;

    public pwo() {
        vky vkyVar = pwp.a;
        this.k = pwp.a;
    }

    public final void a(uzw uzwVar) {
        int i = uzwVar.c;
        woy.Q(i >= 0, "negative retryDelayMs: %s", i);
        int i2 = uzwVar.d;
        woy.Q(i2 > 0, "maxAttempts < 1: %s", i2);
        long j = uzwVar.e;
        woy.R(j >= 0, "negative singleAttemptTimeoutMs: %s", j);
        this.b = uzwVar;
    }

    public final void b(uzx uzxVar) {
        int i = uzxVar.c;
        woy.Q(i >= 0, "negative maxDelayMs: %s", i);
        this.c = uzxVar;
    }
}
