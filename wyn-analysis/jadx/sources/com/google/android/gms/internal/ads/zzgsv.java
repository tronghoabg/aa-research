package com.google.android.gms.internal.ads;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes3.dex */
final class zzgsv extends AbstractC3471j implements tf.p {
    Object zza;
    int zzb;
    final /* synthetic */ zzgst zzc;
    final /* synthetic */ tf.p zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgsv(zzgst zzgstVar, tf.p pVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzc = zzgstVar;
        this.zzd = pVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        zzgsv zzgsvVar = new zzgsv(this.zzc, this.zzd, interfaceC3103c);
        zzgsvVar.zze = obj;
        return zzgsvVar;
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgsv) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        tf.p pVar;
        Nf.a aVarZza;
        Nf.a aVar;
        Throwable th;
        kf.a aVar2 = kf.a.f39711a;
        int i5 = this.zzb;
        try {
            if (i5 == 0) {
                Fe.e.U(obj);
                Ef.H.o((Ef.E) this.zze);
                zzgst zzgstVar = this.zzc;
                pVar = this.zzd;
                aVarZza = zzgstVar.zza();
                this.zze = aVarZza;
                this.zza = pVar;
                this.zzb = 1;
                if (zzgsw.zze(aVarZza, this) != aVar2) {
                }
                return aVar2;
            }
            if (i5 != 1) {
                aVar = (Nf.a) this.zze;
                try {
                    Fe.e.U(obj);
                    aVar.a(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    aVar.a(null);
                    throw th;
                }
            }
            pVar = (tf.p) this.zza;
            Nf.a aVar3 = (Nf.a) this.zze;
            Fe.e.U(obj);
            aVarZza = aVar3;
            this.zze = aVarZza;
            this.zza = null;
            this.zzb = 2;
            Object objL = Ef.H.l(pVar, this);
            if (objL != aVar2) {
                aVar = aVarZza;
                obj = objL;
                aVar.a(null);
                return obj;
            }
            return aVar2;
        } catch (Throwable th3) {
            aVar = aVarZza;
            th = th3;
            aVar.a(null);
            throw th;
        }
    }
}
