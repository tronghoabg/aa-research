package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class qls extends qle {
    public String a;
    public int b;
    public int c;

    @Override // defpackage.qle
    public final /* bridge */ /* synthetic */ void b(qle qleVar) {
        qls qlsVar = (qls) qleVar;
        int i = this.b;
        if (i != 0) {
            qlsVar.b = i;
        }
        int i2 = this.c;
        if (i2 != 0) {
            qlsVar.c = i2;
        }
        if (TextUtils.isEmpty(this.a)) {
            return;
        }
        qlsVar.a = this.a;
    }

    public final String toString() {
        HashMap map = new HashMap();
        map.put("language", this.a);
        map.put("screenColors", 0);
        map.put("screenWidth", Integer.valueOf(this.b));
        map.put("screenHeight", Integer.valueOf(this.c));
        map.put("viewportWidth", 0);
        map.put("viewportHeight", 0);
        return qle.a(map, 0);
    }
}
