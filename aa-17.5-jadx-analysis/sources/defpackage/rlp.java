package defpackage;

import java.io.PrintWriter;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class rlp extends rln {
    public static rll a;

    public rlp() {
        super(rro.VIDEO_SINK);
    }

    @Override // defpackage.rln, defpackage.rll
    public final void c(String str, long j, boolean z, ByteBuffer byteBuffer, PrintWriter printWriter) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        char c = (char) byteBufferDuplicate.getShort();
        int iO = wub.o(c);
        if (iO == 0) {
            b(str, j, rro.VIDEO_SINK.name(), z, String.valueOf((int) c), byteBufferDuplicate, printWriter);
            printWriter.println();
            printWriter.printf("Received unexpected message of type %d", Integer.valueOf(c));
            printWriter.println();
            return;
        }
        try {
            switch (iO - 1) {
                case 32775:
                    b(str, j, rro.VIDEO_SINK.name(), z, wub.n(iO), byteBufferDuplicate, printWriter);
                    printWriter.print(":{");
                    xph xphVar = (xph) abnv.A(xph.a, byteBufferDuplicate, abnj.a());
                    if (xphVar != null) {
                        xpe xpeVarB = xpe.b(xphVar.c);
                        if (xpeVarB == null) {
                            xpeVarB = xpe.VIDEO_FOCUS_PROJECTED;
                        }
                        String strName = xpeVarB.name();
                        xpg xpgVarB = xpg.b(xphVar.d);
                        if (xpgVarB == null) {
                            xpgVarB = xpg.UNKNOWN;
                        }
                        printWriter.printf("%s:%s", strName, xpgVarB.name());
                        break;
                    }
                    break;
                case 32776:
                    b(str, j, rro.VIDEO_SINK.name(), z, wub.n(iO), byteBufferDuplicate, printWriter);
                    printWriter.print(":{");
                    xpf xpfVar = (xpf) abnv.A(xpf.a, byteBufferDuplicate, abnj.a());
                    if (xpfVar != null) {
                        xpe xpeVarB2 = xpe.b(xpfVar.b);
                        if (xpeVarB2 == null) {
                            xpeVarB2 = xpe.VIDEO_FOCUS_PROJECTED;
                        }
                        printWriter.printf("%s", xpeVarB2.name());
                        break;
                    }
                    break;
                default:
                    super.c(str, j, z, byteBuffer, printWriter);
                    return;
            }
        } catch (abon unused) {
        }
        printWriter.println("}");
    }
}
