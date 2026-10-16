package Ne;

import A7.RunnableC0307z;
import Va.C1038ka;
import x9.C4504d;
import za.C4658a;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4658a f8671a = new C4658a(23);

    /* renamed from: b, reason: collision with root package name */
    public static final RunnableC0307z f8672b = new RunnableC0307z(1);

    /* renamed from: c, reason: collision with root package name */
    public static final C4504d f8673c = new C4504d(23);

    /* renamed from: d, reason: collision with root package name */
    public static final ya.b f8674d = new ya.b(23);

    /* renamed from: e, reason: collision with root package name */
    public static final C1038ka f8675e = new C1038ka(24);

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void b(int i5, String str) {
        if (i5 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i5);
    }
}
