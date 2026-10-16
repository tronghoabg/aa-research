package Za;

import ic.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f17077a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f17078b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f17079c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f17080d;

    static {
        b bVar = new b("GRANTED", 0);
        f17077a = bVar;
        b bVar2 = new b("DENIED", 1);
        f17078b = bVar2;
        b bVar3 = new b("PERMANENTLY_DENIED", 2);
        f17079c = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f17080d = bVarArr;
        d.t(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f17080d.clone();
    }
}
