package defpackage;

/* loaded from: classes2.dex */
public final class ohf {
    public final dyn a;
    public boolean b = false;
    public boolean c = false;

    public ohf(dyn dynVar) {
        this.a = dynVar;
    }

    public final void a() {
        this.b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohf)) {
            return false;
        }
        ohf ohfVar = (ohf) obj;
        return affa.f(this.a, ohfVar.a) && this.b == ohfVar.b && this.c == ohfVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.f(this.b)) * 31) + a.f(this.c);
    }

    public final String toString() {
        return "VoipCallSilenceState(extensionRemote=" + this.a + ", usesCallSilence=" + this.b + ", currentSilenceState=" + this.c + ")";
    }
}
