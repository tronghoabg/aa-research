package com.google.android.libraries.phenotype.client.stable;

import com.airbnb.lottie.LottieAnimationView;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class au implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6088b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f6089c;

    public /* synthetic */ au(Object obj, Object obj2, int i2) {
        this.f6089c = i2;
        this.f6087a = obj;
        this.f6088b = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        int i2 = this.f6089c;
        if (i2 == 0) {
            ay.f((ay) this.f6087a, (ba) this.f6088b);
            return null;
        }
        if (i2 == 1) {
            return LottieAnimationView.d((LottieAnimationView) this.f6087a, (String) this.f6088b);
        }
        if (i2 == 2) {
            Object obj = this.f6088b;
            com.google.firebase.appcheck.debug.a.b bVar = (com.google.firebase.appcheck.debug.a.b) this.f6087a;
            return bVar.f8886c.b(((com.google.android.libraries.e.a.a.b) obj).c().getBytes("UTF-8"), 2, bVar.f8889f);
        }
        ?? r2 = this.f6088b;
        if (i2 != 3) {
            ((com.google.firebase.remoteconfig.internal.f) this.f6087a).f10667d.e((com.google.firebase.remoteconfig.internal.h) r2);
            return null;
        }
        com.google.firebase.crashlytics.a.d.t tVar = (com.google.firebase.crashlytics.a.d.t) this.f6087a;
        tVar.f9273a.i(tVar.f9275c, r2);
        return null;
    }
}
