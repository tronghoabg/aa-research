package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class nis implements afec {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ nis(boolean z, Object obj, int i) {
        this.c = i;
        this.a = z;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [afdr, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        if (this.c != 0) {
            cks cksVar = (cks) obj;
            aft aftVar = acl.a;
            cksVar.s(!this.a && ((Boolean) this.b.invoke()).booleanValue());
            return afak.a;
        }
        cie cieVar = (cie) obj;
        cieVar.getClass();
        cieVar.a(this.a && ((Boolean) this.b.a()).booleanValue());
        return afak.a;
    }
}
