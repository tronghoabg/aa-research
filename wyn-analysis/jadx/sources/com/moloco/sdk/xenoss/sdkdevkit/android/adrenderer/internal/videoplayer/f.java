package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import E5.I;
import Ef.C0502n;
import ef.C2515C;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: classes4.dex */
public final class f implements tf.l, Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32223a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f32224b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f32225c;

    public /* synthetic */ f(int i5, Object obj, Object obj2) {
        this.f32223a = i5;
        this.f32224b = obj;
        this.f32225c = obj2;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f32223a) {
            case 0:
                ((I) this.f32224b).C0((g) this.f32225c);
                break;
            default:
                try {
                    ((Call) this.f32224b).cancel();
                } catch (Throwable unused) {
                }
                break;
        }
        return C2515C.f34653a;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        if (call.getF42590o()) {
            return;
        }
        ((C0502n) this.f32225c).resumeWith(Fe.e.z(iOException));
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        ((C0502n) this.f32225c).resumeWith(response);
    }
}
