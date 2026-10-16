package com.google.e.a.e;

import com.google.e.a.h.bi;
import com.google.e.a.h.ci;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    final String f8440a;

    /* renamed from: b, reason: collision with root package name */
    final Class f8441b;

    /* renamed from: c, reason: collision with root package name */
    final bi f8442c;

    g(String str, Class cls, bi biVar) {
        this.f8440a = str;
        this.f8441b = cls;
        this.f8442c = biVar;
    }

    public static g b(String str, Class cls, bi biVar) {
        return new g(str, cls, biVar);
    }

    public final Object a(com.google.v.v vVar) throws GeneralSecurityException {
        return t.a().e(v.a().d(com.waze.car_lib.r.ai.i(this.f8440a, vVar, com.google.e.a.b.a.a.b(this.f8442c), com.google.e.a.b.a.a.c(ci.RAW), null), com.google.e.a.e.a()), this.f8441b);
    }
}
