package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xh {
    public boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public xh(android.widget.ImageView imageView, defpackage.gka gkaVar) {
        this.a = false;
        this.b = imageView;
        this.c = gkaVar;
    }

    public final android.view.MotionEvent a() {
        return (android.view.MotionEvent) ((defpackage.to) this.c).c;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final boolean b(long j) {
        java.lang.Object obj;
        ?? r0 = ((defpackage.to) this.c).b;
        int size = r0.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = r0.get(i);
            if (((defpackage.crf) obj).a == j) {
                break;
            }
            i++;
        }
        defpackage.crf crfVar = (defpackage.crf) obj;
        return (crfVar != null && crfVar.h) || c() == 5;
    }

    public final int c() {
        int i = ((defpackage.to) this.c).a;
        if (i != 1) {
            return i;
        }
        android.view.MotionEvent motionEventA = a();
        if (motionEventA == null || android.os.Build.VERSION.SDK_INT < 29) {
            return 1;
        }
        int iM = alh$.ExternalSyntheticApiModelOutline0.m(motionEventA);
        if (iM == 1) {
            return 2;
        }
        if (iM == 2) {
            return 3;
        }
        if (iM != 3) {
            if (iM == 5 && android.os.Build.VERSION.SDK_INT >= 34) {
                return 4;
            }
        } else if (android.os.Build.VERSION.SDK_INT >= 34) {
            return 5;
        }
        return 1;
    }

    public final void d() {
        if (this.a) {
            return;
        }
        this.a = true;
        int i = true != zlv.c ? 2131232782 : 2131232787;
        java.lang.Object obj = this.b;
        defpackage.gka gkaVar = (defpackage.gka) this.c;
        android.widget.ImageView imageView = (android.widget.ImageView) obj;
        imageView.setImageDrawable(gkaVar.D(i));
        imageView.setVisibility(8);
        imageView.setContentDescription(gkaVar.F(2132084379));
        imageView.setTag("GoogleMapMyLocationButton");
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new hy(this, 10));
    }

    public final void e(android.view.View.OnClickListener onClickListener) {
        ((android.widget.ImageView) this.b).setOnClickListener(onClickListener);
    }

    public final void f(boolean z) {
        if (adel.e() && z) {
            d();
        }
        ((android.widget.ImageView) this.b).setVisibility(true != z ? 8 : 0);
    }

    public xh(uop uopVar, ujq ujqVar, boolean z) {
        this.c = uopVar;
        this.b = ujqVar;
        this.a = z;
    }

    public xh(defpackage.zz zzVar, defpackage.to toVar) {
        this.b = zzVar;
        this.c = toVar;
    }
}
