package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class cfh extends RuntimeException {
    private final admq a;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.List] */
    public cfh(admq admqVar) {
        this.a = admqVar;
        if (admqVar.a) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        int size = admqVar.b.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            cfc cfcVar = (cfc) admqVar.b.get(i);
            if (!woy.dl(iArr, cfcVar.a)) {
                if (cfcVar.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((cfc) admqVar.b.get(i3)).a == 1000) {
                        break;
                    } else {
                        woy.cA(arrayList);
                    }
                } else {
                    arrayList.add(cfcVar);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((cfc) arrayList.get(i4)).a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Throwable
    public final String getMessage() {
        admq admqVar = this.a;
        if (!admqVar.a) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        afbt afbtVar = new afbt(10);
        List listBy = woy.by(admqVar.b);
        int iA = ((afam) listBy).a();
        for (int i = 0; i < iA; i++) {
            vq vqVar = ((cfc) listBy.get(i)).c;
        }
        List listBy2 = woy.by(afbtVar.f());
        int iA2 = ((afam) listBy2).a();
        for (int i2 = 0; i2 < iA2; i2++) {
            String str = (String) listBy2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
