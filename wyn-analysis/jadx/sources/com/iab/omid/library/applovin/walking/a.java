package com.iab.omid.library.applovin.walking;

import android.view.View;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f27931a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0155a> f27932b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f27933c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f27934d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f27935e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f27936f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f27937g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet<String> f27938h = new HashSet<>();

    /* renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f27939i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    private boolean f27940j;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a, reason: collision with other inner class name */
    public static class C0155a {

        /* renamed from: a, reason: collision with root package name */
        private final e f27941a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f27942b = new ArrayList<>();

        public C0155a(e eVar, String str) {
            this.f27941a = eVar;
            a(str);
        }

        public e a() {
            return this.f27941a;
        }

        public ArrayList<String> b() {
            return this.f27942b;
        }

        public void a(String str) {
            this.f27942b.add(str);
        }
    }

    public View a(String str) {
        return this.f27933c.get(str);
    }

    public C0155a b(View view) {
        C0155a c0155a = this.f27932b.get(view);
        if (c0155a != null) {
            this.f27932b.remove(view);
        }
        return c0155a;
    }

    public String c(View view) {
        if (this.f27931a.size() == 0) {
            return null;
        }
        String str = this.f27931a.get(view);
        if (str != null) {
            this.f27931a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f27934d.contains(view) ? c.PARENT_VIEW : this.f27940j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.applovin.internal.c cVarC = com.iab.omid.library.applovin.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f27938h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f27935e.add(strC);
                            this.f27931a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f27936f.add(strC);
                            this.f27933c.put(strC, viewE);
                            this.f27937g.put(strC, strA);
                        }
                    } else {
                        this.f27936f.add(strC);
                        this.f27937g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f27939i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f27939i.containsKey(view)) {
            return this.f27939i.get(view);
        }
        Map<View, Boolean> map = this.f27939i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f27937g.get(str);
    }

    public HashSet<String> c() {
        return this.f27935e;
    }

    public void d() {
        this.f27940j = true;
    }

    public boolean e(View view) {
        if (!this.f27939i.containsKey(view)) {
            return true;
        }
        this.f27939i.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view, boolean z2) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z2) {
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
        this.f27934d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f27936f;
    }

    public boolean c(String str) {
        return this.f27938h.contains(str);
    }

    public void a() {
        this.f27931a.clear();
        this.f27932b.clear();
        this.f27933c.clear();
        this.f27934d.clear();
        this.f27935e.clear();
        this.f27936f.clear();
        this.f27937g.clear();
        this.f27940j = false;
        this.f27938h.clear();
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0155a c0155a = this.f27932b.get(view);
        if (c0155a != null) {
            c0155a.a(aVar.c());
        } else {
            this.f27932b.put(view, new C0155a(eVar, aVar.c()));
        }
    }
}
