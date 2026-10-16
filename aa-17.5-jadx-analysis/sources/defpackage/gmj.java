package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.Tab;
import androidx.car.app.model.TabContents;
import androidx.car.app.model.TabTemplate;
import androidx.car.app.model.TemplateWrapper;
import com.android.car.libraries.apphost.internal.model.TabContentsInternal;
import com.android.car.libraries.apphost.internal.model.TabInternal;
import com.android.car.libraries.apphost.internal.model.TabTemplateInternal;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class gmj {
    public static final hmf a = new hme(new bqy(13));
    public static final hmf b = new hme(new bqy(14));
    public static final hmf c = new hme(new bqy(15));
    public static final hmf d = new hme(new bqy(16));

    public static final wb a(geu geuVar, TabTemplateInternal tabTemplateInternal) {
        TabContentsInternal tabContents = tabTemplateInternal.getTabContents();
        if (tabContents != null) {
            TemplateWrapper templateWrapperB = hmh.a.b(geuVar, TemplateWrapper.wrap(tabContents.getTemplate()));
            wb template = templateWrapperB.getTemplate();
            if ((template instanceof fus ? (fus) template : null) != null) {
                return templateWrapperB.getTemplate();
            }
        }
        return tabTemplateInternal;
    }

    public static final gmv b(TabTemplate tabTemplate) {
        TabContentsInternal tabContentsInternal;
        vu tabCallbackDelegate = tabTemplate.getTabCallbackDelegate();
        tabCallbackDelegate.getClass();
        gmv gmvVar = new gmv(tabCallbackDelegate);
        gmvVar.b = tabTemplate.isLoading();
        gmvVar.c = (Action) c(new gbz(tabTemplate, 6));
        TabContents tabContents = (TabContents) c(new gbz(tabTemplate, 7));
        if (tabContents != null) {
            wb template = tabContents.getTemplate();
            template.getClass();
            tabContentsInternal = new TabContentsInternal(new gms(template));
        } else {
            tabContentsInternal = null;
        }
        gmvVar.e = tabContentsInternal;
        gmvVar.f = (String) c(new gbz(tabTemplate, 8));
        List<Tab> tabs = tabTemplate.getTabs();
        tabs.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(tabs, 10));
        for (Tab tab : tabs) {
            arrayList.add(new TabInternal(tab.getTitle(), tab.getIcon(), tab.getContentId()));
        }
        gmvVar.b(arrayList);
        return gmvVar;
    }

    private static final Object c(afdr afdrVar) {
        try {
            return afdrVar.invoke();
        } catch (NullPointerException unused) {
            return null;
        }
    }
}
