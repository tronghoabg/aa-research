package defpackage;

/* loaded from: classes3.dex */
public final class ttl {
    public toi a;
    public too b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public tto i;

    public ttl(ttn ttnVar) {
        this.h = 30.0f;
        this.i = tto.a;
        this.a = ttnVar.g;
        this.b = ttnVar.h;
        this.c = ttnVar.i;
        this.d = ttnVar.k;
        this.e = ttnVar.l;
        this.f = ttnVar.m;
        this.g = ttnVar.n;
        this.i = ttnVar.o;
        this.h = ttnVar.j;
    }

    public final ttn a() {
        return new ttn(this.a, this.e, this.f, this.g, this.i, this.c, this.d, this.h);
    }

    public final void b(ttn ttnVar) {
        this.a = ttnVar.g;
        this.b = ttnVar.h;
        this.c = ttnVar.i;
        this.d = ttnVar.k;
        this.e = ttnVar.l;
        this.f = ttnVar.m;
        this.g = ttnVar.n;
        this.i = ttnVar.o;
        this.h = ttnVar.j;
    }

    public final void c(int i, Object obj) {
        if (obj != null) {
            switch (i - 1) {
                case 0:
                    e((too) obj);
                    break;
                case 1:
                    this.e = ((Float) obj).floatValue();
                    break;
                case 2:
                    this.f = ((Float) obj).floatValue();
                    break;
                case 3:
                    this.g = ((Float) obj).floatValue();
                    break;
                case 4:
                    this.i = (tto) obj;
                    break;
                case 5:
                    this.c = ((Float) obj).floatValue();
                    break;
                case 6:
                    this.d = ((Float) obj).floatValue();
                    break;
                default:
                    this.h = ((Float) obj).floatValue();
                    break;
            }
        }
    }

    public final void d(toi toiVar) {
        this.a = toiVar;
        this.b = tmo.q(toiVar);
    }

    public final void e(too tooVar) {
        this.b = tooVar;
        this.a = tmo.p(tooVar);
    }

    public ttl() {
        this.h = 30.0f;
        this.i = tto.a;
    }
}
