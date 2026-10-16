package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class adjt {
    static final xxd a = new xxd(",");
    public static final adjt b = new adjt(adjc.a, false, new adjt(new adjc(1), true, new adjt()));
    public final byte[] c;
    private final Map d;

    /* JADX WARN: Type inference failed for: r3v1, types: [adjs, java.lang.Object] */
    private adjt(adjs adjsVar, boolean z, adjt adjtVar) {
        String strB = adjsVar.b();
        woy.O(!strB.contains(","), "Comma is currently not allowed in message encoding");
        int size = adjtVar.d.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(adjtVar.d.containsKey(adjsVar.b()) ? size : size + 1);
        for (admq admqVar : adjtVar.d.values()) {
            ?? r3 = admqVar.b;
            String strB2 = r3.b();
            if (!strB2.equals(strB)) {
                linkedHashMap.put(strB2, new admq((Object) r3, admqVar.a));
            }
        }
        linkedHashMap.put(strB, new admq(adjsVar, z));
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        this.d = mapUnmodifiableMap;
        xxd xxdVar = a;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((admq) entry.getValue()).a) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.c = xxdVar.b(DesugarCollections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [adjs, java.lang.Object] */
    public final adjs a(String str) {
        admq admqVar = (admq) this.d.get(str);
        if (admqVar != null) {
            return admqVar.b;
        }
        return null;
    }

    private adjt() {
        this.d = new LinkedHashMap(0);
        this.c = new byte[0];
    }
}
