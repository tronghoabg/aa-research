package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ju extends defpackage.dvg {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ java.lang.ref.WeakReference c;
    final /* synthetic */ defpackage.jx d;

    public ju(defpackage.jx jxVar, int i, int i2, java.lang.ref.WeakReference weakReference) {
        this.d = jxVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.dvg
    public final void b(android.graphics.Typeface typeface) {
        int i = this.a;
        if (i != -1) {
            typeface = hh$.ExternalSyntheticApiModelOutline0.m(typeface, i, (this.b & 2) != 0);
        }
        defpackage.jx jxVar = this.d;
        java.lang.ref.WeakReference weakReference = this.c;
        if (jxVar.c) {
            jxVar.b = typeface;
            android.widget.TextView textView = (android.widget.TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new oc(textView, typeface, jxVar.a, 1));
                } else {
                    defpackage.jx.b(textView, typeface, jxVar.a);
                }
            }
        }
    }

    @Override // defpackage.dvg
    public final void a(int i) {
    }
}
