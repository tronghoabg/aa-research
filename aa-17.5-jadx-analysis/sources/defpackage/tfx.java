package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class tfx {
    public static final tfx a;
    public static final tfx b;
    private static final /* synthetic */ tfx[] c;

    static {
        tfx tfxVar = new tfx("USB", 0);
        a = tfxVar;
        tfx tfxVar2 = new tfx("WIRELESS", 1);
        b = tfxVar2;
        c = new tfx[]{tfxVar, tfxVar2};
    }

    public static tfx valueOf(String str) {
        return (tfx) Enum.valueOf(tfx.class, str);
    }

    public static tfx[] values() {
        return (tfx[]) c.clone();
    }
}
