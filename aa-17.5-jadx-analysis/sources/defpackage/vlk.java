package defpackage;

/* loaded from: classes.dex */
public final class vlk {
    public final int a;
    public final int b;
    public final boolean c;

    public vlk(byte[] bArr) {
        this.a = 11;
        this.b = 2;
        this.c = true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vlk) {
            vlk vlkVar = (vlk) obj;
            if (this.a == vlkVar.a && this.b == vlkVar.b && this.c == vlkVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ ((this.a ^ (-721379959)) * 1000003)) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "PrimesThreadsConfigurations{primesExecutorService=null, primesMetricExecutorPriority=" + this.a + ", primesMetricExecutorPoolSize=" + this.b + ", enableDeferredTasks=" + this.c + "}";
    }

    public vlk() {
        throw null;
    }
}
