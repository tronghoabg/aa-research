package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cfo extends java.lang.RuntimeException {
    private final defpackage.adnr a;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.List] */
    public cfo(defpackage.adnr adnrVar) {
        this.a = adnrVar;
        if (adnrVar.a) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        int size = adnrVar.b.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            defpackage.cfj cfjVar = (defpackage.cfj) adnrVar.b.get(i);
            if (!defpackage.afga.cf(iArr, cfjVar.a)) {
                if (cfjVar.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((defpackage.cfj) adnrVar.b.get(i3)).a == 1000) {
                        break;
                    } else {
                        defpackage.afga.bu(arrayList);
                    }
                } else {
                    arrayList.add(cfjVar);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        java.lang.StackTraceElement[] stackTraceElementArr = new java.lang.StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new java.lang.StackTraceElement("$$compose", "m$" + ((defpackage.cfj) arrayList.get(i4)).a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        defpackage.adnr adnrVar = this.a;
        if (!adnrVar.a) {
            return "Composition stack when thrown:";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Composition stack when thrown:\n");
        defpackage.afct afctVar = new defpackage.afct(10);
        java.util.List listAs = defpackage.afga.as(adnrVar.b);
        int iA = ((defpackage.afbm) listAs).a();
        for (int i = 0; i < iA; i++) {
            defpackage.vx vxVar = ((defpackage.cfj) listAs.get(i)).c;
        }
        java.util.List listAs2 = defpackage.afga.as(afctVar.f());
        int iA2 = ((defpackage.afbm) listAs2).a();
        for (int i2 = 0; i2 < iA2; i2++) {
            java.lang.String str = (java.lang.String) listAs2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
