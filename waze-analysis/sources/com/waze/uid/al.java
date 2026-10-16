package com.waze.uid;

import com.waze.ix;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class al implements com.waze.shared_infra.a.c {

    /* renamed from: a, reason: collision with root package name */
    private static final long f44129a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.profile.b f44130b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.b.u f44131c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f44132d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f44133e;

    static {
        h.o.c cVar = h.o.a.f48264a;
        f44129a = h.o.c.j(100L, h.o.d.f48272c);
    }

    public al(com.waze.uid.b.z zVar, com.waze.sharedui.profile.b bVar, com.waze.b.u uVar, com.waze.shared_infra.i.e eVar, ix ixVar) {
        h.g.b.x.f(zVar, "uidController");
        h.g.b.x.f(bVar, "profileManager");
        h.g.b.x.f(uVar, "ageRestrictionRepository");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(ixVar, "uidLauncher");
        this.f44130b = bVar;
        this.f44131c = uVar;
        this.f44132d = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object d(com.waze.uid.al r9, com.waze.uid.ac r10, h.c.e r11) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.uid.al.d(com.waze.uid.al, com.waze.uid.ac, h.c.e):java.lang.Object");
    }

    @Override // com.waze.shared_infra.a.c
    public final Object b(h.c.e eVar) {
        kotlinx.coroutines.b.k kVarY = kotlinx.coroutines.b.ai.y(new af(com.waze.uid.b.ab.f44137b));
        ch chVarF = this.f44130b.f();
        h.g.b.x.e(chVarF, "getProfileStateFlow(...)");
        Object objD = kotlinx.coroutines.b.ai.d(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.F(chVarF, kVarY, new ag(null)), new ah(this, (h.c.e) null, 0)), eVar);
        return objD == h.c.a.a.f48038a ? objD : h.ab.f48028a;
    }

    @Override // com.waze.shared_infra.a.c
    public final String c() {
        String canonicalName = al.class.getCanonicalName();
        return canonicalName == null ? "" : canonicalName;
    }
}
