package androidx.navigation.internal;

import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.navigation.NavArgument;
import androidx.navigation.NavArgumentKt;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavDeepLinkRequest;
import androidx.navigation.NavDestination;
import androidx.navigation.NavUriKt;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import h.a.r;
import h.f;
import h.g;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import h.k;
import h.n.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NavDestinationImpl {
    private Map<String, NavArgument> arguments;
    private final List<NavDeepLink> deepLinks;
    private final NavDestination destination;
    private int id;
    private String idName;
    private String route;
    private f<NavDeepLink> routeDeepLink;

    public NavDestinationImpl(NavDestination navDestination) {
        x.f(navDestination, "destination");
        this.destination = navDestination;
        this.deepLinks = new ArrayList();
        this.arguments = new LinkedHashMap();
    }

    static final boolean _set_route_$lambda$1(NavDeepLink navDeepLink, String str) {
        x.f(str, "key");
        return !navDeepLink.getArgumentsNames$navigation_common().contains(str);
    }

    static final NavDeepLink _set_route_$lambda$3(String str) {
        NavDeepLink.Builder builder = new NavDeepLink.Builder();
        builder.setUriPattern(str);
        return builder.build();
    }

    static final boolean addDeepLink$lambda$0(NavDeepLink navDeepLink, String str) {
        x.f(str, "key");
        return !navDeepLink.getArgumentsNames$navigation_common().contains(str);
    }

    private final boolean hasRequiredArguments(NavDeepLink navDeepLink, Uri uri, Map<String, NavArgument> map) {
        final Bundle matchingPathAndQueryArgs$navigation_common = navDeepLink.getMatchingPathAndQueryArgs$navigation_common(uri, map);
        return NavArgumentKt.missingRequiredArguments(map, new l() { // from class: androidx.navigation.internal.NavDestinationImpl$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NavDestinationImpl.hasRequiredArguments$lambda$0(matchingPathAndQueryArgs$navigation_common, (String) obj));
            }
        }).isEmpty();
    }

    static final boolean hasRequiredArguments$lambda$0(Bundle bundle, String str) {
        x.f(str, "key");
        SavedStateReader.m13269constructorimpl(bundle);
        return !SavedStateReader.m13270containsimpl(bundle, str);
    }

    public final void addArgument$navigation_common(String str, NavArgument navArgument) {
        x.f(str, "argumentName");
        x.f(navArgument, "argument");
        this.arguments.put(str, navArgument);
    }

    public final void addDeepLink$navigation_common(final NavDeepLink navDeepLink) {
        x.f(navDeepLink, "navDeepLink");
        List<String> listMissingRequiredArguments = NavArgumentKt.missingRequiredArguments(this.arguments, new l() { // from class: androidx.navigation.internal.NavDestinationImpl$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NavDestinationImpl.addDeepLink$lambda$0(navDeepLink, (String) obj));
            }
        });
        if (listMissingRequiredArguments.isEmpty()) {
            this.deepLinks.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException("Deep link " + navDeepLink.getUriPattern() + " can't be used to open destination " + this.destination + ".\nFollowing required arguments are missing: " + listMissingRequiredArguments);
    }

    public final Bundle addInDefaultArgs$navigation_common(Bundle bundle) {
        k[] kVarArr;
        if (bundle == null && this.arguments.isEmpty()) {
            return null;
        }
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
        for (Map.Entry<String, NavArgument> entry2 : this.arguments.entrySet()) {
            entry2.getValue().putDefaultValue(entry2.getKey(), bundleBundleOf);
        }
        if (bundle != null) {
            SavedStateWriter.m13355constructorimpl(bundleBundleOf);
            SavedStateWriter.m13359putAllimpl(bundleBundleOf, bundle);
            for (Map.Entry<String, NavArgument> entry3 : this.arguments.entrySet()) {
                String key = entry3.getKey();
                NavArgument value = entry3.getValue();
                if (!value.isDefaultValueUnknown$navigation_common() && !value.verify(key, bundleBundleOf)) {
                    throw new IllegalArgumentException("Wrong argument type for '" + key + "' in argument savedState. " + value.getType().getName() + " expected.");
                }
            }
        }
        return bundleBundleOf;
    }

    public final Map<String, NavArgument> getArguments$navigation_common() {
        return this.arguments;
    }

    public final List<NavDeepLink> getDeepLinks$navigation_common() {
        return this.deepLinks;
    }

    public final NavDestination getDestination() {
        return this.destination;
    }

    public final int getId$navigation_common() {
        return this.id;
    }

    public final String getIdName$navigation_common() {
        return this.idName;
    }

    public final String getRoute$navigation_common() {
        return this.route;
    }

    public final boolean hasRoute$navigation_common(String str, Bundle bundle) {
        x.f(str, "route");
        if (x.n(this.route, str)) {
            return true;
        }
        NavDestination.DeepLinkMatch deepLinkMatchMatchRoute$navigation_common = matchRoute$navigation_common(str);
        if (x.n(this.destination, deepLinkMatchMatchRoute$navigation_common != null ? deepLinkMatchMatchRoute$navigation_common.getDestination() : null)) {
            return deepLinkMatchMatchRoute$navigation_common.hasMatchingArgs(bundle);
        }
        return false;
    }

    public final NavDestination.DeepLinkMatch matchDeepLink$navigation_common(NavDeepLinkRequest navDeepLinkRequest) {
        x.f(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.deepLinks.isEmpty()) {
            return null;
        }
        NavDestination.DeepLinkMatch deepLinkMatch = null;
        for (NavDeepLink navDeepLink : this.deepLinks) {
            Uri uri = navDeepLinkRequest.getUri();
            if (navDeepLink.matches$navigation_common(navDeepLinkRequest)) {
                Bundle matchingArguments = uri != null ? navDeepLink.getMatchingArguments(uri, this.arguments) : null;
                int iCalculateMatchingPathSegments$navigation_common = navDeepLink.calculateMatchingPathSegments$navigation_common(uri);
                String action = navDeepLinkRequest.getAction();
                boolean z = false;
                if (action != null && x.n(action, navDeepLink.getAction())) {
                    z = true;
                }
                boolean z2 = z;
                String mimeType = navDeepLinkRequest.getMimeType();
                int mimeTypeMatchRating = mimeType != null ? navDeepLink.getMimeTypeMatchRating(mimeType) : -1;
                if (matchingArguments == null) {
                    if (z2 || mimeTypeMatchRating >= 0) {
                        if (hasRequiredArguments(navDeepLink, uri, this.arguments)) {
                        }
                    }
                }
                NavDestination.DeepLinkMatch deepLinkMatch2 = new NavDestination.DeepLinkMatch(this.destination, matchingArguments, navDeepLink.isExactDeepLink(), iCalculateMatchingPathSegments$navigation_common, z2, mimeTypeMatchRating);
                if (deepLinkMatch == null || deepLinkMatch2.compareTo(deepLinkMatch) > 0) {
                    deepLinkMatch = deepLinkMatch2;
                }
            }
        }
        return deepLinkMatch;
    }

    public final NavDestination.DeepLinkMatch matchRoute$navigation_common(String str) {
        NavDeepLink value;
        Uri uriNavUri;
        Bundle matchingArguments;
        x.f(str, "route");
        f<NavDeepLink> fVar = this.routeDeepLink;
        if (fVar == null || (value = fVar.getValue()) == null || (matchingArguments = value.getMatchingArguments((uriNavUri = NavUriKt.NavUri(NavDestination.Companion.createRoute(str))), this.arguments)) == null) {
            return null;
        }
        return new NavDestination.DeepLinkMatch(this.destination, matchingArguments, value.isExactDeepLink(), value.calculateMatchingPathSegments$navigation_common(uriNavUri), false, -1);
    }

    public final void removeArgument$navigation_common(String str) {
        x.f(str, "argumentName");
        this.arguments.remove(str);
    }

    public final void setArguments$navigation_common(Map<String, NavArgument> map) {
        x.f(map, "<set-?>");
        this.arguments = map;
    }

    public final void setId$navigation_common(int i2) {
        this.id = i2;
        this.idName = null;
    }

    public final void setIdName$navigation_common(String str) {
        this.idName = str;
    }

    public final void setRoute$navigation_common(String str) {
        if (str == null) {
            setId$navigation_common(0);
        } else {
            if (o.G(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            final String strCreateRoute = NavDestination.Companion.createRoute(str);
            NavDeepLink.Builder builder = new NavDeepLink.Builder();
            builder.setUriPattern(strCreateRoute);
            final NavDeepLink navDeepLinkBuild = builder.build();
            List<String> listMissingRequiredArguments = NavArgumentKt.missingRequiredArguments(this.arguments, new l() { // from class: androidx.navigation.internal.NavDestinationImpl$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(NavDestinationImpl._set_route_$lambda$1(navDeepLinkBuild, (String) obj));
                }
            });
            if (!listMissingRequiredArguments.isEmpty()) {
                throw new IllegalArgumentException("Cannot set route \"" + str + "\" for destination " + this.destination + ". Following required arguments are missing: " + listMissingRequiredArguments);
            }
            this.routeDeepLink = g.a(new a() { // from class: androidx.navigation.internal.NavDestinationImpl$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return NavDestinationImpl._set_route_$lambda$3(strCreateRoute);
                }
            });
            setId$navigation_common(strCreateRoute.hashCode());
        }
        this.route = str;
    }
}
