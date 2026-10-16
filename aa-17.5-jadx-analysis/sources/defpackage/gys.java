package defpackage;

import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.PlaceListMapTemplate;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.model.TabTemplate;
import androidx.car.app.model.signin.SignInTemplate;
import androidx.car.app.navigation.model.MapWithContentTemplate;
import androidx.car.app.navigation.model.PlaceListNavigationTemplate;
import androidx.car.app.navigation.model.RoutePreviewNavigationTemplate;
import com.android.car.libraries.apphost.external.model.LocalWrapperTemplate;
import com.android.car.libraries.apphost.external.model.MenuTemplate;
import com.android.car.libraries.apphost.internal.model.AlphaJumpTemplate;
import com.android.car.libraries.apphost.internal.model.TabContentsInternal;
import com.android.car.libraries.apphost.internal.model.TabTemplateInternal;

/* loaded from: classes2.dex */
public final /* synthetic */ class gys implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ gys(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                MessageTemplate messageTemplate = (MessageTemplate) obj;
                messageTemplate.getClass();
                break;
            case 1:
                PaneTemplate paneTemplate = (PaneTemplate) obj;
                paneTemplate.getClass();
                break;
            case 2:
                PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                placeListMapTemplate.getClass();
                break;
            case 3:
                PlaceListNavigationTemplate placeListNavigationTemplate = (PlaceListNavigationTemplate) obj;
                placeListNavigationTemplate.getClass();
                break;
            case 4:
                SearchTemplate searchTemplate = (SearchTemplate) obj;
                searchTemplate.getClass();
                break;
            case 5:
                RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                routePreviewNavigationTemplate.getClass();
                break;
            case 6:
                ListTemplate listTemplate = (ListTemplate) obj;
                listTemplate.getClass();
                break;
            case 7:
                SignInTemplate signInTemplate = (SignInTemplate) obj;
                signInTemplate.getClass();
                break;
            case 8:
                MenuTemplate menuTemplate = (MenuTemplate) obj;
                menuTemplate.getClass();
                break;
            case 9:
                AlphaJumpTemplate alphaJumpTemplate = (AlphaJumpTemplate) obj;
                alphaJumpTemplate.getClass();
                break;
            case 10:
                MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                mapWithContentTemplate.getClass();
                wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                contentTemplate.getClass();
                break;
            case 11:
                LocalWrapperTemplate localWrapperTemplate = (LocalWrapperTemplate) obj;
                localWrapperTemplate.getClass();
                break;
            case 12:
                TabTemplate tabTemplate = (TabTemplate) obj;
                tabTemplate.getClass();
                break;
            case 13:
                TabTemplate tabTemplate2 = (TabTemplate) obj;
                tabTemplate2.getClass();
                wb template = tabTemplate2.getTabContents().getTemplate();
                template.getClass();
                break;
            case 14:
                TabTemplateInternal tabTemplateInternal = (TabTemplateInternal) obj;
                tabTemplateInternal.getClass();
                if (!tabTemplateInternal.getIsLoading() && tabTemplateInternal.getTabContents() != null) {
                    z = false;
                }
                break;
            case 15:
                TabTemplateInternal tabTemplateInternal2 = (TabTemplateInternal) obj;
                tabTemplateInternal2.getClass();
                TabContentsInternal tabContents = tabTemplateInternal2.getTabContents();
                tabContents.getClass();
                break;
            case 16:
                ((hcb) obj).getClass();
                break;
            case 17:
                cie cieVar = (cie) obj;
                cieVar.getClass();
                cieVar.g(new gys(20));
                break;
            case 18:
                cie cieVar2 = (cie) obj;
                cieVar2.getClass();
                cieVar2.g(new gys(19));
                break;
            case 19:
                cho choVar = (cho) obj;
                choVar.getClass();
                if (a.Y(choVar.a, 1)) {
                    choVar.a();
                }
                break;
            default:
                cho choVar2 = (cho) obj;
                choVar2.getClass();
                if (a.Y(choVar2.a, 2)) {
                    choVar2.a();
                }
                break;
        }
        return afak.a;
    }
}
