package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class qlo extends qle {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    @Override // defpackage.qle
    public final /* bridge */ /* synthetic */ void b(qle qleVar) {
        qlo qloVar = (qlo) qleVar;
        if (!TextUtils.isEmpty(this.a)) {
            qloVar.a = this.a;
        }
        if (!TextUtils.isEmpty(this.b)) {
            qloVar.b = this.b;
        }
        if (!TextUtils.isEmpty(this.c)) {
            qloVar.c = this.c;
        }
        if (!TextUtils.isEmpty(this.d)) {
            qloVar.d = this.d;
        }
        if (!TextUtils.isEmpty(this.e)) {
            qloVar.e = this.e;
        }
        if (!TextUtils.isEmpty(this.f)) {
            qloVar.f = this.f;
        }
        if (!TextUtils.isEmpty(this.g)) {
            qloVar.g = this.g;
        }
        if (!TextUtils.isEmpty(this.h)) {
            qloVar.h = this.h;
        }
        if (!TextUtils.isEmpty(this.i)) {
            qloVar.i = this.i;
        }
        if (TextUtils.isEmpty(this.j)) {
            return;
        }
        qloVar.j = this.j;
    }

    public final String toString() {
        HashMap map = new HashMap();
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
        return qle.a(map, 0);
    }
}
