package defpackage;

/* loaded from: classes.dex */
public final class ate extends cxt<atf> {
    private final boolean a;

    public ate(boolean z) {
        this.a = z;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new atf(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        atf atfVar = (atf) cfxVar;
        atfVar.a = 1.0f;
        atfVar.b = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ate ? (ate) obj : null) != null && this.a == ((ate) obj).a;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(1.0f) * 31) + (true != this.a ? 1237 : 1231);
    }
}
