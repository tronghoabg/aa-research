package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rcu {
    public static final defpackage.rcu a = new defpackage.rcu();

    public static final java.lang.String a(android.view.View view) {
        java.lang.String simpleName = view.getClass().getSimpleName();
        defpackage.xyj xyjVar = new defpackage.xyj(", ");
        java.lang.String strE = new defpackage.xyh(xyjVar, xyjVar).e(true != view.isShown() ? null : "shown", true != view.isFocusable() ? null : "focusable", true != view.hasFocus() ? null : "hasFocus", true != view.isFocused() ? null : "focused", true == view.hasWindowFocus() ? "hasWindowFocus" : null);
        try {
            return java.lang.String.format("%s (%s) [%s]", view.getResources().getResourceEntryName(view.getId()), simpleName, strE);
        } catch (android.content.res.Resources.NotFoundException unused) {
            return java.lang.String.format("%s [%s]", simpleName, strE);
        }
    }
}
