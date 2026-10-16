package com.bumptech.glide.load.b;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.api.internal.be;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n implements ad {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3263a;

    /* renamed from: b, reason: collision with root package name */
    private final m f3264b;

    n(Context context, m mVar) {
        this.f3263a = context.getApplicationContext();
        this.f3264b = mVar;
    }

    public static ae c(Context context) {
        return new k(context, 1);
    }

    public static ae d(Context context) {
        return new k(context, 0);
    }

    public static ae e(Context context) {
        return new k(context, 2);
    }

    @Override // com.bumptech.glide.load.b.ad
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // com.bumptech.glide.load.b.ad
    public final /* bridge */ /* synthetic */ be b(Object obj, int i2, int i3, com.bumptech.glide.load.s sVar) {
        Integer num = (Integer) obj;
        Resources.Theme theme = (Resources.Theme) sVar.b(com.bumptech.glide.load.c.c.g.f3395a);
        return new be(new com.bumptech.glide.f.d(num), new l(theme, theme != null ? theme.getResources() : this.f3263a.getResources(), this.f3264b, num.intValue()));
    }
}
