package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class ahni {
    public static final Object a(afeg afegVar, afck afckVar) {
        ajcw ajcwVar = new ajcw(afckVar.hH(), afckVar);
        Object objB = afus.b(ajcwVar, true, ajcwVar, afegVar);
        if (objB == afcr.a) {
            afckVar.getClass();
        }
        return objB;
    }

    public static final aitx b(afco afcoVar) {
        if (afcoVar.get(aivh.d) == null) {
            afcoVar = afcoVar.plus(new aivj(null));
        }
        return new ajbw(afcoVar);
    }

    public static final aitx c() {
        aiwh aiwhVar = new aiwh(null);
        aitu aituVar = aium.a;
        aivr aivrVar = ajct.a;
        aivrVar.getClass();
        return new ajbw(affa.w(aiwhVar, aivrVar));
    }

    public static final aitx d(aitx aitxVar, afco afcoVar) {
        return new ajbw(aitxVar.c().plus(afcoVar));
    }

    public static final void e(aitx aitxVar, CancellationException cancellationException) {
        aivh aivhVar = (aivh) aitxVar.c().get(aivh.d);
        if (aivhVar != null) {
            aivhVar.s(cancellationException);
        } else {
            Objects.toString(aitxVar);
            throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(String.valueOf(aitxVar)));
        }
    }

    public static final void f(aitx aitxVar) {
        affx.f(aitxVar.c());
    }

    public static final <V> V findValueForMostSpecificFqname(ahnf ahnfVar, Map<ahnf, ? extends V> map) {
        Object next;
        ahnfVar.getClass();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<ahnf, ? extends V> entry : map.entrySet()) {
            ahnf key = entry.getKey();
            if (affa.f(ahnfVar, key) || isChildOf(ahnfVar, key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (true == linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            Iterator it = linkedHashMap.entrySet().iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int length = tail((ahnf) ((Map.Entry) next).getKey(), ahnfVar).asString().length();
                    while (true) {
                        Object next2 = it.next();
                        int length2 = tail((ahnf) ((Map.Entry) next2).getKey(), ahnfVar).asString().length();
                        int i = length > length2 ? length2 : length;
                        if (length > length2) {
                            next = next2;
                        }
                        if (!it.hasNext()) {
                            break;
                        }
                        length = i;
                    }
                }
            } else {
                next = null;
            }
            Map.Entry entry2 = (Map.Entry) next;
            if (entry2 != null) {
                return (V) entry2.getValue();
            }
        }
        return null;
    }

    public static final boolean g(aitx aitxVar) {
        aivh aivhVar = (aivh) aitxVar.c().get(aivh.d);
        if (aivhVar != null) {
            return aivhVar.t();
        }
        return true;
    }

    public static final boolean isChildOf(ahnf ahnfVar, ahnf ahnfVar2) {
        ahnfVar.getClass();
        ahnfVar2.getClass();
        return affa.f(parentOrNull(ahnfVar), ahnfVar2);
    }

    public static final boolean isSubpackageOf(ahnf ahnfVar, ahnf ahnfVar2) {
        ahnfVar.getClass();
        ahnfVar2.getClass();
        if (affa.f(ahnfVar, ahnfVar2) || ahnfVar2.isRoot()) {
            return true;
        }
        return isSubpackageOf(ahnfVar.asString(), ahnfVar2.asString());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isValidJavaFqName(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            ahnp r1 = defpackage.ahnp.BEGINNING
            r2 = r0
        L7:
            int r3 = r6.length()
            r4 = 1
            if (r2 >= r3) goto L3e
            char r3 = r6.charAt(r2)
            int r5 = r1.ordinal()
            if (r5 == 0) goto L32
            if (r5 == r4) goto L24
            r1 = 2
            if (r5 != r1) goto L1e
            goto L32
        L1e:
            aezs r6 = new aezs
            r6.<init>()
            throw r6
        L24:
            r4 = 46
            if (r3 != r4) goto L2b
            ahnp r1 = defpackage.ahnp.AFTER_DOT
            goto L3b
        L2b:
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r3)
            if (r3 != 0) goto L3b
            return r0
        L32:
            boolean r1 = java.lang.Character.isJavaIdentifierStart(r3)
            if (r1 != 0) goto L39
            return r0
        L39:
            ahnp r1 = defpackage.ahnp.MIDDLE
        L3b:
            int r2 = r2 + 1
            goto L7
        L3e:
            ahnp r6 = defpackage.ahnp.AFTER_DOT
            if (r1 == r6) goto L43
            return r4
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahni.isValidJavaFqName(java.lang.String):boolean");
    }

    public static final ahnf parentOrNull(ahnf ahnfVar) {
        ahnfVar.getClass();
        if (ahnfVar.isRoot()) {
            return null;
        }
        return ahnfVar.parent();
    }

    public static final ahnf tail(ahnf ahnfVar, ahnf ahnfVar2) {
        ahnfVar.getClass();
        ahnfVar2.getClass();
        if (!isSubpackageOf(ahnfVar, ahnfVar2) || ahnfVar2.isRoot()) {
            return ahnfVar;
        }
        if (affa.f(ahnfVar, ahnfVar2)) {
            return ahnf.ROOT;
        }
        String strSubstring = ahnfVar.asString().substring(ahnfVar2.asString().length() + 1);
        strSubstring.getClass();
        return new ahnf(strSubstring);
    }

    private static final boolean isSubpackageOf(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str.startsWith(str2) && str.charAt(str2.length()) == '.';
    }
}
