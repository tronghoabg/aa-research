package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class atj extends defpackage.cyc<defpackage.atk> {
    private final boolean a;

    public atj(boolean z) {
        this.a = z;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.atk(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.atk atkVar = (defpackage.atk) cgeVar;
        atkVar.a = 1.0f;
        atkVar.b = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.atj ? (defpackage.atj) obj : null) != null && this.a == ((defpackage.atj) obj).a;
    }

    public final int hashCode() {
        return (-1333788672) + (true != this.a ? 1237 : 1231);
    }
}
