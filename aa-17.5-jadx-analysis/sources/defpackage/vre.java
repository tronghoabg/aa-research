package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class vre {
    private static final xxx b = xxx.c('/');
    private static final Pattern c = Pattern.compile("^(\\*[a-z]+\\*).*");
    final ConcurrentHashMap a = new ConcurrentHashMap();

    static String a(String str) {
        List listI = b.i(str);
        if (listI.size() == 3) {
            return (String) listI.get(0);
        }
        ((ynz) ((ynz) vlj.a.e()).ai((char) 9796)).y("malformed sync name: %s", str);
        return "MALFORMED";
    }

    public final ajet b(vrd vrdVar, ajet ajetVar) throws NoSuchAlgorithmException {
        ajeo ajeoVar = ajetVar.e;
        if (ajeoVar == null) {
            ajeoVar = ajeo.a;
        }
        if ((ajeoVar.b & 2) == 0) {
            return ajetVar;
        }
        ajeo ajeoVar2 = ajetVar.e;
        if (ajeoVar2 == null) {
            ajeoVar2 = ajeo.a;
        }
        abnp abnpVarK = ajeoVar2.K();
        abnp abnpVarK2 = ajetVar.K();
        String strGroup = ((ajeo) abnpVarK.b).d;
        Long lG = zeb.g(strGroup);
        lG.getClass();
        ConcurrentHashMap concurrentHashMap = this.a;
        long jLongValue = lG.longValue();
        if (!concurrentHashMap.containsKey(lG)) {
            int iOrdinal = vrdVar.ordinal();
            if (iOrdinal == 0) {
                Matcher matcher = c.matcher(strGroup);
                if (!matcher.matches()) {
                    ((ynz) ((ynz) vlj.a.e()).ai((char) 9797)).y("wakelock: %s", strGroup);
                } else if (strGroup.startsWith("*sync*/")) {
                    strGroup = "*sync*/".concat(String.valueOf(a(strGroup.substring(7))));
                } else {
                    strGroup = matcher.group(1);
                    ((ynz) ((ynz) vlj.a.e()).ai((char) 9798)).y("non-sync system task wakelock: %s", strGroup);
                }
            } else if (iOrdinal == 1) {
                strGroup = a(strGroup);
            } else if (iOrdinal == 2) {
                strGroup = "--";
            }
            Long lG2 = zeb.g(strGroup);
            ((ynz) ((ynz) vlj.a.e()).ai(9794)).R("Sanitized Hash: [%s] %s -> %d", vrdVar, strGroup, lG2);
            if (lG2 != null) {
                concurrentHashMap.putIfAbsent(lG, lG2);
            }
        }
        abnpVarK.t();
        ajeo ajeoVar3 = (ajeo) abnpVarK.b;
        ajeoVar3.b |= 1;
        ajeoVar3.c = jLongValue;
        abnpVarK.t();
        ajeo ajeoVar4 = (ajeo) abnpVarK.b;
        ajeoVar4.b &= -3;
        ajeoVar4.d = ajeo.a.d;
        abnpVarK2.t();
        ajet ajetVar2 = (ajet) abnpVarK2.b;
        ajeo ajeoVar5 = (ajeo) abnpVarK.q();
        ajeoVar5.getClass();
        ajetVar2.e = ajeoVar5;
        ajetVar2.b |= 4;
        return (ajet) abnpVarK2.q();
    }

    public final ajet c(ajet ajetVar) {
        ajeo ajeoVar = ajetVar.e;
        if (ajeoVar == null) {
            ajeoVar = ajeo.a;
        }
        if ((ajeoVar.b & 1) == 0) {
            return ajetVar;
        }
        ajeo ajeoVar2 = ajetVar.e;
        if (ajeoVar2 == null) {
            ajeoVar2 = ajeo.a;
        }
        ConcurrentHashMap concurrentHashMap = this.a;
        abnp abnpVarK = ajeoVar2.K();
        Long l = (Long) concurrentHashMap.get(Long.valueOf(((ajeo) abnpVarK.b).c));
        l.getClass();
        abnp abnpVarK2 = ajetVar.K();
        long jLongValue = l.longValue();
        abnpVarK.t();
        ajeo ajeoVar3 = (ajeo) abnpVarK.b;
        ajeoVar3.b |= 1;
        ajeoVar3.c = jLongValue;
        abnpVarK2.t();
        ajet ajetVar2 = (ajet) abnpVarK2.b;
        ajeo ajeoVar4 = (ajeo) abnpVarK.q();
        ajeoVar4.getClass();
        ajetVar2.e = ajeoVar4;
        ajetVar2.b |= 4;
        return (ajet) abnpVarK2.q();
    }
}
