package defpackage;

import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class dvg extends dsg {
    private final duz a;

    public dvg(duz duzVar) {
        super(null);
        this.a = duzVar;
    }

    @Override // defpackage.dsg
    public final void a(int i) {
        duz duzVar = this.a;
        if (duzVar != null) {
            duzVar.a(i);
        }
    }

    @Override // defpackage.dsg
    public final void b(Typeface typeface) {
        duz duzVar = this.a;
        if (duzVar != null) {
            duzVar.b(typeface);
        }
    }
}
