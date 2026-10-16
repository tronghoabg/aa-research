package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class zxh {
    public static final tmb a = new tme();
    public final Context b;
    public final xyc c;
    public final zyb d;
    public final ExecutorService e;
    public final tmb f;
    public long g;
    public long h;
    public final uxn i;
    public long j;
    public int o = 1;
    public boolean k = false;
    boolean l = false;
    boolean m = false;
    public int n = 0;

    public zxh(xyc xycVar, zyb zybVar, ExecutorService executorService, tmb tmbVar, Context context, uxn uxnVar) {
        this.c = xycVar;
        this.d = zybVar;
        this.e = executorService;
        this.f = tmbVar;
        this.b = context;
        this.i = uxnVar;
    }

    public final void a() {
        if (this.k && this.l && this.m) {
            this.o = 1;
            this.k = false;
            this.l = false;
            this.m = false;
        }
    }
}
