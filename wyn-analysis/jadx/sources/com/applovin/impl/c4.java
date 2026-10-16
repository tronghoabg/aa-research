package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class c4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f21192a;

    /* renamed from: b, reason: collision with root package name */
    private final List f21193b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21194c;

    /* renamed from: d, reason: collision with root package name */
    private Long f21195d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f21196e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Deque f21197f = new ArrayDeque();

    public c4(com.applovin.impl.sdk.k kVar) {
        this.f21192a = (String) kVar.a(y4.f23952z4);
        this.f21193b = kVar.c(y4.f23555A4);
        this.f21194c = ((Integer) kVar.a(y4.f23562B4)).intValue();
    }

    public Long a() {
        return this.f21195d;
    }

    public Deque b() {
        return this.f21197f;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str) || this.f21194c <= 0) {
            return;
        }
        Map map = (Map) this.f21196e.remove(str);
        if (CollectionUtils.isEmpty(map)) {
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("cc_ms", Long.valueOf(System.currentTimeMillis()));
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (!CollectionUtils.isEmpty(list)) {
                Iterator it = list.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                map2.put((String) entry.getKey(), Long.valueOf(jLongValue / list.size()));
            }
        }
        if (this.f21197f.size() == this.f21194c) {
            this.f21197f.pollLast();
        }
        this.f21197f.addFirst(map2);
    }

    public void b(long j8, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!CollectionUtils.isEmpty(this.f21193b) && this.f21194c > 0) {
            Iterator it = this.f21193b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (StringUtils.isValidString(str3) && str.endsWith(str3)) {
                    a(j8, str3, str2);
                    break;
                }
            }
        }
        if (StringUtils.isValidString(this.f21192a) && str.endsWith(this.f21192a)) {
            this.f21195d = Long.valueOf(j8);
        }
    }

    private void a(long j8, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.f21196e.get(str2);
        if (map == null) {
            map = new HashMap();
            this.f21196e.put(str2, map);
        }
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        arrayList.add(Long.valueOf(j8));
    }
}
