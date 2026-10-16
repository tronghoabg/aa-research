package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rhm {
    final defpackage.rhk a;
    final j$.time.Duration b;
    final int c;
    final defpackage.rhk d;
    final j$.time.Duration e;
    int f;

    public rhm(defpackage.rhk rhkVar) {
        this.f = 0;
        this.a = rhkVar;
        this.b = j$.time.Duration.ZERO;
        this.c = 0;
        this.d = defpackage.rhk.STATE_INITIAL;
        this.e = j$.time.Duration.ZERO;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String hexString = java.lang.Integer.toHexString(hashCode());
        int i = this.c;
        j$.time.Duration duration = this.b;
        java.lang.String strName = this.a.name();
        java.lang.String strValueOf = java.lang.String.valueOf(duration);
        int i2 = this.f;
        if (i > 0) {
            defpackage.rhk rhkVar = this.d;
            j$.time.Duration duration2 = this.e;
            str = ", nextStateAfterMax=" + rhkVar.name() + ", delayMsAfterMax=" + java.lang.String.valueOf(duration2);
        } else {
            str = "";
        }
        return "Transition@" + hexString + "[nextState=" + strName + ", delay=" + strValueOf + ", maxCount=" + i + ", count=" + i2 + str + "]";
    }

    public rhm(defpackage.rhk rhkVar, j$.time.Duration duration, int i, defpackage.rhk rhkVar2, j$.time.Duration duration2) {
        this.f = 0;
        this.a = rhkVar;
        this.b = duration;
        this.c = i;
        this.d = rhkVar2;
        this.e = duration2;
    }

    public rhm(defpackage.rhk rhkVar, j$.time.Duration duration) {
        this.f = 0;
        this.a = rhkVar;
        this.b = duration;
        this.c = 0;
        this.d = defpackage.rhk.STATE_INITIAL;
        this.e = j$.time.Duration.ZERO;
    }
}
