package Pc;

import java.util.ArrayList;

/* renamed from: Pc.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0797m {

    /* renamed from: a, reason: collision with root package name */
    public String f9423a;

    /* renamed from: b, reason: collision with root package name */
    public String f9424b;

    /* renamed from: c, reason: collision with root package name */
    public String f9425c;

    public static C0797m a(ArrayList arrayList) {
        C0797m c0797m = new C0797m();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"appName\" is null.");
        }
        c0797m.f9423a = str;
        c0797m.f9424b = (String) arrayList.get(1);
        c0797m.f9425c = (String) arrayList.get(2);
        return c0797m;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(this.f9423a);
        arrayList.add(this.f9424b);
        arrayList.add(this.f9425c);
        return arrayList;
    }
}
