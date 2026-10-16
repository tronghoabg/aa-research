package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class wrw {
    public final android.view.View a;
    public final int b;
    public final int c;
    protected final int d;
    public defpackage.ny e;
    private final android.animation.TimeInterpolator f = new android.view.animation.PathInterpolator(0.1f, 0.1f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);

    public wrw(android.view.View view) {
        this.a = view;
        android.content.Context context = view.getContext();
        this.b = defpackage.sqs.bm(context, com.google.android.projection.gearhead.R.attr.motionDurationMedium2, 300);
        this.c = defpackage.sqs.bm(context, com.google.android.projection.gearhead.R.attr.motionDurationShort3, 150);
        this.d = defpackage.sqs.bm(context, com.google.android.projection.gearhead.R.attr.motionDurationShort2, 100);
    }

    public final float a(float f) {
        return this.f.getInterpolation(f);
    }

    protected final defpackage.ny b() {
        if (this.e == null) {
            android.util.Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        defpackage.ny nyVar = this.e;
        this.e = null;
        return nyVar;
    }

    public final defpackage.ny c() {
        defpackage.ny nyVar = this.e;
        this.e = null;
        return nyVar;
    }

    protected final defpackage.ny d(defpackage.ny nyVar) {
        if (this.e == null) {
            android.util.Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        defpackage.ny nyVar2 = this.e;
        this.e = nyVar;
        return nyVar2;
    }
}
