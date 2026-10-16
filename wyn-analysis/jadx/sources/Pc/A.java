package Pc;

import A.AbstractC0213f;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public int f9298a;

    /* renamed from: b, reason: collision with root package name */
    public B f9299b;

    public static A a(ArrayList arrayList) {
        A a5 = new A();
        int i5 = AbstractC0213f.g(7)[((Integer) arrayList.get(0)).intValue()];
        if (i5 == 0) {
            throw new IllegalStateException("Nonnull field \"operation\" is null.");
        }
        a5.f9298a = i5;
        B b5 = (B) arrayList.get(1);
        if (b5 == null) {
            throw new IllegalStateException("Nonnull field \"data\" is null.");
        }
        a5.f9299b = b5;
        return a5;
    }
}
