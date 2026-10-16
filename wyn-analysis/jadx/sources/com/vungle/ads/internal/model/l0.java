package com.vungle.ads.internal.model;

import A7.AbstractC0279p0;
import Wf.AbstractC1240b0;
import Wf.C1244d0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class l0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* renamed from: a, reason: collision with root package name */
    public final String f33248a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33249b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33250c;

    public /* synthetic */ l0(int i5, String str, String str2, String str3) {
        if (7 != (i5 & 7)) {
            AbstractC1240b0.k(i5, 7, j0.f33232a.getDescriptor());
            throw null;
        }
        this.f33248a = str;
        this.f33249b = str2;
        this.f33250c = str3;
    }

    public static final void a(l0 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        output.y(serialDesc, 0, self.f33248a);
        output.y(serialDesc, 1, self.f33249b);
        output.y(serialDesc, 2, self.f33250c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return AbstractC3340k.a(this.f33248a, l0Var.f33248a) && AbstractC3340k.a(this.f33249b, l0Var.f33249b) && AbstractC3340k.a(this.f33250c, l0Var.f33250c);
    }

    public final int hashCode() {
        return this.f33250c.hashCode() + N0.a.c(this.f33248a.hashCode() * 31, 31, this.f33249b);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("AppNode(bundle=");
        sbA.append(this.f33248a);
        sbA.append(", ver=");
        sbA.append(this.f33249b);
        sbA.append(", appId=");
        return AbstractC0279p0.n(sbA, this.f33250c, ')');
    }

    public l0(String bundle, String ver, String appId) {
        AbstractC3340k.e(bundle, "bundle");
        AbstractC3340k.e(ver, "ver");
        AbstractC3340k.e(appId, "appId");
        this.f33248a = bundle;
        this.f33249b = ver;
        this.f33250c = appId;
    }
}
