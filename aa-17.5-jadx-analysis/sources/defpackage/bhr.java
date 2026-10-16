package defpackage;

/* loaded from: classes.dex */
public final class bhr extends cxt<bhu> {
    private final afdr a;

    public bhr(afdr afdrVar) {
        this.a = afdrVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new bhu(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((bhu) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhr) && this.a == ((bhr) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
