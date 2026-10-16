package com.waze.jni.protos.map;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.map.MapContent;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapContentKt {
    public static final MapContentKt INSTANCE = new MapContentKt();

    /* compiled from: WazeSource */
    public final class AdditionalContentKt {
        public static final AdditionalContentKt INSTANCE = new AdditionalContentKt();

        private AdditionalContentKt() {
        }

        /* renamed from: -initializemapPois, reason: not valid java name */
        public final MapContent.AdditionalContent.MapPois m26707initializemapPois(l<? super MapPoisKt.Dsl, ab> lVar) {
            x.f(lVar, "block");
            MapPoisKt.Dsl.Companion companion = MapPoisKt.Dsl.Companion;
            MapContent.AdditionalContent.MapPois.Builder builderNewBuilder = MapContent.AdditionalContent.MapPois.newBuilder();
            x.e(builderNewBuilder, "newBuilder(...)");
            MapPoisKt.Dsl dsl_create = companion._create(builderNewBuilder);
            lVar.invoke(dsl_create);
            return dsl_create._build();
        }

        /* renamed from: -initializerealtimeAlerts, reason: not valid java name */
        public final MapContent.AdditionalContent.RealtimeAlerts m26708initializerealtimeAlerts(l<? super RealtimeAlertsKt.Dsl, ab> lVar) {
            x.f(lVar, "block");
            RealtimeAlertsKt.Dsl.Companion companion = RealtimeAlertsKt.Dsl.Companion;
            MapContent.AdditionalContent.RealtimeAlerts.Builder builderNewBuilder = MapContent.AdditionalContent.RealtimeAlerts.newBuilder();
            x.e(builderNewBuilder, "newBuilder(...)");
            RealtimeAlertsKt.Dsl dsl_create = companion._create(builderNewBuilder);
            lVar.invoke(dsl_create);
            return dsl_create._build();
        }

        /* renamed from: -initializetileAlerts, reason: not valid java name */
        public final MapContent.AdditionalContent.TileAlerts m26709initializetileAlerts(l<? super TileAlertsKt.Dsl, ab> lVar) {
            x.f(lVar, "block");
            TileAlertsKt.Dsl.Companion companion = TileAlertsKt.Dsl.Companion;
            MapContent.AdditionalContent.TileAlerts.Builder builderNewBuilder = MapContent.AdditionalContent.TileAlerts.newBuilder();
            x.e(builderNewBuilder, "newBuilder(...)");
            TileAlertsKt.Dsl dsl_create = companion._create(builderNewBuilder);
            lVar.invoke(dsl_create);
            return dsl_create._build();
        }

        /* compiled from: WazeSource */
        public final class MapPoisKt {
            public static final MapPoisKt INSTANCE = new MapPoisKt();

            private MapPoisKt() {
            }

            /* compiled from: WazeSource */
            public final class Dsl {
                public static final Companion Companion = new Companion(null);
                private final MapContent.AdditionalContent.MapPois.Builder _builder;

                private Dsl(MapContent.AdditionalContent.MapPois.Builder builder) {
                    this._builder = builder;
                }

                public final /* synthetic */ MapContent.AdditionalContent.MapPois _build() {
                    MapContent.AdditionalContent.MapPois mapPoisBuild = this._builder.build();
                    x.e(mapPoisBuild, "build(...)");
                    return mapPoisBuild;
                }

                public final void clearShowDeparturePoi() {
                    this._builder.clearShowDeparturePoi();
                }

                public final void clearShowDestinationPoi() {
                    this._builder.clearShowDestinationPoi();
                }

                public final void clearShowHomePoi() {
                    this._builder.clearShowHomePoi();
                }

                public final void clearShowParkedPoi() {
                    this._builder.clearShowParkedPoi();
                }

                public final void clearShowWaypointPoi() {
                    this._builder.clearShowWaypointPoi();
                }

                public final void clearShowWorkPoi() {
                    this._builder.clearShowWorkPoi();
                }

                public final boolean getShowDeparturePoi() {
                    return this._builder.getShowDeparturePoi();
                }

                public final boolean getShowDestinationPoi() {
                    return this._builder.getShowDestinationPoi();
                }

                public final boolean getShowHomePoi() {
                    return this._builder.getShowHomePoi();
                }

                public final boolean getShowParkedPoi() {
                    return this._builder.getShowParkedPoi();
                }

                public final boolean getShowWaypointPoi() {
                    return this._builder.getShowWaypointPoi();
                }

                public final boolean getShowWorkPoi() {
                    return this._builder.getShowWorkPoi();
                }

                public final void setShowDeparturePoi(boolean z) {
                    this._builder.setShowDeparturePoi(z);
                }

                public final void setShowDestinationPoi(boolean z) {
                    this._builder.setShowDestinationPoi(z);
                }

                public final void setShowHomePoi(boolean z) {
                    this._builder.setShowHomePoi(z);
                }

                public final void setShowParkedPoi(boolean z) {
                    this._builder.setShowParkedPoi(z);
                }

                public final void setShowWaypointPoi(boolean z) {
                    this._builder.setShowWaypointPoi(z);
                }

                public final void setShowWorkPoi(boolean z) {
                    this._builder.setShowWorkPoi(z);
                }

                /* compiled from: WazeSource */
                public final class Companion {
                    private Companion() {
                    }

                    public final /* synthetic */ Dsl _create(MapContent.AdditionalContent.MapPois.Builder builder) {
                        x.f(builder, "builder");
                        return new Dsl(builder, null);
                    }

                    public /* synthetic */ Companion(o oVar) {
                        this();
                    }
                }

                public /* synthetic */ Dsl(MapContent.AdditionalContent.MapPois.Builder builder, o oVar) {
                    this(builder);
                }
            }
        }

        /* compiled from: WazeSource */
        public final class RealtimeAlertsKt {
            public static final RealtimeAlertsKt INSTANCE = new RealtimeAlertsKt();

            private RealtimeAlertsKt() {
            }

            /* compiled from: WazeSource */
            public final class Dsl {
                public static final Companion Companion = new Companion(null);
                private final MapContent.AdditionalContent.RealtimeAlerts.Builder _builder;

                private Dsl(MapContent.AdditionalContent.RealtimeAlerts.Builder builder) {
                    this._builder = builder;
                }

                public final /* synthetic */ MapContent.AdditionalContent.RealtimeAlerts _build() {
                    MapContent.AdditionalContent.RealtimeAlerts realtimeAlertsBuild = this._builder.build();
                    x.e(realtimeAlertsBuild, "build(...)");
                    return realtimeAlertsBuild;
                }

                public final void clearShowAlertsOnRouteOnly() {
                    this._builder.clearShowAlertsOnRouteOnly();
                }

                public final boolean getShowAlertsOnRouteOnly() {
                    return this._builder.getShowAlertsOnRouteOnly();
                }

                public final void setShowAlertsOnRouteOnly(boolean z) {
                    this._builder.setShowAlertsOnRouteOnly(z);
                }

                /* compiled from: WazeSource */
                public final class Companion {
                    private Companion() {
                    }

                    public final /* synthetic */ Dsl _create(MapContent.AdditionalContent.RealtimeAlerts.Builder builder) {
                        x.f(builder, "builder");
                        return new Dsl(builder, null);
                    }

                    public /* synthetic */ Companion(o oVar) {
                        this();
                    }
                }

                public /* synthetic */ Dsl(MapContent.AdditionalContent.RealtimeAlerts.Builder builder, o oVar) {
                    this(builder);
                }
            }
        }

        /* compiled from: WazeSource */
        public final class TileAlertsKt {
            public static final TileAlertsKt INSTANCE = new TileAlertsKt();

            private TileAlertsKt() {
            }

            /* compiled from: WazeSource */
            public final class Dsl {
                public static final Companion Companion = new Companion(null);
                private final MapContent.AdditionalContent.TileAlerts.Builder _builder;

                private Dsl(MapContent.AdditionalContent.TileAlerts.Builder builder) {
                    this._builder = builder;
                }

                public final /* synthetic */ MapContent.AdditionalContent.TileAlerts _build() {
                    MapContent.AdditionalContent.TileAlerts tileAlertsBuild = this._builder.build();
                    x.e(tileAlertsBuild, "build(...)");
                    return tileAlertsBuild;
                }

                public final void clearDisableAerialRadiusTrafficLights() {
                    this._builder.clearDisableAerialRadiusTrafficLights();
                }

                public final void clearShowAlertsOnRouteOnly() {
                    this._builder.clearShowAlertsOnRouteOnly();
                }

                public final boolean getDisableAerialRadiusTrafficLights() {
                    return this._builder.getDisableAerialRadiusTrafficLights();
                }

                public final boolean getShowAlertsOnRouteOnly() {
                    return this._builder.getShowAlertsOnRouteOnly();
                }

                public final void setDisableAerialRadiusTrafficLights(boolean z) {
                    this._builder.setDisableAerialRadiusTrafficLights(z);
                }

                public final void setShowAlertsOnRouteOnly(boolean z) {
                    this._builder.setShowAlertsOnRouteOnly(z);
                }

                /* compiled from: WazeSource */
                public final class Companion {
                    private Companion() {
                    }

                    public final /* synthetic */ Dsl _create(MapContent.AdditionalContent.TileAlerts.Builder builder) {
                        x.f(builder, "builder");
                        return new Dsl(builder, null);
                    }

                    public /* synthetic */ Companion(o oVar) {
                        this();
                    }
                }

                public /* synthetic */ Dsl(MapContent.AdditionalContent.TileAlerts.Builder builder, o oVar) {
                    this(builder);
                }
            }
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final MapContent.AdditionalContent.Builder _builder;

            private Dsl(MapContent.AdditionalContent.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ MapContent.AdditionalContent _build() {
                MapContent.AdditionalContent additionalContentBuild = this._builder.build();
                x.e(additionalContentBuild, "build(...)");
                return additionalContentBuild;
            }

            public final void clearMapPois() {
                this._builder.clearMapPois();
            }

            public final void clearObjectSamplerEnabled() {
                this._builder.clearObjectSamplerEnabled();
            }

            public final void clearShowAds() {
                this._builder.clearShowAds();
            }

            public final void clearShowCyclists() {
                this._builder.clearShowCyclists();
            }

            public final void clearShowRealtimeAlerts() {
                this._builder.clearShowRealtimeAlerts();
            }

            public final void clearShowRealtimeExternalPoi() {
                this._builder.clearShowRealtimeExternalPoi();
            }

            public final void clearShowRealtimeTraffic() {
                this._builder.clearShowRealtimeTraffic();
            }

            public final void clearShowUserLocation() {
                this._builder.clearShowUserLocation();
            }

            public final void clearShowWazers() {
                this._builder.clearShowWazers();
            }

            public final void clearTileAlerts() {
                this._builder.clearTileAlerts();
            }

            public final MapContent.AdditionalContent.MapPois getMapPois() {
                MapContent.AdditionalContent.MapPois mapPois = this._builder.getMapPois();
                x.e(mapPois, "getMapPois(...)");
                return mapPois;
            }

            public final MapContent.AdditionalContent.MapPois getMapPoisOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MapContentKtKt.getMapPoisOrNull(dsl._builder);
            }

            public final boolean getObjectSamplerEnabled() {
                return this._builder.getObjectSamplerEnabled();
            }

            public final boolean getShowAds() {
                return this._builder.getShowAds();
            }

            public final boolean getShowCyclists() {
                return this._builder.getShowCyclists();
            }

            public final MapContent.AdditionalContent.RealtimeAlerts getShowRealtimeAlerts() {
                MapContent.AdditionalContent.RealtimeAlerts showRealtimeAlerts = this._builder.getShowRealtimeAlerts();
                x.e(showRealtimeAlerts, "getShowRealtimeAlerts(...)");
                return showRealtimeAlerts;
            }

            public final MapContent.AdditionalContent.RealtimeAlerts getShowRealtimeAlertsOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MapContentKtKt.getShowRealtimeAlertsOrNull(dsl._builder);
            }

            public final boolean getShowRealtimeExternalPoi() {
                return this._builder.getShowRealtimeExternalPoi();
            }

            public final boolean getShowRealtimeTraffic() {
                return this._builder.getShowRealtimeTraffic();
            }

            public final boolean getShowUserLocation() {
                return this._builder.getShowUserLocation();
            }

            public final boolean getShowWazers() {
                return this._builder.getShowWazers();
            }

            public final MapContent.AdditionalContent.TileAlerts getTileAlerts() {
                MapContent.AdditionalContent.TileAlerts tileAlerts = this._builder.getTileAlerts();
                x.e(tileAlerts, "getTileAlerts(...)");
                return tileAlerts;
            }

            public final MapContent.AdditionalContent.TileAlerts getTileAlertsOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MapContentKtKt.getTileAlertsOrNull(dsl._builder);
            }

            public final boolean hasMapPois() {
                return this._builder.hasMapPois();
            }

            public final boolean hasShowRealtimeAlerts() {
                return this._builder.hasShowRealtimeAlerts();
            }

            public final boolean hasTileAlerts() {
                return this._builder.hasTileAlerts();
            }

            public final void setMapPois(MapContent.AdditionalContent.MapPois mapPois) {
                x.f(mapPois, "value");
                this._builder.setMapPois(mapPois);
            }

            public final void setObjectSamplerEnabled(boolean z) {
                this._builder.setObjectSamplerEnabled(z);
            }

            public final void setShowAds(boolean z) {
                this._builder.setShowAds(z);
            }

            public final void setShowCyclists(boolean z) {
                this._builder.setShowCyclists(z);
            }

            public final void setShowRealtimeAlerts(MapContent.AdditionalContent.RealtimeAlerts realtimeAlerts) {
                x.f(realtimeAlerts, "value");
                this._builder.setShowRealtimeAlerts(realtimeAlerts);
            }

            public final void setShowRealtimeExternalPoi(boolean z) {
                this._builder.setShowRealtimeExternalPoi(z);
            }

            public final void setShowRealtimeTraffic(boolean z) {
                this._builder.setShowRealtimeTraffic(z);
            }

            public final void setShowUserLocation(boolean z) {
                this._builder.setShowUserLocation(z);
            }

            public final void setShowWazers(boolean z) {
                this._builder.setShowWazers(z);
            }

            public final void setTileAlerts(MapContent.AdditionalContent.TileAlerts tileAlerts) {
                x.f(tileAlerts, "value");
                this._builder.setTileAlerts(tileAlerts);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(MapContent.AdditionalContent.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(MapContent.AdditionalContent.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    private MapContentKt() {
    }

    /* renamed from: -initializeadditionalContent, reason: not valid java name */
    public final MapContent.AdditionalContent m26705initializeadditionalContent(l<? super AdditionalContentKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        AdditionalContentKt.Dsl.Companion companion = AdditionalContentKt.Dsl.Companion;
        MapContent.AdditionalContent.Builder builderNewBuilder = MapContent.AdditionalContent.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        AdditionalContentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializenavigationContent, reason: not valid java name */
    public final MapContent.NavigationContent m26706initializenavigationContent(l<? super NavigationContentKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NavigationContentKt.Dsl.Companion companion = NavigationContentKt.Dsl.Companion;
        MapContent.NavigationContent.Builder builderNewBuilder = MapContent.NavigationContent.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NavigationContentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class NavigationContentKt {
        public static final NavigationContentKt INSTANCE = new NavigationContentKt();

        /* compiled from: WazeSource */
        public final class ShowActiveRouteKt {
            public static final ShowActiveRouteKt INSTANCE = new ShowActiveRouteKt();

            private ShowActiveRouteKt() {
            }

            /* renamed from: -initializeroutingArrowOnSegment, reason: not valid java name */
            public final MapContent.NavigationContent.ShowActiveRoute.RoutingArrowOnSegment m26711initializeroutingArrowOnSegment(l<? super RoutingArrowOnSegmentKt.Dsl, ab> lVar) {
                x.f(lVar, "block");
                RoutingArrowOnSegmentKt.Dsl.Companion companion = RoutingArrowOnSegmentKt.Dsl.Companion;
                MapContent.NavigationContent.ShowActiveRoute.RoutingArrowOnSegment.Builder builderNewBuilder = MapContent.NavigationContent.ShowActiveRoute.RoutingArrowOnSegment.newBuilder();
                x.e(builderNewBuilder, "newBuilder(...)");
                RoutingArrowOnSegmentKt.Dsl dsl_create = companion._create(builderNewBuilder);
                lVar.invoke(dsl_create);
                return dsl_create._build();
            }

            /* compiled from: WazeSource */
            public final class RoutingArrowOnSegmentKt {
                public static final RoutingArrowOnSegmentKt INSTANCE = new RoutingArrowOnSegmentKt();

                private RoutingArrowOnSegmentKt() {
                }

                /* compiled from: WazeSource */
                public final class Dsl {
                    public static final Companion Companion = new Companion(null);
                    private final MapContent.NavigationContent.ShowActiveRoute.RoutingArrowOnSegment.Builder _builder;

                    private Dsl(MapContent.NavigationContent.ShowActiveRoute.RoutingArrowOnSegment.Builder builder) {
                        this._builder = builder;
                    }

                    public final /* synthetic */ MapContent.NavigationContent.ShowActiveRoute.RoutingArrowOnSegment _build() {
                        MapContent.NavigationContent.ShowActiveRoute.RoutingArrowOnSegment routingArrowOnSegmentBuild = this._builder.build();
                        x.e(routingArrowOnSegmentBuild, "build(...)");
                        return routingArrowOnSegmentBuild;
                    }

                    public final void clearNavigationSegmentIndex() {
                        this._builder.clearNavigationSegmentIndex();
                    }

                    public final int getNavigationSegmentIndex() {
                        return this._builder.getNavigationSegmentIndex();
                    }

                    public final void setNavigationSegmentIndex(int i2) {
                        this._builder.setNavigationSegmentIndex(i2);
                    }

                    /* compiled from: WazeSource */
                    public final class Companion {
                        private Companion() {
                        }

                        public final /* synthetic */ Dsl _create(MapContent.NavigationContent.ShowActiveRoute.RoutingArrowOnSegment.Builder builder) {
                            x.f(builder, "builder");
                            return new Dsl(builder, null);
                        }

                        public /* synthetic */ Companion(o oVar) {
                            this();
                        }
                    }

                    public /* synthetic */ Dsl(MapContent.NavigationContent.ShowActiveRoute.RoutingArrowOnSegment.Builder builder, o oVar) {
                        this(builder);
                    }
                }
            }

            /* compiled from: WazeSource */
            public final class Dsl {
                public static final Companion Companion = new Companion(null);
                private final MapContent.NavigationContent.ShowActiveRoute.Builder _builder;

                private Dsl(MapContent.NavigationContent.ShowActiveRoute.Builder builder) {
                    this._builder = builder;
                }

                public final /* synthetic */ MapContent.NavigationContent.ShowActiveRoute _build() {
                    MapContent.NavigationContent.ShowActiveRoute showActiveRouteBuild = this._builder.build();
                    x.e(showActiveRouteBuild, "build(...)");
                    return showActiveRouteBuild;
                }

                public final void clearArrowAutomatic() {
                    this._builder.clearArrowAutomatic();
                }

                public final void clearArrowHidden() {
                    this._builder.clearArrowHidden();
                }

                public final void clearArrowOnSegment() {
                    this._builder.clearArrowOnSegment();
                }

                public final void clearRoutingArrow() {
                    this._builder.clearRoutingArrow();
                }

                public final void clearShowDetourRoutes() {
                    this._builder.clearShowDetourRoutes();
                }

                public final void clearShowRoutingLabels() {
                    this._builder.clearShowRoutingLabels();
                }

                public final void clearShowSuggestedParking() {
                    this._builder.clearShowSuggestedParking();
                }

                public final boolean getArrowAutomatic() {
                    return this._builder.getArrowAutomatic();
                }

                public final boolean getArrowHidden() {
                    return this._builder.getArrowHidden();
                }

                public final MapContent.NavigationContent.ShowActiveRoute.RoutingArrowOnSegment getArrowOnSegment() {
                    MapContent.NavigationContent.ShowActiveRoute.RoutingArrowOnSegment arrowOnSegment = this._builder.getArrowOnSegment();
                    x.e(arrowOnSegment, "getArrowOnSegment(...)");
                    return arrowOnSegment;
                }

                public final MapContent.NavigationContent.ShowActiveRoute.RoutingArrowCase getRoutingArrowCase() {
                    MapContent.NavigationContent.ShowActiveRoute.RoutingArrowCase routingArrowCase = this._builder.getRoutingArrowCase();
                    x.e(routingArrowCase, "getRoutingArrowCase(...)");
                    return routingArrowCase;
                }

                public final boolean getShowDetourRoutes() {
                    return this._builder.getShowDetourRoutes();
                }

                public final boolean getShowRoutingLabels() {
                    return this._builder.getShowRoutingLabels();
                }

                public final boolean getShowSuggestedParking() {
                    return this._builder.getShowSuggestedParking();
                }

                public final boolean hasArrowAutomatic() {
                    return this._builder.hasArrowAutomatic();
                }

                public final boolean hasArrowHidden() {
                    return this._builder.hasArrowHidden();
                }

                public final boolean hasArrowOnSegment() {
                    return this._builder.hasArrowOnSegment();
                }

                public final void setArrowAutomatic(boolean z) {
                    this._builder.setArrowAutomatic(z);
                }

                public final void setArrowHidden(boolean z) {
                    this._builder.setArrowHidden(z);
                }

                public final void setArrowOnSegment(MapContent.NavigationContent.ShowActiveRoute.RoutingArrowOnSegment routingArrowOnSegment) {
                    x.f(routingArrowOnSegment, "value");
                    this._builder.setArrowOnSegment(routingArrowOnSegment);
                }

                public final void setShowDetourRoutes(boolean z) {
                    this._builder.setShowDetourRoutes(z);
                }

                public final void setShowRoutingLabels(boolean z) {
                    this._builder.setShowRoutingLabels(z);
                }

                public final void setShowSuggestedParking(boolean z) {
                    this._builder.setShowSuggestedParking(z);
                }

                /* compiled from: WazeSource */
                public final class Companion {
                    private Companion() {
                    }

                    public final /* synthetic */ Dsl _create(MapContent.NavigationContent.ShowActiveRoute.Builder builder) {
                        x.f(builder, "builder");
                        return new Dsl(builder, null);
                    }

                    public /* synthetic */ Companion(o oVar) {
                        this();
                    }
                }

                public /* synthetic */ Dsl(MapContent.NavigationContent.ShowActiveRoute.Builder builder, o oVar) {
                    this(builder);
                }
            }
        }

        private NavigationContentKt() {
        }

        /* renamed from: -initializeshowActiveRoute, reason: not valid java name */
        public final MapContent.NavigationContent.ShowActiveRoute m26710initializeshowActiveRoute(l<? super ShowActiveRouteKt.Dsl, ab> lVar) {
            x.f(lVar, "block");
            ShowActiveRouteKt.Dsl.Companion companion = ShowActiveRouteKt.Dsl.Companion;
            MapContent.NavigationContent.ShowActiveRoute.Builder builderNewBuilder = MapContent.NavigationContent.ShowActiveRoute.newBuilder();
            x.e(builderNewBuilder, "newBuilder(...)");
            ShowActiveRouteKt.Dsl dsl_create = companion._create(builderNewBuilder);
            lVar.invoke(dsl_create);
            return dsl_create._build();
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final MapContent.NavigationContent.Builder _builder;

            private Dsl(MapContent.NavigationContent.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ MapContent.NavigationContent _build() {
                MapContent.NavigationContent navigationContentBuild = this._builder.build();
                x.e(navigationContentBuild, "build(...)");
                return navigationContentBuild;
            }

            public final void clearActiveRoute() {
                this._builder.clearActiveRoute();
            }

            public final void clearNoActiveRoute() {
                this._builder.clearNoActiveRoute();
            }

            public final void clearShowActiveRoute() {
                this._builder.clearShowActiveRoute();
            }

            public final MapContent.NavigationContent.ActiveRouteCase getActiveRouteCase() {
                MapContent.NavigationContent.ActiveRouteCase activeRouteCase = this._builder.getActiveRouteCase();
                x.e(activeRouteCase, "getActiveRouteCase(...)");
                return activeRouteCase;
            }

            public final boolean getNoActiveRoute() {
                return this._builder.getNoActiveRoute();
            }

            public final MapContent.NavigationContent.ShowActiveRoute getShowActiveRoute() {
                MapContent.NavigationContent.ShowActiveRoute showActiveRoute = this._builder.getShowActiveRoute();
                x.e(showActiveRoute, "getShowActiveRoute(...)");
                return showActiveRoute;
            }

            public final boolean hasNoActiveRoute() {
                return this._builder.hasNoActiveRoute();
            }

            public final boolean hasShowActiveRoute() {
                return this._builder.hasShowActiveRoute();
            }

            public final void setNoActiveRoute(boolean z) {
                this._builder.setNoActiveRoute(z);
            }

            public final void setShowActiveRoute(MapContent.NavigationContent.ShowActiveRoute showActiveRoute) {
                x.f(showActiveRoute, "value");
                this._builder.setShowActiveRoute(showActiveRoute);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(MapContent.NavigationContent.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(MapContent.NavigationContent.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MapContent.Builder _builder;

        /* compiled from: WazeSource */
        public final class EventsOnRouteProxy extends c {
            private EventsOnRouteProxy() {
            }
        }

        /* compiled from: WazeSource */
        public final class ExtendedRoutesProxy extends c {
            private ExtendedRoutesProxy() {
            }
        }

        /* compiled from: WazeSource */
        public final class MarkersProxy extends c {
            private MarkersProxy() {
            }
        }

        /* compiled from: WazeSource */
        public final class PolygonsProxy extends c {
            private PolygonsProxy() {
            }
        }

        /* compiled from: WazeSource */
        public final class PolylinesProxy extends c {
            private PolylinesProxy() {
            }
        }

        private Dsl(MapContent.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MapContent _build() {
            MapContent mapContentBuild = this._builder.build();
            x.e(mapContentBuild, "build(...)");
            return mapContentBuild;
        }

        public final /* synthetic */ void addAllEventsOnRoute(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllEventsOnRoute(iterable);
        }

        public final /* synthetic */ void addAllExtendedRoutes(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllExtendedRoutes(iterable);
        }

        public final /* synthetic */ void addAllMarkers(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllMarkers(iterable);
        }

        public final /* synthetic */ void addAllPolygons(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllPolygons(iterable);
        }

        public final /* synthetic */ void addAllPolylines(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllPolylines(iterable);
        }

        public final /* synthetic */ void addEventsOnRoute(a aVar, EventsOnRoute eventsOnRoute) {
            x.f(aVar, "<this>");
            x.f(eventsOnRoute, "value");
            this._builder.addEventsOnRoute(eventsOnRoute);
        }

        public final /* synthetic */ void addExtendedRoutes(a aVar, ExtendedRouteData extendedRouteData) {
            x.f(aVar, "<this>");
            x.f(extendedRouteData, "value");
            this._builder.addExtendedRoutes(extendedRouteData);
        }

        public final /* synthetic */ void addMarkers(a aVar, Marker marker) {
            x.f(aVar, "<this>");
            x.f(marker, "value");
            this._builder.addMarkers(marker);
        }

        public final /* synthetic */ void addPolygons(a aVar, ExtendedPolygon extendedPolygon) {
            x.f(aVar, "<this>");
            x.f(extendedPolygon, "value");
            this._builder.addPolygons(extendedPolygon);
        }

        public final /* synthetic */ void addPolylines(a aVar, ExtendedPolyline extendedPolyline) {
            x.f(aVar, "<this>");
            x.f(extendedPolyline, "value");
            this._builder.addPolylines(extendedPolyline);
        }

        public final void clearAdditionalContent() {
            this._builder.clearAdditionalContent();
        }

        public final void clearColorScheme() {
            this._builder.clearColorScheme();
        }

        public final /* synthetic */ void clearEventsOnRoute(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearEventsOnRoute();
        }

        public final /* synthetic */ void clearExtendedRoutes(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearExtendedRoutes();
        }

        public final /* synthetic */ void clearMarkers(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearMarkers();
        }

        public final void clearNavigationContent() {
            this._builder.clearNavigationContent();
        }

        public final /* synthetic */ void clearPolygons(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearPolygons();
        }

        public final /* synthetic */ void clearPolylines(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearPolylines();
        }

        public final MapContent.AdditionalContent getAdditionalContent() {
            MapContent.AdditionalContent additionalContent = this._builder.getAdditionalContent();
            x.e(additionalContent, "getAdditionalContent(...)");
            return additionalContent;
        }

        public final MapContent.AdditionalContent getAdditionalContentOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return MapContentKtKt.getAdditionalContentOrNull(dsl._builder);
        }

        public final MapContent.ColorScheme getColorScheme() {
            MapContent.ColorScheme colorScheme = this._builder.getColorScheme();
            x.e(colorScheme, "getColorScheme(...)");
            return colorScheme;
        }

        public final int getColorSchemeValue() {
            return this._builder.getColorSchemeValue();
        }

        public final /* synthetic */ a getEventsOnRoute() {
            List<EventsOnRoute> eventsOnRouteList = this._builder.getEventsOnRouteList();
            x.e(eventsOnRouteList, "getEventsOnRouteList(...)");
            return new a(eventsOnRouteList);
        }

        public final /* synthetic */ a getExtendedRoutes() {
            List<ExtendedRouteData> extendedRoutesList = this._builder.getExtendedRoutesList();
            x.e(extendedRoutesList, "getExtendedRoutesList(...)");
            return new a(extendedRoutesList);
        }

        public final /* synthetic */ a getMarkers() {
            List<Marker> markersList = this._builder.getMarkersList();
            x.e(markersList, "getMarkersList(...)");
            return new a(markersList);
        }

        public final MapContent.NavigationContent getNavigationContent() {
            MapContent.NavigationContent navigationContent = this._builder.getNavigationContent();
            x.e(navigationContent, "getNavigationContent(...)");
            return navigationContent;
        }

        public final MapContent.NavigationContent getNavigationContentOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return MapContentKtKt.getNavigationContentOrNull(dsl._builder);
        }

        public final /* synthetic */ a getPolygons() {
            List<ExtendedPolygon> polygonsList = this._builder.getPolygonsList();
            x.e(polygonsList, "getPolygonsList(...)");
            return new a(polygonsList);
        }

        public final /* synthetic */ a getPolylines() {
            List<ExtendedPolyline> polylinesList = this._builder.getPolylinesList();
            x.e(polylinesList, "getPolylinesList(...)");
            return new a(polylinesList);
        }

        public final boolean hasAdditionalContent() {
            return this._builder.hasAdditionalContent();
        }

        public final boolean hasNavigationContent() {
            return this._builder.hasNavigationContent();
        }

        public final /* synthetic */ void plusAssignAllEventsOnRoute(a<EventsOnRoute, EventsOnRouteProxy> aVar, Iterable<EventsOnRoute> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllEventsOnRoute(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAllExtendedRoutes(a<ExtendedRouteData, ExtendedRoutesProxy> aVar, Iterable<ExtendedRouteData> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllExtendedRoutes(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAllMarkers(a<Marker, MarkersProxy> aVar, Iterable<Marker> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllMarkers(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAllPolygons(a<ExtendedPolygon, PolygonsProxy> aVar, Iterable<ExtendedPolygon> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllPolygons(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAllPolylines(a<ExtendedPolyline, PolylinesProxy> aVar, Iterable<ExtendedPolyline> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllPolylines(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignEventsOnRoute(a<EventsOnRoute, EventsOnRouteProxy> aVar, EventsOnRoute eventsOnRoute) {
            x.f(aVar, "<this>");
            x.f(eventsOnRoute, "value");
            addEventsOnRoute(aVar, eventsOnRoute);
        }

        public final /* synthetic */ void plusAssignExtendedRoutes(a<ExtendedRouteData, ExtendedRoutesProxy> aVar, ExtendedRouteData extendedRouteData) {
            x.f(aVar, "<this>");
            x.f(extendedRouteData, "value");
            addExtendedRoutes(aVar, extendedRouteData);
        }

        public final /* synthetic */ void plusAssignMarkers(a<Marker, MarkersProxy> aVar, Marker marker) {
            x.f(aVar, "<this>");
            x.f(marker, "value");
            addMarkers(aVar, marker);
        }

        public final /* synthetic */ void plusAssignPolygons(a<ExtendedPolygon, PolygonsProxy> aVar, ExtendedPolygon extendedPolygon) {
            x.f(aVar, "<this>");
            x.f(extendedPolygon, "value");
            addPolygons(aVar, extendedPolygon);
        }

        public final /* synthetic */ void plusAssignPolylines(a<ExtendedPolyline, PolylinesProxy> aVar, ExtendedPolyline extendedPolyline) {
            x.f(aVar, "<this>");
            x.f(extendedPolyline, "value");
            addPolylines(aVar, extendedPolyline);
        }

        public final void setAdditionalContent(MapContent.AdditionalContent additionalContent) {
            x.f(additionalContent, "value");
            this._builder.setAdditionalContent(additionalContent);
        }

        public final void setColorScheme(MapContent.ColorScheme colorScheme) {
            x.f(colorScheme, "value");
            this._builder.setColorScheme(colorScheme);
        }

        public final void setColorSchemeValue(int i2) {
            this._builder.setColorSchemeValue(i2);
        }

        public final /* synthetic */ void setEventsOnRoute(a aVar, int i2, EventsOnRoute eventsOnRoute) {
            x.f(aVar, "<this>");
            x.f(eventsOnRoute, "value");
            this._builder.setEventsOnRoute(i2, eventsOnRoute);
        }

        public final /* synthetic */ void setExtendedRoutes(a aVar, int i2, ExtendedRouteData extendedRouteData) {
            x.f(aVar, "<this>");
            x.f(extendedRouteData, "value");
            this._builder.setExtendedRoutes(i2, extendedRouteData);
        }

        public final /* synthetic */ void setMarkers(a aVar, int i2, Marker marker) {
            x.f(aVar, "<this>");
            x.f(marker, "value");
            this._builder.setMarkers(i2, marker);
        }

        public final void setNavigationContent(MapContent.NavigationContent navigationContent) {
            x.f(navigationContent, "value");
            this._builder.setNavigationContent(navigationContent);
        }

        public final /* synthetic */ void setPolygons(a aVar, int i2, ExtendedPolygon extendedPolygon) {
            x.f(aVar, "<this>");
            x.f(extendedPolygon, "value");
            this._builder.setPolygons(i2, extendedPolygon);
        }

        public final /* synthetic */ void setPolylines(a aVar, int i2, ExtendedPolyline extendedPolyline) {
            x.f(aVar, "<this>");
            x.f(extendedPolyline, "value");
            this._builder.setPolylines(i2, extendedPolyline);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(MapContent.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(MapContent.Builder builder, o oVar) {
            this(builder);
        }
    }
}
