package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.autofill.HintConstants;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavDestination;
import androidx.navigation.internal.NavContext;
import androidx.navigation.internal.NavDestinationImpl;
import androidx.navigation.serialization.RouteSerializerKt;
import androidx.savedstate.SavedStateReader;
import h.a.r;
import h.g.a.l;
import h.g.b.ab;
import h.g.b.ah;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.l.c;
import h.m.h;
import h.m.k;
import h.n.o;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.b.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class NavDestination {
    public static final Companion Companion = new Companion(null);
    private static final Map<String, Class<?>> classes = new LinkedHashMap();
    private final SparseArrayCompat<NavAction> actions;
    private final NavDestinationImpl impl;
    private CharSequence label;
    private final String navigatorName;
    private NavGraph parent;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface ClassType {
        Class<?> value();
    }

    /* compiled from: WazeSource */
    public final class DeepLinkMatch implements Comparable<DeepLinkMatch> {
        private final NavDestination destination;
        private final boolean hasMatchingAction;
        private final boolean isExactDeepLink;
        private final Bundle matchingArgs;
        private final int matchingPathSegments;
        private final int mimeTypeMatchLevel;

        public DeepLinkMatch(NavDestination navDestination, Bundle bundle, boolean z, int i2, boolean z2, int i3) {
            x.f(navDestination, "destination");
            this.destination = navDestination;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z;
            this.matchingPathSegments = i2;
            this.hasMatchingAction = z2;
            this.mimeTypeMatchLevel = i3;
        }

        @Override // java.lang.Comparable
        public int compareTo(DeepLinkMatch deepLinkMatch) {
            x.f(deepLinkMatch, "other");
            if (this.isExactDeepLink) {
                if (!deepLinkMatch.isExactDeepLink) {
                    return 1;
                }
            } else if (deepLinkMatch.isExactDeepLink) {
                return -1;
            }
            int i2 = this.matchingPathSegments - deepLinkMatch.matchingPathSegments;
            if (i2 > 0) {
                return 1;
            }
            if (i2 < 0) {
                return -1;
            }
            Bundle bundle = this.matchingArgs;
            if (bundle != null && deepLinkMatch.matchingArgs == null) {
                return 1;
            }
            if (bundle == null && deepLinkMatch.matchingArgs != null) {
                return -1;
            }
            if (bundle != null) {
                SavedStateReader.m13269constructorimpl(bundle);
                int iM13349sizeimpl = SavedStateReader.m13349sizeimpl(bundle);
                Bundle bundle2 = deepLinkMatch.matchingArgs;
                x.c(bundle2);
                SavedStateReader.m13269constructorimpl(bundle2);
                int iM13349sizeimpl2 = iM13349sizeimpl - SavedStateReader.m13349sizeimpl(bundle2);
                if (iM13349sizeimpl2 > 0) {
                    return 1;
                }
                if (iM13349sizeimpl2 < 0) {
                    return -1;
                }
            }
            if (this.hasMatchingAction) {
                if (!deepLinkMatch.hasMatchingAction) {
                    return 1;
                }
            } else if (deepLinkMatch.hasMatchingAction) {
                return -1;
            }
            return this.mimeTypeMatchLevel - deepLinkMatch.mimeTypeMatchLevel;
        }

        public final NavDestination getDestination() {
            return this.destination;
        }

        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }

        public final boolean hasMatchingArgs(Bundle bundle) {
            Bundle bundle2;
            if (bundle == null || (bundle2 = this.matchingArgs) == null) {
                return false;
            }
            Set<String> setKeySet = bundle2.keySet();
            x.e(setKeySet, "keySet(...)");
            for (String str : setKeySet) {
                SavedStateReader.m13269constructorimpl(bundle);
                x.c(str);
                if (!SavedStateReader.m13270containsimpl(bundle, str)) {
                    return false;
                }
                NavArgument navArgument = this.destination.getArguments().get(str);
                NavType<Object> type = navArgument != null ? navArgument.getType() : null;
                Object obj = type != null ? type.get(this.matchingArgs, str) : null;
                Object obj2 = type != null ? type.get(bundle, str) : null;
                if (type != null && !type.valueEquals(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    public NavDestination(String str) {
        x.f(str, "navigatorName");
        this.navigatorName = str;
        this.impl = new NavDestinationImpl(this);
        this.actions = new SparseArrayCompat<>(0, 1, null);
    }

    public static /* synthetic */ int[] buildDeepLinkIds$default(NavDestination navDestination, NavDestination navDestination2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if (1 == (i2 & 1)) {
            navDestination2 = null;
        }
        return navDestination.buildDeepLinkIds(navDestination2);
    }

    private final List<NavDeepLink> getDeepLinks() {
        return this.impl.getDeepLinks$navigation_common();
    }

    private static Object getDeepLinks$delegate(NavDestination navDestination) {
        return new ah(navDestination.impl, NavDestinationImpl.class, "deepLinks", "getDeepLinks$navigation_common()Ljava/util/List;", 0);
    }

    public static final h<NavDestination> getHierarchy(NavDestination navDestination) {
        return Companion.getHierarchy(navDestination);
    }

    private final String getIdName() {
        return this.impl.getIdName$navigation_common();
    }

    private static Object getIdName$delegate(NavDestination navDestination) {
        return new ab(navDestination.impl, NavDestinationImpl.class, "idName", "getIdName$navigation_common()Ljava/lang/String;", 0);
    }

    private static Object getRoute$delegate(NavDestination navDestination) {
        return new ab(navDestination.impl, NavDestinationImpl.class, "route", "getRoute$navigation_common()Ljava/lang/String;", 0);
    }

    protected static final <C> Class<? extends C> parseClassFromName(Context context, String str, Class<? extends C> cls) {
        return Companion.parseClassFromName(context, str, cls);
    }

    public static final <C> Class<? extends C> parseClassFromNameInternal(Context context, String str, Class<? extends C> cls) {
        return Companion.parseClassFromNameInternal(context, str, cls);
    }

    private final void setIdName(String str) {
        this.impl.setIdName$navigation_common(str);
    }

    public final void addArgument(String str, NavArgument navArgument) {
        x.f(str, "argumentName");
        x.f(navArgument, "argument");
        this.impl.addArgument$navigation_common(str, navArgument);
    }

    public final void addDeepLink(String str) {
        x.f(str, "uriPattern");
        NavDeepLink.Builder builder = new NavDeepLink.Builder();
        builder.setUriPattern(str);
        addDeepLink(builder.build());
    }

    public final Bundle addInDefaultArgs(Bundle bundle) {
        return this.impl.addInDefaultArgs$navigation_common(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] buildDeepLinkIds(androidx.navigation.NavDestination r5) {
        /*
            r4 = this;
            h.a.u r0 = new h.a.u
            r0.<init>()
        L5:
            h.g.b.x.c(r4)
            androidx.navigation.NavGraph r1 = r4.parent
            if (r5 == 0) goto Lf
            androidx.navigation.NavGraph r2 = r5.parent
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L25
            androidx.navigation.NavGraph r2 = r5.parent
            h.g.b.x.c(r2)
            int r3 = r4.getId()
            androidx.navigation.NavDestination r2 = r2.findNode(r3)
            if (r2 != r4) goto L25
            r0.addFirst(r4)
            goto L3f
        L25:
            if (r1 == 0) goto L31
            int r2 = r1.getStartDestinationId()
            int r3 = r4.getId()
            if (r2 == r3) goto L34
        L31:
            r0.addFirst(r4)
        L34:
            boolean r4 = h.g.b.x.n(r1, r5)
            if (r4 != 0) goto L3f
            r4 = r1
            androidx.navigation.NavDestination r4 = (androidx.navigation.NavDestination) r4
            if (r4 != 0) goto L5
        L3f:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r4 = h.a.i.ao(r0)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = h.a.i.q(r4, r0)
            r5.<init>(r0)
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r4 = r4.iterator()
        L58:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r4.next()
            androidx.navigation.NavDestination r0 = (androidx.navigation.NavDestination) r0
            int r0 = r0.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            goto L58
        L70:
            java.util.List r5 = (java.util.List) r5
            java.util.Collection r5 = (java.util.Collection) r5
            int[] r4 = h.a.i.aA(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.buildDeepLinkIds(androidx.navigation.NavDestination):int[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0 A[EDGE_INSN: B:31:0x00b0->B:32:0x00b1 BREAK  A[LOOP:1: B:23:0x007d->B:47:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto Ld0
            boolean r2 = r9 instanceof androidx.navigation.NavDestination
            if (r2 != 0) goto Ld
            goto Ld0
        Ld:
            java.util.List r2 = r8.getDeepLinks()
            androidx.navigation.NavDestination r9 = (androidx.navigation.NavDestination) r9
            java.util.List r3 = r9.getDeepLinks()
            boolean r2 = h.g.b.x.n(r2, r3)
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r3 = r8.actions
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r4 = r9.actions
            int r3 = r3.size()
            int r4 = r4.size()
            if (r3 != r4) goto L5e
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r3 = r8.actions
            h.a.aj r3 = androidx.collection.SparseArrayKt.keyIterator(r3)
            java.util.Iterator r3 = (java.util.Iterator) r3
            h.m.h r3 = h.m.k.c(r3)
            java.util.Iterator r3 = r3.iterator()
        L39:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5c
            java.lang.Object r4 = r3.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r5 = r8.actions
            java.lang.Object r5 = r5.get(r4)
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r6 = r9.actions
            java.lang.Object r4 = r6.get(r4)
            boolean r4 = h.g.b.x.n(r5, r4)
            if (r4 != 0) goto L39
            goto L5e
        L5c:
            r3 = r0
            goto L5f
        L5e:
            r3 = r1
        L5f:
            java.util.Map r4 = r8.getArguments()
            int r4 = r4.size()
            java.util.Map r5 = r9.getArguments()
            int r5 = r5.size()
            if (r4 != r5) goto Lb0
            java.util.Map r4 = r8.getArguments()
            h.m.h r4 = h.a.r.w(r4)
            java.util.Iterator r4 = r4.iterator()
        L7d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lae
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map r6 = r9.getArguments()
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto Lb0
            java.util.Map r6 = r9.getArguments()
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = h.g.b.x.n(r6, r5)
            if (r5 == 0) goto Lb0
            goto L7d
        Lae:
            r4 = r0
            goto Lb1
        Lb0:
            r4 = r1
        Lb1:
            int r5 = r8.getId()
            int r6 = r9.getId()
            if (r5 != r6) goto Ld0
            java.lang.String r8 = r8.getRoute()
            java.lang.String r9 = r9.getRoute()
            boolean r8 = h.g.b.x.n(r8, r9)
            if (r8 == 0) goto Ld0
            if (r2 == 0) goto Ld0
            if (r3 == 0) goto Ld0
            if (r4 == 0) goto Ld0
            return r0
        Ld0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String fillInLabel(android.content.Context r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            h.g.b.x.f(r9, r0)
            java.lang.CharSequence r0 = r8.label
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.lang.String r2 = "\\{(.+?)\\}"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r2 = r2.matcher(r0)
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            if (r10 == 0) goto L25
            androidx.savedstate.SavedStateReader.m13269constructorimpl(r10)
            java.util.Map r4 = androidx.savedstate.SavedStateReader.m13350toMapimpl(r10)
            if (r4 != 0) goto L29
        L25:
            java.util.Map r4 = h.a.r.j()
        L29:
            boolean r5 = r2.find()
            if (r5 == 0) goto Lb2
            r5 = 1
            java.lang.String r5 = r2.group(r5)
            if (r5 == 0) goto L89
            boolean r6 = r4.containsKey(r5)
            if (r6 == 0) goto L89
            java.lang.String r6 = ""
            r2.appendReplacement(r3, r6)
            java.util.Map r6 = r8.getArguments()
            java.lang.Object r6 = r6.get(r5)
            androidx.navigation.NavArgument r6 = (androidx.navigation.NavArgument) r6
            if (r6 == 0) goto L52
            androidx.navigation.NavType r6 = r6.getType()
            goto L53
        L52:
            r6 = r1
        L53:
            androidx.navigation.NavType<java.lang.Integer> r7 = androidx.navigation.NavType.ReferenceType
            boolean r7 = h.g.b.x.n(r6, r7)
            if (r7 == 0) goto L74
            androidx.navigation.NavType<java.lang.Integer> r6 = androidx.navigation.NavType.ReferenceType
            h.g.b.x.c(r10)
            java.lang.Object r5 = r6.get(r10, r5)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Int"
            h.g.b.x.d(r5, r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.String r5 = r9.getString(r5)
            goto L82
        L74:
            h.g.b.x.c(r6)
            h.g.b.x.c(r10)
            java.lang.Object r5 = r6.get(r10, r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L82:
            h.g.b.x.c(r5)
            r3.append(r5)
            goto L29
        L89:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Could not find \""
            r8.<init>(r9)
            r8.append(r5)
            java.lang.String r9 = "\" in "
            r8.append(r9)
            r8.append(r10)
            java.lang.String r9 = " to fill label \""
            r8.append(r9)
            r8.append(r0)
            java.lang.String r9 = "\""
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r8)
            throw r9
        Lb2:
            r2.appendTail(r3)
            java.lang.String r8 = r3.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.fillInLabel(android.content.Context, android.os.Bundle):java.lang.String");
    }

    public final NavAction getAction(int i2) {
        NavAction navAction = this.actions.getIsEmpty() ? null : this.actions.get(i2);
        if (navAction != null) {
            return navAction;
        }
        NavGraph navGraph = this.parent;
        if (navGraph == null) {
            return null;
        }
        return navGraph.getAction(i2);
    }

    public final Map<String, NavArgument> getArguments() {
        return r.r(this.impl.getArguments$navigation_common());
    }

    public String getDisplayName() {
        String idName = getIdName();
        return idName == null ? String.valueOf(getId()) : idName;
    }

    public final int getId() {
        return this.impl.getId$navigation_common();
    }

    public final CharSequence getLabel() {
        return this.label;
    }

    public final String getNavigatorName() {
        return this.navigatorName;
    }

    public final NavGraph getParent() {
        return this.parent;
    }

    public final String getRoute() {
        return this.impl.getRoute$navigation_common();
    }

    public boolean hasDeepLink(Uri uri) {
        x.f(uri, "deepLink");
        return hasDeepLink(new NavDeepLinkRequest(uri, null, null));
    }

    public final boolean hasRoute(String str, Bundle bundle) {
        x.f(str, "route");
        return this.impl.hasRoute$navigation_common(str, bundle);
    }

    public int hashCode() {
        int id = getId() * 31;
        String route = getRoute();
        int iHashCode = id + (route != null ? route.hashCode() : 0);
        for (NavDeepLink navDeepLink : getDeepLinks()) {
            int i2 = iHashCode * 31;
            String uriPattern = navDeepLink.getUriPattern();
            int iHashCode2 = (i2 + (uriPattern != null ? uriPattern.hashCode() : 0)) * 31;
            String action = navDeepLink.getAction();
            int iHashCode3 = (iHashCode2 + (action != null ? action.hashCode() : 0)) * 31;
            String mimeType = navDeepLink.getMimeType();
            iHashCode = iHashCode3 + (mimeType != null ? mimeType.hashCode() : 0);
        }
        Iterator itValueIterator = SparseArrayKt.valueIterator(this.actions);
        while (itValueIterator.hasNext()) {
            NavAction navAction = (NavAction) itValueIterator.next();
            int destinationId = ((iHashCode * 31) + navAction.getDestinationId()) * 31;
            NavOptions navOptions = navAction.getNavOptions();
            iHashCode = destinationId + (navOptions != null ? navOptions.hashCode() : 0);
            Bundle defaultArguments = navAction.getDefaultArguments();
            if (defaultArguments != null) {
                SavedStateReader.m13269constructorimpl(defaultArguments);
                iHashCode = (iHashCode * 31) + SavedStateReader.m13272contentDeepHashCodeimpl(defaultArguments);
            }
        }
        for (String str : getArguments().keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str.hashCode()) * 31;
            NavArgument navArgument = getArguments().get(str);
            iHashCode = iHashCode4 + (navArgument != null ? navArgument.hashCode() : 0);
        }
        return iHashCode;
    }

    public DeepLinkMatch matchDeepLink(NavDeepLinkRequest navDeepLinkRequest) {
        x.f(navDeepLinkRequest, "navDeepLinkRequest");
        return this.impl.matchDeepLink$navigation_common(navDeepLinkRequest);
    }

    public final DeepLinkMatch matchRoute(String str) {
        x.f(str, "route");
        return this.impl.matchRoute$navigation_common(str);
    }

    public void onInflate(Context context, AttributeSet attributeSet) {
        x.f(context, "context");
        x.f(attributeSet, "attrs");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.Navigator);
        x.e(typedArrayObtainAttributes, "obtainAttributes(...)");
        setRoute(typedArrayObtainAttributes.getString(2));
        if (typedArrayObtainAttributes.hasValue(1)) {
            setId(typedArrayObtainAttributes.getResourceId(1, 0));
            setIdName(Companion.getDisplayName(new NavContext(context), getId()));
        }
        this.label = typedArrayObtainAttributes.getText(androidx.navigation.common.R.styleable.Navigator_android_label);
        typedArrayObtainAttributes.recycle();
    }

    public final void putAction(int i2, NavAction navAction) {
        x.f(navAction, "action");
        if (supportsActions()) {
            if (i2 == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.actions.put(i2, navAction);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i2 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final void removeAction(int i2) {
        this.actions.remove(i2);
    }

    public final void removeArgument(String str) {
        x.f(str, "argumentName");
        this.impl.removeArgument$navigation_common(str);
    }

    public final void setId(int i2) {
        this.impl.setId$navigation_common(i2);
    }

    public final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void setParent(NavGraph navGraph) {
        this.parent = navGraph;
    }

    public final void setRoute(String str) {
        this.impl.setRoute$navigation_common(str);
    }

    public boolean supportsActions() {
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        if (getIdName() == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(getId()));
        } else {
            sb.append(getIdName());
        }
        sb.append(")");
        String route = getRoute();
        if (route != null && !o.G(route)) {
            sb.append(" route=");
            sb.append(getRoute());
        }
        if (this.label != null) {
            sb.append(" label=");
            sb.append(this.label);
        }
        String string = sb.toString();
        x.e(string, "toString(...)");
        return string;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final NavDestination _get_hierarchy_$lambda$0(NavDestination navDestination) {
            x.f(navDestination, "it");
            return navDestination.getParent();
        }

        public final String createRoute(String str) {
            return str != null ? "android-app://androidx.navigation/".concat(str) : "";
        }

        public final String getDisplayName(NavContext navContext, int i2) {
            x.f(navContext, "context");
            return i2 <= 16777215 ? String.valueOf(i2) : navContext.getResourceName(i2);
        }

        public final h<NavDestination> getHierarchy(NavDestination navDestination) {
            x.f(navDestination, "<this>");
            return k.g(navDestination, new l() { // from class: androidx.navigation.NavDestination$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return NavDestination.Companion._get_hierarchy_$lambda$0((NavDestination) obj);
                }
            });
        }

        public final <T> boolean hasRoute(NavDestination navDestination, c<T> cVar) {
            x.f(navDestination, "<this>");
            x.f(cVar, "route");
            return RouteSerializerKt.generateHashCode(p.a(cVar)) == navDestination.getId();
        }

        protected final <C> Class<? extends C> parseClassFromName(Context context, String str, Class<? extends C> cls) {
            String strConcat;
            x.f(context, "context");
            x.f(str, HintConstants.AUTOFILL_HINT_NAME);
            x.f(cls, "expectedClassType");
            if (str.charAt(0) == '.') {
                String packageName = context.getPackageName();
                Objects.toString(str);
                strConcat = String.valueOf(packageName).concat(String.valueOf(str));
            } else {
                strConcat = str;
            }
            Class<? extends C> cls2 = (Class) NavDestination.classes.get(strConcat);
            if (cls2 == null) {
                try {
                    cls2 = (Class<? extends C>) Class.forName(strConcat, true, context.getClassLoader());
                    NavDestination.classes.put(str, cls2);
                } catch (ClassNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            }
            x.c(cls2);
            if (cls.isAssignableFrom(cls2)) {
                return cls2;
            }
            throw new IllegalArgumentException(((Object) strConcat) + " must be a subclass of " + cls);
        }

        public final <C> Class<? extends C> parseClassFromNameInternal(Context context, String str, Class<? extends C> cls) {
            x.f(context, "context");
            x.f(str, HintConstants.AUTOFILL_HINT_NAME);
            x.f(cls, "expectedClassType");
            return NavDestination.parseClassFromName(context, str, cls);
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }

        public static /* synthetic */ void getHierarchy$annotations(NavDestination navDestination) {
        }

        public final /* synthetic */ <T> boolean hasRoute(NavDestination navDestination) {
            x.f(navDestination, "<this>");
            x.i();
            int i2 = ar.f48106a;
            return hasRoute(navDestination, new m(Object.class));
        }
    }

    public static final <T> boolean hasRoute(NavDestination navDestination, c<T> cVar) {
        return Companion.hasRoute(navDestination, cVar);
    }

    public static final String getDisplayName(NavContext navContext, int i2) {
        return Companion.getDisplayName(navContext, i2);
    }

    public boolean hasDeepLink(NavDeepLinkRequest navDeepLinkRequest) {
        x.f(navDeepLinkRequest, "deepLinkRequest");
        return matchDeepLink(navDeepLinkRequest) != null;
    }

    public final void addDeepLink(NavDeepLink navDeepLink) {
        x.f(navDeepLink, "navDeepLink");
        this.impl.addDeepLink$navigation_common(navDeepLink);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavDestination(Navigator<? extends NavDestination> navigator) {
        this(NavigatorProvider.Companion.getNameForNavigator$navigation_common(navigator.getClass()));
        x.f(navigator, "navigator");
    }

    public final void putAction(int i2, int i3) {
        putAction(i2, new NavAction(i3, null, null, 6, null));
    }

    public final int[] buildDeepLinkIds() {
        return buildDeepLinkIds$default(this, null, 1, null);
    }
}
