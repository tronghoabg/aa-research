package com.waze.authentication;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.autofill.HintConstants;
import j$.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aw implements aj {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f15749a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f15750b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f15751c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f15752d;

    public aw(SharedPreferences sharedPreferences, Context context, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(sharedPreferences, "sharedPreferences");
        h.g.b.x.f(context, "context");
        h.g.b.x.f(eVar, "logger");
        this.f15749a = sharedPreferences;
        this.f15750b = context;
        this.f15751c = eVar;
        this.f15752d = h.g.a(new am(this, 4));
    }

    static final h.ab e(aw awVar, CompletableDeferred completableDeferred, com.google.android.gms.auth.a.f fVar) {
        h.g.b.x.f(fVar, "result");
        awVar.f15751c.a("onSuccess, result has " + fVar.a().size() + " entries");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map mapA = fVar.a();
        h.g.b.x.e(mapA, "getBlockstoreDataMap(...)");
        for (Map.Entry entry : mapA.entrySet()) {
            byte[] bArrB = ((com.google.android.gms.auth.a.e) entry.getValue()).b();
            h.g.b.x.e(bArrB, "getBytes(...)");
            linkedHashMap.put(entry.getKey(), new String(bArrB, h.n.a.f48221b));
        }
        completableDeferred.a(l(linkedHashMap));
        return h.ab.f48028a;
    }

    static final h.ab f(aw awVar, Boolean bool) {
        Objects.toString(bool);
        awVar.f15751c.e("delete succeeded - ".concat(String.valueOf(bool)));
        return h.ab.f48028a;
    }

    public static /* synthetic */ void g(aw awVar, Map.Entry entry, Exception exc) {
        h.g.b.x.f(exc, "error");
        Object key = entry.getKey();
        Objects.toString(key);
        awVar.f15751c.h("failed to store ".concat(String.valueOf(key)), exc);
    }

    static final void h(aw awVar, CompletableDeferred completableDeferred, Exception exc) {
        awVar.f15751c.c("BlockStore Failed to retrieve bytes", exc);
        completableDeferred.a(h.a.i.h());
    }

    static final void i(aw awVar, Exception exc) {
        awVar.f15751c.c("delete failed", exc);
    }

    public static /* synthetic */ h.ab j(aw awVar, Map.Entry entry) {
        Object key = entry.getKey();
        Objects.toString(key);
        awVar.f15751c.a("stored ".concat(String.valueOf(key)));
        return h.ab.f48028a;
    }

    static final com.google.android.gms.auth.a.a.h k(aw awVar) {
        return new com.google.android.gms.auth.a.a.h(awVar.f15750b);
    }

    private static final List l(Map map) {
        String str;
        String str2 = (String) Map.EL.getOrDefault(map, HintConstants.AUTOFILL_HINT_USERNAME, null);
        if (str2 == null || str2.length() <= 0) {
            str2 = null;
        }
        String str3 = (String) Map.EL.getOrDefault(map, HintConstants.AUTOFILL_HINT_PASSWORD, null);
        if (str3 == null || str3.length() <= 0) {
            str3 = null;
        }
        String str4 = (String) Map.EL.getOrDefault(map, "login_token", null);
        if (str4 == null || str4.length() <= 0) {
            str4 = null;
        }
        return h.a.i.k((str2 == null || (str = str3) == null || str.length() == 0) ? null : new k(str2, str3), str4 != null ? new j(str4) : null);
    }

    private final com.google.android.gms.auth.a.a.h m() {
        Object value = this.f15752d.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return (com.google.android.gms.auth.a.a.h) value;
    }

    @Override // com.waze.authentication.aj
    public final List a() {
        java.util.Map<String, ?> all = this.f15749a.getAll();
        h.g.b.x.e(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            String str = value instanceof String ? (String) value : null;
            h.k kVar = str != null ? new h.k(key, str) : null;
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        return l(h.a.r.q(arrayList));
    }

    @Override // com.waze.authentication.aj
    public final void b() {
        SharedPreferences.Editor editorEdit = this.f15749a.edit();
        h.g.b.x.c(editorEdit);
        editorEdit.clear();
        editorEdit.apply();
        this.f15751c.a("resetBlockStore called");
        com.google.android.gms.auth.a.c cVar = new com.google.android.gms.auth.a.c(null);
        cVar.d();
        com.google.android.gms.o.t tVarA = m().a(cVar.c());
        int i2 = 0;
        tVarA.r(new com.google.firebase.messaging.n(new at(this, i2), 4));
        tVarA.o(new au(this, i2));
    }

    @Override // com.waze.authentication.aj
    public final void c(ax axVar) {
        java.util.Map mapE;
        h.g.b.x.f(axVar, "credential");
        int i2 = 0;
        if (axVar instanceof k) {
            k kVar = (k) axVar;
            mapE = h.a.r.k(new h.k(HintConstants.AUTOFILL_HINT_USERNAME, kVar.b()), new h.k(HintConstants.AUTOFILL_HINT_PASSWORD, kVar.a()));
        } else {
            if (!(axVar instanceof j)) {
                throw new h.i();
            }
            mapE = h.a.r.e(new h.k("login_token", ((j) axVar).a()));
        }
        SharedPreferences.Editor editorEdit = this.f15749a.edit();
        h.g.b.x.c(editorEdit);
        for (Map.Entry entry : mapE.entrySet()) {
            editorEdit.putString((String) entry.getKey(), (String) entry.getValue());
        }
        editorEdit.apply();
        for (Map.Entry entry2 : mapE.entrySet()) {
            com.google.android.gms.auth.a.a.h hVarM = m();
            com.google.android.gms.auth.a.g gVar = new com.google.android.gms.auth.a.g();
            gVar.c((String) entry2.getKey());
            byte[] bytes = ((String) entry2.getValue()).getBytes(h.n.a.f48221b);
            h.g.b.x.e(bytes, "getBytes(...)");
            gVar.b(bytes);
            gVar.d();
            com.google.android.gms.o.t tVarC = hVarM.c(gVar.a());
            tVarC.r(new com.google.firebase.messaging.n(new com.waze.c.d.a(this, entry2, 8), 5));
            tVarC.o(new av(this, entry2, i2));
        }
    }

    public final Object d(h.c.e eVar) {
        this.f15751c.a("getRecoveryCredentials called - loading recovery credentials from backup");
        CompletableDeferred completableDeferredJ = bo.j();
        com.google.android.gms.auth.a.c cVar = new com.google.android.gms.auth.a.c();
        cVar.b();
        com.google.android.gms.o.t tVarB = m().b(cVar.a());
        tVarB.r(new com.google.firebase.messaging.n(new as(this, completableDeferredJ, 0), 3));
        tVarB.o(new av(this, completableDeferredJ, 1));
        return completableDeferredJ.c(eVar);
    }
}
