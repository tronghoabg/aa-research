package com.google.android.gms.internal.ads;

import cb.AbstractC1593a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzieq extends zzicx implements RandomAccess, zziex, zzigi {
    private static final int[] zza;
    private static final zzieq zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new zzieq(iArr, 0, false);
    }

    public zzieq() {
        this(zza, 0, true);
    }

    public static zzieq zzd() {
        return zzb;
    }

    private static int zzk(int i5) {
        return AbstractC1593a.c(i5, 3, 2, 1, 10);
    }

    private final void zzl(int i5) {
        if (i5 < 0 || i5 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzm(i5));
        }
    }

    private final String zzm(int i5) {
        int i10 = this.zzd;
        return com.google.android.gms.internal.consent_sdk.a.u(i5, i10, "Index:", ", Size:", new StringBuilder(String.valueOf(i5).length() + 13 + String.valueOf(i10).length()));
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i5, Object obj) {
        int i10;
        int iIntValue = ((Integer) obj).intValue();
        zzdW();
        if (i5 < 0 || i5 > (i10 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzm(i5));
        }
        int i11 = i5 + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i5, iArr, i11, i10 - i5);
        } else {
            int[] iArr2 = new int[zzk(length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i5);
            System.arraycopy(this.zzc, i5, iArr2, i11, this.zzd - i5);
            this.zzc = iArr2;
        }
        this.zzc[i5] = iIntValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdW();
        collection.getClass();
        if (!(collection instanceof zzieq)) {
            return super.addAll(collection);
        }
        zzieq zzieqVar = (zzieq) collection;
        int i5 = zzieqVar.zzd;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.zzd;
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        int[] iArr = this.zzc;
        if (i11 > iArr.length) {
            this.zzc = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(zzieqVar.zzc, 0, this.zzc, this.zzd, zzieqVar.zzd);
        this.zzd = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzieq)) {
            return super.equals(obj);
        }
        zzieq zzieqVar = (zzieq) obj;
        if (this.zzd != zzieqVar.zzd) {
            return false;
        }
        int[] iArr = zzieqVar.zzc;
        for (int i5 = 0; i5 < this.zzd; i5++) {
            if (this.zzc[i5] != iArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzl(i5);
        return Integer.valueOf(this.zzc[i5]);
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            i5 = (i5 * 31) + this.zzc[i10];
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i5 = this.zzd;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.zzc[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zzdW();
        zzl(i5);
        int[] iArr = this.zzc;
        int i10 = iArr[i5];
        if (i5 < this.zzd - 1) {
            System.arraycopy(iArr, i5 + 1, iArr, i5, (r2 - i5) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        zzdW();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzc;
        System.arraycopy(iArr, i10, iArr, i5, this.zzd - i10);
        this.zzd -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        return Integer.valueOf(zzg(i5, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzifb, com.google.android.gms.internal.ads.zzier
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zziex zzh(int i5) {
        if (i5 >= this.zzd) {
            return new zzieq(i5 == 0 ? zza : Arrays.copyOf(this.zzc, i5), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zziex
    public final int zzf(int i5) {
        zzl(i5);
        return this.zzc[i5];
    }

    @Override // com.google.android.gms.internal.ads.zziex
    public final int zzg(int i5, int i10) {
        zzdW();
        zzl(i5);
        int[] iArr = this.zzc;
        int i11 = iArr[i5];
        iArr[i5] = i10;
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zziex
    public final void zzi(int i5) {
        zzdW();
        int i10 = this.zzd;
        int length = this.zzc.length;
        if (i10 == length) {
            int[] iArr = new int[zzk(length)];
            System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        iArr2[i11] = i5;
    }

    public final void zzj(int i5) {
        int length = this.zzc.length;
        if (i5 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[Math.max(i5, 10)];
            return;
        }
        while (length < i5) {
            length = zzk(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzieq(int[] iArr, int i5, boolean z2) {
        super(z2);
        this.zzc = iArr;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzi(((Integer) obj).intValue());
        return true;
    }
}
