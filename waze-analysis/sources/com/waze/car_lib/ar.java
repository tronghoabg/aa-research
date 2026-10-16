package com.waze.car_lib;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import androidx.car.app.CarContext;
import androidx.car.app.CarToast;
import com.waze.R;
import com.waze.car_lib.f.hr;
import com.waze.car_lib.r.de;
import com.waze.config.ConfigValues;
import com.waze.dv;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ar implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f18898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18899b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f18900c;

    public /* synthetic */ ar(Object obj, Object obj2, int i2) {
        this.f18900c = i2;
        this.f18898a = obj;
        this.f18899b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.car_lib.i.b.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.waze.car_lib.i.b.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [com.waze.t.b.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    /* JADX WARN: Type inference failed for: r4v34, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v36, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v44, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v48, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v50, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v52, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f18900c) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                CarToast.makeText((CarContext) this.f18898a, this.f18899b.c(R.string.NETWORK_WARNING_TEXT, new Object[0]), 1).show();
                break;
            case 5:
                Object obj = this.f18899b;
                h.g.b.x.f(obj, "wazePlace");
                ((com.waze.shared_infra.coordinators.s) this.f18898a).H(new hr((com.waze.av.b.aa) obj));
                break;
            case 6:
                ((de) this.f18898a).f21365a.a("flow closed, closing active controller");
                this.f18899b.close();
                break;
            case 7:
                break;
            case 8:
                int i2 = com.waze.closure.d.e.f22495a;
                ((com.waze.closure.c.i) this.f18898a).f();
                this.f18899b.invoke();
                break;
            case 9:
                com.waze.config.f fVar = (com.waze.config.f) this.f18898a;
                Object objB = fVar.b();
                ?? r4 = this.f18899b;
                r4.c(objB);
                com.waze.config.h.f22637a.a().d(fVar, new dv(r4, 7));
                break;
            case 10:
                com.waze.config.f fVar2 = (com.waze.config.f) this.f18898a;
                com.waze.config.n nVar = new com.waze.config.n(fVar2.b(), false);
                ?? r42 = this.f18899b;
                r42.c(nVar);
                com.waze.config.h.f22637a.a().d(fVar2, new dv(r42, 6));
                break;
            case 11:
                com.waze.sharedui.web.at.f((Context) this.f18898a, ConfigValues.CONFIG_VALUE_FORCE_UPGRADE_PLAY_STORE_URL_ANDROID.b());
                ((com.waze.app_nav.hub.b.i) this.f18899b).b(false);
                break;
            case 12:
                int i3 = com.waze.z.a.aj.f45635a;
                this.f18899b.invoke(this.f18898a);
                break;
            case 13:
                int i4 = com.waze.z.a.c.q.f45886a;
                Object obj2 = this.f18898a;
                this.f18899b.invoke(obj2, ((com.waze.z.a.c.b) obj2).a());
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                this.f18898a.setValue(Boolean.valueOf(false));
                this.f18899b.invoke(com.waze.z.a.d.k.f45965a);
                break;
            case 17:
                ((ActivityResultLauncher) this.f18899b).launch(this.f18898a);
                break;
            case 18:
                this.f18899b.invoke(this.f18898a);
                break;
            case 19:
                this.f18899b.invoke(this.f18898a);
                break;
            default:
                this.f18899b.invoke(this.f18898a);
                break;
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ ar(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f18900c = i2;
        this.f18899b = obj;
        this.f18898a = obj2;
    }
}
