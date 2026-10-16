package defpackage;

import android.content.Context;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class sxy {
    public final qnj a;
    public final Context b;
    public final sxs c;
    public yfq d;
    public final yfq e;
    public final yfy f;
    public final sxw g;
    public final boolean h;
    public final boolean i;

    public sxy(sxx sxxVar) {
        this.a = sxxVar.a;
        Context context = sxxVar.b;
        context.getClass();
        this.b = context;
        sxs sxsVar = sxxVar.c;
        sxsVar.getClass();
        this.c = sxsVar;
        this.d = sxxVar.d;
        this.e = sxxVar.e;
        this.f = yfy.j(sxxVar.f);
        this.g = sxxVar.g;
        this.h = sxxVar.h;
        this.i = sxxVar.i;
    }

    public final sxu a(qnl qnlVar) {
        sxu sxuVar = (sxu) this.f.get(qnlVar);
        return sxuVar == null ? new sxu(qnlVar, 2) : sxuVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @ResultIgnorabilityUnspecified
    public final yfq b() {
        yfq yfqVar = this.d;
        if (yfqVar != null) {
            return yfqVar;
        }
        rjg rjgVar = new rjg(this.b);
        try {
            yfq yfqVarO = yfq.o((List) ((zeu) zfb.f(((wgx) rjgVar.a).c(), new ikj(20), rjgVar.b)).s());
            this.d = yfqVarO;
            return yfqVarO == null ? yls.a : yfqVarO;
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalArgumentException("Retrieval of recent fix data failed", e);
        }
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("entry_point", this.a);
        xxgVarAo.b("context", this.b);
        xxgVarAo.b("appDoctorLogger", this.c);
        xxgVarAo.b("recentFixes", this.d);
        xxgVarAo.b("fixesExecutedThisIteration", this.e);
        xxgVarAo.b("fixStatusesExecutedThisIteration", this.f);
        xxgVarAo.b("currentFixer", this.g);
        xxgVarAo.h("processRestartNeeded", this.h);
        xxgVarAo.h("appRestartNeeded", this.i);
        return xxgVarAo.toString();
    }
}
