package androidx.navigation;

import androidx.autofill.HintConstants;
import androidx.navigation.Navigator;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class NavigatorProvider {
    public static final Companion Companion = new Companion(null);
    private static final Map<Class<?>, String> annotationNames = new LinkedHashMap();
    private final Map<String, Navigator<? extends NavDestination>> _navigators = new LinkedHashMap();

    public Navigator<? extends NavDestination> addNavigator(String str, Navigator<? extends NavDestination> navigator) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(navigator, "navigator");
        if (!Companion.validateName$navigation_common(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        Navigator<? extends NavDestination> navigator2 = this._navigators.get(str);
        if (x.n(navigator2, navigator)) {
            return navigator;
        }
        if (navigator2 != null && navigator2.isAttached()) {
            throw new IllegalStateException("Navigator " + navigator + " is replacing an already attached " + navigator2);
        }
        if (!navigator.isAttached()) {
            return this._navigators.put(str, navigator);
        }
        throw new IllegalStateException("Navigator " + navigator + " is already attached to another NavController");
    }

    public <T extends Navigator> T getNavigator(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        if (!Companion.validateName$navigation_common(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        Navigator<? extends NavDestination> navigator = this._navigators.get(str);
        if (navigator != null) {
            return navigator;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    public final Map<String, Navigator<? extends NavDestination>> getNavigators() {
        return r.r(this._navigators);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final String getNameForNavigator$navigation_common(Class<? extends Navigator<?>> cls) {
            x.f(cls, "navigatorClass");
            String strValue = (String) NavigatorProvider.annotationNames.get(cls);
            if (strValue == null) {
                Navigator.Name name = (Navigator.Name) cls.getAnnotation(Navigator.Name.class);
                strValue = name != null ? name.value() : null;
                if (!validateName$navigation_common(strValue)) {
                    throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(String.valueOf(cls.getSimpleName())));
                }
                NavigatorProvider.annotationNames.put(cls, strValue);
            }
            x.c(strValue);
            return strValue;
        }

        public final boolean validateName$navigation_common(String str) {
            return str != null && str.length() > 0;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public final <T extends Navigator> T getNavigator(Class<T> cls) {
        x.f(cls, "navigatorClass");
        return (T) getNavigator(Companion.getNameForNavigator$navigation_common(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Navigator<? extends NavDestination> addNavigator(Navigator<? extends NavDestination> navigator) {
        x.f(navigator, "navigator");
        return addNavigator(Companion.getNameForNavigator$navigation_common(navigator.getClass()), navigator);
    }
}
