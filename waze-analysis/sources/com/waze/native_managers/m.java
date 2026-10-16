package com.waze.native_managers;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m implements a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f30701a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f30702b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f30703c;

    m(Runnable runnable, Runnable runnable2, int i2) {
        this.f30703c = i2;
        this.f30701a = runnable;
        this.f30702b = runnable2;
    }

    @Override // com.waze.native_managers.a
    public final void a() {
        int i2 = this.f30703c;
        Runnable runnable = this.f30701a;
        if (i2 == 0) {
            runnable.run();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f30703c;
        Runnable runnable = this.f30702b;
        if (i2 != 0) {
            runnable.run();
        } else {
            runnable.run();
        }
    }
}
