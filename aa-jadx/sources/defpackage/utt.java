package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class utt {
    public int b;
    public int d;
    public final float[] a = new float[64];
    public final float[] c = new float[64];
    public float e = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    public float f = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public float k = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    public float l = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;

    public final void a(java.util.List list) {
        this.i = false;
        this.d = java.lang.Math.min(list.size(), 16);
        int i = 0;
        for (int i2 = 0; i2 < this.d; i2++) {
            int i3 = ((defpackage.ajot) list.get(i2)).a;
            float[] fArr = this.c;
            fArr[i] = ((i3 >> 16) & 255) / 255.0f;
            fArr[i + 1] = ((i3 >> 8) & 255) / 255.0f;
            fArr[i + 2] = (i3 & 255) / 255.0f;
            int i4 = (i3 >> 24) & 255;
            fArr[i + 3] = i4 / 255.0f;
            i += 4;
            this.i = (i4 != 0) | this.i;
        }
    }

    public final void b(java.util.List list) {
        this.h = false;
        this.b = java.lang.Math.min(list.size(), 16);
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            int i3 = ((defpackage.ajot) list.get(i2)).a;
            float[] fArr = this.a;
            fArr[i] = ((i3 >> 16) & 255) / 255.0f;
            fArr[i + 1] = ((i3 >> 8) & 255) / 255.0f;
            fArr[i + 2] = (i3 & 255) / 255.0f;
            int i4 = (i3 >> 24) & 255;
            fArr[i + 3] = i4 / 255.0f;
            i += 4;
            this.h = (i4 != 0) | this.h;
        }
    }
}
