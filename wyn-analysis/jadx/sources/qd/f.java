package Qd;

import mf.C3560b;
import wa.C4398a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final C4398a f9983a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f[] f9984b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C3560b f9985c;

    static {
        f[] fVarArr = {new f("MONDAY", 0), new f("TUESDAY", 1), new f("WEDNESDAY", 2), new f("THURSDAY", 3), new f("FRIDAY", 4), new f("SATURDAY", 5), new f("SUNDAY", 6)};
        f9984b = fVarArr;
        f9985c = ic.d.t(fVarArr);
        f9983a = new C4398a(25);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f9984b.clone();
    }
}
