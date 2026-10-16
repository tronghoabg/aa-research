package Yc;

import android.content.Intent;

/* loaded from: classes5.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f16777a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16778b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugins.firebase.messaging.a f16779c;

    public j(io.flutter.plugins.firebase.messaging.a aVar, Intent intent, int i5) {
        this.f16779c = aVar;
        this.f16777a = intent;
        this.f16778b = i5;
    }

    @Override // Yc.k
    public final void a() {
        this.f16779c.stopSelf(this.f16778b);
    }

    @Override // Yc.k
    public final Intent getIntent() {
        return this.f16777a;
    }
}
