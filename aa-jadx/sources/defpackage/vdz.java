package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vdz extends defpackage.vfi {
    final /* synthetic */ com.google.android.libraries.maps.LocationSource a;

    public vdz(com.google.android.libraries.maps.LocationSource locationSource) {
        this.a = locationSource;
    }

    @Override // defpackage.vfj
    public final void a(defpackage.vhd vhdVar) {
        this.a.activate(new defpackage.vdw(vhdVar));
    }

    @Override // defpackage.vfj
    public final void b() {
        this.a.deactivate();
    }
}
