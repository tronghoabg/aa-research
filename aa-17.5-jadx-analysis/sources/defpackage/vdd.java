package defpackage;

import com.google.android.libraries.maps.GoogleMap;

/* loaded from: classes3.dex */
public final class vdd extends vea {
    private final GoogleMap.CancelableCallback a;

    public vdd(GoogleMap.CancelableCallback cancelableCallback) {
        this.a = cancelableCallback;
    }

    @Override // defpackage.veb
    public final void a() {
        this.a.onCancel();
    }

    @Override // defpackage.veb
    public final void b() {
        this.a.onFinish();
    }
}
