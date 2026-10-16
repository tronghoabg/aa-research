package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rmi extends defpackage.rmh {
    public static defpackage.rmh a;

    @Override // defpackage.rmh
    public final void c(java.lang.String str, long j, boolean z, java.nio.ByteBuffer byteBuffer, java.io.PrintWriter printWriter) {
        char c;
        java.lang.String str2;
        char c2;
        java.lang.String strValueOf;
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
        java.lang.String strName = defpackage.rsi.INPUT_SOURCE.name();
        if (c == 0) {
            strValueOf = java.lang.String.valueOf((int) c3);
            c2 = 0;
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
            c2 = c;
            strValueOf = str2;
        }
        b(str, j, strName, z, strValueOf, byteBuffer, printWriter);
        if (c2 == 0) {
            printWriter.println();
            printWriter.printf("Received unexpected message of type %d\n", java.lang.Integer.valueOf(c3));
            return;
        }
        printWriter.print(":{");
        try {
            switch (c2) {
                case 32769:
                    xku xkuVarA = defpackage.abox.A(xku.a, byteBuffer, defpackage.abol.a());
                    if (xkuVarA != null) {
                        printWriter.printf("%s", xkuVarA);
                    }
                    break;
                case 32770:
                    defpackage.xlc xlcVar = (defpackage.xlc) defpackage.abox.A(defpackage.xlc.a, byteBuffer, defpackage.abol.a());
                    if (xlcVar != null) {
                        printWriter.printf("%s", xlcVar.b);
                    }
                    break;
                case 32771:
                    defpackage.xld xldVar = (defpackage.xld) defpackage.abox.A(defpackage.xld.a, byteBuffer, defpackage.abol.a());
                    if (xldVar != null) {
                        printWriter.printf("%d", java.lang.Integer.valueOf(xldVar.b));
                    }
                    break;
                default:
                    xkt xktVarA = defpackage.abox.A(xkt.a, byteBuffer, defpackage.abol.a());
                    if (xktVarA != null) {
                        defpackage.xkj xkjVarB = defpackage.xkj.b(xktVarA.c);
                        if (xkjVarB == null) {
                            xkjVarB = defpackage.xkj.FEEDBACK_SELECT;
                        }
                        printWriter.printf("%d", java.lang.Integer.valueOf(xkjVarB.f));
                    }
                    break;
            }
        } catch (defpackage.abpp unused) {
        }
        printWriter.println("}");
    }
}
