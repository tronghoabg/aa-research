package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class adku {
    static final defpackage.xyj a = new defpackage.xyj(",");
    public static final defpackage.adku b = new defpackage.adku(defpackage.adkc.a, false, new defpackage.adku(new defpackage.adkc(1), true, new defpackage.adku()));
    public final byte[] c;
    private final java.util.Map d;

    /* JADX WARN: Type inference failed for: r3v1, types: [adkt, java.lang.Object] */
    private adku(defpackage.adkt adktVar, boolean z, defpackage.adku adkuVar) {
        java.lang.String strB = adktVar.b();
        defpackage.ysr.aY(!strB.contains(","), "Comma is currently not allowed in message encoding");
        int size = adkuVar.d.size();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(adkuVar.d.containsKey(adktVar.b()) ? size : size + 1);
        for (defpackage.adnr adnrVar : adkuVar.d.values()) {
            ?? r3 = adnrVar.b;
            java.lang.String strB2 = r3.b();
            if (!strB2.equals(strB)) {
                linkedHashMap.put(strB2, new defpackage.adnr((java.lang.Object) r3, adnrVar.a));
            }
        }
        linkedHashMap.put(strB, new defpackage.adnr(adktVar, z));
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(linkedHashMap);
        this.d = mapUnmodifiableMap;
        defpackage.xyj xyjVar = a;
        java.util.HashSet hashSet = new java.util.HashSet(mapUnmodifiableMap.size());
        for (java.util.Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((defpackage.adnr) entry.getValue()).a) {
                hashSet.add((java.lang.String) entry.getKey());
            }
        }
        this.c = xyjVar.b(j$.util.DesugarCollections.unmodifiableSet(hashSet)).getBytes(java.nio.charset.Charset.forName("US-ASCII"));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [adkt, java.lang.Object] */
    public final defpackage.adkt a(java.lang.String str) {
        defpackage.adnr adnrVar = (defpackage.adnr) this.d.get(str);
        if (adnrVar != null) {
            return adnrVar.b;
        }
        return null;
    }

    private adku() {
        this.d = new java.util.LinkedHashMap(0);
        this.c = new byte[0];
    }
}
