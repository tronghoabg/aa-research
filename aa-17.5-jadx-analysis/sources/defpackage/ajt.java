package defpackage;

/* loaded from: classes.dex */
public final class ajt extends cxt<ajw> {
    private final asf a;

    public ajt(asf asfVar) {
        this.a = asfVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new ajw(this.a, 1, null);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((ajw) cfxVar).b(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajt) && affa.f(this.a, ((ajt) obj).a);
    }

    public final int hashCode() {
        asf asfVar = this.a;
        if (asfVar != null) {
            return asfVar.hashCode();
        }
        return 0;
    }
}
