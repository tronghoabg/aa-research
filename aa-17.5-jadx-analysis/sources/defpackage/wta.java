package defpackage;

import android.graphics.Typeface;

/* loaded from: classes3.dex */
public final class wta extends wtf {
    private final Typeface a;
    private final wsz b;
    private boolean c;

    public wta(wsz wszVar, Typeface typeface) {
        this.a = typeface;
        this.b = wszVar;
    }

    private final void d(Typeface typeface) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }

    @Override // defpackage.wtf
    public final void a(int i) {
        d(this.a);
    }

    @Override // defpackage.wtf
    public final void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public final void c() {
        this.c = true;
    }
}
