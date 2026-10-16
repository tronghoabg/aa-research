package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qmn extends defpackage.qlz {
    public java.lang.String a;
    public int b;
    public int c;

    @Override // defpackage.qlz
    public final /* bridge */ /* synthetic */ void b(defpackage.qlz qlzVar) {
        defpackage.qmn qmnVar = (defpackage.qmn) qlzVar;
        int i = this.b;
        if (i != 0) {
            qmnVar.b = i;
        }
        int i2 = this.c;
        if (i2 != 0) {
            qmnVar.c = i2;
        }
        if (android.text.TextUtils.isEmpty(this.a)) {
            return;
        }
        qmnVar.a = this.a;
    }

    public final java.lang.String toString() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("language", this.a);
        map.put("screenColors", 0);
        map.put("screenWidth", java.lang.Integer.valueOf(this.b));
        map.put("screenHeight", java.lang.Integer.valueOf(this.c));
        map.put("viewportWidth", 0);
        map.put("viewportHeight", 0);
        return defpackage.qlz.a(map, 0);
    }
}
