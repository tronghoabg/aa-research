package com.waze.sound.c;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import h.g.b.ap;
import h.g.b.x;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Objects;
import kotlinx.coroutines.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n implements f {

    /* renamed from: a, reason: collision with root package name */
    private final File f39627a;

    /* renamed from: b, reason: collision with root package name */
    private final c f39628b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f39629c;

    /* renamed from: d, reason: collision with root package name */
    private final ab f39630d;

    public n(File file, c cVar, com.waze.shared_infra.i.e eVar, ab abVar) {
        x.f(file, "cacheDir");
        x.f(cVar, "storageFactory");
        x.f(eVar, "logger");
        x.f(abVar, "dispatcher");
        this.f39627a = file;
        this.f39628b = cVar;
        this.f39629c = eVar;
        this.f39630d = abVar;
    }

    public static final /* synthetic */ Object f(n nVar, MediaCodec mediaCodec, MediaMuxer mediaMuxer, int i2, h.c.e eVar) {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        while (true) {
            if (!h.g.b.o.h(eVar.getContext())) {
                break;
            }
            int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 10000L);
            if (iDequeueOutputBuffer != -1) {
                if (iDequeueOutputBuffer == -2) {
                    com.waze.shared_infra.i.e eVar2 = nVar.f39629c;
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    Objects.toString(outputFormat);
                    eVar2.a("MediaCodec output format changed unexpectedly: ".concat(String.valueOf(outputFormat)));
                } else if (iDequeueOutputBuffer < 0) {
                    nVar.f39629c.g("Unexpected outputBufferIndex: " + iDequeueOutputBuffer);
                } else {
                    ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(iDequeueOutputBuffer);
                    if (outputBuffer == null) {
                        nVar.f39629c.g("Got null output buffer at index " + iDequeueOutputBuffer);
                    } else {
                        mediaMuxer.writeSampleData(i2, outputBuffer, bufferInfo);
                        mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                        if ((bufferInfo.flags & 4) != 0) {
                            nVar.f39629c.a("End of stream received from encoder.");
                            break;
                        }
                    }
                }
            }
        }
        return h.ab.f48028a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:22:0x008e
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object g(com.waze.sound.c.n r16, android.media.MediaCodec r17, kotlinx.coroutines.b.k r18, com.waze.h.c.a r19, h.c.e r20) {
        /*
            r0 = r17
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof com.waze.sound.c.k
            if (r3 == 0) goto L19
            r3 = r2
            com.waze.sound.c.k r3 = (com.waze.sound.c.k) r3
            int r4 = r3.f39616c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f39616c = r4
            goto L20
        L19:
            com.waze.sound.c.k r3 = new com.waze.sound.c.k
            r4 = r16
            r3.<init>(r4, r2)
        L20:
            java.lang.Object r2 = r3.f39614a
            h.c.a.a r4 = h.c.a.a.f48038a
            int r5 = r3.f39616c
            r6 = 0
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L60
            if (r5 == r8) goto L4b
            if (r5 != r7) goto L43
            h.g.b.ap r0 = r3.f39619f
            r1 = r0
            h.g.b.ap r1 = (h.g.b.ap) r1
            com.waze.h.c.a r1 = r3.f39618e
            r5 = r1
            com.waze.h.c.a r5 = (com.waze.h.c.a) r5
            android.media.MediaCodec r5 = r3.f39617d
            r9 = r5
            android.media.MediaCodec r9 = (android.media.MediaCodec) r9
            e.b.c.b(r2)
            r9 = r5
            goto L8e
        L43:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L4b:
            h.g.b.ap r0 = r3.f39619f
            r1 = r0
            h.g.b.ap r1 = (h.g.b.ap) r1
            com.waze.h.c.a r1 = r3.f39618e
            r5 = r1
            com.waze.h.c.a r5 = (com.waze.h.c.a) r5
            android.media.MediaCodec r5 = r3.f39617d
            r9 = r5
            android.media.MediaCodec r9 = (android.media.MediaCodec) r9
            e.b.c.b(r2)
            r2 = r0
            r0 = r5
            goto L8c
        L60:
            e.b.c.b(r2)
            com.waze.h.c.b r2 = r1.b()
            java.lang.Integer r2 = r2.a()
            if (r2 == 0) goto L70
            r2.intValue()
        L70:
            h.g.b.ap r2 = new h.g.b.ap
            r2.<init>()
            com.waze.sound.c.m r5 = new com.waze.sound.c.m
            r5.<init>(r0, r2, r1)
            kotlinx.coroutines.b.l r5 = (kotlinx.coroutines.b.l) r5
            r3.f39617d = r0
            r3.f39618e = r1
            r3.f39619f = r2
            r3.f39616c = r8
            r9 = r18
            java.lang.Object r5 = r9.collect(r5, r3)
            if (r5 == r4) goto Lc2
        L8c:
            r9 = r0
            r0 = r2
        L8e:
            if (r6 != 0) goto Lbf
            h.c.j r2 = r3.getContext()
            boolean r2 = h.g.b.o.h(r2)
            if (r2 == 0) goto Lbf
            r10 = 10000(0x2710, double:4.9407E-320)
            int r10 = r9.dequeueInputBuffer(r10)
            if (r10 >= 0) goto Lb3
            r3.f39617d = r9
            r3.f39618e = r1
            r3.f39619f = r0
            r3.f39616c = r7
            r10 = 5
            java.lang.Object r2 = kotlinx.coroutines.aj.q(r10, r3)
            if (r2 != r4) goto L8e
            goto Lc2
        Lb3:
            long r13 = h(r0, r1)
            r15 = 4
            r11 = 0
            r12 = 0
            r9.queueInputBuffer(r10, r11, r12, r13, r15)
            r6 = r8
            goto L8e
        Lbf:
            h.ab r0 = h.ab.f48028a
            return r0
        Lc2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.c.n.g(com.waze.sound.c.n, android.media.MediaCodec, kotlinx.coroutines.b.k, com.waze.h.c.a, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(ap apVar, com.waze.h.c.a aVar) {
        return (apVar.f48104a * 1000000) / aVar.d().a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.sound.c.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlinx.coroutines.b.k r6, com.waze.h.c.a r7, h.c.e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.waze.sound.c.g
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.sound.c.g r0 = (com.waze.sound.c.g) r0
            int r1 = r0.f39590c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39590c = r1
            goto L18
        L13:
            com.waze.sound.c.g r0 = new com.waze.sound.c.g
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f39588a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f39590c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r8)
            kotlinx.coroutines.ab r8 = r5.f39630d
            h.c.j r8 = (h.c.j) r8
            com.waze.sound.c.j r2 = new com.waze.sound.c.j
            r4 = 0
            r2.<init>(r5, r7, r6, r4)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.f39590c = r3
            java.lang.Object r8 = kotlinx.coroutines.aj.v(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            h.m r8 = (h.m) r8
            java.lang.Object r5 = r8.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.c.n.a(kotlinx.coroutines.b.k, com.waze.h.c.a, h.c.e):java.lang.Object");
    }
}
