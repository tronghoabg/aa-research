package io.flutter.embedding.engine.renderer;

import U1.C0850u;
import Va.M6;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1457v;
import java.util.Iterator;
import jd.C3100b;

/* loaded from: classes5.dex */
public final class b implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f36972a;

    public b(k kVar) {
        this.f36972a = kVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC1457v interfaceC1457v) {
        M6.c(interfaceC1457v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC1457v interfaceC1457v) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(InterfaceC1457v interfaceC1457v) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC1457v interfaceC1457v) {
        Iterator it = this.f36972a.f37014g.iterator();
        while (it.hasNext()) {
            FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = (FlutterRenderer$ImageReaderSurfaceProducer) it.next();
            if (flutterRenderer$ImageReaderSurfaceProducer.callback != null && flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy) {
                flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy = false;
                C3100b c3100b = (C3100b) flutterRenderer$ImageReaderSurfaceProducer.callback;
                if (c3100b.f38755e) {
                    ((C0850u) c3100b.f36424d).L0(c3100b.f36422b.getSurface());
                    c3100b.f38755e = false;
                }
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(InterfaceC1457v interfaceC1457v) {
        M6.e(interfaceC1457v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(InterfaceC1457v interfaceC1457v) {
    }
}
