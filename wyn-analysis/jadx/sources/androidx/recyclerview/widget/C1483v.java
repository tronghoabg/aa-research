package androidx.recyclerview.widget;

import A7.AbstractC0279p0;
import android.view.View;

/* renamed from: androidx.recyclerview.widget.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1483v {

    /* renamed from: a, reason: collision with root package name */
    public B f19009a;

    /* renamed from: b, reason: collision with root package name */
    public int f19010b;

    /* renamed from: c, reason: collision with root package name */
    public int f19011c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19012d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19013e;

    public C1483v() {
        d();
    }

    public final void a() {
        this.f19011c = this.f19012d ? this.f19009a.g() : this.f19009a.k();
    }

    public final void b(int i5, View view) {
        if (this.f19012d) {
            int iB = this.f19009a.b(view);
            B b5 = this.f19009a;
            this.f19011c = (Integer.MIN_VALUE == b5.f18757b ? 0 : b5.l() - b5.f18757b) + iB;
        } else {
            this.f19011c = this.f19009a.e(view);
        }
        this.f19010b = i5;
    }

    public final void c(int i5, View view) {
        B b5 = this.f19009a;
        int iL = Integer.MIN_VALUE == b5.f18757b ? 0 : b5.l() - b5.f18757b;
        if (iL >= 0) {
            b(i5, view);
            return;
        }
        this.f19010b = i5;
        if (!this.f19012d) {
            int iE = this.f19009a.e(view);
            int iK = iE - this.f19009a.k();
            this.f19011c = iE;
            if (iK > 0) {
                int iG = (this.f19009a.g() - Math.min(0, (this.f19009a.g() - iL) - this.f19009a.b(view))) - (this.f19009a.c(view) + iE);
                if (iG < 0) {
                    this.f19011c -= Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (this.f19009a.g() - iL) - this.f19009a.b(view);
        this.f19011c = this.f19009a.g() - iG2;
        if (iG2 > 0) {
            int iC = this.f19011c - this.f19009a.c(view);
            int iK2 = this.f19009a.k();
            int iMin = iC - (Math.min(this.f19009a.e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.f19011c = Math.min(iG2, -iMin) + this.f19011c;
            }
        }
    }

    public final void d() {
        this.f19010b = -1;
        this.f19011c = Integer.MIN_VALUE;
        this.f19012d = false;
        this.f19013e = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
        sb2.append(this.f19010b);
        sb2.append(", mCoordinate=");
        sb2.append(this.f19011c);
        sb2.append(", mLayoutFromEnd=");
        sb2.append(this.f19012d);
        sb2.append(", mValid=");
        return AbstractC0279p0.p(sb2, this.f19013e, '}');
    }
}
