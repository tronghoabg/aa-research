package com.google.e.a.e;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    private final Object f8422a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f8423b;

    /* synthetic */ ai(ai aiVar) {
        this.f8422a = new HashMap(aiVar.f8422a);
        this.f8423b = new HashMap(aiVar.f8423b);
    }

    public static ai h(String str) throws com.google.firebase.h {
        JSONObject jSONObject = new JSONObject(str);
        String strA = com.google.android.gms.common.util.h.a(jSONObject.optString("token"));
        String strA2 = com.google.android.gms.common.util.h.a(jSONObject.optString("ttl"));
        if (strA == null || strA2 == null) {
            throw new com.google.firebase.h("Unexpected server response.");
        }
        return new ai(strA, strA2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final Object o(com.google.d.m.a.a.b bVar, Class cls) throws GeneralSecurityException {
        ah ahVar = new ah(bVar.getClass(), cls);
        ?? r2 = this.f8422a;
        if (r2.containsKey(ahVar)) {
            return ((af) r2.get(ahVar)).f8415a.a(bVar);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + ahVar.toString() + " available, see https://developers.google.com/tink/faq/registration_errors");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final Object d(com.google.e.a.n nVar, Class cls) throws GeneralSecurityException {
        ?? r0 = this.f8423b;
        if (!r0.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        aj ajVar = (aj) r0.get(cls);
        return ajVar.d(nVar, new ag(this, ajVar));
    }

    public final String e() {
        return (String) this.f8422a;
    }

    public final String f() {
        return (String) this.f8423b;
    }

    public final Object g(com.google.d.m.a.a.b bVar, Class cls) {
        return o(bVar, cls);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public final void i(af afVar) throws GeneralSecurityException {
        if (afVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        ah ahVar = new ah(afVar.b(), afVar.c());
        ?? r3 = this.f8422a;
        if (!r3.containsKey(ahVar)) {
            r3.put(ahVar, afVar);
            return;
        }
        af afVar2 = (af) r3.get(ahVar);
        if (!afVar2.equals(afVar) || !afVar.equals(afVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(ahVar.toString()));
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void j(aj ajVar) throws GeneralSecurityException {
        ?? r2 = this.f8423b;
        Class clsB = ajVar.b();
        if (!r2.containsKey(clsB)) {
            r2.put(clsB, ajVar);
            return;
        }
        aj ajVar2 = (aj) r2.get(clsB);
        if (!ajVar2.equals(ajVar) || !ajVar.equals(ajVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsB.toString()));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final Enum k(Object obj) throws GeneralSecurityException {
        Enum r1 = (Enum) this.f8423b.get(obj);
        if (r1 != null) {
            return r1;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(String.valueOf(obj))));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final Object l(Enum r2) throws GeneralSecurityException {
        Object obj = this.f8422a.get(r2);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(String.valueOf(r2))));
    }

    /* synthetic */ ai(Map map, Map map2) {
        this.f8422a = map;
        this.f8423b = map2;
    }

    /* synthetic */ ai() {
        this.f8422a = new HashMap();
        this.f8423b = new HashMap();
    }

    private ai(String str, String str2) {
        this.f8423b = str;
        this.f8422a = str2;
    }

    /* synthetic */ ai(ai aiVar, byte[] bArr) {
        this.f8422a = new HashMap(aiVar.f8422a);
        this.f8423b = new HashMap(aiVar.f8423b);
    }
}
