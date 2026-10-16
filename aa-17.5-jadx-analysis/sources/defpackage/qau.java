package defpackage;

import com.google.android.apps.gmm.systems.accounts.GmmAccount;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class qau implements ppo, uyl {
    public static final yob a = yob.c("com/google/android/apps/gmm/userevent3/reporter/UserEvent3ReporterImpl");
    public final xyc b;
    public final tmb c;
    public final ackk d;
    public final qcf e;
    public final Executor f;
    public final qam g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final Object l;
    public final Set m;
    public volatile GmmAccount n;
    public abwo o;
    private final aezk p;
    private final Executor q;
    private final xyc r;
    private final Object s;
    private final ConcurrentLinkedQueue t;
    private final ackk u;
    private final ackk v;
    private final sm w;
    private final sm x;
    private final lxr y;

    public qau(pkx pkxVar, tmb tmbVar, ackk ackkVar, ackk ackkVar2, zgt zgtVar, xxh xxhVar, lxr lxrVar, ackk ackkVar3, sm smVar, aezk aezkVar, sm smVar2, ackk ackkVar4, Executor executor, Executor executor2, ackk ackkVar5) {
        new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new Object();
        this.m = new LinkedHashSet();
        this.n = pmp.b;
        int i = yfq.d;
        new yfl(4);
        this.s = new Object();
        new ConcurrentLinkedQueue();
        this.t = new ConcurrentLinkedQueue();
        new HashSet();
        new HashSet();
        vaq.d();
        this.c = tmbVar;
        this.d = ackkVar2;
        this.e = (qcf) xxhVar.e();
        this.y = lxrVar;
        this.p = aezkVar;
        this.w = smVar2;
        this.x = new sm((byte[]) null, (byte[]) null);
        this.u = ackkVar4;
        this.g = new qam();
        this.f = executor;
        this.q = executor2;
        this.v = ackkVar5;
        new plb(20, pkz.PREFETCH_UPGRADES, pkxVar, null);
        this.b = wub.L(new plm(ackkVar, smVar, 3, null));
        this.r = wub.L(new vxm(this, ackkVar3, zgtVar, tmbVar, 1));
    }

    @Override // defpackage.ppo
    public final void a(zdg zdgVar) {
        sm smVar = this.x;
        synchronized (smVar) {
            for (int i = 0; i < zdgVar.b(); i++) {
                int iA = zdgVar.a(i);
                ((HashSet) smVar.a).add(Integer.valueOf(iA));
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final qag c(qaj qajVar) {
        GmmAccount gmmAccount = this.n;
        vaq.d();
        qas qasVarF = f(gmmAccount, qajVar);
        this.f.execute(new prm(this, qajVar, qasVarF, 3));
        return qag.a(qasVarF.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e1  */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r4v15, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.qaj r12, defpackage.qas r13) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qau.d(qaj, qas):void");
    }

    public final void e(Throwable th, String str) {
        this.q.execute(new pfq(th, str, 19));
    }

    public final qas f(GmmAccount gmmAccount, qaj qajVar) {
        String strC;
        int i;
        String str;
        String str2;
        sm smVar;
        abkz abkzVarA;
        vaq.d();
        int iA = 0;
        if (qajVar != null) {
            strC = qajVar.b();
            if (strC != null) {
                if (qajVar.i()) {
                    iA = qajVar.h();
                } else {
                    List listI = xxx.c(':').i(strC);
                    if (listI.size() > 2) {
                        throw new IllegalArgumentException(String.format("%s is incorrectly formatted. It should be formatted as \"message:id\", where \"message\" is a server-generated event ID and \"id\" is the decimal expression of the sequenceId.", strC));
                    }
                    iA = Integer.parseInt((String) listI.get(1));
                }
            }
        } else {
            strC = null;
        }
        String str3 = (qajVar == null || (abkzVarA = qajVar.a()) == null || (2 & abkzVarA.b) == 0) ? null : abkzVarA.d;
        xyc xycVar = this.b;
        qar qarVar = (qar) xycVar.gu();
        synchronized (xycVar) {
            if (strC == null) {
                try {
                    iA = qarVar.a();
                    strC = qaf.c(qarVar.f, iA);
                } catch (Throwable th) {
                    throw th;
                }
            }
            i = iA;
            str = strC;
            if (str3 == null) {
                str3 = qarVar.e;
                qarVar.e = str;
            }
            str2 = str3;
            smVar = new sm(Duration.ofMillis(this.c.a()), (byte[]) null);
        }
        return new qas(gmmAccount, i, str, str2, smVar);
    }

    public final void g(qai qaiVar) {
        GmmAccount gmmAccount = this.n;
        vaq.d();
        this.f.execute(new prm(this, f(gmmAccount, null), qaiVar, 2));
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        throw null;
    }

    public final int h() {
        return ((qar) this.b.gu()).a();
    }
}
