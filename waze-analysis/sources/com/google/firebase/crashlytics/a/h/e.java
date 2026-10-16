package com.google.firebase.crashlytics.a.h;

import com.google.android.gms.o.ag;
import com.google.android.gms.o.s;
import com.google.android.gms.o.t;
import com.google.android.gms.o.w;
import j$.util.Objects;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e implements s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f9746a;

    e(f fVar) {
        Objects.requireNonNull(fVar);
        this.f9746a = fVar;
    }

    @Override // com.google.android.gms.o.s
    public final /* bridge */ /* synthetic */ t a(Object obj) throws Throwable {
        f fVar = this.f9746a;
        JSONObject jSONObjectA = fVar.f9753g.a(fVar.f9748b);
        if (jSONObjectA != null) {
            d dVarA = g.a(jSONObjectA);
            fVar.f9754h.c(dVarA.f9742c, jSONObjectA);
            f.m(jSONObjectA, "Loaded settings: ");
            f.h(fVar, fVar.f9748b.f9760f);
            fVar.f9751e.set(dVarA);
            ((w) fVar.f9752f.get()).e(dVarA);
        }
        return ag.c(null);
    }
}
