package com.applovin.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class s3 {

    /* renamed from: c, reason: collision with root package name */
    private static final Set f22765c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private static final Map f22766d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final s3 f22767e;

    /* renamed from: f, reason: collision with root package name */
    public static final s3 f22768f;

    /* renamed from: g, reason: collision with root package name */
    public static final s3 f22769g;

    /* renamed from: a, reason: collision with root package name */
    private String f22770a;

    /* renamed from: b, reason: collision with root package name */
    private Set f22771b;

    public enum a {
        SESSION("session"),
        INSTALL("install");


        /* renamed from: a, reason: collision with root package name */
        private final String f22775a;

        a(String str) {
            this.f22775a = str;
        }

        public String b() {
            return this.f22775a;
        }
    }

    public interface b {
        Object a(Object obj);
    }

    static {
        a aVar = a.SESSION;
        f22767e = a("ars", aVar, a.INSTALL);
        f22768f = a("ar", aVar);
        f22769g = a("ttdasi_ms", aVar);
    }

    private s3(String str, Set set) {
        this.f22770a = str;
        this.f22771b = set;
    }

    public boolean a(Object obj) {
        return obj instanceof s3;
    }

    public Set b() {
        return this.f22771b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        if (!s3Var.a(this)) {
            return false;
        }
        String strA = a();
        String strA2 = s3Var.a();
        if (strA != null ? !strA.equals(strA2) : strA2 != null) {
            return false;
        }
        Set setB = b();
        Set setB2 = s3Var.b();
        return setB != null ? setB.equals(setB2) : setB2 == null;
    }

    public int hashCode() {
        String strA = a();
        int iHashCode = strA == null ? 43 : strA.hashCode();
        Set setB = b();
        return ((iHashCode + 59) * 59) + (setB != null ? setB.hashCode() : 43);
    }

    public String toString() {
        return this.f22770a;
    }

    public String a() {
        return this.f22770a;
    }

    private static s3 a(String str, a... aVarArr) {
        Set set = f22765c;
        if (!set.contains(str)) {
            s3 s3Var = new s3(str, new HashSet(Arrays.asList(aVarArr)));
            set.add(str);
            f22766d.put(str, s3Var);
            return s3Var;
        }
        throw new IllegalArgumentException(R8.v.f("Key has already been used: ", str));
    }

    public boolean a(a aVar) {
        return this.f22771b.contains(aVar);
    }

    public static s3 a(String str) {
        return (s3) f22766d.get(str);
    }
}
