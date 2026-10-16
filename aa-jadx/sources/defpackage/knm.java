package defpackage;

/* JADX INFO: loaded from: classes2.dex */
abstract class knm implements defpackage.kno {
    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.kno) && c() == ((defpackage.kno) obj).c();
    }

    public final int hashCode() {
        return c();
    }
}
