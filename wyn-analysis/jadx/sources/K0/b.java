package K0;

import A0.p;
import e0.C2465q;
import ef.C2539w;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final long f6313a;

    public b(long j8) {
        this.f6313a = j8;
        if (j8 == C2465q.f34380i) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextDrawStyle.Unspecified instead.");
        }
    }

    @Override // K0.g
    public final long a() {
        return this.f6313a;
    }

    @Override // K0.g
    public final g b(tf.a aVar) {
        return !equals(f.f6318a) ? this : (g) aVar.invoke();
    }

    @Override // K0.g
    public final g c(g other) {
        AbstractC3340k.e(other, "other");
        return other.b(new p(this, 7));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && C2465q.b(this.f6313a, ((b) obj).f6313a);
    }

    public final int hashCode() {
        int i5 = C2465q.f34381j;
        return C2539w.a(this.f6313a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C2465q.h(this.f6313a)) + ')';
    }
}
