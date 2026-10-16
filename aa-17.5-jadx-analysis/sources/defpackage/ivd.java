package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class ivd implements iwg {
    final /* synthetic */ ivf a;

    public ivd(ivf ivfVar) {
        this.a = ivfVar;
    }

    @Override // defpackage.iwg
    public final void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((ype) ivf.a.l().ai(1378)).w("codec config %d", bufferInfo.size);
        jem jemVar = this.a.f;
        jemVar.getClass();
        if (!jemVar.g) {
            yop yopVarAi = jem.a.g().ai(1906);
            izo izoVar = jemVar.w;
            izoVar.getClass();
            yopVarAi.w("Trying to send codec config without starting media, ch:%d", ((izd) izoVar).b);
            jemVar.C(ouo.TRIED_TO_SEND_CODEC_CONFIG_WHILE_NOT_STARTED);
            return;
        }
        jemVar.C(ouo.SENDING_CODEC_CONFIG);
        if (byteBuffer.hasArray()) {
            jemVar.n(1, byteBuffer.array(), true, byteBuffer.arrayOffset(), byteBuffer.remaining());
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        jemVar.q(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    @Override // defpackage.iwg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.nio.ByteBuffer r19, android.media.MediaCodec.BufferInfo r20) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivd.b(java.nio.ByteBuffer, android.media.MediaCodec$BufferInfo):void");
    }

    @Override // defpackage.iwg
    public final void c(String str) {
        ((ype) ((ype) ivf.a.g()).ai((char) 1379)).y("video encoder returned error %s", str);
        this.a.z.e(yzz.PROJECTION_WINDOW_MANAGER, yzy.Jq);
    }
}
