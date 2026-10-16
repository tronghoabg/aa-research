package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nsj {
    public final boolean a;
    public final defpackage.nti b;
    public defpackage.rct c;
    private final defpackage.sax d;

    public nsj(defpackage.sax saxVar, boolean z, defpackage.nti ntiVar) {
        this.d = saxVar;
        this.a = z;
        this.b = ntiVar;
    }

    public static final void b(android.content.Context context, android.view.View view, android.graphics.drawable.GradientDrawable.Orientation orientation) {
        android.graphics.drawable.GradientDrawable gradientDrawable;
        int i = true != defpackage.omf.r(context) ? 255 : 0;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setOrientation(orientation);
            gradientDrawable.setColors(new int[]{android.graphics.Color.argb(255, i, i, i), android.graphics.Color.argb(204, i, i, i), android.graphics.Color.argb(153, i, i, i), android.graphics.Color.argb(0, i, i, i), android.graphics.Color.argb(0, i, i, i)}, new float[]{com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 0.2f, 0.5f, 0.6f, 1.0f});
        } else {
            gradientDrawable = new android.graphics.drawable.GradientDrawable(orientation, new int[]{android.graphics.Color.argb(255, i, i, i), android.graphics.Color.argb(0, i, i, i)});
        }
        view.setBackground(gradientDrawable);
    }

    public final void a() {
        defpackage.rct rctVar = this.c;
        rctVar.getClass();
        this.d.i(rctVar);
    }
}
