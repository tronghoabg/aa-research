package zg;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.MediaType;

/* loaded from: classes5.dex */
public final class O {

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f48561x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f48562y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: a, reason: collision with root package name */
    public final T f48563a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f48564b;

    /* renamed from: c, reason: collision with root package name */
    public final Annotation[] f48565c;

    /* renamed from: d, reason: collision with root package name */
    public final Annotation[][] f48566d;

    /* renamed from: e, reason: collision with root package name */
    public final Type[] f48567e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f48568f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f48569g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f48570h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f48571i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f48572j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f48573l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f48574m;

    /* renamed from: n, reason: collision with root package name */
    public String f48575n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f48576o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f48577p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f48578q;

    /* renamed from: r, reason: collision with root package name */
    public String f48579r;

    /* renamed from: s, reason: collision with root package name */
    public Headers f48580s;

    /* renamed from: t, reason: collision with root package name */
    public MediaType f48581t;

    /* renamed from: u, reason: collision with root package name */
    public LinkedHashSet f48582u;

    /* renamed from: v, reason: collision with root package name */
    public a0[] f48583v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f48584w;

    public O(T t10, Method method) {
        this.f48563a = t10;
        this.f48564b = method;
        this.f48565c = method.getAnnotations();
        this.f48567e = method.getGenericParameterTypes();
        this.f48566d = method.getParameterAnnotations();
    }

    public static Class a(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    public final void b(String str, String str2, boolean z2) {
        String str3 = this.f48575n;
        Method method = this.f48564b;
        if (str3 != null) {
            throw a0.j(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f48575n = str;
        this.f48576o = z2;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = f48561x;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw a0.j(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.f48579r = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f48582u = linkedHashSet;
    }

    public final void c(int i5, Type type) {
        if (a0.h(type)) {
            throw a0.k(this.f48564b, i5, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
