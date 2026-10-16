package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afy implements defpackage.aey {
    public final int a;

    public afy(int i) {
        this.a = i;
    }

    @Override // defpackage.afd
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.agx c(defpackage.bil bilVar) {
        return new defpackage.ahg(this.a);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.afy) && ((defpackage.afy) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public afy() {
        this(0);
    }
}
