package com.waze.jni.protos.nav_connect;

import com.waze.jni.protos.nav_connect.NavConnectState;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavConnectStateKt {
    public static final NavConnectStateKt INSTANCE = new NavConnectStateKt();

    private NavConnectStateKt() {
    }

    /* renamed from: -initializeactive, reason: not valid java name */
    public final NavConnectState.Active m27127initializeactive(l<? super ActiveKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ActiveKt.Dsl.Companion companion = ActiveKt.Dsl.Companion;
        NavConnectState.Active.Builder builderNewBuilder = NavConnectState.Active.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ActiveKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeinactive, reason: not valid java name */
    public final NavConnectState.Inactive m27128initializeinactive(l<? super InactiveKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        InactiveKt.Dsl.Companion companion = InactiveKt.Dsl.Companion;
        NavConnectState.Inactive.Builder builderNewBuilder = NavConnectState.Inactive.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        InactiveKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializepaused, reason: not valid java name */
    public final NavConnectState.Paused m27129initializepaused(l<? super PausedKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PausedKt.Dsl.Companion companion = PausedKt.Dsl.Companion;
        NavConnectState.Paused.Builder builderNewBuilder = NavConnectState.Paused.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PausedKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializependingTokenValidation, reason: not valid java name */
    public final NavConnectState.PendingTokenValidation m27130initializependingTokenValidation(l<? super PendingTokenValidationKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PendingTokenValidationKt.Dsl.Companion companion = PendingTokenValidationKt.Dsl.Companion;
        NavConnectState.PendingTokenValidation.Builder builderNewBuilder = NavConnectState.PendingTokenValidation.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PendingTokenValidationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializependingUserConsent, reason: not valid java name */
    public final NavConnectState.PendingUserConsent m27131initializependingUserConsent(l<? super PendingUserConsentKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PendingUserConsentKt.Dsl.Companion companion = PendingUserConsentKt.Dsl.Companion;
        NavConnectState.PendingUserConsent.Builder builderNewBuilder = NavConnectState.PendingUserConsent.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PendingUserConsentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class ActiveKt {
        public static final ActiveKt INSTANCE = new ActiveKt();

        private ActiveKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavConnectState.Active.Builder _builder;

            private Dsl(NavConnectState.Active.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavConnectState.Active _build() {
                NavConnectState.Active activeBuild = this._builder.build();
                x.e(activeBuild, "build(...)");
                return activeBuild;
            }

            public final void clearExternalTripToken() {
                this._builder.clearExternalTripToken();
            }

            public final void clearPartnerAppInfo() {
                this._builder.clearPartnerAppInfo();
            }

            public final String getExternalTripToken() {
                String externalTripToken = this._builder.getExternalTripToken();
                x.e(externalTripToken, "getExternalTripToken(...)");
                return externalTripToken;
            }

            public final NavConnectPartnerAppInfo getPartnerAppInfo() {
                NavConnectPartnerAppInfo partnerAppInfo = this._builder.getPartnerAppInfo();
                x.e(partnerAppInfo, "getPartnerAppInfo(...)");
                return partnerAppInfo;
            }

            public final NavConnectPartnerAppInfo getPartnerAppInfoOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return NavConnectStateKtKt.getPartnerAppInfoOrNull(dsl._builder);
            }

            public final boolean hasPartnerAppInfo() {
                return this._builder.hasPartnerAppInfo();
            }

            public final void setExternalTripToken(String str) {
                x.f(str, "value");
                this._builder.setExternalTripToken(str);
            }

            public final void setPartnerAppInfo(NavConnectPartnerAppInfo navConnectPartnerAppInfo) {
                x.f(navConnectPartnerAppInfo, "value");
                this._builder.setPartnerAppInfo(navConnectPartnerAppInfo);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavConnectState.Active.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavConnectState.Active.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class InactiveKt {
        public static final InactiveKt INSTANCE = new InactiveKt();

        private InactiveKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavConnectState.Inactive.Builder _builder;

            private Dsl(NavConnectState.Inactive.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavConnectState.Inactive _build() {
                NavConnectState.Inactive inactiveBuild = this._builder.build();
                x.e(inactiveBuild, "build(...)");
                return inactiveBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavConnectState.Inactive.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavConnectState.Inactive.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class PausedKt {
        public static final PausedKt INSTANCE = new PausedKt();

        private PausedKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavConnectState.Paused.Builder _builder;

            private Dsl(NavConnectState.Paused.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavConnectState.Paused _build() {
                NavConnectState.Paused pausedBuild = this._builder.build();
                x.e(pausedBuild, "build(...)");
                return pausedBuild;
            }

            public final void clearExternalTripToken() {
                this._builder.clearExternalTripToken();
            }

            public final void clearPartnerAppInfo() {
                this._builder.clearPartnerAppInfo();
            }

            public final String getExternalTripToken() {
                String externalTripToken = this._builder.getExternalTripToken();
                x.e(externalTripToken, "getExternalTripToken(...)");
                return externalTripToken;
            }

            public final NavConnectPartnerAppInfo getPartnerAppInfo() {
                NavConnectPartnerAppInfo partnerAppInfo = this._builder.getPartnerAppInfo();
                x.e(partnerAppInfo, "getPartnerAppInfo(...)");
                return partnerAppInfo;
            }

            public final NavConnectPartnerAppInfo getPartnerAppInfoOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return NavConnectStateKtKt.getPartnerAppInfoOrNull(dsl._builder);
            }

            public final boolean hasPartnerAppInfo() {
                return this._builder.hasPartnerAppInfo();
            }

            public final void setExternalTripToken(String str) {
                x.f(str, "value");
                this._builder.setExternalTripToken(str);
            }

            public final void setPartnerAppInfo(NavConnectPartnerAppInfo navConnectPartnerAppInfo) {
                x.f(navConnectPartnerAppInfo, "value");
                this._builder.setPartnerAppInfo(navConnectPartnerAppInfo);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavConnectState.Paused.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavConnectState.Paused.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class PendingTokenValidationKt {
        public static final PendingTokenValidationKt INSTANCE = new PendingTokenValidationKt();

        private PendingTokenValidationKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavConnectState.PendingTokenValidation.Builder _builder;

            private Dsl(NavConnectState.PendingTokenValidation.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavConnectState.PendingTokenValidation _build() {
                NavConnectState.PendingTokenValidation pendingTokenValidationBuild = this._builder.build();
                x.e(pendingTokenValidationBuild, "build(...)");
                return pendingTokenValidationBuild;
            }

            public final void clearExternalTripToken() {
                this._builder.clearExternalTripToken();
            }

            public final String getExternalTripToken() {
                String externalTripToken = this._builder.getExternalTripToken();
                x.e(externalTripToken, "getExternalTripToken(...)");
                return externalTripToken;
            }

            public final void setExternalTripToken(String str) {
                x.f(str, "value");
                this._builder.setExternalTripToken(str);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavConnectState.PendingTokenValidation.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavConnectState.PendingTokenValidation.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class PendingUserConsentKt {
        public static final PendingUserConsentKt INSTANCE = new PendingUserConsentKt();

        private PendingUserConsentKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavConnectState.PendingUserConsent.Builder _builder;

            private Dsl(NavConnectState.PendingUserConsent.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavConnectState.PendingUserConsent _build() {
                NavConnectState.PendingUserConsent pendingUserConsentBuild = this._builder.build();
                x.e(pendingUserConsentBuild, "build(...)");
                return pendingUserConsentBuild;
            }

            public final void clearExternalTripToken() {
                this._builder.clearExternalTripToken();
            }

            public final void clearInvalidationReason() {
                this._builder.clearInvalidationReason();
            }

            public final void clearPartnerAppInfo() {
                this._builder.clearPartnerAppInfo();
            }

            public final String getExternalTripToken() {
                String externalTripToken = this._builder.getExternalTripToken();
                x.e(externalTripToken, "getExternalTripToken(...)");
                return externalTripToken;
            }

            public final NavConnectState.PendingUserConsent.InvalidationReason getInvalidationReason() {
                NavConnectState.PendingUserConsent.InvalidationReason invalidationReason = this._builder.getInvalidationReason();
                x.e(invalidationReason, "getInvalidationReason(...)");
                return invalidationReason;
            }

            public final int getInvalidationReasonValue() {
                return this._builder.getInvalidationReasonValue();
            }

            public final NavConnectPartnerAppInfo getPartnerAppInfo() {
                NavConnectPartnerAppInfo partnerAppInfo = this._builder.getPartnerAppInfo();
                x.e(partnerAppInfo, "getPartnerAppInfo(...)");
                return partnerAppInfo;
            }

            public final NavConnectPartnerAppInfo getPartnerAppInfoOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return NavConnectStateKtKt.getPartnerAppInfoOrNull(dsl._builder);
            }

            public final boolean hasPartnerAppInfo() {
                return this._builder.hasPartnerAppInfo();
            }

            public final void setExternalTripToken(String str) {
                x.f(str, "value");
                this._builder.setExternalTripToken(str);
            }

            public final void setInvalidationReason(NavConnectState.PendingUserConsent.InvalidationReason invalidationReason) {
                x.f(invalidationReason, "value");
                this._builder.setInvalidationReason(invalidationReason);
            }

            public final void setInvalidationReasonValue(int i2) {
                this._builder.setInvalidationReasonValue(i2);
            }

            public final void setPartnerAppInfo(NavConnectPartnerAppInfo navConnectPartnerAppInfo) {
                x.f(navConnectPartnerAppInfo, "value");
                this._builder.setPartnerAppInfo(navConnectPartnerAppInfo);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavConnectState.PendingUserConsent.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavConnectState.PendingUserConsent.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NavConnectState.Builder _builder;

        private Dsl(NavConnectState.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NavConnectState _build() {
            NavConnectState navConnectStateBuild = this._builder.build();
            x.e(navConnectStateBuild, "build(...)");
            return navConnectStateBuild;
        }

        public final void clearActive() {
            this._builder.clearActive();
        }

        public final void clearInactive() {
            this._builder.clearInactive();
        }

        public final void clearPaused() {
            this._builder.clearPaused();
        }

        public final void clearPendingTokenValidation() {
            this._builder.clearPendingTokenValidation();
        }

        public final void clearPendingUserConsent() {
            this._builder.clearPendingUserConsent();
        }

        public final void clearState() {
            this._builder.clearState();
        }

        public final NavConnectState.Active getActive() {
            NavConnectState.Active active = this._builder.getActive();
            x.e(active, "getActive(...)");
            return active;
        }

        public final NavConnectState.Inactive getInactive() {
            NavConnectState.Inactive inactive = this._builder.getInactive();
            x.e(inactive, "getInactive(...)");
            return inactive;
        }

        public final NavConnectState.Paused getPaused() {
            NavConnectState.Paused paused = this._builder.getPaused();
            x.e(paused, "getPaused(...)");
            return paused;
        }

        public final NavConnectState.PendingTokenValidation getPendingTokenValidation() {
            NavConnectState.PendingTokenValidation pendingTokenValidation = this._builder.getPendingTokenValidation();
            x.e(pendingTokenValidation, "getPendingTokenValidation(...)");
            return pendingTokenValidation;
        }

        public final NavConnectState.PendingUserConsent getPendingUserConsent() {
            NavConnectState.PendingUserConsent pendingUserConsent = this._builder.getPendingUserConsent();
            x.e(pendingUserConsent, "getPendingUserConsent(...)");
            return pendingUserConsent;
        }

        public final NavConnectState.StateCase getStateCase() {
            NavConnectState.StateCase stateCase = this._builder.getStateCase();
            x.e(stateCase, "getStateCase(...)");
            return stateCase;
        }

        public final boolean hasActive() {
            return this._builder.hasActive();
        }

        public final boolean hasInactive() {
            return this._builder.hasInactive();
        }

        public final boolean hasPaused() {
            return this._builder.hasPaused();
        }

        public final boolean hasPendingTokenValidation() {
            return this._builder.hasPendingTokenValidation();
        }

        public final boolean hasPendingUserConsent() {
            return this._builder.hasPendingUserConsent();
        }

        public final void setActive(NavConnectState.Active active) {
            x.f(active, "value");
            this._builder.setActive(active);
        }

        public final void setInactive(NavConnectState.Inactive inactive) {
            x.f(inactive, "value");
            this._builder.setInactive(inactive);
        }

        public final void setPaused(NavConnectState.Paused paused) {
            x.f(paused, "value");
            this._builder.setPaused(paused);
        }

        public final void setPendingTokenValidation(NavConnectState.PendingTokenValidation pendingTokenValidation) {
            x.f(pendingTokenValidation, "value");
            this._builder.setPendingTokenValidation(pendingTokenValidation);
        }

        public final void setPendingUserConsent(NavConnectState.PendingUserConsent pendingUserConsent) {
            x.f(pendingUserConsent, "value");
            this._builder.setPendingUserConsent(pendingUserConsent);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NavConnectState.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NavConnectState.Builder builder, o oVar) {
            this(builder);
        }
    }
}
