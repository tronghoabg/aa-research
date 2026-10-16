package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.e5;
import com.applovin.impl.k3;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* loaded from: classes.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {

    /* renamed from: a, reason: collision with root package name */
    private String f21960a;

    /* renamed from: b, reason: collision with root package name */
    private Map f21961b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f21962c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f21963d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f21964e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f21965f;

    /* renamed from: g, reason: collision with root package name */
    private String f21966g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21967h;

    /* renamed from: i, reason: collision with root package name */
    private String f21968i;

    /* renamed from: j, reason: collision with root package name */
    private String f21969j;
    private long k;

    /* renamed from: l, reason: collision with root package name */
    private MaxAdFormat f21970l;

    private MaxAdapterParametersImpl() {
    }

    public static MaxAdapterParametersImpl a(y2 y2Var) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a((k3) y2Var);
        maxAdapterParametersImplA.f21968i = y2Var.P();
        maxAdapterParametersImplA.f21969j = y2Var.D();
        maxAdapterParametersImplA.k = y2Var.C();
        return maxAdapterParametersImplA;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f21970l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f21960a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f21969j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getConsentString() {
        return this.f21966g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f21963d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f21961b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f21962c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f21968i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.f21964e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.f21965f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f21967h;
    }

    public static MaxAdapterParametersImpl a(e5 e5Var, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a(e5Var);
        maxAdapterParametersImplA.f21960a = str;
        maxAdapterParametersImplA.f21970l = maxAdFormat;
        return maxAdapterParametersImplA;
    }

    public static MaxAdapterParametersImpl a(k3 k3Var) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f21960a = k3Var.getAdUnitId();
        maxAdapterParametersImpl.f21964e = k3Var.n();
        maxAdapterParametersImpl.f21965f = k3Var.o();
        maxAdapterParametersImpl.f21966g = k3Var.d();
        maxAdapterParametersImpl.f21961b = k3Var.i();
        maxAdapterParametersImpl.f21962c = k3Var.l();
        maxAdapterParametersImpl.f21963d = k3Var.f();
        maxAdapterParametersImpl.f21967h = k3Var.p();
        return maxAdapterParametersImpl;
    }
}
