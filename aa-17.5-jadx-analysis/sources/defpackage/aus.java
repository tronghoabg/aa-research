package defpackage;

/* loaded from: classes.dex */
public abstract class aus extends cfx implements cyz {
    public awo b;
    public awo c;

    public aus() {
        aue aueVar = awq.a;
        this.b = aueVar;
        this.c = aueVar;
    }

    private final void f() {
        czz.q(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new aui(this, 5));
    }

    public abstract awo b(awo awoVar);

    public void d() {
        this.c = b(this.b);
        f();
    }

    @Override // defpackage.cfx
    public final void em() {
        this.b = awq.a;
    }

    @Override // defpackage.cyz
    public final Object ep() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // defpackage.cfx
    public void er() {
        czz.o(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new aui(this, 6));
        d();
    }

    @Override // defpackage.cfx
    public void q() {
        this.c = this.b;
        f();
    }
}
