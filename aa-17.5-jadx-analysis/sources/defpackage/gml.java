package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gml {
    public static final gml a;
    public static final gml b;
    public static final gml c;
    private static final /* synthetic */ gml[] d;

    static {
        gml gmlVar = new gml("LIST", 0);
        a = gmlVar;
        gml gmlVar2 = new gml("KEYBOARD", 1);
        b = gmlVar2;
        gml gmlVar3 = new gml("TRANSFORMED_LIST", 2);
        c = gmlVar3;
        gml[] gmlVarArr = {gmlVar, gmlVar2, gmlVar3};
        d = gmlVarArr;
        affa.p(gmlVarArr);
    }

    public static gml valueOf(String str) {
        return (gml) Enum.valueOf(gml.class, str);
    }

    public static gml[] values() {
        return (gml[]) d.clone();
    }
}
