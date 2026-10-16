package defpackage;

/* loaded from: classes.dex */
public final class awu extends cxt<aww> {
    private final boolean a;
    private final afeg b;
    private final Object c;
    private final int d;

    public awu(int i, boolean z, afeg afegVar, Object obj) {
        this.d = i;
        this.a = z;
        this.b = afegVar;
        this.c = obj;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new aww(this.d, this.a, this.b);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        aww awwVar = (aww) cfxVar;
        awwVar.c = this.d;
        awwVar.a = this.a;
        awwVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        awu awuVar = (awu) obj;
        return this.d == awuVar.d && this.a == awuVar.a && affa.f(this.c, awuVar.c);
    }

    public final int hashCode() {
        return (((this.d * 31) + (true != this.a ? 1237 : 1231)) * 31) + this.c.hashCode();
    }
}
