package defpackage;

/* loaded from: classes3.dex */
public final class afmp extends afmr {
    public static final afmp INSTANCE = new afmp();

    private afmp() {
        super(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afmp)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return -1427933141;
    }

    public String toString() {
        return "JavaSignature";
    }
}
