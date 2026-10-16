package com.waze.g;

import androidx.car.app.Session;
import com.waze.ifs.ui.y;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class g implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23999a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24000b;

    public /* synthetic */ g(Object obj, int i2) {
        this.f24000b = i2;
        this.f23999a = obj;
    }

    @Override // com.waze.ifs.ui.y
    public final void onShutdown() {
        int i2 = this.f24000b;
        Object obj = this.f23999a;
        if (i2 != 0) {
            ((Session) obj).getCarContext().finishCarApp();
        } else {
            h.c((h) obj);
        }
    }
}
