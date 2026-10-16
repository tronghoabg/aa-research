package defpackage;

import androidx.car.app.CarContext;
import androidx.car.app.Screen;
import androidx.car.app.model.Action;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.model.Template;
import com.carstream.tech.R;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class pb extends Screen {
    public final String a;
    public final z b;

    public pb(CarContext carContext, String str, z zVar) {
        super(carContext);
        this.a = str;
        this.b = zVar;
        getLifecycle().addObserver(new nb(zVar));
    }

    @Override // androidx.car.app.Screen
    public final Template onGetTemplate() {
        return new SearchTemplate.Builder(new ob(this)).setHeaderAction(Action.BACK).setInitialSearchText(this.a).setSearchHint(getCarContext().getString(R.string.surf_search_hint)).setShowKeyboardByDefault(true).build();
    }
}
