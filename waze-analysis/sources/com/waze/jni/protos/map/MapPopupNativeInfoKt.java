package com.waze.jni.protos.map;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.map.MapPopupNativeInfo;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapPopupNativeInfoKt {
    public static final MapPopupNativeInfoKt INSTANCE = new MapPopupNativeInfoKt();

    private MapPopupNativeInfoKt() {
    }

    /* renamed from: -initializedetailsPopupInfo, reason: not valid java name */
    public final MapPopupNativeInfo.DetailsPopupInfo m26828initializedetailsPopupInfo(l<? super DetailsPopupInfoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        DetailsPopupInfoKt.Dsl.Companion companion = DetailsPopupInfoKt.Dsl.Companion;
        MapPopupNativeInfo.DetailsPopupInfo.Builder builderNewBuilder = MapPopupNativeInfo.DetailsPopupInfo.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        DetailsPopupInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializewazerPopupInfo, reason: not valid java name */
    public final MapPopupNativeInfo.WazerPopupInfo m26829initializewazerPopupInfo(l<? super WazerPopupInfoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        WazerPopupInfoKt.Dsl.Companion companion = WazerPopupInfoKt.Dsl.Companion;
        MapPopupNativeInfo.WazerPopupInfo.Builder builderNewBuilder = MapPopupNativeInfo.WazerPopupInfo.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        WazerPopupInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class DetailsPopupInfoKt {
        public static final DetailsPopupInfoKt INSTANCE = new DetailsPopupInfoKt();

        private DetailsPopupInfoKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final MapPopupNativeInfo.DetailsPopupInfo.Builder _builder;

            private Dsl(MapPopupNativeInfo.DetailsPopupInfo.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ MapPopupNativeInfo.DetailsPopupInfo _build() {
                MapPopupNativeInfo.DetailsPopupInfo detailsPopupInfoBuild = this._builder.build();
                x.e(detailsPopupInfoBuild, "build(...)");
                return detailsPopupInfoBuild;
            }

            public final void clearCoordinate() {
                this._builder.clearCoordinate();
            }

            public final void clearInfo() {
                this._builder.clearInfo();
            }

            public final void clearLoader() {
                this._builder.clearLoader();
            }

            public final void clearMsg() {
                this._builder.clearMsg();
            }

            public final void clearPoiInfoUrl() {
                this._builder.clearPoiInfoUrl();
            }

            public final void clearPreviewIcon() {
                this._builder.clearPreviewIcon();
            }

            public final void clearStyle() {
                this._builder.clearStyle();
            }

            public final void clearTimeoutSeconds() {
                this._builder.clearTimeoutSeconds();
            }

            public final void clearTitle() {
                this._builder.clearTitle();
            }

            public final void clearType() {
                this._builder.clearType();
            }

            public final void clearVenue() {
                this._builder.clearVenue();
            }

            public final void clearVenueOriginal() {
                this._builder.clearVenueOriginal();
            }

            public final void clearWalkingDistanceMeters() {
                this._builder.clearWalkingDistanceMeters();
            }

            public final Position.IntPosition getCoordinate() {
                Position.IntPosition coordinate = this._builder.getCoordinate();
                x.e(coordinate, "getCoordinate(...)");
                return coordinate;
            }

            public final Position.IntPosition getCoordinateOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MapPopupNativeInfoKtKt.getCoordinateOrNull(dsl._builder);
            }

            public final String getInfo() {
                String info = this._builder.getInfo();
                x.e(info, "getInfo(...)");
                return info;
            }

            public final boolean getLoader() {
                return this._builder.getLoader();
            }

            public final String getMsg() {
                String msg = this._builder.getMsg();
                x.e(msg, "getMsg(...)");
                return msg;
            }

            public final String getPoiInfoUrl() {
                String poiInfoUrl = this._builder.getPoiInfoUrl();
                x.e(poiInfoUrl, "getPoiInfoUrl(...)");
                return poiInfoUrl;
            }

            public final String getPreviewIcon() {
                String previewIcon = this._builder.getPreviewIcon();
                x.e(previewIcon, "getPreviewIcon(...)");
                return previewIcon;
            }

            public final MapPopupNativeInfo.Style getStyle() {
                MapPopupNativeInfo.Style style = this._builder.getStyle();
                x.e(style, "getStyle(...)");
                return style;
            }

            public final int getStyleValue() {
                return this._builder.getStyleValue();
            }

            public final int getTimeoutSeconds() {
                return this._builder.getTimeoutSeconds();
            }

            public final String getTitle() {
                String title = this._builder.getTitle();
                x.e(title, "getTitle(...)");
                return title;
            }

            public final MapPopupNativeInfo.WazeUiMapPopupType getType() {
                MapPopupNativeInfo.WazeUiMapPopupType type = this._builder.getType();
                x.e(type, "getType(...)");
                return type;
            }

            public final int getTypeValue() {
                return this._builder.getTypeValue();
            }

            public final VenueData getVenue() {
                VenueData venue = this._builder.getVenue();
                x.e(venue, "getVenue(...)");
                return venue;
            }

            public final VenueData getVenueOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MapPopupNativeInfoKtKt.getVenueOrNull(dsl._builder);
            }

            public final VenueData getVenueOriginal() {
                VenueData venueOriginal = this._builder.getVenueOriginal();
                x.e(venueOriginal, "getVenueOriginal(...)");
                return venueOriginal;
            }

            public final VenueData getVenueOriginalOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MapPopupNativeInfoKtKt.getVenueOriginalOrNull(dsl._builder);
            }

            public final int getWalkingDistanceMeters() {
                return this._builder.getWalkingDistanceMeters();
            }

            public final boolean hasCoordinate() {
                return this._builder.hasCoordinate();
            }

            public final boolean hasInfo() {
                return this._builder.hasInfo();
            }

            public final boolean hasPoiInfoUrl() {
                return this._builder.hasPoiInfoUrl();
            }

            public final boolean hasPreviewIcon() {
                return this._builder.hasPreviewIcon();
            }

            public final boolean hasTimeoutSeconds() {
                return this._builder.hasTimeoutSeconds();
            }

            public final boolean hasTitle() {
                return this._builder.hasTitle();
            }

            public final boolean hasVenue() {
                return this._builder.hasVenue();
            }

            public final boolean hasVenueOriginal() {
                return this._builder.hasVenueOriginal();
            }

            public final boolean hasWalkingDistanceMeters() {
                return this._builder.hasWalkingDistanceMeters();
            }

            public final void setCoordinate(Position.IntPosition intPosition) {
                x.f(intPosition, "value");
                this._builder.setCoordinate(intPosition);
            }

            public final void setInfo(String str) {
                x.f(str, "value");
                this._builder.setInfo(str);
            }

            public final void setLoader(boolean z) {
                this._builder.setLoader(z);
            }

            public final void setMsg(String str) {
                x.f(str, "value");
                this._builder.setMsg(str);
            }

            public final void setPoiInfoUrl(String str) {
                x.f(str, "value");
                this._builder.setPoiInfoUrl(str);
            }

            public final void setPreviewIcon(String str) {
                x.f(str, "value");
                this._builder.setPreviewIcon(str);
            }

            public final void setStyle(MapPopupNativeInfo.Style style) {
                x.f(style, "value");
                this._builder.setStyle(style);
            }

            public final void setStyleValue(int i2) {
                this._builder.setStyleValue(i2);
            }

            public final void setTimeoutSeconds(int i2) {
                this._builder.setTimeoutSeconds(i2);
            }

            public final void setTitle(String str) {
                x.f(str, "value");
                this._builder.setTitle(str);
            }

            public final void setType(MapPopupNativeInfo.WazeUiMapPopupType wazeUiMapPopupType) {
                x.f(wazeUiMapPopupType, "value");
                this._builder.setType(wazeUiMapPopupType);
            }

            public final void setTypeValue(int i2) {
                this._builder.setTypeValue(i2);
            }

            public final void setVenue(VenueData venueData) {
                x.f(venueData, "value");
                this._builder.setVenue(venueData);
            }

            public final void setVenueOriginal(VenueData venueData) {
                x.f(venueData, "value");
                this._builder.setVenueOriginal(venueData);
            }

            public final void setWalkingDistanceMeters(int i2) {
                this._builder.setWalkingDistanceMeters(i2);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(MapPopupNativeInfo.DetailsPopupInfo.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(MapPopupNativeInfo.DetailsPopupInfo.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class WazerPopupInfoKt {
        public static final WazerPopupInfoKt INSTANCE = new WazerPopupInfoKt();

        private WazerPopupInfoKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final MapPopupNativeInfo.WazerPopupInfo.Builder _builder;

            private Dsl(MapPopupNativeInfo.WazerPopupInfo.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ MapPopupNativeInfo.WazerPopupInfo _build() {
                MapPopupNativeInfo.WazerPopupInfo wazerPopupInfoBuild = this._builder.build();
                x.e(wazerPopupInfoBuild, "build(...)");
                return wazerPopupInfoBuild;
            }

            public final void clearAddon() {
                this._builder.clearAddon();
            }

            public final void clearAzimuth() {
                this._builder.clearAzimuth();
            }

            public final void clearCoordinate() {
                this._builder.clearCoordinate();
            }

            public final void clearId() {
                this._builder.clearId();
            }

            public final void clearJoined() {
                this._builder.clearJoined();
            }

            public final void clearMood() {
                this._builder.clearMood();
            }

            public final void clearName() {
                this._builder.clearName();
            }

            public final void clearPoints() {
                this._builder.clearPoints();
            }

            public final void clearSpeed() {
                this._builder.clearSpeed();
            }

            public final String getAddon() {
                String addon = this._builder.getAddon();
                x.e(addon, "getAddon(...)");
                return addon;
            }

            public final int getAzimuth() {
                return this._builder.getAzimuth();
            }

            public final Position.IntPosition getCoordinate() {
                Position.IntPosition coordinate = this._builder.getCoordinate();
                x.e(coordinate, "getCoordinate(...)");
                return coordinate;
            }

            public final Position.IntPosition getCoordinateOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MapPopupNativeInfoKtKt.getCoordinateOrNull(dsl._builder);
            }

            public final int getId() {
                return this._builder.getId();
            }

            public final String getJoined() {
                String joined = this._builder.getJoined();
                x.e(joined, "getJoined(...)");
                return joined;
            }

            public final String getMood() {
                String mood = this._builder.getMood();
                x.e(mood, "getMood(...)");
                return mood;
            }

            public final String getName() {
                String name = this._builder.getName();
                x.e(name, "getName(...)");
                return name;
            }

            public final String getPoints() {
                String points = this._builder.getPoints();
                x.e(points, "getPoints(...)");
                return points;
            }

            public final String getSpeed() {
                String speed = this._builder.getSpeed();
                x.e(speed, "getSpeed(...)");
                return speed;
            }

            public final boolean hasAddon() {
                return this._builder.hasAddon();
            }

            public final boolean hasCoordinate() {
                return this._builder.hasCoordinate();
            }

            public final boolean hasJoined() {
                return this._builder.hasJoined();
            }

            public final boolean hasPoints() {
                return this._builder.hasPoints();
            }

            public final void setAddon(String str) {
                x.f(str, "value");
                this._builder.setAddon(str);
            }

            public final void setAzimuth(int i2) {
                this._builder.setAzimuth(i2);
            }

            public final void setCoordinate(Position.IntPosition intPosition) {
                x.f(intPosition, "value");
                this._builder.setCoordinate(intPosition);
            }

            public final void setId(int i2) {
                this._builder.setId(i2);
            }

            public final void setJoined(String str) {
                x.f(str, "value");
                this._builder.setJoined(str);
            }

            public final void setMood(String str) {
                x.f(str, "value");
                this._builder.setMood(str);
            }

            public final void setName(String str) {
                x.f(str, "value");
                this._builder.setName(str);
            }

            public final void setPoints(String str) {
                x.f(str, "value");
                this._builder.setPoints(str);
            }

            public final void setSpeed(String str) {
                x.f(str, "value");
                this._builder.setSpeed(str);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(MapPopupNativeInfo.WazerPopupInfo.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(MapPopupNativeInfo.WazerPopupInfo.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MapPopupNativeInfo.Builder _builder;

        private Dsl(MapPopupNativeInfo.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MapPopupNativeInfo _build() {
            MapPopupNativeInfo mapPopupNativeInfoBuild = this._builder.build();
            x.e(mapPopupNativeInfoBuild, "build(...)");
            return mapPopupNativeInfoBuild;
        }

        public final void clearDetailsPopupInfo() {
            this._builder.clearDetailsPopupInfo();
        }

        public final void clearPopupInfo() {
            this._builder.clearPopupInfo();
        }

        public final void clearWazerPopupInfo() {
            this._builder.clearWazerPopupInfo();
        }

        public final MapPopupNativeInfo.DetailsPopupInfo getDetailsPopupInfo() {
            MapPopupNativeInfo.DetailsPopupInfo detailsPopupInfo = this._builder.getDetailsPopupInfo();
            x.e(detailsPopupInfo, "getDetailsPopupInfo(...)");
            return detailsPopupInfo;
        }

        public final MapPopupNativeInfo.PopupInfoCase getPopupInfoCase() {
            MapPopupNativeInfo.PopupInfoCase popupInfoCase = this._builder.getPopupInfoCase();
            x.e(popupInfoCase, "getPopupInfoCase(...)");
            return popupInfoCase;
        }

        public final MapPopupNativeInfo.WazerPopupInfo getWazerPopupInfo() {
            MapPopupNativeInfo.WazerPopupInfo wazerPopupInfo = this._builder.getWazerPopupInfo();
            x.e(wazerPopupInfo, "getWazerPopupInfo(...)");
            return wazerPopupInfo;
        }

        public final boolean hasDetailsPopupInfo() {
            return this._builder.hasDetailsPopupInfo();
        }

        public final boolean hasWazerPopupInfo() {
            return this._builder.hasWazerPopupInfo();
        }

        public final void setDetailsPopupInfo(MapPopupNativeInfo.DetailsPopupInfo detailsPopupInfo) {
            x.f(detailsPopupInfo, "value");
            this._builder.setDetailsPopupInfo(detailsPopupInfo);
        }

        public final void setWazerPopupInfo(MapPopupNativeInfo.WazerPopupInfo wazerPopupInfo) {
            x.f(wazerPopupInfo, "value");
            this._builder.setWazerPopupInfo(wazerPopupInfo);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(MapPopupNativeInfo.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(MapPopupNativeInfo.Builder builder, o oVar) {
            this(builder);
        }
    }
}
