package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class wdy {
    public static final wdy a;
    public static final wdy b;
    public static final wdy c;
    public static final wdy d;
    public static final wdy e;
    private static final /* synthetic */ wdy[] f;

    static {
        wdy wdyVar = new wdy("STARTING_INTENT", 0);
        a = wdyVar;
        wdy wdyVar2 = new wdy("ACTIVITY_RESULT", 1);
        b = wdyVar2;
        wdy wdyVar3 = new wdy("ACTIVITY_REENTER", 2);
        c = wdyVar3;
        wdy wdyVar4 = new wdy("BROADCAST_RECEIVER", 3);
        d = wdyVar4;
        wdy wdyVar5 = new wdy("INTENT_OPERATION", 4);
        e = wdyVar5;
        f = new wdy[]{wdyVar, wdyVar2, wdyVar3, wdyVar4, wdyVar5};
    }

    public static wdy valueOf(String str) {
        return (wdy) Enum.valueOf(wdy.class, str);
    }

    public static wdy[] values() {
        return (wdy[]) f.clone();
    }
}
