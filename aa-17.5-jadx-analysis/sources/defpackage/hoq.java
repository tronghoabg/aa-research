package defpackage;

import java.util.Collection;

/* loaded from: classes2.dex */
public final class hoq extends hne {
    public static final hop b = new hop();
    private final int c;
    private final float d;
    private final float e;
    private final Collection f;
    private final int g;

    public hoq(int i, int i2, float f, float f2, Collection collection) {
        super(hnm.b);
        this.g = i;
        this.c = i2;
        this.d = f;
        this.e = f2;
        this.f = collection;
    }

    @Override // defpackage.hnj
    public final Collection a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoq)) {
            return false;
        }
        hoq hoqVar = (hoq) obj;
        return this.g == hoqVar.g && this.c == hoqVar.c && Float.compare(this.d, hoqVar.d) == 0 && Float.compare(this.e, hoqVar.e) == 0 && affa.f(this.f, hoqVar.f);
    }

    public final int hashCode() {
        return (((((((this.g * 31) + this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f.hashCode();
    }
}
