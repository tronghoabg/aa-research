package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eeo implements defpackage.eaf {
    final /* synthetic */ androidx.core.widget.NestedScrollView a;

    public eeo(androidx.core.widget.NestedScrollView nestedScrollView) {
        this.a = nestedScrollView;
    }

    @Override // defpackage.eaf
    public final float a() {
        return -this.a.a();
    }

    @Override // defpackage.eaf
    public final void b() {
        this.a.a.abortAnimation();
    }

    @Override // defpackage.eaf
    public final boolean c(float f) {
        if (f == 0.0f) {
            return false;
        }
        b();
        this.a.j((int) f);
        return true;
    }
}
