package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f27943c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f27944d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f27945e;

    public a(b.InterfaceC0156b interfaceC0156b, HashSet<String> hashSet, JSONObject jSONObject, long j8) {
        super(interfaceC0156b);
        this.f27943c = new HashSet<>(hashSet);
        this.f27944d = jSONObject;
        this.f27945e = j8;
    }
}
