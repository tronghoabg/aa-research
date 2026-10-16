package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class adzg extends adnf implements adkm {
    public static final Logger b = Logger.getLogger(adzg.class.getName());
    public static final adzk c = new adyz();
    public final adwt d;
    public Executor e;
    public final adum f;
    public final List g;
    public final adni[] h;
    public final long i;
    public boolean j;
    public boolean k;
    public adnq l;
    public boolean m;
    public final adun n;
    public boolean p;
    public final adjq r;
    public final adjt s;
    public final adkj t;
    public final adrw u;
    public final adqq v;
    private final adkn w;
    private boolean x;
    public final Object o = new Object();
    public final Set q = new HashSet();

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    public adzg(adzh adzhVar, adun adunVar, adjq adjqVar) {
        List listUnmodifiableList;
        adwt adwtVar = adzhVar.f;
        adwtVar.getClass();
        this.d = adwtVar;
        sm smVar = adzhVar.q;
        HashMap map = new HashMap();
        Iterator it = ((HashMap) smVar.a).values().iterator();
        while (it.hasNext()) {
            for (aebg aebgVar : ((aebg) it.next()).b.values()) {
                map.put(((admf) aebgVar.a).b, aebgVar);
            }
        }
        DesugarCollections.unmodifiableList(new ArrayList(((HashMap) smVar.a).values()));
        this.f = new adum(DesugarCollections.unmodifiableMap(map));
        adzhVar.p.getClass();
        this.n = adunVar;
        synchronized (this.o) {
            listUnmodifiableList = DesugarCollections.unmodifiableList(yfq.q(((adow) adunVar).b));
        }
        this.w = adkn.b("Server", String.valueOf(listUnmodifiableList));
        adjqVar.getClass();
        this.r = new adjq(adjqVar.f, adjqVar.g + 1).l(adkq.a, this);
        this.s = adzhVar.g;
        this.g = DesugarCollections.unmodifiableList(new ArrayList(adzhVar.b));
        List list = adzhVar.c;
        this.h = (adni[]) list.toArray(new adni[list.size()]);
        this.i = adzhVar.h;
        adkj adkjVar = adzhVar.m;
        this.t = adkjVar;
        this.u = new adrw(aeaa.a);
        adqq adqqVar = adzhVar.o;
        adqqVar.getClass();
        this.v = adqqVar;
        adkj.b(adkjVar.c, this);
    }

    public final void a() {
        Object obj = this.o;
        synchronized (obj) {
            if (this.k && this.q.isEmpty() && this.p) {
                if (this.x) {
                    throw new AssertionError("Server already terminated");
                }
                this.x = true;
                adkj adkjVar = this.t;
                adkj.c(adkjVar.c, this);
                Executor executor = this.e;
                if (executor != null) {
                    this.d.b(executor);
                    this.e = null;
                }
                obj.notifyAll();
            }
        }
    }

    public final void b() {
        synchronized (this.o) {
            if (!this.k) {
                this.k = true;
                boolean z = this.j;
                if (!z) {
                    this.p = true;
                    a();
                }
                if (z) {
                    this.n.c();
                }
            }
        }
        adnq adnqVarE = adnq.m.e("Server shutdownNow invoked");
        synchronized (this.o) {
            if (this.l != null) {
                return;
            }
            this.l = adnqVarE;
            ArrayList arrayList = new ArrayList(this.q);
            boolean z2 = this.m;
            if (z2) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((adox) arrayList.get(i)).d(adnqVarE);
                }
            }
        }
    }

    @Override // defpackage.adkt
    public final adkn e() {
        return this.w;
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.g("logId", this.w.a);
        xxgVarAo.b("transportServer", this.n);
        return xxgVarAo.toString();
    }
}
