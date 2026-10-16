package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes2.dex */
final class rtr implements WritableByteChannel {
    public final ByteBuffer[] a = new ByteBuffer[256];
    public final ByteBuffer b = ByteBuffer.allocate(8);
    public final ByteBuffer c = ByteBuffer.allocate(16384);
    public int d;
    public int e;
    public int f;
    public byte g;
    public int h;
    public boolean i;
    final /* synthetic */ rtt j;
    private boolean k;
    private boolean l;
    private final wyd m;

    public rtr(rtt rttVar, wyd wydVar) {
        this.j = rttVar;
        this.m = wydVar;
    }

    private static final boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        rtt rttVar = this.j;
        if (rttVar.c.getAndSet(false)) {
            rttVar.l.d(yzf.READER_CLOSE);
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x02db, code lost:
    
        r0 = r23.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02dd, code lost:
    
        if (r0 != 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02e9, code lost:
    
        return 4 - r23.b.position();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02ea, code lost:
    
        if (r0 != 1) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02f3, code lost:
    
        return 8 - r23.b.position();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02f4, code lost:
    
        if (r0 != 2) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02f8, code lost:
    
        return r23.h;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x024b A[Catch: OutOfMemoryError -> 0x026e, IOException -> 0x0270, IOException | OutOfMemoryError | rtk -> 0x0272, TryCatch #6 {IOException | OutOfMemoryError | rtk -> 0x0272, blocks: (B:6:0x000f, B:7:0x0019, B:9:0x001c, B:11:0x0022, B:13:0x0037, B:15:0x0063, B:16:0x006c, B:33:0x00bd, B:34:0x00be, B:36:0x00c6, B:37:0x00c9, B:40:0x00d3, B:42:0x00db, B:47:0x00fc, B:49:0x0104, B:50:0x011e, B:51:0x0125, B:52:0x0126, B:53:0x0131, B:43:0x00df, B:45:0x00f2, B:55:0x0134, B:57:0x013c, B:59:0x0140, B:61:0x0146, B:63:0x014a, B:64:0x015d, B:65:0x0166, B:69:0x016f, B:70:0x0171, B:72:0x0175, B:74:0x0182, B:84:0x01e9, B:86:0x01ed, B:88:0x01f7, B:90:0x0206, B:92:0x020a, B:95:0x0233, B:102:0x0255, B:94:0x0221, B:96:0x023b, B:97:0x0242, B:98:0x0243, B:99:0x024a, B:100:0x024b, B:103:0x0259, B:104:0x0260, B:75:0x01a6, B:77:0x01be, B:79:0x01cc, B:80:0x01d3, B:81:0x01d7, B:105:0x0261, B:106:0x0268), top: B:142:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ed A[Catch: OutOfMemoryError -> 0x026e, IOException -> 0x0270, IOException | OutOfMemoryError | rtk -> 0x0272, TryCatch #6 {IOException | OutOfMemoryError | rtk -> 0x0272, blocks: (B:6:0x000f, B:7:0x0019, B:9:0x001c, B:11:0x0022, B:13:0x0037, B:15:0x0063, B:16:0x006c, B:33:0x00bd, B:34:0x00be, B:36:0x00c6, B:37:0x00c9, B:40:0x00d3, B:42:0x00db, B:47:0x00fc, B:49:0x0104, B:50:0x011e, B:51:0x0125, B:52:0x0126, B:53:0x0131, B:43:0x00df, B:45:0x00f2, B:55:0x0134, B:57:0x013c, B:59:0x0140, B:61:0x0146, B:63:0x014a, B:64:0x015d, B:65:0x0166, B:69:0x016f, B:70:0x0171, B:72:0x0175, B:74:0x0182, B:84:0x01e9, B:86:0x01ed, B:88:0x01f7, B:90:0x0206, B:92:0x020a, B:95:0x0233, B:102:0x0255, B:94:0x0221, B:96:0x023b, B:97:0x0242, B:98:0x0243, B:99:0x024a, B:100:0x024b, B:103:0x0259, B:104:0x0260, B:75:0x01a6, B:77:0x01be, B:79:0x01cc, B:80:0x01d3, B:81:0x01d7, B:105:0x0261, B:106:0x0268), top: B:142:0x000f }] */
    @Override // java.nio.channels.WritableByteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int write(java.nio.ByteBuffer r24) throws java.lang.InterruptedException, defpackage.rtk, java.io.IOException {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rtr.write(java.nio.ByteBuffer):int");
    }
}
