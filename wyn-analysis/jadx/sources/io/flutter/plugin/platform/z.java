package io.flutter.plugin.platform;

import android.view.View;

/* loaded from: classes5.dex */
public final class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37173b;

    public /* synthetic */ z(Object obj, int i5) {
        this.f37172a = i5;
        this.f37173b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37172a) {
            case 0:
                G3.i iVar = (G3.i) this.f37173b;
                ((View) iVar.f4210b).postDelayed((m) iVar.f4211c, 128L);
                break;
            default:
                A a5 = (A) this.f37173b;
                a5.f37077a.getViewTreeObserver().removeOnDrawListener(a5);
                break;
        }
    }
}
