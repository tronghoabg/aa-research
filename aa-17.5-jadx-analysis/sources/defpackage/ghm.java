package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.PlaceListMapTemplate;
import androidx.car.app.model.SectionedItemList;
import androidx.car.app.model.Tab;
import androidx.car.app.model.TabTemplate;
import androidx.car.app.model.signin.InputSignInMethod;
import androidx.car.app.model.signin.SignInTemplate;
import androidx.car.app.navigation.model.MapWithContentTemplate;
import androidx.car.app.navigation.model.PlaceListNavigationTemplate;
import androidx.car.app.navigation.model.RoutePreviewNavigationTemplate;
import j$.util.Collection;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes2.dex */
public final class ghm implements ghq {
    private final /* synthetic */ int a;

    public ghm(int i) {
        this.a = i;
    }

    public static final boolean d(GridTemplate gridTemplate, GridTemplate gridTemplate2, int i) {
        if (gridTemplate2.isLoading()) {
            return true;
        }
        if (gridTemplate.isLoading() || !Objects.equals(gridTemplate2.getTitle(), gridTemplate.getTitle())) {
            return false;
        }
        ItemList singleList = gridTemplate2.getSingleList();
        ItemList singleList2 = gridTemplate.getSingleList();
        return singleList == null || singleList2 == null || i == 1 || fxa.k(singleList.getItems(), singleList2.getItems(), 2);
    }

    private static final boolean e(String str, Context context) {
        int i = 1;
        try {
            mt.j(context, str);
            return true;
        } catch (SecurityException unused) {
            llv llvVar = new llv(str, i);
            if (!Log.isLoggable("CarApp.H.Tem", 3)) {
                return false;
            }
            Log.d("CarApp.H.Tem", (String) llvVar.get());
            return false;
        }
    }

