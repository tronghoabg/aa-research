package kc;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class c implements io.flutter.embedding.engine.renderer.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39458a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39459b;

    public /* synthetic */ c(Object obj, int i5) {
        this.f39458a = i5;
        this.f39459b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kc.e] */
    @Override // io.flutter.embedding.engine.renderer.l
    public final void d() {
        switch (this.f39458a) {
            case 0:
                f fVar = (f) this.f39459b;
                fVar.f39462a.d();
                fVar.f39468g = false;
                break;
            case 1:
                break;
            default:
                r rVar = (r) this.f39459b;
                rVar.f39520g = false;
                Iterator it = rVar.f39519f.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.l) it.next()).d();
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kc.e] */
    @Override // io.flutter.embedding.engine.renderer.l
    public final void e() {
        switch (this.f39458a) {
            case 0:
                f fVar = (f) this.f39459b;
                fVar.f39462a.e();
                fVar.f39468g = true;
                fVar.f39469h = true;
                break;
            case 1:
                n nVar = (n) this.f39459b;
                nVar.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.k kVar = nVar.f39504c;
                if (kVar != null) {
                    kVar.f37008a.removeIsDisplayingFlutterUiListener(this);
                    break;
                }
                break;
            default:
                r rVar = (r) this.f39459b;
                rVar.f39520g = true;
                Iterator it = rVar.f39519f.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.l) it.next()).e();
                }
                break;
        }
    }

    private final void a() {
    }
}
