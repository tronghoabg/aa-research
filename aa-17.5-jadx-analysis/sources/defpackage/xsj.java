package defpackage;

/* loaded from: classes3.dex */
public final class xsj extends xsm {
    public final String a;

    public xsj(String str) {
        super(str);
        this.a = str;
    }

    @Override // defpackage.xsm, defpackage.xsy
    public final String a() {
        return this.a;
    }

    @Override // defpackage.xsm
    public final String toString() {
        return "DpArrayUniform(name='" + this.a + "')";
    }
}
