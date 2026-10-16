package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class wvb extends android.graphics.drawable.Drawable.ConstantState {
    public wvh a;
    defpackage.wpw b;
    android.graphics.ColorFilter c;
    android.content.res.ColorStateList d;
    android.content.res.ColorStateList e;
    android.content.res.ColorStateList f;
    android.content.res.ColorStateList g;
    android.graphics.PorterDuff.Mode h;
    android.graphics.Rect i;
    float j;
    public float k;
    float l;
    int m;
    float n;
    float o;
    float p;
    int q;
    int r;
    int s;
    int t;
    boolean u;
    android.graphics.Paint.Style v;

    public wvb(defpackage.wvb wvbVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = android.graphics.PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = android.graphics.Paint.Style.FILL_AND_STROKE;
        this.a = wvbVar.a;
        this.b = wvbVar.b;
        this.l = wvbVar.l;
        this.c = wvbVar.c;
        this.d = wvbVar.d;
        this.e = wvbVar.e;
        this.h = wvbVar.h;
        this.g = wvbVar.g;
        this.m = wvbVar.m;
        this.j = wvbVar.j;
        this.s = wvbVar.s;
        int i = wvbVar.q;
        this.q = 0;
        boolean z = wvbVar.u;
        this.u = false;
        this.k = wvbVar.k;
        this.n = wvbVar.n;
        this.o = wvbVar.o;
        float f = wvbVar.p;
        this.p = 0.0f;
        this.r = wvbVar.r;
        int i2 = wvbVar.t;
        this.t = 0;
        android.content.res.ColorStateList colorStateList = wvbVar.f;
        this.f = null;
        this.v = wvbVar.v;
        android.graphics.Rect rect = wvbVar.i;
        if (rect != null) {
            this.i = new android.graphics.Rect(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public android.graphics.drawable.Drawable newDrawable() {
        defpackage.wvd wvdVar = new defpackage.wvd(this);
        wvdVar.t = true;
        wvdVar.u = true;
        return wvdVar;
    }

    public wvb(wvh wvhVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = android.graphics.PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = android.graphics.Paint.Style.FILL_AND_STROKE;
        this.a = wvhVar;
        this.b = null;
    }
}
