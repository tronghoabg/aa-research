package kc;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class q implements io.flutter.embedding.engine.renderer.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.k f39511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.applovin.adview.a f39512b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f39513c;

    public q(r rVar, io.flutter.embedding.engine.renderer.k kVar, com.applovin.adview.a aVar) {
        this.f39513c = rVar;
        this.f39511a = kVar;
        this.f39512b = aVar;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void e() throws IOException {
        m mVar;
        this.f39511a.f37008a.removeIsDisplayingFlutterUiListener(this);
        this.f39512b.run();
        r rVar = this.f39513c;
        if ((rVar.f39517d instanceof m) || (mVar = rVar.f39516c) == null) {
            return;
        }
        mVar.b();
        m mVar2 = rVar.f39516c;
        if (mVar2 != null) {
            mVar2.f39496a.close();
            rVar.removeView(rVar.f39516c);
            rVar.f39516c = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void d() {
    }
}
