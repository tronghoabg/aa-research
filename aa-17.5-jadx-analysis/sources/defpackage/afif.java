package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class afif {
    public static final afif a;
    public static final afif b;
    public static final afif c;
    public static final afif d;
    private static final /* synthetic */ afif[] e;

    static {
        afif afifVar = new afif("PUBLIC", 0);
        a = afifVar;
        afif afifVar2 = new afif("PROTECTED", 1);
        b = afifVar2;
        afif afifVar3 = new afif("INTERNAL", 2);
        c = afifVar3;
        afif afifVar4 = new afif("PRIVATE", 3);
        d = afifVar4;
        afif[] afifVarArr = {afifVar, afifVar2, afifVar3, afifVar4};
        e = afifVarArr;
        affa.p(afifVarArr);
    }

    public static afif valueOf(String str) {
        return (afif) Enum.valueOf(afif.class, str);
    }

    public static afif[] values() {
        return (afif[]) e.clone();
    }
}
