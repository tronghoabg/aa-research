package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qmj extends defpackage.qlz {
    public java.lang.String a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public java.lang.String e;
    public java.lang.String f;
    public java.lang.String g;
    public java.lang.String h;
    public java.lang.String i;
    public java.lang.String j;

    @Override // defpackage.qlz
    public final /* bridge */ /* synthetic */ void b(defpackage.qlz qlzVar) {
        defpackage.qmj qmjVar = (defpackage.qmj) qlzVar;
        if (!android.text.TextUtils.isEmpty(this.a)) {
            qmjVar.a = this.a;
        }
        if (!android.text.TextUtils.isEmpty(this.b)) {
            qmjVar.b = this.b;
        }
        if (!android.text.TextUtils.isEmpty(this.c)) {
            qmjVar.c = this.c;
        }
        if (!android.text.TextUtils.isEmpty(this.d)) {
            qmjVar.d = this.d;
        }
        if (!android.text.TextUtils.isEmpty(this.e)) {
            qmjVar.e = this.e;
        }
        if (!android.text.TextUtils.isEmpty(this.f)) {
            qmjVar.f = this.f;
        }
        if (!android.text.TextUtils.isEmpty(this.g)) {
            qmjVar.g = this.g;
        }
        if (!android.text.TextUtils.isEmpty(this.h)) {
            qmjVar.h = this.h;
        }
        if (!android.text.TextUtils.isEmpty(this.i)) {
            qmjVar.i = this.i;
        }
        if (android.text.TextUtils.isEmpty(this.j)) {
            return;
        }
        qmjVar.j = this.j;
    }

    public final java.lang.String toString() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("name", this.a);
        map.put("source", this.b);
        map.put("medium", this.c);
        map.put("keyword", this.d);
        map.put("content", this.e);
        map.put("id", this.f);
        map.put("adNetworkId", this.g);
        map.put("gclid", this.h);
        map.put("dclid", this.i);
        map.put("aclid", this.j);
        return defpackage.qlz.a(map, 0);
    }
}
