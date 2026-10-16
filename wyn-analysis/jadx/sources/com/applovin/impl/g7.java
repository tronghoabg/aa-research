package com.applovin.impl;

import cb.AbstractC1593a;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21614a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f21615b;

    /* renamed from: c, reason: collision with root package name */
    private List f21616c;

    public g7(com.applovin.impl.sdk.k kVar) {
        this.f21614a = kVar;
        a5 a5Var = a5.f20939I;
        this.f21615b = ((Boolean) kVar.a(a5Var, Boolean.FALSE)).booleanValue() || C1674y.a(com.applovin.impl.sdk.k.o()).a("applovin.sdk.is_test_environment") || AppLovinSdkUtils.isEmulator() || kVar.A().T();
        kVar.c(a5Var);
    }

    private void e() {
        com.applovin.impl.sdk.j jVarT = this.f21614a.t();
        if (this.f21615b) {
            jVarT.b(this.f21616c);
        } else {
            jVarT.a(this.f21616c);
        }
    }

    public void a(String str) {
        if (StringUtils.isValidString(str)) {
            a(Collections.singletonList(str));
        } else {
            a((List) null);
        }
    }

    public List b() {
        return this.f21616c;
    }

    public boolean c() {
        return this.f21615b;
    }

    public boolean d() {
        List list = this.f21616c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void a(List list) {
        if (list == null && this.f21616c == null) {
            return;
        }
        if (list == null || !list.equals(this.f21616c)) {
            this.f21616c = list;
            e();
        }
    }

    public void a() {
        this.f21614a.b(a5.f20939I, Boolean.TRUE);
    }

    public void a(JSONObject jSONObject) {
        if (this.f21615b) {
            return;
        }
        JSONArray jSONArrayM = AbstractC1593a.m("test_mode_idfas", jSONObject);
        com.applovin.impl.sdk.l lVarA = this.f21614a.A();
        boolean zT = lVarA.T();
        String strA = lVarA.f().a();
        l.b bVarG = lVarA.G();
        this.f21615b = zT || JsonUtils.containsCaseInsensitiveString(strA, jSONArrayM) || JsonUtils.containsCaseInsensitiveString(bVarG != null ? bVarG.f23088a : null, jSONArrayM);
    }
}
