package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mqh {
    public static final defpackage.mqh a;
    public static final defpackage.mqh b;
    private static final /* synthetic */ defpackage.mqh[] c;

    static {
        defpackage.mqh mqhVar = new defpackage.mqh("WORK", 0);
        a = mqhVar;
        defpackage.mqh mqhVar2 = new defpackage.mqh("PERSONAL", 1);
        b = mqhVar2;
        defpackage.mqh[] mqhVarArr = {mqhVar, mqhVar2};
        c = mqhVarArr;
        defpackage.afga.p(mqhVarArr);
    }

    public static defpackage.mqh valueOf(java.lang.String str) {
        return (defpackage.mqh) java.lang.Enum.valueOf(defpackage.mqh.class, str);
    }

    public static defpackage.mqh[] values() {
        return (defpackage.mqh[]) c.clone();
    }
}
