package kotlinx.coroutines.i;

import com.google.android.gms.o.k;
import com.google.android.gms.o.t;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.k f52052a;

    b(kotlinx.coroutines.k kVar) {
        this.f52052a = kVar;
    }

    @Override // com.google.android.gms.o.k
    public final void a(t tVar) {
        Exception excF = tVar.f();
        if (excF != null) {
            this.f52052a.resumeWith(e.b.c.a(excF));
            return;
        }
        boolean zI = tVar.i();
        kotlinx.coroutines.k kVar = this.f52052a;
        if (zI) {
            kVar.f(null);
        } else {
            kVar.resumeWith(tVar.g());
        }
    }
}
