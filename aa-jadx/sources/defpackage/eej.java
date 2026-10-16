package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eej {
    public final android.view.View a;
    public final java.util.ArrayList b = new java.util.ArrayList();
    public defpackage.dvl c;
    public defpackage.dvl d;
    public int e;

    public eej(android.view.ViewGroup viewGroup) {
        android.view.View childAt;
        defpackage.dvl dvlVar = defpackage.dvl.a;
        this.c = dvlVar;
        this.d = dvlVar;
        android.graphics.drawable.Drawable background = viewGroup.getBackground();
        int i = 0;
        this.e = background instanceof android.graphics.drawable.ColorDrawable ? ((android.graphics.drawable.ColorDrawable) background).getColor() : 0;
        defpackage.eeg eegVar = new defpackage.eeg(this, viewGroup.getContext(), viewGroup);
        this.a = eegVar;
        eegVar.setVisibility(8);
        eegVar.setWillNotDraw(true);
        defpackage.eef eefVar = new defpackage.eef(this, i);
        int[] iArr = defpackage.ebt.a;
        defpackage.ebl.e(eegVar, eefVar);
        defpackage.kwv.G(eegVar, new defpackage.eeh(this));
        int childCount = viewGroup.getChildCount();
        do {
            childCount--;
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
        } while (childAt.isAttachedToWindow() == viewGroup.isAttachedToWindow());
        if (childAt == null) {
            viewGroup.addView(eegVar, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new defpackage.eei(viewGroup, (android.view.View) eegVar, 0));
        }
    }

    public static final defpackage.dvl a(defpackage.edf edfVar) {
        return defpackage.dvl.c(edfVar.f(519), edfVar.f(64));
    }
}
