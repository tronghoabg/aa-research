package Za;

import ic.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final ya.b f17074b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f17075c;

    /* renamed from: a, reason: collision with root package name */
    public final int f17076a;

    static {
        a[] aVarArr = {new a("NOTHING", 0, 1), new a("ONCE", 1, 2), new a("REPEAT", 2, 3)};
        f17075c = aVarArr;
        d.t(aVarArr);
        f17074b = new ya.b(29);
    }

    public a(String str, int i5, int i10) {
        this.f17076a = i10;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f17075c.clone();
    }
}
