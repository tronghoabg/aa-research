package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mrd implements java.lang.Comparable {
    public final defpackage.mqj c;
    public final com.google.android.apps.auto.components.graphics.icon.GhIcon d;
    public final java.lang.String e;
    public final com.google.android.apps.auto.components.graphics.icon.GhIcon f;

    public mrd(defpackage.mqj mqjVar, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, java.lang.String str, int i, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon2) {
        this.c = mqjVar;
        this.d = ghIcon;
        this.e = str;
        this.f = ghIcon2 == null ? i == 0 ? null : com.google.android.apps.auto.components.graphics.icon.GhIcon.q(defpackage.mkp.a.c.getResources(), i) : ghIcon2;
    }

    protected int a() {
        return -1;
    }

    public abstract void c();

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mrd) {
            return this.c.equals(((defpackage.mrd) obj).c);
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.mrd mrdVar) {
        return this.e.compareToIgnoreCase(mrdVar.e);
    }

    public android.graphics.drawable.Drawable g(android.content.Context context, int i) {
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = this.d;
        if (ghIcon.b == 2) {
            return new android.graphics.drawable.BitmapDrawable(context.getResources(), defpackage.lfy.e(context).d(context, ghIcon.a(), a(), ghIcon.d(context), ghIcon.e));
        }
        android.graphics.drawable.Drawable drawableF = ghIcon.f(context, i);
        drawableF.getClass();
        return drawableF;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0017  */
    public androidx.car.app.model.CarIcon h(android.content.Context context, int i, boolean z) {
        android.content.Context context2;
        android.graphics.Bitmap bitmapE;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = this.d;
        int i2 = ghIcon.b;
        if (i2 == 1) {
            context2 = context;
            bitmapE = ghIcon.e();
        } else if (i2 == 2) {
            context2 = context;
            bitmapE = defpackage.lfy.e(context).d(context2, ghIcon.a(), a(), ghIcon.d(context), ghIcon.e);
        } else if (i2 == 5) {
            context2 = context;
            bitmapE = ghIcon.e();
        } else if (i2 == 6) {
            bitmapE = defpackage.lfy.e(context).c(context, ghIcon.c(), i);
            context2 = context;
        } else if (i2 != 7) {
            context2 = context;
            bitmapE = null;
        } else {
            context2 = context;
            bitmapE = ghIcon.e();
        }
        if (bitmapE == null) {
            return ghIcon.i(context2, i);
        }
        if (this.c.c && !z) {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(context2.getResources().getDisplayMetrics(), bitmapE.getWidth(), bitmapE.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setAlpha(178);
            android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
            colorMatrix.setSaturation(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            paint.setColorFilter(new android.graphics.ColorMatrixColorFilter(colorMatrix));
            canvas.drawBitmap(bitmapE, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, paint);
            bitmapE = bitmapCreateBitmap;
        }
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.gearhead_launcher_app_shadow_size);
        int i3 = dimensionPixelSize + dimensionPixelSize;
        android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(context2.getResources().getDisplayMetrics(), bitmapE.getWidth() + i3, bitmapE.getHeight() + i3, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas2 = new android.graphics.Canvas(bitmapCreateBitmap2);
        canvas2.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        float f = dimensionPixelSize;
        paint2.setMaskFilter(new android.graphics.BlurMaskFilter(f, android.graphics.BlurMaskFilter.Blur.NORMAL));
        int[] iArr = new int[2];
        android.graphics.Bitmap bitmapExtractAlpha = bitmapE.extractAlpha(paint2, iArr);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setColor(-12303292);
        canvas2.drawBitmap(bitmapExtractAlpha, iArr[0] + dimensionPixelSize, iArr[1] + dimensionPixelSize, paint3);
        bitmapExtractAlpha.recycle();
        canvas2.drawBitmap(bitmapE, f, f, (android.graphics.Paint) null);
        return new androidx.car.app.model.CarIcon(new defpackage.to(androidx.core.graphics.drawable.IconCompat.k(bitmapCreateBitmap2)));
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public java.lang.String i() {
        return this.e;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("{AppKey: %s}", this.c.toString());
    }
}
