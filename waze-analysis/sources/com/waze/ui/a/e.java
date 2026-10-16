package com.waze.ui.a;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.painter.Painter;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class e implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41653b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f41654c;

    public /* synthetic */ e(Object obj, int i2, int i3) {
        this.f41654c = i3;
        this.f41653b = obj;
        this.f41652a = i2;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f41654c;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int i3 = this.f41652a;
            return l.j((Painter) this.f41653b, i3, (Composer) obj);
        }
        if (i2 != 1) {
            ((Integer) obj2).intValue();
            int i4 = this.f41652a;
            return l.i(this.f41653b, i4, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i5 = this.f41652a;
        return l.m((u) this.f41653b, i5, (Composer) obj);
    }
}
