package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
final class zbkw extends zbkx {
    final transient int zba;
    final transient int zbb;
    final /* synthetic */ zbkx zbc;

    public zbkw(zbkx zbkxVar, int i5, int i10) {
        this.zbc = zbkxVar;
        this.zba = i5;
        this.zbb = i10;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zbkj.zba(i5, this.zbb, "index");
        return this.zbc.get(i5 + this.zba);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final int zbb() {
        return this.zbc.zbc() + this.zba + this.zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final int zbc() {
        return this.zbc.zbc() + this.zba;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    public final Object[] zbe() {
        return this.zbc.zbe();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx, java.util.List
    /* renamed from: zbf, reason: merged with bridge method [inline-methods] */
    public final zbkx subList(int i5, int i10) {
        zbkj.zbd(i5, i10, this.zbb);
        int i11 = this.zba;
        return this.zbc.subList(i5 + i11, i10 + i11);
    }
}
