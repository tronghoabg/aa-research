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
import com.waze.jni.protos.map.Polygon;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ExtendedPolygon extends du<ExtendedPolygon, Builder> implements ExtendedPolygonOrBuilder {
    private static final ExtendedPolygon DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 3;
    private static volatile fo<ExtendedPolygon> PARSER = null;
    public static final int POLYGON_FIELD_NUMBER = 1;
    public static final int STYLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String label_ = "";
    private Polygon polygon_;
    private int style_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.ExtendedPolygon$1, reason: invalid class name */
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
    public enum Style implements eg {
        GENERIC_TRAFFIC_EVENT(0),
        UNRECOGNIZED(-1);

        public static final int GENERIC_TRAFFIC_EVENT_VALUE = 0;
        private static final eh<Style> internalValueMap = new eh<Style>() { // from class: com.waze.jni.protos.map.ExtendedPolygon.Style.1
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
            if (i2 != 0) {
                return null;
            }
            return GENERIC_TRAFFIC_EVENT;
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
        ExtendedPolygon extendedPolygon = new ExtendedPolygon();
        DEFAULT_INSTANCE = extendedPolygon;
        du.registerDefaultInstance(ExtendedPolygon.class, extendedPolygon);
    }

    private ExtendedPolygon() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.bitField0_ &= -3;
        this.label_ = getDefaultInstance().getLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolygon() {
        this.polygon_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyle() {
        this.style_ = 0;
    }

    public static ExtendedPolygon getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePolygon(Polygon polygon) {
        Objects.requireNonNull(polygon);
        Polygon polygon2 = this.polygon_;
        if (polygon2 != null && polygon2 != Polygon.getDefaultInstance()) {
            Polygon.Builder builderNewBuilder = Polygon.newBuilder(polygon2);
            builderNewBuilder.mergeFrom((Polygon.Builder) polygon);
            polygon = builderNewBuilder.buildPartial();
        }
        this.polygon_ = polygon;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ExtendedPolygon parseDelimitedFrom(InputStream inputStream) {
        return (ExtendedPolygon) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendedPolygon parseFrom(v vVar) {
        return (ExtendedPolygon) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ExtendedPolygon> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.label_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.label_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolygon(Polygon polygon) {
        Objects.requireNonNull(polygon);
        this.polygon_ = polygon;
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

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ለ\u0001", new Object[]{"bitField0_", "polygon_", "style_", "label_"});
        }
        if (iOrdinal == 3) {
            return new ExtendedPolygon();
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
        fo<ExtendedPolygon> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ExtendedPolygon.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.ExtendedPolygonOrBuilder
    public String getLabel() {
        return this.label_;
    }

    @Override // com.waze.jni.protos.map.ExtendedPolygonOrBuilder
    public v getLabelBytes() {
        return v.s(this.label_);
    }

    @Override // com.waze.jni.protos.map.ExtendedPolygonOrBuilder
    public Polygon getPolygon() {
        Polygon polygon = this.polygon_;
        return polygon == null ? Polygon.getDefaultInstance() : polygon;
    }

    @Override // com.waze.jni.protos.map.ExtendedPolygonOrBuilder
    public Style getStyle() {
        Style styleForNumber = Style.forNumber(this.style_);
        return styleForNumber == null ? Style.UNRECOGNIZED : styleForNumber;
    }

    @Override // com.waze.jni.protos.map.ExtendedPolygonOrBuilder
    public int getStyleValue() {
        return this.style_;
    }

    @Override // com.waze.jni.protos.map.ExtendedPolygonOrBuilder
    public boolean hasLabel() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.map.ExtendedPolygonOrBuilder
    public boolean hasPolygon() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(ExtendedPolygon extendedPolygon) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(extendedPolygon);
    }

    public static ExtendedPolygon parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ExtendedPolygon) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ExtendedPolygon parseFrom(v vVar, de deVar) {
        return (ExtendedPolygon) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ExtendedPolygon parseFrom(z zVar) {
        return (ExtendedPolygon) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ExtendedPolygon parseFrom(z zVar, de deVar) {
        return (ExtendedPolygon) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ExtendedPolygon parseFrom(InputStream inputStream) {
        return (ExtendedPolygon) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendedPolygon parseFrom(InputStream inputStream, de deVar) {
        return (ExtendedPolygon) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ExtendedPolygon parseFrom(ByteBuffer byteBuffer) {
        return (ExtendedPolygon) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ExtendedPolygon parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ExtendedPolygon) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<ExtendedPolygon, Builder> implements ExtendedPolygonOrBuilder {
        private Builder() {
            super(ExtendedPolygon.DEFAULT_INSTANCE);
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((ExtendedPolygon) this.instance).clearLabel();
            return this;
        }

        public Builder clearPolygon() {
            copyOnWrite();
            ((ExtendedPolygon) this.instance).clearPolygon();
            return this;
        }

        public Builder clearStyle() {
            copyOnWrite();
            ((ExtendedPolygon) this.instance).clearStyle();
            return this;
        }

        @Override // com.waze.jni.protos.map.ExtendedPolygonOrBuilder
        public String getLabel() {
            return ((ExtendedPolygon) this.instance).getLabel();
        }

        @Override // com.waze.jni.protos.map.ExtendedPolygonOrBuilder
        public v getLabelBytes() {
            return ((ExtendedPolygon) this.instance).getLabelBytes();
        }

        @Override // com.waze.jni.protos.map.ExtendedPolygonOrBuilder
        public Polygon getPolygon() {
            return ((ExtendedPolygon) this.instance).getPolygon();
        }

        @Override // com.waze.jni.protos.map.ExtendedPolygonOrBuilder
        public Style getStyle() {
            return ((ExtendedPolygon) this.instance).getStyle();
        }

        @Override // com.waze.jni.protos.map.ExtendedPolygonOrBuilder
        public int getStyleValue() {
            return ((ExtendedPolygon) this.instance).getStyleValue();
        }

        @Override // com.waze.jni.protos.map.ExtendedPolygonOrBuilder
        public boolean hasLabel() {
            return ((ExtendedPolygon) this.instance).hasLabel();
        }

        @Override // com.waze.jni.protos.map.ExtendedPolygonOrBuilder
        public boolean hasPolygon() {
            return ((ExtendedPolygon) this.instance).hasPolygon();
        }

        public Builder mergePolygon(Polygon polygon) {
            copyOnWrite();
            ((ExtendedPolygon) this.instance).mergePolygon(polygon);
            return this;
        }

        public Builder setLabel(String str) {
            copyOnWrite();
            ((ExtendedPolygon) this.instance).setLabel(str);
            return this;
        }

        public Builder setLabelBytes(v vVar) {
            copyOnWrite();
            ((ExtendedPolygon) this.instance).setLabelBytes(vVar);
            return this;
        }

        public Builder setPolygon(Polygon.Builder builder) {
            copyOnWrite();
            ((ExtendedPolygon) this.instance).setPolygon(builder.build());
            return this;
        }

        public Builder setStyle(Style style) {
            copyOnWrite();
            ((ExtendedPolygon) this.instance).setStyle(style);
            return this;
        }

        public Builder setStyleValue(int i2) {
            copyOnWrite();
            ((ExtendedPolygon) this.instance).setStyleValue(i2);
            return this;
        }

        public Builder setPolygon(Polygon polygon) {
            copyOnWrite();
            ((ExtendedPolygon) this.instance).setPolygon(polygon);
            return this;
        }
    }

    public static ExtendedPolygon parseFrom(byte[] bArr) {
        return (ExtendedPolygon) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExtendedPolygon parseFrom(byte[] bArr, de deVar) {
        return (ExtendedPolygon) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
