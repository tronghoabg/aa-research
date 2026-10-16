package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wnh {
    public final com.google.android.material.button.MaterialButton a;
    public wvh b;
    public emw c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public android.graphics.PorterDuff.Mode j;
    public android.content.res.ColorStateList k;
    public android.content.res.ColorStateList l;
    public android.content.res.ColorStateList m;
    public android.graphics.drawable.Drawable n;
    public boolean p;
    public android.graphics.drawable.RippleDrawable r;
    public int s;
    public defpackage.xei t;
    public boolean o = false;
    public boolean q = true;

    public wnh(com.google.android.material.button.MaterialButton materialButton, wvh wvhVar) {
        this.a = materialButton;
        this.b = wvhVar;
    }

    public final defpackage.wvd a(boolean z) {
        android.graphics.drawable.RippleDrawable rippleDrawable = this.r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (defpackage.wvd) ((android.graphics.drawable.LayerDrawable) ((android.graphics.drawable.InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b() {
        this.o = true;
        com.google.android.material.button.MaterialButton materialButton = this.a;
        materialButton.l(this.k);
        materialButton.m(this.j);
    }

    public final void c(wvh wvhVar) {
        this.b = wvhVar;
        d();
    }

    public final void d() {
        defpackage.wvd wvdVarA = a(false);
        if (wvdVarA != null) {
            wvdVarA.R(this.b);
            emw emwVar = this.c;
            if (emwVar != null) {
                wvdVarA.M(emwVar);
            }
        }
        defpackage.wvd wvdVarA2 = a(true);
        if (wvdVarA2 != null) {
            wvdVarA2.R(this.b);
            emw emwVar2 = this.c;
            if (emwVar2 != null) {
                wvdVarA2.M(emwVar2);
            }
        }
        android.graphics.drawable.RippleDrawable rippleDrawable = this.r;
        wvt wvtVar = null;
        if (rippleDrawable != null) {
            android.graphics.drawable.Drawable drawableFindDrawableByLayerId = rippleDrawable.findDrawableByLayerId(android.R.id.mask);
            if (drawableFindDrawableByLayerId instanceof wvt) {
                wvtVar = (wvt) drawableFindDrawableByLayerId;
            }
        }
        if (wvtVar != null) {
            if (!(wvtVar instanceof defpackage.wvd)) {
                wvtVar.d(this.b.a());
                return;
            }
            defpackage.wvd wvdVar = (defpackage.wvd) wvtVar;
            wvdVar.R(this.b);
            emw emwVar3 = this.c;
            if (emwVar3 != null) {
                wvdVar.M(emwVar3);
            }
        }
    }

    public final void e(defpackage.xei xeiVar) {
        this.t = xeiVar;
        defpackage.wvd wvdVarA = a(false);
        if (wvdVarA != null) {
            wvdVarA.A = xeiVar;
        }
    }
}
