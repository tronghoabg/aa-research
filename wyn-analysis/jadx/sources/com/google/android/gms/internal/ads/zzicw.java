package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* loaded from: classes3.dex */
public abstract class zzicw implements zzigh {
    static {
        int i5 = zzidz.zzb;
        int i10 = zzicy.zza;
    }

    private static final zzifz zzd(zzifz zzifzVar) throws zzifh {
        zzihc zzihcVarZzaU;
        if (zzifzVar == null || zzifzVar.zzbi()) {
            return zzifzVar;
        }
        if (zzifzVar instanceof zzicu) {
            zzihcVarZzaU = ((zzicu) zzifzVar).zzaU();
        } else {
            if (zzifzVar instanceof zzicv) {
                throw null;
            }
            zzihcVarZzaU = new zzihc(zzifzVar);
        }
        throw zzihcVarZzaU.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final /* synthetic */ Object zza(InputStream inputStream, zzidz zzidzVar) throws zzifh {
        zzidp zzidpVarZzH = zzidp.zzH(inputStream, 4096);
        zzifz zzifzVar = (zzifz) zzc(zzidpVarZzH, zzidzVar);
        zzidpVarZzH.zzb(0);
        zzd(zzifzVar);
        return zzifzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final /* synthetic */ Object zzb(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        zzidp zzidpVarZzm = zzidlVar.zzm();
        zzifz zzifzVar = (zzifz) zzc(zzidpVarZzm, zzidzVar);
        zzidpVarZzm.zzb(0);
        zzd(zzifzVar);
        return zzifzVar;
    }
}
