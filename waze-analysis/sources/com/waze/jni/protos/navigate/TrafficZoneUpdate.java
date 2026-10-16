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
import com.waze.jni.protos.navigate.TrafficJamSection;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TrafficZoneUpdate extends du<TrafficZoneUpdate, Builder> implements TrafficZoneUpdateOrBuilder {
    private static final TrafficZoneUpdate DEFAULT_INSTANCE;
    public static final int JAMS_FIELD_NUMBER = 3;
    private static volatile fo<TrafficZoneUpdate> PARSER = null;
    public static final int PERCENT_IN_TRAFFIC_FIELD_NUMBER = 1;
    public static final int TOTAL_TIME_SEC_FIELD_NUMBER = 2;
    private int bitField0_;
    private eo<TrafficJamSection> jams_ = emptyProtobufList();
    private int percentInTraffic_;
    private int totalTimeSec_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.TrafficZoneUpdate$1, reason: invalid class name */
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
        TrafficZoneUpdate trafficZoneUpdate = new TrafficZoneUpdate();
        DEFAULT_INSTANCE = trafficZoneUpdate;
        du.registerDefaultInstance(TrafficZoneUpdate.class, trafficZoneUpdate);
    }

    private TrafficZoneUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllJams(Iterable<? extends TrafficJamSection> iterable) {
        ensureJamsIsMutable();
        c.addAll(iterable, this.jams_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addJams(int i2, TrafficJamSection trafficJamSection) {
        Objects.requireNonNull(trafficJamSection);
        ensureJamsIsMutable();
        this.jams_.add(i2, trafficJamSection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJams() {
        this.jams_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPercentInTraffic() {
        this.bitField0_ &= -2;
        this.percentInTraffic_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalTimeSec() {
        this.bitField0_ &= -3;
        this.totalTimeSec_ = 0;
    }

    private void ensureJamsIsMutable() {
        eo<TrafficJamSection> eoVar = this.jams_;
        if (eoVar.c()) {
            return;
        }
        this.jams_ = du.mutableCopy(eoVar);
    }

    public static TrafficZoneUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TrafficZoneUpdate parseDelimitedFrom(InputStream inputStream) {
        return (TrafficZoneUpdate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrafficZoneUpdate parseFrom(v vVar) {
        return (TrafficZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<TrafficZoneUpdate> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeJams(int i2) {
        ensureJamsIsMutable();
        this.jams_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJams(int i2, TrafficJamSection trafficJamSection) {
        Objects.requireNonNull(trafficJamSection);
        ensureJamsIsMutable();
        this.jams_.set(i2, trafficJamSection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPercentInTraffic(int i2) {
        this.bitField0_ |= 1;
        this.percentInTraffic_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalTimeSec(int i2) {
        this.bitField0_ |= 2;
        this.totalTimeSec_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u001b", new Object[]{"bitField0_", "percentInTraffic_", "totalTimeSec_", "jams_", TrafficJamSection.class});
        }
        if (iOrdinal == 3) {
            return new TrafficZoneUpdate();
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
        fo<TrafficZoneUpdate> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (TrafficZoneUpdate.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.TrafficZoneUpdateOrBuilder
    public TrafficJamSection getJams(int i2) {
        return this.jams_.get(i2);
    }

    @Override // com.waze.jni.protos.navigate.TrafficZoneUpdateOrBuilder
    public int getJamsCount() {
        return this.jams_.size();
    }

    @Override // com.waze.jni.protos.navigate.TrafficZoneUpdateOrBuilder
    public List<TrafficJamSection> getJamsList() {
        return this.jams_;
    }

    public TrafficJamSectionOrBuilder getJamsOrBuilder(int i2) {
        return this.jams_.get(i2);
    }

    public List<? extends TrafficJamSectionOrBuilder> getJamsOrBuilderList() {
        return this.jams_;
    }

    @Override // com.waze.jni.protos.navigate.TrafficZoneUpdateOrBuilder
    public int getPercentInTraffic() {
        return this.percentInTraffic_;
    }

    @Override // com.waze.jni.protos.navigate.TrafficZoneUpdateOrBuilder
    public int getTotalTimeSec() {
        return this.totalTimeSec_;
    }

    @Override // com.waze.jni.protos.navigate.TrafficZoneUpdateOrBuilder
    public boolean hasPercentInTraffic() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.navigate.TrafficZoneUpdateOrBuilder
    public boolean hasTotalTimeSec() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(TrafficZoneUpdate trafficZoneUpdate) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(trafficZoneUpdate);
    }

    public static TrafficZoneUpdate parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (TrafficZoneUpdate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static TrafficZoneUpdate parseFrom(v vVar, de deVar) {
        return (TrafficZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static TrafficZoneUpdate parseFrom(z zVar) {
        return (TrafficZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static TrafficZoneUpdate parseFrom(z zVar, de deVar) {
        return (TrafficZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addJams(TrafficJamSection trafficJamSection) {
        Objects.requireNonNull(trafficJamSection);
        ensureJamsIsMutable();
        this.jams_.add(trafficJamSection);
    }

    public static TrafficZoneUpdate parseFrom(InputStream inputStream) {
        return (TrafficZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrafficZoneUpdate parseFrom(InputStream inputStream, de deVar) {
        return (TrafficZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static TrafficZoneUpdate parseFrom(ByteBuffer byteBuffer) {
        return (TrafficZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TrafficZoneUpdate parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (TrafficZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<TrafficZoneUpdate, Builder> implements TrafficZoneUpdateOrBuilder {
        private Builder() {
            super(TrafficZoneUpdate.DEFAULT_INSTANCE);
        }

        public Builder addAllJams(Iterable<? extends TrafficJamSection> iterable) {
            copyOnWrite();
            ((TrafficZoneUpdate) this.instance).addAllJams(iterable);
            return this;
        }

        public Builder addJams(int i2, TrafficJamSection.Builder builder) {
            copyOnWrite();
            ((TrafficZoneUpdate) this.instance).addJams(i2, builder.build());
            return this;
        }

        public Builder clearJams() {
            copyOnWrite();
            ((TrafficZoneUpdate) this.instance).clearJams();
            return this;
        }

        public Builder clearPercentInTraffic() {
            copyOnWrite();
            ((TrafficZoneUpdate) this.instance).clearPercentInTraffic();
            return this;
        }

        public Builder clearTotalTimeSec() {
            copyOnWrite();
            ((TrafficZoneUpdate) this.instance).clearTotalTimeSec();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.TrafficZoneUpdateOrBuilder
        public TrafficJamSection getJams(int i2) {
            return ((TrafficZoneUpdate) this.instance).getJams(i2);
        }

        @Override // com.waze.jni.protos.navigate.TrafficZoneUpdateOrBuilder
        public int getJamsCount() {
            return ((TrafficZoneUpdate) this.instance).getJamsCount();
        }

        @Override // com.waze.jni.protos.navigate.TrafficZoneUpdateOrBuilder
        public List<TrafficJamSection> getJamsList() {
            return DesugarCollections.unmodifiableList(((TrafficZoneUpdate) this.instance).getJamsList());
        }

        @Override // com.waze.jni.protos.navigate.TrafficZoneUpdateOrBuilder
        public int getPercentInTraffic() {
            return ((TrafficZoneUpdate) this.instance).getPercentInTraffic();
        }

        @Override // com.waze.jni.protos.navigate.TrafficZoneUpdateOrBuilder
        public int getTotalTimeSec() {
            return ((TrafficZoneUpdate) this.instance).getTotalTimeSec();
        }

        @Override // com.waze.jni.protos.navigate.TrafficZoneUpdateOrBuilder
        public boolean hasPercentInTraffic() {
            return ((TrafficZoneUpdate) this.instance).hasPercentInTraffic();
        }

        @Override // com.waze.jni.protos.navigate.TrafficZoneUpdateOrBuilder
        public boolean hasTotalTimeSec() {
            return ((TrafficZoneUpdate) this.instance).hasTotalTimeSec();
        }

        public Builder removeJams(int i2) {
            copyOnWrite();
            ((TrafficZoneUpdate) this.instance).removeJams(i2);
            return this;
        }

        public Builder setJams(int i2, TrafficJamSection.Builder builder) {
            copyOnWrite();
            ((TrafficZoneUpdate) this.instance).setJams(i2, builder.build());
            return this;
        }

        public Builder setPercentInTraffic(int i2) {
            copyOnWrite();
            ((TrafficZoneUpdate) this.instance).setPercentInTraffic(i2);
            return this;
        }

        public Builder setTotalTimeSec(int i2) {
            copyOnWrite();
            ((TrafficZoneUpdate) this.instance).setTotalTimeSec(i2);
            return this;
        }

        public Builder addJams(int i2, TrafficJamSection trafficJamSection) {
            copyOnWrite();
            ((TrafficZoneUpdate) this.instance).addJams(i2, trafficJamSection);
            return this;
        }

        public Builder setJams(int i2, TrafficJamSection trafficJamSection) {
            copyOnWrite();
            ((TrafficZoneUpdate) this.instance).setJams(i2, trafficJamSection);
            return this;
        }

        public Builder addJams(TrafficJamSection.Builder builder) {
            copyOnWrite();
            ((TrafficZoneUpdate) this.instance).addJams(builder.build());
            return this;
        }

        public Builder addJams(TrafficJamSection trafficJamSection) {
            copyOnWrite();
            ((TrafficZoneUpdate) this.instance).addJams(trafficJamSection);
            return this;
        }
    }

    public static TrafficZoneUpdate parseFrom(byte[] bArr) {
        return (TrafficZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrafficZoneUpdate parseFrom(byte[] bArr, de deVar) {
        return (TrafficZoneUpdate) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
