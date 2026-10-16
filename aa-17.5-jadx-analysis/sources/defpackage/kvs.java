package defpackage;

import j$.time.Duration;

/* loaded from: classes2.dex */
public final class kvs {
    public final Duration a;
    private final boolean b;

    public /* synthetic */ kvs(byte[] bArr) {
        this.a = wub.an(2);
        this.b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvs)) {
            return false;
        }
        kvs kvsVar = (kvs) obj;
        if (!affa.f(this.a, kvsVar.a)) {
            return false;
        }
        boolean z = kvsVar.b;
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "WhenNotIdle(hideDelay=" + this.a + ", showAtStart=true)";
    }

    public kvs() {
        this(null);
    }
}
