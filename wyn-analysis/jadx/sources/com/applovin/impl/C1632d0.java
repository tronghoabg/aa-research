package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import cb.AbstractC1593a;
import com.applovin.impl.C1634e0;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.applovin.impl.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1632d0 extends AbstractCallableC1630c0 {

    /* renamed from: f, reason: collision with root package name */
    private final String f21234f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f21235g;

    /* renamed from: h, reason: collision with root package name */
    private final List f21236h;

    /* renamed from: i, reason: collision with root package name */
    private final c f21237i;

    /* renamed from: j, reason: collision with root package name */
    private StringBuffer f21238j;
    private final Object k;

    /* renamed from: l, reason: collision with root package name */
    private final ExecutorService f21239l;

    /* renamed from: m, reason: collision with root package name */
    private final String f21240m;

    /* renamed from: n, reason: collision with root package name */
    private List f21241n;

    /* renamed from: o, reason: collision with root package name */
    private List f21242o;

    /* renamed from: com.applovin.impl.d0$a */
    public class a implements C1634e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21243a;

        public a(String str) {
            this.f21243a = str;
        }

        @Override // com.applovin.impl.C1634e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) C1632d0.this.f21171a.a(y4.f23736Y0)).booleanValue()) {
                    synchronized (C1632d0.this.k) {
                        StringUtils.replaceAll(C1632d0.this.f21238j, this.f21243a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(C1632d0.this.f21238j, this.f21243a, uri.toString());
                }
                C1632d0.this.f21235g.a(uri.toString(), this.f21243a);
                return;
            }
            com.applovin.impl.sdk.o oVar = C1632d0.this.f21173c;
            if (com.applovin.impl.sdk.o.a()) {
                C1632d0 c1632d0 = C1632d0.this;
                AbstractC1593a.w(new StringBuilder("Failed to cache JavaScript resource "), this.f21243a, c1632d0.f21173c, c1632d0.f21172b);
            }
            if (C1632d0.this.f21237i != null) {
                C1632d0.this.f21237i.a(C1632d0.this.f21234f, true);
            }
        }
    }

    /* renamed from: com.applovin.impl.d0$b */
    public class b implements C1634e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21245a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21246b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21247c;

        public b(String str, String str2, String str3) {
            this.f21245a = str;
            this.f21246b = str2;
            this.f21247c = str3;
        }

        @Override // com.applovin.impl.C1634e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) C1632d0.this.f21171a.a(y4.f23736Y0)).booleanValue()) {
                    synchronized (C1632d0.this.k) {
                        StringUtils.replaceAll(C1632d0.this.f21238j, this.f21245a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(C1632d0.this.f21238j, this.f21245a, uri.toString());
                }
                C1632d0.this.f21235g.a(uri.toString(), this.f21245a);
                return;
            }
            if (!C1632d0.this.f21235g.Q().contains(this.f21246b + this.f21247c) || C1632d0.this.f21237i == null) {
                return;
            }
            C1632d0.this.f21237i.a(C1632d0.this.f21234f, true);
        }
    }

    /* renamed from: com.applovin.impl.d0$c */
    public interface c {
        void a(String str, boolean z2);
    }

    public C1632d0(String str, com.applovin.impl.sdk.ad.b bVar, List list, ExecutorService executorService, String str2, com.applovin.impl.sdk.k kVar, c cVar) {
        super("AsyncTaskCacheHTMLResources", kVar);
        this.f21234f = str;
        this.f21235g = bVar;
        this.f21236h = list;
        this.f21239l = executorService;
        this.f21240m = str2;
        this.f21237i = cVar;
        this.f21238j = new StringBuffer(str);
        this.k = new Object();
    }

    private Collection f() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f21171a.a(y4.f23613I0)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add('\"');
        return hashSet;
    }

    private void a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f21239l.submit((C1634e0) it.next()));
        }
        this.f21242o = arrayList;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((Future) it2.next()).get();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0017, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.HashSet d() {
        /*
            r18 = this;
            r0 = r18
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            com.applovin.impl.sdk.ad.b r2 = r0.f21235g
            java.util.List r2 = r2.H()
            java.util.Collection r3 = r0.f()
            java.util.List r4 = r0.f21236h
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lbf
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            r7 = r6
        L25:
            java.lang.String r8 = r0.f21234f
            int r8 = r8.length()
            if (r6 >= r8) goto L17
            java.util.concurrent.atomic.AtomicBoolean r6 = r0.f21175e
            boolean r6 = r6.get()
            r8 = 0
            if (r6 == 0) goto L37
            return r8
        L37:
            java.lang.String r6 = r0.f21234f
            int r6 = r6.indexOf(r5, r7)
            r7 = -1
            if (r6 != r7) goto L41
            goto L17
        L41:
            java.lang.String r7 = r0.f21234f
            int r7 = r7.length()
            r9 = r6
        L48:
            java.lang.String r10 = r0.f21234f
            char r10 = r10.charAt(r9)
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            boolean r10 = r3.contains(r10)
            if (r10 != 0) goto L5d
            if (r9 >= r7) goto L5d
            int r9 = r9 + 1
            goto L48
        L5d:
            if (r9 <= r6) goto Laf
            if (r9 == r7) goto Laf
            java.lang.String r7 = r0.f21234f
            int r8 = r5.length()
            int r8 = r8 + r6
            java.lang.String r7 = r7.substring(r8, r9)
            java.lang.String r11 = N0.a.f(r5, r7)
            boolean r8 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r7)
            if (r8 == 0) goto L9d
            boolean r8 = r2.contains(r11)
            if (r8 != 0) goto L9d
            com.applovin.impl.e0 r10 = new com.applovin.impl.e0
            com.applovin.impl.sdk.ad.b r12 = r0.f21235g
            java.lang.String[] r8 = new java.lang.String[]{r5}
            java.util.List r13 = java.util.Arrays.asList(r8)
            java.lang.String r15 = r0.f21240m
            com.applovin.impl.sdk.k r8 = r0.f21171a
            com.applovin.impl.d0$b r14 = new com.applovin.impl.d0$b
            r14.<init>(r11, r5, r7)
            r17 = r14
            r14 = 1
            r16 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r1.add(r10)
            goto Lac
        L9d:
            boolean r8 = com.applovin.impl.sdk.o.a()
            if (r8 == 0) goto Lac
            com.applovin.impl.sdk.o r8 = r0.f21173c
            java.lang.String r10 = r0.f21172b
            java.lang.String r11 = "Skip caching of optional or non-resource "
            cb.AbstractC1593a.s(r11, r7, r8, r10)
        Lac:
            r7 = r9
            goto L25
        Laf:
            boolean r1 = com.applovin.impl.sdk.o.a()
            if (r1 == 0) goto Lbe
            com.applovin.impl.sdk.o r1 = r0.f21173c
            java.lang.String r2 = r0.f21172b
            java.lang.String r3 = "Unable to cache resource; ad HTML is invalid."
            r1.b(r2, r3)
        Lbe:
            return r8
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C1632d0.d():java.util.HashSet");
    }

    private HashSet e() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f21234f, (String) this.f21171a.a(y4.i5)), 1)) {
            if (this.f21175e.get()) {
                return null;
            }
            if (StringUtils.isValidString(str)) {
                hashSet.add(new C1634e0(str, this.f21235g, Collections.EMPTY_LIST, false, this.f21240m, this.f21171a, new a(str)));
            } else if (com.applovin.impl.sdk.o.a()) {
                AbstractC1593a.s("Skip caching of non-resource ", str, this.f21173c, this.f21172b);
            }
        }
        return hashSet;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() throws InterruptedException {
        HashSet hashSetE;
        if (this.f21175e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f21234f)) {
            a(this.f21234f);
            return Boolean.FALSE;
        }
        if (!((Boolean) this.f21171a.a(y4.f23620J0)).booleanValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21173c.a(this.f21172b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f21234f);
            return Boolean.FALSE;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSetD = d();
        if (hashSetD != null) {
            hashSet.addAll(hashSetD);
        }
        if (((Boolean) this.f21171a.a(y4.f23811h5)).booleanValue() && (hashSetE = e()) != null) {
            hashSet.addAll(hashSetE);
        }
        this.f21241n = new ArrayList(hashSet);
        if (this.f21175e.get()) {
            return Boolean.FALSE;
        }
        List list = this.f21241n;
        if (list == null || list.isEmpty()) {
            a(this.f21234f);
            return Boolean.FALSE;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21173c.a(this.f21172b, "Executing " + this.f21241n.size() + " caching operations...");
        }
        if (this.f21171a.r0().f()) {
            a(this.f21241n);
        } else {
            this.f21239l.invokeAll(this.f21241n);
        }
        if (((Boolean) this.f21171a.a(y4.f23736Y0)).booleanValue()) {
            synchronized (this.k) {
                a(this.f21238j.toString());
            }
        } else {
            a(this.f21238j.toString());
        }
        return Boolean.TRUE;
    }

    public void c() {
        List list = this.f21241n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C1634e0) it.next()).a(true);
            }
        }
        List<Future> list2 = this.f21242o;
        if (list2 != null) {
            for (Future future : list2) {
                if (!future.isDone()) {
                    future.cancel(true);
                }
            }
        }
    }

    private void a(String str) {
        c cVar;
        if (this.f21175e.get() || (cVar = this.f21237i) == null) {
            return;
        }
        cVar.a(str, false);
    }
}
