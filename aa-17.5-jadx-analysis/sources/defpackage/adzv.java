package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class adzv {
    public static final adzv a = new adzv(new adqq[0]);
    public final adqq[] b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public adzv(adqq[] adqqVarArr) {
        this.b = adqqVarArr;
    }

    public static /* synthetic */ void g(adzv adzvVar) {
        int i = 0;
        while (true) {
            adqq[] adqqVarArr = adzvVar.b;
            if (i >= adqqVarArr.length) {
                return;
            }
            adqq adqqVar = adqqVarArr[i];
            i++;
        }
    }

    public static adzv h(adjb[] adjbVarArr, adis adisVar) {
        adzv adzvVar = new adzv(adjbVarArr);
        for (adjb adjbVar : adjbVarArr) {
            adjbVar.f(adisVar);
        }
        return adzvVar;
    }

    public final void a() {
        int i = 0;
        while (true) {
            adqq[] adqqVarArr = this.b;
            if (i >= adqqVarArr.length) {
                return;
            }
            i++;
        }
    }

    public final void b(long j) {
        int i = 0;
        while (true) {
            adqq[] adqqVarArr = this.b;
            if (i >= adqqVarArr.length) {
                return;
            }
            adqqVarArr[i].d(j);
            i++;
        }
    }

    public final void c(long j) {
        int i = 0;
        while (true) {
            adqq[] adqqVarArr = this.b;
            if (i >= adqqVarArr.length) {
                return;
            }
            adqqVarArr[i].e(j);
            i++;
        }
    }

    public final void d() {
        int i = 0;
        while (true) {
            adqq[] adqqVarArr = this.b;
            if (i >= adqqVarArr.length) {
                return;
            }
            ((adjb) adqqVarArr[i]).c();
            i++;
        }
    }

    public final void e() {
        int i = 0;
        while (true) {
            adqq[] adqqVarArr = this.b;
            if (i >= adqqVarArr.length) {
                return;
            }
            i++;
        }
    }

    public final void f() {
        if (this.c.compareAndSet(false, true)) {
            for (adqq adqqVar : this.b) {
            }
        }
    }
}
