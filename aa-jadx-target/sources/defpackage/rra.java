package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rra {
    public final defpackage.yhx a;

    public rra(defpackage.yhx yhxVar) {
        if (yhxVar == null) {
            throw new java.lang.NullPointerException("Null batchKeys");
        }
        this.a = yhxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rra) {
            return this.a.equals(((defpackage.rra) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "UiEventBatchConfig{batchKeys=[%s]}", defpackage.ysr.am(this.a, new defpackage.ikt(16)));
    }

    public rra() {
        throw null;
    }
}
