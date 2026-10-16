package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bki {
    public static final bki a;
    public static final bki b;
    private static final /* synthetic */ bki[] c;

    static {
        bki bkiVar = new bki("EditableText", 0);
        a = bkiVar;
        bki bkiVar2 = new bki("StaticText", 1);
        b = bkiVar2;
        bki[] bkiVarArr = {bkiVar, bkiVar2};
        c = bkiVarArr;
        affa.p(bkiVarArr);
    }

    public static bki valueOf(String str) {
        return (bki) Enum.valueOf(bki.class, str);
    }

    public static bki[] values() {
        return (bki[]) c.clone();
    }
}
