package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class juh implements gdo {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ juh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [afdr, java.lang.Object] */
    @Override // defpackage.gdo
    public final boolean a() {
        int i = this.b;
        if (i != 0) {
            ?? r5 = this.a;
            return i != 1 ? ((Boolean) r5.invoke()).booleanValue() : ((jsp) r5).j();
        }
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.PHONE_FACET, yzy.aD).l());
        ((jui) this.a).a.b();
        return true;
    }
}
