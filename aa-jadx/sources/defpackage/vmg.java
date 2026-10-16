package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vmg {
    public final int a;
    public final int b;
    public final boolean c;

    public vmg(byte[] bArr) {
        this.a = 11;
        this.b = 2;
        this.c = true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vmg) {
            defpackage.vmg vmgVar = (defpackage.vmg) obj;
            if (this.a == vmgVar.a && this.b == vmgVar.b && this.c == vmgVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ ((this.a ^ (-721379959)) * 1000003)) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return "PrimesThreadsConfigurations{primesExecutorService=null, primesMetricExecutorPriority=" + this.a + ", primesMetricExecutorPoolSize=" + this.b + ", enableDeferredTasks=" + this.c + "}";
    }

    public vmg() {
        throw null;
    }
}
