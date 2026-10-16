package io.flutter.plugin.platform;

import android.os.Build;

/* loaded from: classes5.dex */
public final class w implements io.flutter.view.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f37165a;

    public w(x xVar) {
        this.f37165a = xVar;
    }

    @Override // io.flutter.view.p
    public final void onTrimMemory(int i5) {
        if (i5 != 80 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f37165a.f37168c = true;
    }
}
