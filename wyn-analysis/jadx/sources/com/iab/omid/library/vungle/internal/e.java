package com.iab.omid.library.vungle.internal;

import android.view.View;
import com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.vungle.weakreference.a f28151a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28152b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f28153c;

    /* renamed from: d, reason: collision with root package name */
    private final String f28154d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f28151a = new com.iab.omid.library.vungle.weakreference.a(view);
        this.f28152b = view.getClass().getCanonicalName();
        this.f28153c = friendlyObstructionPurpose;
        this.f28154d = str;
    }

    public String a() {
        return this.f28154d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f28153c;
    }

    public com.iab.omid.library.vungle.weakreference.a c() {
        return this.f28151a;
    }

    public String d() {
        return this.f28152b;
    }
}
