package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nlz {
    public static final nlz a;
    public static final nlz b;
    public static final nlz c;
    public static final nlz d;
    public static final nlz e;
    private static final /* synthetic */ nlz[] f;

    static {
        nlz nlzVar = new nlz("LAUNCHER_ICON", 0);
        a = nlzVar;
        nlz nlzVar2 = new nlz("NOTIFICATIONS", 1);
        b = nlzVar2;
        nlz nlzVar3 = new nlz("ASSISTANT_ICON", 2);
        c = nlzVar3;
        nlz nlzVar4 = new nlz("ASSISTANT_MEDIA_REC_ICON", 3);
        d = nlzVar4;
        nlz nlzVar5 = new nlz("RECENT_APP_HOTSEAT", 4);
        e = nlzVar5;
        f = new nlz[]{nlzVar, nlzVar2, nlzVar3, nlzVar4, nlzVar5};
    }

    public static nlz valueOf(String str) {
        return (nlz) Enum.valueOf(nlz.class, str);
    }

    public static nlz[] values() {
        return (nlz[]) f.clone();
    }
}
