package defpackage;

/* loaded from: classes.dex */
public final class biz extends cxt<bja> {
    private final bld a;
    private final long b;
    private final afdr c;

    public biz(bld bldVar, long j, afdr afdrVar) {
        this.a = bldVar;
        this.b = j;
        this.c = afdrVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new bja(this.a, this.b, this.c);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        bja bjaVar = (bja) cfxVar;
        bld bldVar = bjaVar.a;
        bld bldVar2 = this.a;
        boolean zF = affa.f(bldVar2, bldVar);
        bjaVar.a = bldVar2;
        bjaVar.b = this.b;
        bjaVar.c = this.c;
        if (!zF) {
            bjaVar.d = bjaVar.b();
            bjaVar.e = bjaVar.d();
        }
        bjaVar.f.u();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof biz)) {
            return false;
        }
        biz bizVar = (biz) obj;
        return affa.f(this.a, bizVar.a) && this.b == bizVar.b && this.c == bizVar.c;
    }

    public final int hashCode() {
        long j = this.b;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.a.hashCode()) * 31) + this.c.hashCode();
    }
}
