package com.iab.omid.library.bytedance2.walking;

import com.iab.omid.library.bytedance2.walking.async.b;
import com.iab.omid.library.bytedance2.walking.async.d;
import com.iab.omid.library.bytedance2.walking.async.e;
import com.iab.omid.library.bytedance2.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b implements b.InterfaceC0160b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f28079a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.walking.async.c f28080b;

    public b(com.iab.omid.library.bytedance2.walking.async.c cVar) {
        this.f28080b = cVar;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0160b
    public JSONObject a() {
        return this.f28079a;
    }

    public void b() {
        this.f28080b.b(new d(this));
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0160b
    public void a(JSONObject jSONObject) {
        this.f28079a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j8) {
        this.f28080b.b(new f(this, hashSet, jSONObject, j8));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j8) {
        this.f28080b.b(new e(this, hashSet, jSONObject, j8));
    }
}
