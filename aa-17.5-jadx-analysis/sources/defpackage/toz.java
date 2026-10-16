package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class toz {
    public static final toz a;
    public static final toz b;
    public static final toz c;
    public static final toz d;
    public static final toz e;
    public static final toz f;
    public static final toz g;
    private static final /* synthetic */ toz[] h;

    static {
        toz tozVar = new toz("UNKNOWN", 0);
        a = tozVar;
        toz tozVar2 = new toz("NETWORK", 1);
        b = tozVar2;
        toz tozVar3 = new toz("DISK_CACHE", 2);
        c = tozVar3;
        toz tozVar4 = new toz("UPDATED_FROM_NETWORK", 3);
        d = tozVar4;
        toz tozVar5 = new toz("OFFLINE", 4);
        e = tozVar5;
        toz tozVar6 = new toz("UPDATED_FROM_NETWORK_DATA_UNCHANGED", 5);
        f = tozVar6;
        toz tozVar7 = new toz("OFFLINE_UPDATED_FROM_NETWORK_DATA_UNCHANGED", 6);
        g = tozVar7;
        h = new toz[]{tozVar, tozVar2, tozVar3, tozVar4, tozVar5, tozVar6, tozVar7};
    }

    public static toz valueOf(String str) {
        return (toz) Enum.valueOf(toz.class, str);
    }

    public static toz[] values() {
        return (toz[]) h.clone();
    }
}
