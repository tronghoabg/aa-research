package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ulo {
    public static final defpackage.ulo a;
    public static final defpackage.ulo b;
    public static final defpackage.ulo c;
    public static final defpackage.ulo d;
    public static final defpackage.ulo e;
    public static final defpackage.ulo f;
    public static final defpackage.ulo g;
    public static final defpackage.ulo h;
    private static final /* synthetic */ defpackage.ulo[] i;

    static {
        defpackage.ulo uloVar = new defpackage.ulo("PARSE_ERROR", 0);
        a = uloVar;
        defpackage.ulo uloVar2 = new defpackage.ulo("STYLE_TABLES_UNAVAILABLE", 1);
        b = uloVar2;
        defpackage.ulo uloVar3 = new defpackage.ulo("UNSUPPORTED_FORMAT", 2);
        c = uloVar3;
        defpackage.ulo uloVar4 = new defpackage.ulo("IO_ERROR", 3);
        d = uloVar4;
        defpackage.ulo uloVar5 = new defpackage.ulo("UNEXPECTED_EXCEPTION", 4);
        e = uloVar5;
        defpackage.ulo uloVar6 = new defpackage.ulo("NO_TILE_UNPACKER_AVAILABLE", 5);
        f = uloVar6;
        defpackage.ulo uloVar7 = new defpackage.ulo("NO_DATA", 6);
        g = uloVar7;
        defpackage.ulo uloVar8 = new defpackage.ulo(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.SUCCESS, 7);
        h = uloVar8;
        i = new defpackage.ulo[]{uloVar, uloVar2, uloVar3, uloVar4, uloVar5, uloVar6, uloVar7, uloVar8};
    }

    public static defpackage.ulo valueOf(java.lang.String str) {
        return (defpackage.ulo) java.lang.Enum.valueOf(defpackage.ulo.class, str);
    }

    public static defpackage.ulo[] values() {
        return (defpackage.ulo[]) i.clone();
    }
}
