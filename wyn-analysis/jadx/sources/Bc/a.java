package Bc;

import android.hardware.camera2.CaptureRequest;
import zc.AbstractC4660a;

/* loaded from: classes5.dex */
public final class a extends AbstractC4660a {

    /* renamed from: b, reason: collision with root package name */
    public int f1667b;

    @Override // zc.AbstractC4660a
    public final void a(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(this.f1667b == 2));
    }
}
