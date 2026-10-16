package com.vungle.ads.internal.network;

import A7.AbstractC0279p0;
import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.E;
import Wf.q0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* renamed from: a, reason: collision with root package name */
    public final g f33397a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f33398b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33399c;

    /* renamed from: d, reason: collision with root package name */
    public int f33400d;

    /* renamed from: e, reason: collision with root package name */
    public int f33401e;

    /* renamed from: f, reason: collision with root package name */
    public String f33402f;

    public /* synthetic */ d(int i5, g gVar, Map map, String str, int i10, int i11, String str2) {
        if (16 != (i5 & 16)) {
            AbstractC1240b0.k(i5, 16, b.f33388a.getDescriptor());
            throw null;
        }
        this.f33397a = (i5 & 1) == 0 ? g.GET : gVar;
        if ((i5 & 2) == 0) {
            this.f33398b = null;
        } else {
            this.f33398b = map;
        }
        if ((i5 & 4) == 0) {
            this.f33399c = null;
        } else {
            this.f33399c = str;
        }
        if ((i5 & 8) == 0) {
            this.f33400d = 0;
        } else {
            this.f33400d = i10;
        }
        this.f33401e = i11;
        if ((i5 & 32) == 0) {
            this.f33402f = null;
        } else {
            this.f33402f = str2;
        }
    }

    public static d a(d dVar, int i5) {
        g method = dVar.f33397a;
        Map map = dVar.f33398b;
        String str = dVar.f33399c;
        int i10 = dVar.f33401e;
        String str2 = dVar.f33402f;
        AbstractC3340k.e(method, "method");
        return new d(method, map, str, i5, i10, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f33397a == dVar.f33397a && AbstractC3340k.a(this.f33398b, dVar.f33398b) && AbstractC3340k.a(this.f33399c, dVar.f33399c) && this.f33400d == dVar.f33400d && this.f33401e == dVar.f33401e && AbstractC3340k.a(this.f33402f, dVar.f33402f);
    }

    public final int hashCode() {
        int iHashCode = this.f33397a.hashCode() * 31;
        Map map = this.f33398b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f33399c;
        int iHashCode3 = (this.f33401e + ((this.f33400d + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.f33402f;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("FailedTpat(method=");
        sbA.append(this.f33397a);
        sbA.append(", headers=");
        sbA.append(this.f33398b);
        sbA.append(", body=");
        sbA.append(this.f33399c);
        sbA.append(", retryAttempt=");
        sbA.append(this.f33400d);
        sbA.append(", retryCount=");
        sbA.append(this.f33401e);
        sbA.append(", tpatKey=");
        return AbstractC0279p0.n(sbA, this.f33402f, ')');
    }

    public static final void a(d self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33397a != g.GET) {
            output.f(serialDesc, 0, e.f33406a, self.f33397a);
        }
        if (output.A(serialDesc, 1) || self.f33398b != null) {
            q0 q0Var = q0.f15625a;
            output.i(serialDesc, 1, new E(q0Var, q0Var, 1), self.f33398b);
        }
        if (output.A(serialDesc, 2) || self.f33399c != null) {
            output.i(serialDesc, 2, q0.f15625a, self.f33399c);
        }
        if (output.A(serialDesc, 3) || self.f33400d != 0) {
            output.t(3, self.f33400d, serialDesc);
        }
        output.t(4, self.f33401e, serialDesc);
        if (!output.A(serialDesc, 5) && self.f33402f == null) {
            return;
        }
        output.i(serialDesc, 5, q0.f15625a, self.f33402f);
    }

    public d(g method, Map map, String str, int i5, int i10, String str2) {
        AbstractC3340k.e(method, "method");
        this.f33397a = method;
        this.f33398b = map;
        this.f33399c = str;
        this.f33400d = i5;
        this.f33401e = i10;
        this.f33402f = str2;
    }

    public final int a() {
        return this.f33400d;
    }
}
