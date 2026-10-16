package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rmk extends defpackage.rmh {
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
        java.lang.String strName = defpackage.rsi.SENSOR_SOURCE.name();
        if (c == 0) {
            strValueOf = java.lang.String.valueOf((int) c3);
            c2 = 0;
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
                    defpackage.xov xovVar = (defpackage.xov) defpackage.abox.A(defpackage.xov.a, byteBuffer, defpackage.abol.a());
                    if (xovVar != null) {
                        defpackage.xoz xozVarB = defpackage.xoz.b(xovVar.c);
                        if (xozVarB == null) {
                            xozVarB = defpackage.xoz.SENSOR_LOCATION;
                        }
                        printWriter.printf("%s:%d", xozVarB.name(), java.lang.Long.valueOf(xovVar.d));
                    }
                    break;
                case 32770:
                    defpackage.xow xowVar = (defpackage.xow) defpackage.abox.A(defpackage.xow.a, byteBuffer, defpackage.abol.a());
                    if (xowVar != null) {
                        defpackage.xls xlsVarB = defpackage.xls.b(xowVar.b);
                        if (xlsVarB == null) {
                            xlsVarB = defpackage.xls.STATUS_UNSOLICITED_MESSAGE;
                        }
                        printWriter.printf("%s", xlsVarB.name());
                    }
                    break;
                case 32771:
                    xos xosVarA = defpackage.abox.A(xos.a, byteBuffer, defpackage.abol.a());
                    if (xosVarA != null) {
                        printWriter.printf("%s", xosVarA);
                    }
                    break;
                default:
                    xot xotVarA = defpackage.abox.A(xot.a, byteBuffer, defpackage.abol.a());
                    if (xotVarA != null) {
                        defpackage.xoz xozVarB2 = defpackage.xoz.b(xotVarA.b);
                        if (xozVarB2 == null) {
                            xozVarB2 = defpackage.xoz.SENSOR_LOCATION;
                        }
                        java.lang.String strName2 = xozVarB2.name();
                        xou xouVarB = xou.b(xotVarA.c);
                        if (xouVarB == null) {
                            xouVarB = xou.a;
                        }
                        printWriter.printf("%s:%s", strName2, xouVarB.name());
                    }
                    break;
            }
        } catch (defpackage.abpp unused) {
        }
        printWriter.println("}");
    }
}
