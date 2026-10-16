package A;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class F implements InterfaceC0227u {

    /* renamed from: a, reason: collision with root package name */
    public final float f22a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23b;

    public F(float f10, Object obj) {
        this.f22a = f10;
        this.f23b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        f10.getClass();
        return f10.f22a == this.f22a && AbstractC3340k.a(f10.f23b, this.f23b);
    }

    public final int hashCode() {
        Object obj = this.f23b;
        return Float.floatToIntBits(this.f22a) + AbstractC0213f.c(1.0f, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.internal.n, tf.l] */
    @Override // A.InterfaceC0216i
    public final c0 q(S3.e converter) {
        AbstractC3340k.e(converter, "converter");
        Object obj = this.f23b;
        return new xa.d(this.f22a, obj == null ? null : (AbstractC0221n) ((AbstractC3343n) converter.f10941b).invoke(obj));
    }
}
