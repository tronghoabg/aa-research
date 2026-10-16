package com.waze.jni.protos.navigate;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.navigate.NavigationRoadSign;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NextStreetNameUpdate extends du<NextStreetNameUpdate, Builder> implements NextStreetNameUpdateOrBuilder {
    private static final NextStreetNameUpdate DEFAULT_INSTANCE;
    public static final int DISPLAY_ARROW_BEFORE_TEXT_FIELD_NUMBER = 2;
    private static volatile fo<NextStreetNameUpdate> PARSER = null;
    public static final int ROAD_SIGN_FIELD_NUMBER = 4;
    public static final int SEGMENT_IDX_FIELD_NUMBER = 3;
    public static final int STREET_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean displayArrowBeforeText_;
    private NavigationRoadSign roadSign_;
    private int segmentIdx_;
    private String streetName_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.NextStreetNameUpdate$1, reason: invalid class name */
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
        NextStreetNameUpdate nextStreetNameUpdate = new NextStreetNameUpdate();
        DEFAULT_INSTANCE = nextStreetNameUpdate;
        du.registerDefaultInstance(NextStreetNameUpdate.class, nextStreetNameUpdate);
    }

    private NextStreetNameUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayArrowBeforeText() {
        this.displayArrowBeforeText_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadSign() {
        this.roadSign_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentIdx() {
        this.segmentIdx_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreetName() {
        this.streetName_ = getDefaultInstance().getStreetName();
    }

    public static NextStreetNameUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoadSign(NavigationRoadSign navigationRoadSign) {
        Objects.requireNonNull(navigationRoadSign);
        NavigationRoadSign navigationRoadSign2 = this.roadSign_;
        if (navigationRoadSign2 != null && navigationRoadSign2 != NavigationRoadSign.getDefaultInstance()) {
            NavigationRoadSign.Builder builderNewBuilder = NavigationRoadSign.newBuilder(navigationRoadSign2);
            builderNewBuilder.mergeFrom((NavigationRoadSign.Builder) navigationRoadSign);
            navigationRoadSign = builderNewBuilder.buildPartial();
        }
        this.roadSign_ = navigationRoadSign;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NextStreetNameUpdate parseDelimitedFrom(InputStream inputStream) {
        return (NextStreetNameUpdate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NextStreetNameUpdate parseFrom(v vVar) {
        return (NextStreetNameUpdate) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NextStreetNameUpdate> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayArrowBeforeText(boolean z) {
        this.displayArrowBeforeText_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadSign(NavigationRoadSign navigationRoadSign) {
        Objects.requireNonNull(navigationRoadSign);
        this.roadSign_ = navigationRoadSign;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentIdx(int i2) {
        this.segmentIdx_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetName(String str) {
        Objects.requireNonNull(str);
        this.streetName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.streetName_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0004\u0004ဉ\u0000", new Object[]{"bitField0_", "streetName_", "displayArrowBeforeText_", "segmentIdx_", "roadSign_"});
        }
        if (iOrdinal == 3) {
            return new NextStreetNameUpdate();
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
        fo<NextStreetNameUpdate> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NextStreetNameUpdate.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.NextStreetNameUpdateOrBuilder
    public boolean getDisplayArrowBeforeText() {
        return this.displayArrowBeforeText_;
    }

    @Override // com.waze.jni.protos.navigate.NextStreetNameUpdateOrBuilder
    public NavigationRoadSign getRoadSign() {
        NavigationRoadSign navigationRoadSign = this.roadSign_;
        return navigationRoadSign == null ? NavigationRoadSign.getDefaultInstance() : navigationRoadSign;
    }

    @Override // com.waze.jni.protos.navigate.NextStreetNameUpdateOrBuilder
    public int getSegmentIdx() {
        return this.segmentIdx_;
    }

    @Override // com.waze.jni.protos.navigate.NextStreetNameUpdateOrBuilder
    public String getStreetName() {
        return this.streetName_;
    }

    @Override // com.waze.jni.protos.navigate.NextStreetNameUpdateOrBuilder
    public v getStreetNameBytes() {
        return v.s(this.streetName_);
    }

    @Override // com.waze.jni.protos.navigate.NextStreetNameUpdateOrBuilder
    public boolean hasRoadSign() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(NextStreetNameUpdate nextStreetNameUpdate) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nextStreetNameUpdate);
    }

    public static NextStreetNameUpdate parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NextStreetNameUpdate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NextStreetNameUpdate parseFrom(v vVar, de deVar) {
        return (NextStreetNameUpdate) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NextStreetNameUpdate parseFrom(z zVar) {
        return (NextStreetNameUpdate) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NextStreetNameUpdate parseFrom(z zVar, de deVar) {
        return (NextStreetNameUpdate) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NextStreetNameUpdate parseFrom(InputStream inputStream) {
        return (NextStreetNameUpdate) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NextStreetNameUpdate parseFrom(InputStream inputStream, de deVar) {
        return (NextStreetNameUpdate) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NextStreetNameUpdate parseFrom(ByteBuffer byteBuffer) {
        return (NextStreetNameUpdate) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NextStreetNameUpdate parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NextStreetNameUpdate) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NextStreetNameUpdate, Builder> implements NextStreetNameUpdateOrBuilder {
        private Builder() {
            super(NextStreetNameUpdate.DEFAULT_INSTANCE);
        }

        public Builder clearDisplayArrowBeforeText() {
            copyOnWrite();
            ((NextStreetNameUpdate) this.instance).clearDisplayArrowBeforeText();
            return this;
        }

        public Builder clearRoadSign() {
            copyOnWrite();
            ((NextStreetNameUpdate) this.instance).clearRoadSign();
            return this;
        }

        public Builder clearSegmentIdx() {
            copyOnWrite();
            ((NextStreetNameUpdate) this.instance).clearSegmentIdx();
            return this;
        }

        public Builder clearStreetName() {
            copyOnWrite();
            ((NextStreetNameUpdate) this.instance).clearStreetName();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.NextStreetNameUpdateOrBuilder
        public boolean getDisplayArrowBeforeText() {
            return ((NextStreetNameUpdate) this.instance).getDisplayArrowBeforeText();
        }

        @Override // com.waze.jni.protos.navigate.NextStreetNameUpdateOrBuilder
        public NavigationRoadSign getRoadSign() {
            return ((NextStreetNameUpdate) this.instance).getRoadSign();
        }

        @Override // com.waze.jni.protos.navigate.NextStreetNameUpdateOrBuilder
        public int getSegmentIdx() {
            return ((NextStreetNameUpdate) this.instance).getSegmentIdx();
        }

        @Override // com.waze.jni.protos.navigate.NextStreetNameUpdateOrBuilder
        public String getStreetName() {
            return ((NextStreetNameUpdate) this.instance).getStreetName();
        }

        @Override // com.waze.jni.protos.navigate.NextStreetNameUpdateOrBuilder
        public v getStreetNameBytes() {
            return ((NextStreetNameUpdate) this.instance).getStreetNameBytes();
        }

        @Override // com.waze.jni.protos.navigate.NextStreetNameUpdateOrBuilder
        public boolean hasRoadSign() {
            return ((NextStreetNameUpdate) this.instance).hasRoadSign();
        }

        public Builder mergeRoadSign(NavigationRoadSign navigationRoadSign) {
            copyOnWrite();
            ((NextStreetNameUpdate) this.instance).mergeRoadSign(navigationRoadSign);
            return this;
        }

        public Builder setDisplayArrowBeforeText(boolean z) {
            copyOnWrite();
            ((NextStreetNameUpdate) this.instance).setDisplayArrowBeforeText(z);
            return this;
        }

        public Builder setRoadSign(NavigationRoadSign.Builder builder) {
            copyOnWrite();
            ((NextStreetNameUpdate) this.instance).setRoadSign(builder.build());
            return this;
        }

        public Builder setSegmentIdx(int i2) {
            copyOnWrite();
            ((NextStreetNameUpdate) this.instance).setSegmentIdx(i2);
            return this;
        }

        public Builder setStreetName(String str) {
            copyOnWrite();
            ((NextStreetNameUpdate) this.instance).setStreetName(str);
            return this;
        }

        public Builder setStreetNameBytes(v vVar) {
            copyOnWrite();
            ((NextStreetNameUpdate) this.instance).setStreetNameBytes(vVar);
            return this;
        }

        public Builder setRoadSign(NavigationRoadSign navigationRoadSign) {
            copyOnWrite();
            ((NextStreetNameUpdate) this.instance).setRoadSign(navigationRoadSign);
            return this;
        }
    }

    public static NextStreetNameUpdate parseFrom(byte[] bArr) {
        return (NextStreetNameUpdate) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NextStreetNameUpdate parseFrom(byte[] bArr, de deVar) {
        return (NextStreetNameUpdate) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
