package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class gmq {
    public static final defpackage.hml a = new defpackage.hmk(new bre(13));
    public static final defpackage.hml b = new defpackage.hmk(new bre(14));
    public static final defpackage.hml c = new defpackage.hmk(new bre(15));
    public static final defpackage.hml d = new defpackage.hmk(new bre(16));

    public static final wi a(gfa gfaVar, com.android.car.libraries.apphost.internal.model.TabTemplateInternal tabTemplateInternal) {
        com.android.car.libraries.apphost.internal.model.TabContentsInternal tabContents = tabTemplateInternal.getTabContents();
        if (tabContents != null) {
            androidx.car.app.model.TemplateWrapper templateWrapperB = defpackage.hmn.a.b(gfaVar, androidx.car.app.model.TemplateWrapper.wrap(tabContents.getTemplate()));
            fvc template = templateWrapperB.getTemplate();
            if ((template instanceof fvc ? template : null) != null) {
                return templateWrapperB.getTemplate();
            }
        }
        return tabTemplateInternal;
    }

    public static final gnc b(androidx.car.app.model.TabTemplate tabTemplate) {
        com.android.car.libraries.apphost.internal.model.TabContentsInternal tabContentsInternal;
        wb tabCallbackDelegate = tabTemplate.getTabCallbackDelegate();
        tabCallbackDelegate.getClass();
        gnc gncVar = new gnc(tabCallbackDelegate);
        gncVar.b = tabTemplate.isLoading();
        gncVar.c = (androidx.car.app.model.Action) c(new gby(tabTemplate, 7));
        androidx.car.app.model.TabContents tabContents = (androidx.car.app.model.TabContents) c(new gby(tabTemplate, 8));
        if (tabContents != null) {
            wi template = tabContents.getTemplate();
            template.getClass();
            tabContentsInternal = new com.android.car.libraries.apphost.internal.model.TabContentsInternal(new defpackage.gmz(template));
        } else {
            tabContentsInternal = null;
        }
        gncVar.e = tabContentsInternal;
        gncVar.f = (java.lang.String) c(new gby(tabTemplate, 9));
        java.util.List<androidx.car.app.model.Tab> tabs = tabTemplate.getTabs();
        tabs.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(tabs, 10));
        for (androidx.car.app.model.Tab tab : tabs) {
            arrayList.add(new com.android.car.libraries.apphost.internal.model.TabInternal(tab.getTitle(), tab.getIcon(), tab.getContentId()));
        }
        gncVar.b(arrayList);
        return gncVar;
    }

    private static final java.lang.Object c(defpackage.afer aferVar) {
        try {
            return aferVar.invoke();
        } catch (java.lang.NullPointerException unused) {
            return null;
        }
    }
}
