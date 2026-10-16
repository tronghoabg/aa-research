package com.google.android.gms.internal.consent_sdk;

import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public abstract class zzdw extends zzds implements Set, j$.util.Set {
    private transient zzdv zza;

    public static int zzf(int i5) {
        int iMax = Math.max(i5, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzdw zzi() {
        return zzdz.zza;
    }

    public static zzdw zzj(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzm(4, AndroidTcfDataSource.TCF_TCSTRING_KEY, "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    }

    public static zzdw zzk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzm(5, "UMP_CoMoAdStoragePurposeConsentStatus", "UMP_CoMoAdUserDataPurposeConsentStatus", "UMP_CoMoAdPersonalizationPurposeConsentStatus", "UMP_CoMoAnalyticsStoragePurposeConsentStatus", "IABTCF_gdprApplies");
    }

    private static zzdw zzm(int i5, Object... objArr) {
        if (i5 == 0) {
            return zzdz.zza;
        }
        if (i5 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzea(obj);
        }
        int iZzf = zzf(i5);
        Object[] objArr2 = new Object[iZzf];
        int i10 = iZzf - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i5; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC3256n.g(i13, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iZza = zzdr.zza(iHashCode);
            while (true) {
                int i14 = iZza & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += iHashCode;
                    i12++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iZza++;
                }
            }
        }
        Arrays.fill(objArr, i12, i5, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzea(obj4);
        }
        if (zzf(i12) < iZzf / 2) {
            return zzm(i12, objArr);
        }
        if (i12 < 3) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new zzdz(objArr, i11, objArr2, i10, i12);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzdw) && zzl() && ((zzdw) obj).zzl() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzeb iterator();

    public final zzdv zzg() {
        zzdv zzdvVar = this.zza;
        if (zzdvVar != null) {
            return zzdvVar;
        }
        zzdv zzdvVarZzh = zzh();
        this.zza = zzdvVarZzh;
        return zzdvVarZzh;
    }

    public zzdv zzh() {
        Object[] array = toArray();
        int i5 = zzdv.zzd;
        return zzdv.zzg(array, array.length);
    }

    public boolean zzl() {
        return false;
    }
}
