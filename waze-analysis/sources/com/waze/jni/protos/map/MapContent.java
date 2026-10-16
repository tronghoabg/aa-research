package com.waze.jni.protos.map;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.eo;
import com.google.v.ep;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.map.EventsOnRoute;
import com.waze.jni.protos.map.ExtendedPolygon;
import com.waze.jni.protos.map.ExtendedPolyline;
import com.waze.jni.protos.map.ExtendedRouteData;
import com.waze.jni.protos.map.Marker;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapContent extends du<MapContent, Builder> implements MapContentOrBuilder {
    public static final int ADDITIONAL_CONTENT_FIELD_NUMBER = 1;
    public static final int COLOR_SCHEME_FIELD_NUMBER = 8;
    private static final MapContent DEFAULT_INSTANCE;
    public static final int EVENTS_ON_ROUTE_FIELD_NUMBER = 6;
    public static final int EXTENDED_ROUTES_FIELD_NUMBER = 5;
    public static final int MARKERS_FIELD_NUMBER = 7;
    public static final int NAVIGATION_CONTENT_FIELD_NUMBER = 2;
    private static volatile fo<MapContent> PARSER = null;
    public static final int POLYGONS_FIELD_NUMBER = 3;
    public static final int POLYLINES_FIELD_NUMBER = 4;
    private AdditionalContent additionalContent_;
    private int bitField0_;
    private int colorScheme_;
    private NavigationContent navigationContent_;
    private byte memoizedIsInitialized = 2;
    private eo<ExtendedPolygon> polygons_ = emptyProtobufList();
    private eo<ExtendedPolyline> polylines_ = emptyProtobufList();
    private eo<ExtendedRouteData> extendedRoutes_ = emptyProtobufList();
    private eo<EventsOnRoute> eventsOnRoute_ = emptyProtobufList();
    private eo<Marker> markers_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.MapContent$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[dt.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[dt.f12882d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12883e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12881c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12884f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12885g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12879a.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12880b.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: WazeSource */
    public interface AdditionalContentOrBuilder extends fj {
        AdditionalContent.MapPois getMapPois();

        boolean getObjectSamplerEnabled();

        boolean getShowAds();

        boolean getShowCyclists();

        AdditionalContent.RealtimeAlerts getShowRealtimeAlerts();

        boolean getShowRealtimeExternalPoi();

        boolean getShowRealtimeTraffic();

        boolean getShowUserLocation();

        boolean getShowWazers();

        AdditionalContent.TileAlerts getTileAlerts();

        boolean hasMapPois();

        boolean hasShowRealtimeAlerts();

        boolean hasTileAlerts();
    }

    /* compiled from: WazeSource */
    public enum ColorScheme implements eg {
        UNKNOWN(0),
        LIGHT_REGULAR(1),
        DARK_REGULAR(2),
        LIGHT_EDITORS(3),
        DARK_EDITORS(4),
        UNRECOGNIZED(-1);

        public static final int DARK_EDITORS_VALUE = 4;
        public static final int DARK_REGULAR_VALUE = 2;
        public static final int LIGHT_EDITORS_VALUE = 3;
        public static final int LIGHT_REGULAR_VALUE = 1;
        public static final int UNKNOWN_VALUE = 0;
        private static final eh<ColorScheme> internalValueMap = new eh<ColorScheme>() { // from class: com.waze.jni.protos.map.MapContent.ColorScheme.1
            @Override // com.google.v.eh
            public ColorScheme findValueByNumber(int i2) {
                return ColorScheme.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class ColorSchemeVerifier implements ei {
            static final ei INSTANCE = new ColorSchemeVerifier();

            private ColorSchemeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return ColorScheme.forNumber(i2) != null;
            }
        }

        ColorScheme(int i2) {
            this.value = i2;
        }

        public static ColorScheme forNumber(int i2) {
            if (i2 == 0) {
                return UNKNOWN;
            }
            if (i2 == 1) {
                return LIGHT_REGULAR;
            }
            if (i2 == 2) {
                return DARK_REGULAR;
            }
            if (i2 == 3) {
                return LIGHT_EDITORS;
            }
            if (i2 != 4) {
                return null;
            }
            return DARK_EDITORS;
        }

        public static eh<ColorScheme> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return ColorSchemeVerifier.INSTANCE;
        }

        @Override // com.google.v.eg
        public final int getNumber() {
            return this == UNRECOGNIZED ? ep.b() : this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    /* compiled from: WazeSource */
    public interface NavigationContentOrBuilder extends fj {
        NavigationContent.ActiveRouteCase getActiveRouteCase();

        boolean getNoActiveRoute();

        NavigationContent.ShowActiveRoute getShowActiveRoute();

        boolean hasNoActiveRoute();

        boolean hasShowActiveRoute();
    }

    static {
        MapContent mapContent = new MapContent();
        DEFAULT_INSTANCE = mapContent;
        du.registerDefaultInstance(MapContent.class, mapContent);
    }

    private MapContent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEventsOnRoute(Iterable<? extends EventsOnRoute> iterable) {
        ensureEventsOnRouteIsMutable();
        c.addAll(iterable, this.eventsOnRoute_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtendedRoutes(Iterable<? extends ExtendedRouteData> iterable) {
        ensureExtendedRoutesIsMutable();
        c.addAll(iterable, this.extendedRoutes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMarkers(Iterable<? extends Marker> iterable) {
        ensureMarkersIsMutable();
        c.addAll(iterable, this.markers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPolygons(Iterable<? extends ExtendedPolygon> iterable) {
        ensurePolygonsIsMutable();
        c.addAll(iterable, this.polygons_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPolylines(Iterable<? extends ExtendedPolyline> iterable) {
        ensurePolylinesIsMutable();
        c.addAll(iterable, this.polylines_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEventsOnRoute(int i2, EventsOnRoute eventsOnRoute) {
        Objects.requireNonNull(eventsOnRoute);
        ensureEventsOnRouteIsMutable();
        this.eventsOnRoute_.add(i2, eventsOnRoute);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtendedRoutes(int i2, ExtendedRouteData extendedRouteData) {
        Objects.requireNonNull(extendedRouteData);
        ensureExtendedRoutesIsMutable();
        this.extendedRoutes_.add(i2, extendedRouteData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMarkers(int i2, Marker marker) {
        Objects.requireNonNull(marker);
        ensureMarkersIsMutable();
        this.markers_.add(i2, marker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPolygons(int i2, ExtendedPolygon extendedPolygon) {
        Objects.requireNonNull(extendedPolygon);
        ensurePolygonsIsMutable();
        this.polygons_.add(i2, extendedPolygon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPolylines(int i2, ExtendedPolyline extendedPolyline) {
        Objects.requireNonNull(extendedPolyline);
        ensurePolylinesIsMutable();
        this.polylines_.add(i2, extendedPolyline);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdditionalContent() {
        this.additionalContent_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColorScheme() {
        this.colorScheme_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventsOnRoute() {
        this.eventsOnRoute_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtendedRoutes() {
        this.extendedRoutes_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMarkers() {
        this.markers_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationContent() {
        this.navigationContent_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolygons() {
        this.polygons_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolylines() {
        this.polylines_ = emptyProtobufList();
    }

    private void ensureEventsOnRouteIsMutable() {
        eo<EventsOnRoute> eoVar = this.eventsOnRoute_;
        if (eoVar.c()) {
            return;
        }
        this.eventsOnRoute_ = du.mutableCopy(eoVar);
    }

    private void ensureExtendedRoutesIsMutable() {
        eo<ExtendedRouteData> eoVar = this.extendedRoutes_;
        if (eoVar.c()) {
            return;
        }
        this.extendedRoutes_ = du.mutableCopy(eoVar);
    }

    private void ensureMarkersIsMutable() {
        eo<Marker> eoVar = this.markers_;
        if (eoVar.c()) {
            return;
        }
        this.markers_ = du.mutableCopy(eoVar);
    }

    private void ensurePolygonsIsMutable() {
        eo<ExtendedPolygon> eoVar = this.polygons_;
        if (eoVar.c()) {
            return;
        }
        this.polygons_ = du.mutableCopy(eoVar);
    }

    private void ensurePolylinesIsMutable() {
        eo<ExtendedPolyline> eoVar = this.polylines_;
        if (eoVar.c()) {
            return;
        }
        this.polylines_ = du.mutableCopy(eoVar);
    }

    public static MapContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdditionalContent(AdditionalContent additionalContent) {
        Objects.requireNonNull(additionalContent);
        AdditionalContent additionalContent2 = this.additionalContent_;
        if (additionalContent2 != null && additionalContent2 != AdditionalContent.getDefaultInstance()) {
            AdditionalContent.Builder builderNewBuilder = AdditionalContent.newBuilder(additionalContent2);
            builderNewBuilder.mergeFrom((AdditionalContent.Builder) additionalContent);
            additionalContent = builderNewBuilder.buildPartial();
        }
        this.additionalContent_ = additionalContent;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavigationContent(NavigationContent navigationContent) {
        Objects.requireNonNull(navigationContent);
        NavigationContent navigationContent2 = this.navigationContent_;
        if (navigationContent2 != null && navigationContent2 != NavigationContent.getDefaultInstance()) {
            NavigationContent.Builder builderNewBuilder = NavigationContent.newBuilder(navigationContent2);
            builderNewBuilder.mergeFrom((NavigationContent.Builder) navigationContent);
            navigationContent = builderNewBuilder.buildPartial();
        }
        this.navigationContent_ = navigationContent;
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MapContent parseDelimitedFrom(InputStream inputStream) {
        return (MapContent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapContent parseFrom(v vVar) {
        return (MapContent) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<MapContent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEventsOnRoute(int i2) {
        ensureEventsOnRouteIsMutable();
        this.eventsOnRoute_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtendedRoutes(int i2) {
        ensureExtendedRoutesIsMutable();
        this.extendedRoutes_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMarkers(int i2) {
        ensureMarkersIsMutable();
        this.markers_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePolygons(int i2) {
        ensurePolygonsIsMutable();
        this.polygons_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePolylines(int i2) {
        ensurePolylinesIsMutable();
        this.polylines_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdditionalContent(AdditionalContent additionalContent) {
        Objects.requireNonNull(additionalContent);
        this.additionalContent_ = additionalContent;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorScheme(ColorScheme colorScheme) {
        this.colorScheme_ = colorScheme.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorSchemeValue(int i2) {
        this.colorScheme_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventsOnRoute(int i2, EventsOnRoute eventsOnRoute) {
        Objects.requireNonNull(eventsOnRoute);
        ensureEventsOnRouteIsMutable();
        this.eventsOnRoute_.set(i2, eventsOnRoute);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtendedRoutes(int i2, ExtendedRouteData extendedRouteData) {
        Objects.requireNonNull(extendedRouteData);
        ensureExtendedRoutesIsMutable();
        this.extendedRoutes_.set(i2, extendedRouteData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMarkers(int i2, Marker marker) {
        Objects.requireNonNull(marker);
        ensureMarkersIsMutable();
        this.markers_.set(i2, marker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationContent(NavigationContent navigationContent) {
        Objects.requireNonNull(navigationContent);
        this.navigationContent_ = navigationContent;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolygons(int i2, ExtendedPolygon extendedPolygon) {
        Objects.requireNonNull(extendedPolygon);
        ensurePolygonsIsMutable();
        this.polygons_.set(i2, extendedPolygon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolylines(int i2, ExtendedPolyline extendedPolyline) {
        Objects.requireNonNull(extendedPolyline);
        ensurePolylinesIsMutable();
        this.polylines_.set(i2, extendedPolyline);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0005\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001b\u0005Л\u0006\u001b\u0007\u001b\b\f", new Object[]{"bitField0_", "additionalContent_", "navigationContent_", "polygons_", ExtendedPolygon.class, "polylines_", ExtendedPolyline.class, "extendedRoutes_", ExtendedRouteData.class, "eventsOnRoute_", EventsOnRoute.class, "markers_", Marker.class, "colorScheme_"});
            case 3:
                return new MapContent();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<MapContent> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (MapContent.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public AdditionalContent getAdditionalContent() {
        AdditionalContent additionalContent = this.additionalContent_;
        return additionalContent == null ? AdditionalContent.getDefaultInstance() : additionalContent;
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public ColorScheme getColorScheme() {
        ColorScheme colorSchemeForNumber = ColorScheme.forNumber(this.colorScheme_);
        return colorSchemeForNumber == null ? ColorScheme.UNRECOGNIZED : colorSchemeForNumber;
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public int getColorSchemeValue() {
        return this.colorScheme_;
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public EventsOnRoute getEventsOnRoute(int i2) {
        return this.eventsOnRoute_.get(i2);
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public int getEventsOnRouteCount() {
        return this.eventsOnRoute_.size();
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public List<EventsOnRoute> getEventsOnRouteList() {
        return this.eventsOnRoute_;
    }

    public EventsOnRouteOrBuilder getEventsOnRouteOrBuilder(int i2) {
        return this.eventsOnRoute_.get(i2);
    }

    public List<? extends EventsOnRouteOrBuilder> getEventsOnRouteOrBuilderList() {
        return this.eventsOnRoute_;
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public ExtendedRouteData getExtendedRoutes(int i2) {
        return this.extendedRoutes_.get(i2);
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public int getExtendedRoutesCount() {
        return this.extendedRoutes_.size();
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public List<ExtendedRouteData> getExtendedRoutesList() {
        return this.extendedRoutes_;
    }

    public ExtendedRouteDataOrBuilder getExtendedRoutesOrBuilder(int i2) {
        return this.extendedRoutes_.get(i2);
    }

    public List<? extends ExtendedRouteDataOrBuilder> getExtendedRoutesOrBuilderList() {
        return this.extendedRoutes_;
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public Marker getMarkers(int i2) {
        return this.markers_.get(i2);
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public int getMarkersCount() {
        return this.markers_.size();
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public List<Marker> getMarkersList() {
        return this.markers_;
    }

    public MarkerOrBuilder getMarkersOrBuilder(int i2) {
        return this.markers_.get(i2);
    }

    public List<? extends MarkerOrBuilder> getMarkersOrBuilderList() {
        return this.markers_;
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public NavigationContent getNavigationContent() {
        NavigationContent navigationContent = this.navigationContent_;
        return navigationContent == null ? NavigationContent.getDefaultInstance() : navigationContent;
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public ExtendedPolygon getPolygons(int i2) {
        return this.polygons_.get(i2);
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public int getPolygonsCount() {
        return this.polygons_.size();
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public List<ExtendedPolygon> getPolygonsList() {
        return this.polygons_;
    }

    public ExtendedPolygonOrBuilder getPolygonsOrBuilder(int i2) {
        return this.polygons_.get(i2);
    }

    public List<? extends ExtendedPolygonOrBuilder> getPolygonsOrBuilderList() {
        return this.polygons_;
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public ExtendedPolyline getPolylines(int i2) {
        return this.polylines_.get(i2);
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public int getPolylinesCount() {
        return this.polylines_.size();
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public List<ExtendedPolyline> getPolylinesList() {
        return this.polylines_;
    }

    public ExtendedPolylineOrBuilder getPolylinesOrBuilder(int i2) {
        return this.polylines_.get(i2);
    }

    public List<? extends ExtendedPolylineOrBuilder> getPolylinesOrBuilderList() {
        return this.polylines_;
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public boolean hasAdditionalContent() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.map.MapContentOrBuilder
    public boolean hasNavigationContent() {
        return (this.bitField0_ & 2) != 0;
    }

    /* compiled from: WazeSource */
    public final class NavigationContent extends du<NavigationContent, Builder> implements NavigationContentOrBuilder {
        private static final NavigationContent DEFAULT_INSTANCE;
        public static final int NO_ACTIVE_ROUTE_FIELD_NUMBER = 1;
        private static volatile fo<NavigationContent> PARSER = null;
        public static final int SHOW_ACTIVE_ROUTE_FIELD_NUMBER = 2;
        private int activeRouteCase_ = 0;
        private Object activeRoute_;

        /* compiled from: WazeSource */
        public enum ActiveRouteCase {
            NO_ACTIVE_ROUTE(1),
            SHOW_ACTIVE_ROUTE(2),
            ACTIVEROUTE_NOT_SET(0);

            private final int value;

            ActiveRouteCase(int i2) {
                this.value = i2;
            }

            public static ActiveRouteCase forNumber(int i2) {
                if (i2 == 0) {
                    return ACTIVEROUTE_NOT_SET;
                }
                if (i2 == 1) {
                    return NO_ACTIVE_ROUTE;
                }
                if (i2 != 2) {
                    return null;
                }
                return SHOW_ACTIVE_ROUTE;
            }

            public int getNumber() {
                return this.value;
            }
        }

        /* compiled from: WazeSource */
        public interface ShowActiveRouteOrBuilder extends fj {
            boolean getArrowAutomatic();

            boolean getArrowHidden();

            ShowActiveRoute.RoutingArrowOnSegment getArrowOnSegment();

            ShowActiveRoute.RoutingArrowCase getRoutingArrowCase();

            boolean getShowDetourRoutes();

            boolean getShowRoutingLabels();

            boolean getShowSuggestedParking();

            boolean hasArrowAutomatic();

            boolean hasArrowHidden();

            boolean hasArrowOnSegment();
        }

        static {
            NavigationContent navigationContent = new NavigationContent();
            DEFAULT_INSTANCE = navigationContent;
            du.registerDefaultInstance(NavigationContent.class, navigationContent);
        }

        private NavigationContent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActiveRoute() {
            this.activeRouteCase_ = 0;
            this.activeRoute_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNoActiveRoute() {
            if (this.activeRouteCase_ == 1) {
                this.activeRouteCase_ = 0;
                this.activeRoute_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowActiveRoute() {
            if (this.activeRouteCase_ == 2) {
                this.activeRouteCase_ = 0;
                this.activeRoute_ = null;
            }
        }

        public static NavigationContent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShowActiveRoute(ShowActiveRoute showActiveRoute) {
            Objects.requireNonNull(showActiveRoute);
            if (this.activeRouteCase_ == 2 && this.activeRoute_ != ShowActiveRoute.getDefaultInstance()) {
                ShowActiveRoute.Builder builderNewBuilder = ShowActiveRoute.newBuilder((ShowActiveRoute) this.activeRoute_);
                builderNewBuilder.mergeFrom((ShowActiveRoute.Builder) showActiveRoute);
                showActiveRoute = builderNewBuilder.buildPartial();
            }
            this.activeRoute_ = showActiveRoute;
            this.activeRouteCase_ = 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NavigationContent parseDelimitedFrom(InputStream inputStream) {
            return (NavigationContent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NavigationContent parseFrom(v vVar) {
            return (NavigationContent) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<NavigationContent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNoActiveRoute(boolean z) {
            this.activeRouteCase_ = 1;
            this.activeRoute_ = Boolean.valueOf(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowActiveRoute(ShowActiveRoute showActiveRoute) {
            Objects.requireNonNull(showActiveRoute);
            this.activeRoute_ = showActiveRoute;
            this.activeRouteCase_ = 2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", new Object[]{"activeRoute_", "activeRouteCase_", ShowActiveRoute.class});
            }
            if (iOrdinal == 3) {
                return new NavigationContent();
            }
            if (iOrdinal == 4) {
                return new Builder();
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            fo<NavigationContent> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (NavigationContent.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.map.MapContent.NavigationContentOrBuilder
        public ActiveRouteCase getActiveRouteCase() {
            return ActiveRouteCase.forNumber(this.activeRouteCase_);
        }

        @Override // com.waze.jni.protos.map.MapContent.NavigationContentOrBuilder
        public boolean getNoActiveRoute() {
            if (this.activeRouteCase_ == 1) {
                return ((Boolean) this.activeRoute_).booleanValue();
            }
            return false;
        }

        @Override // com.waze.jni.protos.map.MapContent.NavigationContentOrBuilder
        public ShowActiveRoute getShowActiveRoute() {
            return this.activeRouteCase_ == 2 ? (ShowActiveRoute) this.activeRoute_ : ShowActiveRoute.getDefaultInstance();
        }

        @Override // com.waze.jni.protos.map.MapContent.NavigationContentOrBuilder
        public boolean hasNoActiveRoute() {
            return this.activeRouteCase_ == 1;
        }

        @Override // com.waze.jni.protos.map.MapContent.NavigationContentOrBuilder
        public boolean hasShowActiveRoute() {
            return this.activeRouteCase_ == 2;
        }

        /* compiled from: WazeSource */
        public final class ShowActiveRoute extends du<ShowActiveRoute, Builder> implements ShowActiveRouteOrBuilder {
            public static final int ARROW_AUTOMATIC_FIELD_NUMBER = 1;
            public static final int ARROW_HIDDEN_FIELD_NUMBER = 3;
            public static final int ARROW_ON_SEGMENT_FIELD_NUMBER = 2;
            private static final ShowActiveRoute DEFAULT_INSTANCE;
            private static volatile fo<ShowActiveRoute> PARSER = null;
            public static final int SHOW_DETOUR_ROUTES_FIELD_NUMBER = 5;
            public static final int SHOW_ROUTING_LABELS_FIELD_NUMBER = 4;
            public static final int SHOW_SUGGESTED_PARKING_FIELD_NUMBER = 6;
            private int routingArrowCase_ = 0;
            private Object routingArrow_;
            private boolean showDetourRoutes_;
            private boolean showRoutingLabels_;
            private boolean showSuggestedParking_;

            /* compiled from: WazeSource */
            public enum RoutingArrowCase {
                ARROW_AUTOMATIC(1),
                ARROW_ON_SEGMENT(2),
                ARROW_HIDDEN(3),
                ROUTINGARROW_NOT_SET(0);

                private final int value;

                RoutingArrowCase(int i2) {
                    this.value = i2;
                }

                public static RoutingArrowCase forNumber(int i2) {
                    if (i2 == 0) {
                        return ROUTINGARROW_NOT_SET;
                    }
                    if (i2 == 1) {
                        return ARROW_AUTOMATIC;
                    }
                    if (i2 == 2) {
                        return ARROW_ON_SEGMENT;
                    }
                    if (i2 != 3) {
                        return null;
                    }
                    return ARROW_HIDDEN;
                }

                public int getNumber() {
                    return this.value;
                }
            }

            /* compiled from: WazeSource */
            public interface RoutingArrowOnSegmentOrBuilder extends fj {
                int getNavigationSegmentIndex();
            }

            static {
                ShowActiveRoute showActiveRoute = new ShowActiveRoute();
                DEFAULT_INSTANCE = showActiveRoute;
                du.registerDefaultInstance(ShowActiveRoute.class, showActiveRoute);
            }

            private ShowActiveRoute() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearArrowAutomatic() {
                if (this.routingArrowCase_ == 1) {
                    this.routingArrowCase_ = 0;
                    this.routingArrow_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearArrowHidden() {
                if (this.routingArrowCase_ == 3) {
                    this.routingArrowCase_ = 0;
                    this.routingArrow_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearArrowOnSegment() {
                if (this.routingArrowCase_ == 2) {
                    this.routingArrowCase_ = 0;
                    this.routingArrow_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRoutingArrow() {
                this.routingArrowCase_ = 0;
                this.routingArrow_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearShowDetourRoutes() {
                this.showDetourRoutes_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearShowRoutingLabels() {
                this.showRoutingLabels_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearShowSuggestedParking() {
                this.showSuggestedParking_ = false;
            }

            public static ShowActiveRoute getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeArrowOnSegment(RoutingArrowOnSegment routingArrowOnSegment) {
                Objects.requireNonNull(routingArrowOnSegment);
                if (this.routingArrowCase_ == 2 && this.routingArrow_ != RoutingArrowOnSegment.getDefaultInstance()) {
                    RoutingArrowOnSegment.Builder builderNewBuilder = RoutingArrowOnSegment.newBuilder((RoutingArrowOnSegment) this.routingArrow_);
                    builderNewBuilder.mergeFrom((RoutingArrowOnSegment.Builder) routingArrowOnSegment);
                    routingArrowOnSegment = builderNewBuilder.buildPartial();
                }
                this.routingArrow_ = routingArrowOnSegment;
                this.routingArrowCase_ = 2;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static ShowActiveRoute parseDelimitedFrom(InputStream inputStream) {
                return (ShowActiveRoute) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ShowActiveRoute parseFrom(v vVar) {
                return (ShowActiveRoute) du.parseFrom(DEFAULT_INSTANCE, vVar);
            }

            public static fo<ShowActiveRoute> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setArrowAutomatic(boolean z) {
                this.routingArrowCase_ = 1;
                this.routingArrow_ = Boolean.valueOf(z);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setArrowHidden(boolean z) {
                this.routingArrowCase_ = 3;
                this.routingArrow_ = Boolean.valueOf(z);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setArrowOnSegment(RoutingArrowOnSegment routingArrowOnSegment) {
                Objects.requireNonNull(routingArrowOnSegment);
                this.routingArrow_ = routingArrowOnSegment;
                this.routingArrowCase_ = 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setShowDetourRoutes(boolean z) {
                this.showDetourRoutes_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setShowRoutingLabels(boolean z) {
                this.showRoutingLabels_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setShowSuggestedParking(boolean z) {
                this.showSuggestedParking_ = z;
            }

            @Override // com.google.v.du
            protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
                fo dnVar;
                int iOrdinal = dtVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000\u0003:\u0000\u0004\u0007\u0005\u0007\u0006\u0007", new Object[]{"routingArrow_", "routingArrowCase_", RoutingArrowOnSegment.class, "showRoutingLabels_", "showDetourRoutes_", "showSuggestedParking_"});
                }
                if (iOrdinal == 3) {
                    return new ShowActiveRoute();
                }
                if (iOrdinal == 4) {
                    return new Builder();
                }
                if (iOrdinal == 5) {
                    return DEFAULT_INSTANCE;
                }
                if (iOrdinal != 6) {
                    throw null;
                }
                fo<ShowActiveRoute> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ShowActiveRoute.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            }

            @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
            public boolean getArrowAutomatic() {
                if (this.routingArrowCase_ == 1) {
                    return ((Boolean) this.routingArrow_).booleanValue();
                }
                return false;
            }

            @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
            public boolean getArrowHidden() {
                if (this.routingArrowCase_ == 3) {
                    return ((Boolean) this.routingArrow_).booleanValue();
                }
                return false;
            }

            @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
            public RoutingArrowOnSegment getArrowOnSegment() {
                return this.routingArrowCase_ == 2 ? (RoutingArrowOnSegment) this.routingArrow_ : RoutingArrowOnSegment.getDefaultInstance();
            }

            @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
            public RoutingArrowCase getRoutingArrowCase() {
                return RoutingArrowCase.forNumber(this.routingArrowCase_);
            }

            @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
            public boolean getShowDetourRoutes() {
                return this.showDetourRoutes_;
            }

            @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
            public boolean getShowRoutingLabels() {
                return this.showRoutingLabels_;
            }

            @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
            public boolean getShowSuggestedParking() {
                return this.showSuggestedParking_;
            }

            @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
            public boolean hasArrowAutomatic() {
                return this.routingArrowCase_ == 1;
            }

            @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
            public boolean hasArrowHidden() {
                return this.routingArrowCase_ == 3;
            }

            @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
            public boolean hasArrowOnSegment() {
                return this.routingArrowCase_ == 2;
            }

            /* compiled from: WazeSource */
            public final class RoutingArrowOnSegment extends du<RoutingArrowOnSegment, Builder> implements RoutingArrowOnSegmentOrBuilder {
                private static final RoutingArrowOnSegment DEFAULT_INSTANCE;
                public static final int NAVIGATION_SEGMENT_INDEX_FIELD_NUMBER = 1;
                private static volatile fo<RoutingArrowOnSegment> PARSER;
                private int navigationSegmentIndex_;

                /* compiled from: WazeSource */
                public final class Builder extends dm<RoutingArrowOnSegment, Builder> implements RoutingArrowOnSegmentOrBuilder {
                    private Builder() {
                        super(RoutingArrowOnSegment.DEFAULT_INSTANCE);
                    }

                    public Builder clearNavigationSegmentIndex() {
                        copyOnWrite();
                        ((RoutingArrowOnSegment) this.instance).clearNavigationSegmentIndex();
                        return this;
                    }

                    @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRoute.RoutingArrowOnSegmentOrBuilder
                    public int getNavigationSegmentIndex() {
                        return ((RoutingArrowOnSegment) this.instance).getNavigationSegmentIndex();
                    }

                    public Builder setNavigationSegmentIndex(int i2) {
                        copyOnWrite();
                        ((RoutingArrowOnSegment) this.instance).setNavigationSegmentIndex(i2);
                        return this;
                    }
                }

                static {
                    RoutingArrowOnSegment routingArrowOnSegment = new RoutingArrowOnSegment();
                    DEFAULT_INSTANCE = routingArrowOnSegment;
                    du.registerDefaultInstance(RoutingArrowOnSegment.class, routingArrowOnSegment);
                }

                private RoutingArrowOnSegment() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearNavigationSegmentIndex() {
                    this.navigationSegmentIndex_ = 0;
                }

                public static RoutingArrowOnSegment getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Builder newBuilder() {
                    return (Builder) DEFAULT_INSTANCE.createBuilder();
                }

                public static RoutingArrowOnSegment parseDelimitedFrom(InputStream inputStream) {
                    return (RoutingArrowOnSegment) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static RoutingArrowOnSegment parseFrom(v vVar) {
                    return (RoutingArrowOnSegment) du.parseFrom(DEFAULT_INSTANCE, vVar);
                }

                public static fo<RoutingArrowOnSegment> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setNavigationSegmentIndex(int i2) {
                    this.navigationSegmentIndex_ = i2;
                }

                @Override // com.google.v.du
                protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
                    fo dnVar;
                    int iOrdinal = dtVar.ordinal();
                    if (iOrdinal == 0) {
                        return (byte) 1;
                    }
                    if (iOrdinal == 2) {
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"navigationSegmentIndex_"});
                    }
                    if (iOrdinal == 3) {
                        return new RoutingArrowOnSegment();
                    }
                    if (iOrdinal == 4) {
                        return new Builder();
                    }
                    if (iOrdinal == 5) {
                        return DEFAULT_INSTANCE;
                    }
                    if (iOrdinal != 6) {
                        throw null;
                    }
                    fo<RoutingArrowOnSegment> foVar = PARSER;
                    if (foVar != null) {
                        return foVar;
                    }
                    synchronized (RoutingArrowOnSegment.class) {
                        dnVar = PARSER;
                        if (dnVar == null) {
                            dnVar = new dn(DEFAULT_INSTANCE);
                            PARSER = dnVar;
                        }
                    }
                    return dnVar;
                }

                @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRoute.RoutingArrowOnSegmentOrBuilder
                public int getNavigationSegmentIndex() {
                    return this.navigationSegmentIndex_;
                }

                public static Builder newBuilder(RoutingArrowOnSegment routingArrowOnSegment) {
                    return (Builder) DEFAULT_INSTANCE.createBuilder(routingArrowOnSegment);
                }

                public static RoutingArrowOnSegment parseDelimitedFrom(InputStream inputStream, de deVar) {
                    return (RoutingArrowOnSegment) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
                }

                public static RoutingArrowOnSegment parseFrom(v vVar, de deVar) {
                    return (RoutingArrowOnSegment) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
                }

                public static RoutingArrowOnSegment parseFrom(z zVar) {
                    return (RoutingArrowOnSegment) du.parseFrom(DEFAULT_INSTANCE, zVar);
                }

                public static RoutingArrowOnSegment parseFrom(z zVar, de deVar) {
                    return (RoutingArrowOnSegment) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
                }

                public static RoutingArrowOnSegment parseFrom(InputStream inputStream) {
                    return (RoutingArrowOnSegment) du.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static RoutingArrowOnSegment parseFrom(InputStream inputStream, de deVar) {
                    return (RoutingArrowOnSegment) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
                }

                public static RoutingArrowOnSegment parseFrom(ByteBuffer byteBuffer) {
                    return (RoutingArrowOnSegment) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static RoutingArrowOnSegment parseFrom(ByteBuffer byteBuffer, de deVar) {
                    return (RoutingArrowOnSegment) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
                }

                public static RoutingArrowOnSegment parseFrom(byte[] bArr) {
                    return (RoutingArrowOnSegment) du.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static RoutingArrowOnSegment parseFrom(byte[] bArr, de deVar) {
                    return (RoutingArrowOnSegment) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
                }
            }

            public static Builder newBuilder(ShowActiveRoute showActiveRoute) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(showActiveRoute);
            }

            public static ShowActiveRoute parseDelimitedFrom(InputStream inputStream, de deVar) {
                return (ShowActiveRoute) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
            }

            public static ShowActiveRoute parseFrom(v vVar, de deVar) {
                return (ShowActiveRoute) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
            }

            public static ShowActiveRoute parseFrom(z zVar) {
                return (ShowActiveRoute) du.parseFrom(DEFAULT_INSTANCE, zVar);
            }

            public static ShowActiveRoute parseFrom(z zVar, de deVar) {
                return (ShowActiveRoute) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
            }

            public static ShowActiveRoute parseFrom(InputStream inputStream) {
                return (ShowActiveRoute) du.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ShowActiveRoute parseFrom(InputStream inputStream, de deVar) {
                return (ShowActiveRoute) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
            }

            public static ShowActiveRoute parseFrom(ByteBuffer byteBuffer) {
                return (ShowActiveRoute) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static ShowActiveRoute parseFrom(ByteBuffer byteBuffer, de deVar) {
                return (ShowActiveRoute) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
            }

            /* compiled from: WazeSource */
            public final class Builder extends dm<ShowActiveRoute, Builder> implements ShowActiveRouteOrBuilder {
                private Builder() {
                    super(ShowActiveRoute.DEFAULT_INSTANCE);
                }

                public Builder clearArrowAutomatic() {
                    copyOnWrite();
                    ((ShowActiveRoute) this.instance).clearArrowAutomatic();
                    return this;
                }

                public Builder clearArrowHidden() {
                    copyOnWrite();
                    ((ShowActiveRoute) this.instance).clearArrowHidden();
                    return this;
                }

                public Builder clearArrowOnSegment() {
                    copyOnWrite();
                    ((ShowActiveRoute) this.instance).clearArrowOnSegment();
                    return this;
                }

                public Builder clearRoutingArrow() {
                    copyOnWrite();
                    ((ShowActiveRoute) this.instance).clearRoutingArrow();
                    return this;
                }

                public Builder clearShowDetourRoutes() {
                    copyOnWrite();
                    ((ShowActiveRoute) this.instance).clearShowDetourRoutes();
                    return this;
                }

                public Builder clearShowRoutingLabels() {
                    copyOnWrite();
                    ((ShowActiveRoute) this.instance).clearShowRoutingLabels();
                    return this;
                }

                public Builder clearShowSuggestedParking() {
                    copyOnWrite();
                    ((ShowActiveRoute) this.instance).clearShowSuggestedParking();
                    return this;
                }

                @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
                public boolean getArrowAutomatic() {
                    return ((ShowActiveRoute) this.instance).getArrowAutomatic();
                }

                @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
                public boolean getArrowHidden() {
                    return ((ShowActiveRoute) this.instance).getArrowHidden();
                }

                @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
                public RoutingArrowOnSegment getArrowOnSegment() {
                    return ((ShowActiveRoute) this.instance).getArrowOnSegment();
                }

                @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
                public RoutingArrowCase getRoutingArrowCase() {
                    return ((ShowActiveRoute) this.instance).getRoutingArrowCase();
                }

                @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
                public boolean getShowDetourRoutes() {
                    return ((ShowActiveRoute) this.instance).getShowDetourRoutes();
                }

                @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
                public boolean getShowRoutingLabels() {
                    return ((ShowActiveRoute) this.instance).getShowRoutingLabels();
                }

                @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
                public boolean getShowSuggestedParking() {
                    return ((ShowActiveRoute) this.instance).getShowSuggestedParking();
                }

                @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
                public boolean hasArrowAutomatic() {
                    return ((ShowActiveRoute) this.instance).hasArrowAutomatic();
                }

                @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
                public boolean hasArrowHidden() {
                    return ((ShowActiveRoute) this.instance).hasArrowHidden();
                }

                @Override // com.waze.jni.protos.map.MapContent.NavigationContent.ShowActiveRouteOrBuilder
                public boolean hasArrowOnSegment() {
                    return ((ShowActiveRoute) this.instance).hasArrowOnSegment();
                }

                public Builder mergeArrowOnSegment(RoutingArrowOnSegment routingArrowOnSegment) {
                    copyOnWrite();
                    ((ShowActiveRoute) this.instance).mergeArrowOnSegment(routingArrowOnSegment);
                    return this;
                }

                public Builder setArrowAutomatic(boolean z) {
                    copyOnWrite();
                    ((ShowActiveRoute) this.instance).setArrowAutomatic(z);
                    return this;
                }

                public Builder setArrowHidden(boolean z) {
                    copyOnWrite();
                    ((ShowActiveRoute) this.instance).setArrowHidden(z);
                    return this;
                }

                public Builder setArrowOnSegment(RoutingArrowOnSegment.Builder builder) {
                    copyOnWrite();
                    ((ShowActiveRoute) this.instance).setArrowOnSegment(builder.build());
                    return this;
                }

                public Builder setShowDetourRoutes(boolean z) {
                    copyOnWrite();
                    ((ShowActiveRoute) this.instance).setShowDetourRoutes(z);
                    return this;
                }

                public Builder setShowRoutingLabels(boolean z) {
                    copyOnWrite();
                    ((ShowActiveRoute) this.instance).setShowRoutingLabels(z);
                    return this;
                }

                public Builder setShowSuggestedParking(boolean z) {
                    copyOnWrite();
                    ((ShowActiveRoute) this.instance).setShowSuggestedParking(z);
                    return this;
                }

                public Builder setArrowOnSegment(RoutingArrowOnSegment routingArrowOnSegment) {
                    copyOnWrite();
                    ((ShowActiveRoute) this.instance).setArrowOnSegment(routingArrowOnSegment);
                    return this;
                }
            }

            public static ShowActiveRoute parseFrom(byte[] bArr) {
                return (ShowActiveRoute) du.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ShowActiveRoute parseFrom(byte[] bArr, de deVar) {
                return (ShowActiveRoute) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
            }
        }

        public static Builder newBuilder(NavigationContent navigationContent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(navigationContent);
        }

        public static NavigationContent parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (NavigationContent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static NavigationContent parseFrom(v vVar, de deVar) {
            return (NavigationContent) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static NavigationContent parseFrom(z zVar) {
            return (NavigationContent) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static NavigationContent parseFrom(z zVar, de deVar) {
            return (NavigationContent) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static NavigationContent parseFrom(InputStream inputStream) {
            return (NavigationContent) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NavigationContent parseFrom(InputStream inputStream, de deVar) {
            return (NavigationContent) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static NavigationContent parseFrom(ByteBuffer byteBuffer) {
            return (NavigationContent) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static NavigationContent parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (NavigationContent) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<NavigationContent, Builder> implements NavigationContentOrBuilder {
            private Builder() {
                super(NavigationContent.DEFAULT_INSTANCE);
            }

            public Builder clearActiveRoute() {
                copyOnWrite();
                ((NavigationContent) this.instance).clearActiveRoute();
                return this;
            }

            public Builder clearNoActiveRoute() {
                copyOnWrite();
                ((NavigationContent) this.instance).clearNoActiveRoute();
                return this;
            }

            public Builder clearShowActiveRoute() {
                copyOnWrite();
                ((NavigationContent) this.instance).clearShowActiveRoute();
                return this;
            }

            @Override // com.waze.jni.protos.map.MapContent.NavigationContentOrBuilder
            public ActiveRouteCase getActiveRouteCase() {
                return ((NavigationContent) this.instance).getActiveRouteCase();
            }

            @Override // com.waze.jni.protos.map.MapContent.NavigationContentOrBuilder
            public boolean getNoActiveRoute() {
                return ((NavigationContent) this.instance).getNoActiveRoute();
            }

            @Override // com.waze.jni.protos.map.MapContent.NavigationContentOrBuilder
            public ShowActiveRoute getShowActiveRoute() {
                return ((NavigationContent) this.instance).getShowActiveRoute();
            }

            @Override // com.waze.jni.protos.map.MapContent.NavigationContentOrBuilder
            public boolean hasNoActiveRoute() {
                return ((NavigationContent) this.instance).hasNoActiveRoute();
            }

            @Override // com.waze.jni.protos.map.MapContent.NavigationContentOrBuilder
            public boolean hasShowActiveRoute() {
                return ((NavigationContent) this.instance).hasShowActiveRoute();
            }

            public Builder mergeShowActiveRoute(ShowActiveRoute showActiveRoute) {
                copyOnWrite();
                ((NavigationContent) this.instance).mergeShowActiveRoute(showActiveRoute);
                return this;
            }

            public Builder setNoActiveRoute(boolean z) {
                copyOnWrite();
                ((NavigationContent) this.instance).setNoActiveRoute(z);
                return this;
            }

            public Builder setShowActiveRoute(ShowActiveRoute.Builder builder) {
                copyOnWrite();
                ((NavigationContent) this.instance).setShowActiveRoute(builder.build());
                return this;
            }

            public Builder setShowActiveRoute(ShowActiveRoute showActiveRoute) {
                copyOnWrite();
                ((NavigationContent) this.instance).setShowActiveRoute(showActiveRoute);
                return this;
            }
        }

        public static NavigationContent parseFrom(byte[] bArr) {
            return (NavigationContent) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NavigationContent parseFrom(byte[] bArr, de deVar) {
            return (NavigationContent) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class AdditionalContent extends du<AdditionalContent, Builder> implements AdditionalContentOrBuilder {
        private static final AdditionalContent DEFAULT_INSTANCE;
        public static final int MAP_POIS_FIELD_NUMBER = 8;
        public static final int OBJECT_SAMPLER_ENABLED_FIELD_NUMBER = 9;
        private static volatile fo<AdditionalContent> PARSER = null;
        public static final int SHOW_ADS_FIELD_NUMBER = 5;
        public static final int SHOW_CYCLISTS_FIELD_NUMBER = 10;
        public static final int SHOW_REALTIME_ALERTS_FIELD_NUMBER = 2;
        public static final int SHOW_REALTIME_EXTERNAL_POI_FIELD_NUMBER = 4;
        public static final int SHOW_REALTIME_TRAFFIC_FIELD_NUMBER = 3;
        public static final int SHOW_USER_LOCATION_FIELD_NUMBER = 1;
        public static final int SHOW_WAZERS_FIELD_NUMBER = 6;
        public static final int TILE_ALERTS_FIELD_NUMBER = 7;
        private int bitField0_;
        private MapPois mapPois_;
        private boolean objectSamplerEnabled_;
        private boolean showAds_;
        private boolean showCyclists_;
        private RealtimeAlerts showRealtimeAlerts_;
        private boolean showRealtimeExternalPoi_;
        private boolean showRealtimeTraffic_;
        private boolean showUserLocation_;
        private boolean showWazers_;
        private TileAlerts tileAlerts_;

        /* compiled from: WazeSource */
        public interface MapPoisOrBuilder extends fj {
            boolean getShowDeparturePoi();

            boolean getShowDestinationPoi();

            boolean getShowHomePoi();

            boolean getShowParkedPoi();

            boolean getShowWaypointPoi();

            boolean getShowWorkPoi();
        }

        /* compiled from: WazeSource */
        public interface RealtimeAlertsOrBuilder extends fj {
            boolean getShowAlertsOnRouteOnly();
        }

        /* compiled from: WazeSource */
        public interface TileAlertsOrBuilder extends fj {
            boolean getDisableAerialRadiusTrafficLights();

            boolean getShowAlertsOnRouteOnly();
        }

        static {
            AdditionalContent additionalContent = new AdditionalContent();
            DEFAULT_INSTANCE = additionalContent;
            du.registerDefaultInstance(AdditionalContent.class, additionalContent);
        }

        private AdditionalContent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMapPois() {
            this.mapPois_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearObjectSamplerEnabled() {
            this.objectSamplerEnabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowAds() {
            this.showAds_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowCyclists() {
            this.showCyclists_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowRealtimeAlerts() {
            this.showRealtimeAlerts_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowRealtimeExternalPoi() {
            this.showRealtimeExternalPoi_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowRealtimeTraffic() {
            this.showRealtimeTraffic_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowUserLocation() {
            this.showUserLocation_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowWazers() {
            this.showWazers_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTileAlerts() {
            this.tileAlerts_ = null;
            this.bitField0_ &= -3;
        }

        public static AdditionalContent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMapPois(MapPois mapPois) {
            Objects.requireNonNull(mapPois);
            MapPois mapPois2 = this.mapPois_;
            if (mapPois2 != null && mapPois2 != MapPois.getDefaultInstance()) {
                MapPois.Builder builderNewBuilder = MapPois.newBuilder(mapPois2);
                builderNewBuilder.mergeFrom((MapPois.Builder) mapPois);
                mapPois = builderNewBuilder.buildPartial();
            }
            this.mapPois_ = mapPois;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShowRealtimeAlerts(RealtimeAlerts realtimeAlerts) {
            Objects.requireNonNull(realtimeAlerts);
            RealtimeAlerts realtimeAlerts2 = this.showRealtimeAlerts_;
            if (realtimeAlerts2 != null && realtimeAlerts2 != RealtimeAlerts.getDefaultInstance()) {
                RealtimeAlerts.Builder builderNewBuilder = RealtimeAlerts.newBuilder(realtimeAlerts2);
                builderNewBuilder.mergeFrom((RealtimeAlerts.Builder) realtimeAlerts);
                realtimeAlerts = builderNewBuilder.buildPartial();
            }
            this.showRealtimeAlerts_ = realtimeAlerts;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTileAlerts(TileAlerts tileAlerts) {
            Objects.requireNonNull(tileAlerts);
            TileAlerts tileAlerts2 = this.tileAlerts_;
            if (tileAlerts2 != null && tileAlerts2 != TileAlerts.getDefaultInstance()) {
                TileAlerts.Builder builderNewBuilder = TileAlerts.newBuilder(tileAlerts2);
                builderNewBuilder.mergeFrom((TileAlerts.Builder) tileAlerts);
                tileAlerts = builderNewBuilder.buildPartial();
            }
            this.tileAlerts_ = tileAlerts;
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AdditionalContent parseDelimitedFrom(InputStream inputStream) {
            return (AdditionalContent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdditionalContent parseFrom(v vVar) {
            return (AdditionalContent) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<AdditionalContent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMapPois(MapPois mapPois) {
            Objects.requireNonNull(mapPois);
            this.mapPois_ = mapPois;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setObjectSamplerEnabled(boolean z) {
            this.objectSamplerEnabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowAds(boolean z) {
            this.showAds_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowCyclists(boolean z) {
            this.showCyclists_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowRealtimeAlerts(RealtimeAlerts realtimeAlerts) {
            Objects.requireNonNull(realtimeAlerts);
            this.showRealtimeAlerts_ = realtimeAlerts;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowRealtimeExternalPoi(boolean z) {
            this.showRealtimeExternalPoi_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowRealtimeTraffic(boolean z) {
            this.showRealtimeTraffic_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowUserLocation(boolean z) {
            this.showUserLocation_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowWazers(boolean z) {
            this.showWazers_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTileAlerts(TileAlerts tileAlerts) {
            Objects.requireNonNull(tileAlerts);
            this.tileAlerts_ = tileAlerts;
            this.bitField0_ |= 2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u0007\u0002ဉ\u0000\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007ဉ\u0001\bဉ\u0002\t\u0007\n\u0007", new Object[]{"bitField0_", "showUserLocation_", "showRealtimeAlerts_", "showRealtimeTraffic_", "showRealtimeExternalPoi_", "showAds_", "showWazers_", "tileAlerts_", "mapPois_", "objectSamplerEnabled_", "showCyclists_"});
            }
            if (iOrdinal == 3) {
                return new AdditionalContent();
            }
            if (iOrdinal == 4) {
                return new Builder();
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            fo<AdditionalContent> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (AdditionalContent.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
        public MapPois getMapPois() {
            MapPois mapPois = this.mapPois_;
            return mapPois == null ? MapPois.getDefaultInstance() : mapPois;
        }

        @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
        public boolean getObjectSamplerEnabled() {
            return this.objectSamplerEnabled_;
        }

        @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
        public boolean getShowAds() {
            return this.showAds_;
        }

        @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
        public boolean getShowCyclists() {
            return this.showCyclists_;
        }

        @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
        public RealtimeAlerts getShowRealtimeAlerts() {
            RealtimeAlerts realtimeAlerts = this.showRealtimeAlerts_;
            return realtimeAlerts == null ? RealtimeAlerts.getDefaultInstance() : realtimeAlerts;
        }

        @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
        public boolean getShowRealtimeExternalPoi() {
            return this.showRealtimeExternalPoi_;
        }

        @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
        public boolean getShowRealtimeTraffic() {
            return this.showRealtimeTraffic_;
        }

        @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
        public boolean getShowUserLocation() {
            return this.showUserLocation_;
        }

        @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
        public boolean getShowWazers() {
            return this.showWazers_;
        }

        @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
        public TileAlerts getTileAlerts() {
            TileAlerts tileAlerts = this.tileAlerts_;
            return tileAlerts == null ? TileAlerts.getDefaultInstance() : tileAlerts;
        }

        @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
        public boolean hasMapPois() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
        public boolean hasShowRealtimeAlerts() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
        public boolean hasTileAlerts() {
            return (this.bitField0_ & 2) != 0;
        }

        /* compiled from: WazeSource */
        public final class MapPois extends du<MapPois, Builder> implements MapPoisOrBuilder {
            private static final MapPois DEFAULT_INSTANCE;
            private static volatile fo<MapPois> PARSER = null;
            public static final int SHOW_DEPARTURE_POI_FIELD_NUMBER = 6;
            public static final int SHOW_DESTINATION_POI_FIELD_NUMBER = 3;
            public static final int SHOW_HOME_POI_FIELD_NUMBER = 1;
            public static final int SHOW_PARKED_POI_FIELD_NUMBER = 5;
            public static final int SHOW_WAYPOINT_POI_FIELD_NUMBER = 4;
            public static final int SHOW_WORK_POI_FIELD_NUMBER = 2;
            private boolean showDeparturePoi_;
            private boolean showDestinationPoi_;
            private boolean showHomePoi_;
            private boolean showParkedPoi_;
            private boolean showWaypointPoi_;
            private boolean showWorkPoi_;

            /* compiled from: WazeSource */
            public final class Builder extends dm<MapPois, Builder> implements MapPoisOrBuilder {
                private Builder() {
                    super(MapPois.DEFAULT_INSTANCE);
                }

                public Builder clearShowDeparturePoi() {
                    copyOnWrite();
                    ((MapPois) this.instance).clearShowDeparturePoi();
                    return this;
                }

                public Builder clearShowDestinationPoi() {
                    copyOnWrite();
                    ((MapPois) this.instance).clearShowDestinationPoi();
                    return this;
                }

                public Builder clearShowHomePoi() {
                    copyOnWrite();
                    ((MapPois) this.instance).clearShowHomePoi();
                    return this;
                }

                public Builder clearShowParkedPoi() {
                    copyOnWrite();
                    ((MapPois) this.instance).clearShowParkedPoi();
                    return this;
                }

                public Builder clearShowWaypointPoi() {
                    copyOnWrite();
                    ((MapPois) this.instance).clearShowWaypointPoi();
                    return this;
                }

                public Builder clearShowWorkPoi() {
                    copyOnWrite();
                    ((MapPois) this.instance).clearShowWorkPoi();
                    return this;
                }

                @Override // com.waze.jni.protos.map.MapContent.AdditionalContent.MapPoisOrBuilder
                public boolean getShowDeparturePoi() {
                    return ((MapPois) this.instance).getShowDeparturePoi();
                }

                @Override // com.waze.jni.protos.map.MapContent.AdditionalContent.MapPoisOrBuilder
                public boolean getShowDestinationPoi() {
                    return ((MapPois) this.instance).getShowDestinationPoi();
                }

                @Override // com.waze.jni.protos.map.MapContent.AdditionalContent.MapPoisOrBuilder
                public boolean getShowHomePoi() {
                    return ((MapPois) this.instance).getShowHomePoi();
                }

                @Override // com.waze.jni.protos.map.MapContent.AdditionalContent.MapPoisOrBuilder
                public boolean getShowParkedPoi() {
                    return ((MapPois) this.instance).getShowParkedPoi();
                }

                @Override // com.waze.jni.protos.map.MapContent.AdditionalContent.MapPoisOrBuilder
                public boolean getShowWaypointPoi() {
                    return ((MapPois) this.instance).getShowWaypointPoi();
                }

                @Override // com.waze.jni.protos.map.MapContent.AdditionalContent.MapPoisOrBuilder
                public boolean getShowWorkPoi() {
                    return ((MapPois) this.instance).getShowWorkPoi();
                }

                public Builder setShowDeparturePoi(boolean z) {
                    copyOnWrite();
                    ((MapPois) this.instance).setShowDeparturePoi(z);
                    return this;
                }

                public Builder setShowDestinationPoi(boolean z) {
                    copyOnWrite();
                    ((MapPois) this.instance).setShowDestinationPoi(z);
                    return this;
                }

                public Builder setShowHomePoi(boolean z) {
                    copyOnWrite();
                    ((MapPois) this.instance).setShowHomePoi(z);
                    return this;
                }

                public Builder setShowParkedPoi(boolean z) {
                    copyOnWrite();
                    ((MapPois) this.instance).setShowParkedPoi(z);
                    return this;
                }

                public Builder setShowWaypointPoi(boolean z) {
                    copyOnWrite();
                    ((MapPois) this.instance).setShowWaypointPoi(z);
                    return this;
                }

                public Builder setShowWorkPoi(boolean z) {
                    copyOnWrite();
                    ((MapPois) this.instance).setShowWorkPoi(z);
                    return this;
                }
            }

            static {
                MapPois mapPois = new MapPois();
                DEFAULT_INSTANCE = mapPois;
                du.registerDefaultInstance(MapPois.class, mapPois);
            }

            private MapPois() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearShowDeparturePoi() {
                this.showDeparturePoi_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearShowDestinationPoi() {
                this.showDestinationPoi_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearShowHomePoi() {
                this.showHomePoi_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearShowParkedPoi() {
                this.showParkedPoi_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearShowWaypointPoi() {
                this.showWaypointPoi_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearShowWorkPoi() {
                this.showWorkPoi_ = false;
            }

            public static MapPois getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static MapPois parseDelimitedFrom(InputStream inputStream) {
                return (MapPois) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static MapPois parseFrom(v vVar) {
                return (MapPois) du.parseFrom(DEFAULT_INSTANCE, vVar);
            }

            public static fo<MapPois> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setShowDeparturePoi(boolean z) {
                this.showDeparturePoi_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setShowDestinationPoi(boolean z) {
                this.showDestinationPoi_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setShowHomePoi(boolean z) {
                this.showHomePoi_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setShowParkedPoi(boolean z) {
                this.showParkedPoi_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setShowWaypointPoi(boolean z) {
                this.showWaypointPoi_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setShowWorkPoi(boolean z) {
                this.showWorkPoi_ = z;
            }

            @Override // com.google.v.du
            protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
                fo dnVar;
                int iOrdinal = dtVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007", new Object[]{"showHomePoi_", "showWorkPoi_", "showDestinationPoi_", "showWaypointPoi_", "showParkedPoi_", "showDeparturePoi_"});
                }
                if (iOrdinal == 3) {
                    return new MapPois();
                }
                if (iOrdinal == 4) {
                    return new Builder();
                }
                if (iOrdinal == 5) {
                    return DEFAULT_INSTANCE;
                }
                if (iOrdinal != 6) {
                    throw null;
                }
                fo<MapPois> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (MapPois.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContent.MapPoisOrBuilder
            public boolean getShowDeparturePoi() {
                return this.showDeparturePoi_;
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContent.MapPoisOrBuilder
            public boolean getShowDestinationPoi() {
                return this.showDestinationPoi_;
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContent.MapPoisOrBuilder
            public boolean getShowHomePoi() {
                return this.showHomePoi_;
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContent.MapPoisOrBuilder
            public boolean getShowParkedPoi() {
                return this.showParkedPoi_;
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContent.MapPoisOrBuilder
            public boolean getShowWaypointPoi() {
                return this.showWaypointPoi_;
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContent.MapPoisOrBuilder
            public boolean getShowWorkPoi() {
                return this.showWorkPoi_;
            }

            public static Builder newBuilder(MapPois mapPois) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(mapPois);
            }

            public static MapPois parseDelimitedFrom(InputStream inputStream, de deVar) {
                return (MapPois) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
            }

            public static MapPois parseFrom(v vVar, de deVar) {
                return (MapPois) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
            }

            public static MapPois parseFrom(z zVar) {
                return (MapPois) du.parseFrom(DEFAULT_INSTANCE, zVar);
            }

            public static MapPois parseFrom(z zVar, de deVar) {
                return (MapPois) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
            }

            public static MapPois parseFrom(InputStream inputStream) {
                return (MapPois) du.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static MapPois parseFrom(InputStream inputStream, de deVar) {
                return (MapPois) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
            }

            public static MapPois parseFrom(ByteBuffer byteBuffer) {
                return (MapPois) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static MapPois parseFrom(ByteBuffer byteBuffer, de deVar) {
                return (MapPois) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
            }

            public static MapPois parseFrom(byte[] bArr) {
                return (MapPois) du.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static MapPois parseFrom(byte[] bArr, de deVar) {
                return (MapPois) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
            }
        }

        /* compiled from: WazeSource */
        public final class RealtimeAlerts extends du<RealtimeAlerts, Builder> implements RealtimeAlertsOrBuilder {
            private static final RealtimeAlerts DEFAULT_INSTANCE;
            private static volatile fo<RealtimeAlerts> PARSER = null;
            public static final int SHOW_ALERTS_ON_ROUTE_ONLY_FIELD_NUMBER = 1;
            private boolean showAlertsOnRouteOnly_;

            /* compiled from: WazeSource */
            public final class Builder extends dm<RealtimeAlerts, Builder> implements RealtimeAlertsOrBuilder {
                private Builder() {
                    super(RealtimeAlerts.DEFAULT_INSTANCE);
                }

                public Builder clearShowAlertsOnRouteOnly() {
                    copyOnWrite();
                    ((RealtimeAlerts) this.instance).clearShowAlertsOnRouteOnly();
                    return this;
                }

                @Override // com.waze.jni.protos.map.MapContent.AdditionalContent.RealtimeAlertsOrBuilder
                public boolean getShowAlertsOnRouteOnly() {
                    return ((RealtimeAlerts) this.instance).getShowAlertsOnRouteOnly();
                }

                public Builder setShowAlertsOnRouteOnly(boolean z) {
                    copyOnWrite();
                    ((RealtimeAlerts) this.instance).setShowAlertsOnRouteOnly(z);
                    return this;
                }
            }

            static {
                RealtimeAlerts realtimeAlerts = new RealtimeAlerts();
                DEFAULT_INSTANCE = realtimeAlerts;
                du.registerDefaultInstance(RealtimeAlerts.class, realtimeAlerts);
            }

            private RealtimeAlerts() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearShowAlertsOnRouteOnly() {
                this.showAlertsOnRouteOnly_ = false;
            }

            public static RealtimeAlerts getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static RealtimeAlerts parseDelimitedFrom(InputStream inputStream) {
                return (RealtimeAlerts) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RealtimeAlerts parseFrom(v vVar) {
                return (RealtimeAlerts) du.parseFrom(DEFAULT_INSTANCE, vVar);
            }

            public static fo<RealtimeAlerts> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setShowAlertsOnRouteOnly(boolean z) {
                this.showAlertsOnRouteOnly_ = z;
            }

            @Override // com.google.v.du
            protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
                fo dnVar;
                int iOrdinal = dtVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"showAlertsOnRouteOnly_"});
                }
                if (iOrdinal == 3) {
                    return new RealtimeAlerts();
                }
                if (iOrdinal == 4) {
                    return new Builder();
                }
                if (iOrdinal == 5) {
                    return DEFAULT_INSTANCE;
                }
                if (iOrdinal != 6) {
                    throw null;
                }
                fo<RealtimeAlerts> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (RealtimeAlerts.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContent.RealtimeAlertsOrBuilder
            public boolean getShowAlertsOnRouteOnly() {
                return this.showAlertsOnRouteOnly_;
            }

            public static Builder newBuilder(RealtimeAlerts realtimeAlerts) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(realtimeAlerts);
            }

            public static RealtimeAlerts parseDelimitedFrom(InputStream inputStream, de deVar) {
                return (RealtimeAlerts) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
            }

            public static RealtimeAlerts parseFrom(v vVar, de deVar) {
                return (RealtimeAlerts) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
            }

            public static RealtimeAlerts parseFrom(z zVar) {
                return (RealtimeAlerts) du.parseFrom(DEFAULT_INSTANCE, zVar);
            }

            public static RealtimeAlerts parseFrom(z zVar, de deVar) {
                return (RealtimeAlerts) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
            }

            public static RealtimeAlerts parseFrom(InputStream inputStream) {
                return (RealtimeAlerts) du.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RealtimeAlerts parseFrom(InputStream inputStream, de deVar) {
                return (RealtimeAlerts) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
            }

            public static RealtimeAlerts parseFrom(ByteBuffer byteBuffer) {
                return (RealtimeAlerts) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static RealtimeAlerts parseFrom(ByteBuffer byteBuffer, de deVar) {
                return (RealtimeAlerts) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
            }

            public static RealtimeAlerts parseFrom(byte[] bArr) {
                return (RealtimeAlerts) du.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static RealtimeAlerts parseFrom(byte[] bArr, de deVar) {
                return (RealtimeAlerts) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
            }
        }

        /* compiled from: WazeSource */
        public final class TileAlerts extends du<TileAlerts, Builder> implements TileAlertsOrBuilder {
            private static final TileAlerts DEFAULT_INSTANCE;
            public static final int DISABLE_AERIAL_RADIUS_TRAFFIC_LIGHTS_FIELD_NUMBER = 2;
            private static volatile fo<TileAlerts> PARSER = null;
            public static final int SHOW_ALERTS_ON_ROUTE_ONLY_FIELD_NUMBER = 1;
            private boolean disableAerialRadiusTrafficLights_;
            private boolean showAlertsOnRouteOnly_;

            /* compiled from: WazeSource */
            public final class Builder extends dm<TileAlerts, Builder> implements TileAlertsOrBuilder {
                private Builder() {
                    super(TileAlerts.DEFAULT_INSTANCE);
                }

                public Builder clearDisableAerialRadiusTrafficLights() {
                    copyOnWrite();
                    ((TileAlerts) this.instance).clearDisableAerialRadiusTrafficLights();
                    return this;
                }

                public Builder clearShowAlertsOnRouteOnly() {
                    copyOnWrite();
                    ((TileAlerts) this.instance).clearShowAlertsOnRouteOnly();
                    return this;
                }

                @Override // com.waze.jni.protos.map.MapContent.AdditionalContent.TileAlertsOrBuilder
                public boolean getDisableAerialRadiusTrafficLights() {
                    return ((TileAlerts) this.instance).getDisableAerialRadiusTrafficLights();
                }

                @Override // com.waze.jni.protos.map.MapContent.AdditionalContent.TileAlertsOrBuilder
                public boolean getShowAlertsOnRouteOnly() {
                    return ((TileAlerts) this.instance).getShowAlertsOnRouteOnly();
                }

                public Builder setDisableAerialRadiusTrafficLights(boolean z) {
                    copyOnWrite();
                    ((TileAlerts) this.instance).setDisableAerialRadiusTrafficLights(z);
                    return this;
                }

                public Builder setShowAlertsOnRouteOnly(boolean z) {
                    copyOnWrite();
                    ((TileAlerts) this.instance).setShowAlertsOnRouteOnly(z);
                    return this;
                }
            }

            static {
                TileAlerts tileAlerts = new TileAlerts();
                DEFAULT_INSTANCE = tileAlerts;
                du.registerDefaultInstance(TileAlerts.class, tileAlerts);
            }

            private TileAlerts() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDisableAerialRadiusTrafficLights() {
                this.disableAerialRadiusTrafficLights_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearShowAlertsOnRouteOnly() {
                this.showAlertsOnRouteOnly_ = false;
            }

            public static TileAlerts getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static TileAlerts parseDelimitedFrom(InputStream inputStream) {
                return (TileAlerts) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TileAlerts parseFrom(v vVar) {
                return (TileAlerts) du.parseFrom(DEFAULT_INSTANCE, vVar);
            }

            public static fo<TileAlerts> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDisableAerialRadiusTrafficLights(boolean z) {
                this.disableAerialRadiusTrafficLights_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setShowAlertsOnRouteOnly(boolean z) {
                this.showAlertsOnRouteOnly_ = z;
            }

            @Override // com.google.v.du
            protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
                fo dnVar;
                int iOrdinal = dtVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"showAlertsOnRouteOnly_", "disableAerialRadiusTrafficLights_"});
                }
                if (iOrdinal == 3) {
                    return new TileAlerts();
                }
                if (iOrdinal == 4) {
                    return new Builder();
                }
                if (iOrdinal == 5) {
                    return DEFAULT_INSTANCE;
                }
                if (iOrdinal != 6) {
                    throw null;
                }
                fo<TileAlerts> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (TileAlerts.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContent.TileAlertsOrBuilder
            public boolean getDisableAerialRadiusTrafficLights() {
                return this.disableAerialRadiusTrafficLights_;
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContent.TileAlertsOrBuilder
            public boolean getShowAlertsOnRouteOnly() {
                return this.showAlertsOnRouteOnly_;
            }

            public static Builder newBuilder(TileAlerts tileAlerts) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(tileAlerts);
            }

            public static TileAlerts parseDelimitedFrom(InputStream inputStream, de deVar) {
                return (TileAlerts) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
            }

            public static TileAlerts parseFrom(v vVar, de deVar) {
                return (TileAlerts) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
            }

            public static TileAlerts parseFrom(z zVar) {
                return (TileAlerts) du.parseFrom(DEFAULT_INSTANCE, zVar);
            }

            public static TileAlerts parseFrom(z zVar, de deVar) {
                return (TileAlerts) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
            }

            public static TileAlerts parseFrom(InputStream inputStream) {
                return (TileAlerts) du.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TileAlerts parseFrom(InputStream inputStream, de deVar) {
                return (TileAlerts) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
            }

            public static TileAlerts parseFrom(ByteBuffer byteBuffer) {
                return (TileAlerts) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static TileAlerts parseFrom(ByteBuffer byteBuffer, de deVar) {
                return (TileAlerts) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
            }

            public static TileAlerts parseFrom(byte[] bArr) {
                return (TileAlerts) du.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static TileAlerts parseFrom(byte[] bArr, de deVar) {
                return (TileAlerts) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
            }
        }

        public static Builder newBuilder(AdditionalContent additionalContent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(additionalContent);
        }

        public static AdditionalContent parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (AdditionalContent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static AdditionalContent parseFrom(v vVar, de deVar) {
            return (AdditionalContent) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static AdditionalContent parseFrom(z zVar) {
            return (AdditionalContent) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static AdditionalContent parseFrom(z zVar, de deVar) {
            return (AdditionalContent) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static AdditionalContent parseFrom(InputStream inputStream) {
            return (AdditionalContent) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdditionalContent parseFrom(InputStream inputStream, de deVar) {
            return (AdditionalContent) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static AdditionalContent parseFrom(ByteBuffer byteBuffer) {
            return (AdditionalContent) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static AdditionalContent parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (AdditionalContent) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<AdditionalContent, Builder> implements AdditionalContentOrBuilder {
            private Builder() {
                super(AdditionalContent.DEFAULT_INSTANCE);
            }

            public Builder clearMapPois() {
                copyOnWrite();
                ((AdditionalContent) this.instance).clearMapPois();
                return this;
            }

            public Builder clearObjectSamplerEnabled() {
                copyOnWrite();
                ((AdditionalContent) this.instance).clearObjectSamplerEnabled();
                return this;
            }

            public Builder clearShowAds() {
                copyOnWrite();
                ((AdditionalContent) this.instance).clearShowAds();
                return this;
            }

            public Builder clearShowCyclists() {
                copyOnWrite();
                ((AdditionalContent) this.instance).clearShowCyclists();
                return this;
            }

            public Builder clearShowRealtimeAlerts() {
                copyOnWrite();
                ((AdditionalContent) this.instance).clearShowRealtimeAlerts();
                return this;
            }

            public Builder clearShowRealtimeExternalPoi() {
                copyOnWrite();
                ((AdditionalContent) this.instance).clearShowRealtimeExternalPoi();
                return this;
            }

            public Builder clearShowRealtimeTraffic() {
                copyOnWrite();
                ((AdditionalContent) this.instance).clearShowRealtimeTraffic();
                return this;
            }

            public Builder clearShowUserLocation() {
                copyOnWrite();
                ((AdditionalContent) this.instance).clearShowUserLocation();
                return this;
            }

            public Builder clearShowWazers() {
                copyOnWrite();
                ((AdditionalContent) this.instance).clearShowWazers();
                return this;
            }

            public Builder clearTileAlerts() {
                copyOnWrite();
                ((AdditionalContent) this.instance).clearTileAlerts();
                return this;
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
            public MapPois getMapPois() {
                return ((AdditionalContent) this.instance).getMapPois();
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
            public boolean getObjectSamplerEnabled() {
                return ((AdditionalContent) this.instance).getObjectSamplerEnabled();
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
            public boolean getShowAds() {
                return ((AdditionalContent) this.instance).getShowAds();
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
            public boolean getShowCyclists() {
                return ((AdditionalContent) this.instance).getShowCyclists();
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
            public RealtimeAlerts getShowRealtimeAlerts() {
                return ((AdditionalContent) this.instance).getShowRealtimeAlerts();
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
            public boolean getShowRealtimeExternalPoi() {
                return ((AdditionalContent) this.instance).getShowRealtimeExternalPoi();
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
            public boolean getShowRealtimeTraffic() {
                return ((AdditionalContent) this.instance).getShowRealtimeTraffic();
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
            public boolean getShowUserLocation() {
                return ((AdditionalContent) this.instance).getShowUserLocation();
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
            public boolean getShowWazers() {
                return ((AdditionalContent) this.instance).getShowWazers();
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
            public TileAlerts getTileAlerts() {
                return ((AdditionalContent) this.instance).getTileAlerts();
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
            public boolean hasMapPois() {
                return ((AdditionalContent) this.instance).hasMapPois();
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
            public boolean hasShowRealtimeAlerts() {
                return ((AdditionalContent) this.instance).hasShowRealtimeAlerts();
            }

            @Override // com.waze.jni.protos.map.MapContent.AdditionalContentOrBuilder
            public boolean hasTileAlerts() {
                return ((AdditionalContent) this.instance).hasTileAlerts();
            }

            public Builder mergeMapPois(MapPois mapPois) {
                copyOnWrite();
                ((AdditionalContent) this.instance).mergeMapPois(mapPois);
                return this;
            }

            public Builder mergeShowRealtimeAlerts(RealtimeAlerts realtimeAlerts) {
                copyOnWrite();
                ((AdditionalContent) this.instance).mergeShowRealtimeAlerts(realtimeAlerts);
                return this;
            }

            public Builder mergeTileAlerts(TileAlerts tileAlerts) {
                copyOnWrite();
                ((AdditionalContent) this.instance).mergeTileAlerts(tileAlerts);
                return this;
            }

            public Builder setMapPois(MapPois.Builder builder) {
                copyOnWrite();
                ((AdditionalContent) this.instance).setMapPois(builder.build());
                return this;
            }

            public Builder setObjectSamplerEnabled(boolean z) {
                copyOnWrite();
                ((AdditionalContent) this.instance).setObjectSamplerEnabled(z);
                return this;
            }

            public Builder setShowAds(boolean z) {
                copyOnWrite();
                ((AdditionalContent) this.instance).setShowAds(z);
                return this;
            }

            public Builder setShowCyclists(boolean z) {
                copyOnWrite();
                ((AdditionalContent) this.instance).setShowCyclists(z);
                return this;
            }

            public Builder setShowRealtimeAlerts(RealtimeAlerts.Builder builder) {
                copyOnWrite();
                ((AdditionalContent) this.instance).setShowRealtimeAlerts(builder.build());
                return this;
            }

            public Builder setShowRealtimeExternalPoi(boolean z) {
                copyOnWrite();
                ((AdditionalContent) this.instance).setShowRealtimeExternalPoi(z);
                return this;
            }

            public Builder setShowRealtimeTraffic(boolean z) {
                copyOnWrite();
                ((AdditionalContent) this.instance).setShowRealtimeTraffic(z);
                return this;
            }

            public Builder setShowUserLocation(boolean z) {
                copyOnWrite();
                ((AdditionalContent) this.instance).setShowUserLocation(z);
                return this;
            }

            public Builder setShowWazers(boolean z) {
                copyOnWrite();
                ((AdditionalContent) this.instance).setShowWazers(z);
                return this;
            }

            public Builder setTileAlerts(TileAlerts.Builder builder) {
                copyOnWrite();
                ((AdditionalContent) this.instance).setTileAlerts(builder.build());
                return this;
            }

            public Builder setMapPois(MapPois mapPois) {
                copyOnWrite();
                ((AdditionalContent) this.instance).setMapPois(mapPois);
                return this;
            }

            public Builder setShowRealtimeAlerts(RealtimeAlerts realtimeAlerts) {
                copyOnWrite();
                ((AdditionalContent) this.instance).setShowRealtimeAlerts(realtimeAlerts);
                return this;
            }

            public Builder setTileAlerts(TileAlerts tileAlerts) {
                copyOnWrite();
                ((AdditionalContent) this.instance).setTileAlerts(tileAlerts);
                return this;
            }
        }

        public static AdditionalContent parseFrom(byte[] bArr) {
            return (AdditionalContent) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdditionalContent parseFrom(byte[] bArr, de deVar) {
            return (AdditionalContent) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(MapContent mapContent) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(mapContent);
    }

    public static MapContent parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (MapContent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapContent parseFrom(v vVar, de deVar) {
        return (MapContent) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static MapContent parseFrom(z zVar) {
        return (MapContent) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static MapContent parseFrom(z zVar, de deVar) {
        return (MapContent) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEventsOnRoute(EventsOnRoute eventsOnRoute) {
        Objects.requireNonNull(eventsOnRoute);
        ensureEventsOnRouteIsMutable();
        this.eventsOnRoute_.add(eventsOnRoute);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtendedRoutes(ExtendedRouteData extendedRouteData) {
        Objects.requireNonNull(extendedRouteData);
        ensureExtendedRoutesIsMutable();
        this.extendedRoutes_.add(extendedRouteData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMarkers(Marker marker) {
        Objects.requireNonNull(marker);
        ensureMarkersIsMutable();
        this.markers_.add(marker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPolygons(ExtendedPolygon extendedPolygon) {
        Objects.requireNonNull(extendedPolygon);
        ensurePolygonsIsMutable();
        this.polygons_.add(extendedPolygon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPolylines(ExtendedPolyline extendedPolyline) {
        Objects.requireNonNull(extendedPolyline);
        ensurePolylinesIsMutable();
        this.polylines_.add(extendedPolyline);
    }

    public static MapContent parseFrom(InputStream inputStream) {
        return (MapContent) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapContent parseFrom(InputStream inputStream, de deVar) {
        return (MapContent) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapContent parseFrom(ByteBuffer byteBuffer) {
        return (MapContent) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MapContent parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (MapContent) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<MapContent, Builder> implements MapContentOrBuilder {
        private Builder() {
            super(MapContent.DEFAULT_INSTANCE);
        }

        public Builder addAllEventsOnRoute(Iterable<? extends EventsOnRoute> iterable) {
            copyOnWrite();
            ((MapContent) this.instance).addAllEventsOnRoute(iterable);
            return this;
        }

        public Builder addAllExtendedRoutes(Iterable<? extends ExtendedRouteData> iterable) {
            copyOnWrite();
            ((MapContent) this.instance).addAllExtendedRoutes(iterable);
            return this;
        }

        public Builder addAllMarkers(Iterable<? extends Marker> iterable) {
            copyOnWrite();
            ((MapContent) this.instance).addAllMarkers(iterable);
            return this;
        }

        public Builder addAllPolygons(Iterable<? extends ExtendedPolygon> iterable) {
            copyOnWrite();
            ((MapContent) this.instance).addAllPolygons(iterable);
            return this;
        }

        public Builder addAllPolylines(Iterable<? extends ExtendedPolyline> iterable) {
            copyOnWrite();
            ((MapContent) this.instance).addAllPolylines(iterable);
            return this;
        }

        public Builder addEventsOnRoute(int i2, EventsOnRoute.Builder builder) {
            copyOnWrite();
            ((MapContent) this.instance).addEventsOnRoute(i2, builder.build());
            return this;
        }

        public Builder addExtendedRoutes(int i2, ExtendedRouteData.Builder builder) {
            copyOnWrite();
            ((MapContent) this.instance).addExtendedRoutes(i2, builder.build());
            return this;
        }

        public Builder addMarkers(int i2, Marker.Builder builder) {
            copyOnWrite();
            ((MapContent) this.instance).addMarkers(i2, builder.build());
            return this;
        }

        public Builder addPolygons(int i2, ExtendedPolygon.Builder builder) {
            copyOnWrite();
            ((MapContent) this.instance).addPolygons(i2, builder.build());
            return this;
        }

        public Builder addPolylines(int i2, ExtendedPolyline.Builder builder) {
            copyOnWrite();
            ((MapContent) this.instance).addPolylines(i2, builder.build());
            return this;
        }

        public Builder clearAdditionalContent() {
            copyOnWrite();
            ((MapContent) this.instance).clearAdditionalContent();
            return this;
        }

        public Builder clearColorScheme() {
            copyOnWrite();
            ((MapContent) this.instance).clearColorScheme();
            return this;
        }

        public Builder clearEventsOnRoute() {
            copyOnWrite();
            ((MapContent) this.instance).clearEventsOnRoute();
            return this;
        }

        public Builder clearExtendedRoutes() {
            copyOnWrite();
            ((MapContent) this.instance).clearExtendedRoutes();
            return this;
        }

        public Builder clearMarkers() {
            copyOnWrite();
            ((MapContent) this.instance).clearMarkers();
            return this;
        }

        public Builder clearNavigationContent() {
            copyOnWrite();
            ((MapContent) this.instance).clearNavigationContent();
            return this;
        }

        public Builder clearPolygons() {
            copyOnWrite();
            ((MapContent) this.instance).clearPolygons();
            return this;
        }

        public Builder clearPolylines() {
            copyOnWrite();
            ((MapContent) this.instance).clearPolylines();
            return this;
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public AdditionalContent getAdditionalContent() {
            return ((MapContent) this.instance).getAdditionalContent();
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public ColorScheme getColorScheme() {
            return ((MapContent) this.instance).getColorScheme();
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public int getColorSchemeValue() {
            return ((MapContent) this.instance).getColorSchemeValue();
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public EventsOnRoute getEventsOnRoute(int i2) {
            return ((MapContent) this.instance).getEventsOnRoute(i2);
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public int getEventsOnRouteCount() {
            return ((MapContent) this.instance).getEventsOnRouteCount();
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public List<EventsOnRoute> getEventsOnRouteList() {
            return DesugarCollections.unmodifiableList(((MapContent) this.instance).getEventsOnRouteList());
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public ExtendedRouteData getExtendedRoutes(int i2) {
            return ((MapContent) this.instance).getExtendedRoutes(i2);
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public int getExtendedRoutesCount() {
            return ((MapContent) this.instance).getExtendedRoutesCount();
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public List<ExtendedRouteData> getExtendedRoutesList() {
            return DesugarCollections.unmodifiableList(((MapContent) this.instance).getExtendedRoutesList());
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public Marker getMarkers(int i2) {
            return ((MapContent) this.instance).getMarkers(i2);
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public int getMarkersCount() {
            return ((MapContent) this.instance).getMarkersCount();
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public List<Marker> getMarkersList() {
            return DesugarCollections.unmodifiableList(((MapContent) this.instance).getMarkersList());
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public NavigationContent getNavigationContent() {
            return ((MapContent) this.instance).getNavigationContent();
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public ExtendedPolygon getPolygons(int i2) {
            return ((MapContent) this.instance).getPolygons(i2);
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public int getPolygonsCount() {
            return ((MapContent) this.instance).getPolygonsCount();
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public List<ExtendedPolygon> getPolygonsList() {
            return DesugarCollections.unmodifiableList(((MapContent) this.instance).getPolygonsList());
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public ExtendedPolyline getPolylines(int i2) {
            return ((MapContent) this.instance).getPolylines(i2);
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public int getPolylinesCount() {
            return ((MapContent) this.instance).getPolylinesCount();
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public List<ExtendedPolyline> getPolylinesList() {
            return DesugarCollections.unmodifiableList(((MapContent) this.instance).getPolylinesList());
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public boolean hasAdditionalContent() {
            return ((MapContent) this.instance).hasAdditionalContent();
        }

        @Override // com.waze.jni.protos.map.MapContentOrBuilder
        public boolean hasNavigationContent() {
            return ((MapContent) this.instance).hasNavigationContent();
        }

        public Builder mergeAdditionalContent(AdditionalContent additionalContent) {
            copyOnWrite();
            ((MapContent) this.instance).mergeAdditionalContent(additionalContent);
            return this;
        }

        public Builder mergeNavigationContent(NavigationContent navigationContent) {
            copyOnWrite();
            ((MapContent) this.instance).mergeNavigationContent(navigationContent);
            return this;
        }

        public Builder removeEventsOnRoute(int i2) {
            copyOnWrite();
            ((MapContent) this.instance).removeEventsOnRoute(i2);
            return this;
        }

        public Builder removeExtendedRoutes(int i2) {
            copyOnWrite();
            ((MapContent) this.instance).removeExtendedRoutes(i2);
            return this;
        }

        public Builder removeMarkers(int i2) {
            copyOnWrite();
            ((MapContent) this.instance).removeMarkers(i2);
            return this;
        }

        public Builder removePolygons(int i2) {
            copyOnWrite();
            ((MapContent) this.instance).removePolygons(i2);
            return this;
        }

        public Builder removePolylines(int i2) {
            copyOnWrite();
            ((MapContent) this.instance).removePolylines(i2);
            return this;
        }

        public Builder setAdditionalContent(AdditionalContent.Builder builder) {
            copyOnWrite();
            ((MapContent) this.instance).setAdditionalContent(builder.build());
            return this;
        }

        public Builder setColorScheme(ColorScheme colorScheme) {
            copyOnWrite();
            ((MapContent) this.instance).setColorScheme(colorScheme);
            return this;
        }

        public Builder setColorSchemeValue(int i2) {
            copyOnWrite();
            ((MapContent) this.instance).setColorSchemeValue(i2);
            return this;
        }

        public Builder setEventsOnRoute(int i2, EventsOnRoute.Builder builder) {
            copyOnWrite();
            ((MapContent) this.instance).setEventsOnRoute(i2, builder.build());
            return this;
        }

        public Builder setExtendedRoutes(int i2, ExtendedRouteData.Builder builder) {
            copyOnWrite();
            ((MapContent) this.instance).setExtendedRoutes(i2, builder.build());
            return this;
        }

        public Builder setMarkers(int i2, Marker.Builder builder) {
            copyOnWrite();
            ((MapContent) this.instance).setMarkers(i2, builder.build());
            return this;
        }

        public Builder setNavigationContent(NavigationContent.Builder builder) {
            copyOnWrite();
            ((MapContent) this.instance).setNavigationContent(builder.build());
            return this;
        }

        public Builder setPolygons(int i2, ExtendedPolygon.Builder builder) {
            copyOnWrite();
            ((MapContent) this.instance).setPolygons(i2, builder.build());
            return this;
        }

        public Builder setPolylines(int i2, ExtendedPolyline.Builder builder) {
            copyOnWrite();
            ((MapContent) this.instance).setPolylines(i2, builder.build());
            return this;
        }

        public Builder addEventsOnRoute(int i2, EventsOnRoute eventsOnRoute) {
            copyOnWrite();
            ((MapContent) this.instance).addEventsOnRoute(i2, eventsOnRoute);
            return this;
        }

        public Builder addExtendedRoutes(int i2, ExtendedRouteData extendedRouteData) {
            copyOnWrite();
            ((MapContent) this.instance).addExtendedRoutes(i2, extendedRouteData);
            return this;
        }

        public Builder addMarkers(int i2, Marker marker) {
            copyOnWrite();
            ((MapContent) this.instance).addMarkers(i2, marker);
            return this;
        }

        public Builder addPolygons(int i2, ExtendedPolygon extendedPolygon) {
            copyOnWrite();
            ((MapContent) this.instance).addPolygons(i2, extendedPolygon);
            return this;
        }

        public Builder addPolylines(int i2, ExtendedPolyline extendedPolyline) {
            copyOnWrite();
            ((MapContent) this.instance).addPolylines(i2, extendedPolyline);
            return this;
        }

        public Builder setAdditionalContent(AdditionalContent additionalContent) {
            copyOnWrite();
            ((MapContent) this.instance).setAdditionalContent(additionalContent);
            return this;
        }

        public Builder setEventsOnRoute(int i2, EventsOnRoute eventsOnRoute) {
            copyOnWrite();
            ((MapContent) this.instance).setEventsOnRoute(i2, eventsOnRoute);
            return this;
        }

        public Builder setExtendedRoutes(int i2, ExtendedRouteData extendedRouteData) {
            copyOnWrite();
            ((MapContent) this.instance).setExtendedRoutes(i2, extendedRouteData);
            return this;
        }

        public Builder setMarkers(int i2, Marker marker) {
            copyOnWrite();
            ((MapContent) this.instance).setMarkers(i2, marker);
            return this;
        }

        public Builder setNavigationContent(NavigationContent navigationContent) {
            copyOnWrite();
            ((MapContent) this.instance).setNavigationContent(navigationContent);
            return this;
        }

        public Builder setPolygons(int i2, ExtendedPolygon extendedPolygon) {
            copyOnWrite();
            ((MapContent) this.instance).setPolygons(i2, extendedPolygon);
            return this;
        }

        public Builder setPolylines(int i2, ExtendedPolyline extendedPolyline) {
            copyOnWrite();
            ((MapContent) this.instance).setPolylines(i2, extendedPolyline);
            return this;
        }

        public Builder addEventsOnRoute(EventsOnRoute.Builder builder) {
            copyOnWrite();
            ((MapContent) this.instance).addEventsOnRoute(builder.build());
            return this;
        }

        public Builder addExtendedRoutes(ExtendedRouteData.Builder builder) {
            copyOnWrite();
            ((MapContent) this.instance).addExtendedRoutes(builder.build());
            return this;
        }

        public Builder addMarkers(Marker.Builder builder) {
            copyOnWrite();
            ((MapContent) this.instance).addMarkers(builder.build());
            return this;
        }

        public Builder addPolygons(ExtendedPolygon.Builder builder) {
            copyOnWrite();
            ((MapContent) this.instance).addPolygons(builder.build());
            return this;
        }

        public Builder addPolylines(ExtendedPolyline.Builder builder) {
            copyOnWrite();
            ((MapContent) this.instance).addPolylines(builder.build());
            return this;
        }

        public Builder addEventsOnRoute(EventsOnRoute eventsOnRoute) {
            copyOnWrite();
            ((MapContent) this.instance).addEventsOnRoute(eventsOnRoute);
            return this;
        }

        public Builder addExtendedRoutes(ExtendedRouteData extendedRouteData) {
            copyOnWrite();
            ((MapContent) this.instance).addExtendedRoutes(extendedRouteData);
            return this;
        }

        public Builder addMarkers(Marker marker) {
            copyOnWrite();
            ((MapContent) this.instance).addMarkers(marker);
            return this;
        }

        public Builder addPolygons(ExtendedPolygon extendedPolygon) {
            copyOnWrite();
            ((MapContent) this.instance).addPolygons(extendedPolygon);
            return this;
        }

        public Builder addPolylines(ExtendedPolyline extendedPolyline) {
            copyOnWrite();
            ((MapContent) this.instance).addPolylines(extendedPolyline);
            return this;
        }
    }

    public static MapContent parseFrom(byte[] bArr) {
        return (MapContent) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MapContent parseFrom(byte[] bArr, de deVar) {
        return (MapContent) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
