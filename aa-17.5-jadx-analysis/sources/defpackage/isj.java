package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class isj implements iwg {
    final /* synthetic */ isk a;

    public isj(isk iskVar) {
        this.a = iskVar;
    }

    @Override // defpackage.iwg
    public final void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        isk iskVar = this.a;
        ByteBuffer byteBuffer2 = iskVar.f;
        byteBuffer2.getClass();
        byteBuffer2.clear();
        byteBuffer2.put(byteBuffer);
        byteBuffer2.limit(byteBuffer.limit());
        iskVar.c.release();
    }

    @Override // defpackage.iwg
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        isk iskVar = this.a;
        ipt iptVar = iskVar.e;
        ipr iprVarB = iptVar.b();
        iprVarB.a = bufferInfo.presentationTimeUs;
        if (iskVar.b) {
            ByteBuffer byteBuffer2 = iprVarB.h;
            byteBuffer2.put(iskVar.d(byteBuffer.limit()));
            byteBuffer2.put(byteBuffer);
            byteBuffer2.limit(byteBuffer2.position());
        } else {
            ByteBuffer byteBuffer3 = iprVarB.h;
            byteBuffer3.put(byteBuffer);
            byteBuffer3.limit(byteBuffer3.position());
        }
        iprVarB.h.position(10);
        iptVar.e(iprVarB);
        iskVar.d.release();
    }

    @Override // defpackage.iwg
    public final void c(String str) {
        ((ype) ((ype) isk.a.g()).ai((char) 1292)).y("AAC audio encoder returned error: %s", str);
    }
}
