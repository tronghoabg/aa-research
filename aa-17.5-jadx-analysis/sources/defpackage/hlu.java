package defpackage;

import android.graphics.Rect;

/* loaded from: classes2.dex */
public final class hlu {
    public boolean b;
    public Rect c;
    public int d;
    public boolean g;
    public ghv a = ghv.c;
    public int e = 0;
    public int f = 2;

    public final hlv a() {
        if (this.c != null || this.d <= 0) {
            return new hlv(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        throw new IllegalStateException("A bounding box needs to be provided if images are allowed in the text");
    }
}
