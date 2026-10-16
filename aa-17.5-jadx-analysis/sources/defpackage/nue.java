package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nue {
    public static final nue a;
    public static final nue b;
    public static final nue c;
    private static final /* synthetic */ nue[] d;

    static {
        nue nueVar = new nue("BADGEABLE", 0);
        a = nueVar;
        nue nueVar2 = new nue("NOTIFICATION_CENTER_BADGE_ONLY", 1);
        b = nueVar2;
        nue nueVar3 = new nue("UNBADGEABLE", 2);
        c = nueVar3;
        d = new nue[]{nueVar, nueVar2, nueVar3};
    }

    public static nue valueOf(String str) {
        return (nue) Enum.valueOf(nue.class, str);
    }

    public static nue[] values() {
        return (nue[]) d.clone();
    }
}
