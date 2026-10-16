package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jvf {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public jvf(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static defpackage.jvf a(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        return new defpackage.jvf(resources.getColor(com.google.android.projection.gearhead.R.color.default_primary_color), resources.getColor(com.google.android.projection.gearhead.R.color.default_primary_dark_color), resources.getColor(com.google.android.projection.gearhead.R.color.default_secondary_color), resources.getColor(com.google.android.projection.gearhead.R.color.default_secondary_dark_color), null);
    }

    public jvf(int i, int i2, int i3, int i4, char[] cArr) {
        this.d = i;
        this.a = i2;
        this.c = i3;
        this.b = i4;
    }
}
