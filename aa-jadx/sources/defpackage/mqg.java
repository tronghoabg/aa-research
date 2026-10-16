package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v1 mqg[], still in use, count: 1, list:
  (r13v1 mqg[]) from 0x005b: INVOKE (r13v1 mqg[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:92)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
@defpackage.zkg(a = defpackage.zke.a)
public final class mqg {
    OTHER(0),
    NAVIGATION(1),
    PHONE(2),
    MEDIA(3),
    PHONE_MEDIA(8),
    SYSTEM(7),
    OEM(4);

    public final int h;

    static {
        defpackage.afga.p(mqgVarArr);
    }

    private mqg(int i2) {
        super(str, i);
        this.h = i2;
    }

    public static defpackage.mqg valueOf(java.lang.String str) {
        return (defpackage.mqg) java.lang.Enum.valueOf(defpackage.mqg.class, str);
    }

    public static defpackage.mqg[] values() {
        return (defpackage.mqg[]) i.clone();
    }
}
