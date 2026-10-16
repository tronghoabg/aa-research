package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mow {
    public static final mow a;
    public static final mow b;
    public static final mow c;
    private static final /* synthetic */ mow[] d;

    static {
        mow mowVar = new mow("LOCK_SCREEN", 0);
        a = mowVar;
        mow mowVar2 = new mow("NO_VIDEO_FOCUS_SCREEN", 1);
        b = mowVar2;
        mow mowVar3 = new mow("DISMISSED", 2);
        c = mowVar3;
        d = new mow[]{mowVar, mowVar2, mowVar3};
    }

    public static mow valueOf(String str) {
        return (mow) Enum.valueOf(mow.class, str);
    }

    public static mow[] values() {
        return (mow[]) d.clone();
    }
}
