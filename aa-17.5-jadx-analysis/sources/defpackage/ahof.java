package defpackage;

/* loaded from: classes3.dex */
final class ahof {
    private final int number;
    private final Object object;

    public ahof(Object obj, int i) {
        this.object = obj;
        this.number = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ahof)) {
            return false;
        }
        ahof ahofVar = (ahof) obj;
        return this.object == ahofVar.object && this.number == ahofVar.number;
    }

    public int hashCode() {
        return (System.identityHashCode(this.object) * 65535) + this.number;
    }
}
