package com.waze.ui.r.a.a;

import androidx.compose.runtime.Composer;
import com.waze.reports.cx;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class j implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43283a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43284b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cx f43285c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f43286d;

    public /* synthetic */ j(Object obj, cx cxVar, int i2, int i3) {
        this.f43286d = i3;
        this.f43284b = obj;
        this.f43285c = cxVar;
        this.f43283a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f43286d;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int i3 = this.f43283a;
            cx cxVar = this.f43285c;
            return t.m((com.waze.ui.ac.h) this.f43284b, cxVar, i3, (Composer) obj);
        }
        if (i2 != 1) {
            ((Integer) obj2).intValue();
            int i4 = this.f43283a;
            cx cxVar2 = this.f43285c;
            return t.l((com.waze.ui.ac.g) this.f43284b, cxVar2, i4, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i5 = this.f43283a;
        cx cxVar3 = this.f43285c;
        return t.k((com.waze.ui.ac.a) this.f43284b, cxVar3, i5, (Composer) obj);
    }
}
