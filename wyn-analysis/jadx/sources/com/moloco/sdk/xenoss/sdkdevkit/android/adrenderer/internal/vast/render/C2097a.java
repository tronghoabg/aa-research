package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2097a {

    /* renamed from: a, reason: collision with root package name */
    public final i f31597a;

    /* renamed from: b, reason: collision with root package name */
    public final C2102b f31598b;

    /* renamed from: c, reason: collision with root package name */
    public final List f31599c;

    /* renamed from: d, reason: collision with root package name */
    public final List f31600d;

    /* renamed from: e, reason: collision with root package name */
    public final z0 f31601e;

    public C2097a(i iVar, C2102b c2102b, List list, List errorTracking, z0 z0Var) {
        AbstractC3340k.e(errorTracking, "errorTracking");
        this.f31597a = iVar;
        this.f31598b = c2102b;
        this.f31599c = list;
        this.f31600d = errorTracking;
        this.f31601e = z0Var;
    }

    public static C2097a a(C2097a c2097a, z0 z0Var) {
        i iVar = c2097a.f31597a;
        C2102b c2102b = c2097a.f31598b;
        List list = c2097a.f31599c;
        List errorTracking = c2097a.f31600d;
        c2097a.getClass();
        AbstractC3340k.e(errorTracking, "errorTracking");
        return new C2097a(iVar, c2102b, list, errorTracking, z0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2097a)) {
            return false;
        }
        C2097a c2097a = (C2097a) obj;
        return AbstractC3340k.a(this.f31597a, c2097a.f31597a) && AbstractC3340k.a(this.f31598b, c2097a.f31598b) && AbstractC3340k.a(this.f31599c, c2097a.f31599c) && AbstractC3340k.a(this.f31600d, c2097a.f31600d) && AbstractC3340k.a(this.f31601e, c2097a.f31601e);
    }

    public final int hashCode() {
        int iHashCode = this.f31597a.hashCode() * 31;
        C2102b c2102b = this.f31598b;
        int iHashCode2 = (this.f31600d.hashCode() + ((this.f31599c.hashCode() + ((iHashCode + (c2102b == null ? 0 : c2102b.hashCode())) * 31)) * 31)) * 31;
        z0 z0Var = this.f31601e;
        return iHashCode2 + (z0Var != null ? z0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Ad(linear=" + this.f31597a + ", companion=" + this.f31598b + ", impressionTracking=" + this.f31599c + ", errorTracking=" + this.f31600d + ", dec=" + this.f31601e + ')';
    }
}
