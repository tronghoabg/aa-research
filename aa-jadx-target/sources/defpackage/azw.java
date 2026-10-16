package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class azw {
    public final int a;
    public final java.util.List b = new java.util.ArrayList();
    final /* synthetic */ defpackage.azy c;

    public azw(defpackage.azy azyVar, int i) {
        this.c = azyVar;
        this.a = i;
    }

    public final void a(int i) {
        defpackage.azy azyVar = this.c;
        defpackage.skd skdVar = azyVar.f;
        if (skdVar == null) {
            return;
        }
        java.util.List list = this.b;
        defpackage.epq epqVar = azyVar.e;
        java.lang.Object obj = skdVar.c;
        if (obj instanceof defpackage.ayi) {
        }
        list.add(new defpackage.bal(skdVar, i, epqVar, null));
    }
}
