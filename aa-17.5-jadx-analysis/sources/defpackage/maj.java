package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class maj {
    public static final maj a;
    public static final maj b;
    public static final maj c;
    public static final maj d;
    public static final maj e;
    private static final /* synthetic */ maj[] f;

    static {
        maj majVar = new maj("UNKNOWN", 0);
        a = majVar;
        maj majVar2 = new maj("RELEASED", 1);
        b = majVar2;
        maj majVar3 = new maj("RELEASING", 2);
        c = majVar3;
        maj majVar4 = new maj("REQUESTED", 3);
        d = majVar4;
        maj majVar5 = new maj("GRANTED", 4);
        e = majVar5;
        f = new maj[]{majVar, majVar2, majVar3, majVar4, majVar5};
    }

    public static maj valueOf(String str) {
        return (maj) Enum.valueOf(maj.class, str);
    }

    public static maj[] values() {
        return (maj[]) f.clone();
    }
}
