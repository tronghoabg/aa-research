package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ivl implements defpackage.iwo {
    final /* synthetic */ defpackage.ivn a;

    public ivl(defpackage.ivn ivnVar) {
        this.a = ivnVar;
    }

    @Override // defpackage.iwo
    public final void a(java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) {
        ((defpackage.yqj) defpackage.ivn.a.l().ai(1378)).w("codec config %d", bufferInfo.size);
        defpackage.jeu jeuVar = this.a.f;
        jeuVar.getClass();
        if (!jeuVar.g) {
            defpackage.ypu ypuVarAi = defpackage.jeu.a.g().ai(1906);
            defpackage.izv izvVar = jeuVar.w;
            izvVar.getClass();
            ypuVarAi.w("Trying to send codec config without starting media, ch:%d", ((defpackage.izk) izvVar).b);
            jeuVar.B(defpackage.ovl.TRIED_TO_SEND_CODEC_CONFIG_WHILE_NOT_STARTED);
            return;
        }
        jeuVar.B(defpackage.ovl.SENDING_CODEC_CONFIG);
        if (byteBuffer.hasArray()) {
            jeuVar.n(1, byteBuffer.array(), true, byteBuffer.arrayOffset(), byteBuffer.remaining());
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        jeuVar.q(bArr);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iwo
    public final void b(java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) {
        defpackage.ire ireVar;
        long jElapsedRealtime;
        java.nio.ByteBuffer byteBufferAllocate;
        defpackage.jcu jcuVar;
        defpackage.ivn ivnVar = this.a;
        defpackage.ivo ivoVar = ivnVar.h;
        long j = 1000;
        boolean z = true;
        if (ivoVar != null) {
            long j2 = bufferInfo.presentationTimeUs;
            long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
            defpackage.jko jkoVar = ((defpackage.inh) ivoVar).ai;
            long jA = jkoVar.a(jElapsedRealtimeNanos, j2);
            if (jA != 0) {
                jkoVar.f = true;
            }
            if (((defpackage.inh) ivoVar).h) {
                ((defpackage.inh) ivoVar).B.incrementAndGet();
            }
            if (jA == 0) {
                jA = 0;
            } else {
                ((defpackage.inh) ivoVar).Z.j.g((int) ((jElapsedRealtimeNanos - jA) / 1000));
                ((defpackage.inh) ivoVar).aj.d();
            }
            jElapsedRealtime = jA / 1000;
            ireVar = new defpackage.ire(ivoVar, 8);
        } else {
            ireVar = null;
            jElapsedRealtime = 0;
        }
        defpackage.jcw jcwVar = ivnVar.y;
        boolean zN = defpackage.a.N();
        int iLimit = byteBuffer.limit() + 10;
        if (iLimit == 0) {
            jcuVar = ((defpackage.jcv) jcwVar).d ? defpackage.jcv.a : defpackage.jcv.b;
            j = 1000;
        } else if (zN) {
            defpackage.ygw ygwVar = ((defpackage.jcv) jcwVar).c;
            if (ygwVar.isEmpty()) {
                j = 1000;
                if (((defpackage.jcv) jcwVar).d) {
                    byteBufferAllocate = java.nio.ByteBuffer.allocateDirect(iLimit);
                } else {
                    byteBufferAllocate = java.nio.ByteBuffer.allocate(iLimit);
                }
                byteBufferAllocate.limit(iLimit);
                jcuVar = new defpackage.jcu(byteBufferAllocate, null, false);
            } else {
                defpackage.ysr.aY(iLimit > 0, "Capacity must be greater than 0");
                int iCY = defpackage.ysr.cY(iLimit, java.math.RoundingMode.CEILING);
                int i = ((defpackage.ymx) ygwVar).c;
                if (iCY >= i) {
                    throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("Capacity %s ByteBuffer pool does not exist for %s pool. Max supported capacity is %s", java.lang.Integer.valueOf(iLimit), ((defpackage.jcv) jcwVar).f.name(), java.lang.Integer.valueOf(defpackage.ysr.cZ(i - 1))));
                }
                defpackage.jcs jcsVar = (defpackage.jcs) ygwVar.get(iCY);
                defpackage.jcu jcuVar2 = new defpackage.jcu(jcsVar.b(), jcsVar, ((defpackage.jcv) jcwVar).e);
                jcuVar2.p(iLimit);
                jcuVar = jcuVar2;
            }
        } else {
            j = 1000;
            if (((defpackage.jcv) jcwVar).d) {
                byteBufferAllocate = java.nio.ByteBuffer.allocateDirect(iLimit);
            } else {
                byteBufferAllocate = java.nio.ByteBuffer.allocate(iLimit);
            }
            byteBufferAllocate.limit(iLimit);
            jcuVar = new defpackage.jcu(byteBufferAllocate, null, false);
        }
        jcuVar.v((short) 0);
        jcuVar.q(10);
        byteBuffer.rewind();
        jcuVar.r(byteBuffer);
        if (jElapsedRealtime == 0) {
            jElapsedRealtime = android.os.SystemClock.elapsedRealtime() * j;
        }
        boolean z2 = ivnVar.x;
        if (!z2) {
            defpackage.jeu jeuVar = ivnVar.f;
            jeuVar.getClass();
            if (!jeuVar.E()) {
                z = false;
            }
        }
        if (!z2 && ivoVar != null && !((defpackage.inh) ivoVar).h) {
            ((defpackage.inh) ivoVar).aj.b();
        }
        if (z) {
            defpackage.jeu jeuVar2 = ivnVar.f;
            jeuVar2.getClass();
            jeuVar2.D(jElapsedRealtime, jcuVar, ireVar);
        } else {
            jcuVar.close();
        }
        if (ivoVar != null) {
            ivoVar.D();
        }
    }

    @Override // defpackage.iwo
    public final void c(java.lang.String str) {
        ((defpackage.yqj) ((defpackage.yqj) defpackage.ivn.a.g()).ai((char) 1379)).y("video encoder returned error %s", str);
        this.a.z.e(defpackage.zbe.PROJECTION_WINDOW_MANAGER, defpackage.zbd.Ju);
    }
}
