package io.flutter.embedding.engine.renderer;

import io.flutter.view.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f36977b;

    public /* synthetic */ d(p pVar, int i5) {
        this.f36976a = i5;
        this.f36977b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36976a) {
            case 0:
                ((FlutterRenderer$ImageReaderSurfaceProducer) this.f36977b).lambda$dequeueImage$0();
                break;
            default:
                ((i) this.f36977b).getClass();
                break;
        }
    }
}
