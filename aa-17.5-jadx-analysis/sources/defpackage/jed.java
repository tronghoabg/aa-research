package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public class jed extends Exception {
    public final boolean a;

    public jed(byte[] bArr) {
        this.a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jed)) {
            return false;
        }
        jed jedVar = (jed) obj;
        return this.a == jedVar.a && Objects.equals(getCause(), jedVar.getCause());
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), getCause());
    }

    public jed() {
        throw null;
    }

    public jed(boolean z, Exception exc) {
        super(exc);
        this.a = z;
    }
}
