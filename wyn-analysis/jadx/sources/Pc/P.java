package Pc;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public String f9362a;

    /* renamed from: b, reason: collision with root package name */
    public String f9363b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f9364c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f9365d;

    public static P a(ArrayList arrayList) {
        P p10 = new P();
        p10.f9362a = (String) arrayList.get(0);
        p10.f9363b = (String) arrayList.get(1);
        Boolean bool = (Boolean) arrayList.get(2);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"displayNameChanged\" is null.");
        }
        p10.f9364c = bool;
        Boolean bool2 = (Boolean) arrayList.get(3);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"photoUrlChanged\" is null.");
        }
        p10.f9365d = bool2;
        return p10;
    }
}
