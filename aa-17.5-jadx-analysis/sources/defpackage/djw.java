package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class djw {
    public static final djw a;
    public static final djw b;
    public static final djw c;
    public static final djw d;
    private static final /* synthetic */ djw[] e;

    static {
        djw djwVar = new djw("StartInput", 0);
        a = djwVar;
        djw djwVar2 = new djw("StopInput", 1);
        b = djwVar2;
        djw djwVar3 = new djw("ShowKeyboard", 2);
        c = djwVar3;
        djw djwVar4 = new djw("HideKeyboard", 3);
        d = djwVar4;
        djw[] djwVarArr = {djwVar, djwVar2, djwVar3, djwVar4};
        e = djwVarArr;
        affa.p(djwVarArr);
    }

    public static djw valueOf(String str) {
        return (djw) Enum.valueOf(djw.class, str);
    }

    public static djw[] values() {
        return (djw[]) e.clone();
    }
}
