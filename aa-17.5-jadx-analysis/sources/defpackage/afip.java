package defpackage;

/* loaded from: classes3.dex */
final class afip implements afec {
    private final afhe a;

    public afip(afhe afheVar) {
        this.a = afheVar;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        return Boolean.valueOf(affa.f((afhe) obj, this.a));
    }
}
