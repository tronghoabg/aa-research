package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dat implements defpackage.dck {
    private final android.view.ViewConfiguration a;

    public dat(android.view.ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.dck
    public final float a() {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return axd$.ExternalSyntheticApiModelOutline0.m(this.a);
        }
        return 16.0f;
    }

    @Override // defpackage.dck
    public final float b() {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return axd$.ExternalSyntheticApiModelOutline0.m$1(this.a);
        }
        return 2.0f;
    }

    @Override // defpackage.dck
    public final float c() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.dck
    public final float d() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.dck
    public final long e() {
        return android.view.ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.dck
    public final long f() {
        return android.view.ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.dck
    public final /* synthetic */ long g() {
        return defpackage.tna.aK(48.0f, 48.0f);
    }

    @Override // defpackage.dck
    public final void h() {
    }
}
