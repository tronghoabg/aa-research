package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class wrw {
    public final android.view.View a;
    public final int b;
    public final int c;
    protected final int d;
    public ny e;
    private final android.animation.TimeInterpolator f = new android.view.animation.PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    public wrw(android.view.View view) {
        this.a = view;
        android.content.Context context = view.getContext();
        this.b = defpackage.sqs.bm(context, 2130969986, 300);
        this.c = defpackage.sqs.bm(context, 2130969991, 150);
        this.d = defpackage.sqs.bm(context, 2130969990, 100);
    }

    public final float a(float f) {
        return this.f.getInterpolation(f);
    }

    protected final ny b() {
        if (this.e == null) {
            android.util.Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        ny nyVar = this.e;
        this.e = null;
        return nyVar;
    }

    public final ny c() {
        ny nyVar = this.e;
        this.e = null;
        return nyVar;
    }

    protected final ny d(ny nyVar) {
        if (this.e == null) {
            android.util.Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        ny nyVar2 = this.e;
        this.e = nyVar;
        return nyVar2;
    }
}
