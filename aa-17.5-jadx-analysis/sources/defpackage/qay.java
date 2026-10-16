package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class qay {
    public static final yob a = yob.c("com/google/android/apps/gmm/userevent3/reporter/fpsprofiler/FpsProfiler");
    public final tmb b;
    public volatile int d;
    public long e;
    public long g;
    public int h;
    public int i;
    public int k;
    public int l;
    public int m;
    public int n;
    public final san o;
    public final int[] c = new int[100];
    public long f = -1;
    public final Set j = yrm.t();

    public qay(qax qaxVar, tmb tmbVar, erb erbVar) {
        this.b = tmbVar;
        this.o = new san(null, 1);
        ((ynz) ((ynz) a.f()).ai(6987)).M("FpsProfiler %s created on %s", qaxVar, Thread.currentThread().getName());
    }

    public final void a(qaw qawVar) {
        this.j.add(qawVar);
    }
}
