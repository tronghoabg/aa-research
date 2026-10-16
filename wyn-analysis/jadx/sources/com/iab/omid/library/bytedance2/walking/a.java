package com.iab.omid.library.bytedance2.walking;

import android.view.View;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f28059a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0159a> f28060b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f28061c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f28062d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f28063e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f28064f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f28065g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f28066h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f28067i;

    /* renamed from: com.iab.omid.library.bytedance2.walking.a$a, reason: collision with other inner class name */
    public static class C0159a {

        /* renamed from: a, reason: collision with root package name */
        private final e f28068a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f28069b = new ArrayList<>();

        public C0159a(e eVar, String str) {
            this.f28068a = eVar;
            a(str);
        }

        public e a() {
            return this.f28068a;
        }

        public ArrayList<String> b() {
            return this.f28069b;
        }

        public void a(String str) {
            this.f28069b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f28066h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f28066h.containsKey(view)) {
            return this.f28066h.get(view);
        }
        Map<View, Boolean> map = this.f28066h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f28061c.get(str);
    }

    public C0159a c(View view) {
        C0159a c0159a = this.f28060b.get(view);
        if (c0159a != null) {
            this.f28060b.remove(view);
        }
        return c0159a;
    }

    public String d(View view) {
        if (this.f28059a.size() == 0) {
            return null;
        }
        String str = this.f28059a.get(view);
        if (str != null) {
            this.f28059a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f28062d.contains(view) ? c.PARENT_VIEW : this.f28067i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f28066h.containsKey(view)) {
            return true;
        }
        this.f28066h.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strA = h.a(view);
            if (strA != null) {
                return strA;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f28062d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f28065g.get(str);
    }

    public HashSet<String> c() {
        return this.f28063e;
    }

    public void d() {
        this.f28067i = true;
    }

    public void e() {
        com.iab.omid.library.bytedance2.internal.c cVarC = com.iab.omid.library.bytedance2.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.bytedance2.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f28063e.add(adSessionId);
                            this.f28059a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f28064f.add(adSessionId);
                            this.f28061c.put(adSessionId, viewC);
                            this.f28065g.put(adSessionId, strA);
                        }
                    } else {
                        this.f28064f.add(adSessionId);
                        this.f28065g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f28059a.clear();
        this.f28060b.clear();
        this.f28061c.clear();
        this.f28062d.clear();
        this.f28063e.clear();
        this.f28064f.clear();
        this.f28065g.clear();
        this.f28067i = false;
    }

    public HashSet<String> b() {
        return this.f28064f;
    }

    private void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.bytedance2.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0159a c0159a = this.f28060b.get(view);
        if (c0159a != null) {
            c0159a.a(aVar.getAdSessionId());
        } else {
            this.f28060b.put(view, new C0159a(eVar, aVar.getAdSessionId()));
        }
    }
}
