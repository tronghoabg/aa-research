package com.vungle.ads.fpd;

import Sf.e;
import Vf.b;
import Wf.E;
import Wf.l0;
import Wf.q0;
import Xf.c;
import com.moloco.sdk.internal.publisher.H;
import ef.InterfaceC2519c;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 /2\u00020\u0001:\u00020/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Bo\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0001\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0002\u0010\u0014J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010\u0003R\u0011\u0010\"\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010%\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010(\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010+\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001d\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00108F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/vungle/ads/fpd/FirstPartyData;", "", "<init>", "()V", "", "seen1", "", "modelVersion", "Lcom/vungle/ads/fpd/SessionContext;", "_sessionContext", "Lcom/vungle/ads/fpd/Demographic;", "_demographic", "Lcom/vungle/ads/fpd/Location;", "_location", "Lcom/vungle/ads/fpd/Revenue;", "_revenue", "", "_customData", "LWf/l0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/vungle/ads/fpd/SessionContext;Lcom/vungle/ads/fpd/Demographic;Lcom/vungle/ads/fpd/Location;Lcom/vungle/ads/fpd/Revenue;Ljava/util/Map;LWf/l0;)V", "self", "LVf/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lef/C;", "write$Self", "(Lcom/vungle/ads/fpd/FirstPartyData;LVf/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "debug", "()Ljava/lang/String;", "clearAll", "getSessionContext", "()Lcom/vungle/ads/fpd/SessionContext;", "sessionContext", "getDemographic", "()Lcom/vungle/ads/fpd/Demographic;", "demographic", "getLocation", "()Lcom/vungle/ads/fpd/Location;", "location", "getRevenue", "()Lcom/vungle/ads/fpd/Revenue;", "revenue", "getCustomData", "()Ljava/util/Map;", "customData", "Companion", "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@e
/* loaded from: classes5.dex */
public final class FirstPartyData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    public static final c f32879g = Fe.e.a(FirstPartyData$Companion$JSON$1.INSTANCE);

    /* renamed from: a, reason: collision with root package name */
    public final String f32880a;

    /* renamed from: b, reason: collision with root package name */
    public volatile SessionContext f32881b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Demographic f32882c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Location f32883d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Revenue f32884e;

    /* renamed from: f, reason: collision with root package name */
    public Map f32885f;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/vungle/ads/fpd/FirstPartyData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/FirstPartyData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "LXf/c;", "JSON", "LXf/c;", "", "MODEL_VERSION", "Ljava/lang/String;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FirstPartyData$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    public FirstPartyData() {
        this.f32880a = "2.0";
    }

    public static final void write$Self(@NotNull FirstPartyData self, @NotNull b output, @NotNull SerialDescriptor serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || !AbstractC3340k.a(self.f32880a, "2.0")) {
            output.y(serialDesc, 0, self.f32880a);
        }
        if (output.A(serialDesc, 1) || self.f32881b != null) {
            output.i(serialDesc, 1, SessionContext$$serializer.INSTANCE, self.f32881b);
        }
        if (output.A(serialDesc, 2) || self.f32882c != null) {
            output.i(serialDesc, 2, Demographic$$serializer.INSTANCE, self.f32882c);
        }
        if (output.A(serialDesc, 3) || self.f32883d != null) {
            output.i(serialDesc, 3, Location$$serializer.INSTANCE, self.f32883d);
        }
        if (output.A(serialDesc, 4) || self.f32884e != null) {
            output.i(serialDesc, 4, Revenue$$serializer.INSTANCE, self.f32884e);
        }
        if (!output.A(serialDesc, 5) && self.f32885f == null) {
            return;
        }
        q0 q0Var = q0.f15625a;
        output.i(serialDesc, 5, new E(q0Var, q0Var, 1), self.f32885f);
    }

    public final synchronized void clearAll() {
        try {
            this.f32881b = null;
            this.f32882c = null;
            this.f32884e = null;
            this.f32883d = null;
            Map map = this.f32885f;
            if (map != null) {
                map.clear();
            }
            this.f32885f = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @NotNull
    public final String debug() {
        c cVar = f32879g;
        return cVar.b(H.n0(cVar.f16253b, kotlin.jvm.internal.H.b(FirstPartyData.class)), this);
    }

    @NotNull
    public final synchronized Map<String, String> getCustomData() {
        Map<String, String> concurrentHashMap;
        concurrentHashMap = this.f32885f;
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            this.f32885f = concurrentHashMap;
        }
        return concurrentHashMap;
    }

    @NotNull
    public final synchronized Demographic getDemographic() {
        Demographic demographic;
        demographic = this.f32882c;
        if (demographic == null) {
            demographic = new Demographic();
            this.f32882c = demographic;
        }
        return demographic;
    }

    @NotNull
    public final synchronized Location getLocation() {
        Location location;
        location = this.f32883d;
        if (location == null) {
            location = new Location();
            this.f32883d = location;
        }
        return location;
    }

    @NotNull
    public final synchronized Revenue getRevenue() {
        Revenue revenue;
        revenue = this.f32884e;
        if (revenue == null) {
            revenue = new Revenue();
            this.f32884e = revenue;
        }
        return revenue;
    }

    @NotNull
    public final synchronized SessionContext getSessionContext() {
        SessionContext sessionContext;
        sessionContext = this.f32881b;
        if (sessionContext == null) {
            sessionContext = new SessionContext();
            this.f32881b = sessionContext;
        }
        return sessionContext;
    }

    @InterfaceC2519c
    public /* synthetic */ FirstPartyData(int i5, String str, SessionContext sessionContext, Demographic demographic, Location location, Revenue revenue, Map map, l0 l0Var) {
        this.f32880a = (i5 & 1) == 0 ? "2.0" : str;
        if ((i5 & 2) == 0) {
            this.f32881b = null;
        } else {
            this.f32881b = sessionContext;
        }
        if ((i5 & 4) == 0) {
            this.f32882c = null;
        } else {
            this.f32882c = demographic;
        }
        if ((i5 & 8) == 0) {
            this.f32883d = null;
        } else {
            this.f32883d = location;
        }
        if ((i5 & 16) == 0) {
            this.f32884e = null;
        } else {
            this.f32884e = revenue;
        }
        if ((i5 & 32) == 0) {
            this.f32885f = null;
        } else {
            this.f32885f = map;
        }
    }
}
