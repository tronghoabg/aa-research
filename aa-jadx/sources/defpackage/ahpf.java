package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahpf {
    private final int number;
    private final java.lang.Object object;

    public ahpf(java.lang.Object obj, int i) {
        this.object = obj;
        this.number = i;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ahpf)) {
            return false;
        }
        defpackage.ahpf ahpfVar = (defpackage.ahpf) obj;
        return this.object == ahpfVar.object && this.number == ahpfVar.number;
    }

    public int hashCode() {
        return (java.lang.System.identityHashCode(this.object) * 65535) + this.number;
    }
}
