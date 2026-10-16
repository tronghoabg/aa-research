package io.flutter.view;

import A7.S;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import o1.C3641c;
import u6.v;

/* loaded from: classes5.dex */
public final class s implements DisplayManager.DisplayListener, v6.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37311a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayManager f37312b;

    /* renamed from: c, reason: collision with root package name */
    public Object f37313c;

    public /* synthetic */ s(Object obj, DisplayManager displayManager, int i5) {
        this.f37311a = i5;
        this.f37313c = obj;
        this.f37312b = displayManager;
    }

    @Override // v6.k
    public void a(C3641c c3641c) {
        this.f37313c = c3641c;
        Handler handlerJ = v.j(null);
        DisplayManager displayManager = this.f37312b;
        displayManager.registerDisplayListener(this, handlerJ);
        c3641c.d(displayManager.getDisplay(0));
    }

    @Override // v6.k
    public void b() {
        this.f37312b.unregisterDisplayListener(this);
        this.f37313c = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i5) {
        switch (this.f37311a) {
            case 1:
                Iterator it = ((ArrayList) this.f37313c).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayAdded(i5);
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i5) {
        switch (this.f37311a) {
            case 0:
                if (i5 == 0) {
                    float refreshRate = this.f37312b.getDisplay(0).getRefreshRate();
                    S s10 = (S) this.f37313c;
                    s10.f690b = (long) (1.0E9d / refreshRate);
                    ((FlutterJNI) s10.f691c).setRefreshRateFPS(refreshRate);
                    break;
                }
                break;
            case 1:
                if (this.f37312b.getDisplay(i5) != null) {
                    Iterator it = ((ArrayList) this.f37313c).iterator();
                    while (it.hasNext()) {
                        ((DisplayManager.DisplayListener) it.next()).onDisplayChanged(i5);
                    }
                    break;
                }
                break;
            case 2:
                if (i5 == 0) {
                    q2.o.a((q2.o) this.f37313c, this.f37312b.getDisplay(0));
                    break;
                }
                break;
            default:
                C3641c c3641c = (C3641c) this.f37313c;
                if (c3641c != null && i5 == 0) {
                    c3641c.d(this.f37312b.getDisplay(0));
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i5) {
        switch (this.f37311a) {
            case 1:
                Iterator it = ((ArrayList) this.f37313c).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayRemoved(i5);
                }
                break;
        }
    }

    public s(DisplayManager displayManager) {
        this.f37311a = 3;
        this.f37312b = displayManager;
    }

    private final void c(int i5) {
    }

    private final void d(int i5) {
    }

    private final void e(int i5) {
    }

    private final void f(int i5) {
    }

    private final void g(int i5) {
    }

    private final void h(int i5) {
    }
}
