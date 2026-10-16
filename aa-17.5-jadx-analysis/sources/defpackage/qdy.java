package defpackage;

import com.google.android.flexbox.FlexboxLayoutManager;

/* loaded from: classes2.dex */
public final class qdy {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ FlexboxLayoutManager h;

    public qdy(FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public final void a() {
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        this.c = (flexboxLayoutManager.K() || !flexboxLayoutManager.c) ? this.e ? flexboxLayoutManager.e.f() : flexboxLayoutManager.e.j() : this.e ? flexboxLayoutManager.e.f() : flexboxLayoutManager.C - flexboxLayoutManager.e.j();
    }

    public final void b() {
        this.a = -1;
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.f = false;
        this.g = false;
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        if (flexboxLayoutManager.K()) {
            if (flexboxLayoutManager.b == 0) {
                this.e = flexboxLayoutManager.a == 1;
                return;
            } else {
                this.e = false;
                return;
            }
        }
        if (flexboxLayoutManager.b == 0) {
            this.e = flexboxLayoutManager.a == 3;
        } else {
            this.e = false;
        }
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + "}";
    }
}
