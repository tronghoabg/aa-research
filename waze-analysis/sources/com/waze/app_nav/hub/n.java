package com.waze.app_nav.hub;

import androidx.car.app.CarContext;
import androidx.car.app.Screen;
import com.waze.car_lib.r.ay;
import com.waze.car_lib.screens.cf;
import com.waze.settings.bp;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class n implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15357b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f15358c;

    public /* synthetic */ n(Object obj, Object obj2, int i2) {
        this.f15358c = i2;
        this.f15356a = obj;
        this.f15357b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlinx.coroutines.af] */
    /* JADX WARN: Type inference failed for: r0v28, types: [com.waze.car_lib.r.b.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v44, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v46, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v49, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v51, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v53, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v55, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        byte[] bArr = null;
        switch (this.f15358c) {
            case 0:
                break;
            case 1:
                this.f15357b.invoke();
                ((Screen) this.f15356a).finish();
                break;
            case 2:
                Object obj = this.f15356a;
                ((cf) obj).n().a(new n(this.f15357b, obj, 1, bArr));
                break;
            case 3:
                ((com.waze.car_lib.c.n) this.f15356a).d((com.waze.settings.tree.f) this.f15357b);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                ((com.waze.car_lib.r.a) this.f15356a).b((String) this.f15357b);
                break;
            case 10:
                ((ay) this.f15356a).d(this.f15357b);
                break;
            case 11:
                ((ay) this.f15357b).c((CarContext) this.f15356a);
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                com.waze.car_lib.r.b.a aVarA = this.f15356a.a();
                if (aVarA != null) {
                    break;
                }
                break;
            case 16:
                Object obj2 = this.f15356a;
                this.f15357b.invoke(obj2);
                bp bpVarC = ((com.waze.settings.tree.d.h) obj2).c();
                if (bpVarC != null) {
                    bpVarC.a(null);
                }
                break;
            case 17:
                this.f15357b.invoke(this.f15356a);
                break;
            case 18:
                this.f15357b.invoke(this.f15356a);
                break;
            case 19:
                this.f15357b.invoke(this.f15356a);
                break;
            default:
                this.f15357b.invoke(this.f15356a);
                break;
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ n(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f15358c = i2;
        this.f15357b = obj;
        this.f15356a = obj2;
    }
}
