package com.waze.car_lib.p;

import androidx.car.app.CarContext;
import androidx.car.app.model.OnClickListener;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class w implements OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f20834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20835b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f20836c;

    public /* synthetic */ w(Object obj, Object obj2, int i2) {
        this.f20836c = i2;
        this.f20834a = obj;
        this.f20835b = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [h.g.a.l, java.lang.Object] */
    @Override // androidx.car.app.model.OnClickListener
    public final void onClick() {
        int i2 = this.f20836c;
        if (i2 == 0) {
            this.f20834a.invoke(((aa) this.f20835b).c());
        } else if (i2 == 1) {
            this.f20834a.invoke(this.f20835b);
        } else if (i2 != 2) {
            this.f20834a.invoke(this.f20835b);
        } else {
            ((cm) this.f20834a).a().invoke();
            ((CarContext) this.f20835b).getOnBackPressedDispatcher().onBackPressed();
        }
    }
}
