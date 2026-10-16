package com.applovin.impl.sdk;

import A.AbstractC0213f;
import com.applovin.impl.l1;
import com.applovin.impl.y2;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final k f22938a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f22939b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f22940c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f22941d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Object f22942e = new Object();

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f22943a;

        /* renamed from: b, reason: collision with root package name */
        private final String f22944b;

        /* renamed from: c, reason: collision with root package name */
        private final String f22945c;

        /* renamed from: d, reason: collision with root package name */
        private final String f22946d;

        /* renamed from: e, reason: collision with root package name */
        private final String f22947e;

        /* renamed from: f, reason: collision with root package name */
        private final String f22948f;

        /* renamed from: g, reason: collision with root package name */
        private final String f22949g;

        /* renamed from: h, reason: collision with root package name */
        private long f22950h;

        /* renamed from: i, reason: collision with root package name */
        private final ArrayDeque f22951i;

        public String b() {
            return this.f22946d;
        }

        public String c() {
            return this.f22945c;
        }

        public String d() {
            return this.f22947e;
        }

        public String e() {
            return this.f22948f;
        }

        public String f() {
            return this.f22949g;
        }

        public String g() {
            return this.f22944b;
        }

        public String h() {
            return this.f22948f;
        }

        public c i() {
            return (c) this.f22951i.getLast();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("AdInfo{state='");
            sb2.append(i());
            sb2.append("', adUnitId='");
            sb2.append(this.f22943a);
            sb2.append("', format='");
            sb2.append(this.f22944b);
            sb2.append("', adapterName='");
            sb2.append(this.f22945c);
            sb2.append("', adapterClass='");
            sb2.append(this.f22946d);
            sb2.append("', adapterVersion='");
            sb2.append(this.f22947e);
            sb2.append("', bCode='");
            sb2.append(this.f22948f);
            sb2.append("', creativeId='");
            sb2.append(this.f22949g);
            sb2.append("', updated=");
            return AbstractC0213f.e(sb2, this.f22950h, '}');
        }

        private b(y2 y2Var, c cVar) {
            this.f22951i = new ArrayDeque();
            this.f22943a = y2Var.getAdUnitId();
            this.f22944b = y2Var.getFormat().getLabel();
            this.f22945c = y2Var.c();
            this.f22946d = y2Var.b();
            this.f22947e = y2Var.z();
            this.f22948f = y2Var.B();
            this.f22949g = y2Var.getCreativeId();
            a(cVar);
        }

        public String a() {
            return this.f22943a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(c cVar) {
            this.f22950h = System.currentTimeMillis();
            this.f22951i.add(cVar);
        }
    }

    public enum c {
        LOADING("loading"),
        LOAD("load"),
        SHOW("show"),
        HIDE("hide"),
        CLICK("click"),
        DESTROY("destroy"),
        SHOW_ERROR("show_error");


        /* renamed from: a, reason: collision with root package name */
        private final String f22960a;

        c(String str) {
            this.f22960a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f22960a;
        }
    }

    public interface d {
        void a(b bVar);
    }

    public g(k kVar) {
        this.f22938a = kVar;
        a();
    }

    public void a(y2 y2Var, c cVar) {
        synchronized (this.f22942e) {
            try {
                String strB = y2Var.B();
                b bVar = (b) this.f22941d.get(strB);
                if (bVar == null) {
                    if (cVar == c.DESTROY) {
                        return;
                    }
                    bVar = new b(y2Var, cVar);
                    this.f22941d.put(strB, bVar);
                } else if (bVar.i() == cVar) {
                    return;
                } else {
                    bVar.a(cVar);
                }
                if (cVar == c.DESTROY) {
                    this.f22941d.remove(strB);
                }
                a(bVar, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        synchronized (this.f22940c) {
            try {
                for (c cVar : c.values()) {
                    this.f22939b.put(cVar, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar, Set set) {
        synchronized (this.f22940c) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    a((c) it.next()).add(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar) {
        synchronized (this.f22940c) {
            try {
                Iterator it = this.f22939b.keySet().iterator();
                while (it.hasNext()) {
                    a((c) it.next()).remove(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Set a(c cVar) {
        synchronized (this.f22940c) {
            try {
                Set set = (Set) this.f22939b.get(cVar);
                if (l1.a(set)) {
                    return set;
                }
                return new HashSet();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(b bVar, c cVar) {
        synchronized (this.f22940c) {
            try {
                Iterator it = a(cVar).iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
