package defpackage;

/* loaded from: classes.dex */
public final class ahb implements agq {
    private final int a;
    private final int b;
    private final aes c;
    private final agt d;

    public ahb(int i, int i2, aes aesVar) {
        this.a = i;
        this.b = i2;
        this.c = aesVar;
        this.d = new agt(new afb(i, i2, aesVar));
    }

    @Override // defpackage.agn
    public final /* synthetic */ long a(aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return afp.n(this);
    }

    @Override // defpackage.agn
    public final /* synthetic */ aei b(aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return d(afp.n(this), aeiVar, aeiVar2, aeiVar3);
    }

    @Override // defpackage.agn
    public final aei c(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return this.d.c(j, aeiVar, aeiVar2, aeiVar3);
    }

    @Override // defpackage.agn
    public final aei d(long j, aei aeiVar, aei aeiVar2, aei aeiVar3) {
        return this.d.d(j, aeiVar, aeiVar2, aeiVar3);
    }

    @Override // defpackage.agn
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.agq
    public final int f() {
        return this.b;
    }

    @Override // defpackage.agq
    public final int g() {
        return this.a;
    }
}
