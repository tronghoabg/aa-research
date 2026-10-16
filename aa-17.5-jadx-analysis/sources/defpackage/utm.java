package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class utm {
    public static final utm a;
    public static final utm b;
    public static final utm c;
    public static final int d;
    private static final /* synthetic */ utm[] e;

    static {
        utm utmVar = new utm("WAIT_FOR_NEXT_FRAME", 0);
        a = utmVar;
        utm utmVar2 = new utm("START_FRAME", 1);
        b = utmVar2;
        utm utmVar3 = new utm("END_FRAME", 2);
        c = utmVar3;
        e = new utm[]{utmVar, utmVar2, utmVar3};
        d = values().length;
    }

    public static utm valueOf(String str) {
        return (utm) Enum.valueOf(utm.class, str);
    }

    public static utm[] values() {
        return (utm[]) e.clone();
    }
}
