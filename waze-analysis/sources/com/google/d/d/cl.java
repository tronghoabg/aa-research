package com.google.d.d;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class cl extends bq {

    /* renamed from: d, reason: collision with root package name */
    private transient Object[] f7495d;

    /* renamed from: e, reason: collision with root package name */
    private transient Object[] f7496e;

    /* renamed from: f, reason: collision with root package name */
    private final Comparator f7497f;

    public cl(Comparator comparator) {
        com.google.d.b.an.B(comparator);
        this.f7497f = comparator;
        this.f7495d = new Object[4];
        this.f7496e = new Object[4];
    }

    @Override // com.google.d.d.bq
    public final /* bridge */ /* synthetic */ bs b() {
        int i2 = this.f7462b;
        if (i2 == 0) {
            return cn.p(this.f7497f);
        }
        if (i2 == 1) {
            return cn.v(this.f7497f, Objects.requireNonNull(this.f7495d[0]), Objects.requireNonNull(this.f7496e[0]));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f7495d, i2);
        Comparator comparator = this.f7497f;
        Arrays.sort(objArrCopyOf, comparator);
        Object[] objArr = new Object[this.f7462b];
        for (int i3 = 0; i3 < this.f7462b; i3++) {
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (comparator.compare(objArrCopyOf[i4], objArrCopyOf[i3]) == 0) {
                    throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + String.valueOf(objArrCopyOf[i4]) + " and " + String.valueOf(objArrCopyOf[i3]));
                }
            }
            objArr[Arrays.binarySearch(objArrCopyOf, Objects.requireNonNull(this.f7495d[i3]), comparator)] = Objects.requireNonNull(this.f7496e[i3]);
        }
        return new cn(new fc(bn.k(objArrCopyOf), comparator), bn.k(objArr));
    }

    @Override // com.google.d.d.bq
    public final /* bridge */ /* synthetic */ void d(Object obj, Object obj2) {
        int i2 = this.f7462b + 1;
        int length = this.f7495d.length;
        if (i2 > length) {
            int iE = bg.e(length, i2);
            this.f7495d = Arrays.copyOf(this.f7495d, iE);
            this.f7496e = Arrays.copyOf(this.f7496e, iE);
        }
        fo.af(obj, obj2);
        Object[] objArr = this.f7495d;
        int i3 = this.f7462b;
        objArr[i3] = obj;
        this.f7496e[i3] = obj2;
        this.f7462b = i3 + 1;
    }
}
