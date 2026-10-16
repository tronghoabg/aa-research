package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t5;
import com.applovin.impl.v5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1627b0 implements v5.b, t5.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21106a;

    /* renamed from: b, reason: collision with root package name */
    private final a f21107b;

    /* renamed from: c, reason: collision with root package name */
    private C1676z f21108c;

    /* renamed from: d, reason: collision with root package name */
    private String f21109d;

    /* renamed from: com.applovin.impl.b0$a */
    public interface a {
        void a(b bVar, String str);

        void a(C1676z c1676z, String str);
    }

    /* renamed from: com.applovin.impl.b0$b */
    public enum b {
        APP_DETAILS_NOT_FOUND,
        INVALID_DEVELOPER_URI,
        APPADSTXT_NOT_FOUND,
        MISSING_APPLOVIN_ENTRIES,
        MISSING_NON_APPLOVIN_ENTRIES
    }

    public C1627b0(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f21106a = kVar;
        this.f21107b = aVar;
    }

    public void a() {
        C1676z c1676z = this.f21108c;
        if (c1676z != null) {
            this.f21107b.a(c1676z, this.f21109d);
        } else {
            this.f21106a.r0().a(new v5(this.f21106a, this));
        }
    }

    public static List a(C1676z c1676z, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1624a0 c1624a0 = (C1624a0) it.next();
            List list2 = (List) c1676z.a().get(c1624a0.b());
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((C1624a0) it2.next()).a(c1624a0)) {
                        break;
                    }
                }
            }
            arrayList.add(c1624a0);
        }
        return arrayList;
    }

    @Override // com.applovin.impl.v5.b
    public void a(String str) {
        this.f21106a.r0().a(new t5(this.f21106a, str, this));
    }

    @Override // com.applovin.impl.v5.b
    public void a(b bVar) {
        this.f21107b.a(bVar, (String) null);
    }

    @Override // com.applovin.impl.t5.b
    public void a(String str, String str2) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i5 = 1;
        for (String str3 : str.split("\n")) {
            String strTrim = str3.split("#", 2)[0].trim();
            if (StringUtils.isValidString(strTrim)) {
                C1624a0 c1624a0 = new C1624a0(strTrim, i5);
                if (c1624a0.h()) {
                    String strB = c1624a0.b();
                    List arrayList2 = map.containsKey(strB) ? (List) map.get(strB) : new ArrayList();
                    if (arrayList2 != null) {
                        arrayList2.add(c1624a0);
                        map.put(strB, arrayList2);
                    }
                } else {
                    arrayList.add(c1624a0);
                }
            }
            i5++;
        }
        this.f21108c = new C1676z(map, arrayList);
        this.f21109d = str2;
        this.f21106a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21106a.O().a("AppAdsTxtService", "app-ads.txt fetched: " + this.f21108c);
        }
        this.f21107b.a(this.f21108c, str2);
    }

    @Override // com.applovin.impl.t5.b
    public void a(b bVar, String str) {
        this.f21107b.a(bVar, str);
    }
}
