package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wrm {
    public final android.text.TextPaint a = new android.text.TextPaint(1);
    public final defpackage.wuc b = new defpackage.wrk(this);
    public boolean c = true;
    public java.lang.ref.WeakReference d;
    public defpackage.wub e;
    private float f;

    public wrm(defpackage.wrl wrlVar) {
        this.d = new java.lang.ref.WeakReference(null);
        this.d = new java.lang.ref.WeakReference(wrlVar);
    }

    public final float a(java.lang.String str) {
        if (!this.c) {
            return this.f;
        }
        this.f = str == null ? com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED : this.a.measureText((java.lang.CharSequence) str, 0, str.length());
        if (str != null) {
            float f = this.a.getFontMetrics().ascent;
        }
        this.c = false;
        return this.f;
    }
}
