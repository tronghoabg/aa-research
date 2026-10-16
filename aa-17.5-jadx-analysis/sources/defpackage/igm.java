package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class igm {
    public static final igm a;
    public static final igm b;
    public static final igm c;
    public static final igm d;
    public static final igm e;
    public static final igm f;
    public static final igm g;
    public static final igm h;
    public static final igm i;
    public static final igm j;
    private static final /* synthetic */ igm[] k;

    static {
        igm igmVar = new igm("None", 0);
        a = igmVar;
        igm igmVar2 = new igm("XMinYMin", 1);
        b = igmVar2;
        igm igmVar3 = new igm("XMidYMin", 2);
        c = igmVar3;
        igm igmVar4 = new igm("XMaxYMin", 3);
        d = igmVar4;
        igm igmVar5 = new igm("XMinYMid", 4);
        e = igmVar5;
        igm igmVar6 = new igm("XMidYMid", 5);
        f = igmVar6;
        igm igmVar7 = new igm("XMaxYMid", 6);
        g = igmVar7;
        igm igmVar8 = new igm("XMinYMax", 7);
        h = igmVar8;
        igm igmVar9 = new igm("XMidYMax", 8);
        i = igmVar9;
        igm igmVar10 = new igm("XMaxYMax", 9);
        j = igmVar10;
        k = new igm[]{igmVar, igmVar2, igmVar3, igmVar4, igmVar5, igmVar6, igmVar7, igmVar8, igmVar9, igmVar10};
    }

    public static igm valueOf(String str) {
        return (igm) Enum.valueOf(igm.class, str);
    }

    public static igm[] values() {
        return (igm[]) k.clone();
    }
}
