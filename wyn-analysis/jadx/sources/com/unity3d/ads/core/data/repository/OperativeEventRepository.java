package com.unity3d.ads.core.data.repository;

import Gf.a;
import Hf.C0594d0;
import Hf.InterfaceC0590b0;
import Hf.g0;
import Hf.j0;
import Hf.k0;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;", "", "<init>", "()V", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "operativeEventRequest", "Lef/C;", "addOperativeEvent", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;)V", "LHf/b0;", "_operativeEvents", "LHf/b0;", "LHf/g0;", "operativeEvents", "LHf/g0;", "getOperativeEvents", "()LHf/g0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OperativeEventRepository {

    @NotNull
    private final InterfaceC0590b0 _operativeEvents;

    @NotNull
    private final g0 operativeEvents;

    public OperativeEventRepository() {
        j0 j0VarA = k0.a(10, 10, a.f4781b);
        this._operativeEvents = j0VarA;
        this.operativeEvents = new C0594d0(j0VarA);
    }

    public final void addOperativeEvent(@NotNull OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
        AbstractC3340k.e(operativeEventRequest, "operativeEventRequest");
        this._operativeEvents.b(operativeEventRequest);
    }

    @NotNull
    public final g0 getOperativeEvents() {
        return this.operativeEvents;
    }
}
