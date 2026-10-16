package com.iab.omid.library.vungle.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.vungle.internal.k;
import com.iab.omid.library.vungle.processor.a;
import com.iab.omid.library.vungle.utils.f;
import com.iab.omid.library.vungle.utils.h;
import com.iab.omid.library.vungle.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class TreeWalker implements a.InterfaceC0163a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f28208i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f28209j = new Handler(Looper.getMainLooper());
    private static Handler k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f28210l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f28211m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f28213b;

    /* renamed from: h, reason: collision with root package name */
    private long f28219h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f28212a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f28214c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.vungle.weakreference.a> f28215d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.vungle.walking.a f28217f = new com.iab.omid.library.vungle.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.vungle.processor.b f28216e = new com.iab.omid.library.vungle.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.vungle.walking.b f28218g = new com.iab.omid.library.vungle.walking.b(new com.iab.omid.library.vungle.walking.async.c());

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
            TreeWalker.this.f28218g.b();
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
                TreeWalker.k.post(TreeWalker.f28210l);
                TreeWalker.k.postDelayed(TreeWalker.f28211m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f28219h);
    }

    private void e() {
        this.f28213b = 0;
        this.f28215d.clear();
        this.f28214c = false;
        Iterator<com.iab.omid.library.vungle.adsession.a> it = com.iab.omid.library.vungle.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f28214c = true;
                break;
            }
        }
        this.f28219h = f.b();
    }

    public static TreeWalker getInstance() {
        return f28208i;
    }

    private void i() {
        if (k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            k = handler;
            handler.post(f28210l);
            k.postDelayed(f28211m, 200L);
        }
    }

    private void k() {
        Handler handler = k;
        if (handler != null) {
            handler.removeCallbacks(f28211m);
            k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() throws JSONException {
        e();
        f();
        d();
        k.b().a();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f28212a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f28212a.add(treeWalkerTimeLogger);
    }

    public void f() throws JSONException {
        TreeWalker treeWalker;
        this.f28217f.e();
        long jB = f.b();
        com.iab.omid.library.vungle.processor.a aVarA = this.f28216e.a();
        if (this.f28217f.b().size() > 0) {
            Iterator<String> it = this.f28217f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f28217f.a(next), jSONObjectA);
                com.iab.omid.library.vungle.utils.c.c(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f28218g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f28217f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.vungle.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.vungle.utils.c.c(jSONObjectA2);
            treeWalker.f28218g.b(jSONObjectA2, treeWalker.f28217f.c(), jB);
            if (treeWalker.f28214c) {
                Iterator<com.iab.omid.library.vungle.adsession.a> it2 = com.iab.omid.library.vungle.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f28215d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f28218g.b();
        }
        treeWalker.f28217f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f28212a.clear();
        f28209j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f28212a.contains(treeWalkerTimeLogger)) {
            this.f28212a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j8) {
        if (this.f28212a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f28212a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f28213b, TimeUnit.NANOSECONDS.toMillis(j8));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f28213b, j8);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strC = this.f28217f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.vungle.utils.c.a(jSONObject, strC);
        com.iab.omid.library.vungle.utils.c.a(jSONObject, Boolean.valueOf(this.f28217f.e(view)));
        com.iab.omid.library.vungle.utils.c.b(jSONObject, Boolean.valueOf(this.f28217f.c(strC)));
        this.f28217f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.vungle.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.vungle.walking.c cVar, boolean z2) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.vungle.walking.c.PARENT_VIEW, z2);
    }

    @Override // com.iab.omid.library.vungle.processor.a.InterfaceC0163a
    public void a(View view, com.iab.omid.library.vungle.processor.a aVar, JSONObject jSONObject, boolean z2) throws JSONException {
        com.iab.omid.library.vungle.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f28217f.d(view)) != com.iab.omid.library.vungle.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.vungle.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z10 = z2 || a(view, jSONObjectA);
                if (this.f28214c && cVarD == com.iab.omid.library.vungle.walking.c.OBSTRUCTION_VIEW && !z10) {
                    this.f28215d.add(new com.iab.omid.library.vungle.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z10);
            }
            treeWalker.f28213b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.vungle.processor.a aVarB = this.f28216e.b();
        String strB = this.f28217f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.vungle.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.vungle.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.vungle.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0165a c0165aB = this.f28217f.b(view);
        if (c0165aB == null) {
            return false;
        }
        com.iab.omid.library.vungle.utils.c.a(jSONObject, c0165aB);
        return true;
    }
}
