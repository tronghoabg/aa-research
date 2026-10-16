package com.iab.omid.library.vungle.walking.async;

import com.iab.omid.library.vungle.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet<String> f28233c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f28234d;

    /* renamed from: e, reason: collision with root package name */
    public final long f28235e;

    public a(b.InterfaceC0166b interfaceC0166b, HashSet<String> hashSet, JSONObject jSONObject, long j8) {
        super(interfaceC0166b);
        this.f28233c = new HashSet<>(hashSet);
        this.f28234d = jSONObject;
        this.f28235e = j8;
    }
}
