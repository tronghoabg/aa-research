package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class pgo {
    public static final pgo a;
    public static final pgo b;
    public static final pgo c;
    private static final /* synthetic */ pgo[] d;

    static {
        pgo pgoVar = new pgo("DO_NOT_HANDLE", 0);
        a = pgoVar;
        pgo pgoVar2 = new pgo("WIFI_CHANNELS_SUPPORTED", 1);
        b = pgoVar2;
        pgo pgoVar3 = new pgo("WIFI_CHANNELS_UNSUPPORTED", 2);
        c = pgoVar3;
        d = new pgo[]{pgoVar, pgoVar2, pgoVar3};
    }

    public static pgo valueOf(String str) {
        return (pgo) Enum.valueOf(pgo.class, str);
    }

    public static pgo[] values() {
        return (pgo[]) d.clone();
    }
}
