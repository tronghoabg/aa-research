package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class adsi {
    public static final adsi a;
    public static final adsi b;
    public static final adsi c;
    public static final adsi d;
    private static final /* synthetic */ adsi[] e;

    static {
        adsi adsiVar = new adsi("PROCESSED", 0);
        a = adsiVar;
        adsi adsiVar2 = new adsi("REFUSED", 1);
        b = adsiVar2;
        adsi adsiVar3 = new adsi("DROPPED", 2);
        c = adsiVar3;
        adsi adsiVar4 = new adsi("MISCARRIED", 3);
        d = adsiVar4;
        e = new adsi[]{adsiVar, adsiVar2, adsiVar3, adsiVar4};
    }

    public static adsi valueOf(String str) {
        return (adsi) Enum.valueOf(adsi.class, str);
    }

    public static adsi[] values() {
        return (adsi[]) e.clone();
    }
}
