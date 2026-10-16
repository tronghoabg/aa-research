package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class adne {
    public static final adne a;
    public static final adne b;
    public static final adne c;
    private static final /* synthetic */ adne[] d;

    static {
        adne adneVar = new adne("NONE", 0);
        a = adneVar;
        adne adneVar2 = new adne("INTEGRITY", 1);
        b = adneVar2;
        adne adneVar3 = new adne("PRIVACY_AND_INTEGRITY", 2);
        c = adneVar3;
        d = new adne[]{adneVar, adneVar2, adneVar3};
    }

    public static adne valueOf(String str) {
        return (adne) Enum.valueOf(adne.class, str);
    }

    public static adne[] values() {
        return (adne[]) d.clone();
    }
}
