package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class qln extends qle {
    public String a;
    public String b;
    public String c;
    public String d;

    @Override // defpackage.qle
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(qln qlnVar) {
        if (!TextUtils.isEmpty(this.a)) {
            qlnVar.a = this.a;
        }
        if (!TextUtils.isEmpty(this.b)) {
            qlnVar.b = this.b;
        }
        if (!TextUtils.isEmpty(this.c)) {
            qlnVar.c = this.c;
        }
        if (TextUtils.isEmpty(this.d)) {
            return;
        }
        qlnVar.d = this.d;
    }

    public final String toString() {
        HashMap map = new HashMap();
        map.put("appName", this.a);
        map.put("appVersion", this.b);
        map.put("appId", this.c);
        map.put("appInstallerId", this.d);
        return qle.a(map, 0);
    }
}
