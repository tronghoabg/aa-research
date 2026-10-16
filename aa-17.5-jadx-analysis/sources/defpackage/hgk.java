package defpackage;

import j$.time.Instant;

/* loaded from: classes2.dex */
public final class hgk {
    public final float a;
    public int g;
    private final Instant h;
    public int f = 1;
    public float b = 1.0f;
    public long c = 0;
    public long d = 0;
    public long e = 0;

    public hgk(float f) {
        this.a = f;
        Instant instantNow = Instant.now();
        instantNow.getClass();
        this.h = instantNow;
    }

    public final void a(afdr afdrVar) {
        if (this.f == 2) {
            fwc fwcVar = new fwc(afdrVar, this, 20);
            if (Instant.now().toEpochMilli() - this.h.toEpochMilli() >= 30) {
                fwcVar.invoke();
            }
        }
    }

    public final void b(afdr afdrVar) {
        if (this.f == 2) {
            this.f = 3;
            afdrVar.invoke();
        }
    }

    public final void c(int i) {
        if (this.f == 1) {
            this.f = 2;
            this.g = i;
        }
    }
}
