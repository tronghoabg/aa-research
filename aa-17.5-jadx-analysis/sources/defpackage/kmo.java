package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class kmo {
    public static final yph a = yph.c("GH.ProtoFlagsUtil");

    public static yfy a(abrh abrhVar) {
        aboh abohVar = abrhVar.d;
        yfu yfuVar = new yfu(4);
        Iterator<E> it = abohVar.iterator();
        while (it.hasNext()) {
            List listI = xxx.c(':').i((String) it.next());
            if (!listI.isEmpty()) {
                String str = (String) listI.get(0);
                if (!TextUtils.isEmpty(str)) {
                    if (listI.size() == 1) {
                        int i = yfq.d;
                        yfuVar.e(str, yls.a);
                    } else {
                        yfuVar.e(str, listI.subList(1, listI.size()));
                    }
                }
            }
        }
        return yfuVar.d(false);
    }

    public static boolean b(abrh abrhVar, ComponentName componentName) {
        int iAs = a.as(abrhVar.c);
        if (iAs == 0) {
            iAs = 1;
        }
        int i = iAs - 1;
        switch (i) {
            case 1:
                componentName.flattenToString();
                return false;
            case 2:
            case 5:
                Iterator<E> it = abrhVar.d.iterator();
                while (it.hasNext()) {
                    if (g((String) it.next(), componentName)) {
                        componentName.flattenToString();
                        return true;
                    }
                }
                componentName.flattenToString();
                return false;
            case 3:
            case 6:
                Iterator<E> it2 = abrhVar.d.iterator();
                while (it2.hasNext()) {
                    if (g((String) it2.next(), componentName)) {
                        componentName.flattenToString();
                        return false;
                    }
                }
                componentName.flattenToString();
                return true;
            case 4:
                componentName.flattenToString();
                return true;
            default:
                ((ype) ((ype) a.g()).ai(3222)).D("Undefined filter mode %d and componentName %s", i, componentName.flattenToString());
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(defpackage.abrh r3, java.lang.String r4) {
        /*
            int r0 = r3.c
            int r0 = defpackage.a.as(r0)
            r1 = 1
            if (r0 != 0) goto La
            r0 = r1
        La:
            int r0 = r0 + (-1)
            r2 = 0
            switch(r0) {
                case 1: goto L37;
                case 2: goto L30;
                case 3: goto L27;
                case 4: goto L26;
                case 5: goto L30;
                case 6: goto L27;
                default: goto L10;
            }
        L10:
            yph r3 = defpackage.kmo.a
            yop r3 = r3.g()
            ype r3 = (defpackage.ype) r3
            r1 = 3234(0xca2, float:4.532E-42)
            yop r3 = r3.ai(r1)
            ype r3 = (defpackage.ype) r3
            java.lang.String r1 = "Undefined filter mode %d and tagName %s"
            r3.D(r1, r0, r4)
            return r2
        L26:
            return r1
        L27:
            aboh r3 = r3.d
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L37
            return r1
        L30:
            aboh r3 = r3.d
            boolean r3 = r3.contains(r4)
            return r3
        L37:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kmo.c(abrh, java.lang.String):boolean");
    }

    public static boolean d(abrh abrhVar, List list) {
        int iAs = a.as(abrhVar.c);
        if (iAs == 0) {
            iAs = 1;
        }
        int i = iAs - 1;
        switch (i) {
            case 2:
            case 5:
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (abrhVar.d.contains(it.next().toString())) {
                        return true;
                    }
                }
            case 1:
                return false;
            case 3:
            case 6:
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (abrhVar.d.contains(it2.next().toString())) {
                        return false;
                    }
                }
                return true;
            case 4:
                return true;
            default:
                ((ype) ((ype) a.g()).ai(3235)).D("Undefined filter mode %d and tagNames %s", i, list);
                return false;
        }
    }

    public static boolean e(abrh abrhVar, String str) {
        abnp abnpVarN = abrh.a.n();
        int iAs = a.as(abrhVar.c);
        if (iAs == 0) {
            iAs = 1;
        }
        abnpVarN.t();
        abrh abrhVar2 = (abrh) abnpVarN.b;
        abrhVar2.c = iAs - 1;
        abrhVar2.b |= 1;
        ygr ygrVarKeySet = a(abrhVar).keySet();
        abnpVarN.t();
        abrh abrhVar3 = (abrh) abnpVarN.b;
        aboh abohVar = abrhVar3.d;
        if (!abohVar.c()) {
            abrhVar3.d = abnv.I(abohVar);
        }
        abmc.i(ygrVarKeySet, abrhVar3.d);
        return c((abrh) abnpVarN.q(), str);
    }

    public static boolean f(Context context, List list, String str) {
        return new tgw(context, list).a(str);
    }

    private static boolean g(String str, ComponentName componentName) {
        return str.endsWith("/*") ? str.regionMatches(false, 0, componentName.getPackageName(), 0, str.length() - 2) : str.equals(componentName.flattenToString());
    }
}
