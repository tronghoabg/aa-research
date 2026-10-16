package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.weakreference.a f27999a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28000b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f28001c;

    /* renamed from: d, reason: collision with root package name */
    private final String f28002d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f27999a = new com.iab.omid.library.bytedance2.weakreference.a(view);
        this.f28000b = view.getClass().getCanonicalName();
        this.f28001c = friendlyObstructionPurpose;
        this.f28002d = str;
    }

    public String a() {
        return this.f28002d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f28001c;
    }

    public com.iab.omid.library.bytedance2.weakreference.a c() {
        return this.f27999a;
    }

    public String d() {
        return this.f28000b;
    }
}
