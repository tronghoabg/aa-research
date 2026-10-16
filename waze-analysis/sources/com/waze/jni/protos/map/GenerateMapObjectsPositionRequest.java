package com.waze.jni.protos.map;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.Polyline;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GenerateMapObjectsPositionRequest extends du<GenerateMapObjectsPositionRequest, Builder> implements GenerateMapObjectsPositionRequestOrBuilder {
    public static final int COORDINATES_TO_BE_FAR_FROM_FIELD_NUMBER = 2;
    private static final GenerateMapObjectsPositionRequest DEFAULT_INSTANCE;
    private static volatile fo<GenerateMapObjectsPositionRequest> PARSER = null;
    public static final int POLYLINES_FIELD_NUMBER = 1;
    private eo<Polyline> polylines_ = emptyProtobufList();
    private eo<Position.IntPosition> coordinatesToBeFarFrom_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.GenerateMapObjectsPositionRequest$1, reason: invalid class name */
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
        GenerateMapObjectsPositionRequest generateMapObjectsPositionRequest = new GenerateMapObjectsPositionRequest();
        DEFAULT_INSTANCE = generateMapObjectsPositionRequest;
        du.registerDefaultInstance(GenerateMapObjectsPositionRequest.class, generateMapObjectsPositionRequest);
    }

    private GenerateMapObjectsPositionRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCoordinatesToBeFarFrom(Iterable<? extends Position.IntPosition> iterable) {
        ensureCoordinatesToBeFarFromIsMutable();
        c.addAll(iterable, this.coordinatesToBeFarFrom_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPolylines(Iterable<? extends Polyline> iterable) {
        ensurePolylinesIsMutable();
        c.addAll(iterable, this.polylines_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCoordinatesToBeFarFrom(int i2, Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        ensureCoordinatesToBeFarFromIsMutable();
        this.coordinatesToBeFarFrom_.add(i2, intPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPolylines(int i2, Polyline polyline) {
        Objects.requireNonNull(polyline);
        ensurePolylinesIsMutable();
        this.polylines_.add(i2, polyline);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinatesToBeFarFrom() {
        this.coordinatesToBeFarFrom_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolylines() {
        this.polylines_ = emptyProtobufList();
    }

    private void ensureCoordinatesToBeFarFromIsMutable() {
        eo<Position.IntPosition> eoVar = this.coordinatesToBeFarFrom_;
        if (eoVar.c()) {
            return;
        }
        this.coordinatesToBeFarFrom_ = du.mutableCopy(eoVar);
    }

    private void ensurePolylinesIsMutable() {
        eo<Polyline> eoVar = this.polylines_;
        if (eoVar.c()) {
            return;
        }
        this.polylines_ = du.mutableCopy(eoVar);
    }

    public static GenerateMapObjectsPositionRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GenerateMapObjectsPositionRequest parseDelimitedFrom(InputStream inputStream) {
        return (GenerateMapObjectsPositionRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GenerateMapObjectsPositionRequest parseFrom(v vVar) {
        return (GenerateMapObjectsPositionRequest) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<GenerateMapObjectsPositionRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCoordinatesToBeFarFrom(int i2) {
        ensureCoordinatesToBeFarFromIsMutable();
        this.coordinatesToBeFarFrom_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePolylines(int i2) {
        ensurePolylinesIsMutable();
        this.polylines_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinatesToBeFarFrom(int i2, Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        ensureCoordinatesToBeFarFromIsMutable();
        this.coordinatesToBeFarFrom_.set(i2, intPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolylines(int i2, Polyline polyline) {
        Objects.requireNonNull(polyline);
        ensurePolylinesIsMutable();
        this.polylines_.set(i2, polyline);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"polylines_", Polyline.class, "coordinatesToBeFarFrom_", Position.IntPosition.class});
        }
        if (iOrdinal == 3) {
            return new GenerateMapObjectsPositionRequest();
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
        fo<GenerateMapObjectsPositionRequest> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (GenerateMapObjectsPositionRequest.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionRequestOrBuilder
    public Position.IntPosition getCoordinatesToBeFarFrom(int i2) {
        return this.coordinatesToBeFarFrom_.get(i2);
    }

    @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionRequestOrBuilder
    public int getCoordinatesToBeFarFromCount() {
        return this.coordinatesToBeFarFrom_.size();
    }

    @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionRequestOrBuilder
    public List<Position.IntPosition> getCoordinatesToBeFarFromList() {
        return this.coordinatesToBeFarFrom_;
    }

    public Position.IntPositionOrBuilder getCoordinatesToBeFarFromOrBuilder(int i2) {
        return this.coordinatesToBeFarFrom_.get(i2);
    }

    public List<? extends Position.IntPositionOrBuilder> getCoordinatesToBeFarFromOrBuilderList() {
        return this.coordinatesToBeFarFrom_;
    }

    @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionRequestOrBuilder
    public Polyline getPolylines(int i2) {
        return this.polylines_.get(i2);
    }

    @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionRequestOrBuilder
    public int getPolylinesCount() {
        return this.polylines_.size();
    }

    @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionRequestOrBuilder
    public List<Polyline> getPolylinesList() {
        return this.polylines_;
    }

    public PolylineOrBuilder getPolylinesOrBuilder(int i2) {
        return this.polylines_.get(i2);
    }

    public List<? extends PolylineOrBuilder> getPolylinesOrBuilderList() {
        return this.polylines_;
    }

    public static Builder newBuilder(GenerateMapObjectsPositionRequest generateMapObjectsPositionRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(generateMapObjectsPositionRequest);
    }

    public static GenerateMapObjectsPositionRequest parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (GenerateMapObjectsPositionRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static GenerateMapObjectsPositionRequest parseFrom(v vVar, de deVar) {
        return (GenerateMapObjectsPositionRequest) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static GenerateMapObjectsPositionRequest parseFrom(z zVar) {
        return (GenerateMapObjectsPositionRequest) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static GenerateMapObjectsPositionRequest parseFrom(z zVar, de deVar) {
        return (GenerateMapObjectsPositionRequest) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCoordinatesToBeFarFrom(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        ensureCoordinatesToBeFarFromIsMutable();
        this.coordinatesToBeFarFrom_.add(intPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPolylines(Polyline polyline) {
        Objects.requireNonNull(polyline);
        ensurePolylinesIsMutable();
        this.polylines_.add(polyline);
    }

    public static GenerateMapObjectsPositionRequest parseFrom(InputStream inputStream) {
        return (GenerateMapObjectsPositionRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GenerateMapObjectsPositionRequest parseFrom(InputStream inputStream, de deVar) {
        return (GenerateMapObjectsPositionRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static GenerateMapObjectsPositionRequest parseFrom(ByteBuffer byteBuffer) {
        return (GenerateMapObjectsPositionRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static GenerateMapObjectsPositionRequest parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (GenerateMapObjectsPositionRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<GenerateMapObjectsPositionRequest, Builder> implements GenerateMapObjectsPositionRequestOrBuilder {
        private Builder() {
            super(GenerateMapObjectsPositionRequest.DEFAULT_INSTANCE);
        }

        public Builder addAllCoordinatesToBeFarFrom(Iterable<? extends Position.IntPosition> iterable) {
            copyOnWrite();
            ((GenerateMapObjectsPositionRequest) this.instance).addAllCoordinatesToBeFarFrom(iterable);
            return this;
        }

        public Builder addAllPolylines(Iterable<? extends Polyline> iterable) {
            copyOnWrite();
            ((GenerateMapObjectsPositionRequest) this.instance).addAllPolylines(iterable);
            return this;
        }

        public Builder addCoordinatesToBeFarFrom(int i2, Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((GenerateMapObjectsPositionRequest) this.instance).addCoordinatesToBeFarFrom(i2, builder.build());
            return this;
        }

        public Builder addPolylines(int i2, Polyline.Builder builder) {
            copyOnWrite();
            ((GenerateMapObjectsPositionRequest) this.instance).addPolylines(i2, builder.build());
            return this;
        }

        public Builder clearCoordinatesToBeFarFrom() {
            copyOnWrite();
            ((GenerateMapObjectsPositionRequest) this.instance).clearCoordinatesToBeFarFrom();
            return this;
        }

        public Builder clearPolylines() {
            copyOnWrite();
            ((GenerateMapObjectsPositionRequest) this.instance).clearPolylines();
            return this;
        }

        @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionRequestOrBuilder
        public Position.IntPosition getCoordinatesToBeFarFrom(int i2) {
            return ((GenerateMapObjectsPositionRequest) this.instance).getCoordinatesToBeFarFrom(i2);
        }

        @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionRequestOrBuilder
        public int getCoordinatesToBeFarFromCount() {
            return ((GenerateMapObjectsPositionRequest) this.instance).getCoordinatesToBeFarFromCount();
        }

        @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionRequestOrBuilder
        public List<Position.IntPosition> getCoordinatesToBeFarFromList() {
            return DesugarCollections.unmodifiableList(((GenerateMapObjectsPositionRequest) this.instance).getCoordinatesToBeFarFromList());
        }

        @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionRequestOrBuilder
        public Polyline getPolylines(int i2) {
            return ((GenerateMapObjectsPositionRequest) this.instance).getPolylines(i2);
        }

        @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionRequestOrBuilder
        public int getPolylinesCount() {
            return ((GenerateMapObjectsPositionRequest) this.instance).getPolylinesCount();
        }

        @Override // com.waze.jni.protos.map.GenerateMapObjectsPositionRequestOrBuilder
        public List<Polyline> getPolylinesList() {
            return DesugarCollections.unmodifiableList(((GenerateMapObjectsPositionRequest) this.instance).getPolylinesList());
        }

        public Builder removeCoordinatesToBeFarFrom(int i2) {
            copyOnWrite();
            ((GenerateMapObjectsPositionRequest) this.instance).removeCoordinatesToBeFarFrom(i2);
            return this;
        }

        public Builder removePolylines(int i2) {
            copyOnWrite();
            ((GenerateMapObjectsPositionRequest) this.instance).removePolylines(i2);
            return this;
        }

        public Builder setCoordinatesToBeFarFrom(int i2, Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((GenerateMapObjectsPositionRequest) this.instance).setCoordinatesToBeFarFrom(i2, builder.build());
            return this;
        }

        public Builder setPolylines(int i2, Polyline.Builder builder) {
            copyOnWrite();
            ((GenerateMapObjectsPositionRequest) this.instance).setPolylines(i2, builder.build());
            return this;
        }

        public Builder addCoordinatesToBeFarFrom(int i2, Position.IntPosition intPosition) {
            copyOnWrite();
            ((GenerateMapObjectsPositionRequest) this.instance).addCoordinatesToBeFarFrom(i2, intPosition);
            return this;
        }

        public Builder addPolylines(int i2, Polyline polyline) {
            copyOnWrite();
            ((GenerateMapObjectsPositionRequest) this.instance).addPolylines(i2, polyline);
            return this;
        }

        public Builder setCoordinatesToBeFarFrom(int i2, Position.IntPosition intPosition) {
            copyOnWrite();
            ((GenerateMapObjectsPositionRequest) this.instance).setCoordinatesToBeFarFrom(i2, intPosition);
            return this;
        }

        public Builder setPolylines(int i2, Polyline polyline) {
            copyOnWrite();
            ((GenerateMapObjectsPositionRequest) this.instance).setPolylines(i2, polyline);
            return this;
        }

        public Builder addCoordinatesToBeFarFrom(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((GenerateMapObjectsPositionRequest) this.instance).addCoordinatesToBeFarFrom(builder.build());
            return this;
        }

        public Builder addPolylines(Polyline.Builder builder) {
            copyOnWrite();
            ((GenerateMapObjectsPositionRequest) this.instance).addPolylines(builder.build());
            return this;
        }

        public Builder addCoordinatesToBeFarFrom(Position.IntPosition intPosition) {
            copyOnWrite();
            ((GenerateMapObjectsPositionRequest) this.instance).addCoordinatesToBeFarFrom(intPosition);
            return this;
        }

        public Builder addPolylines(Polyline polyline) {
            copyOnWrite();
            ((GenerateMapObjectsPositionRequest) this.instance).addPolylines(polyline);
            return this;
        }
    }

    public static GenerateMapObjectsPositionRequest parseFrom(byte[] bArr) {
        return (GenerateMapObjectsPositionRequest) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GenerateMapObjectsPositionRequest parseFrom(byte[] bArr, de deVar) {
        return (GenerateMapObjectsPositionRequest) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
