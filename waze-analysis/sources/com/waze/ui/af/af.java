package com.waze.ui.af;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class af implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41816b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f41817c;

    public /* synthetic */ af(Object obj, int i2, int i3) {
        this.f41817c = i3;
        this.f41816b = obj;
        this.f41815a = i2;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f41817c != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f41815a;
            return ap.C(this.f41816b, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f41815a;
        return ap.r((String) this.f41816b, i3, (Composer) obj);
    }
}
