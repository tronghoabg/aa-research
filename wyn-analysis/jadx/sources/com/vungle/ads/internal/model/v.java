package com.vungle.ads.internal.model;

import Wf.C1244d0;
import Wf.E;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* renamed from: a, reason: collision with root package name */
    public final Map f33331a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f33332b;

    public /* synthetic */ v(int i5, Map map, Map map2) {
        if ((i5 & 1) == 0) {
            this.f33331a = null;
        } else {
            this.f33331a = map;
        }
        if ((i5 & 2) == 0) {
            this.f33332b = null;
        } else {
            this.f33332b = map2;
        }
    }

    public static final void a(v self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33331a != null) {
            Wf.q0 q0Var = Wf.q0.f15625a;
            output.i(serialDesc, 0, new E(q0Var, q0Var, 1), self.f33331a);
        }
        if (!output.A(serialDesc, 1) && self.f33332b == null) {
            return;
        }
        output.i(serialDesc, 1, new E(Wf.q0.f15625a, m.f33254a, 1), self.f33332b);
    }

    public final Map b() {
        return this.f33331a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return AbstractC3340k.a(this.f33331a, vVar.f33331a) && AbstractC3340k.a(this.f33332b, vVar.f33332b);
    }

    public final int hashCode() {
        Map map = this.f33331a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.f33332b;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("TemplateSettings(normalReplacements=");
        sbA.append(this.f33331a);
        sbA.append(", cacheableReplacements=");
        sbA.append(this.f33332b);
        sbA.append(')');
        return sbA.toString();
    }

    public final Map a() {
        return this.f33332b;
    }
}
