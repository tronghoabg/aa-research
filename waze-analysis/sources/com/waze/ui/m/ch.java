package com.waze.ui.m;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.painter.Painter;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ch implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42857c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42858d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f42859e;

    public /* synthetic */ ch(Object obj, Object obj2, Object obj3, int i2, int i3) {
        this.f42859e = i3;
        this.f42856b = obj;
        this.f42857c = obj2;
        this.f42858d = obj3;
        this.f42855a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.foundation.layout.RowScope, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f42859e;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int i3 = this.f42855a;
            ?? r0 = this.f42858d;
            Object obj3 = this.f42857c;
            return dc.I(this.f42856b, (ci) obj3, r0, i3, (Composer) obj);
        }
        if (i2 != 1) {
            ((Integer) obj2).intValue();
            int i4 = this.f42855a;
            ?? r02 = this.f42858d;
            ?? r1 = this.f42857c;
            return dc.p((ModalBottomSheetState) this.f42856b, r1, r02, i4, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i5 = this.f42855a;
        ?? r03 = this.f42858d;
        Object obj4 = this.f42856b;
        return dc.R((String) this.f42857c, (Painter) obj4, r03, i5, (Composer) obj);
    }

    public /* synthetic */ ch(String str, Painter painter, h.g.a.a aVar, int i2, int i3) {
        this.f42859e = i3;
        this.f42857c = str;
        this.f42856b = painter;
        this.f42858d = aVar;
        this.f42855a = i2;
    }
}
