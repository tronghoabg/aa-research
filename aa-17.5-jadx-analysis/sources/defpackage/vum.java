package defpackage;

/* loaded from: classes3.dex */
public final class vum implements vqu {
    private final int a;
    private final int b;

    public vum(byte[] bArr) {
        this.b = 2;
        this.a = 10;
    }

    @Override // defpackage.vqu
    public final int a() {
        return this.a;
    }

    @Override // defpackage.vqu
    public final /* synthetic */ aezk b() {
        return null;
    }

    @Override // defpackage.vqu
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vum)) {
            return false;
        }
        vum vumVar = (vum) obj;
        int i = this.b;
        int i2 = vumVar.b;
        if (i != 0) {
            return i == i2 && this.a == vumVar.a;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        a.aJ(i);
        return ((this.a ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "JankConfigurations{enablement=" + vqv.a(this.b) + ", rateLimitPerSecond=" + this.a + ", perfettoMustBeExplicitlyTriggered=false}";
    }

    public vum() {
        throw null;
    }
}
