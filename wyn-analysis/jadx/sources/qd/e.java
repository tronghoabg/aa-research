package Qd;

import m9.S;
import mf.C3560b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final S f9980a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e[] f9981b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C3560b f9982c;

    static {
        e[] eVarArr = {new e("JANUARY", 0), new e("FEBRUARY", 1), new e("MARCH", 2), new e("APRIL", 3), new e("MAY", 4), new e("JUNE", 5), new e("JULY", 6), new e("AUGUST", 7), new e("SEPTEMBER", 8), new e("OCTOBER", 9), new e("NOVEMBER", 10), new e("DECEMBER", 11)};
        f9981b = eVarArr;
        f9982c = ic.d.t(eVarArr);
        f9980a = new S(25);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f9981b.clone();
    }
}
