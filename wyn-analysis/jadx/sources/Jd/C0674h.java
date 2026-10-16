package Jd;

import java.util.Set;
import vf.AbstractC4345a;

/* renamed from: Jd.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0674h implements x {

    /* renamed from: c, reason: collision with root package name */
    public static final C0674h f6055c = new C0674h();

    @Override // Nd.j
    public final Set b() {
        return ff.x.f35434a;
    }

    @Override // Nd.j
    public final boolean c() {
        return true;
    }

    @Override // Nd.j
    public final void d(tf.p pVar) {
        AbstractC4345a.s(this, pVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x) && ((x) obj).isEmpty();
    }

    @Override // Nd.j
    public final boolean isEmpty() {
        return true;
    }

    public final String toString() {
        return "Parameters " + ff.x.f35434a;
    }
}
