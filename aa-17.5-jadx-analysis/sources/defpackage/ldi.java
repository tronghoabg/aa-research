package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ldi implements ngd {
    public static final ldi a;
    private static final /* synthetic */ ldi[] b;

    static {
        ldi ldiVar = new ldi();
        a = ldiVar;
        b = new ldi[]{ldiVar};
    }

    private ldi() {
    }

    public static ldi valueOf(String str) {
        return (ldi) Enum.valueOf(ldi.class, str);
    }

    public static ldi[] values() {
        return (ldi[]) b.clone();
    }

    @Override // defpackage.ngd
    public final String a() {
        return "longPressToSendFeedback";
    }

    @Override // defpackage.ngd
    public final String b() {
        return name();
    }
}
