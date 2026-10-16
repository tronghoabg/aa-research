package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.BundleKt;
import androidx.navigation.NavArgument;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavOptions;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import h.a.r;
import h.g.b.x;
import h.k;
import h.n.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class NavInflater {
    public static final String APPLICATION_ID_PLACEHOLDER = "${applicationId}";
    private static final String TAG_ACTION = "action";
    private static final String TAG_ARGUMENT = "argument";
    private static final String TAG_DEEP_LINK = "deepLink";
    private static final String TAG_INCLUDE = "include";
    private final Context context;
    private final NavigatorProvider navigatorProvider;
    public static final Companion Companion = new Companion(null);
    private static final ThreadLocal<TypedValue> sTmpValue = new ThreadLocal<>();

    public NavInflater(Context context, NavigatorProvider navigatorProvider) {
        x.f(context, "context");
        x.f(navigatorProvider, "navigatorProvider");
        this.context = context;
        this.navigatorProvider = navigatorProvider;
    }

    private final NavDestination inflate(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i2) throws XmlPullParserException {
        int depth;
        String name = xmlResourceParser.getName();
        x.e(name, "getName(...)");
        NavDestination navDestinationCreateDestination = this.navigatorProvider.getNavigator(name).createDestination();
        navDestinationCreateDestination.onInflate(this.context, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (x.n(TAG_ARGUMENT, name2)) {
                    this.inflateArgumentForDestination(resources, navDestinationCreateDestination, attributeSet, i2);
                } else if (x.n(TAG_DEEP_LINK, name2)) {
                    this.inflateDeepLink(resources, navDestinationCreateDestination, attributeSet);
                } else if (x.n(TAG_ACTION, name2)) {
                    this.inflateAction(resources, navDestinationCreateDestination, attributeSet, xmlResourceParser, i2);
                } else {
                    NavInflater navInflater = this;
                    Resources resources2 = resources;
                    XmlResourceParser xmlResourceParser2 = xmlResourceParser;
                    AttributeSet attributeSet2 = attributeSet;
                    int i3 = i2;
                    if (x.n(TAG_INCLUDE, name2) && (navDestinationCreateDestination instanceof NavGraph)) {
                        TypedArray typedArrayObtainAttributes = resources2.obtainAttributes(attributeSet2, R.styleable.NavInclude);
                        x.e(typedArrayObtainAttributes, "obtainAttributes(...)");
                        ((NavGraph) navDestinationCreateDestination).addDestination(navInflater.inflate(typedArrayObtainAttributes.getResourceId(R.styleable.NavInclude_graph, 0)));
                        typedArrayObtainAttributes.recycle();
                    } else if (navDestinationCreateDestination instanceof NavGraph) {
                        ((NavGraph) navDestinationCreateDestination).addDestination(navInflater.inflate(resources2, xmlResourceParser2, attributeSet2, i3));
                    }
                    this = navInflater;
                    resources = resources2;
                    attributeSet = attributeSet2;
                    xmlResourceParser = xmlResourceParser2;
                    i2 = i3;
                }
            }
        }
        return navDestinationCreateDestination;
    }

    private final void inflateAction(Resources resources, NavDestination navDestination, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i2) throws XmlPullParserException {
        k[] kVarArr;
        int depth;
        int[] iArr = androidx.navigation.common.R.styleable.NavAction;
        x.e(iArr, "NavAction");
        TypedArray typedArrayObtainStyledAttributes = this.context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        x.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_android_id, 0);
        NavAction navAction = new NavAction(typedArrayObtainStyledAttributes.getResourceId(1, 0), null, null, 6, null);
        NavOptions.Builder builder = new NavOptions.Builder();
        builder.setLaunchSingleTop(typedArrayObtainStyledAttributes.getBoolean(4, false));
        builder.setRestoreState(typedArrayObtainStyledAttributes.getBoolean(10, false));
        builder.setPopUpTo(typedArrayObtainStyledAttributes.getResourceId(7, -1), typedArrayObtainStyledAttributes.getBoolean(8, false), typedArrayObtainStyledAttributes.getBoolean(9, false));
        builder.setEnterAnim(typedArrayObtainStyledAttributes.getResourceId(2, -1));
        builder.setExitAnim(typedArrayObtainStyledAttributes.getResourceId(3, -1));
        builder.setPopEnterAnim(typedArrayObtainStyledAttributes.getResourceId(5, -1));
        builder.setPopExitAnim(typedArrayObtainStyledAttributes.getResourceId(6, -1));
        navAction.setNavOptions(builder.build());
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
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && x.n(TAG_ARGUMENT, xmlResourceParser.getName())) {
                inflateArgumentForBundle(resources, bundleBundleOf, attributeSet, i2);
            }
        }
        SavedStateReader.m13269constructorimpl(bundleBundleOf);
        if (!SavedStateReader.m13347isEmptyimpl(bundleBundleOf)) {
            navAction.setDefaultArguments(bundleBundleOf);
        }
        navDestination.putAction(resourceId, navAction);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final NavArgument inflateArgument(TypedArray typedArray, Resources resources, int i2) throws XmlPullParserException {
        NavArgument.Builder builder = new NavArgument.Builder();
        int[] iArr = androidx.navigation.common.R.styleable.Capability;
        builder.setIsNullable(typedArray.getBoolean(3, false));
        ThreadLocal<TypedValue> threadLocal = sTmpValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        String string = typedArray.getString(2);
        Object value = null;
        NavType<?> navTypeM = string != null ? NavInflater$$ExternalSyntheticDesugaredLibraryBridge0.m(NavType.Companion, string, resources.getResourcePackageName(i2)) : null;
        if (typedArray.getValue(1, typedValue2)) {
            if (navTypeM == NavType.ReferenceType) {
                if (typedValue2.resourceId != 0) {
                    value = Integer.valueOf(typedValue2.resourceId);
                } else {
                    if (typedValue2.type != 16 || typedValue2.data != 0) {
                        CharSequence charSequence = typedValue2.string;
                        throw new XmlPullParserException("unsupported value '" + ((Object) charSequence) + "' for " + navTypeM.getName() + ". Must be a reference to a resource.");
                    }
                    value = 0;
                }
            } else if (typedValue2.resourceId != 0) {
                if (navTypeM != null) {
                    CharSequence charSequence2 = typedValue2.string;
                    throw new XmlPullParserException("unsupported value '" + ((Object) charSequence2) + "' for " + navTypeM.getName() + ". You must use a \"" + NavType.ReferenceType.getName() + "\" type to reference other resources.");
                }
                navTypeM = NavType.ReferenceType;
                value = Integer.valueOf(typedValue2.resourceId);
            } else if (navTypeM == NavType.StringType) {
                value = typedArray.getString(1);
            } else {
                int i3 = typedValue2.type;
                if (i3 == 3) {
                    String string2 = typedValue2.string.toString();
                    if (navTypeM == null) {
                        navTypeM = NavType.Companion.inferFromValue(string2);
                    }
                    value = navTypeM.parseValue(string2);
                } else if (i3 == 4) {
                    navTypeM = Companion.checkNavType$navigation_runtime(typedValue2, navTypeM, NavType.FloatType, string, TypedValues.Custom.S_FLOAT);
                    value = Float.valueOf(typedValue2.getFloat());
                } else if (i3 == 5) {
                    navTypeM = Companion.checkNavType$navigation_runtime(typedValue2, navTypeM, NavType.IntType, string, TypedValues.Custom.S_DIMENSION);
                    value = Integer.valueOf((int) typedValue2.getDimension(resources.getDisplayMetrics()));
                } else if (i3 == 18) {
                    navTypeM = Companion.checkNavType$navigation_runtime(typedValue2, navTypeM, NavType.BoolType, string, TypedValues.Custom.S_BOOLEAN);
                    value = Boolean.valueOf(typedValue2.data != 0);
                } else {
                    if (typedValue2.type < 16 || typedValue2.type > 31) {
                        throw new XmlPullParserException("unsupported argument type " + typedValue2.type);
                    }
                    NavType<Float> navType = NavType.FloatType;
                    if (navTypeM == navType) {
                        navTypeM = Companion.checkNavType$navigation_runtime(typedValue2, navTypeM, navType, string, TypedValues.Custom.S_FLOAT);
                        value = Float.valueOf(typedValue2.data);
                    } else {
                        navTypeM = Companion.checkNavType$navigation_runtime(typedValue2, navTypeM, NavType.IntType, string, TypedValues.Custom.S_INT);
                        value = Integer.valueOf(typedValue2.data);
                    }
                }
            }
        }
        if (value != null) {
            builder.setDefaultValue(value);
        }
        if (navTypeM != null) {
            builder.setType(navTypeM);
        }
        return builder.build();
    }

    private final void inflateArgumentForBundle(Resources resources, Bundle bundle, AttributeSet attributeSet, int i2) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavArgument);
        x.e(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(androidx.navigation.common.R.styleable.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        NavArgument navArgumentInflateArgument = inflateArgument(typedArrayObtainAttributes, resources, i2);
        if (navArgumentInflateArgument.isDefaultValuePresent()) {
            navArgumentInflateArgument.putDefaultValue(string, bundle);
        }
        typedArrayObtainAttributes.recycle();
    }

    private final void inflateArgumentForDestination(Resources resources, NavDestination navDestination, AttributeSet attributeSet, int i2) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavArgument);
        x.e(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(androidx.navigation.common.R.styleable.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        navDestination.addArgument(string, inflateArgument(typedArrayObtainAttributes, resources, i2));
        typedArrayObtainAttributes.recycle();
    }

    private final void inflateDeepLink(Resources resources, NavDestination navDestination, AttributeSet attributeSet) throws XmlPullParserException {
        String str;
        String str2;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavDeepLink);
        x.e(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(3);
        String string2 = typedArrayObtainAttributes.getString(1);
        String string3 = typedArrayObtainAttributes.getString(2);
        String str3 = string;
        if ((str3 == null || str3.length() == 0) && (((str = string2) == null || str.length() == 0) && ((str2 = string3) == null || str2.length() == 0))) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        NavDeepLink.Builder builder = new NavDeepLink.Builder();
        if (string != null) {
            String packageName = this.context.getPackageName();
            x.e(packageName, "getPackageName(...)");
            builder.setUriPattern(o.ac(string, APPLICATION_ID_PLACEHOLDER, packageName));
        }
        String str4 = string2;
        if (str4 != null && str4.length() != 0) {
            String packageName2 = this.context.getPackageName();
            x.e(packageName2, "getPackageName(...)");
            builder.setAction(o.ac(string2, APPLICATION_ID_PLACEHOLDER, packageName2));
        }
        if (string3 != null) {
            String packageName3 = this.context.getPackageName();
            x.e(packageName3, "getPackageName(...)");
            builder.setMimeType(o.ac(string3, APPLICATION_ID_PLACEHOLDER, packageName3));
        }
        navDestination.addDeepLink(builder.build());
        typedArrayObtainAttributes.recycle();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final NavType<?> checkNavType$navigation_runtime(TypedValue typedValue, NavType<?> navType, NavType<?> navType2, String str, String str2) throws XmlPullParserException {
            x.f(typedValue, "value");
            x.f(navType2, "expectedNavType");
            x.f(str2, "foundType");
            if (navType == null || navType == navType2) {
                return navType == null ? navType2 : navType;
            }
            throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    public final NavGraph inflate(int i2) {
        int next;
        Resources resources = this.context.getResources();
        XmlResourceParser xml = resources.getXml(i2);
        x.e(xml, "getXml(...)");
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        String name = xml.getName();
                        if (resources == null) {
                            x.g();
                        }
                        if (attributeSetAsAttributeSet == null) {
                            x.g();
                        }
                        NavDestination navDestinationInflate = inflate(resources, xml, attributeSetAsAttributeSet, i2);
                        if (navDestinationInflate instanceof NavGraph) {
                            return (NavGraph) navDestinationInflate;
                        }
                        throw new IllegalArgumentException("Root element <" + name + "> did not inflate into a NavGraph");
                    }
                } catch (Exception e2) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i2) + " line " + xml.getLineNumber(), e2);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }
}
