package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class adny {
    public static final adny a;
    public static final adny b;
    public static final adny c;
    private static final /* synthetic */ adny[] d;

    static {
        adny adnyVar = new adny("FAKE", 0);
        a = adnyVar;
        adny adnyVar2 = new adny("MTLS", 1);
        b = adnyVar2;
        adny adnyVar3 = new adny("CUSTOM_MANAGERS", 2);
        c = adnyVar3;
        d = new adny[]{adnyVar, adnyVar2, adnyVar3};
    }

    public static adny valueOf(String str) {
        return (adny) Enum.valueOf(adny.class, str);
    }

    public static adny[] values() {
        return (adny[]) d.clone();
    }
}
