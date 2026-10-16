package com.waze.jni.protos.navigate;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RoutingHeadingData extends du<RoutingHeadingData, Builder> implements RoutingHeadingDataOrBuilder {
    private static final RoutingHeadingData DEFAULT_INSTANCE;
    public static final int HAS_STABLE_HEADING_FIELD_NUMBER = 1;
    private static volatile fo<RoutingHeadingData> PARSER;
    private int bitField0_;
    private boolean hasStableHeading_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.RoutingHeadingData$1, reason: invalid class name */
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
    public final class Builder extends dm<RoutingHeadingData, Builder> implements RoutingHeadingDataOrBuilder {
        private Builder() {
            super(RoutingHeadingData.DEFAULT_INSTANCE);
        }

        public Builder clearHasStableHeading() {
            copyOnWrite();
            ((RoutingHeadingData) this.instance).clearHasStableHeading();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.RoutingHeadingDataOrBuilder
        public boolean getHasStableHeading() {
            return ((RoutingHeadingData) this.instance).getHasStableHeading();
        }

        @Override // com.waze.jni.protos.navigate.RoutingHeadingDataOrBuilder
        public boolean hasHasStableHeading() {
            return ((RoutingHeadingData) this.instance).hasHasStableHeading();
        }

        public Builder setHasStableHeading(boolean z) {
            copyOnWrite();
            ((RoutingHeadingData) this.instance).setHasStableHeading(z);
            return this;
        }
    }

    static {
        RoutingHeadingData routingHeadingData = new RoutingHeadingData();
        DEFAULT_INSTANCE = routingHeadingData;
        du.registerDefaultInstance(RoutingHeadingData.class, routingHeadingData);
    }

    private RoutingHeadingData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasStableHeading() {
        this.bitField0_ &= -2;
        this.hasStableHeading_ = false;
    }

    public static RoutingHeadingData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RoutingHeadingData parseDelimitedFrom(InputStream inputStream) {
        return (RoutingHeadingData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RoutingHeadingData parseFrom(v vVar) {
        return (RoutingHeadingData) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<RoutingHeadingData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasStableHeading(boolean z) {
        this.bitField0_ |= 1;
        this.hasStableHeading_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "hasStableHeading_"});
        }
        if (iOrdinal == 3) {
            return new RoutingHeadingData();
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
        fo<RoutingHeadingData> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (RoutingHeadingData.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.RoutingHeadingDataOrBuilder
    public boolean getHasStableHeading() {
        return this.hasStableHeading_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingHeadingDataOrBuilder
    public boolean hasHasStableHeading() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(RoutingHeadingData routingHeadingData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(routingHeadingData);
    }

    public static RoutingHeadingData parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (RoutingHeadingData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RoutingHeadingData parseFrom(v vVar, de deVar) {
        return (RoutingHeadingData) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static RoutingHeadingData parseFrom(z zVar) {
        return (RoutingHeadingData) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static RoutingHeadingData parseFrom(z zVar, de deVar) {
        return (RoutingHeadingData) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static RoutingHeadingData parseFrom(InputStream inputStream) {
        return (RoutingHeadingData) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RoutingHeadingData parseFrom(InputStream inputStream, de deVar) {
        return (RoutingHeadingData) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RoutingHeadingData parseFrom(ByteBuffer byteBuffer) {
        return (RoutingHeadingData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RoutingHeadingData parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (RoutingHeadingData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static RoutingHeadingData parseFrom(byte[] bArr) {
        return (RoutingHeadingData) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RoutingHeadingData parseFrom(byte[] bArr, de deVar) {
        return (RoutingHeadingData) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
