package J1;

import E4.F;
import androidx.lifecycle.b0;
import x.C4430w;

/* loaded from: classes.dex */
public class c extends b0 {

    /* renamed from: d, reason: collision with root package name */
    public static final x4.d f5537d = new x4.d(19);

    /* renamed from: b, reason: collision with root package name */
    public final C4430w f5538b = new C4430w();

    /* renamed from: c, reason: collision with root package name */
    public boolean f5539c = false;

    @Override // androidx.lifecycle.b0
    public final void b() {
        C4430w c4430w = this.f5538b;
        int i5 = c4430w.f47566c;
        for (int i10 = 0; i10 < i5; i10++) {
            b bVar = (b) c4430w.f47565b[i10];
            b7.d dVar = bVar.f5534l;
            dVar.a();
            dVar.f19379d = true;
            F f10 = bVar.f5536n;
            if (f10 != null) {
                bVar.i(f10);
            }
            b bVar2 = dVar.f19376a;
            if (bVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (bVar2 != bVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            dVar.f19376a = null;
            if (f10 != null) {
                boolean z2 = f10.f2853b;
            }
            dVar.f19380e = true;
            dVar.f19378c = false;
            dVar.f19379d = false;
            dVar.f19381f = false;
        }
        int i11 = c4430w.f47566c;
        Object[] objArr = c4430w.f47565b;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        c4430w.f47566c = 0;
    }
}
