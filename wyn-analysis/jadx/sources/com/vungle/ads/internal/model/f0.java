package com.vungle.ads.internal.model;

import Wf.C1244d0;
import Wf.C1247f;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f33162a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f33163b;

    public /* synthetic */ f0(int i5, Boolean bool, Boolean bool2) {
        if ((i5 & 1) == 0) {
            this.f33162a = null;
        } else {
            this.f33162a = bool;
        }
        if ((i5 & 2) == 0) {
            this.f33163b = null;
        } else {
            this.f33163b = bool2;
        }
    }

    public static final void a(f0 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33162a != null) {
            output.i(serialDesc, 0, C1247f.f15596a, self.f33162a);
        }
        if (!output.A(serialDesc, 1) && self.f33163b == null) {
            return;
        }
        output.i(serialDesc, 1, C1247f.f15596a, self.f33163b);
    }

    public final Boolean b() {
        return this.f33163b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return AbstractC3340k.a(this.f33162a, f0Var.f33162a) && AbstractC3340k.a(this.f33163b, f0Var.f33163b);
    }

    public final int hashCode() {
        Boolean bool = this.f33162a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f33163b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("WebViewSettings(allowFileAccessFromFileUrls=");
        sbA.append(this.f33162a);
        sbA.append(", allowUniversalAccessFromFileUrls=");
        sbA.append(this.f33163b);
        sbA.append(')');
        return sbA.toString();
    }

    public final Boolean a() {
        return this.f33162a;
    }
}
