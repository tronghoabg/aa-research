package defpackage;

import java.io.PrintWriter;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class rlj extends rll {
    public static rll a;

    @Override // defpackage.rll
    public final void c(String str, long j, boolean z, ByteBuffer byteBuffer, PrintWriter printWriter) {
        int i;
        String strP;
        boolean z2;
        ByteBuffer byteBuffer2;
        PrintWriter printWriter2;
        String str2;
        long j2;
        short s = byteBuffer.getShort();
        String strName = rro.CONTROL.name();
        int iQ = wub.q((char) s);
        if (iQ == 0) {
            strP = String.valueOf((int) s);
            i = 0;
            j2 = j;
            z2 = z;
            byteBuffer2 = byteBuffer;
            printWriter2 = printWriter;
            str2 = str;
        } else {
            i = iQ;
            strP = wub.p(iQ);
            z2 = z;
            byteBuffer2 = byteBuffer;
            printWriter2 = printWriter;
            str2 = str;
            j2 = j;
        }
        b(str2, j2, strName, z2, strP, byteBuffer2, printWriter2);
        if (i == 0) {
            printWriter2.println();
            printWriter2.printf("Received unexpected message of type %d\n", Short.valueOf(s));
            return;
        }
        printWriter2.print(":{");
        try {
            if (s == 18) {
                xhi xhiVarB = xhi.b(((xhh) abnv.A(xhh.a, byteBuffer, abnj.a())).c);
                if (xhiVarB == null) {
                    xhiVarB = xhi.AUDIO_FOCUS_GAIN;
                }
                printWriter2.printf("%s", xhiVarB);
            } else if (s == 19) {
                xhg xhgVar = (xhg) abnv.A(xhg.a, byteBuffer, abnj.a());
                Boolean boolValueOf = Boolean.valueOf(xhgVar.c);
                xhj xhjVarB = xhj.b(xhgVar.b);
                if (xhjVarB == null) {
                    xhjVarB = xhj.AUDIO_FOCUS_STATE_INVALID;
                }
                printWriter2.printf("%b:%s", boolValueOf, xhjVarB);
            } else if (s != 26) {
                switch (s) {
                    case 1:
                        if (byteBuffer.remaining() < 4) {
                            printWriter2.print("Payload size not that big");
                            break;
                        } else {
                            printWriter2.printf("%d:%d", Short.valueOf(byteBuffer.getShort()), Short.valueOf(byteBuffer.getShort()));
                            break;
                        }
                    case 2:
                        if (byteBuffer.remaining() < 6) {
                            printWriter2.print("Payload size not that big");
                            break;
                        } else {
                            printWriter2.printf("%d:%d:%d", Short.valueOf(byteBuffer.getShort()), Short.valueOf(byteBuffer.getShort()), Short.valueOf(byteBuffer.getShort()));
                            break;
                        }
                    case 3:
                        break;
                    case 4:
                        printWriter2.print(((xhk) abnv.A(xhk.a, byteBuffer, abnj.a())).b);
                        break;
                    case 5:
                        xoa xoaVar = (xoa) abnv.A(xoa.a, byteBuffer, abnj.a());
                        int i2 = xoaVar.b;
                        if ((i2 & 16) != 0 && (i2 & 8) != 0) {
                            printWriter2.printf("%s:%s", xoaVar.g, xoaVar.f);
                            break;
                        } else {
                            printWriter2.print("missing fields");
                            break;
                        }
                    case 6:
                        printWriter2.print(((xob) abnv.A(xob.a, byteBuffer, abnj.a())).toString());
                        break;
                    default:
                        switch (s) {
                            case 11:
                                xmh xmhVar = (xmh) abnv.A(xmh.a, byteBuffer, abnj.a());
                                printWriter2.printf("%d, Data(%d)", Long.valueOf(xmhVar.c), Integer.valueOf((4 & xmhVar.b) != 0 ? xmhVar.e.d() : 0));
                                break;
                            case 12:
                                xmi xmiVar = (xmi) abnv.A(xmi.a, byteBuffer, abnj.a());
                                printWriter2.printf("%d, Data(%d)", Long.valueOf(xmiVar.c), Integer.valueOf((xmiVar.b & 2) != 0 ? xmiVar.d.d() : 0));
                                break;
                            case 13:
                                xky xkyVarB = xky.b(((xkx) abnv.A(xkx.a, byteBuffer, abnj.a())).c);
                                if (xkyVarB == null) {
                                    xkyVarB = xky.NAV_FOCUS_NATIVE;
                                }
                                printWriter2.print(xkyVarB);
                                break;
                            case 14:
                                xky xkyVarB2 = xky.b(((xkw) abnv.A(xkw.a, byteBuffer, abnj.a())).b);
                                if (xkyVarB2 == null) {
                                    xkyVarB2 = xky.NAV_FOCUS_NATIVE;
                                }
                                printWriter2.print(xkyVarB2);
                                break;
                            case 15:
                                xhv xhvVarB = xhv.b(((xhw) abnv.A(xhw.a, byteBuffer, abnj.a())).c);
                                if (xhvVarB == null) {
                                    xhvVarB = xhv.USER_SELECTION;
                                }
                                printWriter2.print(xhvVarB);
                                break;
                            case 16:
                                printWriter2.print((xhx) abnv.A(xhx.a, byteBuffer, abnj.a()));
                                break;
                            default:
                                printWriter2.printf("Received unexpected message of type %d", Short.valueOf(s));
                                break;
                        }
                }
            } else {
                xoc xocVar = (xoc) abnv.A(xoc.a, byteBuffer, abnj.a());
                if ((1 & xocVar.b) != 0) {
                    xnz xnzVar = xocVar.c;
                    if (xnzVar == null) {
                        xnzVar = xnz.a;
                    }
                    printWriter2.print(xnzVar.toString());
                }
            }
        } catch (abon unused) {
        }
        printWriter2.println("}");
    }
}
