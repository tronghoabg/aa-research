package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class fst {
    public final fto a;
    public final Boolean b;
    public final int c;
    public final int d;
    private final ept e = null;
    private final aitu f = null;
    private final aitu g = null;
    private final aitu h = null;
    private final aitu i = null;
    private final ftr j = null;
    private final Bitmap.Config k = null;
    private final Boolean l = null;
    private final fsr m = null;
    private final fsr n = null;
    private final fsr o = null;

    public fst(fto ftoVar, int i, int i2, Boolean bool) {
        this.a = ftoVar;
        this.c = i;
        this.d = i2;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fst)) {
            return false;
        }
        fst fstVar = (fst) obj;
        ept eptVar = fstVar.e;
        if (!affa.f(null, null) || !affa.f(this.a, fstVar.a) || this.c != fstVar.c) {
            return false;
        }
        aitu aituVar = fstVar.f;
        if (!affa.f(null, null)) {
            return false;
        }
        aitu aituVar2 = fstVar.g;
        if (!affa.f(null, null)) {
            return false;
        }
        aitu aituVar3 = fstVar.h;
        if (!affa.f(null, null)) {
            return false;
        }
        aitu aituVar4 = fstVar.i;
        if (!affa.f(null, null)) {
            return false;
        }
        ftr ftrVar = fstVar.j;
        if (!affa.f(null, null) || this.d != fstVar.d) {
            return false;
        }
        Bitmap.Config config = fstVar.k;
        if (!affa.f(this.b, fstVar.b)) {
            return false;
        }
        Boolean bool = fstVar.l;
        if (!affa.f(null, null)) {
            return false;
        }
        fsr fsrVar = fstVar.m;
        fsr fsrVar2 = fstVar.n;
        fsr fsrVar3 = fstVar.o;
        return true;
    }

    public final int hashCode() {
        fto ftoVar = this.a;
        int iHashCode = ftoVar != null ? ftoVar.hashCode() : 0;
        int i = this.c;
        if (i == 0) {
            i = 0;
        }
        int i2 = iHashCode * 31;
        int i3 = this.d;
        if (i3 == 0) {
            i3 = 0;
        }
        int i4 = i2 + i;
        Boolean bool = this.b;
        return ((((i4 * 887503681) + i3) * 961) + (bool != null ? bool.hashCode() : 0)) * 923521;
    }
}
