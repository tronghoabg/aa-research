package com.google.protobuf;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class T0 extends AbstractList implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27625a;

    /* renamed from: b, reason: collision with root package name */
    public final LazyStringArrayList f27626b;

    public /* synthetic */ T0(LazyStringArrayList lazyStringArrayList, int i5) {
        this.f27625a = i5;
        this.f27626b = lazyStringArrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        switch (this.f27625a) {
            case 0:
                this.f27626b.add(i5, (byte[]) obj);
                ((AbstractList) this).modCount++;
                break;
            default:
                this.f27626b.add(i5, (ByteString) obj);
                ((AbstractList) this).modCount++;
                break;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        switch (this.f27625a) {
            case 0:
                return this.f27626b.getByteArray(i5);
            default:
                return this.f27626b.getByteString(i5);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        switch (this.f27625a) {
            case 0:
                String strRemove = this.f27626b.remove(i5);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.asByteArray(strRemove);
            default:
                String strRemove2 = this.f27626b.remove(i5);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.asByteString(strRemove2);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        switch (this.f27625a) {
            case 0:
                Object andReturn = this.f27626b.setAndReturn(i5, (byte[]) obj);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.asByteArray(andReturn);
            default:
                Object andReturn2 = this.f27626b.setAndReturn(i5, (ByteString) obj);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.asByteString(andReturn2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f27625a) {
        }
        return this.f27626b.size();
    }
}
