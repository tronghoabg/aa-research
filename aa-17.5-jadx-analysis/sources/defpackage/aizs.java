package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class aizs {
    public static final aizs a;
    public static final aizs b;
    public static final aizs c;
    private static final /* synthetic */ aizs[] d;

    static {
        aizs aizsVar = new aizs("START", 0);
        a = aizsVar;
        aizs aizsVar2 = new aizs("STOP", 1);
        b = aizsVar2;
        aizs aizsVar3 = new aizs("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = aizsVar3;
        aizs[] aizsVarArr = {aizsVar, aizsVar2, aizsVar3};
        d = aizsVarArr;
        affa.p(aizsVarArr);
    }

    public static aizs valueOf(String str) {
        return (aizs) Enum.valueOf(aizs.class, str);
    }

    public static aizs[] values() {
        return (aizs[]) d.clone();
    }
}
