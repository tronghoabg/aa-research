package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class fvh implements fvf {
    public static final List b;
    private static final afgv c = new afgv('0', '9');
    private static final List d;
    private static final fvd e;

    static {
        afgv afgvVar = new afgv('A', 'Z');
        ArrayList arrayList = new ArrayList(woy.bp(afgvVar, 10));
        afbc it = afgvVar.iterator();
        while (it.a) {
            arrayList.add(new fvd(String.valueOf(it.a())));
        }
        List listCf = woy.cf(arrayList);
        d = listCf;
        fvd fvdVar = new fvd("123");
        e = fvdVar;
        afbt afbtVar = new afbt(10);
        afbtVar.add(fvdVar);
        afbtVar.addAll(listCf);
        afbtVar.add(fve.a);
        b = afbtVar.f();
    }

    @Override // defpackage.fvf
    public final fvd a(String str) {
        str.getClass();
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList(str.length());
            for (int i = 0; i < str.length(); i++) {
                arrayList.add(Character.valueOf(Character.toUpperCase(str.charAt(i))));
            }
            char cCharValue = ((Character) arrayList.get(0)).charValue();
            if (c.e(cCharValue)) {
                return e;
            }
            for (fvd fvdVar : d) {
                if (fvdVar.a.charAt(0) == cCharValue) {
                    return fvdVar;
                }
            }
        }
        return fve.a;
    }

    @Override // defpackage.fvf
    public final List c() {
        return b;
    }

    @Override // defpackage.fvf
    public final String b(String str) {
        return str;
    }
}
