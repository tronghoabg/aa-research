package defpackage;

/* loaded from: classes.dex */
public final class alk extends cxt<alf> {
    private final alh a;
    private final boolean b = false;
    private final boolean c = true;

    public alk(alh alhVar) {
        this.a = alhVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new alf(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        alf alfVar = (alf) cfxVar;
        alfVar.a = this.a;
        alfVar.b = true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof alk)) {
            return false;
        }
        alk alkVar = (alk) obj;
        if (!affa.f(this.a, alkVar.a)) {
            return false;
        }
        boolean z = alkVar.b;
        boolean z2 = alkVar.c;
        return true;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 1237) * 31) + 1231;
    }
}
