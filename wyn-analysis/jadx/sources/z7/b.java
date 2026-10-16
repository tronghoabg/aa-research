package Z7;

import a1.AbstractC1312b;
import android.graphics.Typeface;

/* loaded from: classes4.dex */
public final class b extends AbstractC1312b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Fe.b f17013h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f17014i;

    public b(d dVar, Fe.b bVar) {
        this.f17014i = dVar;
        this.f17013h = bVar;
    }

    @Override // a1.AbstractC1312b
    public final void j(int i5) {
        this.f17014i.f17030m = true;
        this.f17013h.K(i5);
    }

    @Override // a1.AbstractC1312b
    public final void k(Typeface typeface) {
        d dVar = this.f17014i;
        dVar.f17031n = Typeface.create(typeface, dVar.f17021c);
        dVar.f17030m = true;
        this.f17013h.L(dVar.f17031n, false);
    }
}
