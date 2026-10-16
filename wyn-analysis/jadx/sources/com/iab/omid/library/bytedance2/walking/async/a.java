package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f28070c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f28071d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f28072e;

    public a(b.InterfaceC0160b interfaceC0160b, HashSet<String> hashSet, JSONObject jSONObject, long j8) {
        super(interfaceC0160b);
        this.f28070c = new HashSet<>(hashSet);
        this.f28071d = jSONObject;
        this.f28072e = j8;
    }
}
