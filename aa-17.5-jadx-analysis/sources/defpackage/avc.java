package defpackage;

/* loaded from: classes.dex */
public final class avc extends cxt<avd> {
    private final int a;

    public avc(int i) {
        this.a = i;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new avd(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        avd avdVar = (avd) cfxVar;
        avdVar.b = this.a;
        avdVar.a = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        avc avcVar = obj instanceof avc ? (avc) obj : null;
        return avcVar != null && this.a == avcVar.a;
    }

    public final int hashCode() {
        return (this.a * 31) + 1231;
    }
}
