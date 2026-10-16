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
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class Polyline extends du<Polyline, Builder> implements PolylineOrBuilder {
    private static final Polyline DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile fo<Polyline> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 3;
    private int id_;
    private eo<Position.IntPosition> position_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.Polyline$1, reason: invalid class name */
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
        Polyline polyline = new Polyline();
        DEFAULT_INSTANCE = polyline;
        du.registerDefaultInstance(Polyline.class, polyline);
    }

    private Polyline() {
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
    public void clearId() {
        this.id_ = 0;
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

    public static Polyline getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Polyline parseDelimitedFrom(InputStream inputStream) {
        return (Polyline) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Polyline parseFrom(v vVar) {
        return (Polyline) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<Polyline> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePosition(int i2) {
        ensurePositionIsMutable();
        this.position_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i2) {
        this.id_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u0004\u0003\u001b", new Object[]{"id_", "position_", Position.IntPosition.class});
        }
        if (iOrdinal == 3) {
            return new Polyline();
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
        fo<Polyline> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Polyline.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.PolylineOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.waze.jni.protos.map.PolylineOrBuilder
    public Position.IntPosition getPosition(int i2) {
        return this.position_.get(i2);
    }

    @Override // com.waze.jni.protos.map.PolylineOrBuilder
    public int getPositionCount() {
        return this.position_.size();
    }

    @Override // com.waze.jni.protos.map.PolylineOrBuilder
    public List<Position.IntPosition> getPositionList() {
        return this.position_;
    }

    public Position.IntPositionOrBuilder getPositionOrBuilder(int i2) {
        return this.position_.get(i2);
    }

    public List<? extends Position.IntPositionOrBuilder> getPositionOrBuilderList() {
        return this.position_;
    }

    public static Builder newBuilder(Polyline polyline) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(polyline);
    }

    public static Polyline parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (Polyline) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Polyline parseFrom(v vVar, de deVar) {
        return (Polyline) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Polyline parseFrom(z zVar) {
        return (Polyline) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Polyline parseFrom(z zVar, de deVar) {
        return (Polyline) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        ensurePositionIsMutable();
        this.position_.add(intPosition);
    }

    public static Polyline parseFrom(InputStream inputStream) {
        return (Polyline) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Polyline parseFrom(InputStream inputStream, de deVar) {
        return (Polyline) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Polyline parseFrom(ByteBuffer byteBuffer) {
        return (Polyline) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Polyline parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (Polyline) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<Polyline, Builder> implements PolylineOrBuilder {
        private Builder() {
            super(Polyline.DEFAULT_INSTANCE);
        }

        public Builder addAllPosition(Iterable<? extends Position.IntPosition> iterable) {
            copyOnWrite();
            ((Polyline) this.instance).addAllPosition(iterable);
            return this;
        }

        public Builder addPosition(int i2, Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((Polyline) this.instance).addPosition(i2, builder.build());
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((Polyline) this.instance).clearId();
            return this;
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((Polyline) this.instance).clearPosition();
            return this;
        }

        @Override // com.waze.jni.protos.map.PolylineOrBuilder
        public int getId() {
            return ((Polyline) this.instance).getId();
        }

        @Override // com.waze.jni.protos.map.PolylineOrBuilder
        public Position.IntPosition getPosition(int i2) {
            return ((Polyline) this.instance).getPosition(i2);
        }

        @Override // com.waze.jni.protos.map.PolylineOrBuilder
        public int getPositionCount() {
            return ((Polyline) this.instance).getPositionCount();
        }

        @Override // com.waze.jni.protos.map.PolylineOrBuilder
        public List<Position.IntPosition> getPositionList() {
            return DesugarCollections.unmodifiableList(((Polyline) this.instance).getPositionList());
        }

        public Builder removePosition(int i2) {
            copyOnWrite();
            ((Polyline) this.instance).removePosition(i2);
            return this;
        }

        public Builder setId(int i2) {
            copyOnWrite();
            ((Polyline) this.instance).setId(i2);
            return this;
        }

        public Builder setPosition(int i2, Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((Polyline) this.instance).setPosition(i2, builder.build());
            return this;
        }

        public Builder addPosition(int i2, Position.IntPosition intPosition) {
            copyOnWrite();
            ((Polyline) this.instance).addPosition(i2, intPosition);
            return this;
        }

        public Builder setPosition(int i2, Position.IntPosition intPosition) {
            copyOnWrite();
            ((Polyline) this.instance).setPosition(i2, intPosition);
            return this;
        }

        public Builder addPosition(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((Polyline) this.instance).addPosition(builder.build());
            return this;
        }

        public Builder addPosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((Polyline) this.instance).addPosition(intPosition);
            return this;
        }
    }

    public static Polyline parseFrom(byte[] bArr) {
        return (Polyline) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Polyline parseFrom(byte[] bArr, de deVar) {
        return (Polyline) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
