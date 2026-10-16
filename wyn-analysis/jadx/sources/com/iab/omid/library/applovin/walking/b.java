package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.async.b;
import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b implements b.InterfaceC0156b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f27952a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.walking.async.c f27953b;

    public b(com.iab.omid.library.applovin.walking.async.c cVar) {
        this.f27953b = cVar;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0156b
    public JSONObject a() {
        return this.f27952a;
    }

    public void b() {
        this.f27953b.b(new d(this));
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0156b
    public void a(JSONObject jSONObject) {
        this.f27952a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j8) {
        this.f27953b.b(new f(this, hashSet, jSONObject, j8));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j8) {
        this.f27953b.b(new e(this, hashSet, jSONObject, j8));
    }
}
