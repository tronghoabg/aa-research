package com.waze.jni.protos.navigate;

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
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PolylineGeometry extends du<PolylineGeometry, Builder> implements PolylineGeometryOrBuilder {
    private static final PolylineGeometry DEFAULT_INSTANCE;
    private static volatile fo<PolylineGeometry> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 1;
    private eo<Position.IntPosition> position_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.PolylineGeometry$1, reason: invalid class name */
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
        PolylineGeometry polylineGeometry = new PolylineGeometry();
        DEFAULT_INSTANCE = polylineGeometry;
        du.registerDefaultInstance(PolylineGeometry.class, polylineGeometry);
    }

    private PolylineGeometry() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPosition(Iterable<? extends Position.IntPosition> iterable) {
        ensurePositionIsMutable();
        c.addAll(iterable, this.position_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPosition(int i2, Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        ensurePositionIsMutable();
        this.position_.add(i2, intPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = emptyProtobufList();
    }

    private void ensurePositionIsMutable() {
        eo<Position.IntPosition> eoVar = this.position_;
        if (eoVar.c()) {
            return;
        }
        this.position_ = du.mutableCopy(eoVar);
    }

    public static PolylineGeometry getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PolylineGeometry parseDelimitedFrom(InputStream inputStream) {
        return (PolylineGeometry) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PolylineGeometry parseFrom(v vVar) {
        return (PolylineGeometry) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<PolylineGeometry> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePosition(int i2) {
        ensurePositionIsMutable();
        this.position_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(int i2, Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        ensurePositionIsMutable();
        this.position_.set(i2, intPosition);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"position_", Position.IntPosition.class});
        }
        if (iOrdinal == 3) {
            return new PolylineGeometry();
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
        fo<PolylineGeometry> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (PolylineGeometry.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.PolylineGeometryOrBuilder
    public Position.IntPosition getPosition(int i2) {
        return this.position_.get(i2);
    }

    @Override // com.waze.jni.protos.navigate.PolylineGeometryOrBuilder
    public int getPositionCount() {
        return this.position_.size();
    }

    @Override // com.waze.jni.protos.navigate.PolylineGeometryOrBuilder
    public List<Position.IntPosition> getPositionList() {
        return this.position_;
    }

    public Position.IntPositionOrBuilder getPositionOrBuilder(int i2) {
        return this.position_.get(i2);
    }

    public List<? extends Position.IntPositionOrBuilder> getPositionOrBuilderList() {
        return this.position_;
    }

    public static Builder newBuilder(PolylineGeometry polylineGeometry) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(polylineGeometry);
    }

    public static PolylineGeometry parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (PolylineGeometry) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static PolylineGeometry parseFrom(v vVar, de deVar) {
        return (PolylineGeometry) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static PolylineGeometry parseFrom(z zVar) {
        return (PolylineGeometry) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static PolylineGeometry parseFrom(z zVar, de deVar) {
        return (PolylineGeometry) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        ensurePositionIsMutable();
        this.position_.add(intPosition);
    }

    public static PolylineGeometry parseFrom(InputStream inputStream) {
        return (PolylineGeometry) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PolylineGeometry parseFrom(InputStream inputStream, de deVar) {
        return (PolylineGeometry) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static PolylineGeometry parseFrom(ByteBuffer byteBuffer) {
        return (PolylineGeometry) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PolylineGeometry parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (PolylineGeometry) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<PolylineGeometry, Builder> implements PolylineGeometryOrBuilder {
        private Builder() {
            super(PolylineGeometry.DEFAULT_INSTANCE);
        }

        public Builder addAllPosition(Iterable<? extends Position.IntPosition> iterable) {
            copyOnWrite();
            ((PolylineGeometry) this.instance).addAllPosition(iterable);
            return this;
        }

        public Builder addPosition(int i2, Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((PolylineGeometry) this.instance).addPosition(i2, builder.build());
            return this;
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((PolylineGeometry) this.instance).clearPosition();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.PolylineGeometryOrBuilder
        public Position.IntPosition getPosition(int i2) {
            return ((PolylineGeometry) this.instance).getPosition(i2);
        }

        @Override // com.waze.jni.protos.navigate.PolylineGeometryOrBuilder
        public int getPositionCount() {
            return ((PolylineGeometry) this.instance).getPositionCount();
        }

        @Override // com.waze.jni.protos.navigate.PolylineGeometryOrBuilder
        public List<Position.IntPosition> getPositionList() {
            return DesugarCollections.unmodifiableList(((PolylineGeometry) this.instance).getPositionList());
        }

        public Builder removePosition(int i2) {
            copyOnWrite();
            ((PolylineGeometry) this.instance).removePosition(i2);
            return this;
        }

        public Builder setPosition(int i2, Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((PolylineGeometry) this.instance).setPosition(i2, builder.build());
            return this;
        }

        public Builder addPosition(int i2, Position.IntPosition intPosition) {
            copyOnWrite();
            ((PolylineGeometry) this.instance).addPosition(i2, intPosition);
            return this;
        }

        public Builder setPosition(int i2, Position.IntPosition intPosition) {
            copyOnWrite();
            ((PolylineGeometry) this.instance).setPosition(i2, intPosition);
            return this;
        }

        public Builder addPosition(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((PolylineGeometry) this.instance).addPosition(builder.build());
            return this;
        }

        public Builder addPosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((PolylineGeometry) this.instance).addPosition(intPosition);
            return this;
        }
    }

    public static PolylineGeometry parseFrom(byte[] bArr) {
        return (PolylineGeometry) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PolylineGeometry parseFrom(byte[] bArr, de deVar) {
        return (PolylineGeometry) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
