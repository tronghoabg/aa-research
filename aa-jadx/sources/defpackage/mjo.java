package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class mjo {
    public static final defpackage.mjo a;
    public static final defpackage.mjo b;
    public static final defpackage.mjo c;
    public static final defpackage.mjo d;
    private static final /* synthetic */ defpackage.mjo[] e;

    static {
        defpackage.mjo mjoVar = new defpackage.mjo("STATE_CONNECTED", 0);
        a = mjoVar;
        defpackage.mjo mjoVar2 = new defpackage.mjo("STATE_NOT_SUPPORTED", 1);
        b = mjoVar2;
        defpackage.mjo mjoVar3 = new defpackage.mjo("STATE_DISCONNECTED", 2);
        c = mjoVar3;
        defpackage.mjo mjoVar4 = new defpackage.mjo("STATE_ERROR", 3);
        d = mjoVar4;
        e = new defpackage.mjo[]{mjoVar, mjoVar2, mjoVar3, mjoVar4};
    }

    public static defpackage.mjo valueOf(java.lang.String str) {
        return (defpackage.mjo) java.lang.Enum.valueOf(defpackage.mjo.class, str);
    }

    public static defpackage.mjo[] values() {
        return (defpackage.mjo[]) e.clone();
    }
}
