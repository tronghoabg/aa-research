package Va;

import E4.C0434c;
import E4.ThreadFactoryC0433b;
import K8.C0690b;
import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import cb.AbstractC1593a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.firebase.auth.FirebaseAuth;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import w9.InterfaceC4388g;

/* loaded from: classes4.dex */
public final class Y7 implements InterfaceC1064ma, OnCompleteListener, P2.l {

    /* renamed from: a, reason: collision with root package name */
    public Object f13867a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13868b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13869c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13870d;

    public Y7(int i5) {
        switch (i5) {
            case 3:
                this.f13867a = new Q1.o();
                this.f13868b = new Q1.o();
                this.f13869c = new S2.a(0);
                break;
            default:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0433b(0));
                this.f13868b = new HashMap();
                this.f13869c = new ReferenceQueue();
                this.f13867a = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new A7.V(this, 9));
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        r8.F(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        r9.reset();
        r6.E(r8.f9704c, r8.f9702a);
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    @Override // P2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(byte[] r39, int r40, int r41, P2.k r42, Q1.c r43) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Y7.E(byte[], int, int, P2.k, Q1.c):void");
    }

    @Override // P2.l
    public /* synthetic */ P2.d H(int i5, int i10, byte[] bArr) {
        return N0.a.a(this, bArr, i10);
    }

    @Override // P2.l
    public int P() {
        return 2;
    }

    public synchronized void a(E4.t tVar, E4.u uVar) {
        C0434c c0434c = (C0434c) ((HashMap) this.f13868b).put(tVar, new C0434c(tVar, uVar, (ReferenceQueue) this.f13869c));
        if (c0434c != null) {
            c0434c.f2867c = null;
            c0434c.clear();
        }
    }

    public void b() {
        List list = (List) this.f13870d;
        if (list != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.G.g((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L0) this.f13869c, list, null, 14);
            this.f13870d = null;
        }
    }

    public synchronized void c() {
        if (!((LinkedHashSet) this.f13867a).isEmpty()) {
            ((aa.n) this.f13868b).e(0L);
        }
    }

    public void d(C0434c c0434c) {
        E4.B b5;
        synchronized (this) {
            ((HashMap) this.f13868b).remove(c0434c.f2865a);
            if (c0434c.f2866b && (b5 = c0434c.f2867c) != null) {
                ((E4.o) this.f13870d).f(c0434c.f2865a, new E4.u(b5, true, false, c0434c.f2865a, (E4.o) this.f13870d));
            }
        }
    }

    @Override // Va.InterfaceC1064ma
    public boolean e(C1077na c1077na) {
        return ((A7) this.f13867a).f13182b.c(c1077na, (C1203x8) this.f13868b, (C1214y7) this.f13869c, (List) this.f13870d);
    }

    public boolean f() {
        ArrayList arrayList = (ArrayList) this.f13870d;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ArrayList arrayList2 = ((z0.g) arrayList.get(i5)).f48291a.f4865j;
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                H0.e eVar = (H0.e) arrayList2.get(i10);
                if (eVar.f4868a.f2809a != eVar.f4869b) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean g() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) this.f13867a).getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void h(md.k0 k0Var) {
        synchronized (this.f13867a) {
            try {
                if (((md.k0) this.f13869c) != null) {
                    return;
                }
                this.f13869c = k0Var;
                boolean zIsEmpty = ((HashSet) this.f13868b).isEmpty();
                if (zIsEmpty) {
                    ((od.M0) this.f13870d).f41657E.d(k0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(boolean z2) {
        synchronized (((ArrayList) this.f13870d)) {
            try {
                Iterator it = ((ArrayList) this.f13870d).iterator();
                while (it.hasNext()) {
                    ((InterfaceC4388g) it.next()).accept(z2 ? v9.f.f47063b : v9.f.f47062a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        Ba.c.p("AndroidConnectivityMonitor", "App has entered the foreground.", 1, new Object[0]);
        if (g()) {
            i(true);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((C0690b) this.f13867a).getClass();
        boolean zIsSuccessful = task.isSuccessful();
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f13868b;
        if (zIsSuccessful && task.getResult() != null && !TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) {
            taskCompletionSource.setResult(new K8.K(null, ((IntegrityTokenResponse) task.getResult()).token(), null));
        } else {
            AbstractC1593a.t("Play Integrity Token fetch failed, falling back to Recaptcha", task.getException() == null ? "" : task.getException().getMessage(), "b");
            C0690b.b((FirebaseAuth) this.f13869c, (Activity) this.f13870d, taskCompletionSource);
        }
    }

    @Override // P2.l
    public /* synthetic */ void reset() {
    }
}
