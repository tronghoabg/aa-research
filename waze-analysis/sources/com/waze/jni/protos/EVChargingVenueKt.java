package com.waze.jni.protos;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.EVChargingVenue;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EVChargingVenueKt {
    public static final EVChargingVenueKt INSTANCE = new EVChargingVenueKt();

    private EVChargingVenueKt() {
    }

    /* renamed from: -initializeeVConnector, reason: not valid java name */
    public final EVChargingVenue.EVConnector m25077initializeeVConnector(l<? super EVConnectorKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        EVConnectorKt.Dsl.Companion companion = EVConnectorKt.Dsl.Companion;
        EVChargingVenue.EVConnector.Builder builderNewBuilder = EVChargingVenue.EVConnector.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        EVConnectorKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeeVConnectorOverview, reason: not valid java name */
    public final EVChargingVenue.EVConnectorOverview m25078initializeeVConnectorOverview(l<? super EVConnectorOverviewKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        EVConnectorOverviewKt.Dsl.Companion companion = EVConnectorOverviewKt.Dsl.Companion;
        EVChargingVenue.EVConnectorOverview.Builder builderNewBuilder = EVChargingVenue.EVConnectorOverview.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        EVConnectorOverviewKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class EVConnectorKt {
        public static final EVConnectorKt INSTANCE = new EVConnectorKt();

        private EVConnectorKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final EVChargingVenue.EVConnector.Builder _builder;

            private Dsl(EVChargingVenue.EVConnector.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ EVChargingVenue.EVConnector _build() {
                EVChargingVenue.EVConnector eVConnectorBuild = this._builder.build();
                x.e(eVConnectorBuild, "build(...)");
                return eVConnectorBuild;
            }

            public final void clearTypeId() {
                this._builder.clearTypeId();
            }

            public final String getTypeId() {
                String typeId = this._builder.getTypeId();
                x.e(typeId, "getTypeId(...)");
                return typeId;
            }

            public final boolean hasTypeId() {
                return this._builder.hasTypeId();
            }

            public final void setTypeId(String str) {
                x.f(str, "value");
                this._builder.setTypeId(str);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(EVChargingVenue.EVConnector.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(EVChargingVenue.EVConnector.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class EVConnectorOverviewKt {
        public static final EVConnectorOverviewKt INSTANCE = new EVConnectorOverviewKt();

        private EVConnectorOverviewKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final EVChargingVenue.EVConnectorOverview.Builder _builder;

            private Dsl(EVChargingVenue.EVConnectorOverview.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ EVChargingVenue.EVConnectorOverview _build() {
                EVChargingVenue.EVConnectorOverview eVConnectorOverviewBuild = this._builder.build();
                x.e(eVConnectorOverviewBuild, "build(...)");
                return eVConnectorOverviewBuild;
            }

            public final void clearAvailableCount() {
                this._builder.clearAvailableCount();
            }

            public final void clearCount() {
                this._builder.clearCount();
            }

            public final void clearEvConnector() {
                this._builder.clearEvConnector();
            }

            public final void clearMaxPowerKw() {
                this._builder.clearMaxPowerKw();
            }

            public final int getAvailableCount() {
                return this._builder.getAvailableCount();
            }

            public final int getCount() {
                return this._builder.getCount();
            }

            public final EVChargingVenue.EVConnector getEvConnector() {
                EVChargingVenue.EVConnector evConnector = this._builder.getEvConnector();
                x.e(evConnector, "getEvConnector(...)");
                return evConnector;
            }

            public final EVChargingVenue.EVConnector getEvConnectorOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return EVChargingVenueKtKt.getEvConnectorOrNull(dsl._builder);
            }

            public final float getMaxPowerKw() {
                return this._builder.getMaxPowerKw();
            }

            public final boolean hasAvailableCount() {
                return this._builder.hasAvailableCount();
            }

            public final boolean hasCount() {
                return this._builder.hasCount();
            }

            public final boolean hasEvConnector() {
                return this._builder.hasEvConnector();
            }

            public final boolean hasMaxPowerKw() {
                return this._builder.hasMaxPowerKw();
            }

            public final void setAvailableCount(int i2) {
                this._builder.setAvailableCount(i2);
            }

            public final void setCount(int i2) {
                this._builder.setCount(i2);
            }

            public final void setEvConnector(EVChargingVenue.EVConnector eVConnector) {
                x.f(eVConnector, "value");
                this._builder.setEvConnector(eVConnector);
            }

            public final void setMaxPowerKw(float f2) {
                this._builder.setMaxPowerKw(f2);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(EVChargingVenue.EVConnectorOverview.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(EVChargingVenue.EVConnectorOverview.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final EVChargingVenue.Builder _builder;

        /* compiled from: WazeSource */
        public final class EvConnectorOverviewsProxy extends c {
            private EvConnectorOverviewsProxy() {
            }
        }

        /* compiled from: WazeSource */
        public final class PaymentMethodsProxy extends c {
            private PaymentMethodsProxy() {
            }
        }

        private Dsl(EVChargingVenue.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ EVChargingVenue _build() {
            EVChargingVenue eVChargingVenueBuild = this._builder.build();
            x.e(eVChargingVenueBuild, "build(...)");
            return eVChargingVenueBuild;
        }

        public final /* synthetic */ void addAllEvConnectorOverviews(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllEvConnectorOverviews(iterable);
        }

        public final /* synthetic */ void addAllPaymentMethods(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllPaymentMethods(iterable);
        }

        public final /* synthetic */ void addEvConnectorOverviews(a aVar, EVChargingVenue.EVConnectorOverview eVConnectorOverview) {
            x.f(aVar, "<this>");
            x.f(eVConnectorOverview, "value");
            this._builder.addEvConnectorOverviews(eVConnectorOverview);
        }

        public final /* synthetic */ void addPaymentMethods(a aVar, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            this._builder.addPaymentMethods(str);
        }

        public final void clearDirections() {
            this._builder.clearDirections();
        }

        public final /* synthetic */ void clearEvConnectorOverviews(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearEvConnectorOverviews();
        }

        public final void clearRestrictedAccess() {
            this._builder.clearRestrictedAccess();
        }

        public final String getDirections() {
            String directions = this._builder.getDirections();
            x.e(directions, "getDirections(...)");
            return directions;
        }

        public final /* synthetic */ a getEvConnectorOverviews() {
            List<EVChargingVenue.EVConnectorOverview> evConnectorOverviewsList = this._builder.getEvConnectorOverviewsList();
            x.e(evConnectorOverviewsList, "getEvConnectorOverviewsList(...)");
            return new a(evConnectorOverviewsList);
        }

        public final a<String, PaymentMethodsProxy> getPaymentMethods() {
            List<String> paymentMethodsList = this._builder.getPaymentMethodsList();
            x.e(paymentMethodsList, "getPaymentMethodsList(...)");
            return new a<>(paymentMethodsList);
        }

        public final boolean getRestrictedAccess() {
            return this._builder.getRestrictedAccess();
        }

        public final boolean hasDirections() {
            return this._builder.hasDirections();
        }

        public final boolean hasRestrictedAccess() {
            return this._builder.hasRestrictedAccess();
        }

        public final /* synthetic */ void plusAssignAllEvConnectorOverviews(a<EVChargingVenue.EVConnectorOverview, EvConnectorOverviewsProxy> aVar, Iterable<EVChargingVenue.EVConnectorOverview> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllEvConnectorOverviews(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAllPaymentMethods(a<String, PaymentMethodsProxy> aVar, Iterable<String> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllPaymentMethods(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignEvConnectorOverviews(a<EVChargingVenue.EVConnectorOverview, EvConnectorOverviewsProxy> aVar, EVChargingVenue.EVConnectorOverview eVConnectorOverview) {
            x.f(aVar, "<this>");
            x.f(eVConnectorOverview, "value");
            addEvConnectorOverviews(aVar, eVConnectorOverview);
        }

        public final /* synthetic */ void plusAssignPaymentMethods(a<String, PaymentMethodsProxy> aVar, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            addPaymentMethods(aVar, str);
        }

        public final void setDirections(String str) {
            x.f(str, "value");
            this._builder.setDirections(str);
        }

        public final /* synthetic */ void setEvConnectorOverviews(a aVar, int i2, EVChargingVenue.EVConnectorOverview eVConnectorOverview) {
            x.f(aVar, "<this>");
            x.f(eVConnectorOverview, "value");
            this._builder.setEvConnectorOverviews(i2, eVConnectorOverview);
        }

        public final /* synthetic */ void setPaymentMethods(a aVar, int i2, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            this._builder.setPaymentMethods(i2, str);
        }

        public final void setRestrictedAccess(boolean z) {
            this._builder.setRestrictedAccess(z);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(EVChargingVenue.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(EVChargingVenue.Builder builder, o oVar) {
            this(builder);
        }

        public final /* synthetic */ void setPaymentMethods(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearPaymentMethods();
        }
    }
}
