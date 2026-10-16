package com.vungle.ads.internal.model;

import Wf.C1244d0;
import Wf.J;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* renamed from: a, reason: collision with root package name */
    public final String f33269a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33270b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f33271c;

    public /* synthetic */ o(int i5, String str, String str2, Integer num) {
        if ((i5 & 1) == 0) {
            this.f33269a = null;
        } else {
            this.f33269a = str;
        }
        if ((i5 & 2) == 0) {
            this.f33270b = null;
        } else {
            this.f33270b = str2;
        }
        if ((i5 & 4) == 0) {
            this.f33271c = null;
        } else {
            this.f33271c = num;
        }
    }

    public static final void a(o self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33269a != null) {
            output.i(serialDesc, 0, Wf.q0.f15625a, self.f33269a);
        }
        if (output.A(serialDesc, 1) || self.f33270b != null) {
            output.i(serialDesc, 1, Wf.q0.f15625a, self.f33270b);
        }
        if (!output.A(serialDesc, 2) && self.f33271c == null) {
            return;
        }
        output.i(serialDesc, 2, J.f15549a, self.f33271c);
    }

    public final String b() {
        return this.f33270b;
    }

    public final String c() {
        return this.f33269a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return AbstractC3340k.a(this.f33269a, oVar.f33269a) && AbstractC3340k.a(this.f33270b, oVar.f33270b) && AbstractC3340k.a(this.f33271c, oVar.f33271c);
    }

    public final int hashCode() {
        String str = this.f33269a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f33270b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f33271c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("CacheableReplacement(url=");
        sbA.append(this.f33269a);
        sbA.append(", extension=");
        sbA.append(this.f33270b);
        sbA.append(", downloadPercent=");
        sbA.append(this.f33271c);
        sbA.append(')');
        return sbA.toString();
    }

    public final Integer a() {
        return this.f33271c;
    }
}
