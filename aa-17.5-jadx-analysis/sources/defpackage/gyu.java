package defpackage;

import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.PlaceListMapTemplate;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.model.signin.SignInTemplate;
import androidx.car.app.navigation.model.MapWithContentTemplate;
import androidx.car.app.navigation.model.PlaceListNavigationTemplate;
import androidx.car.app.navigation.model.RoutePreviewNavigationTemplate;
import com.android.car.libraries.apphost.external.model.DialpadTemplate;
import com.android.car.libraries.apphost.external.model.LocalWrapperTemplate;
import com.android.car.libraries.apphost.external.model.MenuTemplate;
import com.android.car.libraries.apphost.external.model.widgets.PaneWidget;
import com.android.car.libraries.apphost.tab.model.UnrestrictedTabTemplate;
import java.util.Map;

/* loaded from: classes2.dex */
public final class gyu implements afec {
    final /* synthetic */ afec a;
    private final /* synthetic */ int b;

    public gyu(afec afecVar, int i) {
        this.b = i;
        this.a = afecVar;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, wb] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, wb] */
    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                wb wbVar = (wb) obj;
                if (wbVar != null) {
                    return this.a.invoke((PaneWidget) wbVar);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.android.car.libraries.apphost.external.model.widgets.PaneWidget");
            case 1:
                wb wbVar2 = (wb) obj;
                if (wbVar2 != null) {
                    return this.a.invoke((UnrestrictedTabTemplate) wbVar2);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.android.car.libraries.apphost.tab.model.UnrestrictedTabTemplate");
            case 2:
                wb wbVar3 = (wb) obj;
                if (wbVar3 != null) {
                    return this.a.invoke((DialpadTemplate) wbVar3);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.android.car.libraries.apphost.external.model.DialpadTemplate");
            case 3:
                Map map = ghs.a;
                return ghs.a(this.a.invoke((wb) obj));
            case 4:
                wb wbVar4 = (wb) obj;
                if (wbVar4 != null) {
                    return this.a.invoke((MapWithContentTemplate) wbVar4);
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.car.app.navigation.model.MapWithContentTemplate");
            case 5:
                Map map2 = ghs.a;
                return ghs.a(this.a.invoke((wb) obj));
            case 6:
                wb wbVar5 = (wb) obj;
                if (wbVar5 != null) {
                    return this.a.invoke((LocalWrapperTemplate) wbVar5);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.android.car.libraries.apphost.external.model.LocalWrapperTemplate");
            case 7:
                wb wbVar6 = (wb) obj;
                if (wbVar6 != null) {
                    return this.a.invoke((MessageTemplate) wbVar6);
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.car.app.model.MessageTemplate");
            case 8:
                return new ghr(true, ((Boolean) this.a.invoke((wb) obj)).booleanValue());
            case 9:
                wb wbVar7 = (wb) obj;
                if (wbVar7 != null) {
                    return this.a.invoke((PlaceListMapTemplate) wbVar7);
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.car.app.model.PlaceListMapTemplate");
            case 10:
                return new ghr(true, ((Boolean) this.a.invoke((wb) obj)).booleanValue());
            case 11:
                wb wbVar8 = (wb) obj;
                if (wbVar8 != null) {
                    return this.a.invoke((PlaceListNavigationTemplate) wbVar8);
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.car.app.navigation.model.PlaceListNavigationTemplate");
            case 12:
                return new ghr(true, ((Boolean) this.a.invoke((wb) obj)).booleanValue());
            case 13:
                wb wbVar9 = (wb) obj;
                if (wbVar9 != null) {
                    return this.a.invoke((SearchTemplate) wbVar9);
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.car.app.model.SearchTemplate");
            case 14:
                return new ghr(true, ((Boolean) this.a.invoke((wb) obj)).booleanValue());
            case 15:
                wb wbVar10 = (wb) obj;
                if (wbVar10 != null) {
                    return this.a.invoke((RoutePreviewNavigationTemplate) wbVar10);
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.car.app.navigation.model.RoutePreviewNavigationTemplate");
            case 16:
                return new ghr(true, ((Boolean) this.a.invoke((wb) obj)).booleanValue());
            case 17:
                return new ghr(true, ((Boolean) this.a.invoke((wb) obj)).booleanValue());
            case 18:
                wb wbVar11 = (wb) obj;
                if (wbVar11 != null) {
                    return this.a.invoke((SignInTemplate) wbVar11);
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.car.app.model.signin.SignInTemplate");
            case 19:
                return new ghr(true, ((Boolean) this.a.invoke((wb) obj)).booleanValue());
            default:
                wb wbVar12 = (wb) obj;
                if (wbVar12 != null) {
                    return this.a.invoke((MenuTemplate) wbVar12);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.android.car.libraries.apphost.external.model.MenuTemplate");
        }
    }
}
