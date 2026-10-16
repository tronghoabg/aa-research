package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class lag implements ngd {
    public static final lag a;
    public static final lag b;
    public static final lag c;
    private static final /* synthetic */ lag[] d;

    static {
        lag lagVar = new lag("ASSISTANT_TRIGGER", 0);
        a = lagVar;
        lag lagVar2 = new lag("HARDWARE_BUTTON_TRIGGER", 1);
        b = lagVar2;
        lag lagVar3 = new lag("ASSISTANT_MEDIA_REC_TRIGGER", 2);
        c = lagVar3;
        d = new lag[]{lagVar, lagVar2, lagVar3};
    }

    public static lag valueOf(String str) {
        return (lag) Enum.valueOf(lag.class, str);
    }

    public static lag[] values() {
        return (lag[]) d.clone();
    }

    @Override // defpackage.ngd
    public final String a() {
        return "assistant";
    }

    @Override // defpackage.ngd
    public final String b() {
        return name();
    }
}
