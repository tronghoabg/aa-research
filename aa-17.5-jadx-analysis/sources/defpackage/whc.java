package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class whc {
    public static final whc a;
    public static final whc b;
    public static final whc c;
    private static final /* synthetic */ whc[] d;

    static {
        whc whcVar = new whc("CARD", 0);
        a = whcVar;
        whc whcVar2 = new whc("TOAST", 1);
        b = whcVar2;
        whc whcVar3 = new whc("SILENT", 2);
        c = whcVar3;
        d = new whc[]{whcVar, whcVar2, whcVar3};
    }

    public static whc valueOf(String str) {
        return (whc) Enum.valueOf(whc.class, str);
    }

    public static whc[] values() {
        return (whc[]) d.clone();
    }
}
