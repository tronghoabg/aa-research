package com.applovin.impl;

import android.content.Context;

/* renamed from: com.applovin.impl.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1656p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f22467a = new a("Age Restricted User", a5.f20964r);

    /* renamed from: b, reason: collision with root package name */
    private static final a f22468b = new a("Has User Consent", a5.f20963q);

    /* renamed from: c, reason: collision with root package name */
    private static final a f22469c = new a("\"Do Not Sell\"", a5.f20965s);

    /* renamed from: com.applovin.impl.p0$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f22470a;

        /* renamed from: b, reason: collision with root package name */
        private final a5 f22471b;

        public a(String str, a5 a5Var) {
            this.f22470a = str;
            this.f22471b = a5Var;
        }

        public Boolean b(Context context) {
            if (context != null) {
                return (Boolean) b5.a(this.f22471b, (Object) null, context);
            }
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Failed to get value for key: " + this.f22471b);
            return null;
        }

        public String a() {
            return this.f22470a;
        }

        public String a(Context context) {
            Boolean boolB = b(context);
            return boolB != null ? boolB.toString() : "No value set";
        }
    }

    public static a a() {
        return f22469c;
    }

    public static a b() {
        return f22468b;
    }

    public static a c() {
        return f22467a;
    }

    public static boolean a(boolean z2, Context context) {
        return a(a5.f20965s, Boolean.valueOf(z2), context);
    }

    public static boolean b(boolean z2, Context context) {
        return a(a5.f20963q, Boolean.valueOf(z2), context);
    }

    public static String a(Context context) {
        return a(f22468b, context) + a(f22469c, context);
    }

    private static boolean a(a5 a5Var, Boolean bool, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Failed to update compliance value for key: " + a5Var);
            return false;
        }
        try {
            Boolean bool2 = (Boolean) b5.a(a5Var, (Object) null, context);
            b5.b(a5Var, bool, context);
            return bool2 == null || bool2 != bool;
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ComplianceManager", "Unable to update compliance", th);
            com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.f22986D0;
            if (kVar != null) {
                kVar.D().a("ComplianceManager", "updateCompliance", th);
            }
            return false;
        }
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.f22470a + " - " + aVar.a(context);
    }
}
