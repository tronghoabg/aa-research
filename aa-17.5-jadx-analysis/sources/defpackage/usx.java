package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes3.dex */
public final class usx {
    public int b;
    public int d;
    public final float[] a = new float[64];
    public final float[] c = new float[64];
    public float e = BitmapDescriptorFactory.HUE_RED;
    public float f = BitmapDescriptorFactory.HUE_RED;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public float k = BitmapDescriptorFactory.HUE_RED;
    public float l = BitmapDescriptorFactory.HUE_RED;

    public final void a(List list) {
        this.i = false;
        this.d = Math.min(list.size(), 16);
        int i = 0;
        for (int i2 = 0; i2 < this.d; i2++) {
            int i3 = ((ajnt) list.get(i2)).a;
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

    public final void b(List list) {
        this.h = false;
        this.b = Math.min(list.size(), 16);
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            int i3 = ((ajnt) list.get(i2)).a;
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
