package defpackage;

/* loaded from: classes2.dex */
public final class pcm {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public pcm(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcm)) {
            return false;
        }
        pcm pcmVar = (pcm) obj;
        return this.a == pcmVar.a && this.b == pcmVar.b && this.c == pcmVar.c && this.d == pcmVar.d;
    }

    public final int hashCode() {
        int iF = a.f(this.a);
        boolean z = this.d;
        return (((((iF * 31) + a.f(this.b)) * 31) + a.f(this.c)) * 31) + a.f(z);
    }

    public final String toString() {
        return "HuBluetoothState(aclConnected=" + this.a + ", hfpConnected=" + this.b + ", a2dpConnected=" + this.c + ", isBonded=" + this.d + ")";
    }

    public pcm() {
        this(false, false, false, true);
    }
}
