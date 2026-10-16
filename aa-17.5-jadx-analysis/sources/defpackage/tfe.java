package defpackage;

/* loaded from: classes.dex */
public final class tfe implements acku {
    private final acku a;
    private final /* synthetic */ int b;

    public tfe(acku ackuVar, int i) {
        this.b = i;
        this.a = ackuVar;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        int i = this.b;
        return b();
    }

    public final xxh b() {
        if (this.b == 0) {
            return new xxm(this.a);
        }
        Object objA = this.a.a();
        objA.getClass();
        return new xxm(objA);
    }
}
