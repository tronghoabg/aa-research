package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class vwq extends woy implements vqa, vsa {
    public static final long a;
    public final vry b;
    public final Context c;
    public final ackk d;
    public final vxy e;
    private final vqe f;
    private final Executor g;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        a = 43200000L;
    }

    public vwq(wci wciVar, Context context, vqe vqeVar, Executor executor, ackk ackkVar, vxy vxyVar, aezk aezkVar) {
        super(null, null);
        this.b = wciVar.d(executor, ackkVar, aezkVar);
        this.g = executor;
        this.c = context;
        this.d = ackkVar;
        this.e = vxyVar;
        this.f = vqeVar;
    }

    @Override // defpackage.vqa
    public final void g(vky vkyVar) {
        this.f.b(this);
        wub.ad(new zfj() { // from class: vwp
            /* JADX WARN: Removed duplicated region for block: B:74:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:83:0x00ed A[SYNTHETIC] */
            @Override // defpackage.zfj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final defpackage.zgp a() throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
                /*
                    Method dump skipped, instructions count: 717
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.vwp.a():zgp");
            }
        }, this.g);
    }

    @Override // defpackage.vsa
    public final void k() {
        this.f.a(this);
    }

    @Override // defpackage.vqa
    public final /* synthetic */ void j(vky vkyVar) {
    }
}
