package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y3 {
    public static final /* synthetic */ y3[] a = {new y3("AGREEMENT", 0), new y3("ENCRYPTION", 1), new y3("DECRYPTION", 2), new y3("KEYGEN", 3), new y3("SIGNING", 4), new y3("VERIFYING", 5), new y3("AUTHENTICATION", 6), new y3("VERIFICATION", 7), new y3("PRF", 8), new y3("ANY", 9)};

    /* JADX INFO: Fake field, exist only in values array */
    y3 EF5;

    public static y3 valueOf(String str) {
        return (y3) Enum.valueOf(y3.class, str);
    }

    public static y3[] values() {
        return (y3[]) a.clone();
    }
}
