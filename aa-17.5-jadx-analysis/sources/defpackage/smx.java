package defpackage;

import com.google.android.gms.common.Feature;

/* loaded from: classes2.dex */
public final class smx {
    public smy a;
    public smy b;
    public smr c;
    public Feature[] d;
    public int f;
    private final Runnable g = new oyx(8);
    public boolean e = true;

    public final rjr a() {
        spu.an(this.a != null, "Must set register function");
        spu.an(this.b != null, "Must set unregister function");
        spu.an(this.c != null, "Must set holder");
        spu.ax(this.c.a, "Key must not be null");
        return new rjr(new smw(this, this.c, this.d, this.e, this.f), new ykd(this, null), this.g);
    }
}
