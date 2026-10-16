package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nus {
    public static final defpackage.nus a;
    public static final defpackage.nus b;
    public static final defpackage.nus c;
    private static final /* synthetic */ defpackage.nus[] d;

    static {
        defpackage.nus nusVar = new defpackage.nus("BADGEABLE", 0);
        a = nusVar;
        defpackage.nus nusVar2 = new defpackage.nus("NOTIFICATION_CENTER_BADGE_ONLY", 1);
        b = nusVar2;
        defpackage.nus nusVar3 = new defpackage.nus("UNBADGEABLE", 2);
        c = nusVar3;
        d = new defpackage.nus[]{nusVar, nusVar2, nusVar3};
    }

    public static defpackage.nus valueOf(java.lang.String str) {
        return (defpackage.nus) java.lang.Enum.valueOf(defpackage.nus.class, str);
    }

    public static defpackage.nus[] values() {
        return (defpackage.nus[]) d.clone();
    }
}
