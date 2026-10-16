package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzh extends zza {
    @Override // defpackage.zza
    protected final void b(zzf zzfVar) {
        zzb zzbVar = this.b;
        zzbVar.a.a();
        zzbVar.a.c(new zzg(2));
    }

    @Override // defpackage.zza
    protected final boolean c(zzf zzfVar) {
        zzb zzbVar = this.b;
        boolean zC = zzbVar.a.c(new zzg(1));
        if (zC) {
            zzbVar.a.b();
        }
        return zC;
    }

    @Override // defpackage.zza
    protected final boolean g(zzf zzfVar) {
        return this.b.a.c(new zzg(0));
    }

    @Override // defpackage.zza
    public final int h(long j, LinkedList linkedList, List list) {
        sb sbVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((zza) it.next()).e()) {
                return 1;
            }
        }
        if (linkedList.size() < 3) {
            return 2;
        }
        Iterator it2 = linkedList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                sbVar = null;
                break;
            }
            sbVar = (sb) it2.next();
            if (sbVar.k() > 1) {
                break;
            }
        }
        sb sbVar2 = (sb) linkedList.getLast();
        if (sbVar == null || sbVar2.k() <= 1) {
            return 1;
        }
        float f = true != list.isEmpty() ? 0.17453292f : 0.08726646f;
        float fAbs = Math.abs(a.I(sbVar.e(), sbVar2.e()));
        if (fAbs < f) {
            return 1;
        }
        float fH = (sbVar2.h() + sbVar2.j()) * 0.5f;
        float f2 = sbVar2.f() / fH;
        if (f2 < 0.75f) {
            return 1;
        }
        float fAbs2 = Math.abs(f2 - (sbVar.f() / fH));
        if (fAbs2 != BitmapDescriptorFactory.HUE_RED) {
            float f3 = fAbs / fAbs2;
            if (f3 < 0.5f) {
                return 1;
            }
            if (f3 < 0.9f) {
                return 2;
            }
        }
        return 3;
    }
}
