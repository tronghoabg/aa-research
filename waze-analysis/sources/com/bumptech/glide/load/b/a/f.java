package com.bumptech.glide.load.b.a;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.b.ad;
import com.bumptech.glide.load.n;
import com.bumptech.glide.load.s;
import com.google.android.gms.common.api.internal.be;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f implements ad {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3199a;

    /* renamed from: b, reason: collision with root package name */
    private final ad f3200b;

    /* renamed from: c, reason: collision with root package name */
    private final ad f3201c;

    /* renamed from: d, reason: collision with root package name */
    private final Class f3202d;

    f(Context context, ad adVar, ad adVar2, Class cls) {
        this.f3199a = context.getApplicationContext();
        this.f3200b = adVar;
        this.f3201c = adVar2;
        this.f3202d = cls;
    }

    @Override // com.bumptech.glide.load.b.ad
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return n.m((Uri) obj);
    }

    @Override // com.bumptech.glide.load.b.ad
    public final /* bridge */ /* synthetic */ be b(Object obj, int i2, int i3, s sVar) {
        Uri uri = (Uri) obj;
        return new be(new com.bumptech.glide.f.d(uri), new e(this.f3199a, this.f3200b, this.f3201c, uri, i2, i3, sVar, this.f3202d));
    }
}
