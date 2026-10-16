package defpackage;

/* loaded from: classes.dex */
final class aub extends cxt<auc> {
    private final float a;
    private final int b;

    public aub(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new auc(this.b, this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        auc aucVar = (auc) cfxVar;
        aucVar.b = this.b;
        aucVar.a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aub)) {
            return false;
        }
        aub aubVar = (aub) obj;
        return this.b == aubVar.b && this.a == aubVar.a;
    }

    public final int hashCode() {
        return (this.b * 31) + Float.floatToIntBits(this.a);
    }
}
