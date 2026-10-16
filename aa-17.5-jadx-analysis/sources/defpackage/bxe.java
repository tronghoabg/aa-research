package defpackage;

/* loaded from: classes.dex */
public final class bxe {
    public final bvf a;
    public final boolean b;
    public final byi c;
    public final afec d;
    public final boolean e;
    public final Object f;
    public boolean g = true;

    public bxe(bvf bvfVar, Object obj, boolean z, byi byiVar, afec afecVar, boolean z2) {
        this.a = bvfVar;
        this.b = z;
        this.c = byiVar;
        this.d = afecVar;
        this.e = z2;
        this.f = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        buz.a("Unexpected form of a provided value");
        throw new aezp();
    }
}
