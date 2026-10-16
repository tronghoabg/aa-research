package com.waze.jni.protos;

import com.waze.jni.protos.NavigationInstruction;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationInstructionKt {
    public static final NavigationInstructionKt INSTANCE = new NavigationInstructionKt();

    private NavigationInstructionKt() {
    }

    /* renamed from: -initializeapproachingDestination, reason: not valid java name */
    public final NavigationInstruction.ApproachingDestination m25343initializeapproachingDestination(l<? super ApproachingDestinationKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ApproachingDestinationKt.Dsl.Companion companion = ApproachingDestinationKt.Dsl.Companion;
        NavigationInstruction.ApproachingDestination.Builder builderNewBuilder = NavigationInstruction.ApproachingDestination.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ApproachingDestinationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializecontinueStraight, reason: not valid java name */
    public final NavigationInstruction.ContinueStraight m25344initializecontinueStraight(l<? super ContinueStraightKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ContinueStraightKt.Dsl.Companion companion = ContinueStraightKt.Dsl.Companion;
        NavigationInstruction.ContinueStraight.Builder builderNewBuilder = NavigationInstruction.ContinueStraight.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ContinueStraightKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeexitLeft, reason: not valid java name */
    public final NavigationInstruction.ExitLeft m25345initializeexitLeft(l<? super ExitLeftKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ExitLeftKt.Dsl.Companion companion = ExitLeftKt.Dsl.Companion;
        NavigationInstruction.ExitLeft.Builder builderNewBuilder = NavigationInstruction.ExitLeft.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ExitLeftKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeexitRight, reason: not valid java name */
    public final NavigationInstruction.ExitRight m25346initializeexitRight(l<? super ExitRightKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ExitRightKt.Dsl.Companion companion = ExitRightKt.Dsl.Companion;
        NavigationInstruction.ExitRight.Builder builderNewBuilder = NavigationInstruction.ExitRight.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ExitRightKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializekeepLeft, reason: not valid java name */
    public final NavigationInstruction.KeepLeft m25347initializekeepLeft(l<? super KeepLeftKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        KeepLeftKt.Dsl.Companion companion = KeepLeftKt.Dsl.Companion;
        NavigationInstruction.KeepLeft.Builder builderNewBuilder = NavigationInstruction.KeepLeft.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        KeepLeftKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializekeepRight, reason: not valid java name */
    public final NavigationInstruction.KeepRight m25348initializekeepRight(l<? super KeepRightKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        KeepRightKt.Dsl.Companion companion = KeepRightKt.Dsl.Companion;
        NavigationInstruction.KeepRight.Builder builderNewBuilder = NavigationInstruction.KeepRight.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        KeepRightKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeroundaboutEnter, reason: not valid java name */
    public final NavigationInstruction.RoundaboutEnter m25349initializeroundaboutEnter(l<? super RoundaboutEnterKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RoundaboutEnterKt.Dsl.Companion companion = RoundaboutEnterKt.Dsl.Companion;
        NavigationInstruction.RoundaboutEnter.Builder builderNewBuilder = NavigationInstruction.RoundaboutEnter.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RoundaboutEnterKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeroundaboutExit, reason: not valid java name */
    public final NavigationInstruction.RoundaboutExit m25350initializeroundaboutExit(l<? super RoundaboutExitKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RoundaboutExitKt.Dsl.Companion companion = RoundaboutExitKt.Dsl.Companion;
        NavigationInstruction.RoundaboutExit.Builder builderNewBuilder = NavigationInstruction.RoundaboutExit.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RoundaboutExitKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeroundaboutExitLeft, reason: not valid java name */
    public final NavigationInstruction.RoundaboutExitLeft m25351initializeroundaboutExitLeft(l<? super RoundaboutExitLeftKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RoundaboutExitLeftKt.Dsl.Companion companion = RoundaboutExitLeftKt.Dsl.Companion;
        NavigationInstruction.RoundaboutExitLeft.Builder builderNewBuilder = NavigationInstruction.RoundaboutExitLeft.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RoundaboutExitLeftKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeroundaboutExitRight, reason: not valid java name */
    public final NavigationInstruction.RoundaboutExitRight m25352initializeroundaboutExitRight(l<? super RoundaboutExitRightKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RoundaboutExitRightKt.Dsl.Companion companion = RoundaboutExitRightKt.Dsl.Companion;
        NavigationInstruction.RoundaboutExitRight.Builder builderNewBuilder = NavigationInstruction.RoundaboutExitRight.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RoundaboutExitRightKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeroundaboutExitStraight, reason: not valid java name */
    public final NavigationInstruction.RoundaboutExitStraight m25353initializeroundaboutExitStraight(l<? super RoundaboutExitStraightKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RoundaboutExitStraightKt.Dsl.Companion companion = RoundaboutExitStraightKt.Dsl.Companion;
        NavigationInstruction.RoundaboutExitStraight.Builder builderNewBuilder = NavigationInstruction.RoundaboutExitStraight.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RoundaboutExitStraightKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeroundaboutExitU, reason: not valid java name */
    public final NavigationInstruction.RoundaboutExitU m25354initializeroundaboutExitU(l<? super RoundaboutExitUKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RoundaboutExitUKt.Dsl.Companion companion = RoundaboutExitUKt.Dsl.Companion;
        NavigationInstruction.RoundaboutExitU.Builder builderNewBuilder = NavigationInstruction.RoundaboutExitU.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RoundaboutExitUKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeroundaboutLeft, reason: not valid java name */
    public final NavigationInstruction.RoundaboutLeft m25355initializeroundaboutLeft(l<? super RoundaboutLeftKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RoundaboutLeftKt.Dsl.Companion companion = RoundaboutLeftKt.Dsl.Companion;
        NavigationInstruction.RoundaboutLeft.Builder builderNewBuilder = NavigationInstruction.RoundaboutLeft.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RoundaboutLeftKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeroundaboutRight, reason: not valid java name */
    public final NavigationInstruction.RoundaboutRight m25356initializeroundaboutRight(l<? super RoundaboutRightKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RoundaboutRightKt.Dsl.Companion companion = RoundaboutRightKt.Dsl.Companion;
        NavigationInstruction.RoundaboutRight.Builder builderNewBuilder = NavigationInstruction.RoundaboutRight.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RoundaboutRightKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeroundaboutStraight, reason: not valid java name */
    public final NavigationInstruction.RoundaboutStraight m25357initializeroundaboutStraight(l<? super RoundaboutStraightKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RoundaboutStraightKt.Dsl.Companion companion = RoundaboutStraightKt.Dsl.Companion;
        NavigationInstruction.RoundaboutStraight.Builder builderNewBuilder = NavigationInstruction.RoundaboutStraight.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RoundaboutStraightKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeroundaboutU, reason: not valid java name */
    public final NavigationInstruction.RoundaboutU m25358initializeroundaboutU(l<? super RoundaboutUKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RoundaboutUKt.Dsl.Companion companion = RoundaboutUKt.Dsl.Companion;
        NavigationInstruction.RoundaboutU.Builder builderNewBuilder = NavigationInstruction.RoundaboutU.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RoundaboutUKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeturnLeft, reason: not valid java name */
    public final NavigationInstruction.TurnLeft m25359initializeturnLeft(l<? super TurnLeftKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        TurnLeftKt.Dsl.Companion companion = TurnLeftKt.Dsl.Companion;
        NavigationInstruction.TurnLeft.Builder builderNewBuilder = NavigationInstruction.TurnLeft.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        TurnLeftKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeturnRight, reason: not valid java name */
    public final NavigationInstruction.TurnRight m25360initializeturnRight(l<? super TurnRightKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        TurnRightKt.Dsl.Companion companion = TurnRightKt.Dsl.Companion;
        NavigationInstruction.TurnRight.Builder builderNewBuilder = NavigationInstruction.TurnRight.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        TurnRightKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeuTurn, reason: not valid java name */
    public final NavigationInstruction.UTurn m25361initializeuTurn(l<? super UTurnKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        UTurnKt.Dsl.Companion companion = UTurnKt.Dsl.Companion;
        NavigationInstruction.UTurn.Builder builderNewBuilder = NavigationInstruction.UTurn.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        UTurnKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializewaypointDelay, reason: not valid java name */
    public final NavigationInstruction.WaypointDelay m25362initializewaypointDelay(l<? super WaypointDelayKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        WaypointDelayKt.Dsl.Companion companion = WaypointDelayKt.Dsl.Companion;
        NavigationInstruction.WaypointDelay.Builder builderNewBuilder = NavigationInstruction.WaypointDelay.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        WaypointDelayKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class ApproachingDestinationKt {
        public static final ApproachingDestinationKt INSTANCE = new ApproachingDestinationKt();

        private ApproachingDestinationKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.ApproachingDestination.Builder _builder;

            private Dsl(NavigationInstruction.ApproachingDestination.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.ApproachingDestination _build() {
                NavigationInstruction.ApproachingDestination approachingDestinationBuild = this._builder.build();
                x.e(approachingDestinationBuild, "build(...)");
                return approachingDestinationBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.ApproachingDestination.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.ApproachingDestination.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class ContinueStraightKt {
        public static final ContinueStraightKt INSTANCE = new ContinueStraightKt();

        private ContinueStraightKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.ContinueStraight.Builder _builder;

            private Dsl(NavigationInstruction.ContinueStraight.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.ContinueStraight _build() {
                NavigationInstruction.ContinueStraight continueStraightBuild = this._builder.build();
                x.e(continueStraightBuild, "build(...)");
                return continueStraightBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.ContinueStraight.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.ContinueStraight.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class ExitLeftKt {
        public static final ExitLeftKt INSTANCE = new ExitLeftKt();

        private ExitLeftKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.ExitLeft.Builder _builder;

            private Dsl(NavigationInstruction.ExitLeft.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.ExitLeft _build() {
                NavigationInstruction.ExitLeft exitLeftBuild = this._builder.build();
                x.e(exitLeftBuild, "build(...)");
                return exitLeftBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.ExitLeft.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.ExitLeft.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class ExitRightKt {
        public static final ExitRightKt INSTANCE = new ExitRightKt();

        private ExitRightKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.ExitRight.Builder _builder;

            private Dsl(NavigationInstruction.ExitRight.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.ExitRight _build() {
                NavigationInstruction.ExitRight exitRightBuild = this._builder.build();
                x.e(exitRightBuild, "build(...)");
                return exitRightBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.ExitRight.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.ExitRight.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class KeepLeftKt {
        public static final KeepLeftKt INSTANCE = new KeepLeftKt();

        private KeepLeftKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.KeepLeft.Builder _builder;

            private Dsl(NavigationInstruction.KeepLeft.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.KeepLeft _build() {
                NavigationInstruction.KeepLeft keepLeftBuild = this._builder.build();
                x.e(keepLeftBuild, "build(...)");
                return keepLeftBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.KeepLeft.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.KeepLeft.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class KeepRightKt {
        public static final KeepRightKt INSTANCE = new KeepRightKt();

        private KeepRightKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.KeepRight.Builder _builder;

            private Dsl(NavigationInstruction.KeepRight.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.KeepRight _build() {
                NavigationInstruction.KeepRight keepRightBuild = this._builder.build();
                x.e(keepRightBuild, "build(...)");
                return keepRightBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.KeepRight.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.KeepRight.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutEnterKt {
        public static final RoundaboutEnterKt INSTANCE = new RoundaboutEnterKt();

        private RoundaboutEnterKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.RoundaboutEnter.Builder _builder;

            private Dsl(NavigationInstruction.RoundaboutEnter.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.RoundaboutEnter _build() {
                NavigationInstruction.RoundaboutEnter roundaboutEnterBuild = this._builder.build();
                x.e(roundaboutEnterBuild, "build(...)");
                return roundaboutEnterBuild;
            }

            public final void clearRoundaboutExitNumber() {
                this._builder.clearRoundaboutExitNumber();
            }

            public final int getRoundaboutExitNumber() {
                return this._builder.getRoundaboutExitNumber();
            }

            public final boolean hasRoundaboutExitNumber() {
                return this._builder.hasRoundaboutExitNumber();
            }

            public final void setRoundaboutExitNumber(int i2) {
                this._builder.setRoundaboutExitNumber(i2);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.RoundaboutEnter.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.RoundaboutEnter.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutExitKt {
        public static final RoundaboutExitKt INSTANCE = new RoundaboutExitKt();

        private RoundaboutExitKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.RoundaboutExit.Builder _builder;

            private Dsl(NavigationInstruction.RoundaboutExit.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.RoundaboutExit _build() {
                NavigationInstruction.RoundaboutExit roundaboutExitBuild = this._builder.build();
                x.e(roundaboutExitBuild, "build(...)");
                return roundaboutExitBuild;
            }

            public final void clearRoundaboutExitNumber() {
                this._builder.clearRoundaboutExitNumber();
            }

            public final int getRoundaboutExitNumber() {
                return this._builder.getRoundaboutExitNumber();
            }

            public final boolean hasRoundaboutExitNumber() {
                return this._builder.hasRoundaboutExitNumber();
            }

            public final void setRoundaboutExitNumber(int i2) {
                this._builder.setRoundaboutExitNumber(i2);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.RoundaboutExit.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.RoundaboutExit.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutExitLeftKt {
        public static final RoundaboutExitLeftKt INSTANCE = new RoundaboutExitLeftKt();

        private RoundaboutExitLeftKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.RoundaboutExitLeft.Builder _builder;

            private Dsl(NavigationInstruction.RoundaboutExitLeft.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.RoundaboutExitLeft _build() {
                NavigationInstruction.RoundaboutExitLeft roundaboutExitLeftBuild = this._builder.build();
                x.e(roundaboutExitLeftBuild, "build(...)");
                return roundaboutExitLeftBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.RoundaboutExitLeft.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.RoundaboutExitLeft.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutExitRightKt {
        public static final RoundaboutExitRightKt INSTANCE = new RoundaboutExitRightKt();

        private RoundaboutExitRightKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.RoundaboutExitRight.Builder _builder;

            private Dsl(NavigationInstruction.RoundaboutExitRight.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.RoundaboutExitRight _build() {
                NavigationInstruction.RoundaboutExitRight roundaboutExitRightBuild = this._builder.build();
                x.e(roundaboutExitRightBuild, "build(...)");
                return roundaboutExitRightBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.RoundaboutExitRight.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.RoundaboutExitRight.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutExitStraightKt {
        public static final RoundaboutExitStraightKt INSTANCE = new RoundaboutExitStraightKt();

        private RoundaboutExitStraightKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.RoundaboutExitStraight.Builder _builder;

            private Dsl(NavigationInstruction.RoundaboutExitStraight.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.RoundaboutExitStraight _build() {
                NavigationInstruction.RoundaboutExitStraight roundaboutExitStraightBuild = this._builder.build();
                x.e(roundaboutExitStraightBuild, "build(...)");
                return roundaboutExitStraightBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.RoundaboutExitStraight.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.RoundaboutExitStraight.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutExitUKt {
        public static final RoundaboutExitUKt INSTANCE = new RoundaboutExitUKt();

        private RoundaboutExitUKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.RoundaboutExitU.Builder _builder;

            private Dsl(NavigationInstruction.RoundaboutExitU.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.RoundaboutExitU _build() {
                NavigationInstruction.RoundaboutExitU roundaboutExitUBuild = this._builder.build();
                x.e(roundaboutExitUBuild, "build(...)");
                return roundaboutExitUBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.RoundaboutExitU.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.RoundaboutExitU.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutLeftKt {
        public static final RoundaboutLeftKt INSTANCE = new RoundaboutLeftKt();

        private RoundaboutLeftKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.RoundaboutLeft.Builder _builder;

            private Dsl(NavigationInstruction.RoundaboutLeft.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.RoundaboutLeft _build() {
                NavigationInstruction.RoundaboutLeft roundaboutLeftBuild = this._builder.build();
                x.e(roundaboutLeftBuild, "build(...)");
                return roundaboutLeftBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.RoundaboutLeft.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.RoundaboutLeft.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutRightKt {
        public static final RoundaboutRightKt INSTANCE = new RoundaboutRightKt();

        private RoundaboutRightKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.RoundaboutRight.Builder _builder;

            private Dsl(NavigationInstruction.RoundaboutRight.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.RoundaboutRight _build() {
                NavigationInstruction.RoundaboutRight roundaboutRightBuild = this._builder.build();
                x.e(roundaboutRightBuild, "build(...)");
                return roundaboutRightBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.RoundaboutRight.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.RoundaboutRight.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutStraightKt {
        public static final RoundaboutStraightKt INSTANCE = new RoundaboutStraightKt();

        private RoundaboutStraightKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.RoundaboutStraight.Builder _builder;

            private Dsl(NavigationInstruction.RoundaboutStraight.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.RoundaboutStraight _build() {
                NavigationInstruction.RoundaboutStraight roundaboutStraightBuild = this._builder.build();
                x.e(roundaboutStraightBuild, "build(...)");
                return roundaboutStraightBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.RoundaboutStraight.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.RoundaboutStraight.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class RoundaboutUKt {
        public static final RoundaboutUKt INSTANCE = new RoundaboutUKt();

        private RoundaboutUKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.RoundaboutU.Builder _builder;

            private Dsl(NavigationInstruction.RoundaboutU.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.RoundaboutU _build() {
                NavigationInstruction.RoundaboutU roundaboutUBuild = this._builder.build();
                x.e(roundaboutUBuild, "build(...)");
                return roundaboutUBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.RoundaboutU.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.RoundaboutU.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class TurnLeftKt {
        public static final TurnLeftKt INSTANCE = new TurnLeftKt();

        private TurnLeftKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.TurnLeft.Builder _builder;

            private Dsl(NavigationInstruction.TurnLeft.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.TurnLeft _build() {
                NavigationInstruction.TurnLeft turnLeftBuild = this._builder.build();
                x.e(turnLeftBuild, "build(...)");
                return turnLeftBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.TurnLeft.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.TurnLeft.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class TurnRightKt {
        public static final TurnRightKt INSTANCE = new TurnRightKt();

        private TurnRightKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.TurnRight.Builder _builder;

            private Dsl(NavigationInstruction.TurnRight.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.TurnRight _build() {
                NavigationInstruction.TurnRight turnRightBuild = this._builder.build();
                x.e(turnRightBuild, "build(...)");
                return turnRightBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.TurnRight.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.TurnRight.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class UTurnKt {
        public static final UTurnKt INSTANCE = new UTurnKt();

        private UTurnKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.UTurn.Builder _builder;

            private Dsl(NavigationInstruction.UTurn.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.UTurn _build() {
                NavigationInstruction.UTurn uTurnBuild = this._builder.build();
                x.e(uTurnBuild, "build(...)");
                return uTurnBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.UTurn.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.UTurn.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class WaypointDelayKt {
        public static final WaypointDelayKt INSTANCE = new WaypointDelayKt();

        private WaypointDelayKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final NavigationInstruction.WaypointDelay.Builder _builder;

            private Dsl(NavigationInstruction.WaypointDelay.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ NavigationInstruction.WaypointDelay _build() {
                NavigationInstruction.WaypointDelay waypointDelayBuild = this._builder.build();
                x.e(waypointDelayBuild, "build(...)");
                return waypointDelayBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(NavigationInstruction.WaypointDelay.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(NavigationInstruction.WaypointDelay.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NavigationInstruction.Builder _builder;

        private Dsl(NavigationInstruction.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NavigationInstruction _build() {
            NavigationInstruction navigationInstructionBuild = this._builder.build();
            x.e(navigationInstructionBuild, "build(...)");
            return navigationInstructionBuild;
        }

        public final void clearApproachingDestination() {
            this._builder.clearApproachingDestination();
        }

        public final void clearContinueStraight() {
            this._builder.clearContinueStraight();
        }

        public final void clearExitLeft() {
            this._builder.clearExitLeft();
        }

        public final void clearExitRight() {
            this._builder.clearExitRight();
        }

        public final void clearInstruction() {
            this._builder.clearInstruction();
        }

        public final void clearKeepLeft() {
            this._builder.clearKeepLeft();
        }

        public final void clearKeepRight() {
            this._builder.clearKeepRight();
        }

        public final void clearRoundaboutEnter() {
            this._builder.clearRoundaboutEnter();
        }

        public final void clearRoundaboutExit() {
            this._builder.clearRoundaboutExit();
        }

        public final void clearRoundaboutExitLeft() {
            this._builder.clearRoundaboutExitLeft();
        }

        public final void clearRoundaboutExitRight() {
            this._builder.clearRoundaboutExitRight();
        }

        public final void clearRoundaboutExitStraight() {
            this._builder.clearRoundaboutExitStraight();
        }

        public final void clearRoundaboutExitU() {
            this._builder.clearRoundaboutExitU();
        }

        public final void clearRoundaboutLeft() {
            this._builder.clearRoundaboutLeft();
        }

        public final void clearRoundaboutRight() {
            this._builder.clearRoundaboutRight();
        }

        public final void clearRoundaboutStraight() {
            this._builder.clearRoundaboutStraight();
        }

        public final void clearRoundaboutU() {
            this._builder.clearRoundaboutU();
        }

        public final void clearTurnLeft() {
            this._builder.clearTurnLeft();
        }

        public final void clearTurnRight() {
            this._builder.clearTurnRight();
        }

        public final void clearUTurn() {
            this._builder.clearUTurn();
        }

        public final void clearWaypointDelay() {
            this._builder.clearWaypointDelay();
        }

        public final NavigationInstruction.ApproachingDestination getApproachingDestination() {
            NavigationInstruction.ApproachingDestination approachingDestination = this._builder.getApproachingDestination();
            x.e(approachingDestination, "getApproachingDestination(...)");
            return approachingDestination;
        }

        public final NavigationInstruction.ContinueStraight getContinueStraight() {
            NavigationInstruction.ContinueStraight continueStraight = this._builder.getContinueStraight();
            x.e(continueStraight, "getContinueStraight(...)");
            return continueStraight;
        }

        public final NavigationInstruction.ExitLeft getExitLeft() {
            NavigationInstruction.ExitLeft exitLeft = this._builder.getExitLeft();
            x.e(exitLeft, "getExitLeft(...)");
            return exitLeft;
        }

        public final NavigationInstruction.ExitRight getExitRight() {
            NavigationInstruction.ExitRight exitRight = this._builder.getExitRight();
            x.e(exitRight, "getExitRight(...)");
            return exitRight;
        }

        public final NavigationInstruction.InstructionCase getInstructionCase() {
            NavigationInstruction.InstructionCase instructionCase = this._builder.getInstructionCase();
            x.e(instructionCase, "getInstructionCase(...)");
            return instructionCase;
        }

        public final NavigationInstruction.KeepLeft getKeepLeft() {
            NavigationInstruction.KeepLeft keepLeft = this._builder.getKeepLeft();
            x.e(keepLeft, "getKeepLeft(...)");
            return keepLeft;
        }

        public final NavigationInstruction.KeepRight getKeepRight() {
            NavigationInstruction.KeepRight keepRight = this._builder.getKeepRight();
            x.e(keepRight, "getKeepRight(...)");
            return keepRight;
        }

        public final NavigationInstruction.RoundaboutEnter getRoundaboutEnter() {
            NavigationInstruction.RoundaboutEnter roundaboutEnter = this._builder.getRoundaboutEnter();
            x.e(roundaboutEnter, "getRoundaboutEnter(...)");
            return roundaboutEnter;
        }

        public final NavigationInstruction.RoundaboutExit getRoundaboutExit() {
            NavigationInstruction.RoundaboutExit roundaboutExit = this._builder.getRoundaboutExit();
            x.e(roundaboutExit, "getRoundaboutExit(...)");
            return roundaboutExit;
        }

        public final NavigationInstruction.RoundaboutExitLeft getRoundaboutExitLeft() {
            NavigationInstruction.RoundaboutExitLeft roundaboutExitLeft = this._builder.getRoundaboutExitLeft();
            x.e(roundaboutExitLeft, "getRoundaboutExitLeft(...)");
            return roundaboutExitLeft;
        }

        public final NavigationInstruction.RoundaboutExitRight getRoundaboutExitRight() {
            NavigationInstruction.RoundaboutExitRight roundaboutExitRight = this._builder.getRoundaboutExitRight();
            x.e(roundaboutExitRight, "getRoundaboutExitRight(...)");
            return roundaboutExitRight;
        }

        public final NavigationInstruction.RoundaboutExitStraight getRoundaboutExitStraight() {
            NavigationInstruction.RoundaboutExitStraight roundaboutExitStraight = this._builder.getRoundaboutExitStraight();
            x.e(roundaboutExitStraight, "getRoundaboutExitStraight(...)");
            return roundaboutExitStraight;
        }

        public final NavigationInstruction.RoundaboutExitU getRoundaboutExitU() {
            NavigationInstruction.RoundaboutExitU roundaboutExitU = this._builder.getRoundaboutExitU();
            x.e(roundaboutExitU, "getRoundaboutExitU(...)");
            return roundaboutExitU;
        }

        public final NavigationInstruction.RoundaboutLeft getRoundaboutLeft() {
            NavigationInstruction.RoundaboutLeft roundaboutLeft = this._builder.getRoundaboutLeft();
            x.e(roundaboutLeft, "getRoundaboutLeft(...)");
            return roundaboutLeft;
        }

        public final NavigationInstruction.RoundaboutRight getRoundaboutRight() {
            NavigationInstruction.RoundaboutRight roundaboutRight = this._builder.getRoundaboutRight();
            x.e(roundaboutRight, "getRoundaboutRight(...)");
            return roundaboutRight;
        }

        public final NavigationInstruction.RoundaboutStraight getRoundaboutStraight() {
            NavigationInstruction.RoundaboutStraight roundaboutStraight = this._builder.getRoundaboutStraight();
            x.e(roundaboutStraight, "getRoundaboutStraight(...)");
            return roundaboutStraight;
        }

        public final NavigationInstruction.RoundaboutU getRoundaboutU() {
            NavigationInstruction.RoundaboutU roundaboutU = this._builder.getRoundaboutU();
            x.e(roundaboutU, "getRoundaboutU(...)");
            return roundaboutU;
        }

        public final NavigationInstruction.TurnLeft getTurnLeft() {
            NavigationInstruction.TurnLeft turnLeft = this._builder.getTurnLeft();
            x.e(turnLeft, "getTurnLeft(...)");
            return turnLeft;
        }

        public final NavigationInstruction.TurnRight getTurnRight() {
            NavigationInstruction.TurnRight turnRight = this._builder.getTurnRight();
            x.e(turnRight, "getTurnRight(...)");
            return turnRight;
        }

        public final NavigationInstruction.UTurn getUTurn() {
            NavigationInstruction.UTurn uTurn = this._builder.getUTurn();
            x.e(uTurn, "getUTurn(...)");
            return uTurn;
        }

        public final NavigationInstruction.WaypointDelay getWaypointDelay() {
            NavigationInstruction.WaypointDelay waypointDelay = this._builder.getWaypointDelay();
            x.e(waypointDelay, "getWaypointDelay(...)");
            return waypointDelay;
        }

        public final boolean hasApproachingDestination() {
            return this._builder.hasApproachingDestination();
        }

        public final boolean hasContinueStraight() {
            return this._builder.hasContinueStraight();
        }

        public final boolean hasExitLeft() {
            return this._builder.hasExitLeft();
        }

        public final boolean hasExitRight() {
            return this._builder.hasExitRight();
        }

        public final boolean hasKeepLeft() {
            return this._builder.hasKeepLeft();
        }

        public final boolean hasKeepRight() {
            return this._builder.hasKeepRight();
        }

        public final boolean hasRoundaboutEnter() {
            return this._builder.hasRoundaboutEnter();
        }

        public final boolean hasRoundaboutExit() {
            return this._builder.hasRoundaboutExit();
        }

        public final boolean hasRoundaboutExitLeft() {
            return this._builder.hasRoundaboutExitLeft();
        }

        public final boolean hasRoundaboutExitRight() {
            return this._builder.hasRoundaboutExitRight();
        }

        public final boolean hasRoundaboutExitStraight() {
            return this._builder.hasRoundaboutExitStraight();
        }

        public final boolean hasRoundaboutExitU() {
            return this._builder.hasRoundaboutExitU();
        }

        public final boolean hasRoundaboutLeft() {
            return this._builder.hasRoundaboutLeft();
        }

        public final boolean hasRoundaboutRight() {
            return this._builder.hasRoundaboutRight();
        }

        public final boolean hasRoundaboutStraight() {
            return this._builder.hasRoundaboutStraight();
        }

        public final boolean hasRoundaboutU() {
            return this._builder.hasRoundaboutU();
        }

        public final boolean hasTurnLeft() {
            return this._builder.hasTurnLeft();
        }

        public final boolean hasTurnRight() {
            return this._builder.hasTurnRight();
        }

        public final boolean hasUTurn() {
            return this._builder.hasUTurn();
        }

        public final boolean hasWaypointDelay() {
            return this._builder.hasWaypointDelay();
        }

        public final void setApproachingDestination(NavigationInstruction.ApproachingDestination approachingDestination) {
            x.f(approachingDestination, "value");
            this._builder.setApproachingDestination(approachingDestination);
        }

        public final void setContinueStraight(NavigationInstruction.ContinueStraight continueStraight) {
            x.f(continueStraight, "value");
            this._builder.setContinueStraight(continueStraight);
        }

        public final void setExitLeft(NavigationInstruction.ExitLeft exitLeft) {
            x.f(exitLeft, "value");
            this._builder.setExitLeft(exitLeft);
        }

        public final void setExitRight(NavigationInstruction.ExitRight exitRight) {
            x.f(exitRight, "value");
            this._builder.setExitRight(exitRight);
        }

        public final void setKeepLeft(NavigationInstruction.KeepLeft keepLeft) {
            x.f(keepLeft, "value");
            this._builder.setKeepLeft(keepLeft);
        }

        public final void setKeepRight(NavigationInstruction.KeepRight keepRight) {
            x.f(keepRight, "value");
            this._builder.setKeepRight(keepRight);
        }

        public final void setRoundaboutEnter(NavigationInstruction.RoundaboutEnter roundaboutEnter) {
            x.f(roundaboutEnter, "value");
            this._builder.setRoundaboutEnter(roundaboutEnter);
        }

        public final void setRoundaboutExit(NavigationInstruction.RoundaboutExit roundaboutExit) {
            x.f(roundaboutExit, "value");
            this._builder.setRoundaboutExit(roundaboutExit);
        }

        public final void setRoundaboutExitLeft(NavigationInstruction.RoundaboutExitLeft roundaboutExitLeft) {
            x.f(roundaboutExitLeft, "value");
            this._builder.setRoundaboutExitLeft(roundaboutExitLeft);
        }

        public final void setRoundaboutExitRight(NavigationInstruction.RoundaboutExitRight roundaboutExitRight) {
            x.f(roundaboutExitRight, "value");
            this._builder.setRoundaboutExitRight(roundaboutExitRight);
        }

        public final void setRoundaboutExitStraight(NavigationInstruction.RoundaboutExitStraight roundaboutExitStraight) {
            x.f(roundaboutExitStraight, "value");
            this._builder.setRoundaboutExitStraight(roundaboutExitStraight);
        }

        public final void setRoundaboutExitU(NavigationInstruction.RoundaboutExitU roundaboutExitU) {
            x.f(roundaboutExitU, "value");
            this._builder.setRoundaboutExitU(roundaboutExitU);
        }

        public final void setRoundaboutLeft(NavigationInstruction.RoundaboutLeft roundaboutLeft) {
            x.f(roundaboutLeft, "value");
            this._builder.setRoundaboutLeft(roundaboutLeft);
        }

        public final void setRoundaboutRight(NavigationInstruction.RoundaboutRight roundaboutRight) {
            x.f(roundaboutRight, "value");
            this._builder.setRoundaboutRight(roundaboutRight);
        }

        public final void setRoundaboutStraight(NavigationInstruction.RoundaboutStraight roundaboutStraight) {
            x.f(roundaboutStraight, "value");
            this._builder.setRoundaboutStraight(roundaboutStraight);
        }

        public final void setRoundaboutU(NavigationInstruction.RoundaboutU roundaboutU) {
            x.f(roundaboutU, "value");
            this._builder.setRoundaboutU(roundaboutU);
        }

        public final void setTurnLeft(NavigationInstruction.TurnLeft turnLeft) {
            x.f(turnLeft, "value");
            this._builder.setTurnLeft(turnLeft);
        }

        public final void setTurnRight(NavigationInstruction.TurnRight turnRight) {
            x.f(turnRight, "value");
            this._builder.setTurnRight(turnRight);
        }

        public final void setUTurn(NavigationInstruction.UTurn uTurn) {
            x.f(uTurn, "value");
            this._builder.setUTurn(uTurn);
        }

        public final void setWaypointDelay(NavigationInstruction.WaypointDelay waypointDelay) {
            x.f(waypointDelay, "value");
            this._builder.setWaypointDelay(waypointDelay);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NavigationInstruction.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NavigationInstruction.Builder builder, o oVar) {
            this(builder);
        }
    }
}
