package j9;

import h9.g;
import h9.h;
import i9.InterfaceC2860b;
import java.util.Date;
import java.util.HashMap;

/* renamed from: j9.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3094d implements InterfaceC2860b {

    /* renamed from: f, reason: collision with root package name */
    public static final C3092b f38679f;

    /* renamed from: g, reason: collision with root package name */
    public static final C3092b f38680g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f38682a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f38683b;

    /* renamed from: c, reason: collision with root package name */
    public final C3091a f38684c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38685d;

    /* renamed from: e, reason: collision with root package name */
    public static final C3091a f38678e = new C3091a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final C3093c f38681h = new C3093c();

    /* JADX WARN: Type inference failed for: r0v1, types: [j9.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [j9.b] */
    static {
        final int i5 = 0;
        f38679f = new g() { // from class: j9.b
            @Override // h9.InterfaceC2794a
            public final void encode(Object obj, Object obj2) {
                switch (i5) {
                    case 0:
                        ((h) obj2).add((String) obj);
                        break;
                    default:
                        ((h) obj2).add(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i10 = 1;
        f38680g = new g() { // from class: j9.b
            @Override // h9.InterfaceC2794a
            public final void encode(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((h) obj2).add((String) obj);
                        break;
                    default:
                        ((h) obj2).add(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public C3094d() {
        HashMap map = new HashMap();
        this.f38682a = map;
        HashMap map2 = new HashMap();
        this.f38683b = map2;
        this.f38684c = f38678e;
        this.f38685d = false;
        map2.put(String.class, f38679f);
        map.remove(String.class);
        map2.put(Boolean.class, f38680g);
        map.remove(Boolean.class);
        map2.put(Date.class, f38681h);
        map.remove(Date.class);
    }

    @Override // i9.InterfaceC2860b
    public final InterfaceC2860b registerEncoder(Class cls, h9.e eVar) {
        this.f38682a.put(cls, eVar);
        this.f38683b.remove(cls);
        return this;
    }
}
