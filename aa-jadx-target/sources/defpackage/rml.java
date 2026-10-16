package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rml extends defpackage.rmj {
    public static defpackage.rmh a;

    public rml() {
        super(defpackage.rsi.VIDEO_SINK);
    }

    @Override // defpackage.rmj, defpackage.rmh
    public final void c(java.lang.String str, long j, boolean z, java.nio.ByteBuffer byteBuffer, java.io.PrintWriter printWriter) {
        java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        char c = (char) byteBufferDuplicate.getShort();
        int iBb = defpackage.sqs.bb(c);
        if (iBb == 0) {
            b(str, j, defpackage.rsi.VIDEO_SINK.name(), z, java.lang.String.valueOf((int) c), byteBufferDuplicate, printWriter);
            printWriter.println();
            printWriter.printf("Received unexpected message of type %d", java.lang.Integer.valueOf(c));
            printWriter.println();
            return;
        }
        try {
            switch (iBb - 1) {
                case 32775:
                    b(str, j, defpackage.rsi.VIDEO_SINK.name(), z, defpackage.sqs.ba(iBb), byteBufferDuplicate, printWriter);
                    printWriter.print(":{");
                    xqi xqiVarA = defpackage.abox.A(xqi.a, byteBufferDuplicate, defpackage.abol.a());
                    if (xqiVarA != null) {
                        defpackage.xqf xqfVarB = defpackage.xqf.b(xqiVarA.c);
                        if (xqfVarB == null) {
                            xqfVarB = defpackage.xqf.VIDEO_FOCUS_PROJECTED;
                        }
                        java.lang.String strName = xqfVarB.name();
                        xqh xqhVarB = xqh.b(xqiVarA.d);
                        if (xqhVarB == null) {
                            xqhVarB = xqh.a;
                        }
                        printWriter.printf("%s:%s", strName, xqhVarB.name());
                    }
                    break;
                case 32776:
                    b(str, j, defpackage.rsi.VIDEO_SINK.name(), z, defpackage.sqs.ba(iBb), byteBufferDuplicate, printWriter);
                    printWriter.print(":{");
                    defpackage.xqg xqgVar = (defpackage.xqg) defpackage.abox.A(defpackage.xqg.a, byteBufferDuplicate, defpackage.abol.a());
                    if (xqgVar != null) {
                        defpackage.xqf xqfVarB2 = defpackage.xqf.b(xqgVar.b);
                        if (xqfVarB2 == null) {
                            xqfVarB2 = defpackage.xqf.VIDEO_FOCUS_PROJECTED;
                        }
                        printWriter.printf("%s", xqfVarB2.name());
                    }
                    break;
                default:
                    super.c(str, j, z, byteBuffer, printWriter);
                    return;
            }
        } catch (defpackage.abpp unused) {
        }
        printWriter.println("}");
    }
}
