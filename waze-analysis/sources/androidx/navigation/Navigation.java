package androidx.navigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.core.app.ActivityCompat;
import h.g.a.l;
import h.g.b.x;
import h.m.k;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Navigation {
    public static final Navigation INSTANCE = new Navigation();

    private Navigation() {
    }

    public static final View.OnClickListener createNavigateOnClickListener(final NavDirections navDirections) {
        x.f(navDirections, "directions");
        return new View.OnClickListener() { // from class: androidx.navigation.Navigation$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Navigation.createNavigateOnClickListener$lambda$1(navDirections, view);
            }
        };
    }

    public static /* synthetic */ View.OnClickListener createNavigateOnClickListener$default(int i2, Bundle bundle, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            bundle = null;
        }
        return createNavigateOnClickListener(i2, bundle);
    }

    static final void createNavigateOnClickListener$lambda$0(int i2, Bundle bundle, View view) {
        x.c(view);
        findNavController(view).navigate(i2, bundle);
    }

    static final void createNavigateOnClickListener$lambda$1(NavDirections navDirections, View view) {
        x.c(view);
        findNavController(view).navigate(navDirections);
    }

    public static final NavController findNavController(Activity activity, int i2) {
        x.f(activity, "activity");
        View viewRequireViewById = ActivityCompat.requireViewById(activity, i2);
        x.e(viewRequireViewById, "requireViewById(...)");
        NavController navControllerFindViewNavController = INSTANCE.findViewNavController(viewRequireViewById);
        if (navControllerFindViewNavController != null) {
            return navControllerFindViewNavController;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i2);
    }

    private final NavController findViewNavController(View view) {
        return (NavController) k.i(k.p(k.g(view, new l() { // from class: androidx.navigation.Navigation$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Navigation.findViewNavController$lambda$0((View) obj);
            }
        }), new l() { // from class: androidx.navigation.Navigation$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Navigation.findViewNavController$lambda$1((View) obj);
            }
        }));
    }

    static final View findViewNavController$lambda$0(View view) {
        x.f(view, "it");
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    static final NavController findViewNavController$lambda$1(View view) {
        x.f(view, "it");
        return INSTANCE.getViewNavController(view);
    }

    private final NavController getViewNavController(View view) {
        Object tag = view.getTag(com.waze.R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }

    public static final void setViewNavController(View view, NavController navController) {
        x.f(view, "view");
        view.setTag(com.waze.R.id.nav_controller_view_tag, navController);
    }

    public static final View.OnClickListener createNavigateOnClickListener(final int i2, final Bundle bundle) {
        return new View.OnClickListener() { // from class: androidx.navigation.Navigation$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Navigation.createNavigateOnClickListener$lambda$0(i2, bundle, view);
            }
        };
    }

    public static final View.OnClickListener createNavigateOnClickListener(int i2) {
        return createNavigateOnClickListener$default(i2, null, 2, null);
    }

    public static final NavController findNavController(View view) {
        x.f(view, "view");
        NavController navControllerFindViewNavController = INSTANCE.findViewNavController(view);
        if (navControllerFindViewNavController != null) {
            return navControllerFindViewNavController;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