    @Override // defpackage.ghq
    public final /* synthetic */ void a(Context context, wb wbVar) {
        int i = this.a;
        if (i == 2) {
            if (!e("androidx.car.app.MAP_TEMPLATES", context) && !e("androidx.car.app.NAVIGATION_TEMPLATES", context)) {
                throw new SecurityException("The car app has neither MAP_TEMPLATES nor NAVIGATION_TEMPLATES permissions");
            }
            return;
        }
        if (i == 3) {
            mt.j(context, "androidx.car.app.MEDIA_TEMPLATES");
            return;
        }
        if (i == 5) {
            mt.j(context, "androidx.car.app.NAVIGATION_TEMPLATES");
            return;
        }
        if (i == 7) {
            if (((PlaceListMapTemplate) wbVar).isCurrentLocationEnabled()) {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", context.getPackageName()) != 0 && packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", context.getPackageName()) != 0) {
                    throw new SecurityException("The car app does not have the required location permission(s)");
                }
            }
            mt.j(context, "androidx.car.app.MAP_TEMPLATES");
            return;
        }
        if (i == 8) {
            mt.j(context, "androidx.car.app.NAVIGATION_TEMPLATES");
        } else {
            if (i != 9) {
                return;
            }
            mt.j(context, "androidx.car.app.NAVIGATION_TEMPLATES");
        }
    }

    @Override // defpackage.ghq
    public final /* synthetic */ boolean b(wb wbVar, wb wbVar2, int i) {
        switch (this.a) {
            case 0:
                ListTemplate listTemplate = (ListTemplate) wbVar;
                ListTemplate listTemplate2 = (ListTemplate) wbVar2;
                if (!listTemplate2.isLoading()) {
                    if (!listTemplate.isLoading() && Objects.equals(listTemplate2.getTitle(), listTemplate.getTitle())) {
                        ItemList singleList = listTemplate2.getSingleList();
                        ItemList singleList2 = listTemplate.getSingleList();
                        if (singleList == null || singleList2 == null) {
                            List<SectionedItemList> sectionedLists = listTemplate2.getSectionedLists();
                            List<SectionedItemList> sectionedLists2 = listTemplate.getSectionedLists();
                            if (sectionedLists.size() == sectionedLists2.size()) {
                                for (int i2 = 0; i2 < sectionedLists2.size(); i2++) {
                                    SectionedItemList sectionedItemList = sectionedLists2.get(i2);
                                    SectionedItemList sectionedItemList2 = sectionedLists.get(i2);
                                    ItemList itemList = sectionedItemList2.getItemList();
                                    ItemList itemList2 = sectionedItemList.getItemList();
                                    List<uf> items = itemList.getItems();
                                    List<uf> items2 = itemList2.getItems();
                                    if (!Objects.equals(sectionedItemList.getHeader(), sectionedItemList2.getHeader())) {
                                        break;
                                    } else if (i == 2 && !fxa.k(items, items2, 2)) {
                                        break;
                                    }
                                }
                                break;
                            }
                        } else if (i == 1 || fxa.k(singleList.getItems(), singleList2.getItems(), 2)) {
                        }
                    }
                }
                break;
            case 1:
                break;
            case 2:
                MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) wbVar;
                MapWithContentTemplate mapWithContentTemplate2 = (MapWithContentTemplate) wbVar2;
                mapWithContentTemplate.getClass();
                mapWithContentTemplate2.getClass();
                wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                wb contentTemplate2 = mapWithContentTemplate2.getContentTemplate();
                break;
            case 3:
                break;
            case 4:
                MessageTemplate messageTemplate = (MessageTemplate) wbVar;
                MessageTemplate messageTemplate2 = (MessageTemplate) wbVar2;
                if (!messageTemplate2.isLoading()) {
                    if (!messageTemplate.isLoading() && Objects.equals(messageTemplate2.getTitle(), messageTemplate.getTitle()) && Objects.equals(messageTemplate2.getDebugMessage(), messageTemplate.getDebugMessage()) && Objects.equals(messageTemplate2.getMessage(), messageTemplate.getMessage())) {
                    }
                }
                break;
            case 5:
                break;
            case 6:
                PaneTemplate paneTemplate = (PaneTemplate) wbVar;
                PaneTemplate paneTemplate2 = (PaneTemplate) wbVar2;
                Pane pane = paneTemplate2.getPane();
                Pane pane2 = paneTemplate.getPane();
                if (!pane.isLoading()) {
                    if (!pane2.isLoading() && Objects.equals(paneTemplate2.getTitle(), paneTemplate.getTitle())) {
                        break;
                    }
                }
                break;
            case 7:
                PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) wbVar;
                PlaceListMapTemplate placeListMapTemplate2 = (PlaceListMapTemplate) wbVar2;
                if (!placeListMapTemplate2.isLoading()) {
                    if (!placeListMapTemplate.isLoading() && Objects.equals(placeListMapTemplate2.getTitle(), placeListMapTemplate.getTitle())) {
                        if (i != 1) {
                            ItemList itemList3 = placeListMapTemplate2.getItemList();
                            ItemList itemList4 = placeListMapTemplate.getItemList();
                            if (itemList3 != null && itemList4 != null) {
                                break;
                            }
                        }
                    }
                }
                break;
            case 8:
                PlaceListNavigationTemplate placeListNavigationTemplate = (PlaceListNavigationTemplate) wbVar;
                PlaceListNavigationTemplate placeListNavigationTemplate2 = (PlaceListNavigationTemplate) wbVar2;
                if (!placeListNavigationTemplate2.isLoading()) {
                    if (!placeListNavigationTemplate.isLoading() && Objects.equals(placeListNavigationTemplate2.getTitle(), placeListNavigationTemplate.getTitle())) {
                        if (i != 1) {
                            ItemList itemList5 = placeListNavigationTemplate2.getItemList();
                            ItemList itemList6 = placeListNavigationTemplate.getItemList();
                            if (itemList5 != null && itemList6 != null) {
                                break;
                            }
                        }
                    }
                }
                break;
            case 9:
                RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) wbVar;
                RoutePreviewNavigationTemplate routePreviewNavigationTemplate2 = (RoutePreviewNavigationTemplate) wbVar2;
                if (!routePreviewNavigationTemplate2.isLoading()) {
                    if (!routePreviewNavigationTemplate.isLoading() && Objects.equals(routePreviewNavigationTemplate2.getTitle(), routePreviewNavigationTemplate.getTitle())) {
                        if (i != 1) {
                            ItemList itemList7 = routePreviewNavigationTemplate2.getItemList();
                            ItemList itemList8 = routePreviewNavigationTemplate.getItemList();
                            if (itemList7 != null && itemList8 != null) {
                                break;
                            }
                        }
                    }
                }
                break;
            case 10:
                SignInTemplate signInTemplate = (SignInTemplate) wbVar;
                SignInTemplate signInTemplate2 = (SignInTemplate) wbVar2;
                if (!signInTemplate2.isLoading()) {
                    if (!signInTemplate.isLoading()) {
                        boolean zEquals = Objects.equals(signInTemplate2.getSignInMethod().getClass(), signInTemplate.getSignInMethod().getClass());
                        if (zEquals && (signInTemplate2.getSignInMethod() instanceof InputSignInMethod)) {
                            InputSignInMethod inputSignInMethod = (InputSignInMethod) signInTemplate2.getSignInMethod();
                            InputSignInMethod inputSignInMethod2 = (InputSignInMethod) signInTemplate.getSignInMethod();
                            zEquals = inputSignInMethod.getKeyboardType() == inputSignInMethod2.getKeyboardType() && Objects.equals(inputSignInMethod.getHint(), inputSignInMethod2.getHint()) && inputSignInMethod.getInputType() == inputSignInMethod2.getInputType();
                        }
                        if (!Objects.equals(signInTemplate2.getTitle(), signInTemplate.getTitle()) || !Objects.equals(signInTemplate2.getInstructions(), signInTemplate.getInstructions()) || !Objects.equals(signInTemplate2.getAdditionalText(), signInTemplate.getAdditionalText()) || !zEquals) {
                        }
                    }
                }
                break;
            default:
                TabTemplate tabTemplate = (TabTemplate) wbVar;
                TabTemplate tabTemplate2 = (TabTemplate) wbVar2;
                if (!tabTemplate2.isLoading()) {
                    if (!tabTemplate.isLoading() && tabTemplate2.getTabs().size() == tabTemplate.getTabs().size()) {
                        List<Tab> tabs = tabTemplate2.getTabs();
                        List<Tab> tabs2 = tabTemplate.getTabs();
                        for (int i3 = 0; i3 < tabs2.size(); i3++) {
                            Tab tab = tabs2.get(i3);
                            Tab tab2 = tabs.get(i3);
                            if (Objects.equals(tab.getTitle(), tab2.getTitle()) && Objects.equals(tab.getContentId(), tab2.getContentId())) {
                            }
                        }
                        if (tabTemplate2.getActiveTabContentId().equals(tabTemplate.getActiveTabContentId())) {
                            if (tabTemplate.getTabContents().getTemplate().getClass() != tabTemplate2.getTabContents().getTemplate().getClass()) {
                            }
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // defpackage.ghq
    public final /* synthetic */ List c(wb wbVar, wb wbVar2) {
        switch (this.a) {
            case 0:
                int i = yfq.d;
                break;
            case 1:
                int i2 = yfq.d;
                break;
            case 2:
                MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) wbVar;
                MapWithContentTemplate mapWithContentTemplate2 = (MapWithContentTemplate) wbVar2;
                mapWithContentTemplate.getClass();
                mapWithContentTemplate2.getClass();
                wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                Class<?> cls = contentTemplate != null ? contentTemplate.getClass() : null;
                wb contentTemplate2 = mapWithContentTemplate2.getContentTemplate();
                if (!affa.f(cls, contentTemplate2 != null ? contentTemplate2.getClass() : null)) {
                    int i3 = yfq.d;
                    yfq yfqVar = yls.a;
                    yfqVar.getClass();
                    break;
                } else {
                    break;
                }
            case 3:
                int i4 = yfq.d;
                break;
            case 4:
                int i5 = yfq.d;
                break;
            case 5:
                int i6 = yfq.d;
                break;
            case 6:
                int i7 = yfq.d;
                break;
            case 7:
                int i8 = yfq.d;
                break;
            case 8:
                int i9 = yfq.d;
                break;
            case 9:
                int i10 = yfq.d;
                break;
            case 10:
                int i11 = yfq.d;
                break;
            default:
                TabTemplate tabTemplate = (TabTemplate) wbVar;
                TabTemplate tabTemplate2 = (TabTemplate) wbVar2;
                if (!tabTemplate2.isLoading() && !tabTemplate.isLoading() && tabTemplate2.getTabs().size() == tabTemplate.getTabs().size()) {
                    Tab tab = (Tab) Collection.EL.stream(tabTemplate.getTabs()).filter(new ghp(tabTemplate, 1)).findFirst().orElse(null);
                    Tab tab2 = (Tab) Collection.EL.stream(tabTemplate2.getTabs()).filter(new ghp(tabTemplate2, 0)).findFirst().orElse(null);
                    if (tab != null && tab2 != null && Objects.equals(tab.getTitle(), tab2.getTitle()) && Objects.equals(tab.getContentId(), tab2.getContentId())) {
                        break;
                    } else {
                        int i12 = yfq.d;
                        break;
                    }
                } else {
                    int i13 = yfq.d;
                    break;
                }
                break;
        }
        return yls.a;
    }
}
