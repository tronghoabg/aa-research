package com.vungle.ads.internal.model;

import A7.AbstractC0279p0;
import Wf.AbstractC1240b0;
import Wf.C1244d0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class j1 {

    @NotNull
    public static final i1 Companion = new i1();

    /* renamed from: a, reason: collision with root package name */
    public final String f33234a;

    public /* synthetic */ j1(int i5, String str) {
        if (1 == (i5 & 1)) {
            this.f33234a = str;
        } else {
            AbstractC1240b0.k(i5, 1, h1.f33187a.getDescriptor());
            throw null;
        }
    }

    public static final void a(j1 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        output.y(serialDesc, 0, self.f33234a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && AbstractC3340k.a(this.f33234a, ((j1) obj).f33234a);
    }

    public final int hashCode() {
        return this.f33234a.hashCode();
    }

    public final String toString() {
        return AbstractC0279p0.n(com.iab.omid.library.vungle.internal.l.a("IAB(tcf="), this.f33234a, ')');
    }

    public j1(String tcf) {
        AbstractC3340k.e(tcf, "tcf");
        this.f33234a = tcf;
    }
}
