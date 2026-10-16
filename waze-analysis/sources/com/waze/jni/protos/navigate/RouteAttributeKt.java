package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.RouteAttribute;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RouteAttributeKt {
    public static final RouteAttributeKt INSTANCE = new RouteAttributeKt();

    private RouteAttributeKt() {
    }

    /* renamed from: -initializebeacons, reason: not valid java name */
    public final RouteAttribute.Beacons m27551initializebeacons(l<? super BeaconsKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        BeaconsKt.Dsl.Companion companion = BeaconsKt.Dsl.Companion;
        RouteAttribute.Beacons.Builder builderNewBuilder = RouteAttribute.Beacons.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        BeaconsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeblocked, reason: not valid java name */
    public final RouteAttribute.Blocked m27552initializeblocked(l<? super BlockedKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        BlockedKt.Dsl.Companion companion = BlockedKt.Dsl.Companion;
        RouteAttribute.Blocked.Builder builderNewBuilder = RouteAttribute.Blocked.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        BlockedKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeborderCrossing, reason: not valid java name */
    public final RouteAttribute.BorderCrossing m27553initializeborderCrossing(l<? super BorderCrossingKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        BorderCrossingKt.Dsl.Companion companion = BorderCrossingKt.Dsl.Companion;
        RouteAttribute.BorderCrossing.Builder builderNewBuilder = RouteAttribute.BorderCrossing.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        BorderCrossingKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializebypassesRestricted, reason: not valid java name */
    public final RouteAttribute.BypassesRestricted m27554initializebypassesRestricted(l<? super BypassesRestrictedKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        BypassesRestrictedKt.Dsl.Companion companion = BypassesRestrictedKt.Dsl.Companion;
        RouteAttribute.BypassesRestricted.Builder builderNewBuilder = RouteAttribute.BypassesRestricted.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        BypassesRestrictedKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializedangerZone, reason: not valid java name */
    public final RouteAttribute.DangerZone m27555initializedangerZone(l<? super DangerZoneKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        DangerZoneKt.Dsl.Companion companion = DangerZoneKt.Dsl.Companion;
        RouteAttribute.DangerZone.Builder builderNewBuilder = RouteAttribute.DangerZone.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        DangerZoneKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializedangerousTurn, reason: not valid java name */
    public final RouteAttribute.DangerousTurn m27556initializedangerousTurn(l<? super DangerousTurnKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        DangerousTurnKt.Dsl.Companion companion = DangerousTurnKt.Dsl.Companion;
        RouteAttribute.DangerousTurn.Builder builderNewBuilder = RouteAttribute.DangerousTurn.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        DangerousTurnKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeeTAFromML, reason: not valid java name */
    public final RouteAttribute.ETAFromML m27557initializeeTAFromML(l<? super ETAFromMLKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ETAFromMLKt.Dsl.Companion companion = ETAFromMLKt.Dsl.Companion;
        RouteAttribute.ETAFromML.Builder builderNewBuilder = RouteAttribute.ETAFromML.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ETAFromMLKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeferry, reason: not valid java name */
    public final RouteAttribute.Ferry m27558initializeferry(l<? super FerryKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        FerryKt.Dsl.Companion companion = FerryKt.Dsl.Companion;
        RouteAttribute.Ferry.Builder builderNewBuilder = RouteAttribute.Ferry.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        FerryKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializelicensePlateRestriction, reason: not valid java name */
    public final RouteAttribute.LicensePlateRestriction m27559initializelicensePlateRestriction(l<? super LicensePlateRestrictionKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        LicensePlateRestrictionKt.Dsl.Companion companion = LicensePlateRestrictionKt.Dsl.Companion;
        RouteAttribute.LicensePlateRestriction.Builder builderNewBuilder = RouteAttribute.LicensePlateRestriction.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        LicensePlateRestrictionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializepassNeeded, reason: not valid java name */
    public final RouteAttribute.PassNeeded m27560initializepassNeeded(l<? super PassNeededKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PassNeededKt.Dsl.Companion companion = PassNeededKt.Dsl.Companion;
        RouteAttribute.PassNeeded.Builder builderNewBuilder = RouteAttribute.PassNeeded.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PassNeededKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeprimaryForAvoiders, reason: not valid java name */
    public final RouteAttribute.PrimaryForAvoiders m27561initializeprimaryForAvoiders(l<? super PrimaryForAvoidersKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PrimaryForAvoidersKt.Dsl.Companion companion = PrimaryForAvoidersKt.Dsl.Companion;
        RouteAttribute.PrimaryForAvoiders.Builder builderNewBuilder = RouteAttribute.PrimaryForAvoiders.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PrimaryForAvoidersKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializepublicTransportation, reason: not valid java name */
    public final RouteAttribute.PublicTransportation m27562initializepublicTransportation(l<? super PublicTransportationKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PublicTransportationKt.Dsl.Companion companion = PublicTransportationKt.Dsl.Companion;
        RouteAttribute.PublicTransportation.Builder builderNewBuilder = RouteAttribute.PublicTransportation.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PublicTransportationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializerestrictedArea, reason: not valid java name */
    public final RouteAttribute.RestrictedArea m27563initializerestrictedArea(l<? super RestrictedAreaKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RestrictedAreaKt.Dsl.Companion companion = RestrictedAreaKt.Dsl.Companion;
        RouteAttribute.RestrictedArea.Builder builderNewBuilder = RouteAttribute.RestrictedArea.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RestrictedAreaKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeschoolArea, reason: not valid java name */
    public final RouteAttribute.SchoolArea m27564initializeschoolArea(l<? super SchoolAreaKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        SchoolAreaKt.Dsl.Companion companion = SchoolAreaKt.Dsl.Companion;
        RouteAttribute.SchoolArea.Builder builderNewBuilder = RouteAttribute.SchoolArea.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        SchoolAreaKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializesteppedOnIT, reason: not valid java name */
    public final RouteAttribute.SteppedOnIT m27565initializesteppedOnIT(l<? super SteppedOnITKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        SteppedOnITKt.Dsl.Companion companion = SteppedOnITKt.Dsl.Companion;
        RouteAttribute.SteppedOnIT.Builder builderNewBuilder = RouteAttribute.SteppedOnIT.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        SteppedOnITKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializetollForAvoiders, reason: not valid java name */
    public final RouteAttribute.TollForAvoiders m27566initializetollForAvoiders(l<? super TollForAvoidersKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        TollForAvoidersKt.Dsl.Companion companion = TollForAvoidersKt.Dsl.Companion;
        RouteAttribute.TollForAvoiders.Builder builderNewBuilder = RouteAttribute.TollForAvoiders.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        TollForAvoidersKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeunnatural, reason: not valid java name */
    public final RouteAttribute.Unnatural m27567initializeunnatural(l<? super UnnaturalKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        UnnaturalKt.Dsl.Companion companion = UnnaturalKt.Dsl.Companion;
        RouteAttribute.Unnatural.Builder builderNewBuilder = RouteAttribute.Unnatural.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        UnnaturalKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeunpaved, reason: not valid java name */
    public final RouteAttribute.Unpaved m27568initializeunpaved(l<? super UnpavedKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        UnpavedKt.Dsl.Companion companion = UnpavedKt.Dsl.Companion;
        RouteAttribute.Unpaved.Builder builderNewBuilder = RouteAttribute.Unpaved.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        UnpavedKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class BeaconsKt {
        public static final BeaconsKt INSTANCE = new BeaconsKt();

        private BeaconsKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final RouteAttribute.Beacons.Builder _builder;

            private Dsl(RouteAttribute.Beacons.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ RouteAttribute.Beacons _build() {
                RouteAttribute.Beacons beaconsBuild = this._builder.build();
                x.e(beaconsBuild, "build(...)");
                return beaconsBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(RouteAttribute.Beacons.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(RouteAttribute.Beacons.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class BlockedKt {
        public static final BlockedKt INSTANCE = new BlockedKt();

        private BlockedKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final RouteAttribute.Blocked.Builder _builder;

            private Dsl(RouteAttribute.Blocked.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ RouteAttribute.Blocked _build() {
                RouteAttribute.Blocked blockedBuild = this._builder.build();
                x.e(blockedBuild, "build(...)");
                return blockedBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(RouteAttribute.Blocked.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(RouteAttribute.Blocked.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class BorderCrossingKt {
        public static final BorderCrossingKt INSTANCE = new BorderCrossingKt();

        private BorderCrossingKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final RouteAttribute.BorderCrossing.Builder _builder;

            private Dsl(RouteAttribute.BorderCrossing.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ RouteAttribute.BorderCrossing _build() {
                RouteAttribute.BorderCrossing borderCrossingBuild = this._builder.build();
                x.e(borderCrossingBuild, "build(...)");
                return borderCrossingBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(RouteAttribute.BorderCrossing.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(RouteAttribute.BorderCrossing.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class BypassesRestrictedKt {
        public static final BypassesRestrictedKt INSTANCE = new BypassesRestrictedKt();

        private BypassesRestrictedKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final RouteAttribute.BypassesRestricted.Builder _builder;

            private Dsl(RouteAttribute.BypassesRestricted.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ RouteAttribute.BypassesRestricted _build() {
                RouteAttribute.BypassesRestricted bypassesRestrictedBuild = this._builder.build();
                x.e(bypassesRestrictedBuild, "build(...)");
                return bypassesRestrictedBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(RouteAttribute.BypassesRestricted.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(RouteAttribute.BypassesRestricted.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class DangerZoneKt {
        public static final DangerZoneKt INSTANCE = new DangerZoneKt();

        private DangerZoneKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final RouteAttribute.DangerZone.Builder _builder;

            private Dsl(RouteAttribute.DangerZone.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ RouteAttribute.DangerZone _build() {
                RouteAttribute.DangerZone dangerZoneBuild = this._builder.build();
                x.e(dangerZoneBuild, "build(...)");
                return dangerZoneBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(RouteAttribute.DangerZone.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(RouteAttribute.DangerZone.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class DangerousTurnKt {
        public static final DangerousTurnKt INSTANCE = new DangerousTurnKt();

        private DangerousTurnKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final RouteAttribute.DangerousTurn.Builder _builder;

            private Dsl(RouteAttribute.DangerousTurn.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ RouteAttribute.DangerousTurn _build() {
                RouteAttribute.DangerousTurn dangerousTurnBuild = this._builder.build();
                x.e(dangerousTurnBuild, "build(...)");
                return dangerousTurnBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(RouteAttribute.DangerousTurn.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(RouteAttribute.DangerousTurn.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class ETAFromMLKt {
        public static final ETAFromMLKt INSTANCE = new ETAFromMLKt();

        private ETAFromMLKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final RouteAttribute.ETAFromML.Builder _builder;

            private Dsl(RouteAttribute.ETAFromML.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ RouteAttribute.ETAFromML _build() {
                RouteAttribute.ETAFromML eTAFromMLBuild = this._builder.build();
                x.e(eTAFromMLBuild, "build(...)");
                return eTAFromMLBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(RouteAttribute.ETAFromML.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(RouteAttribute.ETAFromML.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class FerryKt {
        public static final FerryKt INSTANCE = new FerryKt();

        private FerryKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final RouteAttribute.Ferry.Builder _builder;

            private Dsl(RouteAttribute.Ferry.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ RouteAttribute.Ferry _build() {
                RouteAttribute.Ferry ferryBuild = this._builder.build();
                x.e(ferryBuild, "build(...)");
                return ferryBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(RouteAttribute.Ferry.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(RouteAttribute.Ferry.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class LicensePlateRestrictionKt {
        public static final LicensePlateRestrictionKt INSTANCE = new LicensePlateRestrictionKt();

        private LicensePlateRestrictionKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final RouteAttribute.LicensePlateRestriction.Builder _builder;

            private Dsl(RouteAttribute.LicensePlateRestriction.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ RouteAttribute.LicensePlateRestriction _build() {
                RouteAttribute.LicensePlateRestriction licensePlateRestrictionBuild = this._builder.build();
                x.e(licensePlateRestrictionBuild, "build(...)");
                return licensePlateRestrictionBuild;
            }

            public final void clearAreaName() {
                this._builder.clearAreaName();
            }

            public final String getAreaName() {
                String areaName = this._builder.getAreaName();
                x.e(areaName, "getAreaName(...)");
                return areaName;
            }

            public final boolean hasAreaName() {
                return this._builder.hasAreaName();
            }

            public final void setAreaName(String str) {
                x.f(str, "value");
                this._builder.setAreaName(str);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(RouteAttribute.LicensePlateRestriction.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(RouteAttribute.LicensePlateRestriction.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class PassNeededKt {
        public static final PassNeededKt INSTANCE = new PassNeededKt();

        private PassNeededKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final RouteAttribute.PassNeeded.Builder _builder;

            private Dsl(RouteAttribute.PassNeeded.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ RouteAttribute.PassNeeded _build() {
                RouteAttribute.PassNeeded passNeededBuild = this._builder.build();
                x.e(passNeededBuild, "build(...)");
                return passNeededBuild;
            }

            public final void clearPass() {
                this._builder.clearPass();
            }

            public final String getPass() {
                String pass = this._builder.getPass();
                x.e(pass, "getPass(...)");
                return pass;
            }

            public final void setPass(String str) {
                x.f(str, "value");
                this._builder.setPass(str);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(RouteAttribute.PassNeeded.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(RouteAttribute.PassNeeded.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class PrimaryForAvoidersKt {
        public static final PrimaryForAvoidersKt INSTANCE = new PrimaryForAvoidersKt();

        private PrimaryForAvoidersKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final RouteAttribute.PrimaryForAvoiders.Builder _builder;

            private Dsl(RouteAttribute.PrimaryForAvoiders.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ RouteAttribute.PrimaryForAvoiders _build() {
                RouteAttribute.PrimaryForAvoiders primaryForAvoidersBuild = this._builder.build();
                x.e(primaryForAvoidersBuild, "build(...)");
                return primaryForAvoidersBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(RouteAttribute.PrimaryForAvoiders.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(RouteAttribute.PrimaryForAvoiders.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class PublicTransportationKt {
        public static final PublicTransportationKt INSTANCE = new PublicTransportationKt();

        private PublicTransportationKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final RouteAttribute.PublicTransportation.Builder _builder;

            private Dsl(RouteAttribute.PublicTransportation.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ RouteAttribute.PublicTransportation _build() {
                RouteAttribute.PublicTransportation publicTransportationBuild = this._builder.build();
                x.e(publicTransportationBuild, "build(...)");
                return publicTransportationBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(RouteAttribute.PublicTransportation.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(RouteAttribute.PublicTransportation.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class RestrictedAreaKt {
        public static final RestrictedAreaKt INSTANCE = new RestrictedAreaKt();

        private RestrictedAreaKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final RouteAttribute.RestrictedArea.Builder _builder;

            private Dsl(RouteAttribute.RestrictedArea.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ RouteAttribute.RestrictedArea _build() {
                RouteAttribute.RestrictedArea restrictedAreaBuild = this._builder.build();
                x.e(restrictedAreaBuild, "build(...)");
                return restrictedAreaBuild;
            }

            public final void clearAreaName() {
                this._builder.clearAreaName();
            }

            public final String getAreaName() {
                String areaName = this._builder.getAreaName();
                x.e(areaName, "getAreaName(...)");
                return areaName;
            }

            public final boolean hasAreaName() {
                return this._builder.hasAreaName();
            }

            public final void setAreaName(String str) {
                x.f(str, "value");
                this._builder.setAreaName(str);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(RouteAttribute.RestrictedArea.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(RouteAttribute.RestrictedArea.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class SchoolAreaKt {
        public static final SchoolAreaKt INSTANCE = new SchoolAreaKt();

        private SchoolAreaKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final RouteAttribute.SchoolArea.Builder _builder;

            private Dsl(RouteAttribute.SchoolArea.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ RouteAttribute.SchoolArea _build() {
                RouteAttribute.SchoolArea schoolAreaBuild = this._builder.build();
                x.e(schoolAreaBuild, "build(...)");
                return schoolAreaBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(RouteAttribute.SchoolArea.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(RouteAttribute.SchoolArea.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class SteppedOnITKt {
        public static final SteppedOnITKt INSTANCE = new SteppedOnITKt();

        private SteppedOnITKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final RouteAttribute.SteppedOnIT.Builder _builder;

            private Dsl(RouteAttribute.SteppedOnIT.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ RouteAttribute.SteppedOnIT _build() {
                RouteAttribute.SteppedOnIT steppedOnITBuild = this._builder.build();
                x.e(steppedOnITBuild, "build(...)");
                return steppedOnITBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(RouteAttribute.SteppedOnIT.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(RouteAttribute.SteppedOnIT.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class TollForAvoidersKt {
        public static final TollForAvoidersKt INSTANCE = new TollForAvoidersKt();

        private TollForAvoidersKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final RouteAttribute.TollForAvoiders.Builder _builder;

            private Dsl(RouteAttribute.TollForAvoiders.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ RouteAttribute.TollForAvoiders _build() {
                RouteAttribute.TollForAvoiders tollForAvoidersBuild = this._builder.build();
                x.e(tollForAvoidersBuild, "build(...)");
                return tollForAvoidersBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(RouteAttribute.TollForAvoiders.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(RouteAttribute.TollForAvoiders.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class UnnaturalKt {
        public static final UnnaturalKt INSTANCE = new UnnaturalKt();

        private UnnaturalKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final RouteAttribute.Unnatural.Builder _builder;

            private Dsl(RouteAttribute.Unnatural.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ RouteAttribute.Unnatural _build() {
                RouteAttribute.Unnatural unnaturalBuild = this._builder.build();
                x.e(unnaturalBuild, "build(...)");
                return unnaturalBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(RouteAttribute.Unnatural.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(RouteAttribute.Unnatural.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class UnpavedKt {
        public static final UnpavedKt INSTANCE = new UnpavedKt();

        private UnpavedKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final RouteAttribute.Unpaved.Builder _builder;

            private Dsl(RouteAttribute.Unpaved.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ RouteAttribute.Unpaved _build() {
                RouteAttribute.Unpaved unpavedBuild = this._builder.build();
                x.e(unpavedBuild, "build(...)");
                return unpavedBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(RouteAttribute.Unpaved.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(RouteAttribute.Unpaved.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RouteAttribute.Builder _builder;

        private Dsl(RouteAttribute.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RouteAttribute _build() {
            RouteAttribute routeAttributeBuild = this._builder.build();
            x.e(routeAttributeBuild, "build(...)");
            return routeAttributeBuild;
        }

        public final void clearAttribute() {
            this._builder.clearAttribute();
        }

        public final void clearBeacons() {
            this._builder.clearBeacons();
        }

        public final void clearBlocked() {
            this._builder.clearBlocked();
        }

        public final void clearBorderCrossing() {
            this._builder.clearBorderCrossing();
        }

        public final void clearBypassesRestricted() {
            this._builder.clearBypassesRestricted();
        }

        public final void clearDangerZone() {
            this._builder.clearDangerZone();
        }

        public final void clearDangerousTurn() {
            this._builder.clearDangerousTurn();
        }

        public final void clearEtaFromML() {
            this._builder.clearEtaFromML();
        }

        public final void clearFerry() {
            this._builder.clearFerry();
        }

        public final void clearHov() {
            this._builder.clearHov();
        }

        public final void clearLicensePlateRestriction() {
            this._builder.clearLicensePlateRestriction();
        }

        public final void clearPassNeeded() {
            this._builder.clearPassNeeded();
        }

        public final void clearPrimaryForAvoiders() {
            this._builder.clearPrimaryForAvoiders();
        }

        public final void clearPublicTransportation() {
            this._builder.clearPublicTransportation();
        }

        public final void clearRestrictedArea() {
            this._builder.clearRestrictedArea();
        }

        public final void clearSchoolArea() {
            this._builder.clearSchoolArea();
        }

        public final void clearSteppedOnIT() {
            this._builder.clearSteppedOnIT();
        }

        public final void clearToll() {
            this._builder.clearToll();
        }

        public final void clearTollForAvoiders() {
            this._builder.clearTollForAvoiders();
        }

        public final void clearUnnatural() {
            this._builder.clearUnnatural();
        }

        public final void clearUnpaved() {
            this._builder.clearUnpaved();
        }

        public final RouteAttribute.AttributeCase getAttributeCase() {
            RouteAttribute.AttributeCase attributeCase = this._builder.getAttributeCase();
            x.e(attributeCase, "getAttributeCase(...)");
            return attributeCase;
        }

        public final RouteAttribute.Beacons getBeacons() {
            RouteAttribute.Beacons beacons = this._builder.getBeacons();
            x.e(beacons, "getBeacons(...)");
            return beacons;
        }

        public final RouteAttribute.Blocked getBlocked() {
            RouteAttribute.Blocked blocked = this._builder.getBlocked();
            x.e(blocked, "getBlocked(...)");
            return blocked;
        }

        public final RouteAttribute.BorderCrossing getBorderCrossing() {
            RouteAttribute.BorderCrossing borderCrossing = this._builder.getBorderCrossing();
            x.e(borderCrossing, "getBorderCrossing(...)");
            return borderCrossing;
        }

        public final RouteAttribute.BypassesRestricted getBypassesRestricted() {
            RouteAttribute.BypassesRestricted bypassesRestricted = this._builder.getBypassesRestricted();
            x.e(bypassesRestricted, "getBypassesRestricted(...)");
            return bypassesRestricted;
        }

        public final RouteAttribute.DangerZone getDangerZone() {
            RouteAttribute.DangerZone dangerZone = this._builder.getDangerZone();
            x.e(dangerZone, "getDangerZone(...)");
            return dangerZone;
        }

        public final RouteAttribute.DangerousTurn getDangerousTurn() {
            RouteAttribute.DangerousTurn dangerousTurn = this._builder.getDangerousTurn();
            x.e(dangerousTurn, "getDangerousTurn(...)");
            return dangerousTurn;
        }

        public final RouteAttribute.ETAFromML getEtaFromML() {
            RouteAttribute.ETAFromML etaFromML = this._builder.getEtaFromML();
            x.e(etaFromML, "getEtaFromML(...)");
            return etaFromML;
        }

        public final RouteAttribute.Ferry getFerry() {
            RouteAttribute.Ferry ferry = this._builder.getFerry();
            x.e(ferry, "getFerry(...)");
            return ferry;
        }

        public final Hov getHov() {
            Hov hov = this._builder.getHov();
            x.e(hov, "getHov(...)");
            return hov;
        }

        public final RouteAttribute.LicensePlateRestriction getLicensePlateRestriction() {
            RouteAttribute.LicensePlateRestriction licensePlateRestriction = this._builder.getLicensePlateRestriction();
            x.e(licensePlateRestriction, "getLicensePlateRestriction(...)");
            return licensePlateRestriction;
        }

        public final RouteAttribute.PassNeeded getPassNeeded() {
            RouteAttribute.PassNeeded passNeeded = this._builder.getPassNeeded();
            x.e(passNeeded, "getPassNeeded(...)");
            return passNeeded;
        }

        public final RouteAttribute.PrimaryForAvoiders getPrimaryForAvoiders() {
            RouteAttribute.PrimaryForAvoiders primaryForAvoiders = this._builder.getPrimaryForAvoiders();
            x.e(primaryForAvoiders, "getPrimaryForAvoiders(...)");
            return primaryForAvoiders;
        }

        public final RouteAttribute.PublicTransportation getPublicTransportation() {
            RouteAttribute.PublicTransportation publicTransportation = this._builder.getPublicTransportation();
            x.e(publicTransportation, "getPublicTransportation(...)");
            return publicTransportation;
        }

        public final RouteAttribute.RestrictedArea getRestrictedArea() {
            RouteAttribute.RestrictedArea restrictedArea = this._builder.getRestrictedArea();
            x.e(restrictedArea, "getRestrictedArea(...)");
            return restrictedArea;
        }

        public final RouteAttribute.SchoolArea getSchoolArea() {
            RouteAttribute.SchoolArea schoolArea = this._builder.getSchoolArea();
            x.e(schoolArea, "getSchoolArea(...)");
            return schoolArea;
        }

        public final RouteAttribute.SteppedOnIT getSteppedOnIT() {
            RouteAttribute.SteppedOnIT steppedOnIT = this._builder.getSteppedOnIT();
            x.e(steppedOnIT, "getSteppedOnIT(...)");
            return steppedOnIT;
        }

        public final Toll getToll() {
            Toll toll = this._builder.getToll();
            x.e(toll, "getToll(...)");
            return toll;
        }

        public final RouteAttribute.TollForAvoiders getTollForAvoiders() {
            RouteAttribute.TollForAvoiders tollForAvoiders = this._builder.getTollForAvoiders();
            x.e(tollForAvoiders, "getTollForAvoiders(...)");
            return tollForAvoiders;
        }

        public final RouteAttribute.Unnatural getUnnatural() {
            RouteAttribute.Unnatural unnatural = this._builder.getUnnatural();
            x.e(unnatural, "getUnnatural(...)");
            return unnatural;
        }

        public final RouteAttribute.Unpaved getUnpaved() {
            RouteAttribute.Unpaved unpaved = this._builder.getUnpaved();
            x.e(unpaved, "getUnpaved(...)");
            return unpaved;
        }

        public final boolean hasBeacons() {
            return this._builder.hasBeacons();
        }

        public final boolean hasBlocked() {
            return this._builder.hasBlocked();
        }

        public final boolean hasBorderCrossing() {
            return this._builder.hasBorderCrossing();
        }

        public final boolean hasBypassesRestricted() {
            return this._builder.hasBypassesRestricted();
        }

        public final boolean hasDangerZone() {
            return this._builder.hasDangerZone();
        }

        public final boolean hasDangerousTurn() {
            return this._builder.hasDangerousTurn();
        }

        public final boolean hasEtaFromML() {
            return this._builder.hasEtaFromML();
        }

        public final boolean hasFerry() {
            return this._builder.hasFerry();
        }

        public final boolean hasHov() {
            return this._builder.hasHov();
        }

        public final boolean hasLicensePlateRestriction() {
            return this._builder.hasLicensePlateRestriction();
        }

        public final boolean hasPassNeeded() {
            return this._builder.hasPassNeeded();
        }

        public final boolean hasPrimaryForAvoiders() {
            return this._builder.hasPrimaryForAvoiders();
        }

        public final boolean hasPublicTransportation() {
            return this._builder.hasPublicTransportation();
        }

        public final boolean hasRestrictedArea() {
            return this._builder.hasRestrictedArea();
        }

        public final boolean hasSchoolArea() {
            return this._builder.hasSchoolArea();
        }

        public final boolean hasSteppedOnIT() {
            return this._builder.hasSteppedOnIT();
        }

        public final boolean hasToll() {
            return this._builder.hasToll();
        }

        public final boolean hasTollForAvoiders() {
            return this._builder.hasTollForAvoiders();
        }

        public final boolean hasUnnatural() {
            return this._builder.hasUnnatural();
        }

        public final boolean hasUnpaved() {
            return this._builder.hasUnpaved();
        }

        public final void setBeacons(RouteAttribute.Beacons beacons) {
            x.f(beacons, "value");
            this._builder.setBeacons(beacons);
        }

        public final void setBlocked(RouteAttribute.Blocked blocked) {
            x.f(blocked, "value");
            this._builder.setBlocked(blocked);
        }

        public final void setBorderCrossing(RouteAttribute.BorderCrossing borderCrossing) {
            x.f(borderCrossing, "value");
            this._builder.setBorderCrossing(borderCrossing);
        }

        public final void setBypassesRestricted(RouteAttribute.BypassesRestricted bypassesRestricted) {
            x.f(bypassesRestricted, "value");
            this._builder.setBypassesRestricted(bypassesRestricted);
        }

        public final void setDangerZone(RouteAttribute.DangerZone dangerZone) {
            x.f(dangerZone, "value");
            this._builder.setDangerZone(dangerZone);
        }

        public final void setDangerousTurn(RouteAttribute.DangerousTurn dangerousTurn) {
            x.f(dangerousTurn, "value");
            this._builder.setDangerousTurn(dangerousTurn);
        }

        public final void setEtaFromML(RouteAttribute.ETAFromML eTAFromML) {
            x.f(eTAFromML, "value");
            this._builder.setEtaFromML(eTAFromML);
        }

        public final void setFerry(RouteAttribute.Ferry ferry) {
            x.f(ferry, "value");
            this._builder.setFerry(ferry);
        }

        public final void setHov(Hov hov) {
            x.f(hov, "value");
            this._builder.setHov(hov);
        }

        public final void setLicensePlateRestriction(RouteAttribute.LicensePlateRestriction licensePlateRestriction) {
            x.f(licensePlateRestriction, "value");
            this._builder.setLicensePlateRestriction(licensePlateRestriction);
        }

        public final void setPassNeeded(RouteAttribute.PassNeeded passNeeded) {
            x.f(passNeeded, "value");
            this._builder.setPassNeeded(passNeeded);
        }

        public final void setPrimaryForAvoiders(RouteAttribute.PrimaryForAvoiders primaryForAvoiders) {
            x.f(primaryForAvoiders, "value");
            this._builder.setPrimaryForAvoiders(primaryForAvoiders);
        }

        public final void setPublicTransportation(RouteAttribute.PublicTransportation publicTransportation) {
            x.f(publicTransportation, "value");
            this._builder.setPublicTransportation(publicTransportation);
        }

        public final void setRestrictedArea(RouteAttribute.RestrictedArea restrictedArea) {
            x.f(restrictedArea, "value");
            this._builder.setRestrictedArea(restrictedArea);
        }

        public final void setSchoolArea(RouteAttribute.SchoolArea schoolArea) {
            x.f(schoolArea, "value");
            this._builder.setSchoolArea(schoolArea);
        }

        public final void setSteppedOnIT(RouteAttribute.SteppedOnIT steppedOnIT) {
            x.f(steppedOnIT, "value");
            this._builder.setSteppedOnIT(steppedOnIT);
        }

        public final void setToll(Toll toll) {
            x.f(toll, "value");
            this._builder.setToll(toll);
        }

        public final void setTollForAvoiders(RouteAttribute.TollForAvoiders tollForAvoiders) {
            x.f(tollForAvoiders, "value");
            this._builder.setTollForAvoiders(tollForAvoiders);
        }

        public final void setUnnatural(RouteAttribute.Unnatural unnatural) {
            x.f(unnatural, "value");
            this._builder.setUnnatural(unnatural);
        }

        public final void setUnpaved(RouteAttribute.Unpaved unpaved) {
            x.f(unpaved, "value");
            this._builder.setUnpaved(unpaved);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(RouteAttribute.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(RouteAttribute.Builder builder, o oVar) {
            this(builder);
        }
    }
}
