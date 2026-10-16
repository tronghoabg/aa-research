package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@defpackage.zkg(a = defpackage.zke.a)
final class qkx {
    public static final defpackage.qkx a;
    public static final defpackage.qkx b;
    public static final defpackage.qkx c;
    public static final defpackage.qkx d;
    private static final /* synthetic */ defpackage.qkx[] e;

    static {
        defpackage.qkx qkxVar = new defpackage.qkx("BEFORE_START_OF_DRIVE", 0);
        a = qkxVar;
        defpackage.qkx qkxVar2 = new defpackage.qkx("ON_START_OF_DRIVE_NON_PLAYING_MEDIA_ITEM", 1);
        b = qkxVar2;
        defpackage.qkx qkxVar3 = new defpackage.qkx("START_OF_DRIVE_NON_PLAYING_MEDIA_ITEM_IS_PLAYING_DUE_TO_USER_ACTION", 2);
        c = qkxVar3;
        defpackage.qkx qkxVar4 = new defpackage.qkx("BEYOND_START_OF_DRIVE", 3);
        d = qkxVar4;
        e = new defpackage.qkx[]{qkxVar, qkxVar2, qkxVar3, qkxVar4};
    }

    public static defpackage.qkx valueOf(java.lang.String str) {
        return (defpackage.qkx) java.lang.Enum.valueOf(defpackage.qkx.class, str);
    }

    public static defpackage.qkx[] values() {
        return (defpackage.qkx[]) e.clone();
    }
}
