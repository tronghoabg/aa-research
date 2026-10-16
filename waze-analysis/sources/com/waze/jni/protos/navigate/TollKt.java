package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.Toll;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TollKt {
    public static final TollKt INSTANCE = new TollKt();

    /* compiled from: WazeSource */
    public final class MissingPassKt {
        public static final MissingPassKt INSTANCE = new MissingPassKt();

        private MissingPassKt() {
        }

        /* renamed from: -initializepriceInfo, reason: not valid java name */
        public final Toll.MissingPass.PriceInfo m27747initializepriceInfo(l<? super PriceInfoKt.Dsl, ab> lVar) {
            x.f(lVar, "block");
            PriceInfoKt.Dsl.Companion companion = PriceInfoKt.Dsl.Companion;
            Toll.MissingPass.PriceInfo.Builder builderNewBuilder = Toll.MissingPass.PriceInfo.newBuilder();
            x.e(builderNewBuilder, "newBuilder(...)");
            PriceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
            lVar.invoke(dsl_create);
            return dsl_create._build();
        }

        /* compiled from: WazeSource */
        public final class PriceInfoKt {
            public static final PriceInfoKt INSTANCE = new PriceInfoKt();

            private PriceInfoKt() {
            }

            /* compiled from: WazeSource */
            public final class Dsl {
                public static final Companion Companion = new Companion(null);
                private final Toll.MissingPass.PriceInfo.Builder _builder;

                private Dsl(Toll.MissingPass.PriceInfo.Builder builder) {
                    this._builder = builder;
                }

                public final /* synthetic */ Toll.MissingPass.PriceInfo _build() {
                    Toll.MissingPass.PriceInfo priceInfoBuild = this._builder.build();
                    x.e(priceInfoBuild, "build(...)");
                    return priceInfoBuild;
                }

                public final void clearFixedPrice() {
                    this._builder.clearFixedPrice();
                }

                public final void clearPassPrice() {
                    this._builder.clearPassPrice();
                }

                public final Toll.FixedPrice getFixedPrice() {
                    Toll.FixedPrice fixedPrice = this._builder.getFixedPrice();
                    x.e(fixedPrice, "getFixedPrice(...)");
                    return fixedPrice;
                }

                public final Toll.FixedPrice getFixedPriceOrNull(Dsl dsl) {
                    x.f(dsl, "<this>");
                    return TollKtKt.getFixedPriceOrNull(dsl._builder);
                }

                public final double getPassPrice() {
                    return this._builder.getPassPrice();
                }

                public final boolean hasFixedPrice() {
                    return this._builder.hasFixedPrice();
                }

                public final void setFixedPrice(Toll.FixedPrice fixedPrice) {
                    x.f(fixedPrice, "value");
                    this._builder.setFixedPrice(fixedPrice);
                }

                public final void setPassPrice(double d2) {
                    this._builder.setPassPrice(d2);
                }

                /* compiled from: WazeSource */
                public final class Companion {
                    private Companion() {
                    }

                    public final /* synthetic */ Dsl _create(Toll.MissingPass.PriceInfo.Builder builder) {
                        x.f(builder, "builder");
                        return new Dsl(builder, null);
                    }

                    public /* synthetic */ Companion(o oVar) {
                        this();
                    }
                }

                public /* synthetic */ Dsl(Toll.MissingPass.PriceInfo.Builder builder, o oVar) {
                    this(builder);
                }
            }
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final Toll.MissingPass.Builder _builder;

            private Dsl(Toll.MissingPass.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ Toll.MissingPass _build() {
                Toll.MissingPass missingPassBuild = this._builder.build();
                x.e(missingPassBuild, "build(...)");
                return missingPassBuild;
            }

            public final void clearMissingPassName() {
                this._builder.clearMissingPassName();
            }

            public final void clearPriceInfo() {
                this._builder.clearPriceInfo();
            }

            public final String getMissingPassName() {
                String missingPassName = this._builder.getMissingPassName();
                x.e(missingPassName, "getMissingPassName(...)");
                return missingPassName;
            }

            public final Toll.MissingPass.PriceInfo getPriceInfo() {
                Toll.MissingPass.PriceInfo priceInfo = this._builder.getPriceInfo();
                x.e(priceInfo, "getPriceInfo(...)");
                return priceInfo;
            }

            public final Toll.MissingPass.PriceInfo getPriceInfoOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return TollKtKt.getPriceInfoOrNull(dsl._builder);
            }

            public final boolean hasPriceInfo() {
                return this._builder.hasPriceInfo();
            }

            public final void setMissingPassName(String str) {
                x.f(str, "value");
                this._builder.setMissingPassName(str);
            }

            public final void setPriceInfo(Toll.MissingPass.PriceInfo priceInfo) {
                x.f(priceInfo, "value");
                this._builder.setPriceInfo(priceInfo);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Toll.MissingPass.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(Toll.MissingPass.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    private TollKt() {
    }

    /* renamed from: -initializedisabled, reason: not valid java name */
    public final Toll.Disabled m27739initializedisabled(l<? super DisabledKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        DisabledKt.Dsl.Companion companion = DisabledKt.Dsl.Companion;
        Toll.Disabled.Builder builderNewBuilder = Toll.Disabled.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        DisabledKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializedynamicPrice, reason: not valid java name */
    public final Toll.DynamicPrice m27740initializedynamicPrice(l<? super DynamicPriceKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        DynamicPriceKt.Dsl.Companion companion = DynamicPriceKt.Dsl.Companion;
        Toll.DynamicPrice.Builder builderNewBuilder = Toll.DynamicPrice.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        DynamicPriceKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializefixedPrice, reason: not valid java name */
    public final Toll.FixedPrice m27741initializefixedPrice(l<? super FixedPriceKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        FixedPriceKt.Dsl.Companion companion = FixedPriceKt.Dsl.Companion;
        Toll.FixedPrice.Builder builderNewBuilder = Toll.FixedPrice.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        FixedPriceKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializemissingPass, reason: not valid java name */
    public final Toll.MissingPass m27742initializemissingPass(l<? super MissingPassKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MissingPassKt.Dsl.Companion companion = MissingPassKt.Dsl.Companion;
        Toll.MissingPass.Builder builderNewBuilder = Toll.MissingPass.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MissingPassKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializenoPrice, reason: not valid java name */
    public final Toll.NoPrice m27743initializenoPrice(l<? super NoPriceKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NoPriceKt.Dsl.Companion companion = NoPriceKt.Dsl.Companion;
        Toll.NoPrice.Builder builderNewBuilder = Toll.NoPrice.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NoPriceKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializepriceChangeAtTime, reason: not valid java name */
    public final Toll.PriceChangeAtTime m27744initializepriceChangeAtTime(l<? super PriceChangeAtTimeKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PriceChangeAtTimeKt.Dsl.Companion companion = PriceChangeAtTimeKt.Dsl.Companion;
        Toll.PriceChangeAtTime.Builder builderNewBuilder = Toll.PriceChangeAtTime.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PriceChangeAtTimeKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializepriceChangingByTime, reason: not valid java name */
    public final Toll.PriceChangingByTime m27745initializepriceChangingByTime(l<? super PriceChangingByTimeKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PriceChangingByTimeKt.Dsl.Companion companion = PriceChangingByTimeKt.Dsl.Companion;
        Toll.PriceChangingByTime.Builder builderNewBuilder = Toll.PriceChangingByTime.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PriceChangingByTimeKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializewithPass, reason: not valid java name */
    public final Toll.WithPass m27746initializewithPass(l<? super WithPassKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        WithPassKt.Dsl.Companion companion = WithPassKt.Dsl.Companion;
        Toll.WithPass.Builder builderNewBuilder = Toll.WithPass.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        WithPassKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class DisabledKt {
        public static final DisabledKt INSTANCE = new DisabledKt();

        private DisabledKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final Toll.Disabled.Builder _builder;

            private Dsl(Toll.Disabled.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ Toll.Disabled _build() {
                Toll.Disabled disabledBuild = this._builder.build();
                x.e(disabledBuild, "build(...)");
                return disabledBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Toll.Disabled.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(Toll.Disabled.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class DynamicPriceKt {
        public static final DynamicPriceKt INSTANCE = new DynamicPriceKt();

        private DynamicPriceKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final Toll.DynamicPrice.Builder _builder;

            private Dsl(Toll.DynamicPrice.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ Toll.DynamicPrice _build() {
                Toll.DynamicPrice dynamicPriceBuild = this._builder.build();
                x.e(dynamicPriceBuild, "build(...)");
                return dynamicPriceBuild;
            }

            public final void clearPriceShown() {
                this._builder.clearPriceShown();
            }

            public final boolean getPriceShown() {
                return this._builder.getPriceShown();
            }

            public final void setPriceShown(boolean z) {
                this._builder.setPriceShown(z);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Toll.DynamicPrice.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(Toll.DynamicPrice.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class FixedPriceKt {
        public static final FixedPriceKt INSTANCE = new FixedPriceKt();

        private FixedPriceKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final Toll.FixedPrice.Builder _builder;

            private Dsl(Toll.FixedPrice.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ Toll.FixedPrice _build() {
                Toll.FixedPrice fixedPriceBuild = this._builder.build();
                x.e(fixedPriceBuild, "build(...)");
                return fixedPriceBuild;
            }

            public final void clearTollPrice() {
                this._builder.clearTollPrice();
            }

            public final void clearTollPriceCurrencyCode() {
                this._builder.clearTollPriceCurrencyCode();
            }

            public final double getTollPrice() {
                return this._builder.getTollPrice();
            }

            public final String getTollPriceCurrencyCode() {
                String tollPriceCurrencyCode = this._builder.getTollPriceCurrencyCode();
                x.e(tollPriceCurrencyCode, "getTollPriceCurrencyCode(...)");
                return tollPriceCurrencyCode;
            }

            public final boolean hasTollPrice() {
                return this._builder.hasTollPrice();
            }

            public final boolean hasTollPriceCurrencyCode() {
                return this._builder.hasTollPriceCurrencyCode();
            }

            public final void setTollPrice(double d2) {
                this._builder.setTollPrice(d2);
            }

            public final void setTollPriceCurrencyCode(String str) {
                x.f(str, "value");
                this._builder.setTollPriceCurrencyCode(str);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Toll.FixedPrice.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(Toll.FixedPrice.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class NoPriceKt {
        public static final NoPriceKt INSTANCE = new NoPriceKt();

        private NoPriceKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final Toll.NoPrice.Builder _builder;

            private Dsl(Toll.NoPrice.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ Toll.NoPrice _build() {
                Toll.NoPrice noPriceBuild = this._builder.build();
                x.e(noPriceBuild, "build(...)");
                return noPriceBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Toll.NoPrice.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(Toll.NoPrice.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class PriceChangeAtTimeKt {
        public static final PriceChangeAtTimeKt INSTANCE = new PriceChangeAtTimeKt();

        private PriceChangeAtTimeKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final Toll.PriceChangeAtTime.Builder _builder;

            private Dsl(Toll.PriceChangeAtTime.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ Toll.PriceChangeAtTime _build() {
                Toll.PriceChangeAtTime priceChangeAtTimeBuild = this._builder.build();
                x.e(priceChangeAtTimeBuild, "build(...)");
                return priceChangeAtTimeBuild;
            }

            public final void clearFixedPrice() {
                this._builder.clearFixedPrice();
            }

            public final void clearRoadName() {
                this._builder.clearRoadName();
            }

            public final void clearTimeBasedPrice() {
                this._builder.clearTimeBasedPrice();
            }

            public final void clearTimeBasedPriceChangeAtSeconds() {
                this._builder.clearTimeBasedPriceChangeAtSeconds();
            }

            public final Toll.FixedPrice getFixedPrice() {
                Toll.FixedPrice fixedPrice = this._builder.getFixedPrice();
                x.e(fixedPrice, "getFixedPrice(...)");
                return fixedPrice;
            }

            public final Toll.FixedPrice getFixedPriceOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return TollKtKt.getFixedPriceOrNull(dsl._builder);
            }

            public final String getRoadName() {
                String roadName = this._builder.getRoadName();
                x.e(roadName, "getRoadName(...)");
                return roadName;
            }

            public final double getTimeBasedPrice() {
                return this._builder.getTimeBasedPrice();
            }

            public final int getTimeBasedPriceChangeAtSeconds() {
                return this._builder.getTimeBasedPriceChangeAtSeconds();
            }

            public final boolean hasFixedPrice() {
                return this._builder.hasFixedPrice();
            }

            public final void setFixedPrice(Toll.FixedPrice fixedPrice) {
                x.f(fixedPrice, "value");
                this._builder.setFixedPrice(fixedPrice);
            }

            public final void setRoadName(String str) {
                x.f(str, "value");
                this._builder.setRoadName(str);
            }

            public final void setTimeBasedPrice(double d2) {
                this._builder.setTimeBasedPrice(d2);
            }

            public final void setTimeBasedPriceChangeAtSeconds(int i2) {
                this._builder.setTimeBasedPriceChangeAtSeconds(i2);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Toll.PriceChangeAtTime.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(Toll.PriceChangeAtTime.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class PriceChangingByTimeKt {
        public static final PriceChangingByTimeKt INSTANCE = new PriceChangingByTimeKt();

        private PriceChangingByTimeKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final Toll.PriceChangingByTime.Builder _builder;

            private Dsl(Toll.PriceChangingByTime.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ Toll.PriceChangingByTime _build() {
                Toll.PriceChangingByTime priceChangingByTimeBuild = this._builder.build();
                x.e(priceChangingByTimeBuild, "build(...)");
                return priceChangingByTimeBuild;
            }

            public final void clearRoadName() {
                this._builder.clearRoadName();
            }

            public final String getRoadName() {
                String roadName = this._builder.getRoadName();
                x.e(roadName, "getRoadName(...)");
                return roadName;
            }

            public final void setRoadName(String str) {
                x.f(str, "value");
                this._builder.setRoadName(str);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Toll.PriceChangingByTime.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(Toll.PriceChangingByTime.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class WithPassKt {
        public static final WithPassKt INSTANCE = new WithPassKt();

        private WithPassKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final Toll.WithPass.Builder _builder;

            private Dsl(Toll.WithPass.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ Toll.WithPass _build() {
                Toll.WithPass withPassBuild = this._builder.build();
                x.e(withPassBuild, "build(...)");
                return withPassBuild;
            }

            public final void clearFixedPrice() {
                this._builder.clearFixedPrice();
            }

            public final void clearName() {
                this._builder.clearName();
            }

            public final Toll.FixedPrice getFixedPrice() {
                Toll.FixedPrice fixedPrice = this._builder.getFixedPrice();
                x.e(fixedPrice, "getFixedPrice(...)");
                return fixedPrice;
            }

            public final Toll.FixedPrice getFixedPriceOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return TollKtKt.getFixedPriceOrNull(dsl._builder);
            }

            public final String getName() {
                String name = this._builder.getName();
                x.e(name, "getName(...)");
                return name;
            }

            public final boolean hasFixedPrice() {
                return this._builder.hasFixedPrice();
            }

            public final void setFixedPrice(Toll.FixedPrice fixedPrice) {
                x.f(fixedPrice, "value");
                this._builder.setFixedPrice(fixedPrice);
            }

            public final void setName(String str) {
                x.f(str, "value");
                this._builder.setName(str);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Toll.WithPass.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(Toll.WithPass.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Toll.Builder _builder;

        private Dsl(Toll.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Toll _build() {
            Toll tollBuild = this._builder.build();
            x.e(tollBuild, "build(...)");
            return tollBuild;
        }

        public final void clearDisabled() {
            this._builder.clearDisabled();
        }

        public final void clearDynamicPrice() {
            this._builder.clearDynamicPrice();
        }

        public final void clearFixedPrice() {
            this._builder.clearFixedPrice();
        }

        public final void clearMissingPass() {
            this._builder.clearMissingPass();
        }

        public final void clearNoPrice() {
            this._builder.clearNoPrice();
        }

        public final void clearPriceChangedAtTime() {
            this._builder.clearPriceChangedAtTime();
        }

        public final void clearPriceChangedByTime() {
            this._builder.clearPriceChangedByTime();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final void clearWithPass() {
            this._builder.clearWithPass();
        }

        public final Toll.Disabled getDisabled() {
            Toll.Disabled disabled = this._builder.getDisabled();
            x.e(disabled, "getDisabled(...)");
            return disabled;
        }

        public final Toll.DynamicPrice getDynamicPrice() {
            Toll.DynamicPrice dynamicPrice = this._builder.getDynamicPrice();
            x.e(dynamicPrice, "getDynamicPrice(...)");
            return dynamicPrice;
        }

        public final Toll.FixedPrice getFixedPrice() {
            Toll.FixedPrice fixedPrice = this._builder.getFixedPrice();
            x.e(fixedPrice, "getFixedPrice(...)");
            return fixedPrice;
        }

        public final Toll.MissingPass getMissingPass() {
            Toll.MissingPass missingPass = this._builder.getMissingPass();
            x.e(missingPass, "getMissingPass(...)");
            return missingPass;
        }

        public final Toll.NoPrice getNoPrice() {
            Toll.NoPrice noPrice = this._builder.getNoPrice();
            x.e(noPrice, "getNoPrice(...)");
            return noPrice;
        }

        public final Toll.PriceChangeAtTime getPriceChangedAtTime() {
            Toll.PriceChangeAtTime priceChangedAtTime = this._builder.getPriceChangedAtTime();
            x.e(priceChangedAtTime, "getPriceChangedAtTime(...)");
            return priceChangedAtTime;
        }

        public final Toll.PriceChangingByTime getPriceChangedByTime() {
            Toll.PriceChangingByTime priceChangedByTime = this._builder.getPriceChangedByTime();
            x.e(priceChangedByTime, "getPriceChangedByTime(...)");
            return priceChangedByTime;
        }

        public final Toll.TypeCase getTypeCase() {
            Toll.TypeCase typeCase = this._builder.getTypeCase();
            x.e(typeCase, "getTypeCase(...)");
            return typeCase;
        }

        public final Toll.WithPass getWithPass() {
            Toll.WithPass withPass = this._builder.getWithPass();
            x.e(withPass, "getWithPass(...)");
            return withPass;
        }

        public final boolean hasDisabled() {
            return this._builder.hasDisabled();
        }

        public final boolean hasDynamicPrice() {
            return this._builder.hasDynamicPrice();
        }

        public final boolean hasFixedPrice() {
            return this._builder.hasFixedPrice();
        }

        public final boolean hasMissingPass() {
            return this._builder.hasMissingPass();
        }

        public final boolean hasNoPrice() {
            return this._builder.hasNoPrice();
        }

        public final boolean hasPriceChangedAtTime() {
            return this._builder.hasPriceChangedAtTime();
        }

        public final boolean hasPriceChangedByTime() {
            return this._builder.hasPriceChangedByTime();
        }

        public final boolean hasWithPass() {
            return this._builder.hasWithPass();
        }

        public final void setDisabled(Toll.Disabled disabled) {
            x.f(disabled, "value");
            this._builder.setDisabled(disabled);
        }

        public final void setDynamicPrice(Toll.DynamicPrice dynamicPrice) {
            x.f(dynamicPrice, "value");
            this._builder.setDynamicPrice(dynamicPrice);
        }

        public final void setFixedPrice(Toll.FixedPrice fixedPrice) {
            x.f(fixedPrice, "value");
            this._builder.setFixedPrice(fixedPrice);
        }

        public final void setMissingPass(Toll.MissingPass missingPass) {
            x.f(missingPass, "value");
            this._builder.setMissingPass(missingPass);
        }

        public final void setNoPrice(Toll.NoPrice noPrice) {
            x.f(noPrice, "value");
            this._builder.setNoPrice(noPrice);
        }

        public final void setPriceChangedAtTime(Toll.PriceChangeAtTime priceChangeAtTime) {
            x.f(priceChangeAtTime, "value");
            this._builder.setPriceChangedAtTime(priceChangeAtTime);
        }

        public final void setPriceChangedByTime(Toll.PriceChangingByTime priceChangingByTime) {
            x.f(priceChangingByTime, "value");
            this._builder.setPriceChangedByTime(priceChangingByTime);
        }

        public final void setWithPass(Toll.WithPass withPass) {
            x.f(withPass, "value");
            this._builder.setWithPass(withPass);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Toll.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(Toll.Builder builder, o oVar) {
            this(builder);
        }
    }
}
