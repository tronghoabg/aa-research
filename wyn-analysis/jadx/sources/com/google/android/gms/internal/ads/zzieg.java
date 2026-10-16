package com.google.android.gms.internal.ads;

import cb.AbstractC1593a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzieg extends zzicx implements RandomAccess, zziew, zzigi {
    private static final float[] zza;
    private static final zzieg zzb;
    private float[] zzc;
    private int zzd;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        zzb = new zzieg(fArr, 0, false);
    }

    public zzieg() {
        this(zza, 0, true);
    }

    public static zzieg zzd() {
        return zzb;
    }

    private static int zzj(int i5) {
        return AbstractC1593a.c(i5, 3, 2, 1, 10);
    }

    private final void zzk(int i5) {
        if (i5 < 0 || i5 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzl(i5));
        }
    }

    private final String zzl(int i5) {
        int i10 = this.zzd;
        return com.google.android.gms.internal.consent_sdk.a.u(i5, i10, "Index:", ", Size:", new StringBuilder(String.valueOf(i5).length() + 13 + String.valueOf(i10).length()));
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i5, Object obj) {
        int i10;
        float fFloatValue = ((Float) obj).floatValue();
        zzdW();
        if (i5 < 0 || i5 > (i10 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzl(i5));
        }
        int i11 = i5 + 1;
        float[] fArr = this.zzc;
        int length = fArr.length;
        if (i10 < length) {
            System.arraycopy(fArr, i5, fArr, i11, i10 - i5);
        } else {
            float[] fArr2 = new float[zzj(length)];
            System.arraycopy(this.zzc, 0, fArr2, 0, i5);
            System.arraycopy(this.zzc, i5, fArr2, i11, this.zzd - i5);
            this.zzc = fArr2;
        }
        this.zzc[i5] = fFloatValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdW();
        collection.getClass();
        if (!(collection instanceof zzieg)) {
            return super.addAll(collection);
        }
        zzieg zziegVar = (zzieg) collection;
        int i5 = zziegVar.zzd;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.zzd;
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        float[] fArr = this.zzc;
        if (i11 > fArr.length) {
            this.zzc = Arrays.copyOf(fArr, i11);
        }
        System.arraycopy(zziegVar.zzc, 0, this.zzc, this.zzd, zziegVar.zzd);
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
        if (!(obj instanceof zzieg)) {
            return super.equals(obj);
        }
        zzieg zziegVar = (zzieg) obj;
        if (this.zzd != zziegVar.zzd) {
            return false;
        }
        float[] fArr = zziegVar.zzc;
        for (int i5 = 0; i5 < this.zzd; i5++) {
            if (Float.floatToIntBits(this.zzc[i5]) != Float.floatToIntBits(fArr[i5])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzk(i5);
        return Float.valueOf(this.zzc[i5]);
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i5 = 0; i5 < this.zzd; i5++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zzc[i5]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i5 = this.zzd;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.zzc[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zzdW();
        zzk(i5);
        float[] fArr = this.zzc;
        float f10 = fArr[i5];
        if (i5 < this.zzd - 1) {
            System.arraycopy(fArr, i5 + 1, fArr, i5, (r2 - i5) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        zzdW();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzc;
        System.arraycopy(fArr, i10, fArr, i5, this.zzd - i10);
        this.zzd -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zzdW();
        zzk(i5);
        float[] fArr = this.zzc;
        float f10 = fArr[i5];
        fArr[i5] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzifb, com.google.android.gms.internal.ads.zzier
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zziew zzh(int i5) {
        if (i5 >= this.zzd) {
            return new zzieg(i5 == 0 ? zza : Arrays.copyOf(this.zzc, i5), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zzf(int i5) {
        zzk(i5);
        return this.zzc[i5];
    }

    public final void zzg(float f10) {
        zzdW();
        int i5 = this.zzd;
        int length = this.zzc.length;
        if (i5 == length) {
            float[] fArr = new float[zzj(length)];
            System.arraycopy(this.zzc, 0, fArr, 0, this.zzd);
            this.zzc = fArr;
        }
        float[] fArr2 = this.zzc;
        int i10 = this.zzd;
        this.zzd = i10 + 1;
        fArr2[i10] = f10;
    }

    public final void zzi(int i5) {
        int length = this.zzc.length;
        if (i5 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new float[Math.max(i5, 10)];
            return;
        }
        while (length < i5) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzieg(float[] fArr, int i5, boolean z2) {
        super(z2);
        this.zzc = fArr;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Float) obj).floatValue());
        return true;
    }
}
