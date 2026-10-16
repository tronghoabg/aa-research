package md;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: md.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3551t {

    /* renamed from: c, reason: collision with root package name */
    public static final B8.e f40723c = new B8.e(String.valueOf(','));

    /* renamed from: d, reason: collision with root package name */
    public static final C3551t f40724d = new C3551t(C3542j.f40651b, false, new C3551t(new C3542j(2), true, new C3551t()));

    /* renamed from: a, reason: collision with root package name */
    public final Map f40725a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f40726b;

    public C3551t(InterfaceC3543k interfaceC3543k, boolean z2, C3551t c3551t) {
        String strE = interfaceC3543k.e();
        Fe.e.p("Comma is currently not allowed in message encoding", !strE.contains(","));
        int size = c3551t.f40725a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c3551t.f40725a.containsKey(interfaceC3543k.e()) ? size : size + 1);
        for (C3550s c3550s : c3551t.f40725a.values()) {
            String strE2 = c3550s.f40721a.e();
            if (!strE2.equals(strE)) {
                linkedHashMap.put(strE2, new C3550s(c3550s.f40721a, c3550s.f40722b));
            }
        }
        linkedHashMap.put(strE, new C3550s(interfaceC3543k, z2));
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        this.f40725a = mapUnmodifiableMap;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((C3550s) entry.getValue()).f40722b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.f40726b = f40723c.e(DesugarCollections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }

    public C3551t() {
        this.f40725a = new LinkedHashMap(0);
        this.f40726b = new byte[0];
    }
}
