package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class wdh implements defpackage.zgn {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ wdh(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, zhs] */
    @Override // defpackage.zgn
    public final defpackage.zhs a(java.lang.Object obj) {
        if (this.c != 0) {
            defpackage.siu siuVar = (defpackage.siu) obj;
            ?? r0 = this.b;
            if (siuVar != null) {
                return r0;
            }
            defpackage.zhs zhsVar = ((defpackage.sim) this.a).k;
            return zhsVar == null ? defpackage.zho.a : zhsVar;
        }
        int i = ((defpackage.wbu) obj).a;
        if ((i == 29501 || i == 29537 || i == 29538 || i == 29539 || i == 29540 || i == 29541 || i == 29542 || i == 29543 || i == 29544 || i == 29547) && ((defpackage.wei) this.b).b()) {
            ((defpackage.wdn) this.a).b();
        }
        return defpackage.zho.a;
    }
}
