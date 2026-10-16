package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
final class jab implements WritableByteChannel {
    final /* synthetic */ jad a;
    private final ByteBuffer[] b = new ByteBuffer[256];
    private final ByteBuffer c = ByteBuffer.allocate(8);
    private final ByteBuffer d = ByteBuffer.allocate(16384);
    private int e;
    private int f;
    private int g;
    private byte h;
    private boolean i;
    private boolean j;
    private int k;
    private boolean l;
    private final wyd m;

    public jab(jad jadVar, wyd wydVar) {
        this.a = jadVar;
        this.m = wydVar;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        izd izdVar;
        jad jadVar = this.a;
        if (jadVar.c.getAndSet(false)) {
            if (!acrb.B()) {
                this.a.i.a(yzf.READER_CLOSE);
                return;
            }
            izj izjVar = jadVar.i;
            woy.aa(acrb.B(), "Flag FrameworkGalFeature.postReaderCloseOnControlChannelHandler() must be enabled to call onReceiverClosed");
            Object obj = izjVar.a;
            synchronized (((izl) obj).d) {
                izdVar = ((izl) obj).c[0];
            }
            if (izdVar == null) {
                izl.a.h().ai(1674).u("onReceiverClosed: control channel is null, dropping READER_CLOSE as channel manager is stopping");
            } else {
                izdVar.m.post(new ire(izjVar, 9));
            }
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01fd, code lost:
    
        throw new defpackage.izv("Unencrypted frame not allowed");
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0214 A[Catch: OutOfMemoryError -> 0x013d, IOException -> 0x0140, izv -> 0x0143, TryCatch #8 {izv -> 0x0143, IOException -> 0x0140, OutOfMemoryError -> 0x013d, blocks: (B:24:0x006b, B:25:0x0074, B:44:0x00cc, B:46:0x00d1, B:47:0x00d4, B:42:0x00c9, B:52:0x00e3, B:54:0x00e8, B:59:0x0109, B:61:0x0111, B:62:0x0129, B:63:0x0130, B:64:0x0131, B:65:0x013c, B:55:0x00ec, B:57:0x00ff, B:73:0x0148, B:75:0x0150, B:78:0x0156, B:80:0x015a, B:82:0x015e, B:83:0x0171, B:84:0x017a, B:88:0x0183, B:89:0x0185, B:91:0x0189, B:93:0x0196, B:111:0x0210, B:113:0x0214, B:115:0x021e, B:117:0x022d, B:119:0x0231, B:126:0x0267, B:133:0x0288, B:121:0x0248, B:125:0x0257, B:127:0x026e, B:128:0x0275, B:129:0x0276, B:130:0x027d, B:131:0x027e, B:134:0x028c, B:135:0x0293, B:94:0x01ba, B:96:0x01d2, B:98:0x01e0, B:99:0x01e7, B:100:0x01eb, B:102:0x01ef, B:106:0x01f6, B:107:0x01fd, B:108:0x01fe, B:136:0x0294, B:137:0x029b), top: B:174:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027e A[Catch: OutOfMemoryError -> 0x013d, IOException -> 0x0140, izv -> 0x0143, TryCatch #8 {izv -> 0x0143, IOException -> 0x0140, OutOfMemoryError -> 0x013d, blocks: (B:24:0x006b, B:25:0x0074, B:44:0x00cc, B:46:0x00d1, B:47:0x00d4, B:42:0x00c9, B:52:0x00e3, B:54:0x00e8, B:59:0x0109, B:61:0x0111, B:62:0x0129, B:63:0x0130, B:64:0x0131, B:65:0x013c, B:55:0x00ec, B:57:0x00ff, B:73:0x0148, B:75:0x0150, B:78:0x0156, B:80:0x015a, B:82:0x015e, B:83:0x0171, B:84:0x017a, B:88:0x0183, B:89:0x0185, B:91:0x0189, B:93:0x0196, B:111:0x0210, B:113:0x0214, B:115:0x021e, B:117:0x022d, B:119:0x0231, B:126:0x0267, B:133:0x0288, B:121:0x0248, B:125:0x0257, B:127:0x026e, B:128:0x0275, B:129:0x0276, B:130:0x027d, B:131:0x027e, B:134:0x028c, B:135:0x0293, B:94:0x01ba, B:96:0x01d2, B:98:0x01e0, B:99:0x01e7, B:100:0x01eb, B:102:0x01ef, B:106:0x01f6, B:107:0x01fd, B:108:0x01fe, B:136:0x0294, B:137:0x029b), top: B:174:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0324  */
    @Override // java.nio.channels.WritableByteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int write(java.nio.ByteBuffer r26) throws defpackage.izv, java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jab.write(java.nio.ByteBuffer):int");
    }
}
