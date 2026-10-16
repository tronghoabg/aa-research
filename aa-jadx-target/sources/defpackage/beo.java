package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v6 beo[], still in use, count: 1, list:
  (r5v6 beo[]) from 0x006c: INVOKE (r5v6 beo[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:109)
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
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class beo {
    Cut(defpackage.bfz.a, android.R.string.cut, android.R.attr.actionModeCutDrawable),
    Copy(defpackage.bfz.b, android.R.string.copy, android.R.attr.actionModeCopyDrawable),
    Paste(defpackage.bfz.c, android.R.string.paste, android.R.attr.actionModePasteDrawable),
    SelectAll(defpackage.bfz.d, android.R.string.selectAll, android.R.attr.actionModeSelectAllDrawable),
    Autofill(defpackage.bfz.e, android.R.string.autofill, 0);

    public final java.lang.Object f;
    public final int g;
    public final int h;

    static {
        defpackage.afga.p(beoVarArr);
    }

    private beo(java.lang.Object obj, int i2, int i3) {
        super(str, i);
        this.f = obj;
        this.g = i2;
        this.h = i3;
    }

    public static defpackage.beo valueOf(java.lang.String str) {
        return (defpackage.beo) java.lang.Enum.valueOf(defpackage.beo.class, str);
    }

    public static defpackage.beo[] values() {
        return (defpackage.beo[]) i.clone();
    }
}
