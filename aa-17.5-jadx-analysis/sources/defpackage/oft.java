package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class oft {
    public static final oft a;
    public static final oft b;
    public static final oft c;
    public static final oft d;
    public static final oft e;
    public static final oft f;
    private static final /* synthetic */ oft[] g;

    static {
        oft oftVar = new oft("OPEN_APP", 0);
        a = oftVar;
        oft oftVar2 = new oft("MUTE", 1);
        b = oftVar2;
        oft oftVar3 = new oft("UNMUTE", 2);
        c = oftVar3;
        oft oftVar4 = new oft("END", 3);
        d = oftVar4;
        oft oftVar5 = new oft("ACCEPT", 4);
        e = oftVar5;
        oft oftVar6 = new oft("REJECT", 5);
        f = oftVar6;
        oft[] oftVarArr = {oftVar, oftVar2, oftVar3, oftVar4, oftVar5, oftVar6};
        g = oftVarArr;
        affa.p(oftVarArr);
    }

    public static oft valueOf(String str) {
        return (oft) Enum.valueOf(oft.class, str);
    }

    public static oft[] values() {
        return (oft[]) g.clone();
    }
}
