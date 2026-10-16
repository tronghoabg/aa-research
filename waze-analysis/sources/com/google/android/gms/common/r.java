package com.google.android.gms.common;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class r extends q {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f5121a;

    r(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f5121a = bArr;
    }

    @Override // com.google.android.gms.common.q
    final byte[] e() {
        return this.f5121a;
    }
}
