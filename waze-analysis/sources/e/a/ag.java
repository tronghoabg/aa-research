package e.a;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    static final com.google.d.b.w f46249a = com.google.d.b.w.f();

    /* renamed from: b, reason: collision with root package name */
    private static final ag f46250b = new ag(q.f47844a, false, new ag(new q(1, null), true, new ag()));

    /* renamed from: c, reason: collision with root package name */
    private final Map f46251c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f46252d;

    private ag(ae aeVar, boolean z, ag agVar) {
        String strC = aeVar.c();
        com.google.d.b.an.m(!strC.contains(","), "Comma is currently not allowed in message encoding");
        int size = agVar.f46251c.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(agVar.f46251c.containsKey(aeVar.c()) ? size : size + 1);
        for (af afVar : agVar.f46251c.values()) {
            ae aeVar2 = afVar.f46247a;
            String strC2 = aeVar2.c();
            if (!strC2.equals(strC)) {
                linkedHashMap.put(strC2, new af(aeVar2, afVar.f46248b));
            }
        }
        linkedHashMap.put(strC, new af(aeVar, z));
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        this.f46251c = mapUnmodifiableMap;
        com.google.d.b.w wVar = f46249a;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((af) entry.getValue()).f46248b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.f46252d = wVar.d(DesugarCollections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }

    public static ag b() {
        return f46250b;
    }

    public final ae a(String str) {
        af afVar = (af) this.f46251c.get(str);
        if (afVar != null) {
            return afVar.f46247a;
        }
        return null;
    }

    final byte[] c() {
        return this.f46252d;
    }

    private ag() {
        this.f46251c = new LinkedHashMap(0);
        this.f46252d = new byte[0];
    }
}
