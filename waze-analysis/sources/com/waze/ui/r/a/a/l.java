package com.waze.ui.r.a.a;

import android.content.Context;
import androidx.compose.runtime.DisposableEffectResult;
import com.waze.reports.cx;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements DisposableEffectResult {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f43288a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.bumptech.glide.e.a.c f43289b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cx f43290c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f43291d;

    public l(Context context, com.bumptech.glide.e.a.c cVar, cx cxVar, int i2) {
        this.f43291d = i2;
        this.f43288a = context;
        this.f43289b = cVar;
        this.f43290c = cxVar;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        int i2 = this.f43291d;
        Context context = this.f43288a;
        try {
            if (i2 != 0) {
                com.bumptech.glide.c.e(context).f(this.f43289b);
                this.f43290c.b(c.f43268a);
            } else {
                com.bumptech.glide.c.e(context).f(this.f43289b);
                this.f43290c.b(c.f43268a);
            }
        } catch (IllegalArgumentException unused) {
        }
    }
}
