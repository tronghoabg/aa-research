package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class ffy extends fge implements emk {
    public boolean b;
    public boolean c;
    public emp e;
    public Runnable f;
    public final /* synthetic */ fgc g;
    public long a = -1;
    public int d = 0;
    public final zit h = new zit((byte[]) null);

    public ffy(fgc fgcVar) {
        this.g = fgcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffy.k():void");
    }

    @Override // defpackage.fge, defpackage.ffz
    public final void a(fgc fgcVar) {
        this.c = true;
    }

    public final long h() {
        return this.g.w;
    }

    public final void i() {
        if (this.b) {
            k();
            this.e.k(h() + 1);
        } else {
            this.d = 1;
            this.f = null;
        }
    }

    public final void j(Runnable runnable) {
        this.f = runnable;
        if (!this.b) {
            this.d = 2;
        } else {
            k();
            this.e.k(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // defpackage.emk
    public final void l(float f) {
        long jMax = Math.max(-1L, Math.min(h() + 1, Math.round(f)));
        this.g.z(jMax, this.a);
        this.a = jMax;
    }
}
