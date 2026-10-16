package defpackage;

import java.io.PrintWriter;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class rlo extends rll {
    public static rll a;

    @Override // defpackage.rll
    public final void c(String str, long j, boolean z, ByteBuffer byteBuffer, PrintWriter printWriter) {
        char c;
        String str2;
        boolean z2;
        ByteBuffer byteBuffer2;
        PrintWriter printWriter2;
        char c2;
        String strValueOf;
        String str3;
        long j2;
        char c3 = (char) byteBuffer.getShort();
        switch (c3) {
            case 32769:
                c = 32769;
                break;
            case 32770:
                c = 32770;
                break;
            case 32771:
                c = 32771;
                break;
            case 32772:
                c = 32772;
                break;
            default:
                c = 0;
                break;
        }
        String strName = rro.SENSOR_SOURCE.name();
        if (c == 0) {
            j2 = j;
            z2 = z;
            byteBuffer2 = byteBuffer;
            printWriter2 = printWriter;
            strValueOf = String.valueOf((int) c3);
            c2 = 0;
            str3 = str;
        } else {
            switch (c) {
                case 32769:
                    str2 = "SENSOR_MESSAGE_REQUEST";
                    break;
                case 32770:
                    str2 = "SENSOR_MESSAGE_RESPONSE";
                    break;
                case 32771:
                    str2 = "SENSOR_MESSAGE_BATCH";
                    break;
                default:
                    str2 = "SENSOR_MESSAGE_ERROR";
                    break;
            }
            z2 = z;
            byteBuffer2 = byteBuffer;
            printWriter2 = printWriter;
            c2 = c;
            strValueOf = str2;
            str3 = str;
            j2 = j;
        }
        b(str3, j2, strName, z2, strValueOf, byteBuffer2, printWriter2);
        if (c2 == 0) {
            printWriter2.println();
            printWriter2.printf("Received unexpected message of type %d\n", Integer.valueOf(c3));
            return;
        }
        printWriter2.print(":{");
        try {
            switch (c2) {
                case 32769:
                    xnu xnuVar = (xnu) abnv.A(xnu.a, byteBuffer, abnj.a());
                    if (xnuVar != null) {
                        xny xnyVarB = xny.b(xnuVar.c);
                        if (xnyVarB == null) {
                            xnyVarB = xny.SENSOR_LOCATION;
                        }
                        printWriter2.printf("%s:%d", xnyVarB.name(), Long.valueOf(xnuVar.d));
                        break;
                    }
                    break;
                case 32770:
                    xnv xnvVar = (xnv) abnv.A(xnv.a, byteBuffer, abnj.a());
                    if (xnvVar != null) {
                        xkr xkrVarB = xkr.b(xnvVar.b);
                        if (xkrVarB == null) {
                            xkrVarB = xkr.STATUS_UNSOLICITED_MESSAGE;
                        }
                        printWriter2.printf("%s", xkrVarB.name());
                        break;
                    }
                    break;
                case 32771:
                    xnr xnrVar = (xnr) abnv.A(xnr.a, byteBuffer, abnj.a());
                    if (xnrVar != null) {
                        printWriter2.printf("%s", xnrVar);
                        break;
                    }
                    break;
                default:
                    xns xnsVar = (xns) abnv.A(xns.a, byteBuffer, abnj.a());
                    if (xnsVar != null) {
                        xny xnyVarB2 = xny.b(xnsVar.b);
                        if (xnyVarB2 == null) {
                            xnyVarB2 = xny.SENSOR_LOCATION;
                        }
                        String strName2 = xnyVarB2.name();
                        xnt xntVarB = xnt.b(xnsVar.c);
                        if (xntVarB == null) {
                            xntVarB = xnt.SENSOR_OK;
                        }
                        printWriter2.printf("%s:%s", strName2, xntVarB.name());
                        break;
                    }
                    break;
            }
        } catch (abon unused) {
        }
        printWriter2.println("}");
    }
}
