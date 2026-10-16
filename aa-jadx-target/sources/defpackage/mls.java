package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mls implements nmv {
    private final defpackage.odx a;

    public mls(boolean z, defpackage.acbk acbkVar, defpackage.zbe zbeVar) {
        this.a = new defpackage.odx(2132085184, 2131232642, z, acbkVar, zbeVar);
    }

    public final defpackage.nmu a() {
        return defpackage.nmu.a;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        return this.a.a((odj) obj, this);
    }

    public final java.lang.String c() {
        return "settings";
    }

    public final java.lang.String d() {
        return "START_OF_DRIVE_TOOLTIP";
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mls) {
            return j$.util.Objects.equals(this.a, ((defpackage.mls) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hashCode(this.a);
    }
}
