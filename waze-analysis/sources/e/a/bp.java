package e.a;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bp {

    /* renamed from: a, reason: collision with root package name */
    private final List f46500a;

    /* renamed from: b, reason: collision with root package name */
    private final c f46501b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f46502c;

    /* synthetic */ bp(List list, c cVar, Object obj) {
        com.google.d.b.an.C(list, "addresses");
        this.f46500a = DesugarCollections.unmodifiableList(new ArrayList(list));
        com.google.d.b.an.C(cVar, "attributes");
        this.f46501b = cVar;
        this.f46502c = obj;
    }

    public static da d() {
        return new da(null);
    }

    public final c a() {
        return this.f46501b;
    }

    public final Object b() {
        return this.f46502c;
    }

    public final List c() {
        return this.f46500a;
    }

    public final da e() {
        da daVar = new da(null);
        daVar.f(this.f46500a);
        daVar.g(this.f46501b);
        daVar.h(this.f46502c);
        return daVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bp)) {
            return false;
        }
        bp bpVar = (bp) obj;
        return Objects.equals(this.f46500a, bpVar.f46500a) && Objects.equals(this.f46501b, bpVar.f46501b) && Objects.equals(this.f46502c, bpVar.f46502c);
    }

    public final int hashCode() {
        return Objects.hash(this.f46500a, this.f46501b, this.f46502c);
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("addresses", this.f46500a);
        zVarH.d("loadBalancingPolicyConfig", this.f46502c);
        zVarH.d("attributes", this.f46501b);
        return zVarH.toString();
    }
}
