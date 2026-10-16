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
import com.waze.jni.protos.map.TouchPoint;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TouchData extends du<TouchData, Builder> implements TouchDataOrBuilder {
    private static final TouchData DEFAULT_INSTANCE;
    private static volatile fo<TouchData> PARSER = null;
    public static final int POINTS_FIELD_NUMBER = 1;
    public static final int TIMESTAMPMS_FIELD_NUMBER = 2;
    private eo<TouchPoint> points_ = emptyProtobufList();
    private long timestampMs_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.TouchData$1, reason: invalid class name */
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
        TouchData touchData = new TouchData();
        DEFAULT_INSTANCE = touchData;
        du.registerDefaultInstance(TouchData.class, touchData);
    }

    private TouchData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPoints(Iterable<? extends TouchPoint> iterable) {
        ensurePointsIsMutable();
        c.addAll(iterable, this.points_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPoints(int i2, TouchPoint touchPoint) {
        Objects.requireNonNull(touchPoint);
        ensurePointsIsMutable();
        this.points_.add(i2, touchPoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoints() {
        this.points_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestampMs() {
        this.timestampMs_ = 0L;
    }

    private void ensurePointsIsMutable() {
        eo<TouchPoint> eoVar = this.points_;
        if (eoVar.c()) {
            return;
        }
        this.points_ = du.mutableCopy(eoVar);
    }

    public static TouchData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TouchData parseDelimitedFrom(InputStream inputStream) {
        return (TouchData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TouchData parseFrom(v vVar) {
        return (TouchData) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<TouchData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePoints(int i2) {
        ensurePointsIsMutable();
        this.points_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoints(int i2, TouchPoint touchPoint) {
        Objects.requireNonNull(touchPoint);
        ensurePointsIsMutable();
        this.points_.set(i2, touchPoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestampMs(long j2) {
        this.timestampMs_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"points_", TouchPoint.class, "timestampMs_"});
        }
        if (iOrdinal == 3) {
            return new TouchData();
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
        fo<TouchData> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (TouchData.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.TouchDataOrBuilder
    public TouchPoint getPoints(int i2) {
        return this.points_.get(i2);
    }

    @Override // com.waze.jni.protos.map.TouchDataOrBuilder
    public int getPointsCount() {
        return this.points_.size();
    }

    @Override // com.waze.jni.protos.map.TouchDataOrBuilder
    public List<TouchPoint> getPointsList() {
        return this.points_;
    }

    public TouchPointOrBuilder getPointsOrBuilder(int i2) {
        return this.points_.get(i2);
    }

    public List<? extends TouchPointOrBuilder> getPointsOrBuilderList() {
        return this.points_;
    }

    @Override // com.waze.jni.protos.map.TouchDataOrBuilder
    public long getTimestampMs() {
        return this.timestampMs_;
    }

    public static Builder newBuilder(TouchData touchData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(touchData);
    }

    public static TouchData parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (TouchData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static TouchData parseFrom(v vVar, de deVar) {
        return (TouchData) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static TouchData parseFrom(z zVar) {
        return (TouchData) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static TouchData parseFrom(z zVar, de deVar) {
        return (TouchData) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPoints(TouchPoint touchPoint) {
        Objects.requireNonNull(touchPoint);
        ensurePointsIsMutable();
        this.points_.add(touchPoint);
    }

    public static TouchData parseFrom(InputStream inputStream) {
        return (TouchData) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TouchData parseFrom(InputStream inputStream, de deVar) {
        return (TouchData) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static TouchData parseFrom(ByteBuffer byteBuffer) {
        return (TouchData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TouchData parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (TouchData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<TouchData, Builder> implements TouchDataOrBuilder {
        private Builder() {
            super(TouchData.DEFAULT_INSTANCE);
        }

        public Builder addAllPoints(Iterable<? extends TouchPoint> iterable) {
            copyOnWrite();
            ((TouchData) this.instance).addAllPoints(iterable);
            return this;
        }

        public Builder addPoints(int i2, TouchPoint.Builder builder) {
            copyOnWrite();
            ((TouchData) this.instance).addPoints(i2, builder.build());
            return this;
        }

        public Builder clearPoints() {
            copyOnWrite();
            ((TouchData) this.instance).clearPoints();
            return this;
        }

        public Builder clearTimestampMs() {
            copyOnWrite();
            ((TouchData) this.instance).clearTimestampMs();
            return this;
        }

        @Override // com.waze.jni.protos.map.TouchDataOrBuilder
        public TouchPoint getPoints(int i2) {
            return ((TouchData) this.instance).getPoints(i2);
        }

        @Override // com.waze.jni.protos.map.TouchDataOrBuilder
        public int getPointsCount() {
            return ((TouchData) this.instance).getPointsCount();
        }

        @Override // com.waze.jni.protos.map.TouchDataOrBuilder
        public List<TouchPoint> getPointsList() {
            return DesugarCollections.unmodifiableList(((TouchData) this.instance).getPointsList());
        }

        @Override // com.waze.jni.protos.map.TouchDataOrBuilder
        public long getTimestampMs() {
            return ((TouchData) this.instance).getTimestampMs();
        }

        public Builder removePoints(int i2) {
            copyOnWrite();
            ((TouchData) this.instance).removePoints(i2);
            return this;
        }

        public Builder setPoints(int i2, TouchPoint.Builder builder) {
            copyOnWrite();
            ((TouchData) this.instance).setPoints(i2, builder.build());
            return this;
        }

        public Builder setTimestampMs(long j2) {
            copyOnWrite();
            ((TouchData) this.instance).setTimestampMs(j2);
            return this;
        }

        public Builder addPoints(int i2, TouchPoint touchPoint) {
            copyOnWrite();
            ((TouchData) this.instance).addPoints(i2, touchPoint);
            return this;
        }

        public Builder setPoints(int i2, TouchPoint touchPoint) {
            copyOnWrite();
            ((TouchData) this.instance).setPoints(i2, touchPoint);
            return this;
        }

        public Builder addPoints(TouchPoint.Builder builder) {
            copyOnWrite();
            ((TouchData) this.instance).addPoints(builder.build());
            return this;
        }

        public Builder addPoints(TouchPoint touchPoint) {
            copyOnWrite();
            ((TouchData) this.instance).addPoints(touchPoint);
            return this;
        }
    }

    public static TouchData parseFrom(byte[] bArr) {
        return (TouchData) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TouchData parseFrom(byte[] bArr, de deVar) {
        return (TouchData) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
