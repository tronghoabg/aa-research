package com.waze.car_lib.i.a;

import android.view.View;
import android.view.ViewTreeObserver;
import com.waze.map.dw;
import com.waze.map.main.bm;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class d implements com.waze.shared_infra.s.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f19858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19859b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f19860c;

    public /* synthetic */ d(Object obj, Object obj2, int i2) {
        this.f19860c = i2;
        this.f19858a = obj;
        this.f19859b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.car.app.SurfaceCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.waze.shared_infra.s.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.waze.app_nav.hub.b.c, java.lang.Object] */
    @Override // com.waze.shared_infra.s.d
    public final void a() {
        int i2 = this.f19860c;
        if (i2 == 0) {
            f.c((f) this.f19858a, this.f19859b);
            return;
        }
        if (i2 == 1) {
            ((View) this.f19859b).getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this.f19858a);
            return;
        }
        if (i2 == 2) {
            ((dw) this.f19859b).f28778g.remove((com.google.firebase.messaging.l) this.f19858a);
        } else {
            ?? r1 = this.f19858a;
            if (i2 != 3) {
                this.f19859b.c((com.waze.app_nav.hub.b.k) r1);
            } else {
                r1.a();
                ((bm) this.f19859b).f29397i.b();
            }
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f19860c = i2;
        this.f19859b = obj;
        this.f19858a = obj2;
    }
}
