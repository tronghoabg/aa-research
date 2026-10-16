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
import com.waze.jni.protos.navigate.NearbyStationProto;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NearbyStationsResultProto extends du<NearbyStationsResultProto, Builder> implements NearbyStationsResultProtoOrBuilder {
    private static final NearbyStationsResultProto DEFAULT_INSTANCE;
    private static volatile fo<NearbyStationsResultProto> PARSER = null;
    public static final int STATIONS_FIELD_NUMBER = 1;
    private eo<NearbyStationProto> stations_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.NearbyStationsResultProto$1, reason: invalid class name */
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
        NearbyStationsResultProto nearbyStationsResultProto = new NearbyStationsResultProto();
        DEFAULT_INSTANCE = nearbyStationsResultProto;
        du.registerDefaultInstance(NearbyStationsResultProto.class, nearbyStationsResultProto);
    }

    private NearbyStationsResultProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStations(Iterable<? extends NearbyStationProto> iterable) {
        ensureStationsIsMutable();
        c.addAll(iterable, this.stations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStations(int i2, NearbyStationProto nearbyStationProto) {
        Objects.requireNonNull(nearbyStationProto);
        ensureStationsIsMutable();
        this.stations_.add(i2, nearbyStationProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStations() {
        this.stations_ = emptyProtobufList();
    }

    private void ensureStationsIsMutable() {
        eo<NearbyStationProto> eoVar = this.stations_;
        if (eoVar.c()) {
            return;
        }
        this.stations_ = du.mutableCopy(eoVar);
    }

    public static NearbyStationsResultProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NearbyStationsResultProto parseDelimitedFrom(InputStream inputStream) {
        return (NearbyStationsResultProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NearbyStationsResultProto parseFrom(v vVar) {
        return (NearbyStationsResultProto) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NearbyStationsResultProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStations(int i2) {
        ensureStationsIsMutable();
        this.stations_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStations(int i2, NearbyStationProto nearbyStationProto) {
        Objects.requireNonNull(nearbyStationProto);
        ensureStationsIsMutable();
        this.stations_.set(i2, nearbyStationProto);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"stations_", NearbyStationProto.class});
        }
        if (iOrdinal == 3) {
            return new NearbyStationsResultProto();
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
        fo<NearbyStationsResultProto> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NearbyStationsResultProto.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.NearbyStationsResultProtoOrBuilder
    public NearbyStationProto getStations(int i2) {
        return this.stations_.get(i2);
    }

    @Override // com.waze.jni.protos.navigate.NearbyStationsResultProtoOrBuilder
    public int getStationsCount() {
        return this.stations_.size();
    }

    @Override // com.waze.jni.protos.navigate.NearbyStationsResultProtoOrBuilder
    public List<NearbyStationProto> getStationsList() {
        return this.stations_;
    }

    public NearbyStationProtoOrBuilder getStationsOrBuilder(int i2) {
        return this.stations_.get(i2);
    }

    public List<? extends NearbyStationProtoOrBuilder> getStationsOrBuilderList() {
        return this.stations_;
    }

    public static Builder newBuilder(NearbyStationsResultProto nearbyStationsResultProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nearbyStationsResultProto);
    }

    public static NearbyStationsResultProto parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NearbyStationsResultProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NearbyStationsResultProto parseFrom(v vVar, de deVar) {
        return (NearbyStationsResultProto) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NearbyStationsResultProto parseFrom(z zVar) {
        return (NearbyStationsResultProto) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NearbyStationsResultProto parseFrom(z zVar, de deVar) {
        return (NearbyStationsResultProto) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStations(NearbyStationProto nearbyStationProto) {
        Objects.requireNonNull(nearbyStationProto);
        ensureStationsIsMutable();
        this.stations_.add(nearbyStationProto);
    }

    public static NearbyStationsResultProto parseFrom(InputStream inputStream) {
        return (NearbyStationsResultProto) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NearbyStationsResultProto parseFrom(InputStream inputStream, de deVar) {
        return (NearbyStationsResultProto) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NearbyStationsResultProto parseFrom(ByteBuffer byteBuffer) {
        return (NearbyStationsResultProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NearbyStationsResultProto parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NearbyStationsResultProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NearbyStationsResultProto, Builder> implements NearbyStationsResultProtoOrBuilder {
        private Builder() {
            super(NearbyStationsResultProto.DEFAULT_INSTANCE);
        }

        public Builder addAllStations(Iterable<? extends NearbyStationProto> iterable) {
            copyOnWrite();
            ((NearbyStationsResultProto) this.instance).addAllStations(iterable);
            return this;
        }

        public Builder addStations(int i2, NearbyStationProto.Builder builder) {
            copyOnWrite();
            ((NearbyStationsResultProto) this.instance).addStations(i2, builder.build());
            return this;
        }

        public Builder clearStations() {
            copyOnWrite();
            ((NearbyStationsResultProto) this.instance).clearStations();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.NearbyStationsResultProtoOrBuilder
        public NearbyStationProto getStations(int i2) {
            return ((NearbyStationsResultProto) this.instance).getStations(i2);
        }

        @Override // com.waze.jni.protos.navigate.NearbyStationsResultProtoOrBuilder
        public int getStationsCount() {
            return ((NearbyStationsResultProto) this.instance).getStationsCount();
        }

        @Override // com.waze.jni.protos.navigate.NearbyStationsResultProtoOrBuilder
        public List<NearbyStationProto> getStationsList() {
            return DesugarCollections.unmodifiableList(((NearbyStationsResultProto) this.instance).getStationsList());
        }

        public Builder removeStations(int i2) {
            copyOnWrite();
            ((NearbyStationsResultProto) this.instance).removeStations(i2);
            return this;
        }

        public Builder setStations(int i2, NearbyStationProto.Builder builder) {
            copyOnWrite();
            ((NearbyStationsResultProto) this.instance).setStations(i2, builder.build());
            return this;
        }

        public Builder addStations(int i2, NearbyStationProto nearbyStationProto) {
            copyOnWrite();
            ((NearbyStationsResultProto) this.instance).addStations(i2, nearbyStationProto);
            return this;
        }

        public Builder setStations(int i2, NearbyStationProto nearbyStationProto) {
            copyOnWrite();
            ((NearbyStationsResultProto) this.instance).setStations(i2, nearbyStationProto);
            return this;
        }

        public Builder addStations(NearbyStationProto.Builder builder) {
            copyOnWrite();
            ((NearbyStationsResultProto) this.instance).addStations(builder.build());
            return this;
        }

        public Builder addStations(NearbyStationProto nearbyStationProto) {
            copyOnWrite();
            ((NearbyStationsResultProto) this.instance).addStations(nearbyStationProto);
            return this;
        }
    }

    public static NearbyStationsResultProto parseFrom(byte[] bArr) {
        return (NearbyStationsResultProto) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NearbyStationsResultProto parseFrom(byte[] bArr, de deVar) {
        return (NearbyStationsResultProto) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
