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
import com.waze.jni.protos.navigate.NavigationLaneAngle;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationLane extends du<NavigationLane, Builder> implements NavigationLaneOrBuilder {
    public static final int ANGLE_FIELD_NUMBER = 2;
    private static final NavigationLane DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    private static volatile fo<NavigationLane> PARSER;
    private eo<NavigationLaneAngle> angle_ = emptyProtobufList();
    private int index_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.NavigationLane$1, reason: invalid class name */
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
        NavigationLane navigationLane = new NavigationLane();
        DEFAULT_INSTANCE = navigationLane;
        du.registerDefaultInstance(NavigationLane.class, navigationLane);
    }

    private NavigationLane() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAngle(Iterable<? extends NavigationLaneAngle> iterable) {
        ensureAngleIsMutable();
        c.addAll(iterable, this.angle_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAngle(int i2, NavigationLaneAngle navigationLaneAngle) {
        Objects.requireNonNull(navigationLaneAngle);
        ensureAngleIsMutable();
        this.angle_.add(i2, navigationLaneAngle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAngle() {
        this.angle_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.index_ = 0;
    }

    private void ensureAngleIsMutable() {
        eo<NavigationLaneAngle> eoVar = this.angle_;
        if (eoVar.c()) {
            return;
        }
        this.angle_ = du.mutableCopy(eoVar);
    }

    public static NavigationLane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NavigationLane parseDelimitedFrom(InputStream inputStream) {
        return (NavigationLane) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationLane parseFrom(v vVar) {
        return (NavigationLane) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NavigationLane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAngle(int i2) {
        ensureAngleIsMutable();
        this.angle_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAngle(int i2, NavigationLaneAngle navigationLaneAngle) {
        Objects.requireNonNull(navigationLaneAngle);
        ensureAngleIsMutable();
        this.angle_.set(i2, navigationLaneAngle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i2) {
        this.index_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"index_", "angle_", NavigationLaneAngle.class});
        }
        if (iOrdinal == 3) {
            return new NavigationLane();
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
        fo<NavigationLane> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NavigationLane.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.NavigationLaneOrBuilder
    public NavigationLaneAngle getAngle(int i2) {
        return this.angle_.get(i2);
    }

    @Override // com.waze.jni.protos.navigate.NavigationLaneOrBuilder
    public int getAngleCount() {
        return this.angle_.size();
    }

    @Override // com.waze.jni.protos.navigate.NavigationLaneOrBuilder
    public List<NavigationLaneAngle> getAngleList() {
        return this.angle_;
    }

    public NavigationLaneAngleOrBuilder getAngleOrBuilder(int i2) {
        return this.angle_.get(i2);
    }

    public List<? extends NavigationLaneAngleOrBuilder> getAngleOrBuilderList() {
        return this.angle_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationLaneOrBuilder
    public int getIndex() {
        return this.index_;
    }

    public static Builder newBuilder(NavigationLane navigationLane) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(navigationLane);
    }

    public static NavigationLane parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NavigationLane) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationLane parseFrom(v vVar, de deVar) {
        return (NavigationLane) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NavigationLane parseFrom(z zVar) {
        return (NavigationLane) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NavigationLane parseFrom(z zVar, de deVar) {
        return (NavigationLane) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAngle(NavigationLaneAngle navigationLaneAngle) {
        Objects.requireNonNull(navigationLaneAngle);
        ensureAngleIsMutable();
        this.angle_.add(navigationLaneAngle);
    }

    public static NavigationLane parseFrom(InputStream inputStream) {
        return (NavigationLane) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationLane parseFrom(InputStream inputStream, de deVar) {
        return (NavigationLane) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationLane parseFrom(ByteBuffer byteBuffer) {
        return (NavigationLane) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NavigationLane parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NavigationLane) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NavigationLane, Builder> implements NavigationLaneOrBuilder {
        private Builder() {
            super(NavigationLane.DEFAULT_INSTANCE);
        }

        public Builder addAllAngle(Iterable<? extends NavigationLaneAngle> iterable) {
            copyOnWrite();
            ((NavigationLane) this.instance).addAllAngle(iterable);
            return this;
        }

        public Builder addAngle(int i2, NavigationLaneAngle.Builder builder) {
            copyOnWrite();
            ((NavigationLane) this.instance).addAngle(i2, builder.build());
            return this;
        }

        public Builder clearAngle() {
            copyOnWrite();
            ((NavigationLane) this.instance).clearAngle();
            return this;
        }

        public Builder clearIndex() {
            copyOnWrite();
            ((NavigationLane) this.instance).clearIndex();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.NavigationLaneOrBuilder
        public NavigationLaneAngle getAngle(int i2) {
            return ((NavigationLane) this.instance).getAngle(i2);
        }

        @Override // com.waze.jni.protos.navigate.NavigationLaneOrBuilder
        public int getAngleCount() {
            return ((NavigationLane) this.instance).getAngleCount();
        }

        @Override // com.waze.jni.protos.navigate.NavigationLaneOrBuilder
        public List<NavigationLaneAngle> getAngleList() {
            return DesugarCollections.unmodifiableList(((NavigationLane) this.instance).getAngleList());
        }

        @Override // com.waze.jni.protos.navigate.NavigationLaneOrBuilder
        public int getIndex() {
            return ((NavigationLane) this.instance).getIndex();
        }

        public Builder removeAngle(int i2) {
            copyOnWrite();
            ((NavigationLane) this.instance).removeAngle(i2);
            return this;
        }

        public Builder setAngle(int i2, NavigationLaneAngle.Builder builder) {
            copyOnWrite();
            ((NavigationLane) this.instance).setAngle(i2, builder.build());
            return this;
        }

        public Builder setIndex(int i2) {
            copyOnWrite();
            ((NavigationLane) this.instance).setIndex(i2);
            return this;
        }

        public Builder addAngle(int i2, NavigationLaneAngle navigationLaneAngle) {
            copyOnWrite();
            ((NavigationLane) this.instance).addAngle(i2, navigationLaneAngle);
            return this;
        }

        public Builder setAngle(int i2, NavigationLaneAngle navigationLaneAngle) {
            copyOnWrite();
            ((NavigationLane) this.instance).setAngle(i2, navigationLaneAngle);
            return this;
        }

        public Builder addAngle(NavigationLaneAngle.Builder builder) {
            copyOnWrite();
            ((NavigationLane) this.instance).addAngle(builder.build());
            return this;
        }

        public Builder addAngle(NavigationLaneAngle navigationLaneAngle) {
            copyOnWrite();
            ((NavigationLane) this.instance).addAngle(navigationLaneAngle);
            return this;
        }
    }

    public static NavigationLane parseFrom(byte[] bArr) {
        return (NavigationLane) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NavigationLane parseFrom(byte[] bArr, de deVar) {
        return (NavigationLane) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
