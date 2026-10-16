package com.waze.ui.b;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class t implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42097c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f42098d;

    public /* synthetic */ t(int i2, Modifier modifier, int i3, int i4) {
        this.f42098d = i4;
        this.f42095a = i2;
        this.f42097c = modifier;
        this.f42096b = i3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f42098d != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f42096b;
            int i3 = this.f42095a;
            return z.f((as) this.f42097c, i3, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i4 = this.f42096b;
        ?? r0 = this.f42097c;
        return z.e(this.f42095a, r0, i4, (Composer) obj);
    }

    public /* synthetic */ t(as asVar, int i2, int i3, int i4) {
        this.f42098d = i4;
        this.f42097c = asVar;
        this.f42095a = i2;
        this.f42096b = i3;
    }
}
