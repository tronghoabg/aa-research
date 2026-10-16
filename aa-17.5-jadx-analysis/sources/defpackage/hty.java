package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hty {
    public static final hty a;
    public static final hty b;
    public static final hty c;
    private static final /* synthetic */ hty[] d;

    static {
        hty htyVar = new hty("PREFER_ARGB_8888", 0);
        a = htyVar;
        hty htyVar2 = new hty("PREFER_RGB_565", 1);
        b = htyVar2;
        d = new hty[]{htyVar, htyVar2};
        c = htyVar;
    }

    public static hty valueOf(String str) {
        return (hty) Enum.valueOf(hty.class, str);
    }

    public static hty[] values() {
        return (hty[]) d.clone();
    }
}
