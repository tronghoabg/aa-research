package com.waze.reports;

import androidx.camera.lifecycle.ProcessCameraProvider;
import com.waze.mywaze.MyWazeNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class dv implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f33880a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33881b;

    public /* synthetic */ dv(Object obj, int i2) {
        this.f33881b = i2;
        this.f33880a = obj;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f33881b;
        if (i2 == 0) {
            return eb.g((eb) this.f33880a, (ProcessCameraProvider) obj);
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return eb.f((eb) this.f33880a, (ProcessCameraProvider) obj);
            }
            if (i2 != 3) {
                return eb.d((eb) this.f33880a, (ProcessCameraProvider) obj);
            }
            return eb.h((eb) this.f33880a, (ProcessCameraProvider) obj);
        }
        com.waze.sharedui.e.c cVar = (com.waze.sharedui.e.c) obj;
        com.waze.reports_v2.d.j.f34595a.a().P(com.waze.reports_v2.d.e.f34577k, 15, ((di) this.f33880a).h(), !cVar.f().g() ? cVar.f() : null);
        com.waze.share.aa.f(com.waze.share.z.f37758e, MyWazeNativeManager.getInstance().GetLastShareURL());
        return null;
    }
}
