package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class iov {
    public static final defpackage.iov a;
    public static final defpackage.iov b;
    public static final defpackage.iov c;
    public static final defpackage.iov d;
    private static final /* synthetic */ defpackage.iov[] e;

    static {
        defpackage.iov iovVar = new defpackage.iov("CREATED", 0);
        a = iovVar;
        defpackage.iov iovVar2 = new defpackage.iov("STARTED", 1);
        b = iovVar2;
        defpackage.iov iovVar3 = new defpackage.iov("RESUMED", 2);
        c = iovVar3;
        defpackage.iov iovVar4 = new defpackage.iov("DESTROYED", 3);
        d = iovVar4;
        e = new defpackage.iov[]{iovVar, iovVar2, iovVar3, iovVar4};
    }

    public static defpackage.iov valueOf(java.lang.String str) {
        return (defpackage.iov) java.lang.Enum.valueOf(defpackage.iov.class, str);
    }

    public static defpackage.iov[] values() {
        return (defpackage.iov[]) e.clone();
    }
}
