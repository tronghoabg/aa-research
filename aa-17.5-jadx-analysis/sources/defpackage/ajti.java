package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ajti {
    public static final ajti a;
    public static final ajti b;
    private static final /* synthetic */ ajti[] c;

    static {
        ajti ajtiVar = new ajti("PLAIN", 0);
        a = ajtiVar;
        ajti ajtiVar2 = new ajti("LAYERED", 1);
        b = ajtiVar2;
        c = new ajti[]{ajtiVar, ajtiVar2};
    }

    public static ajti valueOf(String str) {
        return (ajti) Enum.valueOf(ajti.class, str);
    }

    public static ajti[] values() {
        return (ajti[]) c.clone();
    }
}
