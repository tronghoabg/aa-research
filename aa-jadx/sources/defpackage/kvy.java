package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kvy {
    public final j$.time.Duration a;
    private final boolean b;

    public /* synthetic */ kvy(byte[] bArr) {
        this.a = defpackage.ysr.cE(2);
        this.b = true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.kvy)) {
            return false;
        }
        defpackage.kvy kvyVar = (defpackage.kvy) obj;
        if (!defpackage.afga.f(this.a, kvyVar.a)) {
            return false;
        }
        boolean z = kvyVar.b;
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1231;
    }

    public final java.lang.String toString() {
        return "WhenNotIdle(hideDelay=" + this.a + ", showAtStart=true)";
    }

    public kvy() {
        this(null);
    }
}
