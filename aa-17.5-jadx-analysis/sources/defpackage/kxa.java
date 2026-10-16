package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class kxa {
    public static final kxa a;
    public static final kxa b;
    public static final kxa c;
    private static final /* synthetic */ kxa[] d;

    static {
        kxa kxaVar = new kxa("UNKNOWN", 0);
        a = kxaVar;
        kxa kxaVar2 = new kxa("VOICE_SEARCH", 1);
        b = kxaVar2;
        kxa kxaVar3 = new kxa("MEDIA_REC", 2);
        c = kxaVar3;
        d = new kxa[]{kxaVar, kxaVar2, kxaVar3};
    }

    public static kxa valueOf(String str) {
        return (kxa) Enum.valueOf(kxa.class, str);
    }

    public static kxa[] values() {
        return (kxa[]) d.clone();
    }
}
