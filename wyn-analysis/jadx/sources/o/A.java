package O;

import N.y0;
import kotlin.jvm.internal.H;
import q.s1;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public final int f8698a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8699b;

    public A(int i5, int i10) {
        this.f8698a = i5;
        this.f8699b = i10;
    }

    public abstract void a(G4.f fVar, E9.c cVar, y0 y0Var, s1 s1Var);

    public String b(int i5) {
        return "IntParameter(" + i5 + ')';
    }

    public String c(int i5) {
        return "ObjectParameter(" + i5 + ')';
    }

    public final String toString() {
        String simpleName = H.f39741a.getOrCreateKotlinClass(getClass()).getSimpleName();
        return simpleName == null ? "" : simpleName;
    }

    public /* synthetic */ A(int i5, int i10, int i11) {
        this((i11 & 1) != 0 ? 0 : i5, (i11 & 2) != 0 ? 0 : i10);
    }
}
