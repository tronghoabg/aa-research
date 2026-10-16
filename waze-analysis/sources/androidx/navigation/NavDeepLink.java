package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.autofill.HintConstants;
import androidx.core.os.BundleKt;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.navigation.serialization.RouteSerializerKt;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import h.a.i;
import h.a.r;
import h.ab;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.ar;
import h.g.b.x;
import h.h;
import h.k;
import h.l.c;
import h.l.s;
import h.n.l;
import h.n.m;
import h.n.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlinx.b.p;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NavDeepLink {
    private static final String ANY_SYMBOLS_IN_THE_TAIL = "([\\s\\S]+?)?";
    private final String action;
    private final f fragArgs$delegate;
    private final f fragArgsAndRegex$delegate;
    private final f fragPattern$delegate;
    private final f fragRegex$delegate;
    private boolean isExactDeepLink;
    private final f isParameterizedQuery$delegate;
    private boolean isSingleQueryParamValueOnly;
    private final String mimeType;
    private final f mimeTypePattern$delegate;
    private String mimeTypeRegex;
    private final List<String> pathArgs;
    private final f pathPattern$delegate;
    private String pathRegex;
    private final f queryArgsMap$delegate;
    private final String uriPattern;
    private static final Companion Companion = new Companion(null);
    private static final l SCHEME_PATTERN = new l("^[a-zA-Z]+[+\\w\\-.]*:");
    private static final l FILL_IN_PATTERN = new l("\\{(.+?)\\}");
    private static final l SCHEME_REGEX = new l("http[s]?://");
    private static final l WILDCARD_REGEX = new l(".*");
    private static final l PATH_REGEX = new l("([^/]*?|)");
    private static final l QUERY_PATTERN = new l("^[^?#]+\\?([^#]*).*");

    /* compiled from: WazeSource */
    final class MimeType implements Comparable<MimeType> {
        private String subType;
        private String type;

        public MimeType(String str) {
            List listH;
            x.f(str, "mimeType");
            List listJ = new l(DomExceptionUtils.SEPARATOR).j(str);
            if (listJ.isEmpty()) {
                listH = i.h();
            } else {
                ListIterator listIterator = listJ.listIterator(listJ.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listH = i.am(listJ, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listH = i.h();
            }
            this.type = (String) listH.get(0);
            this.subType = (String) listH.get(1);
        }

        @Override // java.lang.Comparable
        public int compareTo(MimeType mimeType) {
            x.f(mimeType, "other");
            int i2 = true != x.n(this.type, mimeType.type) ? 0 : 2;
            return x.n(this.subType, mimeType.subType) ? i2 + 1 : i2;
        }

        public final String getSubType() {
            return this.subType;
        }

        public final String getType() {
            return this.type;
        }

        public final void setSubType(String str) {
            x.f(str, "<set-?>");
            this.subType = str;
        }

        public final void setType(String str) {
            x.f(str, "<set-?>");
            this.type = str;
        }
    }

    /* compiled from: WazeSource */
    final class ParamQuery {
        private final List<String> arguments = new ArrayList();
        private String paramRegex;

        public final void addArgumentName(String str) {
            x.f(str, HintConstants.AUTOFILL_HINT_NAME);
            this.arguments.add(str);
        }

        public final String getArgumentName(int i2) {
            return this.arguments.get(i2);
        }

        public final List<String> getArguments() {
            return this.arguments;
        }

        public final String getParamRegex() {
            return this.paramRegex;
        }

        public final void setParamRegex(String str) {
            this.paramRegex = str;
        }

        public final int size() {
            return this.arguments.size();
        }
    }

    public NavDeepLink(String str, String str2, String str3) {
        this.uriPattern = str;
        this.action = str2;
        this.mimeType = str3;
        this.pathArgs = new ArrayList();
        this.pathPattern$delegate = g.a(new a() { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return NavDeepLink.pathPattern_delegate$lambda$0(this.f$0);
            }
        });
        this.isParameterizedQuery$delegate = g.a(new a() { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$0(this.f$0));
            }
        });
        h hVar = h.f48132c;
        this.queryArgsMap$delegate = g.b(hVar, new a() { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.parseQuery();
            }
        });
        this.fragArgsAndRegex$delegate = g.b(hVar, new a() { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.parseFragment();
            }
        });
        this.fragArgs$delegate = g.b(hVar, new a() { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                return NavDeepLink.fragArgs_delegate$lambda$0(this.f$0);
            }
        });
        this.fragRegex$delegate = g.b(hVar, new a() { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda5
            @Override // h.g.a.a
            public final Object invoke() {
                return NavDeepLink.fragRegex_delegate$lambda$0(this.f$0);
            }
        });
        this.fragPattern$delegate = g.a(new a() { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda6
            @Override // h.g.a.a
            public final Object invoke() {
                return NavDeepLink.fragPattern_delegate$lambda$0(this.f$0);
            }
        });
        this.mimeTypePattern$delegate = g.a(new a() { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda7
            @Override // h.g.a.a
            public final Object invoke() {
                return NavDeepLink.mimeTypePattern_delegate$lambda$0(this.f$0);
            }
        });
        parsePath();
        parseMime();
    }

    private final void buildRegex(String str, List<String> list, StringBuilder sb) {
        int iB = 0;
        for (h.n.g gVarH = l.h(FILL_IN_PATTERN, str); gVarH != null; gVarH = gVarH.d()) {
            h.n.f fVarA = gVarH.e().a(1);
            x.c(fVarA);
            list.add(fVarA.a());
            if (gVarH.c().a() > iB) {
                String strSubstring = str.substring(iB, gVarH.c().a());
                x.e(strSubstring, "substring(...)");
                sb.append(o.ao(strSubstring));
            }
            sb.append(PATH_REGEX.a());
            iB = gVarH.c().b() + 1;
        }
        if (iB < str.length()) {
            String strSubstring2 = str.substring(iB);
            x.e(strSubstring2, "substring(...)");
            sb.append(o.ao(strSubstring2));
        }
    }

    static final List fragArgs_delegate$lambda$0(NavDeepLink navDeepLink) {
        List list;
        k<List<String>, String> fragArgsAndRegex = navDeepLink.getFragArgsAndRegex();
        return (fragArgsAndRegex == null || (list = (List) fragArgsAndRegex.c()) == null) ? new ArrayList() : list;
    }

    static final l fragPattern_delegate$lambda$0(NavDeepLink navDeepLink) {
        String fragRegex = navDeepLink.getFragRegex();
        if (fragRegex != null) {
            return new l(fragRegex, m.f48251a);
        }
        return null;
    }

    static final String fragRegex_delegate$lambda$0(NavDeepLink navDeepLink) {
        k<List<String>, String> fragArgsAndRegex = navDeepLink.getFragArgsAndRegex();
        if (fragArgsAndRegex != null) {
            return (String) fragArgsAndRegex.d();
        }
        return null;
    }

    private final List<String> getFragArgs() {
        return (List) this.fragArgs$delegate.getValue();
    }

    private final k<List<String>, String> getFragArgsAndRegex() {
        return (k) this.fragArgsAndRegex$delegate.getValue();
    }

    private final l getFragPattern() {
        return (l) this.fragPattern$delegate.getValue();
    }

    private final String getFragRegex() {
        return (String) this.fragRegex$delegate.getValue();
    }

    static final boolean getMatchingArguments$lambda$0(Bundle bundle, String str) {
        x.f(str, "argName");
        SavedStateReader.m13269constructorimpl(bundle);
        return !SavedStateReader.m13270containsimpl(bundle, str);
    }

    private final boolean getMatchingPathArguments(h.n.g gVar, Bundle bundle, Map<String, NavArgument> map) {
        String strA;
        List<String> list = this.pathArgs;
        ArrayList arrayList = new ArrayList(i.q(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                i.p();
            }
            String str = (String) obj;
            h.n.f fVarA = gVar.e().a(i3);
            String strDecode = null;
            if (fVarA != null && (strA = fVarA.a()) != null) {
                strDecode = NavUriUtils.INSTANCE.decode(strA);
            }
            NavArgument navArgument = map.get(str);
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                parseArgument(bundle, str, strDecode, navArgument);
                arrayList.add(ab.f48028a);
                i2 = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean getMatchingQueryArguments(Uri uri, Bundle bundle, Map<String, NavArgument> map) {
        String query;
        for (Map.Entry<String, ParamQuery> entry : getQueryArgsMap().entrySet()) {
            String key = entry.getKey();
            ParamQuery value = entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(key);
            if (this.isSingleQueryParamValueOnly && (query = uri.getQuery()) != null && !x.n(query, uri.toString())) {
                queryParameters = i.d(query);
            }
            if (!parseInputParams(queryParameters, value, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    private final void getMatchingUriFragment(String str, Bundle bundle, Map<String, NavArgument> map) {
        h.n.g gVarE;
        String strA;
        l fragPattern = getFragPattern();
        if (fragPattern == null || (gVarE = fragPattern.e(String.valueOf(str))) == null) {
            return;
        }
        List<String> fragArgs = getFragArgs();
        ArrayList arrayList = new ArrayList(i.q(fragArgs, 10));
        int i2 = 0;
        for (Object obj : fragArgs) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                i.p();
            }
            String str2 = (String) obj;
            h.n.f fVarA = gVarE.e().a(i3);
            String strDecode = null;
            if (fVarA != null && (strA = fVarA.a()) != null) {
                strDecode = NavUriUtils.INSTANCE.decode(strA);
            }
            NavArgument navArgument = map.get(str2);
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                parseArgument(bundle, str2, strDecode, navArgument);
                arrayList.add(ab.f48028a);
                i2 = i3;
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
    }

    private final l getMimeTypePattern() {
        return (l) this.mimeTypePattern$delegate.getValue();
    }

    private final l getPathPattern() {
        return (l) this.pathPattern$delegate.getValue();
    }

    private final Map<String, ParamQuery> getQueryArgsMap() {
        return (Map) this.queryArgsMap$delegate.getValue();
    }

    private final boolean isParameterizedQuery() {
        return ((Boolean) this.isParameterizedQuery$delegate.getValue()).booleanValue();
    }

    static final boolean isParameterizedQuery_delegate$lambda$0(NavDeepLink navDeepLink) {
        String str = navDeepLink.uriPattern;
        return str != null && QUERY_PATTERN.g(str);
    }

    private final boolean matchAction(String str) {
        String str2 = this.action;
        if (str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return x.n(str2, str);
    }

    private final boolean matchMimeType(String str) {
        if (this.mimeType == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        l mimeTypePattern = getMimeTypePattern();
        x.c(mimeTypePattern);
        return mimeTypePattern.g(str);
    }

    private final boolean matchUri(Uri uri) {
        if (getPathPattern() == null) {
            return true;
        }
        if (uri == null) {
            return false;
        }
        l pathPattern = getPathPattern();
        x.c(pathPattern);
        return pathPattern.g(uri.toString());
    }

    static final l mimeTypePattern_delegate$lambda$0(NavDeepLink navDeepLink) {
        String str = navDeepLink.mimeTypeRegex;
        if (str != null) {
            return new l(str);
        }
        return null;
    }

    private final void parseArgument(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (navArgument != null) {
            navArgument.getType().parseAndPut(bundle, str, str2);
        } else {
            SavedStateWriter.m13355constructorimpl(bundle);
            SavedStateWriter.m13388putStringimpl(bundle, str, str2);
        }
    }

    private final boolean parseArgumentForRepeatedParam(Bundle bundle, String str, String str2, NavArgument navArgument) {
        SavedStateReader.m13269constructorimpl(bundle);
        if (!SavedStateReader.m13270containsimpl(bundle, str)) {
            return true;
        }
        if (navArgument == null) {
            return false;
        }
        NavType<Object> type = navArgument.getType();
        type.parseAndPut(bundle, str, str2, type.get(bundle, str));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k<List<String>, String> parseFragment() {
        String str = this.uriPattern;
        if (str == null || NavUriUtils.INSTANCE.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = NavUriUtils.INSTANCE.parse(this.uriPattern).getFragment();
        StringBuilder sb = new StringBuilder();
        x.c(fragment);
        buildRegex(fragment, arrayList, sb);
        return new k<>(arrayList, sb.toString());
    }

    private final boolean parseInputParams(List<String> list, ParamQuery paramQuery, Bundle bundle, Map<String, NavArgument> map) {
        k[] kVarArr;
        Object objValueOf;
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
        Iterator<T> it = paramQuery.getArguments().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            NavArgument navArgument = map.get(str);
            NavType<Object> type = navArgument != null ? navArgument.getType() : null;
            if ((type instanceof CollectionNavType) && !navArgument.isDefaultValuePresent()) {
                CollectionNavType collectionNavType = (CollectionNavType) type;
                collectionNavType.put(bundleBundleOf, str, collectionNavType.emptyCollection());
            }
        }
        for (String str2 : list) {
            String paramRegex = paramQuery.getParamRegex();
            h.n.g gVarE = paramRegex != null ? new l(paramRegex).e(str2) : null;
            if (gVarE == null) {
                return false;
            }
            List<String> arguments = paramQuery.getArguments();
            ArrayList arrayList2 = new ArrayList(i.q(arguments, 10));
            int i2 = 0;
            for (Object obj : arguments) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    i.p();
                }
                String str3 = (String) obj;
                h.n.f fVarA = gVarE.e().a(i3);
                String strA = fVarA != null ? fVarA.a() : null;
                NavArgument navArgument2 = map.get(str3);
                try {
                    SavedStateReader.m13269constructorimpl(bundleBundleOf);
                    boolean zM13270containsimpl = SavedStateReader.m13270containsimpl(bundleBundleOf, str3);
                    if (strA == null) {
                        strA = "";
                    }
                    if (zM13270containsimpl) {
                        objValueOf = Boolean.valueOf(parseArgumentForRepeatedParam(bundleBundleOf, str3, strA, navArgument2));
                    } else {
                        parseArgument(bundleBundleOf, str3, strA, navArgument2);
                        objValueOf = ab.f48028a;
                    }
                } catch (IllegalArgumentException unused) {
                    objValueOf = ab.f48028a;
                }
                arrayList2.add(objValueOf);
                i2 = i3;
            }
        }
        SavedStateWriter.m13355constructorimpl(bundle);
        SavedStateWriter.m13359putAllimpl(bundle, bundleBundleOf);
        return true;
    }

    private final void parseMime() {
        if (this.mimeType == null) {
            return;
        }
        boolean zG = new l("^[\\s\\S]+/[\\s\\S]+$").g(this.mimeType);
        String str = this.mimeType;
        if (!zG) {
            throw new IllegalArgumentException("The given mimeType " + str + " does not match to required \"type/subtype\" format");
        }
        MimeType mimeType = new MimeType(str);
        this.mimeTypeRegex = o.ac("^(" + mimeType.getType() + "|[*]+)/(" + mimeType.getSubType() + "|[*]+)$", "*|[*]", "[\\s\\S]");
    }

    private final void parsePath() {
        if (this.uriPattern == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        if (!SCHEME_PATTERN.f(this.uriPattern)) {
            sb.append(SCHEME_REGEX.a());
        }
        h.n.g gVarH = l.h(new l("(\\?|#|$)"), this.uriPattern);
        if (gVarH != null) {
            boolean z = false;
            String strSubstring = this.uriPattern.substring(0, gVarH.c().a());
            x.e(strSubstring, "substring(...)");
            buildRegex(strSubstring, this.pathArgs, sb);
            StringBuilder sb2 = sb;
            if (!WILDCARD_REGEX.f(sb2) && !PATH_REGEX.f(sb2)) {
                z = true;
            }
            this.isExactDeepLink = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        String string = sb.toString();
        x.e(string, "toString(...)");
        this.pathRegex = saveWildcardInRegex(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, ParamQuery> parseQuery() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (isParameterizedQuery()) {
            String str = this.uriPattern;
            NavUriUtils navUriUtils = NavUriUtils.INSTANCE;
            x.c(str);
            Uri uri = navUriUtils.parse(str);
            for (String str2 : uri.getQueryParameterNames()) {
                StringBuilder sb = new StringBuilder();
                List<String> queryParameters = uri.getQueryParameters(str2);
                if (queryParameters.size() > 1) {
                    throw new IllegalArgumentException("Query parameter " + str2 + " must only be present once in " + this.uriPattern + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                }
                String str3 = (String) i.R(queryParameters);
                if (str3 == null) {
                    this.isSingleQueryParamValueOnly = true;
                    str3 = str2;
                }
                ParamQuery paramQuery = new ParamQuery();
                int iB = 0;
                for (h.n.g gVarH = l.h(FILL_IN_PATTERN, str3); gVarH != null; gVarH = gVarH.d()) {
                    h.n.f fVarA = gVarH.e().a(1);
                    x.c(fVarA);
                    paramQuery.addArgumentName(fVarA.a());
                    if (gVarH.c().a() > iB) {
                        String strSubstring = str3.substring(iB, gVarH.c().a());
                        x.e(strSubstring, "substring(...)");
                        sb.append(o.ao(strSubstring));
                    }
                    sb.append(ANY_SYMBOLS_IN_THE_TAIL);
                    iB = gVarH.c().b() + 1;
                }
                if (iB < str3.length()) {
                    String strSubstring2 = str3.substring(iB);
                    x.e(strSubstring2, "substring(...)");
                    sb.append(o.ao(strSubstring2));
                }
                sb.append("$");
                String string = sb.toString();
                x.e(string, "toString(...)");
                paramQuery.setParamRegex(saveWildcardInRegex(string));
                linkedHashMap.put(str2, paramQuery);
            }
        }
        return linkedHashMap;
    }

    static final l pathPattern_delegate$lambda$0(NavDeepLink navDeepLink) {
        String str = navDeepLink.pathRegex;
        if (str != null) {
            return new l(str, m.f48251a);
        }
        return null;
    }

    private final String saveWildcardInRegex(String str) {
        String str2 = str;
        return (o.F(str2, "\\Q", false) && o.F(str2, "\\E", false)) ? o.ac(str, ".*", "\\E.*\\Q") : o.F(str2, "\\.\\*", false) ? o.ac(str, "\\.\\*", ".*") : str;
    }

    public final int calculateMatchingPathSegments$navigation_common(Uri uri) {
        String str;
        if (uri == null || (str = this.uriPattern) == null) {
            return 0;
        }
        return i.as(uri.getPathSegments(), NavUriUtils.INSTANCE.parse(str).getPathSegments()).size();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof NavDeepLink)) {
            NavDeepLink navDeepLink = (NavDeepLink) obj;
            if (x.n(this.uriPattern, navDeepLink.uriPattern) && x.n(this.action, navDeepLink.action) && x.n(this.mimeType, navDeepLink.mimeType)) {
                return true;
            }
        }
        return false;
    }

    public final String getAction() {
        return this.action;
    }

    public final List<String> getArgumentsNames$navigation_common() {
        List<String> list = this.pathArgs;
        Collection<ParamQuery> collectionValues = getQueryArgsMap().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            i.aD(arrayList, ((ParamQuery) it.next()).getArguments());
        }
        return i.af(i.af(list, arrayList), getFragArgs());
    }

    public final Bundle getMatchingArguments(Uri uri, Map<String, NavArgument> map) {
        h.n.g gVarE;
        k[] kVarArr;
        x.f(uri, "deepLink");
        x.f(map, "arguments");
        l pathPattern = getPathPattern();
        if (pathPattern == null || (gVarE = pathPattern.e(uri.toString())) == null) {
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
        final Bundle bundleBundleOf = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        SavedStateWriter.m13355constructorimpl(bundleBundleOf);
        if (!getMatchingPathArguments(gVarE, bundleBundleOf, map)) {
            return null;
        }
        if (isParameterizedQuery() && !getMatchingQueryArguments(uri, bundleBundleOf, map)) {
            return null;
        }
        getMatchingUriFragment(uri.getFragment(), bundleBundleOf, map);
        if (NavArgumentKt.missingRequiredArguments(map, new h.g.a.l() { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda8
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NavDeepLink.getMatchingArguments$lambda$0(bundleBundleOf, (String) obj));
            }
        }).isEmpty()) {
            return bundleBundleOf;
        }
        return null;
    }

    public final Bundle getMatchingPathAndQueryArgs$navigation_common(Uri uri, Map<String, NavArgument> map) {
        k[] kVarArr;
        l pathPattern;
        h.n.g gVarE;
        x.f(map, "arguments");
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
        if (uri != null && (pathPattern = getPathPattern()) != null && (gVarE = pathPattern.e(uri.toString())) != null) {
            getMatchingPathArguments(gVarE, bundleBundleOf, map);
            if (isParameterizedQuery()) {
                getMatchingQueryArguments(uri, bundleBundleOf, map);
            }
        }
        return bundleBundleOf;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final int getMimeTypeMatchRating(String str) {
        x.f(str, "mimeType");
        if (this.mimeType == null) {
            return -1;
        }
        l mimeTypePattern = getMimeTypePattern();
        x.c(mimeTypePattern);
        if (mimeTypePattern.g(str)) {
            return new MimeType(this.mimeType).compareTo(new MimeType(str));
        }
        return -1;
    }

    public final String getUriPattern() {
        return this.uriPattern;
    }

    public int hashCode() {
        String str = this.uriPattern;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.action;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = iHashCode * 31;
        String str3 = this.mimeType;
        return ((i2 + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isExactDeepLink() {
        return this.isExactDeepLink;
    }

    public final boolean matches$navigation_common(NavDeepLinkRequest navDeepLinkRequest) {
        x.f(navDeepLinkRequest, "deepLinkRequest");
        return matchUri(navDeepLinkRequest.getUri()) && matchAction(navDeepLinkRequest.getAction()) && matchMimeType(navDeepLinkRequest.getMimeType());
    }

    public final void setExactDeepLink$navigation_common(boolean z) {
        this.isExactDeepLink = z;
    }

    /* compiled from: WazeSource */
    public final class Builder {
        public static final Companion Companion = new Companion(null);
        private String action;
        private String mimeType;
        private String uriPattern;

        public static final Builder fromAction(String str) {
            return Companion.fromAction(str);
        }

        public static final Builder fromMimeType(String str) {
            return Companion.fromMimeType(str);
        }

        public static final Builder fromUriPattern(String str) {
            return Companion.fromUriPattern(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder setUriPattern$default(Builder builder, String str, Map map, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                map = r.j();
            }
            x.f(str, "basePath");
            x.f(map, "typeMap");
            x.i();
            int i3 = ar.f48106a;
            builder.setUriPattern(new h.g.b.m(Object.class), str, map);
            return builder;
        }

        public final NavDeepLink build() {
            return new NavDeepLink(this.uriPattern, this.action, this.mimeType);
        }

        public final Builder setAction(String str) {
            x.f(str, "action");
            if (str.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.action = str;
            return this;
        }

        public final Builder setMimeType(String str) {
            x.f(str, "mimeType");
            this.mimeType = str;
            return this;
        }

        public final <T> Builder setUriPattern(c<T> cVar, String str, Map<s, NavType> map) {
            x.f(cVar, "route");
            x.f(str, "basePath");
            x.f(map, "typeMap");
            this.uriPattern = RouteSerializerKt.generateRoutePattern(p.a(cVar), map, str);
            return this;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Builder fromUriPattern$default(Companion companion, String str, Map map, int i2, Object obj) {
                if ((i2 & 2) != 0) {
                    map = r.j();
                }
                x.f(str, "basePath");
                x.f(map, "typeMap");
                Builder builder = new Builder();
                x.i();
                int i3 = ar.f48106a;
                builder.setUriPattern(new h.g.b.m(Object.class), str, map);
                return builder;
            }

            public final Builder fromAction(String str) {
                x.f(str, "action");
                if (str.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                }
                Builder builder = new Builder();
                builder.setAction(str);
                return builder;
            }

            public final Builder fromMimeType(String str) {
                x.f(str, "mimeType");
                Builder builder = new Builder();
                builder.setMimeType(str);
                return builder;
            }

            public final /* synthetic */ <T> Builder fromUriPattern(String str, Map<s, NavType<?>> map) {
                x.f(str, "basePath");
                x.f(map, "typeMap");
                Builder builder = new Builder();
                x.i();
                int i2 = ar.f48106a;
                builder.setUriPattern(new h.g.b.m(Object.class), str, map);
                return builder;
            }

            public /* synthetic */ Companion(h.g.b.o oVar) {
                this();
            }

            public final Builder fromUriPattern(String str) {
                x.f(str, "uriPattern");
                Builder builder = new Builder();
                builder.setUriPattern(str);
                return builder;
            }
        }

        public final Builder setUriPattern(String str) {
            x.f(str, "uriPattern");
            this.uriPattern = str;
            return this;
        }

        public final <T> Builder setUriPattern(c<T> cVar, String str) {
            x.f(cVar, "route");
            x.f(str, "basePath");
            setUriPattern$default(this, cVar, str, null, 4, null);
            return this;
        }

        public final /* synthetic */ <T> Builder setUriPattern(String str, Map<s, NavType<?>> map) {
            x.f(str, "basePath");
            x.f(map, "typeMap");
            x.i();
            int i2 = ar.f48106a;
            setUriPattern(new h.g.b.m(Object.class), str, map);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder setUriPattern$default(Builder builder, c cVar, String str, Map map, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                map = r.j();
            }
            builder.setUriPattern(cVar, str, map);
            return builder;
        }
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    public final boolean matches$navigation_common(Uri uri) {
        x.f(uri, "uri");
        return matches$navigation_common(new NavDeepLinkRequest(uri, null, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDeepLink(String str) {
        this(str, null, null);
        x.f(str, "uri");
    }
}
