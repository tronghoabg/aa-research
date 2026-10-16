package com.google.android.gms.internal.mlkit_vision_text_common;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
final class zzba extends AbstractMap implements Serializable {
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

    public zzba() {
        zzp(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzC() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public static /* synthetic */ Object zzg(zzba zzbaVar, int i5) {
        return zzbaVar.zzB()[i5];
    }

    public static /* synthetic */ Object zzi(zzba zzbaVar) {
        Object obj = zzbaVar.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static /* synthetic */ Object zzj(zzba zzbaVar, int i5) {
        return zzbaVar.zzC()[i5];
    }

    public static /* synthetic */ void zzn(zzba zzbaVar, int i5, Object obj) {
        zzbaVar.zzC()[i5] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw(Object obj) {
        if (zzr()) {
            return -1;
        }
        int iZza = zzbc.zza(obj);
        int iZzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int iZzc = zzbb.zzc(obj2, iZza & iZzv);
        if (iZzc != 0) {
            int i5 = ~iZzv;
            int i10 = iZza & i5;
            do {
                int i11 = iZzc - 1;
                int i12 = zzA()[i11];
                if ((i12 & i5) == i10 && zzw.zza(obj, zzB()[i11])) {
                    return i11;
                }
                iZzc = i12 & iZzv;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzx(int i5, int i10, int i11, int i12) {
        int i13 = i10 - 1;
        Object objZzd = zzbb.zzd(i10);
        if (i12 != 0) {
            zzbb.zze(objZzd, i11 & i13, i12 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        for (int i14 = 0; i14 <= i5; i14++) {
            int iZzc = zzbb.zzc(obj, i14);
            while (iZzc != 0) {
                int i15 = iZzc - 1;
                int i16 = iArrZzA[i15];
                int i17 = ((~i5) & i16) | i14;
                int i18 = i17 & i13;
                int iZzc2 = zzbb.zzc(objZzd, i18);
                zzbb.zze(objZzd, i18, iZzc);
                iArrZzA[i15] = ((~i13) & i17) | (iZzc2 & i13);
                iZzc = i16 & i5;
            }
        }
        this.zze = objZzd;
        zzz(i13);
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(Object obj) {
        if (!zzr()) {
            int iZzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int iZzb = zzbb.zzb(obj, null, iZzv, obj2, zzA(), zzB(), null);
            if (iZzb != -1) {
                Object obj3 = zzC()[iZzb];
                zzq(iZzb, iZzv);
                this.zzg--;
                zzo();
                return obj3;
            }
        }
        return zzd;
    }

    private final void zzz(int i5) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        Map mapZzl = zzl();
        if (mapZzl != null) {
            this.zzf = zzcq.zza(size(), 3, 1073741823);
            mapZzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.containsKey(obj) : zzw(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsValue(obj);
        }
        for (int i5 = 0; i5 < this.zzg; i5++) {
            if (zzw.zza(obj, zzC()[i5])) {
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
        zzau zzauVar = new zzau(this);
        this.zzi = zzauVar;
        return zzauVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.get(obj);
        }
        int iZzw = zzw(obj);
        if (iZzw == -1) {
            return null;
        }
        return zzC()[iZzw];
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
        zzax zzaxVar = new zzax(this);
        this.zzh = zzaxVar;
        return zzaxVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i5;
        if (zzr()) {
            zzx.zzd(zzr(), "Arrays already allocated");
            int i10 = this.zzf;
            int iMax = Math.max(i10 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzbb.zzd(iMax2);
            zzz(iMax2 - 1);
            this.zza = new int[i10];
            this.zzb = new Object[i10];
            this.zzc = new Object[i10];
        }
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.put(obj, obj2);
        }
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int i11 = this.zzg;
        int i12 = i11 + 1;
        int iZza = zzbc.zza(obj);
        int iZzv = zzv();
        int i13 = iZza & iZzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int iZzc = zzbb.zzc(obj3, i13);
        if (iZzc == 0) {
            if (i12 > iZzv) {
                iZzv = zzx(iZzv, zzbb.zza(iZzv), iZza, i11);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zzbb.zze(obj4, i13, i12);
            }
            i5 = 1;
        } else {
            int i14 = ~iZzv;
            int i15 = iZza & i14;
            int i16 = 0;
            while (true) {
                int i17 = iZzc - 1;
                int i18 = iArrZzA[i17];
                i5 = 1;
                int i19 = i18 & i14;
                if (i19 == i15 && zzw.zza(obj, objArrZzB[i17])) {
                    Object obj5 = objArrZzC[i17];
                    objArrZzC[i17] = obj2;
                    return obj5;
                }
                int i20 = i18 & iZzv;
                i16++;
                if (i20 != 0) {
                    iZzc = i20;
                } else {
                    if (i16 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                        int iZze = zze();
                        while (iZze >= 0) {
                            linkedHashMap.put(zzB()[iZze], zzC()[iZze]);
                            iZze = zzf(iZze);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzo();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i12 > iZzv) {
                        iZzv = zzx(iZzv, zzbb.zza(iZzv), iZza, i11);
                    } else {
                        iArrZzA[i17] = (i12 & iZzv) | i19;
                    }
                }
            }
        }
        int length = zzA().length;
        if (i12 > length) {
            int i21 = i5;
            int iMin = Math.min(1073741823, (Math.max(i21, length >>> 1) + length) | i21);
            if (iMin != length) {
                this.zza = Arrays.copyOf(zzA(), iMin);
                this.zzb = Arrays.copyOf(zzB(), iMin);
                this.zzc = Arrays.copyOf(zzC(), iMin);
            }
        }
        zzA()[i11] = (~iZzv) & iZza;
        zzB()[i11] = obj;
        zzC()[i11] = obj2;
        this.zzg = i12;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.remove(obj);
        }
        Object objZzy = zzy(obj);
        if (objZzy == zzd) {
            return null;
        }
        return objZzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzaz zzazVar = new zzaz(this);
        this.zzj = zzazVar;
        return zzazVar;
    }

    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzf(int i5) {
        int i10 = i5 + 1;
        if (i10 < this.zzg) {
            return i10;
        }
        return -1;
    }

    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzo() {
        this.zzf += 32;
    }

    public final void zzp(int i5) {
        this.zzf = zzcq.zza(i5, 1, 1073741823);
    }

    public final void zzq(int i5, int i10) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int size = size();
        int i11 = size - 1;
        if (i5 >= i11) {
            objArrZzB[i5] = null;
            objArrZzC[i5] = null;
            iArrZzA[i5] = 0;
            return;
        }
        int i12 = i5 + 1;
        Object obj2 = objArrZzB[i11];
        objArrZzB[i5] = obj2;
        objArrZzC[i5] = objArrZzC[i11];
        objArrZzB[i11] = null;
        objArrZzC[i11] = null;
        iArrZzA[i5] = iArrZzA[i11];
        iArrZzA[i11] = 0;
        int iZza = zzbc.zza(obj2) & i10;
        int iZzc = zzbb.zzc(obj, iZza);
        if (iZzc == size) {
            zzbb.zze(obj, iZza, i12);
            return;
        }
        while (true) {
            int i13 = iZzc - 1;
            int i14 = iArrZzA[i13];
            int i15 = i14 & i10;
            if (i15 == size) {
                iArrZzA[i13] = (i14 & (~i10)) | (i10 & i12);
                return;
            }
            iZzc = i15;
        }
    }

    public final boolean zzr() {
        return this.zze == null;
    }

    public zzba(int i5) {
        zzp(12);
    }
}
