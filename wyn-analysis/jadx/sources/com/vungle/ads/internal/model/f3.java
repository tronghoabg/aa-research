package com.vungle.ads.internal.model;

import A7.AbstractC0279p0;
import Wf.C1244d0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class f3 {

    @NotNull
    public static final e3 Companion = new e3();

    /* renamed from: a, reason: collision with root package name */
    public final String f33166a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33167b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33168c;

    public /* synthetic */ f3(int i5, String str, String str2, String str3) {
        if ((i5 & 1) == 0) {
            this.f33166a = null;
        } else {
            this.f33166a = str;
        }
        if ((i5 & 2) == 0) {
            this.f33167b = null;
        } else {
            this.f33167b = str2;
        }
        if ((i5 & 4) == 0) {
            this.f33168c = null;
        } else {
            this.f33168c = str3;
        }
    }

    public static final void a(f3 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33166a != null) {
            output.i(serialDesc, 0, Wf.q0.f15625a, self.f33166a);
        }
        if (output.A(serialDesc, 1) || self.f33167b != null) {
            output.i(serialDesc, 1, Wf.q0.f15625a, self.f33167b);
        }
        if (!output.A(serialDesc, 2) && self.f33168c == null) {
            return;
        }
        output.i(serialDesc, 2, Wf.q0.f15625a, self.f33168c);
    }

    public final String b() {
        return this.f33167b;
    }

    public final String c() {
        return this.f33168c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        return AbstractC3340k.a(this.f33166a, f3Var.f33166a) && AbstractC3340k.a(this.f33167b, f3Var.f33167b) && AbstractC3340k.a(this.f33168c, f3Var.f33168c);
    }

    public final int hashCode() {
        String str = this.f33166a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f33167b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f33168c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("OmSdkData(params=");
        sbA.append(this.f33166a);
        sbA.append(", vendorKey=");
        sbA.append(this.f33167b);
        sbA.append(", vendorURL=");
        return AbstractC0279p0.n(sbA, this.f33168c, ')');
    }

    public final String a() {
        return this.f33166a;
    }
}
