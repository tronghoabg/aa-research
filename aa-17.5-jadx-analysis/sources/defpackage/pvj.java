package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class pvj {
    public static final Map a;

    static {
        accb[] accbVarArrValues = accb.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(accbVarArrValues.length), 16));
        for (accb accbVar : accbVarArrValues) {
            linkedHashMap.put(lws.H(accbVar), accbVar);
        }
        a = linkedHashMap;
    }
}
