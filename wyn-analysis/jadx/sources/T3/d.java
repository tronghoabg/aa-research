package T3;

import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import md.C3549q;

/* loaded from: classes.dex */
public abstract class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11406a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11407b;

    public /* synthetic */ d(Object obj, int i5) {
        this.f11406a = i5;
        this.f11407b = obj;
    }

    public static void a(K3.q qVar, String str) {
        K3.s sVar;
        boolean z2;
        WorkDatabase workDatabase = qVar.f6503c;
        S3.q qVarU = workDatabase.u();
        S3.c cVarP = workDatabase.p();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int iE = qVarU.e(str2);
            if (iE != 3 && iE != 4) {
                qVarU.l(6, str2);
            }
            linkedList.addAll(cVarP.k(str2));
        }
        K3.f fVar = qVar.f6506f;
        synchronized (fVar.f6481l) {
            try {
                J3.r.d().a(K3.f.f6470m, "Processor cancelling " + str);
                fVar.f6480j.add(str);
                sVar = (K3.s) fVar.f6476f.remove(str);
                z2 = sVar != null;
                if (sVar == null) {
                    sVar = (K3.s) fVar.f6477g.remove(str);
                }
                if (sVar != null) {
                    fVar.f6478h.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        K3.f.c(str, sVar);
        if (z2) {
            fVar.l();
        }
        Iterator it = qVar.f6505e.iterator();
        while (it.hasNext()) {
            ((K3.h) it.next()).a(str);
        }
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11406a) {
            case 0:
                S3.e eVar = (S3.e) this.f11407b;
                try {
                    d();
                    eVar.r(J3.w.f5589L8);
                    return;
                } catch (Throwable th) {
                    eVar.r(new J3.t(th));
                    return;
                }
            case 1:
                C3549q c3549q = (C3549q) this.f11407b;
                C3549q c3549qA = c3549q.a();
                try {
                    c();
                    return;
                } finally {
                    c3549q.c(c3549qA);
                }
            default:
                pd.c cVar = (pd.c) this.f11407b;
                try {
                    if (cVar.f43475i == null) {
                        throw new IOException("Unable to perform write due to unavailable sink.");
                    }
                    b();
                    return;
                } catch (Exception e7) {
                    cVar.f43470d.q(e7);
                    return;
                }
        }
    }

    public d() {
        this.f11406a = 0;
        this.f11407b = new S3.e(8);
    }
}
