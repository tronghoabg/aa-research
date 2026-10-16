package androidx.navigation.compose;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class NavHostControllerKt__NavHostController_androidKt {
    private static final Saver<NavHostController, ?> NavControllerSaver$NavHostControllerKt__NavHostController_androidKt(final Context context) {
        return SaverKt.Saver(new p() { // from class: androidx.navigation.compose.NavHostControllerKt__NavHostController_androidKt$$ExternalSyntheticLambda1
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return NavHostControllerKt__NavHostController_androidKt.NavControllerSaver$lambda$0$NavHostControllerKt__NavHostController_androidKt((SaverScope) obj, (NavHostController) obj2);
            }
        }, new l() { // from class: androidx.navigation.compose.NavHostControllerKt__NavHostController_androidKt$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return NavHostControllerKt__NavHostController_androidKt.NavControllerSaver$lambda$1$NavHostControllerKt__NavHostController_androidKt(context, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle NavControllerSaver$lambda$0$NavHostControllerKt__NavHostController_androidKt(SaverScope saverScope, NavHostController navHostController) {
        return navHostController.saveState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavHostController NavControllerSaver$lambda$1$NavHostControllerKt__NavHostController_androidKt(Context context, Bundle bundle) {
        NavHostController navHostControllerCreateNavController$NavHostControllerKt__NavHostController_androidKt = createNavController$NavHostControllerKt__NavHostController_androidKt(context);
        navHostControllerCreateNavController$NavHostControllerKt__NavHostController_androidKt.restoreState(bundle);
        return navHostControllerCreateNavController$NavHostControllerKt__NavHostController_androidKt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavHostController createNavController$NavHostControllerKt__NavHostController_androidKt(Context context) {
        NavHostController navHostController = new NavHostController(context);
        navHostController.getNavigatorProvider().addNavigator(new ComposeNavGraphNavigator(navHostController.getNavigatorProvider()));
        navHostController.getNavigatorProvider().addNavigator(new ComposeNavigator());
        navHostController.getNavigatorProvider().addNavigator(new DialogNavigator());
        return navHostController;
    }

    public static final NavHostController rememberNavController(Navigator<? extends NavDestination>[] navigatorArr, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-342848815, i2, -1, "androidx.navigation.compose.rememberNavController (NavHostController.android.kt:33)");
        }
        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Object[] objArrCopyOf = Arrays.copyOf(navigatorArr, navigatorArr.length);
        Saver<NavHostController, ?> saverNavControllerSaver$NavHostControllerKt__NavHostController_androidKt = NavControllerSaver$NavHostControllerKt__NavHostController_androidKt(context);
        boolean zChangedInstance = composer.changedInstance(context);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.navigation.compose.NavHostControllerKt__NavHostController_androidKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return NavHostControllerKt__NavHostController_androidKt.createNavController$NavHostControllerKt__NavHostController_androidKt(context);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        NavHostController navHostController = (NavHostController) RememberSaveableKt.m7615rememberSaveable(objArrCopyOf, (Saver) saverNavControllerSaver$NavHostControllerKt__NavHostController_androidKt, (a) objRememberedValue, composer, 0);
        for (Navigator<? extends NavDestination> navigator : navigatorArr) {
            navHostController.getNavigatorProvider().addNavigator(navigator);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navHostController;
    }
}
