package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class afie {
    public static final afie a;
    public static final afie b;
    public static final afie c;
    private static final /* synthetic */ afie[] d;

    static {
        afie afieVar = new afie("INVARIANT", 0);
        a = afieVar;
        afie afieVar2 = new afie("IN", 1);
        b = afieVar2;
        afie afieVar3 = new afie("OUT", 2);
        c = afieVar3;
        afie[] afieVarArr = {afieVar, afieVar2, afieVar3};
        d = afieVarArr;
        affa.p(afieVarArr);
    }

    public static afie valueOf(String str) {
        return (afie) Enum.valueOf(afie.class, str);
    }

    public static afie[] values() {
        return (afie[]) d.clone();
    }
}
