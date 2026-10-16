package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qmr extends defpackage.qlz {
    public java.lang.String a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public boolean e;
    public boolean f;

    @Override // defpackage.qlz
    public final /* bridge */ /* synthetic */ void b(defpackage.qlz qlzVar) {
        defpackage.qmr qmrVar = (defpackage.qmr) qlzVar;
        if (!android.text.TextUtils.isEmpty(this.a)) {
            qmrVar.a = this.a;
        }
        if (!android.text.TextUtils.isEmpty(this.b)) {
            qmrVar.b = this.b;
        }
        if (!android.text.TextUtils.isEmpty(this.c)) {
            qmrVar.c = this.c;
        }
        if (!android.text.TextUtils.isEmpty(this.d)) {
            qmrVar.d = this.d;
        }
        if (this.e) {
            qmrVar.e = true;
        }
        if (this.f) {
            qmrVar.f = true;
        }
    }

    public final java.lang.String toString() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("hitType", this.a);
        map.put("clientId", this.b);
        map.put("userId", this.c);
        map.put("androidAdId", this.d);
        map.put("AdTargetingEnabled", java.lang.Boolean.valueOf(this.e));
        map.put("sessionControl", null);
        map.put("nonInteraction", java.lang.Boolean.valueOf(this.f));
        map.put("sampleRate", java.lang.Double.valueOf(0.0d));
        return defpackage.qlz.a(map, 0);
    }
}
