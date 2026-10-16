package Pc;

import J8.AbstractC0640o;
import K8.C0693e;
import K8.C0696h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Pc.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0795k implements z, InterfaceC0804u {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f9418a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f9419b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f9420c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f9421d = new HashMap();

    public static C0696h a(C0797m c0797m) {
        AbstractC0640o abstractC0640oS = xa.d.s(c0797m);
        if (abstractC0640oS == null) {
            throw new U9.a("No user is signed in");
        }
        HashMap map = f9418a;
        if (map.get(c0797m.f9423a) == null) {
            map.put(c0797m.f9423a, new HashMap());
        }
        Map map2 = (Map) map.get(c0797m.f9423a);
        C0693e c0693e = (C0693e) abstractC0640oS;
        if (map2.get(c0693e.f6628b.f6614a) == null) {
            map2.put(c0693e.f6628b.f6614a, new C0696h(c0693e));
        }
        return (C0696h) map2.get(c0693e.f6628b.f6614a);
    }
}
