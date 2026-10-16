package defpackage;

/* JADX INFO: loaded from: classes.dex */
class rmj extends defpackage.rmh {
    private final defpackage.rsi a;

    public rmj(defpackage.rsi rsiVar) {
        this.a = rsiVar;
    }

    @Override // defpackage.rmh
    public void c(java.lang.String str, long j, boolean z, java.nio.ByteBuffer byteBuffer, java.io.PrintWriter printWriter) {
        java.lang.String strBa;
        char c = (char) byteBuffer.getShort();
        java.lang.String strName = this.a.name();
        int iBb = defpackage.sqs.bb(c);
        if (iBb == 0) {
            strBa = java.lang.String.valueOf((int) c);
            iBb = 0;
        } else {
            strBa = defpackage.sqs.ba(iBb);
        }
        b(str, j, strName, z, strBa, byteBuffer, printWriter);
        if (iBb == 0) {
            printWriter.println();
            printWriter.printf("Received unexpected message of type %d", java.lang.Integer.valueOf(c));
            printWriter.println();
            return;
        }
        printWriter.print(":{");
        int i = iBb - 1;
        if (i != 1) {
            try {
                switch (i) {
                    case 32768:
                        defpackage.xpg xpgVar = (defpackage.xpg) defpackage.abox.A(defpackage.xpg.a, byteBuffer, defpackage.abol.a());
                        if (xpgVar != null) {
                            defpackage.xlk xlkVarB = defpackage.xlk.b(xpgVar.c);
                            if (xlkVarB == null) {
                                xlkVarB = defpackage.xlk.MEDIA_CODEC_AUDIO_PCM;
                            }
                            printWriter.print(xlkVarB.name());
                        }
                        break;
                    case 32769:
                        defpackage.xpi xpiVar = (defpackage.xpi) defpackage.abox.A(defpackage.xpi.a, byteBuffer, defpackage.abol.a());
                        if (xpiVar != null) {
                            printWriter.printf("%d:%d", java.lang.Integer.valueOf(xpiVar.c), java.lang.Integer.valueOf(xpiVar.d));
                        }
                        break;
                    case 32770:
                        break;
                    case 32771:
                        defpackage.xjv xjvVar = (defpackage.xjv) defpackage.abox.A(defpackage.xjv.a, byteBuffer, defpackage.abol.a());
                        if (xjvVar != null) {
                            printWriter.printf("%d", java.lang.Integer.valueOf(xjvVar.c));
                        }
                        break;
                    case 32772:
                        defpackage.xia xiaVar = (defpackage.xia) defpackage.abox.A(defpackage.xia.a, byteBuffer, defpackage.abol.a());
                        if (xiaVar != null) {
                            java.lang.Integer numValueOf = java.lang.Integer.valueOf(xiaVar.c);
                            java.lang.Integer num = (java.lang.Integer) new defpackage.nub(java.lang.Integer.valueOf(xiaVar.d)).i(0);
                            num.intValue();
                            printWriter.printf("%d:%d", numValueOf, num);
                        }
                        break;
                    default:
                        printWriter.printf("Received unexpected MediaMessageId %s", defpackage.sqs.ba(iBb));
                        break;
                }
            } catch (defpackage.abpp unused) {
            }
        }
        printWriter.println("}");
    }
}
