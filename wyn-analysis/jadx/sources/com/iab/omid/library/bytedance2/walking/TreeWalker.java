package com.iab.omid.library.bytedance2.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.bytedance2.processor.a;
import com.iab.omid.library.bytedance2.utils.f;
import com.iab.omid.library.bytedance2.utils.h;
import com.iab.omid.library.bytedance2.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class TreeWalker implements a.InterfaceC0157a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f28046i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f28047j = new Handler(Looper.getMainLooper());
    private static Handler k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f28048l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f28049m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f28051b;

    /* renamed from: h, reason: collision with root package name */
    private long f28057h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f28050a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f28052c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.bytedance2.weakreference.a> f28053d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.a f28055f = new com.iab.omid.library.bytedance2.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.processor.b f28054e = new com.iab.omid.library.bytedance2.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.b f28056g = new com.iab.omid.library.bytedance2.walking.b(new com.iab.omid.library.bytedance2.walking.async.c());

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
            TreeWalker.this.f28056g.b();
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
                TreeWalker.k.post(TreeWalker.f28048l);
                TreeWalker.k.postDelayed(TreeWalker.f28049m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f28057h);
    }

    private void e() {
        this.f28051b = 0;
        this.f28053d.clear();
        this.f28052c = false;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f28052c = true;
                break;
            }
        }
        this.f28057h = f.b();
    }

    public static TreeWalker getInstance() {
        return f28046i;
    }

    private void i() {
        if (k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            k = handler;
            handler.post(f28048l);
            k.postDelayed(f28049m, 200L);
        }
    }

    private void k() {
        Handler handler = k;
        if (handler != null) {
            handler.removeCallbacks(f28049m);
            k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() throws JSONException {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f28050a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f28050a.add(treeWalkerTimeLogger);
    }

    public void f() throws JSONException {
        TreeWalker treeWalker;
        this.f28055f.e();
        long jB = f.b();
        com.iab.omid.library.bytedance2.processor.a aVarA = this.f28054e.a();
        if (this.f28055f.b().size() > 0) {
            Iterator<String> it = this.f28055f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f28055f.a(next), jSONObjectA);
                com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f28056g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f28055f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA2);
            treeWalker.f28056g.b(jSONObjectA2, treeWalker.f28055f.c(), jB);
            if (treeWalker.f28052c) {
                Iterator<com.iab.omid.library.bytedance2.adsession.a> it2 = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f28053d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f28056g.b();
        }
        treeWalker.f28055f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f28050a.clear();
        f28047j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f28050a.contains(treeWalkerTimeLogger)) {
            this.f28050a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j8) {
        if (this.f28050a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f28050a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f28051b, TimeUnit.NANOSECONDS.toMillis(j8));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f28051b, j8);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strD = this.f28055f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, strD);
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, Boolean.valueOf(this.f28055f.f(view)));
        this.f28055f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.bytedance2.walking.c cVar, boolean z2) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, z2);
    }

    @Override // com.iab.omid.library.bytedance2.processor.a.InterfaceC0157a
    public void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, boolean z2) throws JSONException {
        com.iab.omid.library.bytedance2.walking.c cVarE;
        TreeWalker treeWalker;
        if (h.d(view) && (cVarE = this.f28055f.e(view)) != com.iab.omid.library.bytedance2.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z10 = z2 || a(view, jSONObjectA);
                if (this.f28052c && cVarE == com.iab.omid.library.bytedance2.walking.c.OBSTRUCTION_VIEW && !z10) {
                    this.f28053d.add(new com.iab.omid.library.bytedance2.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarE, z10);
            }
            treeWalker.f28051b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.bytedance2.processor.a aVarB = this.f28054e.b();
        String strB = this.f28055f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0159a c0159aC = this.f28055f.c(view);
        if (c0159aC == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, c0159aC);
        return true;
    }
}
