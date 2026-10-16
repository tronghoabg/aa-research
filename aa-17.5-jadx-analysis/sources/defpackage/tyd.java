package defpackage;

import j$.util.Objects;

/* loaded from: classes3.dex */
public class tyd implements tqr {
    public final tqs e;
    protected final int f;
    public final Integer g;
    protected final uma h;

    public tyd(tqs tqsVar, int i, Integer num, uma umaVar) {
        this.e = tqsVar;
        this.f = i;
        this.h = umaVar;
        this.g = num;
    }

    @Override // defpackage.tqr
    public final int a() {
        return this.f;
    }

    @Override // defpackage.tqr
    public tqs b() {
        return this.e;
    }

    @Override // defpackage.tqr
    public final boolean c() {
        tqs tqsVar = this.e;
        boolean z = tqsVar instanceof tvl;
        if (z) {
            return z && ((tvl) tqsVar).q();
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (obj.getClass() == getClass()) {
                tyd tydVar = (tyd) obj;
                if (b().equals(tydVar.b()) && this.f == tydVar.f && Objects.equals(this.g, tydVar.g) && this.h.equals(tydVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.e, Integer.valueOf(this.f), this.g, this.h);
    }

    public final String toString() {
        uma umaVar = this.h;
        return "PickObjectImpl{renderOp=" + this.e.toString() + ", indexOfSmallestCollidedTapRadius=" + this.f + ", smallestCollidedTapRadiusDp=" + this.g + ", gmmEntity=" + String.valueOf(umaVar) + "}";
    }
}
