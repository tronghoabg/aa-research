package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class zzgwa extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    public zzgwa() {
        zza(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzA, reason: merged with bridge method [inline-methods] */
    public final int[] zzl() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzB, reason: merged with bridge method [inline-methods] */
    public final Object[] zzm() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final Object[] zzn() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private final void zzv(int i5) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzw, reason: merged with bridge method [inline-methods] */
    public final int zzh() {
        return (1 << (this.zzf & 31)) - 1;
    }

    private final int zzx(int i5, int i10, int i11, int i12) {
        int i13 = i10 - 1;
        Object objZza = zzgwb.zza(i10);
        if (i12 != 0) {
            zzgwb.zzc(objZza, i11 & i13, i12 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzl = zzl();
        for (int i14 = 0; i14 <= i5; i14++) {
            int iZzb = zzgwb.zzb(obj, i14);
            while (iZzb != 0) {
                int i15 = iZzb - 1;
                int i16 = iArrZzl[i15];
                int i17 = ((~i5) & i16) | i14;
                int i18 = i17 & i13;
                int iZzb2 = zzgwb.zzb(objZza, i18);
                zzgwb.zzc(objZza, i18, iZzb);
                iArrZzl[i15] = ((~i13) & i17) | (iZzb2 & i13);
                iZzb = i16 & i5;
            }
        }
        this.zze = objZza;
        zzv(i13);
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzy, reason: merged with bridge method [inline-methods] */
    public final int zzi(Object obj) {
        if (zzb()) {
            return -1;
        }
        int iZzb = zzgwm.zzb(obj);
        int iZzh = zzh();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int iZzb2 = zzgwb.zzb(obj2, iZzb & iZzh);
        if (iZzb2 != 0) {
            int i5 = ~iZzh;
            int i10 = iZzb & i5;
            do {
                int i11 = iZzb2 - 1;
                int i12 = zzl()[i11];
                if ((i12 & i5) == i10 && Objects.equals(obj, zzm()[i11])) {
                    return i11;
                }
                iZzb2 = i12 & iZzh;
            } while (iZzb2 != 0);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final Object zzj(Object obj) {
        if (!zzb()) {
            int iZzh = zzh();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int iZze = zzgwb.zze(obj, null, iZzh, obj2, zzl(), zzm(), null);
            if (iZze != -1) {
                Object obj3 = zzn()[iZze];
                zze(iZze, iZzh);
                this.zzg--;
                zzd();
                return obj3;
            }
        }
        return zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzb()) {
            return;
        }
        zzd();
        Map mapZzc = zzc();
        if (mapZzc != null) {
            this.zzf = zzhaq.zzc(size(), 3, 1073741823);
            mapZzc.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzm(), 0, this.zzg, (Object) null);
        Arrays.fill(zzn(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzl(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapZzc = zzc();
        return mapZzc != null ? mapZzc.containsKey(obj) : zzi(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.containsValue(obj);
        }
        for (int i5 = 0; i5 < this.zzg; i5++) {
            if (Objects.equals(obj, zzn()[i5])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzgvv zzgvvVar = new zzgvv(this, null);
        this.zzi = zzgvvVar;
        return zzgvvVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.get(obj);
        }
        int iZzi = zzi(obj);
        if (iZzi == -1) {
            return null;
        }
        return zzn()[iZzi];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzgvx zzgvxVar = new zzgvx(this, null);
        this.zzh = zzgvxVar;
        return zzgvxVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i5;
        if (zzb()) {
            zzgtr.zzj(zzb(), "Arrays already allocated");
            int i10 = this.zzf;
            int iMax = Math.max(i10 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzgwb.zza(iMax2);
            zzv(iMax2 - 1);
            this.zza = new int[i10];
            this.zzb = new Object[i10];
            this.zzc = new Object[i10];
        }
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.put(obj, obj2);
        }
        int[] iArrZzl = zzl();
        Object[] objArrZzm = zzm();
        Object[] objArrZzn = zzn();
        int i11 = this.zzg;
        int i12 = i11 + 1;
        int iZzb = zzgwm.zzb(obj);
        int iZzh = zzh();
        int i13 = iZzb & iZzh;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int iZzb2 = zzgwb.zzb(obj3, i13);
        if (iZzb2 == 0) {
            if (i12 > iZzh) {
                iZzh = zzx(iZzh, zzgwb.zzd(iZzh), iZzb, i11);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zzgwb.zzc(obj4, i13, i12);
            }
            i5 = 1;
        } else {
            int i14 = ~iZzh;
            int i15 = iZzb & i14;
            int i16 = 0;
            while (true) {
                int i17 = iZzb2 - 1;
                int i18 = iArrZzl[i17];
                i5 = 1;
                int i19 = i18 & i14;
                if (i19 == i15 && Objects.equals(obj, objArrZzm[i17])) {
                    Object obj5 = objArrZzn[i17];
                    objArrZzn[i17] = obj2;
                    return obj5;
                }
                int i20 = i18 & iZzh;
                i16++;
                if (i20 != 0) {
                    iZzb2 = i20;
                } else {
                    if (i16 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzh() + 1, 1.0f);
                        int iZzf = zzf();
                        while (iZzf >= 0) {
                            linkedHashMap.put(zzm()[iZzf], zzn()[iZzf]);
                            iZzf = zzg(iZzf);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzd();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i12 > iZzh) {
                        iZzh = zzx(iZzh, zzgwb.zzd(iZzh), iZzb, i11);
                    } else {
                        iArrZzl[i17] = (i12 & iZzh) | i19;
                    }
                }
            }
        }
        int length = zzl().length;
        if (i12 > length) {
            int i21 = i5;
            int iMin = Math.min(1073741823, (Math.max(i21, length >>> 1) + length) | i21);
            if (iMin != length) {
                this.zza = Arrays.copyOf(zzl(), iMin);
                this.zzb = Arrays.copyOf(zzm(), iMin);
                this.zzc = Arrays.copyOf(zzn(), iMin);
            }
        }
        zzl()[i11] = (~iZzh) & iZzb;
        zzm()[i11] = obj;
        zzn()[i11] = obj2;
        this.zzg = i12;
        zzd();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.remove(obj);
        }
        Object objZzj = zzj(obj);
        if (objZzj == zzd) {
            return null;
        }
        return objZzj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzc = zzc();
        return mapZzc != null ? mapZzc.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzgvz zzgvzVar = new zzgvz(this, null);
        this.zzj = zzgvzVar;
        return zzgvzVar;
    }

    public final void zza(int i5) {
        this.zzf = zzhaq.zzc(i5, 1, 1073741823);
    }

    public final boolean zzb() {
        return this.zze == null;
    }

    public final Map zzc() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzd() {
        this.zzf += 32;
    }

    public final void zze(int i5, int i10) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzl = zzl();
        Object[] objArrZzm = zzm();
        Object[] objArrZzn = zzn();
        int size = size();
        int i11 = size - 1;
        if (i5 >= i11) {
            objArrZzm[i5] = null;
            objArrZzn[i5] = null;
            iArrZzl[i5] = 0;
            return;
        }
        int i12 = i5 + 1;
        Object obj2 = objArrZzm[i11];
        objArrZzm[i5] = obj2;
        objArrZzn[i5] = objArrZzn[i11];
        objArrZzm[i11] = null;
        objArrZzn[i11] = null;
        iArrZzl[i5] = iArrZzl[i11];
        iArrZzl[i11] = 0;
        int iZzb = zzgwm.zzb(obj2) & i10;
        int iZzb2 = zzgwb.zzb(obj, iZzb);
        if (iZzb2 == size) {
            zzgwb.zzc(obj, iZzb, i12);
            return;
        }
        while (true) {
            int i13 = iZzb2 - 1;
            int i14 = iArrZzl[i13];
            int i15 = i14 & i10;
            if (i15 == size) {
                iArrZzl[i13] = (i14 & (~i10)) | (i10 & i12);
                return;
            }
            iZzb2 = i15;
        }
    }

    public final int zzf() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzg(int i5) {
        int i10 = i5 + 1;
        if (i10 < this.zzg) {
            return i10;
        }
        return -1;
    }

    public final /* synthetic */ Object zzk() {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final /* synthetic */ Object zzo(int i5) {
        return zzm()[i5];
    }

    public final /* synthetic */ Object zzp(int i5) {
        return zzn()[i5];
    }

    public final /* synthetic */ void zzq(int i5, Object obj) {
        zzn()[i5] = obj;
    }

    public final /* synthetic */ int zzs() {
        return this.zzf;
    }

    public final /* synthetic */ int zzt() {
        return this.zzg;
    }

    public final /* synthetic */ void zzu(int i5) {
        this.zzg = i5;
    }

    public zzgwa(int i5) {
        zza(8);
    }
}
