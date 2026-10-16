package defpackage;

/* loaded from: classes3.dex */
public final class xsu implements xsy {
    private final String a = "inCachedNoiseTexture";

    @Override // defpackage.xsy
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return affa.f(this.a, ((xsu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "ShaderUniform(name='" + this.a + "')";
    }
}
