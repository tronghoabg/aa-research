package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class tey {
    public static final tey a;
    public static final tey b;
    public static final tey c;
    public static final tey d;
    public static final tey e;
    private static final /* synthetic */ tey[] f;

    static {
        tey teyVar = new tey("DEFAULT", 0);
        a = teyVar;
        tey teyVar2 = new tey("ASSISTANT", 1);
        b = teyVar2;
        tey teyVar3 = new tey("AUDIO", 2);
        c = teyVar3;
        tey teyVar4 = new tey("TELECOM", 3);
        d = teyVar4;
        tey teyVar5 = new tey("NOTIFICATION_LISTENER_SERVICE", 4);
        e = teyVar5;
        f = new tey[]{teyVar, teyVar2, teyVar3, teyVar4, teyVar5};
    }

    public static tey valueOf(String str) {
        return (tey) Enum.valueOf(tey.class, str);
    }

    public static tey[] values() {
        return (tey[]) f.clone();
    }
}
