package com.waze.sound.c;

import android.media.MediaCodec;
import h.g.b.ap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class m implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MediaCodec f39624a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ap f39625b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.h.c.a f39626c;

    m(MediaCodec mediaCodec, ap apVar, com.waze.h.c.a aVar) {
        this.f39624a = mediaCodec;
        this.f39625b = apVar;
        this.f39626c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // kotlinx.coroutines.b.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.nio.ByteBuffer r16, h.c.e r17) throws android.media.MediaCodec.CryptoException {
        /*
            r15 = this;
            r1 = r17
            boolean r2 = r1 instanceof com.waze.sound.c.l
            if (r2 == 0) goto L15
            r2 = r1
            com.waze.sound.c.l r2 = (com.waze.sound.c.l) r2
            int r3 = r2.f39623d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r2.f39623d = r3
            goto L1a
        L15:
            com.waze.sound.c.l r2 = new com.waze.sound.c.l
            r2.<init>(r15, r1)
        L1a:
            java.lang.Object r1 = r2.f39621b
            h.c.a.a r3 = h.c.a.a.f48038a
            int r4 = r2.f39623d
            r5 = 1
            if (r4 == 0) goto L35
            if (r4 != r5) goto L2d
            java.lang.Object r4 = r2.f39620a
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            e.b.c.b(r1)
            goto L3e
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            e.b.c.b(r1)
            r1 = 0
            r4 = r16
            r4.position(r1)
        L3e:
            boolean r1 = r4.hasRemaining()
            if (r1 == 0) goto L9d
            android.media.MediaCodec r6 = r15.f39624a
            r7 = 10000(0x2710, double:4.9407E-320)
            int r7 = r6.dequeueInputBuffer(r7)
            if (r7 >= 0) goto L5b
            r2.f39620a = r4
            r2.f39623d = r5
            r6 = 5
            java.lang.Object r1 = kotlinx.coroutines.aj.q(r6, r2)
            if (r1 != r3) goto L9b
            return r3
        L5b:
            java.nio.ByteBuffer r1 = r6.getInputBuffer(r7)
            h.g.b.x.c(r1)
            r1.clear()
            int r8 = r4.remaining()
            int r9 = r1.capacity()
            int r9 = java.lang.Math.min(r8, r9)
            int r8 = r4.limit()
            int r10 = r4.position()
            int r10 = r10 + r9
            r4.limit(r10)
            r1.put(r4)
            r4.limit(r8)
            h.g.b.ap r1 = r15.f39625b
            com.waze.h.c.a r8 = r15.f39626c
            int r10 = r9 / 2
            long r11 = com.waze.sound.c.n.b(r1, r8)
            long r13 = r1.f48104a
            r8 = r6
            long r5 = (long) r10
            long r13 = r13 + r5
            r1.f48104a = r13
            r10 = r11
            r12 = 0
            r6 = r8
            r8 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)
        L9b:
            r5 = 1
            goto L3e
        L9d:
            h.ab r0 = h.ab.f48028a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.c.m.emit(java.nio.ByteBuffer, h.c.e):java.lang.Object");
    }
}
