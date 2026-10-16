package com.iab.omid.library.vungle.attestation;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, k> f28101d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private static volatile c f28102e;

    /* renamed from: a, reason: collision with root package name */
    private final d f28103a = new d();

    /* renamed from: b, reason: collision with root package name */
    private final Context f28104b;

    /* renamed from: c, reason: collision with root package name */
    private volatile List<b> f28105c;

    private c(Context context) {
        this.f28104b = context != null ? context.getApplicationContext() : null;
        c();
    }

    public static c a(Context context) {
        if (f28102e == null) {
            synchronized (c.class) {
                try {
                    if (f28102e == null) {
                        f28102e = new c(context);
                    }
                } finally {
                }
            }
        }
        return f28102e;
    }

    private void c() {
        f28101d.put("FireTVFOSDAT", j.a(this.f28104b));
    }

    public boolean b() {
        return a().size() > 0;
    }

    public List<b> a() {
        List<b> list;
        b bVarA;
        if (this.f28105c != null) {
            return this.f28105c;
        }
        synchronized (this) {
            if (this.f28105c != null) {
                list = this.f28105c;
            } else {
                try {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry<String, k> entry : f28101d.entrySet()) {
                        if (entry.getValue().a() && (bVarA = this.f28103a.a(entry.getKey(), this.f28104b)) != null) {
                            arrayList.add(bVarA);
                        }
                    }
                    this.f28105c = arrayList;
                    list = this.f28105c;
                } catch (Exception e7) {
                    com.iab.omid.library.vungle.utils.d.a("Error getting supported attestation mechanisms", e7);
                    this.f28105c = new ArrayList();
                    return this.f28105c;
                }
            }
        }
        return list;
    }

    public boolean a(String str) {
        k kVar = f28101d.get(str);
        if (kVar != null) {
            return kVar.a();
        }
        return false;
    }
}
