package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dcw {
    public static final defpackage.aau a;

    static {
        long[] jArr = defpackage.aav.a;
        a = new defpackage.aau(6);
    }

    public static final android.view.View a(android.view.View view) {
        java.lang.Object objB = defpackage.edd.b(view);
        while (objB instanceof android.view.View) {
            android.view.View view2 = (android.view.View) objB;
            if (view2.getId() == 16908290) {
                break;
            }
            objB = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final defpackage.bvi b(android.view.View view) {
        defpackage.bvi bviVarC = c(view);
        if (bviVarC != null) {
            return bviVarC;
        }
        java.lang.Object parent = view.getParent();
        while (bviVarC == null && (parent instanceof android.view.View)) {
            android.view.View view2 = (android.view.View) parent;
            bviVarC = c(view2);
            parent = defpackage.edd.b(view2);
        }
        return bviVarC;
    }

    public static final defpackage.bvi c(android.view.View view) {
        java.lang.Object tag = view.getTag(2131427502);
        if (tag instanceof defpackage.bvi) {
            return (defpackage.bvi) tag;
        }
        return null;
    }

    public static final defpackage.bxt d(android.view.View view) {
        if (!view.isAttachedToWindow()) {
            defpackage.csc.c(defpackage.a.bl(view, "Cannot locate windowRecomposer; View ", " is not attached to a window"));
        }
        android.view.View viewA = a(view);
        defpackage.bvi bviVarC = c(viewA);
        if (bviVarC != null) {
            if (bviVarC instanceof defpackage.bxt) {
                return (defpackage.bxt) bviVarC;
            }
            throw new java.lang.IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.dcq.a;
        defpackage.bxt bxtVarB = defpackage.dax.b(viewA);
        viewA.setTag(2131427502, bxtVarB);
        aiwa aiwaVar = aiwa.a;
        android.os.Handler handler = viewA.getHandler();
        int i = aixw.a;
        viewA.addOnAttachStateChangeListener(new defpackage.cjp(ahoc.d(aiwaVar, new aixu(handler, "windowRecomposer cleanup", false).b, 0, new defpackage.bej(bxtVarB, viewA, (defpackage.afdk) null, 7), 2), 3));
        return bxtVarB;
    }
}
