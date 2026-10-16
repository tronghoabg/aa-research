package com.iab.omid.library.vungle.walking;

import com.iab.omid.library.vungle.walking.async.b;
import com.iab.omid.library.vungle.walking.async.d;
import com.iab.omid.library.vungle.walking.async.e;
import com.iab.omid.library.vungle.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b implements b.InterfaceC0166b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f28242a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.vungle.walking.async.c f28243b;

    public b(com.iab.omid.library.vungle.walking.async.c cVar) {
        this.f28243b = cVar;
    }

    @Override // com.iab.omid.library.vungle.walking.async.b.InterfaceC0166b
    public JSONObject a() {
        return this.f28242a;
    }

    public void b() {
        this.f28243b.b(new d(this));
    }

    @Override // com.iab.omid.library.vungle.walking.async.b.InterfaceC0166b
    public void a(JSONObject jSONObject) {
        this.f28242a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j8) {
        this.f28243b.b(new f(this, hashSet, jSONObject, j8));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j8) {
        this.f28243b.b(new e(this, hashSet, jSONObject, j8));
    }
}
