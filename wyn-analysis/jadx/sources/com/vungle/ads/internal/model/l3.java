package com.vungle.ads.internal.model;

import A7.AbstractC0279p0;
import Wf.C1244d0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class l3 {

    @NotNull
    public static final k3 Companion = new k3();

    /* renamed from: a, reason: collision with root package name */
    public final String f33253a;

    public /* synthetic */ l3(int i5, String str) {
        if ((i5 & 1) == 0) {
            this.f33253a = null;
        } else {
            this.f33253a = str;
        }
    }

    public static final void a(l3 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (!output.A(serialDesc, 0) && self.f33253a == null) {
            return;
        }
        output.i(serialDesc, 0, Wf.q0.f15625a, self.f33253a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3) && AbstractC3340k.a(this.f33253a, ((l3) obj).f33253a);
    }

    public final int hashCode() {
        String str = this.f33253a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC0279p0.n(com.iab.omid.library.vungle.internal.l.a("RtbRequest(sdkUserAgent="), this.f33253a, ')');
    }

    public l3(String str) {
        this.f33253a = str;
    }
}
