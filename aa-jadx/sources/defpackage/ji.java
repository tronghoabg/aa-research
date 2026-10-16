package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ji extends android.widget.PopupWindow {
    public ji(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        defpackage.lam lamVarC = defpackage.lam.C(context, attributeSet, defpackage.ft.t, i, 0);
        if (lamVarC.y(2)) {
            setOverlapAnchor(lamVarC.x(2, false));
        }
        setBackgroundDrawable(lamVarC.s(0));
        lamVarC.w();
    }
}
