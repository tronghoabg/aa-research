package com.bumptech.glide.load.c.a;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class av implements com.bumptech.glide.load.q {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f3332a = ByteBuffer.allocate(4);

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f3333b;

    av(int i2, byte[] bArr) {
        this.f3333b = i2;
    }

    @Override // com.bumptech.glide.load.q
    public final /* synthetic */ void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        if (this.f3333b != 0) {
            Long l2 = (Long) obj;
            messageDigest.update(bArr);
            ByteBuffer byteBuffer = this.f3332a;
            synchronized (byteBuffer) {
                byteBuffer.position(0);
                messageDigest.update(byteBuffer.putLong(l2.longValue()).array());
            }
            return;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        ByteBuffer byteBuffer2 = this.f3332a;
        synchronized (byteBuffer2) {
            byteBuffer2.position(0);
            messageDigest.update(byteBuffer2.putInt(num.intValue()).array());
        }
    }

    av(int i2) {
        this.f3333b = i2;
    }
}
