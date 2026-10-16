package com.waze.bw.c.d;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class m implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18141b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18142c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f18143d;

    public /* synthetic */ m(Object obj, h.g.a.l lVar, int i2, int i3) {
        this.f18143d = i3;
        this.f18142c = obj;
        this.f18141b = lVar;
        this.f18140a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f18143d;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int i3 = this.f18140a;
            Object obj3 = this.f18142c;
            return v.g((l) this.f18141b, (com.waze.z.a.b.ab) obj3, i3, (Composer) obj);
        }
        if (i2 == 1) {
            ((Integer) obj2).intValue();
            int i4 = this.f18140a;
            Object obj4 = this.f18142c;
            return v.m((l) this.f18141b, (ModalBottomSheetState) obj4, i4, (Composer) obj);
        }
        if (i2 == 2) {
            ((Integer) obj2).intValue();
            int i5 = this.f18140a;
            Object obj5 = this.f18142c;
            return v.h((l) this.f18141b, (com.waze.z.a.b.ab) obj5, i5, (Composer) obj);
        }
        if (i2 == 3) {
            ((Integer) obj2).intValue();
            int i6 = this.f18140a;
            Object obj6 = this.f18142c;
            return v.f((l) this.f18141b, (com.waze.z.a.b.ab) obj6, i6, (Composer) obj);
        }
        if (i2 == 4) {
            ((Integer) obj2).intValue();
            int i7 = this.f18140a;
            ?? r0 = this.f18141b;
            return v.k((com.waze.z.a.b.ab) this.f18142c, r0, i7, (Composer) obj);
        }
        if (i2 != 5) {
            ((Integer) obj2).intValue();
            int i8 = this.f18140a;
            ?? r02 = this.f18142c;
            return ct.f((String) this.f18141b, r02, i8, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i9 = this.f18140a;
        ?? r03 = this.f18141b;
        return v.j((ModalBottomSheetState) this.f18142c, r03, i9, (Composer) obj);
    }

    public /* synthetic */ m(Object obj, Object obj2, int i2, int i3) {
        this.f18143d = i3;
        this.f18141b = obj;
        this.f18142c = obj2;
        this.f18140a = i2;
    }
}
