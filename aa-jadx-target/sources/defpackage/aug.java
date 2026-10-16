package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aug extends defpackage.cyc<defpackage.auh> {
    private final float a;
    private final int b;

    public aug(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.auh(this.b, this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.auh auhVar = (defpackage.auh) cgeVar;
        auhVar.b = this.b;
        auhVar.a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.aug)) {
            return false;
        }
        defpackage.aug augVar = (defpackage.aug) obj;
        return this.b == augVar.b && this.a == augVar.a;
    }

    public final int hashCode() {
        return (this.b * 31) + java.lang.Float.floatToIntBits(this.a);
    }
}
