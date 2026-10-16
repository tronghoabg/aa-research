package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class adme {
    public static final adme a;
    public static final adme b;
    public static final adme c;
    public static final adme d;
    public static final adme e;
    private static final /* synthetic */ adme[] f;

    static {
        adme admeVar = new adme("UNARY", 0);
        a = admeVar;
        adme admeVar2 = new adme("CLIENT_STREAMING", 1);
        b = admeVar2;
        adme admeVar3 = new adme("SERVER_STREAMING", 2);
        c = admeVar3;
        adme admeVar4 = new adme("BIDI_STREAMING", 3);
        d = admeVar4;
        adme admeVar5 = new adme("UNKNOWN", 4);
        e = admeVar5;
        f = new adme[]{admeVar, admeVar2, admeVar3, admeVar4, admeVar5};
    }

    public static adme valueOf(String str) {
        return (adme) Enum.valueOf(adme.class, str);
    }

    public static adme[] values() {
        return (adme[]) f.clone();
    }

    public final boolean a() {
        return this == a || this == c;
    }

    public final boolean b() {
        return this == a || this == b;
    }
}
