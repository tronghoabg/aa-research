package com.waze.car_lib.r;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.waze.R;
import com.waze.lc;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    private final Object f20942a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f20943b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f20944c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f20945d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f20946e;

    public ai(com.waze.shared_infra.o.a aVar, com.waze.n.ac acVar, lc lcVar, com.waze.navigate.b.g gVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(acVar, "state");
        h.g.b.x.f(lcVar, "shutdownController");
        h.g.b.x.f(gVar, "statsSender");
        this.f20942a = aVar;
        this.f20943b = acVar;
        this.f20944c = lcVar;
        this.f20945d = gVar;
        String strK = k();
        String strJ = j();
        boolean zN = h.g.b.x.n(acVar, af.f20939a);
        int i2 = R.drawable.t3_critical_alert_64px;
        if (!zN && !h.g.b.x.n(acVar, ag.f20940a)) {
            if (!h.g.b.x.n(acVar, ah.f20941a)) {
                throw new h.i();
            }
            i2 = R.drawable.launch_icon_64px;
        }
        this.f20946e = new MutableLiveData(new com.waze.car_lib.p.dg(strK, strJ, Integer.valueOf(i2), false, new com.waze.car_lib.p.dc(aVar.c(R.string.AAOS_KILL_SWITCH_SCREEN_EXIT_BUTTON, new Object[0]), false), null, 32));
    }

    public static ai i(String str, com.google.v.v vVar, com.google.e.a.r rVar, com.google.e.a.s sVar, Integer num) throws GeneralSecurityException {
        if (num != null && sVar.equals(com.google.e.a.s.f8785d)) {
            throw new GeneralSecurityException("Cannot set idRequirement for OutputPrefixType RAW");
        }
        if (num == null && !sVar.equals(com.google.e.a.s.f8785d)) {
            throw new GeneralSecurityException("Cannot have null idRequirement unless OutputPrefixType is RAW");
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("typeURL " + str + " contains non-ascii character at position " + i2);
            }
        }
        return new ai(str, vVar, rVar, sVar, num);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    private final String j() {
        Object obj = this.f20943b;
        if (h.g.b.x.n(obj, af.f20939a)) {
            return this.f20942a.c(R.string.AAOS_KILL_SWITCH_SCREEN_COMMERCIAL_VEHICLE_MESSAGE, new Object[0]);
        }
        if (h.g.b.x.n(obj, ag.f20940a)) {
            return this.f20942a.c(R.string.AAOS_KILL_SWITCH_SCREEN_OVERSIZED_VEHICLE_MESSAGE, new Object[0]);
        }
        if (h.g.b.x.n(obj, ah.f20941a)) {
            return this.f20942a.c(R.string.AAOS_KILL_SWITCH_SCREEN_MESSAGE, new Object[0]);
        }
        throw new h.i();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    private final String k() {
        return this.f20942a.c(R.string.AAOS_KILL_SWITCH_SCREEN_TITLE, new Object[0]);
    }

    public final LiveData a() {
        return (LiveData) this.f20946e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.waze.navigate.b.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.waze.lc, java.lang.Object] */
    public final void b() {
        this.f20945d.b(com.waze.navigate.b.c.f31040a, k(), j());
        this.f20944c.shutDown();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.waze.navigate.b.g, java.lang.Object] */
    public final void c() {
        this.f20945d.c(k(), j());
    }

    public final com.google.e.a.r d() {
        return (com.google.e.a.r) this.f20946e;
    }

    public final com.google.e.a.s e() {
        return (com.google.e.a.s) this.f20944c;
    }

    public final com.google.v.v f() {
        return (com.google.v.v) this.f20943b;
    }

    public final Integer g() {
        return (Integer) this.f20945d;
    }

    public final String h() {
        return (String) this.f20942a;
    }

    private ai(String str, com.google.v.v vVar, com.google.e.a.r rVar, com.google.e.a.s sVar, Integer num) {
        this.f20942a = str;
        this.f20943b = vVar;
        this.f20946e = rVar;
        this.f20944c = sVar;
        this.f20945d = num;
    }
}
