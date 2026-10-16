package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import androidx.car.app.model.GridItem;
import androidx.car.app.model.Header;
import androidx.car.app.model.Row;
import com.android.car.libraries.apphost.external.model.MenuSection;
import com.android.car.libraries.apphost.external.model.MenuTemplate;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class kbj implements afeg {
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        gmo harVar;
        int i;
        MenuTemplate menuTemplate = (MenuTemplate) obj;
        geu geuVar = (geu) obj2;
        menuTemplate.getClass();
        geuVar.getClass();
        boolean isLoading = menuTemplate.getIsLoading();
        Header header = menuTemplate.getHeader();
        fzg fzgVarJ = header != null ? fww.j(header, geuVar) : null;
        List<MenuSection> sections = menuTemplate.getSections();
        ArrayList arrayList = new ArrayList(woy.bp(sections, 10));
        Iterator<T> it = sections.iterator();
        while (true) {
            if (!it.hasNext()) {
                List<Action> actions = menuTemplate.getActions();
                ArrayList arrayList2 = new ArrayList(woy.bp(actions, 10));
                Iterator<T> it2 = actions.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(fvl.c((Action) it2.next(), geuVar, grx.i(geuVar), null, false, 12));
                }
                return new hay(isLoading, fzgVarJ, arrayList, arrayList2, true != menuTemplate.getAllowAlphabeticalIndexing() ? 1 : 3, grx.k(menuTemplate.getScrollStatePersistenceStrategy()), null, false, BitmapDescriptorFactory.HUE_RED, 448);
            }
            MenuSection menuSection = (MenuSection) it.next();
            menuSection.getClass();
            if (menuSection.getItems().isEmpty() || (menuSection.getItems().get(0) instanceof Row)) {
                CarText header2 = menuSection.getHeader();
                CharSequence noItemsMessage = menuSection.getNoItemsMessage();
                CarText carTextCreate = noItemsMessage != null ? CarText.create(noItemsMessage) : null;
                uw onItemVisibilityChangedListener = menuSection.getOnItemVisibilityChangedListener();
                guk gukVar = onItemVisibilityChangedListener != null ? new guk(geuVar, onItemVisibilityChangedListener, 10, null) : null;
                List<uf> items = menuSection.getItems();
                ArrayList arrayList3 = new ArrayList(woy.bp(items, 10));
                for (uf ufVar : items) {
                    ufVar.getClass();
                    arrayList3.add(haq.b((Row) ufVar, geuVar));
                }
                harVar = new har(header2, carTextCreate, gukVar, 0, arrayList3, 82);
            } else {
                if (!(menuSection.getItems().get(0) instanceof GridItem)) {
                    uf ufVar2 = menuSection.getItems().get(0);
                    Objects.toString(ufVar2);
                    throw new IllegalArgumentException("Unknown menu item type: ".concat(String.valueOf(ufVar2)));
                }
                CarText header3 = menuSection.getHeader();
                CharSequence noItemsMessage2 = menuSection.getNoItemsMessage();
                CarText carTextCreate2 = noItemsMessage2 != null ? CarText.create(noItemsMessage2) : null;
                gkf itemSize = menuSection.getItemSize();
                itemSize.getClass();
                int iOrdinal = itemSize.ordinal();
                if (iOrdinal == 0) {
                    i = 2;
                } else if (iOrdinal == 1) {
                    i = i;
                } else if (iOrdinal == 2) {
                    i = 4;
                } else if (iOrdinal == 3) {
                    i = 5;
                    i = i;
                } else {
                    if (iOrdinal != 4) {
                        throw new aezs();
                    }
                    i = 1;
                }
                uw onItemVisibilityChangedListener2 = menuSection.getOnItemVisibilityChangedListener();
                guk gukVar2 = onItemVisibilityChangedListener2 != null ? new guk(geuVar, onItemVisibilityChangedListener2, 10, null) : null;
                List<uf> items2 = menuSection.getItems();
                ArrayList arrayList4 = new ArrayList(woy.bp(items2, 10));
                for (uf ufVar3 : items2) {
                    ufVar3.getClass();
                    arrayList4.add(gnz.c((GridItem) ufVar3, geuVar));
                }
                harVar = new hal(header3, carTextCreate2, i, 0, gukVar2, arrayList4, 146);
            }
            arrayList.add(harVar);
        }
    }
}
