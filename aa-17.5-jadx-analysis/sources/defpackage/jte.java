package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class jte implements jtd {
    public static final afgv b = new afgv('0', '9');
    public static final List c;
    public static final jtb d;
    public static final List e;

    static {
        afgv afgvVar = new afgv('A', 'Z');
        ArrayList arrayList = new ArrayList(woy.bp(afgvVar, 10));
        afbc it = afgvVar.iterator();
        while (it.a) {
            arrayList.add(new jtb(String.valueOf(it.a())));
        }
        List listCf = woy.cf(arrayList);
        c = listCf;
        jtb jtbVar = new jtb("123");
        d = jtbVar;
        afbt afbtVar = new afbt(10);
        afbtVar.add(jtbVar);
        afbtVar.addAll(listCf);
        afbtVar.add(jtc.a);
        e = afbtVar.f();
    }
}
