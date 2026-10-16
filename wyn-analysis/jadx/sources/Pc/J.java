package Pc;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public String f9336a;

    /* renamed from: b, reason: collision with root package name */
    public String f9337b;

    public static J a(ArrayList arrayList) {
        J j8 = new J();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"verificationId\" is null.");
        }
        j8.f9336a = str;
        String str2 = (String) arrayList.get(1);
        if (str2 == null) {
            throw new IllegalStateException("Nonnull field \"verificationCode\" is null.");
        }
        j8.f9337b = str2;
        return j8;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f9336a);
        arrayList.add(this.f9337b);
        return arrayList;
    }
}
