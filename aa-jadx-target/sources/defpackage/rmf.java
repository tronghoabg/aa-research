package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rmf extends defpackage.rmh {
    public static defpackage.rmh a;

    @Override // defpackage.rmh
    public final void c(java.lang.String str, long j, boolean z, java.nio.ByteBuffer byteBuffer, java.io.PrintWriter printWriter) {
        int i;
        java.lang.String strBc;
        short s = byteBuffer.getShort();
        java.lang.String strName = defpackage.rsi.CONTROL.name();
        int iBd = defpackage.sqs.bd((char) s);
        if (iBd == 0) {
            strBc = java.lang.String.valueOf((int) s);
            i = 0;
        } else {
            i = iBd;
            strBc = defpackage.sqs.bc(iBd);
        }
        b(str, j, strName, z, strBc, byteBuffer, printWriter);
        if (i == 0) {
            printWriter.println();
            printWriter.printf("Received unexpected message of type %d\n", java.lang.Short.valueOf(s));
            return;
        }
        printWriter.print(":{");
        try {
            if (s == 18) {
                defpackage.xij xijVarB = defpackage.xij.b(((defpackage.xii) defpackage.abox.A(defpackage.xii.a, byteBuffer, defpackage.abol.a())).c);
                if (xijVarB == null) {
                    xijVarB = defpackage.xij.AUDIO_FOCUS_GAIN;
                }
                printWriter.printf("%s", xijVarB);
            } else if (s == 19) {
                defpackage.xih xihVar = (defpackage.xih) defpackage.abox.A(defpackage.xih.a, byteBuffer, defpackage.abol.a());
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(xihVar.c);
                defpackage.xik xikVarB = defpackage.xik.b(xihVar.b);
                if (xikVarB == null) {
                    xikVarB = defpackage.xik.AUDIO_FOCUS_STATE_INVALID;
                }
                printWriter.printf("%b:%s", boolValueOf, xikVarB);
            } else if (s != 26) {
                switch (s) {
                    case 1:
                        if (byteBuffer.remaining() < 4) {
                            printWriter.print("Payload size not that big");
                        } else {
                            printWriter.printf("%d:%d", java.lang.Short.valueOf(byteBuffer.getShort()), java.lang.Short.valueOf(byteBuffer.getShort()));
                        }
                        break;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        if (byteBuffer.remaining() < 6) {
                            printWriter.print("Payload size not that big");
                        } else {
                            printWriter.printf("%d:%d:%d", java.lang.Short.valueOf(byteBuffer.getShort()), java.lang.Short.valueOf(byteBuffer.getShort()), java.lang.Short.valueOf(byteBuffer.getShort()));
                        }
                        break;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                        break;
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        printWriter.print(((defpackage.xil) defpackage.abox.A(defpackage.xil.a, byteBuffer, defpackage.abol.a())).b);
                        break;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        defpackage.xpb xpbVar = (defpackage.xpb) defpackage.abox.A(defpackage.xpb.a, byteBuffer, defpackage.abol.a());
                        int i2 = xpbVar.b;
                        if ((i2 & 16) == 0 || (i2 & 8) == 0) {
                            printWriter.print("missing fields");
                        } else {
                            printWriter.printf("%s:%s", xpbVar.g, xpbVar.f);
                        }
                        break;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        printWriter.print(((defpackage.xpc) defpackage.abox.A(defpackage.xpc.a, byteBuffer, defpackage.abol.a())).toString());
                        break;
                    default:
                        switch (s) {
                            case 11:
                                defpackage.xni xniVar = (defpackage.xni) defpackage.abox.A(defpackage.xni.a, byteBuffer, defpackage.abol.a());
                                printWriter.printf("%d, Data(%d)", java.lang.Long.valueOf(xniVar.c), java.lang.Integer.valueOf((4 & xniVar.b) != 0 ? xniVar.e.d() : 0));
                                break;
                            case 12:
                                defpackage.xnj xnjVar = (defpackage.xnj) defpackage.abox.A(defpackage.xnj.a, byteBuffer, defpackage.abol.a());
                                printWriter.printf("%d, Data(%d)", java.lang.Long.valueOf(xnjVar.c), java.lang.Integer.valueOf((xnjVar.b & 2) != 0 ? xnjVar.d.d() : 0));
                                break;
                            case 13:
                                xlz xlzVarB = xlz.b(defpackage.abox.A(xly.a, byteBuffer, defpackage.abol.a()).c);
                                if (xlzVarB == null) {
                                    xlzVarB = xlz.a;
                                }
                                printWriter.print(xlzVarB);
                                break;
                            case 14:
                                xlz xlzVarB2 = xlz.b(defpackage.abox.A(xlx.a, byteBuffer, defpackage.abol.a()).b);
                                if (xlzVarB2 == null) {
                                    xlzVarB2 = xlz.a;
                                }
                                printWriter.print(xlzVarB2);
                                break;
                            case 15:
                                xiw xiwVarB = xiw.b(defpackage.abox.A(xix.a, byteBuffer, defpackage.abol.a()).c);
                                if (xiwVarB == null) {
                                    xiwVarB = xiw.a;
                                }
                                printWriter.print(xiwVarB);
                                break;
                            case 16:
                                printWriter.print(defpackage.abox.A(xiy.a, byteBuffer, defpackage.abol.a()));
                                break;
                            default:
                                printWriter.printf("Received unexpected message of type %d", java.lang.Short.valueOf(s));
                                break;
                        }
                        break;
                }
            } else {
                xpd xpdVarA = defpackage.abox.A(xpd.a, byteBuffer, defpackage.abol.a());
                if ((1 & xpdVarA.b) != 0) {
                    defpackage.xpa xpaVar = xpdVarA.c;
                    if (xpaVar == null) {
                        xpaVar = defpackage.xpa.a;
                    }
                    printWriter.print(xpaVar.toString());
                }
            }
        } catch (defpackage.abpp unused) {
        }
        printWriter.println("}");
    }
}
