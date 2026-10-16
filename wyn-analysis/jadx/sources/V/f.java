package V;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f12862a = 0;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRef(element = ");
        sb2.append(this.f12862a);
        sb2.append(")@");
        int iHashCode = hashCode();
        tg.b.t(16);
        String string = Integer.toString(iHashCode, 16);
        AbstractC3340k.d(string, "toString(this, checkRadix(radix))");
        sb2.append(string);
        return sb2.toString();
    }
}
