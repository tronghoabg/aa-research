package defpackage;

import android.graphics.Typeface;

/* loaded from: classes3.dex */
final class wtc extends duz {
    final /* synthetic */ wtf a;
    final /* synthetic */ wte b;

    public wtc(wte wteVar, wtf wtfVar) {
        this.a = wtfVar;
        this.b = wteVar;
    }

    @Override // defpackage.duz
    public final void a(int i) {
        this.b.o = true;
        this.a.a(i);
    }

    @Override // defpackage.duz
    public final void b(Typeface typeface) {
        wte wteVar = this.b;
        wteVar.m = Typeface.create(typeface, wteVar.d);
        wteVar.o = true;
        this.a.b(wteVar.m, false);
    }
}
