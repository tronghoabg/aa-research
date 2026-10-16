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
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.map.AnimationParams;
import com.waze.jni.protos.map.Polyline;
import com.waze.jni.protos.map.ZoomLevelDisplayRange;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ExtendedPolyline extends du<ExtendedPolyline, Builder> implements ExtendedPolylineOrBuilder {
    public static final int ANIMATION_PARAMS_FIELD_NUMBER = 5;
    public static final int CUT_TRAILING_BEHAVIOR_FIELD_NUMBER = 6;
    private static final ExtendedPolyline DEFAULT_INSTANCE;
    private static volatile fo<ExtendedPolyline> PARSER = null;
    public static final int POLYLINE_FIELD_NUMBER = 1;
    public static final int STYLE_FIELD_NUMBER = 2;
    public static final int TAG_FIELD_NUMBER = 4;
    public static final int ZOOM_LEVEL_DISPLAY_RANGE_FIELD_NUMBER = 3;
    private AnimationParams animationParams_;
    private int bitField0_;
    private int cutTrailingBehavior_;
    private Polyline polyline_;
    private int style_;
    private String tag_ = "";
    private ZoomLevelDisplayRange zoomLevelDisplayRange_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.ExtendedPolyline$1, reason: invalid class name */
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
    public enum CutTrailingBehavior implements eg {
        NONE(0),
        FROM_USER_LOCATION_POSITION(1),
        UNRECOGNIZED(-1);

        public static final int FROM_USER_LOCATION_POSITION_VALUE = 1;
        public static final int NONE_VALUE = 0;
        private static final eh<CutTrailingBehavior> internalValueMap = new eh<CutTrailingBehavior>() { // from class: com.waze.jni.protos.map.ExtendedPolyline.CutTrailingBehavior.1
            @Override // com.google.v.eh
            public CutTrailingBehavior findValueByNumber(int i2) {
                return CutTrailingBehavior.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class CutTrailingBehaviorVerifier implements ei {
            static final ei INSTANCE = new CutTrailingBehaviorVerifier();

            private CutTrailingBehaviorVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return CutTrailingBehavior.forNumber(i2) != null;
            }
        }

        CutTrailingBehavior(int i2) {
            this.value = i2;
        }

        public static CutTrailingBehavior forNumber(int i2) {
            if (i2 == 0) {
                return NONE;
            }
            if (i2 != 1) {
                return null;
            }
            return FROM_USER_LOCATION_POSITION;
        }

        public static eh<CutTrailingBehavior> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return CutTrailingBehaviorVerifier.INSTANCE;
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
    public enum Style implements eg {
        PREVIEW_PRIMARY(0),
        PREVIEW_SECONDARY(1),
        TRAFFIC_LIGHT_PRIMARY(2),
        TRAFFIC_LIGHT_SECONDARY(3),
        TRAFFIC_HEAVY_PRIMARY(4),
        TRAFFIC_HEAVY_SECONDARY(5),
        TRAFFIC_CLOSURE(6),
        TRAFFIC_CLOSURE_ON_ROUTE(7),
        TRAFFIC_DASHED_CLOSURE(8),
        TRAFFIC_WIDE_CLOSURE(9),
        SELECTION_HIGHLIGHT(10),
        ALT_GREEN_PRIMARY(11),
        ALT_GREEN_SECONDARY(12),
        ALT_BLUE_PRIMARY(13),
        ALT_BLUE_SECONDARY(14),
        ALT_ORANGE_PRIMARY(15),
        ALT_ORANGE_SECONDARY(16),
        UNRECOGNIZED(-1);

        public static final int ALT_BLUE_PRIMARY_VALUE = 13;
        public static final int ALT_BLUE_SECONDARY_VALUE = 14;
        public static final int ALT_GREEN_PRIMARY_VALUE = 11;
        public static final int ALT_GREEN_SECONDARY_VALUE = 12;
        public static final int ALT_ORANGE_PRIMARY_VALUE = 15;
        public static final int ALT_ORANGE_SECONDARY_VALUE = 16;
        public static final int PREVIEW_PRIMARY_VALUE = 0;
        public static final int PREVIEW_SECONDARY_VALUE = 1;
        public static final int SELECTION_HIGHLIGHT_VALUE = 10;
        public static final int TRAFFIC_CLOSURE_ON_ROUTE_VALUE = 7;
        public static final int TRAFFIC_CLOSURE_VALUE = 6;
        public static final int TRAFFIC_DASHED_CLOSURE_VALUE = 8;
        public static final int TRAFFIC_HEAVY_PRIMARY_VALUE = 4;
        public static final int TRAFFIC_HEAVY_SECONDARY_VALUE = 5;
        public static final int TRAFFIC_LIGHT_PRIMARY_VALUE = 2;
        public static final int TRAFFIC_LIGHT_SECONDARY_VALUE = 3;
        public static final int TRAFFIC_WIDE_CLOSURE_VALUE = 9;
        private static final eh<Style> internalValueMap = new eh<Style>() { // from class: com.waze.jni.protos.map.ExtendedPolyline.Style.1
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
            switch (i2) {
                case 0:
                    return PREVIEW_PRIMARY;
                case 1:
                    return PREVIEW_SECONDARY;
                case 2:
                    return TRAFFIC_LIGHT_PRIMARY;
                case 3:
                    return TRAFFIC_LIGHT_SECONDARY;
                case 4:
                    return TRAFFIC_HEAVY_PRIMARY;
                case 5:
                    return TRAFFIC_HEAVY_SECONDARY;
                case 6:
                    return TRAFFIC_CLOSURE;
                case 7:
                    return TRAFFIC_CLOSURE_ON_ROUTE;
                case 8:
                    return TRAFFIC_DASHED_CLOSURE;
                case 9:
                    return TRAFFIC_WIDE_CLOSURE;
                case 10:
                    return SELECTION_HIGHLIGHT;
                case 11:
                    return ALT_GREEN_PRIMARY;
                case 12:
                    return ALT_GREEN_SECONDARY;
                case 13:
                    return ALT_BLUE_PRIMARY;
                case 14:
                    return ALT_BLUE_SECONDARY;
                case 15:
                    return ALT_ORANGE_PRIMARY;
                case 16:
                    return ALT_ORANGE_SECONDARY;
                default:
                    return null;
            }
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

    static {
        ExtendedPolyline extendedPolyline = new ExtendedPolyline();
        DEFAULT_INSTANCE = extendedPolyline;
        du.registerDefaultInstance(ExtendedPolyline.class, extendedPolyline);
    }

    private ExtendedPolyline() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnimationParams() {
        this.animationParams_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCutTrailingBehavior() {
        this.cutTrailingBehavior_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolyline() {
        this.polyline_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyle() {
        this.style_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTag() {
        this.bitField0_ &= -5;
        this.tag_ = getDefaultInstance().getTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZoomLevelDisplayRange() {
        this.zoomLevelDisplayRange_ = null;
        this.bitField0_ &= -3;
    }

    public static ExtendedPolyline getDefaultInstance() {
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
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePolyline(Polyline polyline) {
        Objects.requireNonNull(polyline);
        Polyline polyline2 = this.polyline_;
        if (polyline2 != null && polyline2 != Polyline.getDefaultInstance()) {
            Polyline.Builder builderNewBuilder = Polyline.newBuilder(polyline2);
            builderNewBuilder.mergeFrom((Polyline.Builder) polyline);
            polyline = builderNewBuilder.buildPartial();
        }
        this.polyline_ = polyline;
        this.bitField0_ |= 1;
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
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ExtendedPolyline parseDelimitedFrom(InputStream inputStream) {
        return (ExtendedPolyline) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendedPolyline parseFrom(v vVar) {
        return (ExtendedPolyline) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ExtendedPolyline> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationParams(AnimationParams animationParams) {
        Objects.requireNonNull(animationParams);
        this.animationParams_ = animationParams;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCutTrailingBehavior(CutTrailingBehavior cutTrailingBehavior) {
        this.cutTrailingBehavior_ = cutTrailingBehavior.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCutTrailingBehaviorValue(int i2) {
        this.cutTrailingBehavior_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolyline(Polyline polyline) {
        Objects.requireNonNull(polyline);
        this.polyline_ = polyline;
        this.bitField0_ |= 1;
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
    public void setTag(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.tag_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.tag_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZoomLevelDisplayRange(ZoomLevelDisplayRange zoomLevelDisplayRange) {
        Objects.requireNonNull(zoomLevelDisplayRange);
        this.zoomLevelDisplayRange_ = zoomLevelDisplayRange;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001\u0004ለ\u0002\u0005ဉ\u0003\u0006\f", new Object[]{"bitField0_", "polyline_", "style_", "zoomLevelDisplayRange_", "tag_", "animationParams_", "cutTrailingBehavior_"});
        }
        if (iOrdinal == 3) {
            return new ExtendedPolyline();
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
        fo<ExtendedPolyline> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ExtendedPolyline.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
    public AnimationParams getAnimationParams() {
        AnimationParams animationParams = this.animationParams_;
        return animationParams == null ? AnimationParams.getDefaultInstance() : animationParams;
    }

    @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
    public CutTrailingBehavior getCutTrailingBehavior() {
        CutTrailingBehavior cutTrailingBehaviorForNumber = CutTrailingBehavior.forNumber(this.cutTrailingBehavior_);
        return cutTrailingBehaviorForNumber == null ? CutTrailingBehavior.UNRECOGNIZED : cutTrailingBehaviorForNumber;
    }

    @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
    public int getCutTrailingBehaviorValue() {
        return this.cutTrailingBehavior_;
    }

    @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
    public Polyline getPolyline() {
        Polyline polyline = this.polyline_;
        return polyline == null ? Polyline.getDefaultInstance() : polyline;
    }

    @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
    public Style getStyle() {
        Style styleForNumber = Style.forNumber(this.style_);
        return styleForNumber == null ? Style.UNRECOGNIZED : styleForNumber;
    }

    @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
    public int getStyleValue() {
        return this.style_;
    }

    @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
    public String getTag() {
        return this.tag_;
    }

    @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
    public v getTagBytes() {
        return v.s(this.tag_);
    }

    @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
    public ZoomLevelDisplayRange getZoomLevelDisplayRange() {
        ZoomLevelDisplayRange zoomLevelDisplayRange = this.zoomLevelDisplayRange_;
        return zoomLevelDisplayRange == null ? ZoomLevelDisplayRange.getDefaultInstance() : zoomLevelDisplayRange;
    }

    @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
    public boolean hasAnimationParams() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
    public boolean hasPolyline() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
    public boolean hasTag() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
    public boolean hasZoomLevelDisplayRange() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(ExtendedPolyline extendedPolyline) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(extendedPolyline);
    }

    public static ExtendedPolyline parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ExtendedPolyline) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ExtendedPolyline parseFrom(v vVar, de deVar) {
        return (ExtendedPolyline) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ExtendedPolyline parseFrom(z zVar) {
        return (ExtendedPolyline) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ExtendedPolyline parseFrom(z zVar, de deVar) {
        return (ExtendedPolyline) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ExtendedPolyline parseFrom(InputStream inputStream) {
        return (ExtendedPolyline) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendedPolyline parseFrom(InputStream inputStream, de deVar) {
        return (ExtendedPolyline) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ExtendedPolyline parseFrom(ByteBuffer byteBuffer) {
        return (ExtendedPolyline) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ExtendedPolyline parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ExtendedPolyline) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<ExtendedPolyline, Builder> implements ExtendedPolylineOrBuilder {
        private Builder() {
            super(ExtendedPolyline.DEFAULT_INSTANCE);
        }

        public Builder clearAnimationParams() {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).clearAnimationParams();
            return this;
        }

        public Builder clearCutTrailingBehavior() {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).clearCutTrailingBehavior();
            return this;
        }

        public Builder clearPolyline() {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).clearPolyline();
            return this;
        }

        public Builder clearStyle() {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).clearStyle();
            return this;
        }

        public Builder clearTag() {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).clearTag();
            return this;
        }

        public Builder clearZoomLevelDisplayRange() {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).clearZoomLevelDisplayRange();
            return this;
        }

        @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
        public AnimationParams getAnimationParams() {
            return ((ExtendedPolyline) this.instance).getAnimationParams();
        }

        @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
        public CutTrailingBehavior getCutTrailingBehavior() {
            return ((ExtendedPolyline) this.instance).getCutTrailingBehavior();
        }

        @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
        public int getCutTrailingBehaviorValue() {
            return ((ExtendedPolyline) this.instance).getCutTrailingBehaviorValue();
        }

        @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
        public Polyline getPolyline() {
            return ((ExtendedPolyline) this.instance).getPolyline();
        }

        @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
        public Style getStyle() {
            return ((ExtendedPolyline) this.instance).getStyle();
        }

        @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
        public int getStyleValue() {
            return ((ExtendedPolyline) this.instance).getStyleValue();
        }

        @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
        public String getTag() {
            return ((ExtendedPolyline) this.instance).getTag();
        }

        @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
        public v getTagBytes() {
            return ((ExtendedPolyline) this.instance).getTagBytes();
        }

        @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
        public ZoomLevelDisplayRange getZoomLevelDisplayRange() {
            return ((ExtendedPolyline) this.instance).getZoomLevelDisplayRange();
        }

        @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
        public boolean hasAnimationParams() {
            return ((ExtendedPolyline) this.instance).hasAnimationParams();
        }

        @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
        public boolean hasPolyline() {
            return ((ExtendedPolyline) this.instance).hasPolyline();
        }

        @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
        public boolean hasTag() {
            return ((ExtendedPolyline) this.instance).hasTag();
        }

        @Override // com.waze.jni.protos.map.ExtendedPolylineOrBuilder
        public boolean hasZoomLevelDisplayRange() {
            return ((ExtendedPolyline) this.instance).hasZoomLevelDisplayRange();
        }

        public Builder mergeAnimationParams(AnimationParams animationParams) {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).mergeAnimationParams(animationParams);
            return this;
        }

        public Builder mergePolyline(Polyline polyline) {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).mergePolyline(polyline);
            return this;
        }

        public Builder mergeZoomLevelDisplayRange(ZoomLevelDisplayRange zoomLevelDisplayRange) {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).mergeZoomLevelDisplayRange(zoomLevelDisplayRange);
            return this;
        }

        public Builder setAnimationParams(AnimationParams.Builder builder) {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).setAnimationParams(builder.build());
            return this;
        }

        public Builder setCutTrailingBehavior(CutTrailingBehavior cutTrailingBehavior) {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).setCutTrailingBehavior(cutTrailingBehavior);
            return this;
        }

        public Builder setCutTrailingBehaviorValue(int i2) {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).setCutTrailingBehaviorValue(i2);
            return this;
        }

        public Builder setPolyline(Polyline.Builder builder) {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).setPolyline(builder.build());
            return this;
        }

        public Builder setStyle(Style style) {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).setStyle(style);
            return this;
        }

        public Builder setStyleValue(int i2) {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).setStyleValue(i2);
            return this;
        }

        public Builder setTag(String str) {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).setTag(str);
            return this;
        }

        public Builder setTagBytes(v vVar) {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).setTagBytes(vVar);
            return this;
        }

        public Builder setZoomLevelDisplayRange(ZoomLevelDisplayRange.Builder builder) {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).setZoomLevelDisplayRange(builder.build());
            return this;
        }

        public Builder setAnimationParams(AnimationParams animationParams) {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).setAnimationParams(animationParams);
            return this;
        }

        public Builder setPolyline(Polyline polyline) {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).setPolyline(polyline);
            return this;
        }

        public Builder setZoomLevelDisplayRange(ZoomLevelDisplayRange zoomLevelDisplayRange) {
            copyOnWrite();
            ((ExtendedPolyline) this.instance).setZoomLevelDisplayRange(zoomLevelDisplayRange);
            return this;
        }
    }

    public static ExtendedPolyline parseFrom(byte[] bArr) {
        return (ExtendedPolyline) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExtendedPolyline parseFrom(byte[] bArr, de deVar) {
        return (ExtendedPolyline) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
