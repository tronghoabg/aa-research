package com.google.firebase.crashlytics.a.c;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicLong f9169a = new AtomicLong(0);

    /* renamed from: b, reason: collision with root package name */
    private static String f9170b;

    e(aq aqVar) {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b2 = bArrArray[0];
        byte b3 = bArrArray[1];
        byte b4 = bArrArray[2];
        byte b5 = bArrArray[3];
        byte[] bArrA = a(time % 1000);
        byte b6 = bArrA[0];
        byte b7 = bArrA[1];
        byte[] bArrA2 = a(f9169a.incrementAndGet());
        byte b8 = bArrA2[0];
        byte b9 = bArrA2[1];
        byte[] bArrA3 = a(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {b2, b3, b4, b5, b6, b7, b8, b9, bArrA3[0], bArrA3[1]};
        String strH = g.h(aqVar.b().b());
        String strG = g.g(bArr);
        f9170b = String.format(Locale.US, "%s%s%s%s", strG.substring(0, 12), strG.substring(12, 16), strG.subSequence(16, 20), strH.substring(0, 12)).toUpperCase(Locale.US);
    }

    private static byte[] a(long j2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j2);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return f9170b;
    }
}
