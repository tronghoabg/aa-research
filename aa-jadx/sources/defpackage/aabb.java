package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aabb implements defpackage.hrh {
    final /* synthetic */ defpackage.aabe a;
    private final /* synthetic */ int b;

    public aabb(defpackage.aabe aabeVar, int i) {
        this.b = i;
        this.a = aabeVar;
    }

    @Override // defpackage.hrh
    public final /* synthetic */ void b(java.lang.Object obj) {
        int i = this.b;
        if (i == 0) {
            java.lang.String strReplace = ((java.lang.String) obj).replace("[", "").replace("]", "").replace("\"", "").replace(",", ", ");
            defpackage.aabe aabeVar = this.a;
            aabeVar.n = ("©" + aabeVar.e.get(1) + " " + strReplace).trim();
            aabeVar.c();
            return;
        }
        defpackage.aabe aabeVar2 = this.a;
        if (i != 1) {
            aabeVar2.o = (android.graphics.Bitmap) obj;
            if (aabeVar2.h.a) {
                aabeVar2.c();
                return;
            }
            return;
        }
        aabeVar2.m = (android.graphics.Bitmap) obj;
        defpackage.zug zugVar = aabeVar2.h;
        if (zugVar == null || !zugVar.a) {
            aabeVar2.c();
        }
    }
}
