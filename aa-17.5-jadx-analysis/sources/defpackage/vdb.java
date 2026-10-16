package defpackage;

import com.google.android.libraries.maps.LocationSource;

/* loaded from: classes3.dex */
public final class vdb extends vel {
    final /* synthetic */ LocationSource a;

    public vdb(LocationSource locationSource) {
        this.a = locationSource;
    }

    @Override // defpackage.vem
    public final void a(vgg vggVar) {
        this.a.activate(new vcy(vggVar));
    }

    @Override // defpackage.vem
    public final void b() {
        this.a.deactivate();
    }
}
