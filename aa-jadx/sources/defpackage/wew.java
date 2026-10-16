package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wew {
    public static final defpackage.wew a;
    public static final defpackage.wew b;
    public static final defpackage.wew c;
    public static final defpackage.wew d;
    public static final defpackage.wew e;
    private static final /* synthetic */ defpackage.wew[] f;

    static {
        defpackage.wew wewVar = new defpackage.wew("STARTING_INTENT", 0);
        a = wewVar;
        defpackage.wew wewVar2 = new defpackage.wew("ACTIVITY_RESULT", 1);
        b = wewVar2;
        defpackage.wew wewVar3 = new defpackage.wew("ACTIVITY_REENTER", 2);
        c = wewVar3;
        defpackage.wew wewVar4 = new defpackage.wew("BROADCAST_RECEIVER", 3);
        d = wewVar4;
        defpackage.wew wewVar5 = new defpackage.wew("INTENT_OPERATION", 4);
        e = wewVar5;
        f = new defpackage.wew[]{wewVar, wewVar2, wewVar3, wewVar4, wewVar5};
    }

    public static defpackage.wew valueOf(java.lang.String str) {
        return (defpackage.wew) java.lang.Enum.valueOf(defpackage.wew.class, str);
    }

    public static defpackage.wew[] values() {
        return (defpackage.wew[]) f.clone();
    }
}
