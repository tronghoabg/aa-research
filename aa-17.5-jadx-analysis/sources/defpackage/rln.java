package defpackage;

import java.io.PrintWriter;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
class rln extends rll {
    private final rro a;

    public rln(rro rroVar) {
        this.a = rroVar;
    }

    @Override // defpackage.rll
    public void c(String str, long j, boolean z, ByteBuffer byteBuffer, PrintWriter printWriter) {
        String strN;
        long j2;
        boolean z2;
        ByteBuffer byteBuffer2;
        PrintWriter printWriter2;
        String str2;
        char c = (char) byteBuffer.getShort();
        String strName = this.a.name();
        int iO = wub.o(c);
        if (iO == 0) {
            strN = String.valueOf((int) c);
            iO = 0;
            str2 = str;
            j2 = j;
            z2 = z;
            byteBuffer2 = byteBuffer;
            printWriter2 = printWriter;
        } else {
            strN = wub.n(iO);
            j2 = j;
            z2 = z;
            byteBuffer2 = byteBuffer;
            printWriter2 = printWriter;
            str2 = str;
        }
        b(str2, j2, strName, z2, strN, byteBuffer2, printWriter2);
        if (iO == 0) {
            printWriter2.println();
            printWriter2.printf("Received unexpected message of type %d", Integer.valueOf(c));
            printWriter2.println();
            return;
        }
        printWriter2.print(":{");
        int i = iO - 1;
        if (i != 1) {
            try {
                switch (i) {
                    case 32768:
                        xof xofVar = (xof) abnv.A(xof.a, byteBuffer, abnj.a());
                        if (xofVar != null) {
                            xkj xkjVarB = xkj.b(xofVar.c);
                            if (xkjVarB == null) {
                                xkjVarB = xkj.MEDIA_CODEC_AUDIO_PCM;
                            }
                            printWriter2.print(xkjVarB.name());
                            break;
                        }
                        break;
                    case 32769:
                        xoh xohVar = (xoh) abnv.A(xoh.a, byteBuffer, abnj.a());
                        if (xohVar != null) {
                            printWriter2.printf("%d:%d", Integer.valueOf(xohVar.c), Integer.valueOf(xohVar.d));
                            break;
                        }
                        break;
                    case 32770:
                        break;
                    case 32771:
                        xiu xiuVar = (xiu) abnv.A(xiu.a, byteBuffer, abnj.a());
                        if (xiuVar != null) {
                            printWriter2.printf("%d", Integer.valueOf(xiuVar.c));
                            break;
                        }
                        break;
                    case 32772:
                        xgz xgzVar = (xgz) abnv.A(xgz.a, byteBuffer, abnj.a());
                        if (xgzVar != null) {
                            Integer numValueOf = Integer.valueOf(xgzVar.c);
                            Integer num = (Integer) new ntn(Integer.valueOf(xgzVar.d)).i(0);
                            num.intValue();
                            printWriter2.printf("%d:%d", numValueOf, num);
                            break;
                        }
                        break;
                    default:
                        printWriter2.printf("Received unexpected MediaMessageId %s", wub.n(iO));
                        break;
                }
            } catch (abon unused) {
            }
        }
        printWriter2.println("}");
    }
}
