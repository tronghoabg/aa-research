package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ajqh {
    public static final ajqh a;
    public static final ajqh b;
    private static final /* synthetic */ ajqh[] c;

    static {
        ajqh ajqhVar = new ajqh("TARGET", 0);
        a = ajqhVar;
        ajqh ajqhVar2 = new ajqh("PROXY", 1);
        b = ajqhVar2;
        c = new ajqh[]{ajqhVar, ajqhVar2};
    }

    public static ajqh valueOf(String str) {
        return (ajqh) Enum.valueOf(ajqh.class, str);
    }

    public static ajqh[] values() {
        return (ajqh[]) c.clone();
    }
}
