package androidx.navigation.internal;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavViewModelStoreProvider;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NavBackStackEntryStateImpl {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_ARGS = "nav-entry-state:args";
    public static final String KEY_DESTINATION_ID = "nav-entry-state:destination-id";
    public static final String KEY_ID = "nav-entry-state:id";
    public static final String KEY_SAVED_STATE = "nav-entry-state:saved-state";
    private final Bundle args;
    private final int destinationId;
    private final String id;
    private final Bundle savedState;

    public NavBackStackEntryStateImpl(NavBackStackEntry navBackStackEntry, int i2) {
        k[] kVarArr;
        x.f(navBackStackEntry, "entry");
        this.id = navBackStackEntry.getId();
        this.destinationId = i2;
        this.args = navBackStackEntry.getArguments();
        Map mapJ = r.j();
        if (mapJ.isEmpty()) {
            kVarArr = new k[0];
        } else {
            ArrayList arrayList = new ArrayList(mapJ.size());
            for (Map.Entry entry : mapJ.entrySet()) {
                arrayList.add(new k((String) entry.getKey(), entry.getValue()));
            }
            kVarArr = (k[]) arrayList.toArray(new k[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        SavedStateWriter.m13355constructorimpl(bundleBundleOf);
        this.savedState = bundleBundleOf;
        navBackStackEntry.saveState(bundleBundleOf);
    }

    public final Bundle getArgs$navigation_runtime() {
        return this.args;
    }

    public final int getDestinationId$navigation_runtime() {
        return this.destinationId;
    }

    public final String getId$navigation_runtime() {
        return this.id;
    }

    public final Bundle getSavedState$navigation_runtime() {
        return this.savedState;
    }

    public final NavBackStackEntry instantiate(NavContext navContext, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider) {
        x.f(navContext, "context");
        x.f(navDestination, "destination");
        x.f(state, "hostLifecycleState");
        return NavBackStackEntry.Companion.create(navContext, navDestination, bundle, state, navViewModelStoreProvider, this.id, this.savedState);
    }

    public final Bundle writeToState$navigation_runtime() {
        k[] kVarArr;
        k[] kVarArr2;
        Map mapJ = r.j();
        if (mapJ.isEmpty()) {
            kVarArr = new k[0];
        } else {
            ArrayList arrayList = new ArrayList(mapJ.size());
            for (Map.Entry entry : mapJ.entrySet()) {
                arrayList.add(new k((String) entry.getKey(), entry.getValue()));
            }
            kVarArr = (k[]) arrayList.toArray(new k[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        SavedStateWriter.m13355constructorimpl(bundleBundleOf);
        SavedStateWriter.m13388putStringimpl(bundleBundleOf, KEY_ID, this.id);
        SavedStateWriter.m13372putIntimpl(bundleBundleOf, KEY_DESTINATION_ID, this.destinationId);
        Bundle bundleBundleOf2 = this.args;
        if (bundleBundleOf2 == null) {
            Map mapJ2 = r.j();
            if (mapJ2.isEmpty()) {
                kVarArr2 = new k[0];
            } else {
                ArrayList arrayList2 = new ArrayList(mapJ2.size());
                for (Map.Entry entry2 : mapJ2.entrySet()) {
                    arrayList2.add(new k((String) entry2.getKey(), entry2.getValue()));
                }
                kVarArr2 = (k[]) arrayList2.toArray(new k[0]);
            }
            bundleBundleOf2 = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr2, kVarArr2.length));
            SavedStateWriter.m13355constructorimpl(bundleBundleOf2);
        }
        SavedStateWriter.m13382putSavedStateimpl(bundleBundleOf, KEY_ARGS, bundleBundleOf2);
        SavedStateWriter.m13382putSavedStateimpl(bundleBundleOf, KEY_SAVED_STATE, this.savedState);
        return bundleBundleOf;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public NavBackStackEntryStateImpl(Bundle bundle) {
        x.f(bundle, "state");
        SavedStateReader.m13269constructorimpl(bundle);
        this.id = SavedStateReader.m13340getStringimpl(bundle, KEY_ID);
        SavedStateReader.m13269constructorimpl(bundle);
        this.destinationId = SavedStateReader.m13300getIntimpl(bundle, KEY_DESTINATION_ID);
        SavedStateReader.m13269constructorimpl(bundle);
        this.args = SavedStateReader.m13326getSavedStateimpl(bundle, KEY_ARGS);
        SavedStateReader.m13269constructorimpl(bundle);
        this.savedState = SavedStateReader.m13326getSavedStateimpl(bundle, KEY_SAVED_STATE);
    }
}
