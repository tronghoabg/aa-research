package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hnm {
    public static final hnm a;
    public static final hnm b;
    public static final hnm c;
    public static final hnm d;
    public static final hnm e;
    public static final hnm f;
    public static final hnm g;
    public static final hnm h;
    public static final hnm i;
    public static final hnm j;
    public static final hnm k;
    public static final /* synthetic */ afdf l;
    private static final /* synthetic */ hnm[] n;
    public final int m;

    static {
        hnm hnmVar = new hnm("ExampleEmbeddedInsightId", 0, 1);
        a = hnmVar;
        hnm hnmVar2 = new hnm("EmbeddedScrollInsightId", 1, 2);
        b = hnmVar2;
        hnm hnmVar3 = new hnm("ClientActionInsightId", 2, 3);
        c = hnmVar3;
        hnm hnmVar4 = new hnm("WeatherInsightId", 3, 4);
        d = hnmVar4;
        hnm hnmVar5 = new hnm("EmptyRenderInsightId", 4, 5);
        e = hnmVar5;
        hnm hnmVar6 = new hnm("CardInsightId", 5, 7);
        f = hnmVar6;
        hnm hnmVar7 = new hnm("InsightGridId", 6, 8);
        g = hnmVar7;
        hnm hnmVar8 = new hnm("ServerSideCloseInsightId", 7, 9);
        h = hnmVar8;
        hnm hnmVar9 = new hnm("RenderTokenInsightId", 8, 10);
        i = hnmVar9;
        hnm hnmVar10 = new hnm("ClientSignalInsightId", 9, 11);
        j = hnmVar10;
        hnm hnmVar11 = new hnm("LoadingInsightId", 10, 12);
        k = hnmVar11;
        hnm[] hnmVarArr = {hnmVar, hnmVar2, hnmVar3, hnmVar4, hnmVar5, hnmVar6, hnmVar7, hnmVar8, hnmVar9, hnmVar10, hnmVar11};
        n = hnmVarArr;
        l = affa.p(hnmVarArr);
    }

    private hnm(String str, int i2, int i3) {
        this.m = i3;
    }

    public static hnm valueOf(String str) {
        return (hnm) Enum.valueOf(hnm.class, str);
    }

    public static hnm[] values() {
        return (hnm[]) n.clone();
    }
}
