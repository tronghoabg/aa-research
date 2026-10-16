package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qmi extends defpackage.qlz {
    public java.lang.String a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;

    @Override // defpackage.qlz
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(defpackage.qmi qmiVar) {
        if (!android.text.TextUtils.isEmpty(this.a)) {
            qmiVar.a = this.a;
        }
        if (!android.text.TextUtils.isEmpty(this.b)) {
            qmiVar.b = this.b;
        }
        if (!android.text.TextUtils.isEmpty(this.c)) {
            qmiVar.c = this.c;
        }
        if (android.text.TextUtils.isEmpty(this.d)) {
            return;
        }
        qmiVar.d = this.d;
    }

    public final java.lang.String toString() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("appName", this.a);
        map.put("appVersion", this.b);
        map.put("appId", this.c);
        map.put("appInstallerId", this.d);
        return defpackage.qlz.a(map, 0);
    }
}
