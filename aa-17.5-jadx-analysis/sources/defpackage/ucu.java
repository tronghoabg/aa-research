package defpackage;

import j$.time.Duration;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ucu {
    public uzc a;
    private Map b;
    private yfq c;
    private Duration d;
    private byte e;

    public final ucv a() {
        if (this.e != 3 || this.b == null || this.a == null || this.c == null || this.d == null) {
            throw new IllegalStateException();
        }
        return new ucv(this.b);
    }

    public final void b(Map map) {
        map.getClass();
        this.b = map;
    }

    public final void c(yfq yfqVar) {
        yfqVar.getClass();
        this.c = yfqVar;
    }

    public final void d(Duration duration) {
        duration.getClass();
        this.d = duration;
    }

    public final void e() {
        this.e = (byte) (this.e | 2);
    }

    public final void f() {
        this.e = (byte) (this.e | 1);
    }
}
