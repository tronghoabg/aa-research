package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.applovin.internal.j;
import com.iab.omid.library.applovin.processor.a;
import com.iab.omid.library.applovin.utils.f;
import com.iab.omid.library.applovin.utils.h;
import com.iab.omid.library.applovin.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class TreeWalker implements a.InterfaceC0153a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f27918i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f27919j = new Handler(Looper.getMainLooper());
    private static Handler k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f27920l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f27921m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f27923b;

    /* renamed from: h, reason: collision with root package name */
    private long f27929h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f27922a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f27924c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.applovin.weakreference.a> f27925d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.a f27927f = new com.iab.omid.library.applovin.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.applovin.processor.b f27926e = new com.iab.omid.library.applovin.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.b f27928g = new com.iab.omid.library.applovin.walking.b(new com.iab.omid.library.applovin.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i5, long j8);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i5, long j8);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f27928g.b();
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() throws JSONException {
            TreeWalker.getInstance().l();
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.k != null) {
                TreeWalker.k.post(TreeWalker.f27920l);
                TreeWalker.k.postDelayed(TreeWalker.f27921m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f27929h);
    }

    private void e() {
        this.f27923b = 0;
        this.f27925d.clear();
        this.f27924c = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f27924c = true;
                break;
            }
        }
        this.f27929h = f.b();
    }

    public static TreeWalker getInstance() {
        return f27918i;
    }

    private void i() {
        if (k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            k = handler;
            handler.post(f27920l);
            k.postDelayed(f27921m, 200L);
        }
    }

    private void k() {
        Handler handler = k;
        if (handler != null) {
            handler.removeCallbacks(f27921m);
            k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() throws JSONException {
        e();
        f();
        d();
        j.b().a();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f27922a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f27922a.add(treeWalkerTimeLogger);
    }

    public void f() throws JSONException {
        TreeWalker treeWalker;
        this.f27927f.e();
        long jB = f.b();
        com.iab.omid.library.applovin.processor.a aVarA = this.f27926e.a();
        if (this.f27927f.b().size() > 0) {
            Iterator<String> it = this.f27927f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f27927f.a(next), jSONObjectA);
                com.iab.omid.library.applovin.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f27928g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f27927f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.applovin.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA2);
            treeWalker.f27928g.b(jSONObjectA2, treeWalker.f27927f.c(), jB);
            if (treeWalker.f27924c) {
                Iterator<com.iab.omid.library.applovin.adsession.a> it2 = com.iab.omid.library.applovin.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f27925d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f27928g.b();
        }
        treeWalker.f27927f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f27922a.clear();
        f27919j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f27922a.contains(treeWalkerTimeLogger)) {
            this.f27922a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j8) {
        if (this.f27922a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f27922a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f27923b, TimeUnit.NANOSECONDS.toMillis(j8));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f27923b, j8);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strC = this.f27927f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, strC);
        com.iab.omid.library.applovin.utils.c.a(jSONObject, Boolean.valueOf(this.f27927f.e(view)));
        com.iab.omid.library.applovin.utils.c.b(jSONObject, Boolean.valueOf(this.f27927f.c(strC)));
        this.f27927f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.applovin.walking.c cVar, boolean z2) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.applovin.walking.c.PARENT_VIEW, z2);
    }

    @Override // com.iab.omid.library.applovin.processor.a.InterfaceC0153a
    public void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, boolean z2) throws JSONException {
        com.iab.omid.library.applovin.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f27927f.d(view)) != com.iab.omid.library.applovin.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z10 = z2 || a(view, jSONObjectA);
                if (this.f27924c && cVarD == com.iab.omid.library.applovin.walking.c.OBSTRUCTION_VIEW && !z10) {
                    this.f27925d.add(new com.iab.omid.library.applovin.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z10);
            }
            treeWalker.f27923b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.applovin.processor.a aVarB = this.f27926e.b();
        String strB = this.f27927f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0155a c0155aB = this.f27927f.b(view);
        if (c0155aB == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, c0155aB);
        return true;
    }
}
