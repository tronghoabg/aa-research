package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wtx extends defpackage.wuc {
    private final android.graphics.Typeface a;
    private final defpackage.wtw b;
    private boolean c;

    public wtx(defpackage.wtw wtwVar, android.graphics.Typeface typeface) {
        this.a = typeface;
        this.b = wtwVar;
    }

    private final void d(android.graphics.Typeface typeface) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }

    @Override // defpackage.wuc
    public final void a(int i) {
        d(this.a);
    }

    @Override // defpackage.wuc
    public final void b(android.graphics.Typeface typeface, boolean z) {
        d(typeface);
    }

    public final void c() {
        this.c = true;
    }
}
