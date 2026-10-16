package com.waze.sdk;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class g implements as {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ae f35380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35381b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35382c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f35383d;

    public /* synthetic */ g(ae aeVar, Object obj, Object obj2, int i2) {
        this.f35383d = i2;
        this.f35380a = aeVar;
        this.f35381b = obj;
        this.f35382c = obj2;
    }

    @Override // com.waze.sdk.as
    public final void a(Drawable drawable) {
        int i2 = this.f35383d;
        Object obj = this.f35382c;
        if (i2 != 0) {
            ae.w(this.f35380a, (an) this.f35381b, (View[]) obj, drawable);
        } else {
            ae.u(this.f35380a, (String) this.f35381b, (String) obj, drawable);
        }
    }
}
