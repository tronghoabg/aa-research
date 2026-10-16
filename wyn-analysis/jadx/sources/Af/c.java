package Af;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class c implements k, d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1291a;

    /* renamed from: b, reason: collision with root package name */
    public final k f1292b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1293c;

    public c(k sequence, int i5, int i10) {
        this.f1291a = i10;
        switch (i10) {
            case 1:
                this.f1292b = sequence;
                this.f1293c = i5;
                if (i5 >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i5 + '.').toString());
            default:
                AbstractC3340k.e(sequence, "sequence");
                this.f1292b = sequence;
                this.f1293c = i5;
                if (i5 >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i5 + '.').toString());
        }
    }

    @Override // Af.d
    public final k a(int i5) {
        switch (this.f1291a) {
            case 0:
                int i10 = this.f1293c + i5;
                return i10 < 0 ? new c(this, i5, 0) : new c(this.f1292b, i10, 0);
            default:
                int i11 = this.f1293c;
                return i5 >= i11 ? e.f1294a : new x(this.f1292b, i5, i11);
        }
    }

    @Override // Af.d
    public final k b(int i5) {
        switch (this.f1291a) {
            case 0:
                int i10 = this.f1293c;
                int i11 = i10 + i5;
                return i11 < 0 ? new c(this, i5, 1) : new x(this.f1292b, i10, i11);
            default:
                return i5 >= this.f1293c ? this : new c(this.f1292b, i5, 1);
        }
    }

    @Override // Af.k
    public final Iterator iterator() {
        switch (this.f1291a) {
            case 0:
                return new b(this);
            default:
                return new b(this, (byte) 0);
        }
    }
}
