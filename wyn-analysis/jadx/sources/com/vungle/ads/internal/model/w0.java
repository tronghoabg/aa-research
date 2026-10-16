package com.vungle.ads.internal.model;

import A7.AbstractC0279p0;
import Wf.AbstractC1240b0;
import Wf.C1244d0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class w0 {

    @NotNull
    public static final v0 Companion = new v0();

    /* renamed from: a, reason: collision with root package name */
    public final String f33353a;

    public /* synthetic */ w0(int i5, String str) {
        if (1 == (i5 & 1)) {
            this.f33353a = str;
        } else {
            AbstractC1240b0.k(i5, 1, u0.f33325a.getDescriptor());
            throw null;
        }
    }

    public static final void a(w0 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        output.y(serialDesc, 0, self.f33353a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && AbstractC3340k.a(this.f33353a, ((w0) obj).f33353a);
    }

    public final int hashCode() {
        return this.f33353a.hashCode();
    }

    public final String toString() {
        return AbstractC0279p0.n(com.iab.omid.library.vungle.internal.l.a("CCPA(status="), this.f33353a, ')');
    }

    public w0(String status) {
        AbstractC3340k.e(status, "status");
        this.f33353a = status;
    }
}
