package defpackage;

import java.io.PrintWriter;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class rlm extends rll {
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
        String strName = rro.INPUT_SOURCE.name();
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
                    str2 = "INPUT_MESSAGE_INPUT_REPORT";
                    break;
                case 32770:
                    str2 = "INPUT_MESSAGE_KEY_BINDING_REQUEST";
                    break;
                case 32771:
                    str2 = "INPUT_MESSAGE_KEY_BINDING_RESPONSE";
                    break;
                default:
                    str2 = "INPUT_MESSAGE_INPUT_FEEDBACK";
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
                    xjt xjtVar = (xjt) abnv.A(xjt.a, byteBuffer, abnj.a());
                    if (xjtVar != null) {
                        printWriter2.printf("%s", xjtVar);
                        break;
                    }
                    break;
                case 32770:
                    xkb xkbVar = (xkb) abnv.A(xkb.a, byteBuffer, abnj.a());
                    if (xkbVar != null) {
                        printWriter2.printf("%s", xkbVar.b);
                        break;
                    }
                    break;
                case 32771:
                    xkc xkcVar = (xkc) abnv.A(xkc.a, byteBuffer, abnj.a());
                    if (xkcVar != null) {
                        printWriter2.printf("%d", Integer.valueOf(xkcVar.b));
                        break;
                    }
                    break;
                default:
                    xjs xjsVar = (xjs) abnv.A(xjs.a, byteBuffer, abnj.a());
                    if (xjsVar != null) {
                        xji xjiVarB = xji.b(xjsVar.c);
                        if (xjiVarB == null) {
                            xjiVarB = xji.FEEDBACK_SELECT;
                        }
                        printWriter2.printf("%d", Integer.valueOf(xjiVarB.f));
                        break;
                    }
                    break;
            }
        } catch (abon unused) {
        }
        printWriter2.println("}");
    }
}
