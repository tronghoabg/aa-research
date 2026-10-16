package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wtj extends defpackage.wte {
    public final defpackage.wth a;
    public final defpackage.wti b;
    public android.graphics.drawable.Drawable c;

    public wtj(android.content.Context context, defpackage.wsm wsmVar, defpackage.wth wthVar, defpackage.wti wtiVar) {
        super(context, wsmVar);
        this.a = wthVar;
        this.b = wtiVar;
        wtiVar.j = this;
    }

    private final boolean a() {
        return this.p != null && defpackage.wpu.j(this.i.getContentResolver()) == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x011f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0123 A[SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        boolean z;
        int i;
        int i2;
        java.util.List list;
        android.graphics.drawable.Drawable drawable;
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(this.o)) {
            return;
        }
        if (a() && (drawable = this.c) != null) {
            drawable.setBounds(getBounds());
            this.c.setTint(this.j.e[0]);
            this.c.draw(canvas);
            return;
        }
        canvas.save();
        defpackage.wth wthVar = this.a;
        android.graphics.Canvas canvas2 = canvas;
        wthVar.h(canvas2, getBounds(), f(), k(), j());
        defpackage.wsm wsmVar = this.j;
        int i3 = wsmVar.i;
        int i4 = this.n;
        boolean z2 = (wsmVar instanceof defpackage.wts) || ((wsmVar instanceof defpackage.wsy) && ((defpackage.wsy) wsmVar).u);
        if (!z2 || i3 != 0) {
            z = false;
        } else if (wsmVar.c(false)) {
            i3 = 0;
            z = false;
        } else {
            i3 = 0;
            z = true;
        }
        if (z) {
            wthVar.f(canvas2, this.m, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f, wsmVar.f, i4, 0);
        } else {
            if (z2) {
                java.util.List list2 = this.b.k;
                defpackage.wtf wtfVar = (defpackage.wtf) list2.get(0);
                defpackage.wtf wtfVar2 = (defpackage.wtf) list2.get(list2.size() - 1);
                if (wthVar instanceof defpackage.wtk) {
                    android.graphics.Paint paint = this.m;
                    i = i3;
                    wthVar.f(canvas2, paint, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, wtfVar.a, wsmVar.f, i4, i);
                    wthVar.f(canvas2, paint, wtfVar2.b, 1.0f, wsmVar.f, i4, i);
                } else {
                    i = i3;
                    canvas2.save();
                    canvas2.rotate(wtfVar2.g);
                    wthVar.f(canvas2, this.m, wtfVar2.b, 1.0f + wtfVar.a, wsmVar.f, i4, i);
                    canvas2.restore();
                }
            }
            i2 = 0;
            while (true) {
                list = this.b.k;
                if (i2 < list.size()) {
                    canvas2.restore();
                    return;
                }
                defpackage.wtf wtfVar3 = (defpackage.wtf) list.get(i2);
                wtfVar3.f = g();
                wthVar = wthVar;
                android.graphics.Paint paint2 = this.m;
                wthVar.e(canvas2, paint2, wtfVar3, this.n);
                if (i2 <= 0 && !z && z2) {
                    android.graphics.Canvas canvas3 = canvas2;
                    wthVar.f(canvas3, paint2, ((defpackage.wtf) list.get(i2 - 1)).b, wtfVar3.a, wsmVar.f, i4, i);
                    canvas2 = canvas3;
                }
                i2++;
            }
        }
        i = i3;
        i2 = 0;
        while (true) {
            list = this.b.k;
            if (i2 < list.size()) {
                canvas2.restore();
                return;
            }
            defpackage.wtf wtfVar4 = (defpackage.wtf) list.get(i2);
            wtfVar4.f = g();
            wthVar = wthVar;
            android.graphics.Paint paint3 = this.m;
            wthVar.e(canvas2, paint3, wtfVar4, this.n);
            if (i2 <= 0) {
            }
            i2++;
        }
    }

    @Override // defpackage.wte
    public final boolean e(boolean z, boolean z2, boolean z3) {
        android.graphics.drawable.Drawable drawable;
        boolean zE = super.e(z, z2, z3);
        if (a() && (drawable = this.c) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.b.a();
        }
        if (z && z3) {
            this.b.f();
        }
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.wte, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }
}
