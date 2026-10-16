package defpackage;

import android.view.ViewParent;

/* loaded from: classes.dex */
final /* synthetic */ class ebs extends afey implements afec {
    public static final ebs a = new ebs();

    public ebs() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ViewParent viewParent = (ViewParent) obj;
        viewParent.getClass();
        return viewParent.getParent();
    }
}
