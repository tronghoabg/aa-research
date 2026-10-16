package defpackage;

import com.google.android.libraries.geo.mapcore.renderer.LabelRenderer;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.Semaphore;

/* loaded from: classes3.dex */
public final class ubd extends ubi {
    private final uev o = new uev(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    private volatile float p = BitmapDescriptorFactory.HUE_RED;
    private final too q = new too();

    @Override // defpackage.ubf
    public final float b() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final /* bridge */ /* synthetic */ long c(ube ubeVar) {
        return 0L;
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final tpv d() {
        return null;
    }

    @Override // defpackage.ubf
    public final uew e() {
        uew uewVar = new uew();
        uev uevVar = this.o;
        float f = uevVar.a;
        float f2 = uevVar.c;
        float f3 = uevVar.b;
        float f4 = uevVar.d;
        uewVar.h((f + f2) * 0.5f, (f3 + f4) * 0.5f, 0.0d, (f2 - f) * 0.5f, (f4 - f3) * 0.5f);
        return uewVar;
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final /* bridge */ /* synthetic */ uew f() {
        return null;
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final /* bridge */ /* synthetic */ uew g() {
        return null;
    }

    @Override // defpackage.ubi
    protected final void h() {
        this.p = BitmapDescriptorFactory.HUE_RED;
        super.h();
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final void i() {
        Semaphore semaphore = this.a;
        semaphore.acquireUninterruptibly();
        semaphore.release();
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final /* bridge */ /* synthetic */ boolean m() {
        return false;
    }

    @Override // defpackage.ubi, defpackage.ump
    public final boolean n() {
        return true;
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final boolean o() {
        return true;
    }

    @Override // defpackage.ubi, defpackage.ump
    public final int p(umk umkVar, boolean z, too tooVar) {
        this.a.acquireUninterruptibly();
        try {
            tooVar.A(this.q);
            uev uevVar = this.o;
            tpf tpfVar = uevVar.e;
            return true == umkVar.b(tpfVar.b, tpfVar.c, 0.0d, uevVar.b(), uevVar.a()) ? 2 : 1;
        } finally {
            this.a.release();
        }
    }

    @Override // defpackage.ubf
    @ResultIgnorabilityUnspecified
    public final boolean r(udc udcVar, usy usyVar, LabelRenderer labelRenderer) {
        Semaphore semaphore = this.a;
        if (!semaphore.tryAcquire()) {
            return false;
        }
        semaphore.release();
        return true;
    }

    @Override // defpackage.ubf
    @ResultIgnorabilityUnspecified
    public final boolean s(udc udcVar, usy usyVar) {
        this.a.acquireUninterruptibly();
        try {
            if (((uat) this.b).a.c == null) {
                abco abcoVar = abco.a;
            }
            abcs abcsVar = ((uat) this.b).a;
            if ((abcsVar.b & 2) != 0 && abcsVar.d == null) {
                abco abcoVar2 = abco.a;
            }
            throw null;
        } catch (Throwable th) {
            this.a.release();
            throw th;
        }
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final /* bridge */ /* synthetic */ void j(boolean z) {
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final /* bridge */ /* synthetic */ void k(boolean z) {
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final /* bridge */ /* synthetic */ void l(ubf ubfVar, float f) {
    }

    @Override // defpackage.ubf
    public final void q(udc udcVar, usy usyVar) {
    }
}
