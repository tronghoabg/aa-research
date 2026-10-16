package com.waze.authentication;

import android.content.SharedPreferences;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ap implements aj {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f15734a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.beacons.g f15735b;

    public ap(SharedPreferences sharedPreferences, com.waze.beacons.g gVar) {
        h.g.b.x.f(sharedPreferences, "sharedPreferences");
        h.g.b.x.f(gVar, "passwordStore");
        this.f15734a = sharedPreferences;
        this.f15735b = gVar;
    }

    @Override // com.waze.authentication.aj
    public final List a() {
        SharedPreferences sharedPreferences = this.f15734a;
        k kVarE = this.f15735b.e();
        h.g.b.x.f(sharedPreferences, "<this>");
        h.g.b.x.f("LoginToken", "key");
        String string = sharedPreferences.getString("LoginToken", null);
        if (string == null || string.length() <= 0) {
            string = null;
        }
        return h.a.i.k(kVarE, string != null ? new j(string) : null);
    }

    @Override // com.waze.authentication.aj
    public final void b() {
        this.f15735b.f(new k("", ""));
        this.f15734a.edit().remove("LoginToken").apply();
    }

    @Override // com.waze.authentication.aj
    public final void c(ax axVar) {
        h.g.b.x.f(axVar, "credential");
        if (axVar instanceof j) {
            this.f15734a.edit().putString("LoginToken", ((j) axVar).a()).apply();
        } else {
            if (!(axVar instanceof k)) {
                throw new h.i();
            }
            this.f15735b.f((k) axVar);
        }
    }
}
