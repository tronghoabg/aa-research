package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class sxx {
    public qnj a;
    public Context b;
    public sxs c;
    public yfq d;
    public yfq e;
    public final Map f;
    public sxw g;
    public boolean h;
    public boolean i;

    /* JADX WARN: Multi-variable type inference failed */
    public sxx(sxy sxyVar) {
        this.a = qnj.UNKNOWN;
        int i = yfq.d;
        this.e = yls.a;
        this.f = new HashMap();
        this.a = sxyVar.a;
        this.b = sxyVar.b;
        this.c = sxyVar.c;
        this.d = sxyVar.d;
        this.e = sxyVar.e;
        yfq yfqVarD = sxyVar.f.values().d();
        for (int i2 = 0; i2 < yfqVarD.size(); i2++) {
            sxu sxuVar = (sxu) yfqVarD.get(i2);
            this.f.put(sxuVar.a, sxuVar);
        }
        this.g = sxyVar.g;
        this.h = sxyVar.h;
        this.i = sxyVar.i;
    }

    public final sxy a() {
        woy.aa(this.a != qnj.UNKNOWN, "Entry Point must be set.");
        if (this.c == null) {
            Log.w("AppDoctorFixerContext", "No AppDoctorLogger set.");
            this.c = new syb();
        }
        return new sxy(this);
    }

    public final void b(sxu sxuVar) {
        this.f.put(sxuVar.a, sxuVar);
    }

    public final void c() {
        this.i = true;
    }

    public final void d(sxt sxtVar, int i) {
        Map map = this.f;
        qnl qnlVar = sxtVar.a;
        if (map.containsKey(qnlVar)) {
            int i2 = i - 2;
            b(new sxu(qnlVar, i2 != 2 ? i2 != 4 ? 3 : 6 : 5));
        } else {
            throw new IllegalArgumentException("Status of '" + sxtVar.b() + "' cannot be updated since no original status was set.");
        }
    }

    public sxx() {
        this.a = qnj.UNKNOWN;
        int i = yfq.d;
        this.e = yls.a;
        this.f = new HashMap();
        this.d = null;
    }
}
