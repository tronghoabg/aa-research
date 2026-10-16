package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class zzava extends zzimg {
    public zzava(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzimg
    public final void zze(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
}
