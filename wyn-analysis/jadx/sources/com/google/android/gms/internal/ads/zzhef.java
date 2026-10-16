package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzhef {
    private final List zza = new ArrayList();
    private final Map zzb = new HashMap();
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzhed) it.next()).zzd(false);
        }
    }

    public final zzhef zza(zzhed zzhedVar) {
        if (zzhedVar.zzh() != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzhedVar.zzc()) {
            zzc();
        }
        zzhedVar.zzi(this);
        this.zza.add(zzhedVar);
        return this;
    }

    public final zzhek zzb() throws GeneralSecurityException {
        int i5;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        List<zzhed> list = this.zza;
        ArrayList arrayList = new ArrayList(list.size());
        int i10 = 0;
        while (i10 < list.size() - 1) {
            int i11 = i10 + 1;
            if (((zzhed) list.get(i10)).zzg() == zzhee.zza && ((zzhed) list.get(i11)).zzg() != zzhee.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i10 = i11;
        }
        HashSet hashSet = new HashSet();
        byte[] bArr = null;
        Integer num = null;
        for (zzhed zzhedVar : list) {
            zzhedVar.zze();
            if (zzhedVar.zzg() == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i12 = 3;
            if (zzhedVar.zzg() == zzhee.zza) {
                int i13 = 0;
                while (true) {
                    if (i13 != 0 && !hashSet.contains(Integer.valueOf(i13))) {
                        break;
                    }
                    int i14 = zzhok.zza;
                    i13 = 0;
                    while (i13 == 0) {
                        byte[] bArrZza = zzhoc.zza(4);
                        i13 = (bArrZza[3] & ForkServer.ERROR) | ((bArrZza[0] & ForkServer.ERROR) << 24) | ((bArrZza[1] & ForkServer.ERROR) << 16) | ((bArrZza[2] & ForkServer.ERROR) << 8);
                    }
                }
                i5 = i13;
            } else {
                zzhedVar.zzg();
                i5 = 0;
            }
            Integer numValueOf = Integer.valueOf(i5);
            if (hashSet.contains(numValueOf)) {
                int i15 = i5;
                throw new GeneralSecurityException(AbstractC0279p0.o(new StringBuilder(String.valueOf(i15).length() + 31), "Id ", i15, " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            zzhdz zzhdzVarZzc = zzhmv.zza().zzc(zzhedVar.zzf(), true != zzhedVar.zzf().zza() ? null : numValueOf);
            zzheb zzhebVarZze = zzhedVar.zze();
            zzheb zzhebVar = zzheb.zza;
            if (!zzhebVar.equals(zzhebVarZze)) {
                if (zzheb.zzb.equals(zzhebVarZze)) {
                    i12 = 4;
                } else {
                    if (!zzheb.zzc.equals(zzhebVarZze)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i12 = 5;
                }
            }
            zzhei zzheiVar = new zzhei(zzhdzVarZzc, i12, i5, zzhedVar.zzc(), false, zzhei.zza, null);
            if (zzhedVar.zzc()) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzhedVar.zze() != zzhebVar) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzheiVar);
        }
        if (num != null) {
            return zzhek.zzi(new zzhek(arrayList, this.zzb, bArr));
        }
        throw new GeneralSecurityException("No primary was set");
    }
}
