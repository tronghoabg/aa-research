package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import j$.util.Objects;

/* loaded from: classes4.dex */
final class zbld extends zbkx {
    static final zbkx zba = new zbld(new Object[0], 0);
    final transient Object[] zbb;
    private final transient int zbc;

    public zbld(Object[] objArr, int i5) {
        this.zbb = objArr;
        this.zbc = i5;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zbkj.zba(i5, this.zbc, "index");
        Object obj = this.zbb[i5];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final int zba(Object[] objArr, int i5) {
        System.arraycopy(this.zbb, 0, objArr, 0, this.zbc);
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final int zbb() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final int zbc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final Object[] zbe() {
        return this.zbb;
    }
}
