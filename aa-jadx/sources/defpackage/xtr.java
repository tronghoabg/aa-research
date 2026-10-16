package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class xtr implements defpackage.xud {
    public final java.lang.String b;

    public xtr(java.lang.String str) {
        this.b = str;
    }

    @Override // defpackage.xud
    public java.lang.String a() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return defpackage.afga.f(a(), ((defpackage.xtr) obj).a());
    }

    public final int hashCode() {
        return a().hashCode() * 31;
    }

    public java.lang.String toString() {
        return "FloatArrayUniform(name='" + a() + "')";
    }
}
