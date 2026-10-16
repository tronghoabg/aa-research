package com.waze.jni.protos.map;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.MapLine;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapLineIntersectionMetadata extends du<MapLineIntersectionMetadata, Builder> implements MapLineIntersectionMetadataOrBuilder {
    public static final int AZIMUTH_FIELD_NUMBER = 3;
    public static final int COORDINATE_FIELD_NUMBER = 1;
    private static final MapLineIntersectionMetadata DEFAULT_INSTANCE;
    public static final int DISTANCE_METERS_FIELD_NUMBER = 4;
    public static final int MAP_LINE_FIELD_NUMBER = 2;
    private static volatile fo<MapLineIntersectionMetadata> PARSER;
    private float azimuth_;
    private int bitField0_;
    private Position.IntPosition coordinate_;
    private int distanceMeters_;
    private MapLine mapLine_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.MapLineIntersectionMetadata$1, reason: invalid class name */
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

    static {
        MapLineIntersectionMetadata mapLineIntersectionMetadata = new MapLineIntersectionMetadata();
        DEFAULT_INSTANCE = mapLineIntersectionMetadata;
        du.registerDefaultInstance(MapLineIntersectionMetadata.class, mapLineIntersectionMetadata);
    }

    private MapLineIntersectionMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAzimuth() {
        this.azimuth_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinate() {
        this.coordinate_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceMeters() {
        this.distanceMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapLine() {
        this.mapLine_ = null;
        this.bitField0_ &= -3;
    }

    public static MapLineIntersectionMetadata getDefaultInstance() {
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
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapLine(MapLine mapLine) {
        Objects.requireNonNull(mapLine);
        MapLine mapLine2 = this.mapLine_;
        if (mapLine2 != null && mapLine2 != MapLine.getDefaultInstance()) {
            MapLine.Builder builderNewBuilder = MapLine.newBuilder(mapLine2);
            builderNewBuilder.mergeFrom((MapLine.Builder) mapLine);
            mapLine = builderNewBuilder.buildPartial();
        }
        this.mapLine_ = mapLine;
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MapLineIntersectionMetadata parseDelimitedFrom(InputStream inputStream) {
        return (MapLineIntersectionMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapLineIntersectionMetadata parseFrom(v vVar) {
        return (MapLineIntersectionMetadata) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<MapLineIntersectionMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAzimuth(float f2) {
        this.azimuth_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinate(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.coordinate_ = intPosition;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceMeters(int i2) {
        this.distanceMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapLine(MapLine mapLine) {
        Objects.requireNonNull(mapLine);
        this.mapLine_ = mapLine;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0001\u0004\u0004", new Object[]{"bitField0_", "coordinate_", "mapLine_", "azimuth_", "distanceMeters_"});
        }
        if (iOrdinal == 3) {
            return new MapLineIntersectionMetadata();
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
        fo<MapLineIntersectionMetadata> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (MapLineIntersectionMetadata.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.MapLineIntersectionMetadataOrBuilder
    public float getAzimuth() {
        return this.azimuth_;
    }

    @Override // com.waze.jni.protos.map.MapLineIntersectionMetadataOrBuilder
    public Position.IntPosition getCoordinate() {
        Position.IntPosition intPosition = this.coordinate_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.map.MapLineIntersectionMetadataOrBuilder
    public int getDistanceMeters() {
        return this.distanceMeters_;
    }

    @Override // com.waze.jni.protos.map.MapLineIntersectionMetadataOrBuilder
    public MapLine getMapLine() {
        MapLine mapLine = this.mapLine_;
        return mapLine == null ? MapLine.getDefaultInstance() : mapLine;
    }

    @Override // com.waze.jni.protos.map.MapLineIntersectionMetadataOrBuilder
    public boolean hasCoordinate() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.map.MapLineIntersectionMetadataOrBuilder
    public boolean hasMapLine() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(MapLineIntersectionMetadata mapLineIntersectionMetadata) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(mapLineIntersectionMetadata);
    }

    public static MapLineIntersectionMetadata parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (MapLineIntersectionMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapLineIntersectionMetadata parseFrom(v vVar, de deVar) {
        return (MapLineIntersectionMetadata) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static MapLineIntersectionMetadata parseFrom(z zVar) {
        return (MapLineIntersectionMetadata) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static MapLineIntersectionMetadata parseFrom(z zVar, de deVar) {
        return (MapLineIntersectionMetadata) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static MapLineIntersectionMetadata parseFrom(InputStream inputStream) {
        return (MapLineIntersectionMetadata) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapLineIntersectionMetadata parseFrom(InputStream inputStream, de deVar) {
        return (MapLineIntersectionMetadata) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapLineIntersectionMetadata parseFrom(ByteBuffer byteBuffer) {
        return (MapLineIntersectionMetadata) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MapLineIntersectionMetadata parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (MapLineIntersectionMetadata) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<MapLineIntersectionMetadata, Builder> implements MapLineIntersectionMetadataOrBuilder {
        private Builder() {
            super(MapLineIntersectionMetadata.DEFAULT_INSTANCE);
        }

        public Builder clearAzimuth() {
            copyOnWrite();
            ((MapLineIntersectionMetadata) this.instance).clearAzimuth();
            return this;
        }

        public Builder clearCoordinate() {
            copyOnWrite();
            ((MapLineIntersectionMetadata) this.instance).clearCoordinate();
            return this;
        }

        public Builder clearDistanceMeters() {
            copyOnWrite();
            ((MapLineIntersectionMetadata) this.instance).clearDistanceMeters();
            return this;
        }

        public Builder clearMapLine() {
            copyOnWrite();
            ((MapLineIntersectionMetadata) this.instance).clearMapLine();
            return this;
        }

        @Override // com.waze.jni.protos.map.MapLineIntersectionMetadataOrBuilder
        public float getAzimuth() {
            return ((MapLineIntersectionMetadata) this.instance).getAzimuth();
        }

        @Override // com.waze.jni.protos.map.MapLineIntersectionMetadataOrBuilder
        public Position.IntPosition getCoordinate() {
            return ((MapLineIntersectionMetadata) this.instance).getCoordinate();
        }

        @Override // com.waze.jni.protos.map.MapLineIntersectionMetadataOrBuilder
        public int getDistanceMeters() {
            return ((MapLineIntersectionMetadata) this.instance).getDistanceMeters();
        }

        @Override // com.waze.jni.protos.map.MapLineIntersectionMetadataOrBuilder
        public MapLine getMapLine() {
            return ((MapLineIntersectionMetadata) this.instance).getMapLine();
        }

        @Override // com.waze.jni.protos.map.MapLineIntersectionMetadataOrBuilder
        public boolean hasCoordinate() {
            return ((MapLineIntersectionMetadata) this.instance).hasCoordinate();
        }

        @Override // com.waze.jni.protos.map.MapLineIntersectionMetadataOrBuilder
        public boolean hasMapLine() {
            return ((MapLineIntersectionMetadata) this.instance).hasMapLine();
        }

        public Builder mergeCoordinate(Position.IntPosition intPosition) {
            copyOnWrite();
            ((MapLineIntersectionMetadata) this.instance).mergeCoordinate(intPosition);
            return this;
        }

        public Builder mergeMapLine(MapLine mapLine) {
            copyOnWrite();
            ((MapLineIntersectionMetadata) this.instance).mergeMapLine(mapLine);
            return this;
        }

        public Builder setAzimuth(float f2) {
            copyOnWrite();
            ((MapLineIntersectionMetadata) this.instance).setAzimuth(f2);
            return this;
        }

        public Builder setCoordinate(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((MapLineIntersectionMetadata) this.instance).setCoordinate(builder.build());
            return this;
        }

        public Builder setDistanceMeters(int i2) {
            copyOnWrite();
            ((MapLineIntersectionMetadata) this.instance).setDistanceMeters(i2);
            return this;
        }

        public Builder setMapLine(MapLine.Builder builder) {
            copyOnWrite();
            ((MapLineIntersectionMetadata) this.instance).setMapLine(builder.build());
            return this;
        }

        public Builder setCoordinate(Position.IntPosition intPosition) {
            copyOnWrite();
            ((MapLineIntersectionMetadata) this.instance).setCoordinate(intPosition);
            return this;
        }

        public Builder setMapLine(MapLine mapLine) {
            copyOnWrite();
            ((MapLineIntersectionMetadata) this.instance).setMapLine(mapLine);
            return this;
        }
    }

    public static MapLineIntersectionMetadata parseFrom(byte[] bArr) {
        return (MapLineIntersectionMetadata) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MapLineIntersectionMetadata parseFrom(byte[] bArr, de deVar) {
        return (MapLineIntersectionMetadata) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
