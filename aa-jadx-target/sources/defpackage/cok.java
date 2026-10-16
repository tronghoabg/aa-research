package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cok {
    public java.lang.Object a;
    public java.lang.Object b;

    /* JADX WARN: Type inference failed for: r10v2, types: [affc, java.lang.Object] */
    public cok(char[] cArr) {
        defpackage.bil bilVar = defpackage.agt.a;
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        this.b = new defpackage.aek(bilVar, fValueOf, (defpackage.aep) bilVar.b.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final void a(java.lang.String str) {
        java.lang.Object arrayList = this.a;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.a = arrayList;
        } else {
            ((java.util.ArrayList) arrayList).clear();
        }
        b(str, (java.util.ArrayList) arrayList);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9961. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void b(java.lang.String r24, java.util.ArrayList r25) {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cok.b(java.lang.String, java.util.ArrayList):void");
    }

    public final defpackage.aau c() {
        java.lang.Object obj = this.a;
        if (obj != null) {
            return (defpackage.aau) obj;
        }
        defpackage.aau aauVar = new defpackage.aau(6);
        this.a = aauVar;
        return aauVar;
    }

    public cok(defpackage.cok cokVar, defpackage.dkd dkdVar) {
        this.b = cokVar;
        this.a = dkdVar;
    }

    public cok(byte[] bArr) {
    }

    public cok() {
        this.b = new float[64];
    }
}
