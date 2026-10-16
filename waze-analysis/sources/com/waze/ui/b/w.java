package com.waze.ui.b;

import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class w implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f42104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42105b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f42106c;

    public /* synthetic */ w(Object obj, Object obj2, int i2) {
        this.f42106c = i2;
        this.f42104a = obj;
        this.f42105b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.f42106c != 0) {
            Object obj4 = this.f42105b;
            kotlinx.coroutines.e.al.k(this.f42104a, obj4, (h.c.j) obj3);
            return h.ab.f48028a;
        }
        int iIntValue = ((Integer) obj3).intValue();
        Object obj5 = this.f42105b;
        return z.b(this.f42104a, (ac) obj5, (FlowRowScope) obj, (Composer) obj2, iIntValue);
    }
}
