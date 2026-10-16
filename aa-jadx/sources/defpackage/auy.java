package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class auy extends defpackage.cge implements defpackage.czh {
    public defpackage.awu b;
    public defpackage.awu c;

    public auy() {
        defpackage.auj aujVar = defpackage.aww.a;
        this.b = aujVar;
        this.c = aujVar;
    }

    private final void f() {
        defpackage.dai.q(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new defpackage.aun(this, 5));
    }

    public abstract defpackage.awu b(defpackage.awu awuVar);

    public void d() {
        this.c = b(this.b);
        f();
    }

    @Override // defpackage.cge
    public final void du() {
        this.b = defpackage.aww.a;
    }

    @Override // defpackage.czh
    public final java.lang.Object dx() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // defpackage.cge
    public void dz() {
        defpackage.dai.o(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new defpackage.aun(this, 6));
        d();
    }

    @Override // defpackage.cge
    public void q() {
        this.c = this.b;
        f();
    }
}
