package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class syq {
    public final Executor a;
    public final lau b;
    public final wyd c;
    public final wyd d;

    public syq(wyd wydVar, wyd wydVar2, lau lauVar, Executor executor) {
        wydVar2.getClass();
        executor.getClass();
        this.d = wydVar;
        this.c = wydVar2;
        this.b = lauVar;
        this.a = executor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syq)) {
            return false;
        }
        syq syqVar = (syq) obj;
        return affa.f(this.d, syqVar.d) && affa.f(this.c, syqVar.c) && affa.f(this.b, syqVar.b) && affa.f(this.a, syqVar.a);
    }

    public final int hashCode() {
        return (((((this.d.hashCode() * 31) + this.c.hashCode()) * 31) + this.b.hashCode()) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "TransportParams(assistantCallbacks=" + this.d + ", gearheadFlags=" + this.c + ", gearheadLogger=" + this.b + ", backgroundExecutor=" + this.a + ")";
    }
}
