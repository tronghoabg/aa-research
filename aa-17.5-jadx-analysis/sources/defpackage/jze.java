package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import androidx.car.app.model.GridItem;
import androidx.car.app.model.GridSection;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.Header;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.Row;
import androidx.car.app.model.RowSection;
import androidx.car.app.model.Section;
import androidx.car.app.model.SectionedItemTemplate;
import androidx.car.app.model.TemplateWrapper;
import com.android.car.libraries.apphost.external.model.GridWrapperTemplate;
import com.android.car.libraries.apphost.external.model.MenuSection;
import com.android.car.libraries.apphost.external.model.MenuTemplate;
import com.android.car.libraries.apphost.internal.model.GoogleListTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class jze implements hmg {
    @Override // defpackage.hmg
    public final TemplateWrapper b(geu geuVar, TemplateWrapper templateWrapper) {
        return c(geuVar, templateWrapper, gzc.a);
    }

    @Override // defpackage.hmg
    public final TemplateWrapper c(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        grr grrVar;
        gkf gkfVar;
        wb template = templateWrapper.getTemplate();
        if (template instanceof SectionedItemTemplate) {
            SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) template;
            if (geuVar.i().c() < 8) {
                throw new gwd("SectionedItemTemplate is only available on API 8 and above, but the current API level is " + geuVar.i().c());
            }
            boolean zIsLoading = sectionedItemTemplate.isLoading();
            Header header = sectionedItemTemplate.getHeader();
            fzg fzgVarJ = header != null ? fww.j(header, geuVar) : null;
            List<Action> actions = sectionedItemTemplate.getActions();
            actions.getClass();
            List<Section<?>> sections = sectionedItemTemplate.getSections();
            sections.getClass();
            ArrayList arrayList = new ArrayList(woy.bp(sections, 10));
            Iterator<T> it = sections.iterator();
            while (it.hasNext()) {
                Section section = (Section) it.next();
                if (section instanceof GridSection) {
                    GridSection gridSection = (GridSection) section;
                    gridSection.getClass();
                    afbe afbeVar = afbe.a;
                    xs<GridItem> itemsDelegate = gridSection.getItemsDelegate();
                    itemsDelegate.getClass();
                    CarText noItemsMessage = gridSection.getNoItemsMessage();
                    String string = noItemsMessage != null ? noItemsMessage.toString() : null;
                    int itemSize = gridSection.getItemSize();
                    if (itemSize == 1) {
                        gkfVar = gkf.a;
                    } else if (itemSize == 2) {
                        gkfVar = gkf.b;
                    } else if (itemSize == 3) {
                        gkfVar = gkf.c;
                    } else {
                        if (itemSize != 4) {
                            throw new IllegalArgumentException(a.bp(itemSize, "Unknown item size: "));
                        }
                        gkfVar = gkf.d;
                    }
                    grrVar = new grr(afbeVar, itemsDelegate, string, gkfVar, gridSection.getTitle());
                } else {
                    if (!(section instanceof RowSection)) {
                        Class<?> cls = section.getClass();
                        Objects.toString(cls);
                        throw new IllegalArgumentException("Invalid section type: ".concat(String.valueOf(cls)));
                    }
                    RowSection rowSection = (RowSection) section;
                    rowSection.getClass();
                    afbe afbeVar2 = afbe.a;
                    xs<Row> itemsDelegate2 = rowSection.getItemsDelegate();
                    itemsDelegate2.getClass();
                    CarText noItemsMessage2 = rowSection.getNoItemsMessage();
                    grrVar = new grr(afbeVar2, itemsDelegate2, noItemsMessage2 != null ? noItemsMessage2.toString() : null, gkf.e, rowSection.getTitle());
                }
                arrayList.add(grrVar);
            }
            template = new gru(zIsLoading, fzgVarJ, arrayList, actions, sectionedItemTemplate.isAlphabeticalIndexingAllowed(), true);
        } else if (template instanceof MenuTemplate) {
            MenuTemplate menuTemplate = (MenuTemplate) template;
            boolean isLoading = menuTemplate.getIsLoading();
            Header header2 = menuTemplate.getHeader();
            fzg fzgVarJ2 = header2 != null ? fww.j(header2, geuVar) : null;
            List<MenuSection> sections2 = menuTemplate.getSections();
            ArrayList arrayList2 = new ArrayList(woy.bp(sections2, 10));
            for (MenuSection menuSection : sections2) {
                menuSection.getClass();
                arrayList2.add(new grr(menuSection.getItems(), menuSection.getItemsDelegate(), menuSection.getNoItemsMessage(), menuSection.getSelectedIndex(), menuSection.getOnSelectedListener(), menuSection.getOnItemVisibilityChangedListener(), menuSection.getItemSize(), menuSection.getHeader(), menuSection.getTextAlign()));
            }
            template = new gru(isLoading, fzgVarJ2, arrayList2, menuTemplate.getActions(), menuTemplate.getAllowAlphabeticalIndexing(), false);
        } else if (template instanceof ListTemplate) {
            template = gur.i(geuVar, gkd.a((ListTemplate) template), templateWrapper.isRefresh(), null, null, null, 56);
        } else if (template instanceof GoogleListTemplate) {
            template = gur.i(geuVar, gkd.b((GoogleListTemplate) template), templateWrapper.isRefresh(), null, null, null, 56);
        } else if (template instanceof GridTemplate) {
            template = new GridWrapperTemplate(new gjx((GridTemplate) template), null);
        } else if (!(template instanceof GridWrapperTemplate)) {
            template = null;
        }
        if (template == null) {
            return templateWrapper;
        }
        TemplateWrapper templateWrapperCopyOf = TemplateWrapper.copyOf(templateWrapper);
        templateWrapperCopyOf.setTemplate(template);
        return templateWrapperCopyOf;
    }
}
