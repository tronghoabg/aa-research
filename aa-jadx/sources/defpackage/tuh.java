package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tuh {
    public defpackage.tpg a;
    public defpackage.tpm b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public defpackage.tuk i;

    public tuh(defpackage.tuj tujVar) {
        this.h = 30.0f;
        this.i = defpackage.tuk.a;
        this.a = tujVar.g;
        this.b = tujVar.h;
        this.c = tujVar.i;
        this.d = tujVar.k;
        this.e = tujVar.l;
        this.f = tujVar.m;
        this.g = tujVar.n;
        this.i = tujVar.o;
        this.h = tujVar.j;
    }

    public final defpackage.tuj a() {
        return new defpackage.tuj(this.a, this.e, this.f, this.g, this.i, this.c, this.d, this.h);
    }

    public final void b(defpackage.tuj tujVar) {
        this.a = tujVar.g;
        this.b = tujVar.h;
        this.c = tujVar.i;
        this.d = tujVar.k;
        this.e = tujVar.l;
        this.f = tujVar.m;
        this.g = tujVar.n;
        this.i = tujVar.o;
        this.h = tujVar.j;
    }

    public final void c(int i, java.lang.Object obj) {
        if (obj != null) {
            switch (i - 1) {
                case 0:
                    e((defpackage.tpm) obj);
                    break;
                case 1:
                    this.e = ((java.lang.Float) obj).floatValue();
                    break;
                case 2:
                    this.f = ((java.lang.Float) obj).floatValue();
                    break;
                case 3:
                    this.g = ((java.lang.Float) obj).floatValue();
                    break;
                case 4:
                    this.i = (defpackage.tuk) obj;
                    break;
                case 5:
                    this.c = ((java.lang.Float) obj).floatValue();
                    break;
                case 6:
                    this.d = ((java.lang.Float) obj).floatValue();
                    break;
                default:
                    this.h = ((java.lang.Float) obj).floatValue();
                    break;
            }
        }
    }

    public final void d(defpackage.tpg tpgVar) {
        this.a = tpgVar;
        this.b = defpackage.tnm.t(tpgVar);
    }

    public final void e(defpackage.tpm tpmVar) {
        this.b = tpmVar;
        this.a = defpackage.tnm.s(tpmVar);
    }

    public tuh() {
        this.h = 30.0f;
        this.i = defpackage.tuk.a;
    }
}
