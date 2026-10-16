package com.waze.jni.protos.ev;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.ev.EVNetworkData;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EVNetworkDataKt {
    public static final EVNetworkDataKt INSTANCE = new EVNetworkDataKt();

    private EVNetworkDataKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final EVNetworkData.Builder _builder;

        /* compiled from: WazeSource */
        public final class EvNetworksProxy extends c {
            private EvNetworksProxy() {
            }
        }

        private Dsl(EVNetworkData.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ EVNetworkData _build() {
            EVNetworkData eVNetworkDataBuild = this._builder.build();
            x.e(eVNetworkDataBuild, "build(...)");
            return eVNetworkDataBuild;
        }

        public final /* synthetic */ void addAllEvNetworks(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllEvNetworks(iterable);
        }

        public final /* synthetic */ void addEvNetworks(a aVar, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            this._builder.addEvNetworks(str);
        }

        public final a<String, EvNetworksProxy> getEvNetworks() {
            List<String> evNetworksList = this._builder.getEvNetworksList();
            x.e(evNetworksList, "getEvNetworksList(...)");
            return new a<>(evNetworksList);
        }

        public final /* synthetic */ void plusAssignAllEvNetworks(a<String, EvNetworksProxy> aVar, Iterable<String> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllEvNetworks(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignEvNetworks(a<String, EvNetworksProxy> aVar, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            addEvNetworks(aVar, str);
        }

        public final /* synthetic */ void setEvNetworks(a aVar, int i2, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            this._builder.setEvNetworks(i2, str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(EVNetworkData.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(EVNetworkData.Builder builder, o oVar) {
            this(builder);
        }

        public final /* synthetic */ void setEvNetworks(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearEvNetworks();
        }
    }
}
