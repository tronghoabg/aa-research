package androidx.navigation;

import android.app.Application;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.navigation.internal.NavContext;
import h.g.b.x;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class NavBackStackEntryKt__NavBackStackEntry_androidKt {
    public static final String randomUuid() {
        String string = UUID.randomUUID().toString();
        x.e(string, "toString(...)");
        return string;
    }

    public static final void setPlatformExtras(MutableCreationExtras mutableCreationExtras, NavContext navContext) {
        x.f(mutableCreationExtras, "<this>");
        Object application = navContext != null ? navContext.getApplication() : null;
        Application application2 = application instanceof Application ? (Application) application : null;
        if (application2 != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application2);
        }
    }
}
