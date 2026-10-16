package defpackage;

import android.graphics.Rect;
import com.google.android.gms.car.DropShadowParams;

/* loaded from: classes.dex */
final class nsl {
    public Rect a;
    public Rect b;
    public int c;
    public boolean d;
    public Rect e;
    public int f;
    public String g;
    public int h;
    public int i;
    public DropShadowParams j;
    public byte k;

    public final void a(int i) {
        this.h = i;
        this.k = (byte) (this.k | 8);
    }

    public final void b(int i) {
        this.i = i;
        this.k = (byte) (this.k | 16);
    }

    public final void c(boolean z) {
        this.d = z;
        this.k = (byte) (this.k | 2);
    }

    public final void d(int i) {
        this.c = i;
        this.k = (byte) (this.k | 1);
    }
}
