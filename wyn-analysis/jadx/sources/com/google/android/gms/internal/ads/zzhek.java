package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzhek implements zzhel {
    private final List zza;
    private final Map zzb;
    private final zzhek zzc;

    private zzhek(List list, Map map, zzhek zzhekVar) {
        this.zza = list;
        this.zzb = map;
        this.zzc = zzhekVar;
    }

    public static final zzhek zza(zzhtk zzhtkVar) throws GeneralSecurityException {
        if (zzhtkVar == null || zzhtkVar.zzc() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzhek(zzj(zzhtkVar), new HashMap());
    }

    public static final zzhek zzg(zzheq zzheqVar) throws GeneralSecurityException {
        zzhef zzhefVar = new zzhef();
        zzhed zzhedVar = new zzhed(zzheqVar, null);
        zzhedVar.zzb();
        zzhedVar.zza();
        zzhefVar.zza(zzhedVar);
        return zzhefVar.zzb();
    }

    public static /* synthetic */ zzhek zzi(final zzhek zzhekVar) {
        final zzhmp zzhmpVar = (zzhmp) zzhekVar.zzf(zzhmp.class);
        if (zzhmpVar == null) {
            return zzhekVar;
        }
        zzheg zzhegVar = new zzheg() { // from class: com.google.android.gms.internal.ads.zzhej
            @Override // com.google.android.gms.internal.ads.zzheg
            public final /* synthetic */ void zza(zzhei zzheiVar) {
                zzhmz.zza().zzb().zza(this.zza, zzhmpVar, "keyset_handle", "get_key");
            }
        };
        List<zzhei> list = zzhekVar.zza;
        ArrayList arrayList = new ArrayList(list.size());
        for (zzhei zzheiVar : list) {
            arrayList.add(new zzhei(zzheiVar.zzf(), zzheiVar.zzj(), zzheiVar.zzg(), zzheiVar.zzh(), zzheiVar.zzi(), zzhegVar, null));
        }
        return new zzhek(arrayList, zzhekVar.zzb, zzhekVar);
    }

    private static List zzj(zzhtk zzhtkVar) throws GeneralSecurityException {
        zzhdz zzhmmVar;
        boolean z2;
        ArrayList arrayList = new ArrayList(zzhtkVar.zzc());
        for (zzhtj zzhtjVar : zzhtkVar.zzb()) {
            int iZzc = zzhtjVar.zzc();
            try {
                zzhnz zzhnzVarZzl = zzl(zzhtjVar);
                zzhne zzhneVarZza = zzhne.zza();
                zzhey zzheyVarZza = zzhey.zza();
                zzhmmVar = !zzhneVarZza.zzf(zzhnzVarZzl) ? new zzhmm(zzhnzVarZzl, zzheyVarZza) : zzhneVarZza.zzg(zzhnzVarZzl, zzheyVarZza);
                z2 = false;
            } catch (GeneralSecurityException e7) {
                if (zzhlc.zza.zza()) {
                    throw e7;
                }
                zzhmmVar = new zzhmm(zzl(zzhtjVar), zzhey.zza());
                z2 = true;
            }
            if (zzhlc.zza.zza() && !zzm(zzhtjVar.zzk())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z10 = true;
            int iZzk = zzhtjVar.zzk();
            if (iZzc != zzhtkVar.zza()) {
                z10 = false;
            }
            arrayList.add(new zzhei(zzhmmVar, iZzk, iZzc, z10, z2, zzhei.zza, null));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private final zzhek zzk() {
        zzhek zzhekVar = this.zzc;
        return zzhekVar == null ? this : zzhekVar;
    }

    private static zzhnz zzl(zzhtj zzhtjVar) throws GeneralSecurityException {
        return zzhnz.zza(zzhtjVar.zzb().zza(), zzhtjVar.zzb().zzb(), zzhtjVar.zzb().zzc(), zzhtjVar.zzd(), zzhtjVar.zzd() == zzhtx.RAW ? null : Integer.valueOf(zzhtjVar.zzc()));
    }

    private static boolean zzm(int i5) {
        int i10 = i5 - 2;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    public final String toString() throws GeneralSecurityException {
        zzhtk zzhtkVarZzb = zzb();
        int i5 = zzhfb.zza;
        zzhtl zzhtlVarZza = zzhto.zza();
        zzhtlVarZza.zza(zzhtkVarZzb.zza());
        for (zzhtj zzhtjVar : zzhtkVarZzb.zzb()) {
            zzhtm zzhtmVarZza = zzhtn.zza();
            zzhtmVarZza.zza(zzhtjVar.zzb().zza());
            zzhtmVarZza.zzd(zzhtjVar.zzk());
            zzhtmVarZza.zzc(zzhtjVar.zzd());
            zzhtmVarZza.zzb(zzhtjVar.zzc());
            zzhtlVarZza.zzb((zzhtn) zzhtmVarZza.zzbu());
        }
        return ((zzhto) zzhtlVarZza.zzbu()).toString();
    }

    public final zzhtk zzb() throws GeneralSecurityException {
        try {
            zzhth zzhthVarZzh = zzhtk.zzh();
            for (zzhei zzheiVar : this.zza) {
                zzhdz zzhdzVarZza = zzheiVar.zza();
                int iZzj = zzheiVar.zzj();
                int iZzc = zzheiVar.zzc();
                zzhnz zzhnzVar = (zzhnz) zzhne.zza().zzh(zzhdzVarZza, zzhnz.class, zzhey.zza());
                Integer numZzb = zzhdzVarZza.zzb();
                if (numZzb != null && numZzb.intValue() != iZzc) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                zzhti zzhtiVarZze = zzhtj.zze();
                zzhsz zzhszVarZzd = zzhtb.zzd();
                zzhszVarZzd.zza(zzhnzVar.zzg());
                zzhszVarZzd.zzb(zzhnzVar.zzb());
                zzhszVarZzd.zzc(zzhnzVar.zzc());
                zzhtiVarZze.zzb(zzhszVarZzd);
                zzhtiVarZze.zze(iZzj);
                zzhtiVarZze.zzc(iZzc);
                zzhtiVarZze.zzd(zzhnzVar.zzd());
                zzhthVarZzh.zzb((zzhtj) zzhtiVarZze.zzbu());
                if (zzheiVar.zzd()) {
                    zzhthVarZzh.zza(zzheiVar.zzc());
                }
            }
            return (zzhtk) zzhthVarZzh.zzbu();
        } catch (GeneralSecurityException e7) {
            throw new zzhoj(e7);
        }
    }

    public final zzhei zzc() {
        for (zzhei zzheiVar : this.zza) {
            if (zzheiVar != null && zzheiVar.zzd()) {
                if (zzheiVar.zzb() == zzheb.zza) {
                    return zzheiVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    @Override // com.google.android.gms.internal.ads.zzhel
    public final int zzd() {
        return this.zza.size();
    }

    public final zzhei zze(int i5) {
        if (i5 < 0 || i5 >= zzd()) {
            int iZzd = zzd();
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.consent_sdk.a.u(i5, iZzd, "Invalid index ", " for keyset of size ", new StringBuilder(String.valueOf(i5).length() + 34 + String.valueOf(iZzd).length())));
        }
        List list = this.zza;
        zzhei zzheiVar = (zzhei) list.get(i5);
        if (!zzm(zzheiVar.zzj())) {
            throw new IllegalStateException(AbstractC0279p0.o(new StringBuilder(String.valueOf(i5).length() + 42), "Keyset-Entry at position ", i5, " has wrong status"));
        }
        if (zzheiVar.zzi()) {
            throw new IllegalStateException(AbstractC0279p0.o(new StringBuilder(String.valueOf(i5).length() + 48), "Keyset-Entry at position ", i5, " didn't parse correctly"));
        }
        return (zzhei) list.get(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzhel
    public final zzhds zzf(Class cls) {
        return (zzhds) this.zzb.get(cls);
    }

    public final Object zzh(zzhdw zzhdwVar, Class cls) throws GeneralSecurityException {
        zzhtk zzhtkVarZzb = zzk().zzb();
        int i5 = zzhfb.zza;
        int iZza = zzhtkVarZzb.zza();
        int i10 = 0;
        boolean z2 = false;
        boolean z10 = true;
        for (zzhtj zzhtjVar : zzhtkVarZzb.zzb()) {
            if (zzhtjVar.zzk() == 3) {
                if (!zzhtjVar.zza()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzhtjVar.zzc())));
                }
                if (zzhtjVar.zzd() == zzhtx.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzhtjVar.zzc())));
                }
                if (zzhtjVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzhtjVar.zzc())));
                }
                if (zzhtjVar.zzc() == iZza) {
                    if (z2) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z2 = true;
                }
                z10 &= zzhtjVar.zzb().zzc() == zzhta.ASYMMETRIC_PUBLIC;
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z2 && !z10) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i11 = 0; i11 < zzd(); i11++) {
            List list = this.zza;
            if (((zzhei) list.get(i11)).zzi() || !zzm(((zzhei) list.get(i11)).zzj())) {
                String strZza = zzhtkVarZzb.zzd(i11).zzb().zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strZza).length() + String.valueOf(i11).length() + 44 + 32);
                sb2.append("Key parsing of key with index ");
                sb2.append(i11);
                sb2.append(" and type_url ");
                sb2.append(strZza);
                sb2.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb2.toString());
            }
        }
        return zzhdwVar.zza(zzk(), cls);
    }

    public /* synthetic */ zzhek(List list, Map map, byte[] bArr) {
        this(list, map);
    }

    private zzhek(List list, Map map) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = map;
        if (zzhlc.zza.zza()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean zZzd = false;
            while (it.hasNext()) {
                zzhei zzheiVar = (zzhei) it.next();
                if (!hashSet.contains(Integer.valueOf(zzheiVar.zzc()))) {
                    hashSet.add(Integer.valueOf(zzheiVar.zzc()));
                    zZzd |= zzheiVar.zzd();
                } else {
                    int iZzc = zzheiVar.zzc();
                    throw new GeneralSecurityException(AbstractC0279p0.o(new StringBuilder(String.valueOf(iZzc).length() + 121), "KeyID ", iZzc, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
            }
            if (!zZzd) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }
}
