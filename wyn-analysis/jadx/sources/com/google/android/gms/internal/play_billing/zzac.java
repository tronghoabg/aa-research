package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
abstract class zzac extends zzaw {
    private final int zza;
    private int zzb;

    public zzac(int i5, int i10) {
        zzaa.zzb(i10, i5, "index");
        this.zza = i5;
        this.zzb = i10;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i5 = this.zzb;
        this.zzb = i5 + 1;
        return zza(i5);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i5 = this.zzb - 1;
        this.zzb = i5;
        return zza(i5);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzb - 1;
    }

    public abstract Object zza(int i5);
}
