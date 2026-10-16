package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class pxw implements pyb {
    public static final Map a;
    public static final pyk f = new pyk("gmm_ph_server_token");
    public final aezk b;
    public final aezk c;
    public final pyh d;
    public final pur e;

    static {
        accb[] accbVarArrValues = accb.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(accbVarArrValues.length), 16));
        for (accb accbVar : accbVarArrValues) {
            linkedHashMap.put(lws.H(accbVar), accbVar);
        }
        a = linkedHashMap;
    }

    public pxw(aezk aezkVar, aezk aezkVar2, pyh pyhVar, ackk ackkVar, pur purVar) {
        pyhVar.getClass();
        ackkVar.getClass();
        purVar.getClass();
        this.b = aezkVar;
        this.c = aezkVar2;
        this.d = pyhVar;
        this.e = purVar;
    }
}
