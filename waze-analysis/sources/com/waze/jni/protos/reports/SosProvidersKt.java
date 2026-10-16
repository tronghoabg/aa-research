package com.waze.jni.protos.reports;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.reports.SosProviders;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SosProvidersKt {
    public static final SosProvidersKt INSTANCE = new SosProvidersKt();

    private SosProvidersKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final SosProviders.Builder _builder;

        /* compiled from: WazeSource */
        public final class SosProvidersProxy extends c {
            private SosProvidersProxy() {
            }
        }

        private Dsl(SosProviders.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ SosProviders _build() {
            SosProviders sosProvidersBuild = this._builder.build();
            x.e(sosProvidersBuild, "build(...)");
            return sosProvidersBuild;
        }

        public final /* synthetic */ void addAllSosProviders(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllSosProviders(iterable);
        }

        public final /* synthetic */ void addSosProviders(a aVar, SosProvider sosProvider) {
            x.f(aVar, "<this>");
            x.f(sosProvider, "value");
            this._builder.addSosProviders(sosProvider);
        }

        public final /* synthetic */ void clearSosProviders(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearSosProviders();
        }

        public final /* synthetic */ a getSosProviders() {
            List<SosProvider> sosProvidersList = this._builder.getSosProvidersList();
            x.e(sosProvidersList, "getSosProvidersList(...)");
            return new a(sosProvidersList);
        }

        public final /* synthetic */ void plusAssignAllSosProviders(a<SosProvider, SosProvidersProxy> aVar, Iterable<SosProvider> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllSosProviders(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignSosProviders(a<SosProvider, SosProvidersProxy> aVar, SosProvider sosProvider) {
            x.f(aVar, "<this>");
            x.f(sosProvider, "value");
            addSosProviders(aVar, sosProvider);
        }

        public final /* synthetic */ void setSosProviders(a aVar, int i2, SosProvider sosProvider) {
            x.f(aVar, "<this>");
            x.f(sosProvider, "value");
            this._builder.setSosProviders(i2, sosProvider);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(SosProviders.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(SosProviders.Builder builder, o oVar) {
            this(builder);
        }
    }
}
