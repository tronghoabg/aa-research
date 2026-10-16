package com.iab.omid.library.vungle.walking;

import android.view.View;
import com.iab.omid.library.vungle.internal.e;
import com.iab.omid.library.vungle.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f28221a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0165a> f28222b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f28223c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f28224d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f28225e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f28226f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f28227g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet<String> f28228h = new HashSet<>();

    /* renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f28229i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    private boolean f28230j;

    /* renamed from: com.iab.omid.library.vungle.walking.a$a, reason: collision with other inner class name */
    public static class C0165a {

        /* renamed from: a, reason: collision with root package name */
        private final e f28231a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f28232b = new ArrayList<>();

        public C0165a(e eVar, String str) {
            this.f28231a = eVar;
            a(str);
        }

        public e a() {
            return this.f28231a;
        }

        public ArrayList<String> b() {
            return this.f28232b;
        }

        public void a(String str) {
            this.f28232b.add(str);
        }
    }

    public View a(String str) {
        return this.f28223c.get(str);
    }

    public C0165a b(View view) {
        C0165a c0165a = this.f28222b.get(view);
        if (c0165a != null) {
            this.f28222b.remove(view);
        }
        return c0165a;
    }

    public String c(View view) {
        if (this.f28221a.size() == 0) {
            return null;
        }
        String str = this.f28221a.get(view);
        if (str != null) {
            this.f28221a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f28224d.contains(view) ? c.PARENT_VIEW : this.f28230j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.vungle.internal.c cVarC = com.iab.omid.library.vungle.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.vungle.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f28228h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f28225e.add(strC);
                            this.f28221a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f28226f.add(strC);
                            this.f28223c.put(strC, viewE);
                            this.f28227g.put(strC, strA);
                        }
                    } else {
                        this.f28226f.add(strC);
                        this.f28227g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f28229i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f28229i.containsKey(view)) {
            return this.f28229i.get(view);
        }
        Map<View, Boolean> map = this.f28229i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f28227g.get(str);
    }

    public HashSet<String> c() {
        return this.f28225e;
    }

    public void d() {
        this.f28230j = true;
    }

    public boolean e(View view) {
        if (!this.f28229i.containsKey(view)) {
            return true;
        }
        this.f28229i.put(view, Boolean.TRUE);
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
        this.f28224d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f28226f;
    }

    public boolean c(String str) {
        return this.f28228h.contains(str);
    }

    public void a() {
        this.f28221a.clear();
        this.f28222b.clear();
        this.f28223c.clear();
        this.f28224d.clear();
        this.f28225e.clear();
        this.f28226f.clear();
        this.f28227g.clear();
        this.f28230j = false;
        this.f28228h.clear();
    }

    private void a(com.iab.omid.library.vungle.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.vungle.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0165a c0165a = this.f28222b.get(view);
        if (c0165a != null) {
            c0165a.a(aVar.c());
        } else {
            this.f28222b.put(view, new C0165a(eVar, aVar.c()));
        }
    }
}
