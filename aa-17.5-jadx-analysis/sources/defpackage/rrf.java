package defpackage;

import android.media.MediaCodec;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
final class rrf implements Runnable {
    final /* synthetic */ Semaphore a;
    final /* synthetic */ rrg b;

    public rrf(rrg rrgVar, Semaphore semaphore) {
        this.a = semaphore;
        this.b = rrgVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        rrg rrgVar = this.b;
        rrgVar.c();
        try {
            ypf ypfVar = rrg.f;
            ypfVar.l().ai(8205).u("encodingThread starts");
            rrgVar.i = rrgVar.d();
            this.a.release();
            ByteBuffer[] byteBufferArrN = rrgVar.i.N();
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            while (rrgVar.g) {
                if (rrgVar.h) {
                    ypfVar.l().ai(8211).u("quitting encoding");
                    rrgVar.b();
                    rrgVar.h = false;
                }
                vqk vqkVar = rlc.c;
                rlc.a(vqkVar);
                int iDequeueOutputBuffer = ((MediaCodec) rrgVar.i.a).dequeueOutputBuffer(bufferInfo, 500000L);
                rlc.a(vqkVar);
                if (iDequeueOutputBuffer != -1) {
                    if (iDequeueOutputBuffer == -3) {
                        byteBufferArrN = rrgVar.i.N();
                    } else if (iDequeueOutputBuffer == -2) {
                        ypfVar.l().ai(8210).u("MediaCodec format change");
                    } else {
                        if (iDequeueOutputBuffer < 0) {
                            throw new Exception(a.bp(iDequeueOutputBuffer, "dequeueOutputBuffer returned "));
                        }
                        ByteBuffer byteBuffer = byteBufferArrN[iDequeueOutputBuffer];
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        if ((bufferInfo.flags & 2) != 0) {
                            ypfVar.l().ai(8209).u("codec config");
                            Object obj = rrgVar.j.a;
                            ByteBuffer byteBuffer2 = ((rfo) obj).g;
                            byteBuffer2.getClass();
                            byteBuffer2.clear();
                            ((rfo) obj).g.put(byteBuffer);
                            ((rfo) obj).g.limit(byteBuffer.limit());
                            ((rfo) obj).f.release();
                        } else if ((bufferInfo.flags & 4) != 0) {
                            rrgVar.g = false;
                        } else {
                            bufferInfo.presentationTimeUs = SystemClock.elapsedRealtime() * 1000;
                            Object obj2 = rrgVar.j.a;
                            rei reiVar = ((rfo) obj2).i;
                            ajki ajkiVarC = reiVar.c();
                            ajkiVarC.a = bufferInfo.presentationTimeUs;
                            if (((rfo) obj2).e) {
                                Object obj3 = ajkiVarC.b;
                                ((ByteBuffer) obj3).put(((rfo) obj2).c(byteBuffer.limit()));
                                ((ByteBuffer) obj3).put(byteBuffer);
                                ((ByteBuffer) obj3).limit(((ByteBuffer) obj3).position());
                            } else {
                                Object obj4 = ajkiVarC.b;
                                ((ByteBuffer) obj4).put(byteBuffer);
                                ((ByteBuffer) obj4).limit(((ByteBuffer) obj4).position());
                            }
                            ((ByteBuffer) ajkiVarC.b).position(10);
                            reiVar.e(ajkiVarC);
                            ((rfo) obj2).h.release();
                        }
                        ((MediaCodec) rrgVar.i.a).releaseOutputBuffer(iDequeueOutputBuffer, false);
                    }
                }
            }
            ypfVar.l().ai(8206).u("encodingThread ends");
        } catch (Exception e) {
            this.a.release();
            this.b.g = false;
            rrg.f.h().p(e).ai(8207).u("media encoder error");
            rfo.a.g().ai(7934).y("AAC audio encoder returned error: %s", e.toString());
        }
    }
}
