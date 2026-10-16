package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class wmk {
    public final MaterialButton a;
    public wui b;
    public emq c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public PorterDuff.Mode j;
    public ColorStateList k;
    public ColorStateList l;
    public ColorStateList m;
    public Drawable n;
    public boolean p;
    public RippleDrawable r;
    public int s;
    public ykd t;
    public boolean o = false;
    public boolean q = true;

    public wmk(MaterialButton materialButton, wui wuiVar) {
        this.a = materialButton;
        this.b = wuiVar;
    }

    public final wue a(boolean z) {
        RippleDrawable rippleDrawable = this.r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (wue) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b() {
        this.o = true;
        MaterialButton materialButton = this.a;
        materialButton.l(this.k);
        materialButton.m(this.j);
    }

    public final void c(wui wuiVar) {
        this.b = wuiVar;
        d();
    }

    public final void d() {
        wue wueVarA = a(false);
        if (wueVarA != null) {
            wueVarA.R(this.b);
            emq emqVar = this.c;
            if (emqVar != null) {
                wueVarA.M(emqVar);
            }
        }
        wue wueVarA2 = a(true);
        if (wueVarA2 != null) {
            wueVarA2.R(this.b);
            emq emqVar2 = this.c;
            if (emqVar2 != null) {
                wueVarA2.M(emqVar2);
            }
        }
        RippleDrawable rippleDrawable = this.r;
        wuv wuvVar = null;
        if (rippleDrawable != null) {
            Object objFindDrawableByLayerId = rippleDrawable.findDrawableByLayerId(R.id.mask);
            if (objFindDrawableByLayerId instanceof wuv) {
                wuvVar = (wuv) objFindDrawableByLayerId;
            }
        }
        if (wuvVar != null) {
            if (!(wuvVar instanceof wue)) {
                wuvVar.d(this.b.a());
                return;
            }
            wue wueVar = (wue) wuvVar;
            wueVar.R(this.b);
            emq emqVar3 = this.c;
            if (emqVar3 != null) {
                wueVar.M(emqVar3);
            }
        }
    }

    public final void e(ykd ykdVar) {
        this.t = ykdVar;
        wue wueVarA = a(false);
        if (wueVarA != null) {
            wueVarA.A = ykdVar;
        }
    }
}
