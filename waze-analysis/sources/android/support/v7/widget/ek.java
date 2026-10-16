package android.support.v7.widget;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ek implements go {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ en f1404a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f1405b;

    ek(en enVar, int i2) {
        this.f1405b = i2;
        this.f1404a = enVar;
    }

    @Override // android.support.v7.widget.go
    public final int a(View view) {
        int iBo;
        int i2;
        if (this.f1405b != 0) {
            eo eoVar = (eo) view.getLayoutParams();
            iBo = en.bs(view);
            i2 = eoVar.rightMargin;
        } else {
            eo eoVar2 = (eo) view.getLayoutParams();
            iBo = en.bo(view);
            i2 = eoVar2.bottomMargin;
        }
        return iBo + i2;
    }

    @Override // android.support.v7.widget.go
    public final int b(View view) {
        int iBt;
        int i2;
        if (this.f1405b != 0) {
            eo eoVar = (eo) view.getLayoutParams();
            iBt = en.bp(view);
            i2 = eoVar.leftMargin;
        } else {
            eo eoVar2 = (eo) view.getLayoutParams();
            iBt = en.bt(view);
            i2 = eoVar2.topMargin;
        }
        return iBt - i2;
    }

    @Override // android.support.v7.widget.go
    public final int c() {
        int iAu;
        int iAA;
        int i2 = this.f1405b;
        en enVar = this.f1404a;
        if (i2 != 0) {
            iAu = enVar.aE();
            iAA = enVar.aC();
        } else {
            iAu = enVar.au();
            iAA = enVar.aA();
        }
        return iAu - iAA;
    }

    @Override // android.support.v7.widget.go
    public final int d() {
        int i2 = this.f1405b;
        en enVar = this.f1404a;
        return i2 != 0 ? enVar.aB() : enVar.aD();
    }

    @Override // android.support.v7.widget.go
    public final View e(int i2) {
        int i3 = this.f1405b;
        en enVar = this.f1404a;
        return i3 != 0 ? enVar.aI(i2) : enVar.aI(i2);
    }
}
