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
import com.waze.jni.protos.NativeBitmap;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.AnimationParams;
import com.waze.jni.protos.map.ScreenPoint;
import com.waze.jni.protos.map.ZoomLevelDisplayRange;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class Marker extends du<Marker, Builder> implements MarkerOrBuilder {
    public static final int ALIGNMENT_FIELD_NUMBER = 3;
    public static final int ANCHOR_OFFSET_FIELD_NUMBER = 6;
    private static final Marker DEFAULT_INSTANCE;
    public static final int HIT_BOX_INSET_FIELD_NUMBER = 7;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IMAGE_FIELD_NUMBER = 2;
    public static final int MARKER_HIDE_ANIMATION_PARAMS_FIELD_NUMBER = 10;
    public static final int MARKER_SHOW_ANIMATION_PARAMS_FIELD_NUMBER = 9;
    private static volatile fo<Marker> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 5;
    public static final int PRIORITY_FIELD_NUMBER = 4;
    public static final int SCALE_FIELD_NUMBER = 8;
    public static final int ZOOM_LEVEL_DISPLAY_RANGE_FIELD_NUMBER = 11;
    private int alignment_;
    private ScreenPoint anchorOffset_;
    private int bitField0_;
    private HitBoxInset hitBoxInset_;
    private String id_ = "";
    private NativeBitmap image_;
    private MarkerHideAnimationParams markerHideAnimationParams_;
    private MarkerShowAnimationParams markerShowAnimationParams_;
    private Position.IntPosition position_;
    private int priority_;
    private float scale_;
    private ZoomLevelDisplayRange zoomLevelDisplayRange_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.Marker$1, reason: invalid class name */
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
    public enum Alignment implements eg {
        ALIGNMENT_UNKNOWN(0),
        TOP_LEFT(1),
        BOTTOM_LEFT(2),
        BOTTOM_RIGHT(3),
        TOP_RIGHT(4),
        CENTER(5),
        UNRECOGNIZED(-1);

        public static final int ALIGNMENT_UNKNOWN_VALUE = 0;
        public static final int BOTTOM_LEFT_VALUE = 2;
        public static final int BOTTOM_RIGHT_VALUE = 3;
        public static final int CENTER_VALUE = 5;
        public static final int TOP_LEFT_VALUE = 1;
        public static final int TOP_RIGHT_VALUE = 4;
        private static final eh<Alignment> internalValueMap = new eh<Alignment>() { // from class: com.waze.jni.protos.map.Marker.Alignment.1
            @Override // com.google.v.eh
            public Alignment findValueByNumber(int i2) {
                return Alignment.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class AlignmentVerifier implements ei {
            static final ei INSTANCE = new AlignmentVerifier();

            private AlignmentVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return Alignment.forNumber(i2) != null;
            }
        }

        Alignment(int i2) {
            this.value = i2;
        }

        public static Alignment forNumber(int i2) {
            if (i2 == 0) {
                return ALIGNMENT_UNKNOWN;
            }
            if (i2 == 1) {
                return TOP_LEFT;
            }
            if (i2 == 2) {
                return BOTTOM_LEFT;
            }
            if (i2 == 3) {
                return BOTTOM_RIGHT;
            }
            if (i2 == 4) {
                return TOP_RIGHT;
            }
            if (i2 != 5) {
                return null;
            }
            return CENTER;
        }

        public static eh<Alignment> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return AlignmentVerifier.INSTANCE;
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
    public interface HitBoxInsetOrBuilder extends fj {
        int getBottom();

        int getLeft();

        int getRight();

        int getTop();
    }

    /* compiled from: WazeSource */
    public interface MarkerHideAnimationParamsOrBuilder extends fj {
        AnimationParams getAnimationParams();

        MarkerHideAnimationParams.HideAnimationType getAnimationType();

        int getAnimationTypeValue();

        boolean hasAnimationParams();
    }

    /* compiled from: WazeSource */
    public interface MarkerShowAnimationParamsOrBuilder extends fj {
        AnimationParams getAnimationParams();

        MarkerShowAnimationParams.ShowAnimationType getAnimationType();

        int getAnimationTypeValue();

        boolean hasAnimationParams();
    }

    /* compiled from: WazeSource */
    public enum Priority implements eg {
        ALERTS(0),
        POIS(1),
        UNSELECTED_ROUTING_LABEL(2),
        SELECTED_ROUTING_LABEL(3),
        CLOSURE_PINS(4),
        USER_LOCATION(5),
        UNRECOGNIZED(-1);

        public static final int ALERTS_VALUE = 0;
        public static final int CLOSURE_PINS_VALUE = 4;
        public static final int POIS_VALUE = 1;
        public static final int SELECTED_ROUTING_LABEL_VALUE = 3;
        public static final int UNSELECTED_ROUTING_LABEL_VALUE = 2;
        public static final int USER_LOCATION_VALUE = 5;
        private static final eh<Priority> internalValueMap = new eh<Priority>() { // from class: com.waze.jni.protos.map.Marker.Priority.1
            @Override // com.google.v.eh
            public Priority findValueByNumber(int i2) {
                return Priority.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class PriorityVerifier implements ei {
            static final ei INSTANCE = new PriorityVerifier();

            private PriorityVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return Priority.forNumber(i2) != null;
            }
        }

        Priority(int i2) {
            this.value = i2;
        }

        public static Priority forNumber(int i2) {
            if (i2 == 0) {
                return ALERTS;
            }
            if (i2 == 1) {
                return POIS;
            }
            if (i2 == 2) {
                return UNSELECTED_ROUTING_LABEL;
            }
            if (i2 == 3) {
                return SELECTED_ROUTING_LABEL;
            }
            if (i2 == 4) {
                return CLOSURE_PINS;
            }
            if (i2 != 5) {
                return null;
            }
            return USER_LOCATION;
        }

        public static eh<Priority> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return PriorityVerifier.INSTANCE;
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

    static {
        Marker marker = new Marker();
        DEFAULT_INSTANCE = marker;
        du.registerDefaultInstance(Marker.class, marker);
    }

    private Marker() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlignment() {
        this.alignment_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnchorOffset() {
        this.anchorOffset_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHitBoxInset() {
        this.hitBoxInset_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImage() {
        this.image_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMarkerHideAnimationParams() {
        this.markerHideAnimationParams_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMarkerShowAnimationParams() {
        this.markerShowAnimationParams_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.priority_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScale() {
        this.bitField0_ &= -17;
        this.scale_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZoomLevelDisplayRange() {
        this.zoomLevelDisplayRange_ = null;
        this.bitField0_ &= -129;
    }

    public static Marker getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAnchorOffset(ScreenPoint screenPoint) {
        Objects.requireNonNull(screenPoint);
        ScreenPoint screenPoint2 = this.anchorOffset_;
        if (screenPoint2 != null && screenPoint2 != ScreenPoint.getDefaultInstance()) {
            ScreenPoint.Builder builderNewBuilder = ScreenPoint.newBuilder(screenPoint2);
            builderNewBuilder.mergeFrom((ScreenPoint.Builder) screenPoint);
            screenPoint = builderNewBuilder.buildPartial();
        }
        this.anchorOffset_ = screenPoint;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHitBoxInset(HitBoxInset hitBoxInset) {
        Objects.requireNonNull(hitBoxInset);
        HitBoxInset hitBoxInset2 = this.hitBoxInset_;
        if (hitBoxInset2 != null && hitBoxInset2 != HitBoxInset.getDefaultInstance()) {
            HitBoxInset.Builder builderNewBuilder = HitBoxInset.newBuilder(hitBoxInset2);
            builderNewBuilder.mergeFrom((HitBoxInset.Builder) hitBoxInset);
            hitBoxInset = builderNewBuilder.buildPartial();
        }
        this.hitBoxInset_ = hitBoxInset;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeImage(NativeBitmap nativeBitmap) {
        Objects.requireNonNull(nativeBitmap);
        NativeBitmap nativeBitmap2 = this.image_;
        if (nativeBitmap2 != null && nativeBitmap2 != NativeBitmap.getDefaultInstance()) {
            NativeBitmap.Builder builderNewBuilder = NativeBitmap.newBuilder(nativeBitmap2);
            builderNewBuilder.mergeFrom((NativeBitmap.Builder) nativeBitmap);
            nativeBitmap = builderNewBuilder.buildPartial();
        }
        this.image_ = nativeBitmap;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMarkerHideAnimationParams(MarkerHideAnimationParams markerHideAnimationParams) {
        Objects.requireNonNull(markerHideAnimationParams);
        MarkerHideAnimationParams markerHideAnimationParams2 = this.markerHideAnimationParams_;
        if (markerHideAnimationParams2 != null && markerHideAnimationParams2 != MarkerHideAnimationParams.getDefaultInstance()) {
            MarkerHideAnimationParams.Builder builderNewBuilder = MarkerHideAnimationParams.newBuilder(markerHideAnimationParams2);
            builderNewBuilder.mergeFrom((MarkerHideAnimationParams.Builder) markerHideAnimationParams);
            markerHideAnimationParams = builderNewBuilder.buildPartial();
        }
        this.markerHideAnimationParams_ = markerHideAnimationParams;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMarkerShowAnimationParams(MarkerShowAnimationParams markerShowAnimationParams) {
        Objects.requireNonNull(markerShowAnimationParams);
        MarkerShowAnimationParams markerShowAnimationParams2 = this.markerShowAnimationParams_;
        if (markerShowAnimationParams2 != null && markerShowAnimationParams2 != MarkerShowAnimationParams.getDefaultInstance()) {
            MarkerShowAnimationParams.Builder builderNewBuilder = MarkerShowAnimationParams.newBuilder(markerShowAnimationParams2);
            builderNewBuilder.mergeFrom((MarkerShowAnimationParams.Builder) markerShowAnimationParams);
            markerShowAnimationParams = builderNewBuilder.buildPartial();
        }
        this.markerShowAnimationParams_ = markerShowAnimationParams;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        Position.IntPosition intPosition2 = this.position_;
        if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
            Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
            builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
            intPosition = builderNewBuilder.buildPartial();
        }
        this.position_ = intPosition;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeZoomLevelDisplayRange(ZoomLevelDisplayRange zoomLevelDisplayRange) {
        Objects.requireNonNull(zoomLevelDisplayRange);
        ZoomLevelDisplayRange zoomLevelDisplayRange2 = this.zoomLevelDisplayRange_;
        if (zoomLevelDisplayRange2 != null && zoomLevelDisplayRange2 != ZoomLevelDisplayRange.getDefaultInstance()) {
            ZoomLevelDisplayRange.Builder builderNewBuilder = ZoomLevelDisplayRange.newBuilder(zoomLevelDisplayRange2);
            builderNewBuilder.mergeFrom((ZoomLevelDisplayRange.Builder) zoomLevelDisplayRange);
            zoomLevelDisplayRange = builderNewBuilder.buildPartial();
        }
        this.zoomLevelDisplayRange_ = zoomLevelDisplayRange;
        this.bitField0_ |= 128;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Marker parseDelimitedFrom(InputStream inputStream) {
        return (Marker) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Marker parseFrom(v vVar) {
        return (Marker) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<Marker> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlignment(Alignment alignment) {
        this.alignment_ = alignment.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlignmentValue(int i2) {
        this.alignment_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnchorOffset(ScreenPoint screenPoint) {
        Objects.requireNonNull(screenPoint);
        this.anchorOffset_ = screenPoint;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHitBoxInset(HitBoxInset hitBoxInset) {
        Objects.requireNonNull(hitBoxInset);
        this.hitBoxInset_ = hitBoxInset;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.id_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImage(NativeBitmap nativeBitmap) {
        Objects.requireNonNull(nativeBitmap);
        this.image_ = nativeBitmap;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMarkerHideAnimationParams(MarkerHideAnimationParams markerHideAnimationParams) {
        Objects.requireNonNull(markerHideAnimationParams);
        this.markerHideAnimationParams_ = markerHideAnimationParams;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMarkerShowAnimationParams(MarkerShowAnimationParams markerShowAnimationParams) {
        Objects.requireNonNull(markerShowAnimationParams);
        this.markerShowAnimationParams_ = markerShowAnimationParams;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.position_ = intPosition;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriority(Priority priority) {
        this.priority_ = priority.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriorityValue(int i2) {
        this.priority_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScale(float f2) {
        this.bitField0_ |= 16;
        this.scale_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZoomLevelDisplayRange(ZoomLevelDisplayRange zoomLevelDisplayRange) {
        Objects.requireNonNull(zoomLevelDisplayRange);
        this.zoomLevelDisplayRange_ = zoomLevelDisplayRange;
        this.bitField0_ |= 128;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\f\u0004\f\u0005ဉ\u0002\u0006ဉ\u0001\u0007ဉ\u0003\bခ\u0004\tဉ\u0005\nဉ\u0006\u000bဉ\u0007", new Object[]{"bitField0_", "id_", "image_", "alignment_", "priority_", "position_", "anchorOffset_", "hitBoxInset_", "scale_", "markerShowAnimationParams_", "markerHideAnimationParams_", "zoomLevelDisplayRange_"});
        }
        if (iOrdinal == 3) {
            return new Marker();
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
        fo<Marker> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Marker.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public Alignment getAlignment() {
        Alignment alignmentForNumber = Alignment.forNumber(this.alignment_);
        return alignmentForNumber == null ? Alignment.UNRECOGNIZED : alignmentForNumber;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public int getAlignmentValue() {
        return this.alignment_;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public ScreenPoint getAnchorOffset() {
        ScreenPoint screenPoint = this.anchorOffset_;
        return screenPoint == null ? ScreenPoint.getDefaultInstance() : screenPoint;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public HitBoxInset getHitBoxInset() {
        HitBoxInset hitBoxInset = this.hitBoxInset_;
        return hitBoxInset == null ? HitBoxInset.getDefaultInstance() : hitBoxInset;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public v getIdBytes() {
        return v.s(this.id_);
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public NativeBitmap getImage() {
        NativeBitmap nativeBitmap = this.image_;
        return nativeBitmap == null ? NativeBitmap.getDefaultInstance() : nativeBitmap;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public MarkerHideAnimationParams getMarkerHideAnimationParams() {
        MarkerHideAnimationParams markerHideAnimationParams = this.markerHideAnimationParams_;
        return markerHideAnimationParams == null ? MarkerHideAnimationParams.getDefaultInstance() : markerHideAnimationParams;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public MarkerShowAnimationParams getMarkerShowAnimationParams() {
        MarkerShowAnimationParams markerShowAnimationParams = this.markerShowAnimationParams_;
        return markerShowAnimationParams == null ? MarkerShowAnimationParams.getDefaultInstance() : markerShowAnimationParams;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public Position.IntPosition getPosition() {
        Position.IntPosition intPosition = this.position_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public Priority getPriority() {
        Priority priorityForNumber = Priority.forNumber(this.priority_);
        return priorityForNumber == null ? Priority.UNRECOGNIZED : priorityForNumber;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public int getPriorityValue() {
        return this.priority_;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public float getScale() {
        return this.scale_;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public ZoomLevelDisplayRange getZoomLevelDisplayRange() {
        ZoomLevelDisplayRange zoomLevelDisplayRange = this.zoomLevelDisplayRange_;
        return zoomLevelDisplayRange == null ? ZoomLevelDisplayRange.getDefaultInstance() : zoomLevelDisplayRange;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public boolean hasAnchorOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public boolean hasHitBoxInset() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public boolean hasImage() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public boolean hasMarkerHideAnimationParams() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public boolean hasMarkerShowAnimationParams() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public boolean hasPosition() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public boolean hasScale() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.waze.jni.protos.map.MarkerOrBuilder
    public boolean hasZoomLevelDisplayRange() {
        return (this.bitField0_ & 128) != 0;
    }

    /* compiled from: WazeSource */
    public final class HitBoxInset extends du<HitBoxInset, Builder> implements HitBoxInsetOrBuilder {
        public static final int BOTTOM_FIELD_NUMBER = 4;
        private static final HitBoxInset DEFAULT_INSTANCE;
        public static final int LEFT_FIELD_NUMBER = 1;
        private static volatile fo<HitBoxInset> PARSER = null;
        public static final int RIGHT_FIELD_NUMBER = 3;
        public static final int TOP_FIELD_NUMBER = 2;
        private int bottom_;
        private int left_;
        private int right_;
        private int top_;

        /* compiled from: WazeSource */
        public final class Builder extends dm<HitBoxInset, Builder> implements HitBoxInsetOrBuilder {
            private Builder() {
                super(HitBoxInset.DEFAULT_INSTANCE);
            }

            public Builder clearBottom() {
                copyOnWrite();
                ((HitBoxInset) this.instance).clearBottom();
                return this;
            }

            public Builder clearLeft() {
                copyOnWrite();
                ((HitBoxInset) this.instance).clearLeft();
                return this;
            }

            public Builder clearRight() {
                copyOnWrite();
                ((HitBoxInset) this.instance).clearRight();
                return this;
            }

            public Builder clearTop() {
                copyOnWrite();
                ((HitBoxInset) this.instance).clearTop();
                return this;
            }

            @Override // com.waze.jni.protos.map.Marker.HitBoxInsetOrBuilder
            public int getBottom() {
                return ((HitBoxInset) this.instance).getBottom();
            }

            @Override // com.waze.jni.protos.map.Marker.HitBoxInsetOrBuilder
            public int getLeft() {
                return ((HitBoxInset) this.instance).getLeft();
            }

            @Override // com.waze.jni.protos.map.Marker.HitBoxInsetOrBuilder
            public int getRight() {
                return ((HitBoxInset) this.instance).getRight();
            }

            @Override // com.waze.jni.protos.map.Marker.HitBoxInsetOrBuilder
            public int getTop() {
                return ((HitBoxInset) this.instance).getTop();
            }

            public Builder setBottom(int i2) {
                copyOnWrite();
                ((HitBoxInset) this.instance).setBottom(i2);
                return this;
            }

            public Builder setLeft(int i2) {
                copyOnWrite();
                ((HitBoxInset) this.instance).setLeft(i2);
                return this;
            }

            public Builder setRight(int i2) {
                copyOnWrite();
                ((HitBoxInset) this.instance).setRight(i2);
                return this;
            }

            public Builder setTop(int i2) {
                copyOnWrite();
                ((HitBoxInset) this.instance).setTop(i2);
                return this;
            }
        }

        static {
            HitBoxInset hitBoxInset = new HitBoxInset();
            DEFAULT_INSTANCE = hitBoxInset;
            du.registerDefaultInstance(HitBoxInset.class, hitBoxInset);
        }

        private HitBoxInset() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBottom() {
            this.bottom_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeft() {
            this.left_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRight() {
            this.right_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTop() {
            this.top_ = 0;
        }

        public static HitBoxInset getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static HitBoxInset parseDelimitedFrom(InputStream inputStream) {
            return (HitBoxInset) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HitBoxInset parseFrom(v vVar) {
            return (HitBoxInset) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<HitBoxInset> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBottom(int i2) {
            this.bottom_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeft(int i2) {
            this.left_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRight(int i2) {
            this.right_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTop(int i2) {
            this.top_ = i2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"left_", "top_", "right_", "bottom_"});
            }
            if (iOrdinal == 3) {
                return new HitBoxInset();
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
            fo<HitBoxInset> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (HitBoxInset.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.map.Marker.HitBoxInsetOrBuilder
        public int getBottom() {
            return this.bottom_;
        }

        @Override // com.waze.jni.protos.map.Marker.HitBoxInsetOrBuilder
        public int getLeft() {
            return this.left_;
        }

        @Override // com.waze.jni.protos.map.Marker.HitBoxInsetOrBuilder
        public int getRight() {
            return this.right_;
        }

        @Override // com.waze.jni.protos.map.Marker.HitBoxInsetOrBuilder
        public int getTop() {
            return this.top_;
        }

        public static Builder newBuilder(HitBoxInset hitBoxInset) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(hitBoxInset);
        }

        public static HitBoxInset parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (HitBoxInset) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static HitBoxInset parseFrom(v vVar, de deVar) {
            return (HitBoxInset) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static HitBoxInset parseFrom(z zVar) {
            return (HitBoxInset) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static HitBoxInset parseFrom(z zVar, de deVar) {
            return (HitBoxInset) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static HitBoxInset parseFrom(InputStream inputStream) {
            return (HitBoxInset) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HitBoxInset parseFrom(InputStream inputStream, de deVar) {
            return (HitBoxInset) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static HitBoxInset parseFrom(ByteBuffer byteBuffer) {
            return (HitBoxInset) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static HitBoxInset parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (HitBoxInset) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static HitBoxInset parseFrom(byte[] bArr) {
            return (HitBoxInset) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HitBoxInset parseFrom(byte[] bArr, de deVar) {
            return (HitBoxInset) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class MarkerHideAnimationParams extends du<MarkerHideAnimationParams, Builder> implements MarkerHideAnimationParamsOrBuilder {
        public static final int ANIMATION_PARAMS_FIELD_NUMBER = 2;
        public static final int ANIMATION_TYPE_FIELD_NUMBER = 1;
        private static final MarkerHideAnimationParams DEFAULT_INSTANCE;
        private static volatile fo<MarkerHideAnimationParams> PARSER;
        private AnimationParams animationParams_;
        private int animationType_;
        private int bitField0_;

        /* compiled from: WazeSource */
        public enum HideAnimationType implements eg {
            FADE_OUT(0),
            UNRECOGNIZED(-1);

            public static final int FADE_OUT_VALUE = 0;
            private static final eh<HideAnimationType> internalValueMap = new eh<HideAnimationType>() { // from class: com.waze.jni.protos.map.Marker.MarkerHideAnimationParams.HideAnimationType.1
                @Override // com.google.v.eh
                public HideAnimationType findValueByNumber(int i2) {
                    return HideAnimationType.forNumber(i2);
                }
            };
            private final int value;

            /* compiled from: WazeSource */
            final class HideAnimationTypeVerifier implements ei {
                static final ei INSTANCE = new HideAnimationTypeVerifier();

                private HideAnimationTypeVerifier() {
                }

                @Override // com.google.v.ei
                public boolean isInRange(int i2) {
                    return HideAnimationType.forNumber(i2) != null;
                }
            }

            HideAnimationType(int i2) {
                this.value = i2;
            }

            public static HideAnimationType forNumber(int i2) {
                if (i2 != 0) {
                    return null;
                }
                return FADE_OUT;
            }

            public static eh<HideAnimationType> internalGetValueMap() {
                return internalValueMap;
            }

            public static ei internalGetVerifier() {
                return HideAnimationTypeVerifier.INSTANCE;
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

        static {
            MarkerHideAnimationParams markerHideAnimationParams = new MarkerHideAnimationParams();
            DEFAULT_INSTANCE = markerHideAnimationParams;
            du.registerDefaultInstance(MarkerHideAnimationParams.class, markerHideAnimationParams);
        }

        private MarkerHideAnimationParams() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnimationParams() {
            this.animationParams_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnimationType() {
            this.animationType_ = 0;
        }

        public static MarkerHideAnimationParams getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAnimationParams(AnimationParams animationParams) {
            Objects.requireNonNull(animationParams);
            AnimationParams animationParams2 = this.animationParams_;
            if (animationParams2 != null && animationParams2 != AnimationParams.getDefaultInstance()) {
                AnimationParams.Builder builderNewBuilder = AnimationParams.newBuilder(animationParams2);
                builderNewBuilder.mergeFrom((AnimationParams.Builder) animationParams);
                animationParams = builderNewBuilder.buildPartial();
            }
            this.animationParams_ = animationParams;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MarkerHideAnimationParams parseDelimitedFrom(InputStream inputStream) {
            return (MarkerHideAnimationParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MarkerHideAnimationParams parseFrom(v vVar) {
            return (MarkerHideAnimationParams) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<MarkerHideAnimationParams> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationParams(AnimationParams animationParams) {
            Objects.requireNonNull(animationParams);
            this.animationParams_ = animationParams;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationType(HideAnimationType hideAnimationType) {
            this.animationType_ = hideAnimationType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationTypeValue(int i2) {
            this.animationType_ = i2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "animationType_", "animationParams_"});
            }
            if (iOrdinal == 3) {
                return new MarkerHideAnimationParams();
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
            fo<MarkerHideAnimationParams> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (MarkerHideAnimationParams.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.map.Marker.MarkerHideAnimationParamsOrBuilder
        public AnimationParams getAnimationParams() {
            AnimationParams animationParams = this.animationParams_;
            return animationParams == null ? AnimationParams.getDefaultInstance() : animationParams;
        }

        @Override // com.waze.jni.protos.map.Marker.MarkerHideAnimationParamsOrBuilder
        public HideAnimationType getAnimationType() {
            HideAnimationType hideAnimationTypeForNumber = HideAnimationType.forNumber(this.animationType_);
            return hideAnimationTypeForNumber == null ? HideAnimationType.UNRECOGNIZED : hideAnimationTypeForNumber;
        }

        @Override // com.waze.jni.protos.map.Marker.MarkerHideAnimationParamsOrBuilder
        public int getAnimationTypeValue() {
            return this.animationType_;
        }

        @Override // com.waze.jni.protos.map.Marker.MarkerHideAnimationParamsOrBuilder
        public boolean hasAnimationParams() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(MarkerHideAnimationParams markerHideAnimationParams) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(markerHideAnimationParams);
        }

        public static MarkerHideAnimationParams parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (MarkerHideAnimationParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static MarkerHideAnimationParams parseFrom(v vVar, de deVar) {
            return (MarkerHideAnimationParams) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static MarkerHideAnimationParams parseFrom(z zVar) {
            return (MarkerHideAnimationParams) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static MarkerHideAnimationParams parseFrom(z zVar, de deVar) {
            return (MarkerHideAnimationParams) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static MarkerHideAnimationParams parseFrom(InputStream inputStream) {
            return (MarkerHideAnimationParams) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MarkerHideAnimationParams parseFrom(InputStream inputStream, de deVar) {
            return (MarkerHideAnimationParams) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static MarkerHideAnimationParams parseFrom(ByteBuffer byteBuffer) {
            return (MarkerHideAnimationParams) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MarkerHideAnimationParams parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (MarkerHideAnimationParams) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<MarkerHideAnimationParams, Builder> implements MarkerHideAnimationParamsOrBuilder {
            private Builder() {
                super(MarkerHideAnimationParams.DEFAULT_INSTANCE);
            }

            public Builder clearAnimationParams() {
                copyOnWrite();
                ((MarkerHideAnimationParams) this.instance).clearAnimationParams();
                return this;
            }

            public Builder clearAnimationType() {
                copyOnWrite();
                ((MarkerHideAnimationParams) this.instance).clearAnimationType();
                return this;
            }

            @Override // com.waze.jni.protos.map.Marker.MarkerHideAnimationParamsOrBuilder
            public AnimationParams getAnimationParams() {
                return ((MarkerHideAnimationParams) this.instance).getAnimationParams();
            }

            @Override // com.waze.jni.protos.map.Marker.MarkerHideAnimationParamsOrBuilder
            public HideAnimationType getAnimationType() {
                return ((MarkerHideAnimationParams) this.instance).getAnimationType();
            }

            @Override // com.waze.jni.protos.map.Marker.MarkerHideAnimationParamsOrBuilder
            public int getAnimationTypeValue() {
                return ((MarkerHideAnimationParams) this.instance).getAnimationTypeValue();
            }

            @Override // com.waze.jni.protos.map.Marker.MarkerHideAnimationParamsOrBuilder
            public boolean hasAnimationParams() {
                return ((MarkerHideAnimationParams) this.instance).hasAnimationParams();
            }

            public Builder mergeAnimationParams(AnimationParams animationParams) {
                copyOnWrite();
                ((MarkerHideAnimationParams) this.instance).mergeAnimationParams(animationParams);
                return this;
            }

            public Builder setAnimationParams(AnimationParams.Builder builder) {
                copyOnWrite();
                ((MarkerHideAnimationParams) this.instance).setAnimationParams(builder.build());
                return this;
            }

            public Builder setAnimationType(HideAnimationType hideAnimationType) {
                copyOnWrite();
                ((MarkerHideAnimationParams) this.instance).setAnimationType(hideAnimationType);
                return this;
            }

            public Builder setAnimationTypeValue(int i2) {
                copyOnWrite();
                ((MarkerHideAnimationParams) this.instance).setAnimationTypeValue(i2);
                return this;
            }

            public Builder setAnimationParams(AnimationParams animationParams) {
                copyOnWrite();
                ((MarkerHideAnimationParams) this.instance).setAnimationParams(animationParams);
                return this;
            }
        }

        public static MarkerHideAnimationParams parseFrom(byte[] bArr) {
            return (MarkerHideAnimationParams) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MarkerHideAnimationParams parseFrom(byte[] bArr, de deVar) {
            return (MarkerHideAnimationParams) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class MarkerShowAnimationParams extends du<MarkerShowAnimationParams, Builder> implements MarkerShowAnimationParamsOrBuilder {
        public static final int ANIMATION_PARAMS_FIELD_NUMBER = 2;
        public static final int ANIMATION_TYPE_FIELD_NUMBER = 1;
        private static final MarkerShowAnimationParams DEFAULT_INSTANCE;
        private static volatile fo<MarkerShowAnimationParams> PARSER;
        private AnimationParams animationParams_;
        private int animationType_;
        private int bitField0_;

        /* compiled from: WazeSource */
        public enum ShowAnimationType implements eg {
            POP_IN(0),
            FADE_IN(1),
            ANIMATE_IN_WHEN_INVISIBLE(4),
            UNRECOGNIZED(-1);

            public static final int ANIMATE_IN_WHEN_INVISIBLE_VALUE = 4;
            public static final int FADE_IN_VALUE = 1;
            public static final int POP_IN_VALUE = 0;
            private static final eh<ShowAnimationType> internalValueMap = new eh<ShowAnimationType>() { // from class: com.waze.jni.protos.map.Marker.MarkerShowAnimationParams.ShowAnimationType.1
                @Override // com.google.v.eh
                public ShowAnimationType findValueByNumber(int i2) {
                    return ShowAnimationType.forNumber(i2);
                }
            };
            private final int value;

            /* compiled from: WazeSource */
            final class ShowAnimationTypeVerifier implements ei {
                static final ei INSTANCE = new ShowAnimationTypeVerifier();

                private ShowAnimationTypeVerifier() {
                }

                @Override // com.google.v.ei
                public boolean isInRange(int i2) {
                    return ShowAnimationType.forNumber(i2) != null;
                }
            }

            ShowAnimationType(int i2) {
                this.value = i2;
            }

            public static ShowAnimationType forNumber(int i2) {
                if (i2 == 0) {
                    return POP_IN;
                }
                if (i2 == 1) {
                    return FADE_IN;
                }
                if (i2 != 4) {
                    return null;
                }
                return ANIMATE_IN_WHEN_INVISIBLE;
            }

            public static eh<ShowAnimationType> internalGetValueMap() {
                return internalValueMap;
            }

            public static ei internalGetVerifier() {
                return ShowAnimationTypeVerifier.INSTANCE;
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

        static {
            MarkerShowAnimationParams markerShowAnimationParams = new MarkerShowAnimationParams();
            DEFAULT_INSTANCE = markerShowAnimationParams;
            du.registerDefaultInstance(MarkerShowAnimationParams.class, markerShowAnimationParams);
        }

        private MarkerShowAnimationParams() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnimationParams() {
            this.animationParams_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnimationType() {
            this.animationType_ = 0;
        }

        public static MarkerShowAnimationParams getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAnimationParams(AnimationParams animationParams) {
            Objects.requireNonNull(animationParams);
            AnimationParams animationParams2 = this.animationParams_;
            if (animationParams2 != null && animationParams2 != AnimationParams.getDefaultInstance()) {
                AnimationParams.Builder builderNewBuilder = AnimationParams.newBuilder(animationParams2);
                builderNewBuilder.mergeFrom((AnimationParams.Builder) animationParams);
                animationParams = builderNewBuilder.buildPartial();
            }
            this.animationParams_ = animationParams;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MarkerShowAnimationParams parseDelimitedFrom(InputStream inputStream) {
            return (MarkerShowAnimationParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MarkerShowAnimationParams parseFrom(v vVar) {
            return (MarkerShowAnimationParams) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<MarkerShowAnimationParams> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationParams(AnimationParams animationParams) {
            Objects.requireNonNull(animationParams);
            this.animationParams_ = animationParams;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationType(ShowAnimationType showAnimationType) {
            this.animationType_ = showAnimationType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationTypeValue(int i2) {
            this.animationType_ = i2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "animationType_", "animationParams_"});
            }
            if (iOrdinal == 3) {
                return new MarkerShowAnimationParams();
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
            fo<MarkerShowAnimationParams> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (MarkerShowAnimationParams.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.map.Marker.MarkerShowAnimationParamsOrBuilder
        public AnimationParams getAnimationParams() {
            AnimationParams animationParams = this.animationParams_;
            return animationParams == null ? AnimationParams.getDefaultInstance() : animationParams;
        }

        @Override // com.waze.jni.protos.map.Marker.MarkerShowAnimationParamsOrBuilder
        public ShowAnimationType getAnimationType() {
            ShowAnimationType showAnimationTypeForNumber = ShowAnimationType.forNumber(this.animationType_);
            return showAnimationTypeForNumber == null ? ShowAnimationType.UNRECOGNIZED : showAnimationTypeForNumber;
        }

        @Override // com.waze.jni.protos.map.Marker.MarkerShowAnimationParamsOrBuilder
        public int getAnimationTypeValue() {
            return this.animationType_;
        }

        @Override // com.waze.jni.protos.map.Marker.MarkerShowAnimationParamsOrBuilder
        public boolean hasAnimationParams() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(MarkerShowAnimationParams markerShowAnimationParams) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(markerShowAnimationParams);
        }

        public static MarkerShowAnimationParams parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (MarkerShowAnimationParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static MarkerShowAnimationParams parseFrom(v vVar, de deVar) {
            return (MarkerShowAnimationParams) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static MarkerShowAnimationParams parseFrom(z zVar) {
            return (MarkerShowAnimationParams) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static MarkerShowAnimationParams parseFrom(z zVar, de deVar) {
            return (MarkerShowAnimationParams) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static MarkerShowAnimationParams parseFrom(InputStream inputStream) {
            return (MarkerShowAnimationParams) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MarkerShowAnimationParams parseFrom(InputStream inputStream, de deVar) {
            return (MarkerShowAnimationParams) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static MarkerShowAnimationParams parseFrom(ByteBuffer byteBuffer) {
            return (MarkerShowAnimationParams) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MarkerShowAnimationParams parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (MarkerShowAnimationParams) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<MarkerShowAnimationParams, Builder> implements MarkerShowAnimationParamsOrBuilder {
            private Builder() {
                super(MarkerShowAnimationParams.DEFAULT_INSTANCE);
            }

            public Builder clearAnimationParams() {
                copyOnWrite();
                ((MarkerShowAnimationParams) this.instance).clearAnimationParams();
                return this;
            }

            public Builder clearAnimationType() {
                copyOnWrite();
                ((MarkerShowAnimationParams) this.instance).clearAnimationType();
                return this;
            }

            @Override // com.waze.jni.protos.map.Marker.MarkerShowAnimationParamsOrBuilder
            public AnimationParams getAnimationParams() {
                return ((MarkerShowAnimationParams) this.instance).getAnimationParams();
            }

            @Override // com.waze.jni.protos.map.Marker.MarkerShowAnimationParamsOrBuilder
            public ShowAnimationType getAnimationType() {
                return ((MarkerShowAnimationParams) this.instance).getAnimationType();
            }

            @Override // com.waze.jni.protos.map.Marker.MarkerShowAnimationParamsOrBuilder
            public int getAnimationTypeValue() {
                return ((MarkerShowAnimationParams) this.instance).getAnimationTypeValue();
            }

            @Override // com.waze.jni.protos.map.Marker.MarkerShowAnimationParamsOrBuilder
            public boolean hasAnimationParams() {
                return ((MarkerShowAnimationParams) this.instance).hasAnimationParams();
            }

            public Builder mergeAnimationParams(AnimationParams animationParams) {
                copyOnWrite();
                ((MarkerShowAnimationParams) this.instance).mergeAnimationParams(animationParams);
                return this;
            }

            public Builder setAnimationParams(AnimationParams.Builder builder) {
                copyOnWrite();
                ((MarkerShowAnimationParams) this.instance).setAnimationParams(builder.build());
                return this;
            }

            public Builder setAnimationType(ShowAnimationType showAnimationType) {
                copyOnWrite();
                ((MarkerShowAnimationParams) this.instance).setAnimationType(showAnimationType);
                return this;
            }

            public Builder setAnimationTypeValue(int i2) {
                copyOnWrite();
                ((MarkerShowAnimationParams) this.instance).setAnimationTypeValue(i2);
                return this;
            }

            public Builder setAnimationParams(AnimationParams animationParams) {
                copyOnWrite();
                ((MarkerShowAnimationParams) this.instance).setAnimationParams(animationParams);
                return this;
            }
        }

        public static MarkerShowAnimationParams parseFrom(byte[] bArr) {
            return (MarkerShowAnimationParams) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MarkerShowAnimationParams parseFrom(byte[] bArr, de deVar) {
            return (MarkerShowAnimationParams) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(Marker marker) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(marker);
    }

    public static Marker parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (Marker) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Marker parseFrom(v vVar, de deVar) {
        return (Marker) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Marker parseFrom(z zVar) {
        return (Marker) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Marker parseFrom(z zVar, de deVar) {
        return (Marker) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Marker parseFrom(InputStream inputStream) {
        return (Marker) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Marker parseFrom(InputStream inputStream, de deVar) {
        return (Marker) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Marker parseFrom(ByteBuffer byteBuffer) {
        return (Marker) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Marker parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (Marker) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<Marker, Builder> implements MarkerOrBuilder {
        private Builder() {
            super(Marker.DEFAULT_INSTANCE);
        }

        public Builder clearAlignment() {
            copyOnWrite();
            ((Marker) this.instance).clearAlignment();
            return this;
        }

        public Builder clearAnchorOffset() {
            copyOnWrite();
            ((Marker) this.instance).clearAnchorOffset();
            return this;
        }

        public Builder clearHitBoxInset() {
            copyOnWrite();
            ((Marker) this.instance).clearHitBoxInset();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((Marker) this.instance).clearId();
            return this;
        }

        public Builder clearImage() {
            copyOnWrite();
            ((Marker) this.instance).clearImage();
            return this;
        }

        public Builder clearMarkerHideAnimationParams() {
            copyOnWrite();
            ((Marker) this.instance).clearMarkerHideAnimationParams();
            return this;
        }

        public Builder clearMarkerShowAnimationParams() {
            copyOnWrite();
            ((Marker) this.instance).clearMarkerShowAnimationParams();
            return this;
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((Marker) this.instance).clearPosition();
            return this;
        }

        public Builder clearPriority() {
            copyOnWrite();
            ((Marker) this.instance).clearPriority();
            return this;
        }

        public Builder clearScale() {
            copyOnWrite();
            ((Marker) this.instance).clearScale();
            return this;
        }

        public Builder clearZoomLevelDisplayRange() {
            copyOnWrite();
            ((Marker) this.instance).clearZoomLevelDisplayRange();
            return this;
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public Alignment getAlignment() {
            return ((Marker) this.instance).getAlignment();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public int getAlignmentValue() {
            return ((Marker) this.instance).getAlignmentValue();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public ScreenPoint getAnchorOffset() {
            return ((Marker) this.instance).getAnchorOffset();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public HitBoxInset getHitBoxInset() {
            return ((Marker) this.instance).getHitBoxInset();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public String getId() {
            return ((Marker) this.instance).getId();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public v getIdBytes() {
            return ((Marker) this.instance).getIdBytes();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public NativeBitmap getImage() {
            return ((Marker) this.instance).getImage();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public MarkerHideAnimationParams getMarkerHideAnimationParams() {
            return ((Marker) this.instance).getMarkerHideAnimationParams();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public MarkerShowAnimationParams getMarkerShowAnimationParams() {
            return ((Marker) this.instance).getMarkerShowAnimationParams();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public Position.IntPosition getPosition() {
            return ((Marker) this.instance).getPosition();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public Priority getPriority() {
            return ((Marker) this.instance).getPriority();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public int getPriorityValue() {
            return ((Marker) this.instance).getPriorityValue();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public float getScale() {
            return ((Marker) this.instance).getScale();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public ZoomLevelDisplayRange getZoomLevelDisplayRange() {
            return ((Marker) this.instance).getZoomLevelDisplayRange();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public boolean hasAnchorOffset() {
            return ((Marker) this.instance).hasAnchorOffset();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public boolean hasHitBoxInset() {
            return ((Marker) this.instance).hasHitBoxInset();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public boolean hasImage() {
            return ((Marker) this.instance).hasImage();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public boolean hasMarkerHideAnimationParams() {
            return ((Marker) this.instance).hasMarkerHideAnimationParams();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public boolean hasMarkerShowAnimationParams() {
            return ((Marker) this.instance).hasMarkerShowAnimationParams();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public boolean hasPosition() {
            return ((Marker) this.instance).hasPosition();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public boolean hasScale() {
            return ((Marker) this.instance).hasScale();
        }

        @Override // com.waze.jni.protos.map.MarkerOrBuilder
        public boolean hasZoomLevelDisplayRange() {
            return ((Marker) this.instance).hasZoomLevelDisplayRange();
        }

        public Builder mergeAnchorOffset(ScreenPoint screenPoint) {
            copyOnWrite();
            ((Marker) this.instance).mergeAnchorOffset(screenPoint);
            return this;
        }

        public Builder mergeHitBoxInset(HitBoxInset hitBoxInset) {
            copyOnWrite();
            ((Marker) this.instance).mergeHitBoxInset(hitBoxInset);
            return this;
        }

        public Builder mergeImage(NativeBitmap nativeBitmap) {
            copyOnWrite();
            ((Marker) this.instance).mergeImage(nativeBitmap);
            return this;
        }

        public Builder mergeMarkerHideAnimationParams(MarkerHideAnimationParams markerHideAnimationParams) {
            copyOnWrite();
            ((Marker) this.instance).mergeMarkerHideAnimationParams(markerHideAnimationParams);
            return this;
        }

        public Builder mergeMarkerShowAnimationParams(MarkerShowAnimationParams markerShowAnimationParams) {
            copyOnWrite();
            ((Marker) this.instance).mergeMarkerShowAnimationParams(markerShowAnimationParams);
            return this;
        }

        public Builder mergePosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((Marker) this.instance).mergePosition(intPosition);
            return this;
        }

        public Builder mergeZoomLevelDisplayRange(ZoomLevelDisplayRange zoomLevelDisplayRange) {
            copyOnWrite();
            ((Marker) this.instance).mergeZoomLevelDisplayRange(zoomLevelDisplayRange);
            return this;
        }

        public Builder setAlignment(Alignment alignment) {
            copyOnWrite();
            ((Marker) this.instance).setAlignment(alignment);
            return this;
        }

        public Builder setAlignmentValue(int i2) {
            copyOnWrite();
            ((Marker) this.instance).setAlignmentValue(i2);
            return this;
        }

        public Builder setAnchorOffset(ScreenPoint.Builder builder) {
            copyOnWrite();
            ((Marker) this.instance).setAnchorOffset(builder.build());
            return this;
        }

        public Builder setHitBoxInset(HitBoxInset.Builder builder) {
            copyOnWrite();
            ((Marker) this.instance).setHitBoxInset(builder.build());
            return this;
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((Marker) this.instance).setId(str);
            return this;
        }

        public Builder setIdBytes(v vVar) {
            copyOnWrite();
            ((Marker) this.instance).setIdBytes(vVar);
            return this;
        }

        public Builder setImage(NativeBitmap.Builder builder) {
            copyOnWrite();
            ((Marker) this.instance).setImage(builder.build());
            return this;
        }

        public Builder setMarkerHideAnimationParams(MarkerHideAnimationParams.Builder builder) {
            copyOnWrite();
            ((Marker) this.instance).setMarkerHideAnimationParams(builder.build());
            return this;
        }

        public Builder setMarkerShowAnimationParams(MarkerShowAnimationParams.Builder builder) {
            copyOnWrite();
            ((Marker) this.instance).setMarkerShowAnimationParams(builder.build());
            return this;
        }

        public Builder setPosition(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((Marker) this.instance).setPosition(builder.build());
            return this;
        }

        public Builder setPriority(Priority priority) {
            copyOnWrite();
            ((Marker) this.instance).setPriority(priority);
            return this;
        }

        public Builder setPriorityValue(int i2) {
            copyOnWrite();
            ((Marker) this.instance).setPriorityValue(i2);
            return this;
        }

        public Builder setScale(float f2) {
            copyOnWrite();
            ((Marker) this.instance).setScale(f2);
            return this;
        }

        public Builder setZoomLevelDisplayRange(ZoomLevelDisplayRange.Builder builder) {
            copyOnWrite();
            ((Marker) this.instance).setZoomLevelDisplayRange(builder.build());
            return this;
        }

        public Builder setAnchorOffset(ScreenPoint screenPoint) {
            copyOnWrite();
            ((Marker) this.instance).setAnchorOffset(screenPoint);
            return this;
        }

        public Builder setHitBoxInset(HitBoxInset hitBoxInset) {
            copyOnWrite();
            ((Marker) this.instance).setHitBoxInset(hitBoxInset);
            return this;
        }

        public Builder setImage(NativeBitmap nativeBitmap) {
            copyOnWrite();
            ((Marker) this.instance).setImage(nativeBitmap);
            return this;
        }

        public Builder setMarkerHideAnimationParams(MarkerHideAnimationParams markerHideAnimationParams) {
            copyOnWrite();
            ((Marker) this.instance).setMarkerHideAnimationParams(markerHideAnimationParams);
            return this;
        }

        public Builder setMarkerShowAnimationParams(MarkerShowAnimationParams markerShowAnimationParams) {
            copyOnWrite();
            ((Marker) this.instance).setMarkerShowAnimationParams(markerShowAnimationParams);
            return this;
        }

        public Builder setPosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((Marker) this.instance).setPosition(intPosition);
            return this;
        }

        public Builder setZoomLevelDisplayRange(ZoomLevelDisplayRange zoomLevelDisplayRange) {
            copyOnWrite();
            ((Marker) this.instance).setZoomLevelDisplayRange(zoomLevelDisplayRange);
            return this;
        }
    }

    public static Marker parseFrom(byte[] bArr) {
        return (Marker) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Marker parseFrom(byte[] bArr, de deVar) {
        return (Marker) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
