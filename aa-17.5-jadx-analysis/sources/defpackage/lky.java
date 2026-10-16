package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class lky {
    public static final lky a;
    public static final lky b;
    public static final lky c;
    private static final /* synthetic */ lky[] d;

    static {
        lky lkyVar = new lky("OPEN_PLAYBACK", 0);
        a = lkyVar;
        lky lkyVar2 = new lky("OPEN_SEARCH", 1);
        b = lkyVar2;
        lky lkyVar3 = new lky("RADIO_SCAN", 2);
        c = lkyVar3;
        lky[] lkyVarArr = {lkyVar, lkyVar2, lkyVar3};
        d = lkyVarArr;
        affa.p(lkyVarArr);
    }

    public static lky valueOf(String str) {
        return (lky) Enum.valueOf(lky.class, str);
    }

    public static lky[] values() {
        return (lky[]) d.clone();
    }
}
