package androidx.work.impl;

import K3.o;
import N2.j;
import S3.b;
import S3.c;
import S3.e;
import S3.f;
import S3.h;
import S3.i;
import S3.l;
import S3.n;
import S3.q;
import S3.s;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k3.C3171c;
import k3.C3176h;
import o3.C3645b;
import o3.d;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: m, reason: collision with root package name */
    public volatile q f19067m;

    /* renamed from: n, reason: collision with root package name */
    public volatile c f19068n;

    /* renamed from: o, reason: collision with root package name */
    public volatile s f19069o;

    /* renamed from: p, reason: collision with root package name */
    public volatile i f19070p;

    /* renamed from: q, reason: collision with root package name */
    public volatile l f19071q;

    /* renamed from: r, reason: collision with root package name */
    public volatile n f19072r;

    /* renamed from: s, reason: collision with root package name */
    public volatile e f19073s;

    @Override // k3.AbstractC3181m
    public final C3176h d() {
        return new C3176h(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // k3.AbstractC3181m
    public final d e(C3171c c3171c) {
        return c3171c.f39181c.c(new C3645b(c3171c.f39179a, c3171c.f39180b, new j(c3171c, new o(this), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e"), false, false));
    }

    @Override // k3.AbstractC3181m
    public final List f(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new K3.d(13, 14, 9), new K3.d());
    }

    @Override // k3.AbstractC3181m
    public final Set h() {
        return new HashSet();
    }

    @Override // k3.AbstractC3181m
    public final Map i() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(q.class, list);
        map.put(c.class, list);
        map.put(s.class, list);
        map.put(i.class, list);
        map.put(l.class, list);
        map.put(n.class, list);
        map.put(e.class, list);
        map.put(f.class, list);
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c p() {
        c cVar;
        if (this.f19068n != null) {
            return this.f19068n;
        }
        synchronized (this) {
            try {
                if (this.f19068n == null) {
                    this.f19068n = new c(this);
                }
                cVar = this.f19068n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e q() {
        e eVar;
        if (this.f19073s != null) {
            return this.f19073s;
        }
        synchronized (this) {
            try {
                if (this.f19073s == null) {
                    this.f19073s = new e(this);
                }
                eVar = this.f19073s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final i r() {
        i iVar;
        if (this.f19070p != null) {
            return this.f19070p;
        }
        synchronized (this) {
            try {
                if (this.f19070p == null) {
                    this.f19070p = new i(this);
                }
                iVar = this.f19070p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l s() {
        l lVar;
        if (this.f19071q != null) {
            return this.f19071q;
        }
        synchronized (this) {
            try {
                if (this.f19071q == null) {
                    this.f19071q = new l(this);
                }
                lVar = this.f19071q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final n t() {
        n nVar;
        if (this.f19072r != null) {
            return this.f19072r;
        }
        synchronized (this) {
            try {
                if (this.f19072r == null) {
                    n nVar2 = new n();
                    nVar2.f10970a = this;
                    nVar2.f10971b = new b(this, 4);
                    nVar2.f10972c = new h(this, 2);
                    nVar2.f10973d = new h(this, 3);
                    this.f19072r = nVar2;
                }
                nVar = this.f19072r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final q u() {
        q qVar;
        if (this.f19067m != null) {
            return this.f19067m;
        }
        synchronized (this) {
            try {
                if (this.f19067m == null) {
                    this.f19067m = new q(this);
                }
                qVar = this.f19067m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s v() {
        s sVar;
        if (this.f19069o != null) {
            return this.f19069o;
        }
        synchronized (this) {
            try {
                if (this.f19069o == null) {
                    this.f19069o = new s(this);
                }
                sVar = this.f19069o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }
}
