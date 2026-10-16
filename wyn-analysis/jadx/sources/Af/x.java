package Af;

import java.util.Iterator;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class x implements k, d {

    /* renamed from: a, reason: collision with root package name */
    public final k f1335a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1336b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1337c;

    public x(k sequence, int i5, int i10) {
        AbstractC3340k.e(sequence, "sequence");
        this.f1335a = sequence;
        this.f1336b = i5;
        this.f1337c = i10;
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "startIndex should be non-negative, but is ").toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(i10, "endIndex should be non-negative, but is ").toString());
        }
        if (i10 < i5) {
            throw new IllegalArgumentException(R8.v.e(i10, i5, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override // Af.d
    public final k a(int i5) {
        int i10 = this.f1337c;
        int i11 = this.f1336b;
        if (i5 >= i10 - i11) {
            return e.f1294a;
        }
        return new x(this.f1335a, i11 + i5, i10);
    }

    @Override // Af.d
    public final k b(int i5) {
        int i10 = this.f1337c;
        int i11 = this.f1336b;
        if (i5 >= i10 - i11) {
            return this;
        }
        return new x(this.f1335a, i11, i5 + i11);
    }

    @Override // Af.k
    public final Iterator iterator() {
        return new i(this);
    }
}
