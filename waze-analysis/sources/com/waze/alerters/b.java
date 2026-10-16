package com.waze.alerters;

import com.waze.hw;
import com.waze.jni.protos.alerters.RejectedAlert;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f14219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14220b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f14221c;

    public /* synthetic */ b(f fVar, Object obj, int i2) {
        this.f14221c = i2;
        this.f14219a = fVar;
        this.f14220b = obj;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f14221c;
        if (i2 == 0) {
            f.onAlertEnd$lambda$0(this.f14219a, (byte[]) this.f14220b);
            return null;
        }
        if (i2 == 1) {
            f.playSound$lambda$0(this.f14219a, (byte[]) this.f14220b);
            return null;
        }
        if (i2 == 2) {
            f.onAlertTimeoutStarted$lambda$0(this.f14219a, (byte[]) this.f14220b);
            return null;
        }
        Object obj = this.f14220b;
        if (i2 != 3) {
            f.onAlertStart$lambda$0(this.f14219a, (byte[]) obj);
            return null;
        }
        f.onAlertRejected$lambda$0(this.f14219a, (RejectedAlert) obj);
        return null;
    }
}
