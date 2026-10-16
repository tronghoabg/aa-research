package defpackage;

import android.util.Log;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zym implements zxp {
    public static final String a = "zym";
    public final xyc b;
    public final zrt c;
    public final CopyOnWriteArrayList d;
    public String e;
    public String f;
    public int g;
    private final Executor h;

    public zym(xyc xycVar) {
        Executor executorB = zrz.b();
        zrt zrtVar = zrt.a;
        zkt.n(xycVar, "drd");
        this.b = xycVar;
        this.h = executorB;
        zkt.n(zrtVar, "uiThreadChecker");
        this.c = zrtVar;
        this.d = new CopyOnWriteArrayList();
        this.g = 1;
        this.e = "";
        this.f = "";
    }

    public final void a() {
        this.c.a();
        String str = a;
        if (zrn.e(str, 4)) {
            int i = this.g;
            String str2 = i != 1 ? i != 2 ? i != 3 ? "null" : "QUOTA_EXCEEDED" : "BLOCKED" : "OK";
            if (i == 0) {
                throw null;
            }
            Log.i(str, String.format("maybeDisableInstancesOnUiThread(%s)", str2));
        }
        int i2 = this.g;
        if (i2 == 0) {
            throw null;
        }
        if (i2 == 1) {
            return;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            zyg zygVar = (zyg) it.next();
            String str3 = this.e;
            String str4 = this.f;
            zygVar.b.a();
            if (!zygVar.g) {
                zygVar.g = true;
                zygVar.h = str3;
                zrn.b(str3);
                zuu zuuVar = zygVar.e;
                zuuVar.a(str4);
                zygVar.E();
                ((View) zygVar.a).setVisibility(4);
                ((View) zygVar.c.a).setVisibility(4);
                zuuVar.a.setVisibility(0);
            }
        }
    }

    @Override // defpackage.zxp
    public final void c(zxq zxqVar) {
        String str = a;
        int i = 4;
        if (zrn.e(str, 4)) {
            Log.i(str, a.bW(zxqVar, "onQuotaResponse(", ")"));
        }
        this.h.execute(new zww(this, zxqVar, i));
    }
}
