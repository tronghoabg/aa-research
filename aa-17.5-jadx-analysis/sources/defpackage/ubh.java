package defpackage;

/* loaded from: classes3.dex */
public abstract class ubh {
    private final plf a;

    public ubh(pkx pkxVar, ple pleVar) {
        this.a = new ubg(this, pkxVar, pleVar);
    }

    protected abstract ubi a();

    protected final ubi b() {
        plf plfVar = this.a;
        ubi ubiVar = (ubi) plfVar.b();
        ubiVar.k = plfVar;
        return ubiVar;
    }
}
