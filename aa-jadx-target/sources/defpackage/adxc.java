package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adxc extends defpackage.admp {
    private static final adxu C;
    private static final defpackage.adku D;
    private static final defpackage.adkf E;
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.adxc.class.getName());
    static final long b;
    public static final long c;
    static final java.util.regex.Pattern d;
    public static final java.lang.reflect.Method e;
    public final adwx A;
    final defpackage.aeao B = new defpackage.aeao();
    public adxu f;
    public final adxu g;
    public final java.util.List h;
    public defpackage.adnu i;
    final java.util.List j;
    public final java.lang.String k;
    public java.util.IdentityHashMap l;
    final java.lang.String m;
    final defpackage.adku n;
    final defpackage.adkf o;
    public long p;
    public boolean q;
    final defpackage.adlk r;
    public java.util.Map s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    final java.util.List y;
    public final adwy z;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        b = 1800000L;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.SECONDS;
        c = 1000L;
        C = new defpackage.aeas(defpackage.adve.o, 0);
        D = defpackage.adku.b;
        E = defpackage.adkf.a;
        d = java.util.regex.Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
        java.lang.reflect.Method declaredMethod = null;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("adrt");
            java.lang.Class<?> cls2 = java.lang.Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (java.lang.ClassNotFoundException e2) {
            a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (java.lang.Throwable) e2);
        } catch (java.lang.NoSuchMethodException e3) {
            a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (java.lang.Throwable) e3);
        }
        e = declaredMethod;
    }

    public adxc(java.net.SocketAddress socketAddress, java.lang.String str, adwy adwyVar) {
        adxu adxuVar = C;
        this.f = adxuVar;
        this.g = adxuVar;
        this.h = new java.util.ArrayList();
        this.i = defpackage.adnu.b();
        this.j = new java.util.ArrayList();
        this.m = "pick_first";
        this.n = D;
        this.o = E;
        this.p = b;
        this.q = true;
        this.r = defpackage.adlk.b;
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = true;
        this.y = new java.util.ArrayList();
        this.k = b(socketAddress);
        this.z = adwyVar;
        defpackage.adnu adnuVar = new defpackage.adnu();
        adnuVar.e(new defpackage.adxa(socketAddress, str));
        this.i = adnuVar;
        this.A = new aebr();
        defpackage.adrs.B();
    }

    static java.lang.String b(java.net.SocketAddress socketAddress) {
        try {
            return new java.net.URI("directaddress", "", defpackage.a.bX(socketAddress, "/"), null).toString();
        } catch (java.net.URISyntaxException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public static java.util.Map c(java.util.Map map) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            defpackage.ysr.bc(entry.getKey() instanceof java.lang.String, "The key of the entry '%s' is not of String type", entry);
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value == null) {
                linkedHashMap.put(str, null);
            } else if (value instanceof java.util.Map) {
                linkedHashMap.put(str, c((java.util.Map) value));
            } else if (value instanceof java.util.List) {
                linkedHashMap.put(str, f((java.util.List) value));
            } else if (value instanceof java.lang.String) {
                linkedHashMap.put(str, value);
            } else if (value instanceof java.lang.Number) {
                linkedHashMap.put(str, java.lang.Double.valueOf(((java.lang.Number) value).doubleValue()));
            } else {
                if (!(value instanceof java.lang.Boolean)) {
                    throw new java.lang.IllegalArgumentException("The value of the map entry '" + java.lang.String.valueOf(entry) + "' is of type '" + java.lang.String.valueOf(value.getClass()) + "', which is not supported");
                }
                linkedHashMap.put(str, value);
            }
        }
        return j$.util.DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static defpackage.aecg d(java.lang.String str, defpackage.adnu adnuVar) {
        java.net.URI uri;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            uri = new java.net.URI(str);
        } catch (java.net.URISyntaxException e2) {
            sb.append(e2.getMessage());
            uri = null;
        }
        defpackage.adnt adntVarA = uri != null ? adnuVar.a(uri.getScheme()) : null;
        if (adntVarA == null && !d.matcher(str).matches()) {
            try {
                java.net.URI uri2 = new java.net.URI(adnuVar.c(), "", defpackage.a.bA(str, "/"), null);
                uri = uri2;
                adntVarA = adnuVar.a(uri2.getScheme());
            } catch (java.net.URISyntaxException e3) {
                throw new java.lang.IllegalArgumentException(e3);
            }
        }
        if (adntVarA == null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Could not find a NameResolverProvider for %s%s", str, sb.length() > 0 ? defpackage.a.bV(sb, " (", ")") : ""));
        }
        return new defpackage.aecg(new aebe(uri), adntVarA, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: xzp */
    /* JADX WARN: Multi-variable type inference failed */
    public static defpackage.aecg e(java.lang.String str, defpackage.adnu adnuVar) throws xzp {
        char c2;
        defpackage.adpa adpaVarA;
        int i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i2 = 0;
        try {
            try {
                java.util.BitSet bitSet = defpackage.adpa.a;
                try {
                    defpackage.tk tkVar = new defpackage.tk();
                    int length = str.length();
                    int i3 = 0;
                    while (true) {
                        i = -1;
                        if (i3 < length) {
                            char cCharAt = str.charAt(i3);
                            if (cCharAt == ':') {
                                break;
                            }
                            if (cCharAt != '/' && cCharAt != '?' && cCharAt != '#') {
                                i3++;
                            }
                            throw new java.net.URISyntaxException(str, e.getMessage());
                        }
                        i3 = -1;
                        break;
                    }
                    try {
                        if (i3 < 0) {
                            throw new java.lang.IllegalArgumentException("Missing required scheme.");
                        }
                        tkVar.e(str.substring(0, i3));
                        int i4 = i3 + 1;
                        int i5 = i3 + 2;
                        if (i5 < length) {
                            c2 = 1;
                            try {
                                if (str.charAt(i4) == '/' && str.charAt(i5) == '/') {
                                    int i6 = i3 + 3;
                                    i4 = i6;
                                    while (i4 < length) {
                                        char cCharAt2 = str.charAt(i4);
                                        if (cCharAt2 == '/' || cCharAt2 == '?' || cCharAt2 == '#') {
                                            break;
                                            break;
                                            break;
                                        }
                                        i4++;
                                    }
                                    java.lang.String strSubstring = str.substring(i6, i4);
                                    if (strSubstring == null) {
                                        tkVar.f();
                                        tkVar.b(null);
                                        tkVar.c();
                                        i2 = 0;
                                    } else {
                                        int iIndexOf = strSubstring.indexOf(64);
                                        if (iIndexOf >= 0) {
                                            java.lang.String strSubstring2 = strSubstring.substring(0, iIndexOf);
                                            defpackage.adpa.e(strSubstring2, "userInfo", defpackage.adpa.f, null);
                                            tkVar.f = strSubstring2;
                                        } else {
                                            tkVar.f();
                                        }
                                        int i7 = iIndexOf >= 0 ? iIndexOf + 1 : i2;
                                        for (int length2 = strSubstring.length() - 1; length2 >= i7; length2--) {
                                            char cCharAt3 = strSubstring.charAt(length2);
                                            if (cCharAt3 == ':') {
                                                i = length2;
                                                break;
                                            }
                                            if (cCharAt3 == ']' || !defpackage.adpa.a.get(cCharAt3)) {
                                                break;
                                                break;
                                            }
                                        }
                                        if (i < 0) {
                                            tkVar.d(strSubstring.substring(i7));
                                            tkVar.c();
                                        } else {
                                            tkVar.d(strSubstring.substring(i7, i));
                                            java.lang.String strSubstring3 = strSubstring.substring(i + 1);
                                            if (strSubstring3 != null && !strSubstring3.isEmpty()) {
                                                try {
                                                    java.lang.Integer.parseInt(strSubstring3);
                                                } catch (java.lang.NumberFormatException e2) {
                                                    throw new java.lang.IllegalArgumentException("Invalid port", e2);
                                                }
                                            }
                                            tkVar.a = strSubstring3;
                                        }
                                    }
                                } else {
                                    i2 = 0;
                                }
                            } catch (java.lang.IllegalArgumentException e3) {
                                e = e3;
                            } catch (java.net.URISyntaxException e4) {
                                e = e4;
                                sb.append(e.getMessage());
                                adpaVarA = null;
                            }
                        } else {
                            i2 = 0;
                            c2 = 1;
                        }
                        int i8 = i4;
                        while (i8 < length) {
                            char cCharAt4 = str.charAt(i8);
                            if (cCharAt4 == '?' || cCharAt4 == '#') {
                                break;
                                break;
                            }
                            i8++;
                        }
                        java.lang.String strSubstring4 = str.substring(i4, i8);
                        defpackage.ysr.aY(strSubstring4 != null ? c2 : i2, "Path can be empty but not null");
                        defpackage.adpa.d(strSubstring4, null);
                        tkVar.b = strSubstring4;
                        if (i8 < length && str.charAt(i8) == '?') {
                            int i9 = i8 + 1;
                            int i10 = i9;
                            while (i10 < length && str.charAt(i10) != '#') {
                                i10++;
                            }
                            java.lang.String strSubstring5 = str.substring(i9, i10);
                            if (strSubstring5 != null) {
                                defpackage.adpa.e(strSubstring5, "query", defpackage.adpa.i, null);
                            }
                            tkVar.c = strSubstring5;
                            i8 = i10;
                        }
                        if (i8 < length && str.charAt(i8) == '#') {
                            java.lang.String strSubstring6 = str.substring(i8 + 1);
                            if (strSubstring6 != null) {
                                defpackage.adpa.e(strSubstring6, "fragment", defpackage.adpa.j, null);
                            }
                            tkVar.e = strSubstring6;
                        }
                        adpaVarA = tkVar.a();
                        defpackage.adnt adntVarA = adpaVarA != null ? adnuVar.a(adpaVarA.k) : null;
                        if (adntVarA == null && !d.matcher(str).matches()) {
                            java.lang.String strC = adnuVar.c();
                            java.util.BitSet bitSet2 = defpackage.adpa.a;
                            defpackage.tk tkVar2 = new defpackage.tk();
                            tkVar2.e(strC.toLowerCase(java.util.Locale.ROOT));
                            tkVar2.b("");
                            tkVar2.b = defpackage.adpa.b("/".concat(java.lang.String.valueOf(str)), defpackage.adpa.h);
                            adpaVarA = tkVar2.a();
                            adntVarA = adnuVar.a(adpaVarA.k);
                        }
                        if (adntVarA != null) {
                            return new defpackage.aecg(new defpackage.aebd(adpaVarA), adntVarA, null);
                        }
                        java.lang.String strBV = sb.length() > 0 ? defpackage.a.bV(sb, " (", ")") : "";
                        java.lang.Object[] objArr = new java.lang.Object[2];
                        objArr[i2] = str;
                        objArr[c2] = strBV;
                        throw new java.lang.IllegalArgumentException(java.lang.String.format("Could not find a NameResolverProvider for %s%s", objArr));
                    } catch (java.lang.IllegalArgumentException e5) {
                        e = e5;
                    }
                } catch (java.lang.IllegalArgumentException e6) {
                    e = e6;
                }
                throw new java.net.URISyntaxException(str, e.getMessage());
            } catch (java.net.URISyntaxException e7) {
                e = e7;
            }
        } catch (java.net.URISyntaxException e8) {
            e = e8;
            c2 = 1;
        }
    }

    private static java.util.List f(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (java.lang.Object obj : list) {
            if (obj == null) {
                arrayList.add(null);
            } else if (obj instanceof java.util.Map) {
                arrayList.add(c((java.util.Map) obj));
            } else if (obj instanceof java.util.List) {
                arrayList.add(f((java.util.List) obj));
            } else if (obj instanceof java.lang.String) {
                arrayList.add(obj);
            } else if (obj instanceof java.lang.Number) {
                arrayList.add(java.lang.Double.valueOf(((java.lang.Number) obj).doubleValue()));
            } else {
                if (!(obj instanceof java.lang.Boolean)) {
                    throw new java.lang.IllegalArgumentException("The entry '" + obj.toString() + "' is of type '" + java.lang.String.valueOf(obj.getClass()) + "', which is not supported");
                }
                arrayList.add(obj);
            }
        }
        return j$.util.DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // defpackage.admp
    public final defpackage.admn a() {
        throw null;
    }

    public adxc(java.lang.String str, adwy adwyVar, adwx adwxVar) {
        adxu adxuVar = C;
        this.f = adxuVar;
        this.g = adxuVar;
        this.h = new java.util.ArrayList();
        this.i = defpackage.adnu.b();
        this.j = new java.util.ArrayList();
        this.m = "pick_first";
        this.n = D;
        this.o = E;
        this.p = b;
        this.q = true;
        this.r = defpackage.adlk.b;
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = true;
        this.y = new java.util.ArrayList();
        str.getClass();
        this.k = str;
        this.z = adwyVar;
        this.A = adwxVar;
        this.i = defpackage.adnu.b();
        defpackage.adrs.B();
    }
}
