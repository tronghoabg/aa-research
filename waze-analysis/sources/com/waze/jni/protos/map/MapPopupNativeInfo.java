package com.waze.jni.protos.map;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.VenueData;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapPopupNativeInfo extends du<MapPopupNativeInfo, Builder> implements MapPopupNativeInfoOrBuilder {
    private static final MapPopupNativeInfo DEFAULT_INSTANCE;
    public static final int DETAILS_POPUP_INFO_FIELD_NUMBER = 1;
    private static volatile fo<MapPopupNativeInfo> PARSER = null;
    public static final int WAZER_POPUP_INFO_FIELD_NUMBER = 2;
    private int popupInfoCase_ = 0;
    private Object popupInfo_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.MapPopupNativeInfo$1, reason: invalid class name */
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
    public interface DetailsPopupInfoOrBuilder extends fj {
        Position.IntPosition getCoordinate();

        String getInfo();

        v getInfoBytes();

        boolean getLoader();

        String getMsg();

        v getMsgBytes();

        String getPoiInfoUrl();

        v getPoiInfoUrlBytes();

        String getPreviewIcon();

        v getPreviewIconBytes();

        Style getStyle();

        int getStyleValue();

        int getTimeoutSeconds();

        String getTitle();

        v getTitleBytes();

        WazeUiMapPopupType getType();

        int getTypeValue();

        VenueData getVenue();

        VenueData getVenueOriginal();

        int getWalkingDistanceMeters();

        boolean hasCoordinate();

        boolean hasInfo();

        boolean hasPoiInfoUrl();

        boolean hasPreviewIcon();

        boolean hasTimeoutSeconds();

        boolean hasTitle();

        boolean hasVenue();

        boolean hasVenueOriginal();

        boolean hasWalkingDistanceMeters();
    }

    /* compiled from: WazeSource */
    public enum PopupInfoCase {
        DETAILS_POPUP_INFO(1),
        WAZER_POPUP_INFO(2),
        POPUPINFO_NOT_SET(0);

        private final int value;

        PopupInfoCase(int i2) {
            this.value = i2;
        }

        public static PopupInfoCase forNumber(int i2) {
            if (i2 == 0) {
                return POPUPINFO_NOT_SET;
            }
            if (i2 == 1) {
                return DETAILS_POPUP_INFO;
            }
            if (i2 != 2) {
                return null;
            }
            return WAZER_POPUP_INFO;
        }

        public int getNumber() {
            return this.value;
        }
    }

    /* compiled from: WazeSource */
    public enum Style implements eg {
        STYLE_UNKNOWN(0),
        STYLE_SMALL(1),
        STYLE_LARGE(2),
        UNRECOGNIZED(-1);

        public static final int STYLE_LARGE_VALUE = 2;
        public static final int STYLE_SMALL_VALUE = 1;
        public static final int STYLE_UNKNOWN_VALUE = 0;
        private static final eh<Style> internalValueMap = new eh<Style>() { // from class: com.waze.jni.protos.map.MapPopupNativeInfo.Style.1
            @Override // com.google.v.eh
            public Style findValueByNumber(int i2) {
                return Style.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class StyleVerifier implements ei {
            static final ei INSTANCE = new StyleVerifier();

            private StyleVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return Style.forNumber(i2) != null;
            }
        }

        Style(int i2) {
            this.value = i2;
        }

        public static Style forNumber(int i2) {
            if (i2 == 0) {
                return STYLE_UNKNOWN;
            }
            if (i2 == 1) {
                return STYLE_SMALL;
            }
            if (i2 != 2) {
                return null;
            }
            return STYLE_LARGE;
        }

        public static eh<Style> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return StyleVerifier.INSTANCE;
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
    public enum WazeUiMapPopupType implements eg {
        waze_ui_map_popup_type_none(0),
        waze_ui_map_popup_type_my_location(1),
        waze_ui_map_popup_type_segment(2),
        waze_ui_map_popup_type_show_on_map(3),
        waze_ui_map_popup_type_start_point(4),
        waze_ui_map_popup_type_home(5),
        waze_ui_map_popup_type_work(6),
        waze_ui_map_popup_type_parked(7),
        waze_ui_map_popup_type_can_park(8),
        waze_ui_map_popup_type_new_venue(9),
        waze_ui_map_popup_type_user(10),
        waze_ui_map_popup_type_search(11),
        waze_ui_map_popup_type_parking_orig_dest(12),
        UNRECOGNIZED(-1);

        private static final eh<WazeUiMapPopupType> internalValueMap = new eh<WazeUiMapPopupType>() { // from class: com.waze.jni.protos.map.MapPopupNativeInfo.WazeUiMapPopupType.1
            @Override // com.google.v.eh
            public WazeUiMapPopupType findValueByNumber(int i2) {
                return WazeUiMapPopupType.forNumber(i2);
            }
        };
        public static final int waze_ui_map_popup_type_can_park_VALUE = 8;
        public static final int waze_ui_map_popup_type_home_VALUE = 5;
        public static final int waze_ui_map_popup_type_my_location_VALUE = 1;
        public static final int waze_ui_map_popup_type_new_venue_VALUE = 9;
        public static final int waze_ui_map_popup_type_none_VALUE = 0;
        public static final int waze_ui_map_popup_type_parked_VALUE = 7;
        public static final int waze_ui_map_popup_type_parking_orig_dest_VALUE = 12;
        public static final int waze_ui_map_popup_type_search_VALUE = 11;
        public static final int waze_ui_map_popup_type_segment_VALUE = 2;
        public static final int waze_ui_map_popup_type_show_on_map_VALUE = 3;
        public static final int waze_ui_map_popup_type_start_point_VALUE = 4;
        public static final int waze_ui_map_popup_type_user_VALUE = 10;
        public static final int waze_ui_map_popup_type_work_VALUE = 6;
        private final int value;

        /* compiled from: WazeSource */
        final class WazeUiMapPopupTypeVerifier implements ei {
            static final ei INSTANCE = new WazeUiMapPopupTypeVerifier();

            private WazeUiMapPopupTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return WazeUiMapPopupType.forNumber(i2) != null;
            }
        }

        WazeUiMapPopupType(int i2) {
            this.value = i2;
        }

        public static WazeUiMapPopupType forNumber(int i2) {
            switch (i2) {
                case 0:
                    return waze_ui_map_popup_type_none;
                case 1:
                    return waze_ui_map_popup_type_my_location;
                case 2:
                    return waze_ui_map_popup_type_segment;
                case 3:
                    return waze_ui_map_popup_type_show_on_map;
                case 4:
                    return waze_ui_map_popup_type_start_point;
                case 5:
                    return waze_ui_map_popup_type_home;
                case 6:
                    return waze_ui_map_popup_type_work;
                case 7:
                    return waze_ui_map_popup_type_parked;
                case 8:
                    return waze_ui_map_popup_type_can_park;
                case 9:
                    return waze_ui_map_popup_type_new_venue;
                case 10:
                    return waze_ui_map_popup_type_user;
                case 11:
                    return waze_ui_map_popup_type_search;
                case 12:
                    return waze_ui_map_popup_type_parking_orig_dest;
                default:
                    return null;
            }
        }

        public static eh<WazeUiMapPopupType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return WazeUiMapPopupTypeVerifier.INSTANCE;
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
    public interface WazerPopupInfoOrBuilder extends fj {
        String getAddon();

        v getAddonBytes();

        int getAzimuth();

        Position.IntPosition getCoordinate();

        int getId();

        String getJoined();

        v getJoinedBytes();

        String getMood();

        v getMoodBytes();

        String getName();

        v getNameBytes();

        String getPoints();

        v getPointsBytes();

        String getSpeed();

        v getSpeedBytes();

        boolean hasAddon();

        boolean hasCoordinate();

        boolean hasJoined();

        boolean hasPoints();
    }

    static {
        MapPopupNativeInfo mapPopupNativeInfo = new MapPopupNativeInfo();
        DEFAULT_INSTANCE = mapPopupNativeInfo;
        du.registerDefaultInstance(MapPopupNativeInfo.class, mapPopupNativeInfo);
    }

    private MapPopupNativeInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetailsPopupInfo() {
        if (this.popupInfoCase_ == 1) {
            this.popupInfoCase_ = 0;
            this.popupInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopupInfo() {
        this.popupInfoCase_ = 0;
        this.popupInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWazerPopupInfo() {
        if (this.popupInfoCase_ == 2) {
            this.popupInfoCase_ = 0;
            this.popupInfo_ = null;
        }
    }

    public static MapPopupNativeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDetailsPopupInfo(DetailsPopupInfo detailsPopupInfo) {
        Objects.requireNonNull(detailsPopupInfo);
        if (this.popupInfoCase_ == 1 && this.popupInfo_ != DetailsPopupInfo.getDefaultInstance()) {
            DetailsPopupInfo.Builder builderNewBuilder = DetailsPopupInfo.newBuilder((DetailsPopupInfo) this.popupInfo_);
            builderNewBuilder.mergeFrom((DetailsPopupInfo.Builder) detailsPopupInfo);
            detailsPopupInfo = builderNewBuilder.buildPartial();
        }
        this.popupInfo_ = detailsPopupInfo;
        this.popupInfoCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWazerPopupInfo(WazerPopupInfo wazerPopupInfo) {
        Objects.requireNonNull(wazerPopupInfo);
        if (this.popupInfoCase_ == 2 && this.popupInfo_ != WazerPopupInfo.getDefaultInstance()) {
            WazerPopupInfo.Builder builderNewBuilder = WazerPopupInfo.newBuilder((WazerPopupInfo) this.popupInfo_);
            builderNewBuilder.mergeFrom((WazerPopupInfo.Builder) wazerPopupInfo);
            wazerPopupInfo = builderNewBuilder.buildPartial();
        }
        this.popupInfo_ = wazerPopupInfo;
        this.popupInfoCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MapPopupNativeInfo parseDelimitedFrom(InputStream inputStream) {
        return (MapPopupNativeInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapPopupNativeInfo parseFrom(v vVar) {
        return (MapPopupNativeInfo) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<MapPopupNativeInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetailsPopupInfo(DetailsPopupInfo detailsPopupInfo) {
        Objects.requireNonNull(detailsPopupInfo);
        this.popupInfo_ = detailsPopupInfo;
        this.popupInfoCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazerPopupInfo(WazerPopupInfo wazerPopupInfo) {
        Objects.requireNonNull(wazerPopupInfo);
        this.popupInfo_ = wazerPopupInfo;
        this.popupInfoCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"popupInfo_", "popupInfoCase_", DetailsPopupInfo.class, WazerPopupInfo.class});
        }
        if (iOrdinal == 3) {
            return new MapPopupNativeInfo();
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
        fo<MapPopupNativeInfo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (MapPopupNativeInfo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.MapPopupNativeInfoOrBuilder
    public DetailsPopupInfo getDetailsPopupInfo() {
        return this.popupInfoCase_ == 1 ? (DetailsPopupInfo) this.popupInfo_ : DetailsPopupInfo.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.map.MapPopupNativeInfoOrBuilder
    public PopupInfoCase getPopupInfoCase() {
        return PopupInfoCase.forNumber(this.popupInfoCase_);
    }

    @Override // com.waze.jni.protos.map.MapPopupNativeInfoOrBuilder
    public WazerPopupInfo getWazerPopupInfo() {
        return this.popupInfoCase_ == 2 ? (WazerPopupInfo) this.popupInfo_ : WazerPopupInfo.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.map.MapPopupNativeInfoOrBuilder
    public boolean hasDetailsPopupInfo() {
        return this.popupInfoCase_ == 1;
    }

    @Override // com.waze.jni.protos.map.MapPopupNativeInfoOrBuilder
    public boolean hasWazerPopupInfo() {
        return this.popupInfoCase_ == 2;
    }

    /* compiled from: WazeSource */
    public final class DetailsPopupInfo extends du<DetailsPopupInfo, Builder> implements DetailsPopupInfoOrBuilder {
        public static final int COORDINATE_FIELD_NUMBER = 6;
        private static final DetailsPopupInfo DEFAULT_INSTANCE;
        public static final int INFO_FIELD_NUMBER = 3;
        public static final int LOADER_FIELD_NUMBER = 4;
        public static final int MSG_FIELD_NUMBER = 2;
        private static volatile fo<DetailsPopupInfo> PARSER = null;
        public static final int POI_INFO_URL_FIELD_NUMBER = 7;
        public static final int PREVIEW_ICON_FIELD_NUMBER = 8;
        public static final int STYLE_FIELD_NUMBER = 13;
        public static final int TIMEOUT_SECONDS_FIELD_NUMBER = 12;
        public static final int TITLE_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 5;
        public static final int VENUE_FIELD_NUMBER = 9;
        public static final int VENUE_ORIGINAL_FIELD_NUMBER = 10;
        public static final int WALKING_DISTANCE_METERS_FIELD_NUMBER = 11;
        private int bitField0_;
        private Position.IntPosition coordinate_;
        private boolean loader_;
        private int style_;
        private int timeoutSeconds_;
        private int type_;
        private VenueData venueOriginal_;
        private VenueData venue_;
        private int walkingDistanceMeters_;
        private String title_ = "";
        private String msg_ = "";
        private String info_ = "";
        private String poiInfoUrl_ = "";
        private String previewIcon_ = "";

        static {
            DetailsPopupInfo detailsPopupInfo = new DetailsPopupInfo();
            DEFAULT_INSTANCE = detailsPopupInfo;
            du.registerDefaultInstance(DetailsPopupInfo.class, detailsPopupInfo);
        }

        private DetailsPopupInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCoordinate() {
            this.coordinate_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInfo() {
            this.bitField0_ &= -3;
            this.info_ = getDefaultInstance().getInfo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoader() {
            this.loader_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsg() {
            this.msg_ = getDefaultInstance().getMsg();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPoiInfoUrl() {
            this.bitField0_ &= -9;
            this.poiInfoUrl_ = getDefaultInstance().getPoiInfoUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPreviewIcon() {
            this.bitField0_ &= -17;
            this.previewIcon_ = getDefaultInstance().getPreviewIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStyle() {
            this.style_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeoutSeconds() {
            this.bitField0_ &= -257;
            this.timeoutSeconds_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.bitField0_ &= -2;
            this.title_ = getDefaultInstance().getTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVenue() {
            this.venue_ = null;
            this.bitField0_ &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVenueOriginal() {
            this.venueOriginal_ = null;
            this.bitField0_ &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWalkingDistanceMeters() {
            this.bitField0_ &= -129;
            this.walkingDistanceMeters_ = 0;
        }

        public static DetailsPopupInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCoordinate(Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            Position.IntPosition intPosition2 = this.coordinate_;
            if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
                Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
                builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
                intPosition = builderNewBuilder.buildPartial();
            }
            this.coordinate_ = intPosition;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVenue(VenueData venueData) {
            Objects.requireNonNull(venueData);
            VenueData venueData2 = this.venue_;
            if (venueData2 != null && venueData2 != VenueData.getDefaultInstance()) {
                VenueData.Builder builderNewBuilder = VenueData.newBuilder(venueData2);
                builderNewBuilder.mergeFrom((VenueData.Builder) venueData);
                venueData = builderNewBuilder.buildPartial();
            }
            this.venue_ = venueData;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeVenueOriginal(VenueData venueData) {
            Objects.requireNonNull(venueData);
            VenueData venueData2 = this.venueOriginal_;
            if (venueData2 != null && venueData2 != VenueData.getDefaultInstance()) {
                VenueData.Builder builderNewBuilder = VenueData.newBuilder(venueData2);
                builderNewBuilder.mergeFrom((VenueData.Builder) venueData);
                venueData = builderNewBuilder.buildPartial();
            }
            this.venueOriginal_ = venueData;
            this.bitField0_ |= 64;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DetailsPopupInfo parseDelimitedFrom(InputStream inputStream) {
            return (DetailsPopupInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DetailsPopupInfo parseFrom(v vVar) {
            return (DetailsPopupInfo) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<DetailsPopupInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoordinate(Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            this.coordinate_ = intPosition;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInfo(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 2;
            this.info_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInfoBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.info_ = vVar.u();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoader(boolean z) {
            this.loader_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsg(String str) {
            Objects.requireNonNull(str);
            this.msg_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.msg_ = vVar.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPoiInfoUrl(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 8;
            this.poiInfoUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPoiInfoUrlBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.poiInfoUrl_ = vVar.u();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPreviewIcon(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 16;
            this.previewIcon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPreviewIconBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.previewIcon_ = vVar.u();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStyle(Style style) {
            this.style_ = style.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStyleValue(int i2) {
            this.style_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeoutSeconds(int i2) {
            this.bitField0_ |= 256;
            this.timeoutSeconds_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 1;
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.title_ = vVar.u();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(WazeUiMapPopupType wazeUiMapPopupType) {
            this.type_ = wazeUiMapPopupType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i2) {
            this.type_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVenue(VenueData venueData) {
            Objects.requireNonNull(venueData);
            this.venue_ = venueData;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVenueOriginal(VenueData venueData) {
            Objects.requireNonNull(venueData);
            this.venueOriginal_ = venueData;
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWalkingDistanceMeters(int i2) {
            this.bitField0_ |= 128;
            this.walkingDistanceMeters_ = i2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ለ\u0000\u0002Ȉ\u0003ለ\u0001\u0004\u0007\u0005\f\u0006ဉ\u0002\u0007ለ\u0003\bለ\u0004\tဉ\u0005\nဉ\u0006\u000bင\u0007\fင\b\r\f", new Object[]{"bitField0_", "title_", "msg_", "info_", "loader_", "type_", "coordinate_", "poiInfoUrl_", "previewIcon_", "venue_", "venueOriginal_", "walkingDistanceMeters_", "timeoutSeconds_", "style_"});
            }
            if (iOrdinal == 3) {
                return new DetailsPopupInfo();
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
            fo<DetailsPopupInfo> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (DetailsPopupInfo.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public Position.IntPosition getCoordinate() {
            Position.IntPosition intPosition = this.coordinate_;
            return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public String getInfo() {
            return this.info_;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public v getInfoBytes() {
            return v.s(this.info_);
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public boolean getLoader() {
            return this.loader_;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public String getMsg() {
            return this.msg_;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public v getMsgBytes() {
            return v.s(this.msg_);
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public String getPoiInfoUrl() {
            return this.poiInfoUrl_;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public v getPoiInfoUrlBytes() {
            return v.s(this.poiInfoUrl_);
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public String getPreviewIcon() {
            return this.previewIcon_;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public v getPreviewIconBytes() {
            return v.s(this.previewIcon_);
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public Style getStyle() {
            Style styleForNumber = Style.forNumber(this.style_);
            return styleForNumber == null ? Style.UNRECOGNIZED : styleForNumber;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public int getStyleValue() {
            return this.style_;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public int getTimeoutSeconds() {
            return this.timeoutSeconds_;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public v getTitleBytes() {
            return v.s(this.title_);
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public WazeUiMapPopupType getType() {
            WazeUiMapPopupType wazeUiMapPopupTypeForNumber = WazeUiMapPopupType.forNumber(this.type_);
            return wazeUiMapPopupTypeForNumber == null ? WazeUiMapPopupType.UNRECOGNIZED : wazeUiMapPopupTypeForNumber;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public VenueData getVenue() {
            VenueData venueData = this.venue_;
            return venueData == null ? VenueData.getDefaultInstance() : venueData;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public VenueData getVenueOriginal() {
            VenueData venueData = this.venueOriginal_;
            return venueData == null ? VenueData.getDefaultInstance() : venueData;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public int getWalkingDistanceMeters() {
            return this.walkingDistanceMeters_;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public boolean hasCoordinate() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public boolean hasInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public boolean hasPoiInfoUrl() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public boolean hasPreviewIcon() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public boolean hasTimeoutSeconds() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public boolean hasTitle() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public boolean hasVenue() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public boolean hasVenueOriginal() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
        public boolean hasWalkingDistanceMeters() {
            return (this.bitField0_ & 128) != 0;
        }

        public static Builder newBuilder(DetailsPopupInfo detailsPopupInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(detailsPopupInfo);
        }

        public static DetailsPopupInfo parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (DetailsPopupInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static DetailsPopupInfo parseFrom(v vVar, de deVar) {
            return (DetailsPopupInfo) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static DetailsPopupInfo parseFrom(z zVar) {
            return (DetailsPopupInfo) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static DetailsPopupInfo parseFrom(z zVar, de deVar) {
            return (DetailsPopupInfo) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static DetailsPopupInfo parseFrom(InputStream inputStream) {
            return (DetailsPopupInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DetailsPopupInfo parseFrom(InputStream inputStream, de deVar) {
            return (DetailsPopupInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static DetailsPopupInfo parseFrom(ByteBuffer byteBuffer) {
            return (DetailsPopupInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DetailsPopupInfo parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (DetailsPopupInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<DetailsPopupInfo, Builder> implements DetailsPopupInfoOrBuilder {
            private Builder() {
                super(DetailsPopupInfo.DEFAULT_INSTANCE);
            }

            public Builder clearCoordinate() {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).clearCoordinate();
                return this;
            }

            public Builder clearInfo() {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).clearInfo();
                return this;
            }

            public Builder clearLoader() {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).clearLoader();
                return this;
            }

            public Builder clearMsg() {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).clearMsg();
                return this;
            }

            public Builder clearPoiInfoUrl() {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).clearPoiInfoUrl();
                return this;
            }

            public Builder clearPreviewIcon() {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).clearPreviewIcon();
                return this;
            }

            public Builder clearStyle() {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).clearStyle();
                return this;
            }

            public Builder clearTimeoutSeconds() {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).clearTimeoutSeconds();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).clearTitle();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).clearType();
                return this;
            }

            public Builder clearVenue() {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).clearVenue();
                return this;
            }

            public Builder clearVenueOriginal() {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).clearVenueOriginal();
                return this;
            }

            public Builder clearWalkingDistanceMeters() {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).clearWalkingDistanceMeters();
                return this;
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public Position.IntPosition getCoordinate() {
                return ((DetailsPopupInfo) this.instance).getCoordinate();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public String getInfo() {
                return ((DetailsPopupInfo) this.instance).getInfo();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public v getInfoBytes() {
                return ((DetailsPopupInfo) this.instance).getInfoBytes();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public boolean getLoader() {
                return ((DetailsPopupInfo) this.instance).getLoader();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public String getMsg() {
                return ((DetailsPopupInfo) this.instance).getMsg();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public v getMsgBytes() {
                return ((DetailsPopupInfo) this.instance).getMsgBytes();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public String getPoiInfoUrl() {
                return ((DetailsPopupInfo) this.instance).getPoiInfoUrl();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public v getPoiInfoUrlBytes() {
                return ((DetailsPopupInfo) this.instance).getPoiInfoUrlBytes();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public String getPreviewIcon() {
                return ((DetailsPopupInfo) this.instance).getPreviewIcon();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public v getPreviewIconBytes() {
                return ((DetailsPopupInfo) this.instance).getPreviewIconBytes();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public Style getStyle() {
                return ((DetailsPopupInfo) this.instance).getStyle();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public int getStyleValue() {
                return ((DetailsPopupInfo) this.instance).getStyleValue();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public int getTimeoutSeconds() {
                return ((DetailsPopupInfo) this.instance).getTimeoutSeconds();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public String getTitle() {
                return ((DetailsPopupInfo) this.instance).getTitle();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public v getTitleBytes() {
                return ((DetailsPopupInfo) this.instance).getTitleBytes();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public WazeUiMapPopupType getType() {
                return ((DetailsPopupInfo) this.instance).getType();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public int getTypeValue() {
                return ((DetailsPopupInfo) this.instance).getTypeValue();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public VenueData getVenue() {
                return ((DetailsPopupInfo) this.instance).getVenue();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public VenueData getVenueOriginal() {
                return ((DetailsPopupInfo) this.instance).getVenueOriginal();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public int getWalkingDistanceMeters() {
                return ((DetailsPopupInfo) this.instance).getWalkingDistanceMeters();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public boolean hasCoordinate() {
                return ((DetailsPopupInfo) this.instance).hasCoordinate();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public boolean hasInfo() {
                return ((DetailsPopupInfo) this.instance).hasInfo();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public boolean hasPoiInfoUrl() {
                return ((DetailsPopupInfo) this.instance).hasPoiInfoUrl();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public boolean hasPreviewIcon() {
                return ((DetailsPopupInfo) this.instance).hasPreviewIcon();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public boolean hasTimeoutSeconds() {
                return ((DetailsPopupInfo) this.instance).hasTimeoutSeconds();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public boolean hasTitle() {
                return ((DetailsPopupInfo) this.instance).hasTitle();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public boolean hasVenue() {
                return ((DetailsPopupInfo) this.instance).hasVenue();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public boolean hasVenueOriginal() {
                return ((DetailsPopupInfo) this.instance).hasVenueOriginal();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfoOrBuilder
            public boolean hasWalkingDistanceMeters() {
                return ((DetailsPopupInfo) this.instance).hasWalkingDistanceMeters();
            }

            public Builder mergeCoordinate(Position.IntPosition intPosition) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).mergeCoordinate(intPosition);
                return this;
            }

            public Builder mergeVenue(VenueData venueData) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).mergeVenue(venueData);
                return this;
            }

            public Builder mergeVenueOriginal(VenueData venueData) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).mergeVenueOriginal(venueData);
                return this;
            }

            public Builder setCoordinate(Position.IntPosition.Builder builder) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setCoordinate(builder.build());
                return this;
            }

            public Builder setInfo(String str) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setInfo(str);
                return this;
            }

            public Builder setInfoBytes(v vVar) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setInfoBytes(vVar);
                return this;
            }

            public Builder setLoader(boolean z) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setLoader(z);
                return this;
            }

            public Builder setMsg(String str) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setMsg(str);
                return this;
            }

            public Builder setMsgBytes(v vVar) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setMsgBytes(vVar);
                return this;
            }

            public Builder setPoiInfoUrl(String str) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setPoiInfoUrl(str);
                return this;
            }

            public Builder setPoiInfoUrlBytes(v vVar) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setPoiInfoUrlBytes(vVar);
                return this;
            }

            public Builder setPreviewIcon(String str) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setPreviewIcon(str);
                return this;
            }

            public Builder setPreviewIconBytes(v vVar) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setPreviewIconBytes(vVar);
                return this;
            }

            public Builder setStyle(Style style) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setStyle(style);
                return this;
            }

            public Builder setStyleValue(int i2) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setStyleValue(i2);
                return this;
            }

            public Builder setTimeoutSeconds(int i2) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setTimeoutSeconds(i2);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(v vVar) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setTitleBytes(vVar);
                return this;
            }

            public Builder setType(WazeUiMapPopupType wazeUiMapPopupType) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setType(wazeUiMapPopupType);
                return this;
            }

            public Builder setTypeValue(int i2) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setTypeValue(i2);
                return this;
            }

            public Builder setVenue(VenueData.Builder builder) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setVenue(builder.build());
                return this;
            }

            public Builder setVenueOriginal(VenueData.Builder builder) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setVenueOriginal(builder.build());
                return this;
            }

            public Builder setWalkingDistanceMeters(int i2) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setWalkingDistanceMeters(i2);
                return this;
            }

            public Builder setCoordinate(Position.IntPosition intPosition) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setCoordinate(intPosition);
                return this;
            }

            public Builder setVenue(VenueData venueData) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setVenue(venueData);
                return this;
            }

            public Builder setVenueOriginal(VenueData venueData) {
                copyOnWrite();
                ((DetailsPopupInfo) this.instance).setVenueOriginal(venueData);
                return this;
            }
        }

        public static DetailsPopupInfo parseFrom(byte[] bArr) {
            return (DetailsPopupInfo) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DetailsPopupInfo parseFrom(byte[] bArr, de deVar) {
            return (DetailsPopupInfo) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class WazerPopupInfo extends du<WazerPopupInfo, Builder> implements WazerPopupInfoOrBuilder {
        public static final int ADDON_FIELD_NUMBER = 4;
        public static final int AZIMUTH_FIELD_NUMBER = 8;
        public static final int COORDINATE_FIELD_NUMBER = 9;
        private static final WazerPopupInfo DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int JOINED_FIELD_NUMBER = 6;
        public static final int MOOD_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile fo<WazerPopupInfo> PARSER = null;
        public static final int POINTS_FIELD_NUMBER = 5;
        public static final int SPEED_FIELD_NUMBER = 7;
        private int azimuth_;
        private int bitField0_;
        private Position.IntPosition coordinate_;
        private int id_;
        private String name_ = "";
        private String mood_ = "";
        private String addon_ = "";
        private String points_ = "";
        private String joined_ = "";
        private String speed_ = "";

        static {
            WazerPopupInfo wazerPopupInfo = new WazerPopupInfo();
            DEFAULT_INSTANCE = wazerPopupInfo;
            du.registerDefaultInstance(WazerPopupInfo.class, wazerPopupInfo);
        }

        private WazerPopupInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddon() {
            this.bitField0_ &= -2;
            this.addon_ = getDefaultInstance().getAddon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAzimuth() {
            this.azimuth_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCoordinate() {
            this.coordinate_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJoined() {
            this.bitField0_ &= -5;
            this.joined_ = getDefaultInstance().getJoined();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMood() {
            this.mood_ = getDefaultInstance().getMood();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPoints() {
            this.bitField0_ &= -3;
            this.points_ = getDefaultInstance().getPoints();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpeed() {
            this.speed_ = getDefaultInstance().getSpeed();
        }

        public static WazerPopupInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCoordinate(Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            Position.IntPosition intPosition2 = this.coordinate_;
            if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
                Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
                builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
                intPosition = builderNewBuilder.buildPartial();
            }
            this.coordinate_ = intPosition;
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static WazerPopupInfo parseDelimitedFrom(InputStream inputStream) {
            return (WazerPopupInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WazerPopupInfo parseFrom(v vVar) {
            return (WazerPopupInfo) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<WazerPopupInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddon(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 1;
            this.addon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddonBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.addon_ = vVar.u();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAzimuth(int i2) {
            this.azimuth_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoordinate(Position.IntPosition intPosition) {
            Objects.requireNonNull(intPosition);
            this.coordinate_ = intPosition;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(int i2) {
            this.id_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJoined(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 4;
            this.joined_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJoinedBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.joined_ = vVar.u();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMood(String str) {
            Objects.requireNonNull(str);
            this.mood_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMoodBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.mood_ = vVar.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            Objects.requireNonNull(str);
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.name_ = vVar.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPoints(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 2;
            this.points_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPointsBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.points_ = vVar.u();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpeed(String str) {
            Objects.requireNonNull(str);
            this.speed_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpeedBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.speed_ = vVar.u();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004ለ\u0000\u0005ለ\u0001\u0006ለ\u0002\u0007Ȉ\b\u0004\tဉ\u0003", new Object[]{"bitField0_", "id_", "name_", "mood_", "addon_", "points_", "joined_", "speed_", "azimuth_", "coordinate_"});
            }
            if (iOrdinal == 3) {
                return new WazerPopupInfo();
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
            fo<WazerPopupInfo> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (WazerPopupInfo.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
        public String getAddon() {
            return this.addon_;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
        public v getAddonBytes() {
            return v.s(this.addon_);
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
        public int getAzimuth() {
            return this.azimuth_;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
        public Position.IntPosition getCoordinate() {
            Position.IntPosition intPosition = this.coordinate_;
            return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
        public String getJoined() {
            return this.joined_;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
        public v getJoinedBytes() {
            return v.s(this.joined_);
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
        public String getMood() {
            return this.mood_;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
        public v getMoodBytes() {
            return v.s(this.mood_);
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
        public v getNameBytes() {
            return v.s(this.name_);
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
        public String getPoints() {
            return this.points_;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
        public v getPointsBytes() {
            return v.s(this.points_);
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
        public String getSpeed() {
            return this.speed_;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
        public v getSpeedBytes() {
            return v.s(this.speed_);
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
        public boolean hasAddon() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
        public boolean hasCoordinate() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
        public boolean hasJoined() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
        public boolean hasPoints() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(WazerPopupInfo wazerPopupInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(wazerPopupInfo);
        }

        public static WazerPopupInfo parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (WazerPopupInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static WazerPopupInfo parseFrom(v vVar, de deVar) {
            return (WazerPopupInfo) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static WazerPopupInfo parseFrom(z zVar) {
            return (WazerPopupInfo) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static WazerPopupInfo parseFrom(z zVar, de deVar) {
            return (WazerPopupInfo) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static WazerPopupInfo parseFrom(InputStream inputStream) {
            return (WazerPopupInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WazerPopupInfo parseFrom(InputStream inputStream, de deVar) {
            return (WazerPopupInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static WazerPopupInfo parseFrom(ByteBuffer byteBuffer) {
            return (WazerPopupInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static WazerPopupInfo parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (WazerPopupInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<WazerPopupInfo, Builder> implements WazerPopupInfoOrBuilder {
            private Builder() {
                super(WazerPopupInfo.DEFAULT_INSTANCE);
            }

            public Builder clearAddon() {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).clearAddon();
                return this;
            }

            public Builder clearAzimuth() {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).clearAzimuth();
                return this;
            }

            public Builder clearCoordinate() {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).clearCoordinate();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).clearId();
                return this;
            }

            public Builder clearJoined() {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).clearJoined();
                return this;
            }

            public Builder clearMood() {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).clearMood();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).clearName();
                return this;
            }

            public Builder clearPoints() {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).clearPoints();
                return this;
            }

            public Builder clearSpeed() {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).clearSpeed();
                return this;
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
            public String getAddon() {
                return ((WazerPopupInfo) this.instance).getAddon();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
            public v getAddonBytes() {
                return ((WazerPopupInfo) this.instance).getAddonBytes();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
            public int getAzimuth() {
                return ((WazerPopupInfo) this.instance).getAzimuth();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
            public Position.IntPosition getCoordinate() {
                return ((WazerPopupInfo) this.instance).getCoordinate();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
            public int getId() {
                return ((WazerPopupInfo) this.instance).getId();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
            public String getJoined() {
                return ((WazerPopupInfo) this.instance).getJoined();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
            public v getJoinedBytes() {
                return ((WazerPopupInfo) this.instance).getJoinedBytes();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
            public String getMood() {
                return ((WazerPopupInfo) this.instance).getMood();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
            public v getMoodBytes() {
                return ((WazerPopupInfo) this.instance).getMoodBytes();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
            public String getName() {
                return ((WazerPopupInfo) this.instance).getName();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
            public v getNameBytes() {
                return ((WazerPopupInfo) this.instance).getNameBytes();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
            public String getPoints() {
                return ((WazerPopupInfo) this.instance).getPoints();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
            public v getPointsBytes() {
                return ((WazerPopupInfo) this.instance).getPointsBytes();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
            public String getSpeed() {
                return ((WazerPopupInfo) this.instance).getSpeed();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
            public v getSpeedBytes() {
                return ((WazerPopupInfo) this.instance).getSpeedBytes();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
            public boolean hasAddon() {
                return ((WazerPopupInfo) this.instance).hasAddon();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
            public boolean hasCoordinate() {
                return ((WazerPopupInfo) this.instance).hasCoordinate();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
            public boolean hasJoined() {
                return ((WazerPopupInfo) this.instance).hasJoined();
            }

            @Override // com.waze.jni.protos.map.MapPopupNativeInfo.WazerPopupInfoOrBuilder
            public boolean hasPoints() {
                return ((WazerPopupInfo) this.instance).hasPoints();
            }

            public Builder mergeCoordinate(Position.IntPosition intPosition) {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).mergeCoordinate(intPosition);
                return this;
            }

            public Builder setAddon(String str) {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).setAddon(str);
                return this;
            }

            public Builder setAddonBytes(v vVar) {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).setAddonBytes(vVar);
                return this;
            }

            public Builder setAzimuth(int i2) {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).setAzimuth(i2);
                return this;
            }

            public Builder setCoordinate(Position.IntPosition.Builder builder) {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).setCoordinate(builder.build());
                return this;
            }

            public Builder setId(int i2) {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).setId(i2);
                return this;
            }

            public Builder setJoined(String str) {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).setJoined(str);
                return this;
            }

            public Builder setJoinedBytes(v vVar) {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).setJoinedBytes(vVar);
                return this;
            }

            public Builder setMood(String str) {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).setMood(str);
                return this;
            }

            public Builder setMoodBytes(v vVar) {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).setMoodBytes(vVar);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(v vVar) {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).setNameBytes(vVar);
                return this;
            }

            public Builder setPoints(String str) {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).setPoints(str);
                return this;
            }

            public Builder setPointsBytes(v vVar) {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).setPointsBytes(vVar);
                return this;
            }

            public Builder setSpeed(String str) {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).setSpeed(str);
                return this;
            }

            public Builder setSpeedBytes(v vVar) {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).setSpeedBytes(vVar);
                return this;
            }

            public Builder setCoordinate(Position.IntPosition intPosition) {
                copyOnWrite();
                ((WazerPopupInfo) this.instance).setCoordinate(intPosition);
                return this;
            }
        }

        public static WazerPopupInfo parseFrom(byte[] bArr) {
            return (WazerPopupInfo) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WazerPopupInfo parseFrom(byte[] bArr, de deVar) {
            return (WazerPopupInfo) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(MapPopupNativeInfo mapPopupNativeInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(mapPopupNativeInfo);
    }

    public static MapPopupNativeInfo parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (MapPopupNativeInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapPopupNativeInfo parseFrom(v vVar, de deVar) {
        return (MapPopupNativeInfo) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static MapPopupNativeInfo parseFrom(z zVar) {
        return (MapPopupNativeInfo) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static MapPopupNativeInfo parseFrom(z zVar, de deVar) {
        return (MapPopupNativeInfo) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static MapPopupNativeInfo parseFrom(InputStream inputStream) {
        return (MapPopupNativeInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapPopupNativeInfo parseFrom(InputStream inputStream, de deVar) {
        return (MapPopupNativeInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapPopupNativeInfo parseFrom(ByteBuffer byteBuffer) {
        return (MapPopupNativeInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MapPopupNativeInfo parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (MapPopupNativeInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<MapPopupNativeInfo, Builder> implements MapPopupNativeInfoOrBuilder {
        private Builder() {
            super(MapPopupNativeInfo.DEFAULT_INSTANCE);
        }

        public Builder clearDetailsPopupInfo() {
            copyOnWrite();
            ((MapPopupNativeInfo) this.instance).clearDetailsPopupInfo();
            return this;
        }

        public Builder clearPopupInfo() {
            copyOnWrite();
            ((MapPopupNativeInfo) this.instance).clearPopupInfo();
            return this;
        }

        public Builder clearWazerPopupInfo() {
            copyOnWrite();
            ((MapPopupNativeInfo) this.instance).clearWazerPopupInfo();
            return this;
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfoOrBuilder
        public DetailsPopupInfo getDetailsPopupInfo() {
            return ((MapPopupNativeInfo) this.instance).getDetailsPopupInfo();
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfoOrBuilder
        public PopupInfoCase getPopupInfoCase() {
            return ((MapPopupNativeInfo) this.instance).getPopupInfoCase();
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfoOrBuilder
        public WazerPopupInfo getWazerPopupInfo() {
            return ((MapPopupNativeInfo) this.instance).getWazerPopupInfo();
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfoOrBuilder
        public boolean hasDetailsPopupInfo() {
            return ((MapPopupNativeInfo) this.instance).hasDetailsPopupInfo();
        }

        @Override // com.waze.jni.protos.map.MapPopupNativeInfoOrBuilder
        public boolean hasWazerPopupInfo() {
            return ((MapPopupNativeInfo) this.instance).hasWazerPopupInfo();
        }

        public Builder mergeDetailsPopupInfo(DetailsPopupInfo detailsPopupInfo) {
            copyOnWrite();
            ((MapPopupNativeInfo) this.instance).mergeDetailsPopupInfo(detailsPopupInfo);
            return this;
        }

        public Builder mergeWazerPopupInfo(WazerPopupInfo wazerPopupInfo) {
            copyOnWrite();
            ((MapPopupNativeInfo) this.instance).mergeWazerPopupInfo(wazerPopupInfo);
            return this;
        }

        public Builder setDetailsPopupInfo(DetailsPopupInfo.Builder builder) {
            copyOnWrite();
            ((MapPopupNativeInfo) this.instance).setDetailsPopupInfo(builder.build());
            return this;
        }

        public Builder setWazerPopupInfo(WazerPopupInfo.Builder builder) {
            copyOnWrite();
            ((MapPopupNativeInfo) this.instance).setWazerPopupInfo(builder.build());
            return this;
        }

        public Builder setDetailsPopupInfo(DetailsPopupInfo detailsPopupInfo) {
            copyOnWrite();
            ((MapPopupNativeInfo) this.instance).setDetailsPopupInfo(detailsPopupInfo);
            return this;
        }

        public Builder setWazerPopupInfo(WazerPopupInfo wazerPopupInfo) {
            copyOnWrite();
            ((MapPopupNativeInfo) this.instance).setWazerPopupInfo(wazerPopupInfo);
            return this;
        }
    }

    public static MapPopupNativeInfo parseFrom(byte[] bArr) {
        return (MapPopupNativeInfo) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MapPopupNativeInfo parseFrom(byte[] bArr, de deVar) {
        return (MapPopupNativeInfo) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
