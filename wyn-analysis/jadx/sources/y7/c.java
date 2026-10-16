package y7;

import A7.A0;
import A7.C0259i1;
import A7.C0262j1;
import A7.C0264k0;
import A7.C0273n0;
import A7.N;
import A7.P0;
import A7.R1;
import A7.U1;
import A7.W0;
import A7.r;
import android.os.Bundle;
import android.os.SystemClock;
import c8.C1581e;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import x.C4412e;

/* loaded from: classes4.dex */
public final class c extends AbstractC4565a {

    /* renamed from: a, reason: collision with root package name */
    public final C0273n0 f48037a;

    /* renamed from: b, reason: collision with root package name */
    public final P0 f48038b;

    public c(C0273n0 c0273n0) {
        AbstractC1732v.i(c0273n0);
        this.f48037a = c0273n0;
        P0 p02 = c0273n0.f987p;
        C0273n0.b(p02);
        this.f48038b = p02;
    }

    @Override // A7.InterfaceC0247e1
    public final void a(String str, String str2, Bundle bundle) {
        P0 p02 = this.f48038b;
        ((C0273n0) p02.f421a).f985n.getClass();
        p02.w0(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // A7.InterfaceC0247e1
    public final void b(String str, String str2, Bundle bundle) {
        P0 p02 = this.f48037a.f987p;
        C0273n0.b(p02);
        p02.u0(str, str2, bundle);
    }

    @Override // A7.InterfaceC0247e1
    public final Map c(String str, String str2, boolean z2) {
        P0 p02 = this.f48038b;
        if (p02.zzl().o0()) {
            p02.zzj().f605f.c("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (C1581e.e()) {
            p02.zzj().f605f.c("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        C0264k0 c0264k0 = ((C0273n0) p02.f421a).f982j;
        C0273n0.d(c0264k0);
        c0264k0.i0(atomicReference, 5000L, "get user properties", new A0(p02, atomicReference, str, str2, z2, 1));
        List<R1> list = (List) atomicReference.get();
        if (list == null) {
            N nZzj = p02.zzj();
            nZzj.f605f.d("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z2));
            return Collections.EMPTY_MAP;
        }
        C4412e c4412e = new C4412e(list.size());
        for (R1 r12 : list) {
            Object objZza = r12.zza();
            if (objZza != null) {
                c4412e.put(r12.f681b, objZza);
            }
        }
        return c4412e;
    }

    @Override // A7.InterfaceC0247e1
    public final List d(String str, String str2) {
        P0 p02 = this.f48038b;
        if (p02.zzl().o0()) {
            p02.zzj().f605f.c("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (C1581e.e()) {
            p02.zzj().f605f.c("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        C0264k0 c0264k0 = ((C0273n0) p02.f421a).f982j;
        C0273n0.d(c0264k0);
        c0264k0.i0(atomicReference, 5000L, "get conditional user properties", new W0(1, str, p02, atomicReference, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return U1.Y0(list);
        }
        p02.zzj().f605f.d("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    @Override // A7.InterfaceC0247e1
    public final int zza(String str) {
        AbstractC1732v.f(str);
        return 25;
    }

    @Override // A7.InterfaceC0247e1
    public final void zzb(String str) {
        C0273n0 c0273n0 = this.f48037a;
        r rVarH = c0273n0.h();
        c0273n0.f985n.getClass();
        rVarH.j0(str, SystemClock.elapsedRealtime());
    }

    @Override // A7.InterfaceC0247e1
    public final void zzc(String str) {
        C0273n0 c0273n0 = this.f48037a;
        r rVarH = c0273n0.h();
        c0273n0.f985n.getClass();
        rVarH.m0(SystemClock.elapsedRealtime(), str);
    }

    @Override // A7.InterfaceC0247e1
    public final long zzf() {
        U1 u12 = this.f48037a.f983l;
        C0273n0.c(u12);
        return u12.o1();
    }

    @Override // A7.InterfaceC0247e1
    public final String zzg() {
        return (String) this.f48038b.f654g.get();
    }

    @Override // A7.InterfaceC0247e1
    public final String zzh() {
        C0259i1 c0259i1 = ((C0273n0) this.f48038b.f421a).f986o;
        C0273n0.b(c0259i1);
        C0262j1 c0262j1 = c0259i1.f901c;
        if (c0262j1 != null) {
            return c0262j1.f918b;
        }
        return null;
    }

    @Override // A7.InterfaceC0247e1
    public final String zzi() {
        C0259i1 c0259i1 = ((C0273n0) this.f48038b.f421a).f986o;
        C0273n0.b(c0259i1);
        C0262j1 c0262j1 = c0259i1.f901c;
        if (c0262j1 != null) {
            return c0262j1.f917a;
        }
        return null;
    }

    @Override // A7.InterfaceC0247e1
    public final String zzj() {
        return (String) this.f48038b.f654g.get();
    }

    @Override // A7.InterfaceC0247e1
    public final void zza(Bundle bundle) {
        P0 p02 = this.f48038b;
        ((C0273n0) p02.f421a).f985n.getClass();
        p02.F0(bundle, System.currentTimeMillis());
    }
}
