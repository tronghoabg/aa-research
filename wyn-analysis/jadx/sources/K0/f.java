package K0;

import A0.p;
import e0.C2465q;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final f f6318a = new f();

    @Override // K0.g
    public final long a() {
        int i5 = C2465q.f34381j;
        return C2465q.f34380i;
    }

    @Override // K0.g
    public final g b(tf.a aVar) {
        return !equals(f6318a) ? this : (g) aVar.invoke();
    }

    @Override // K0.g
    public final g c(g other) {
        AbstractC3340k.e(other, "other");
        return other.b(new p(this, 7));
    }
}
