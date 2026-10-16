package com.waze.search.e;

import androidx.compose.runtime.Composer;
import com.waze.settings.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class e implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35622b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f35623c;

    public /* synthetic */ e(Object obj, int i2, int i3) {
        this.f35623c = i3;
        this.f35622b = obj;
        this.f35621a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f35623c != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f35621a;
            return g.f((com.waze.settings.v) this.f35622b, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f35621a;
        return g.e((ai) this.f35622b, i3, (Composer) obj);
    }
}
