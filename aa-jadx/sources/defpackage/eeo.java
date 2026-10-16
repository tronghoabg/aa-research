package defpackage;

/* JADX INFO: loaded from: classes.dex */
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
        if (f == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        b();
        this.a.j((int) f);
        return true;
    }
}
