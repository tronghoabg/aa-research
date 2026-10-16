package defpackage;

/* loaded from: classes3.dex */
public final class wic {
    public final long a;

    public wic() {
        this.a = System.nanoTime();
    }

    public final abnf a() {
        long jNanoTime = System.nanoTime() - this.a;
        abnp abnpVarN = abnf.a.n();
        abnpVarN.t();
        ((abnf) abnpVarN.b).b = jNanoTime / 1000000000;
        abnpVarN.t();
        ((abnf) abnpVarN.b).c = (int) (jNanoTime % 1000000000);
        return (abnf) abnpVarN.q();
    }

    public final abpt b() {
        abnp abnpVarN = abpt.a.n();
        abnpVarN.t();
        abpt abptVar = (abpt) abnpVarN.b;
        long j = this.a;
        abptVar.b = j / 1000000000;
        abnpVarN.t();
        ((abpt) abnpVarN.b).c = (int) (j % 1000000000);
        return (abpt) abnpVarN.q();
    }

    public wic(long j) {
        this.a = j;
    }
}
