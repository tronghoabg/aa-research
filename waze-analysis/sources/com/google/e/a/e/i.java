package com.google.e.a.e;

import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.r.ai f8445a;

    public i(com.waze.car_lib.r.ai aiVar) {
        h(aiVar);
        this.f8445a = aiVar;
    }

    private static void h(com.waze.car_lib.r.ai aiVar) {
        if (aiVar.d().equals(com.google.e.a.r.f8777b)) {
            return;
        }
        aiVar.d().equals(com.google.e.a.r.f8778c);
    }

    @Override // com.google.d.m.a.a.b
    public final Integer b() {
        return this.f8445a.g();
    }

    @Override // com.google.d.m.a.a.b
    public final com.google.d.m.a.a.b e() {
        com.waze.car_lib.r.ai aiVar = this.f8445a;
        return new h(aiVar.h(), aiVar.e());
    }

    public final com.google.e.a.k.a f() {
        com.waze.car_lib.r.ai aiVar = this.f8445a;
        if (aiVar.e().equals(com.google.e.a.s.f8785d)) {
            return com.google.e.a.k.a.b(new byte[0]);
        }
        if (aiVar.e().equals(com.google.e.a.s.f8783b)) {
            return w.b(aiVar.g().intValue());
        }
        if (aiVar.e().equals(com.google.e.a.s.f8784c) || aiVar.e().equals(com.google.e.a.s.f8786e)) {
            return w.a(aiVar.g().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }

    public final com.waze.car_lib.r.ai g() {
        com.waze.car_lib.r.ai aiVar = this.f8445a;
        h(aiVar);
        return aiVar;
    }
}
