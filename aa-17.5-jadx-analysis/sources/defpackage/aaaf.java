package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.location.Location;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class aaaf implements zxb {
    public Location c;
    public Bitmap d;
    public Bitmap e;
    public Point g;
    public float h;
    public final gjt i;
    private final aaac j;
    public boolean a = false;
    public final Paint b = new Paint();
    public zxa f = null;

    public aaaf(aaac aaacVar, gjt gjtVar) {
        this.j = aaacVar;
        this.i = gjtVar;
    }

    @Override // defpackage.zxb
    public final void a() {
        if (this.a) {
            this.j.invalidate();
        }
        this.a = false;
    }

    @Override // defpackage.zxb
    public final void c() {
        if (!this.a) {
            this.j.invalidate();
        }
        this.a = true;
    }

    @Override // defpackage.zxb
    public final void e(zxa zxaVar) {
        this.f = zxaVar;
    }

    @Override // defpackage.zxb
    public final void f(Location location) {
        if (!Objects.equals(location, this.c)) {
            this.j.invalidate();
        }
        this.c = location;
    }

    @Override // defpackage.zxb
    public final void d(boolean z) {
    }
}
