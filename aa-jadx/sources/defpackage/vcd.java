package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vcd extends android.util.FloatProperty {
    public vcd() {
        super("Logo Width");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        int i = com.google.android.libraries.gsa.logoview.LogoView.d;
        return java.lang.Float.valueOf(((com.google.android.libraries.gsa.logoview.LogoView) obj).a.j);
    }

    public final /* bridge */ /* synthetic */ void setValue(java.lang.Object obj, float f) {
        com.google.android.libraries.gsa.logoview.LogoView logoView = (com.google.android.libraries.gsa.logoview.LogoView) obj;
        int i = com.google.android.libraries.gsa.logoview.LogoView.d;
        logoView.b(f, logoView.a.k);
    }
}
