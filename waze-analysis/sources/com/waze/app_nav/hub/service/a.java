package com.waze.app_nav.hub.service;

import android.os.Bundle;
import androidx.autofill.HintConstants;
import com.waze.app_nav.hub.ag;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f15371a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f15372b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f15373c;

    /* renamed from: d, reason: collision with root package name */
    private final ag f15374d;

    public a(String str, String str2, Object obj, Class cls) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(str2, "description");
        x.f(cls, "clazz");
        this.f15371a = str;
        this.f15372b = obj;
        this.f15373c = cls;
        int i2 = ag.f15247a;
        this.f15374d = com.waze.c.c.e.j();
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        long jA = this.f15374d.a();
        x.f(bundle, "<this>");
        bundle.putLong("ARG_SERVICE_ID", jA);
        return bundle;
    }

    public final ag b() {
        return this.f15374d;
    }

    public final Class c() {
        return this.f15373c;
    }

    public final Object d() {
        return this.f15372b;
    }

    public final String e() {
        return this.f15371a;
    }

    public final boolean equals(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        return x.n(aVar != null ? aVar.f15374d : null, this.f15374d);
    }

    public final int hashCode() {
        return this.f15374d.hashCode();
    }

    public final String toString() {
        return "WazeServiceEntry(" + this.f15371a + ")";
    }
}
