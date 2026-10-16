package com.waze.ab.a;

import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ai implements ae {

    /* renamed from: a, reason: collision with root package name */
    private final f f13702a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.af f13703b;

    /* renamed from: c, reason: collision with root package name */
    private final bn f13704c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f13705d;

    /* renamed from: e, reason: collision with root package name */
    private final ch f13706e;

    public ai(com.waze.sharedui.profile.b bVar, f fVar, h.c.j jVar) {
        h.g.b.x.f(bVar, "myProfileManager");
        h.g.b.x.f(fVar, "profileImageUploader");
        h.g.b.x.f(jVar, "coroutineContext");
        this.f13702a = fVar;
        kotlinx.coroutines.af afVarE = aj.e(jVar.plus(aj.Q()));
        this.f13703b = afVarE;
        bn bnVarB = ck.b(null);
        this.f13704c = bnVarB;
        ch chVarF = bVar.f();
        h.g.b.x.e(chVarF, "getProfileStateFlow(...)");
        kotlinx.coroutines.b.k kVarY = kotlinx.coroutines.b.ai.y(new ah(chVarF));
        this.f13705d = kVarY;
        kotlinx.coroutines.b.k kVarI = kotlinx.coroutines.b.ai.I(kotlinx.coroutines.b.ai.D(bnVarB), kVarY);
        int i2 = bz.f51630a;
        this.f13706e = kotlinx.coroutines.b.ai.V(kVarI, afVarE, by.b(), new com.waze.ui.ac.g(""));
    }

    @Override // com.waze.ab.a.ae
    public final ch a() {
        return this.f13706e;
    }

    @Override // com.waze.ab.a.ae
    public final void b(String str) {
        h.g.b.x.f(str, "imagePath");
        this.f13704c.e(new com.waze.ui.ac.a(str));
        this.f13702a.a(str);
    }
}
