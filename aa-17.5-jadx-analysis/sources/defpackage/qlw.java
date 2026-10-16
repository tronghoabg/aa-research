package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class qlw extends qle {
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    @Override // defpackage.qle
    public final /* bridge */ /* synthetic */ void b(qle qleVar) {
        qlw qlwVar = (qlw) qleVar;
        if (!TextUtils.isEmpty(this.a)) {
            qlwVar.a = this.a;
        }
        if (!TextUtils.isEmpty(this.b)) {
            qlwVar.b = this.b;
        }
        if (!TextUtils.isEmpty(this.c)) {
            qlwVar.c = this.c;
        }
        if (!TextUtils.isEmpty(this.d)) {
            qlwVar.d = this.d;
        }
        if (this.e) {
            qlwVar.e = true;
        }
        TextUtils.isEmpty(null);
        if (this.f) {
            qlwVar.f = true;
        }
    }

    public final String toString() {
        HashMap map = new HashMap();
        map.put("hitType", this.a);
        map.put("clientId", this.b);
        map.put("userId", this.c);
        map.put("androidAdId", this.d);
        map.put("AdTargetingEnabled", Boolean.valueOf(this.e));
        map.put("sessionControl", null);
        map.put("nonInteraction", Boolean.valueOf(this.f));
        map.put("sampleRate", Double.valueOf(0.0d));
        return qle.a(map, 0);
    }
}
