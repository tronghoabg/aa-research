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
public final class DangerZoneEod extends du<DangerZoneEod, Builder> implements DangerZoneEodOrBuilder {
    private static final DangerZoneEod DEFAULT_INSTANCE;
    public static final int EOD_TO_DESTINATION_DISTANCE_FIELD_NUMBER = 2;
    private static volatile fo<DangerZoneEod> PARSER = null;
    public static final int SHOW_DANGER_ZONE_EOD_FIELD_NUMBER = 1;
    private int bitField0_;
    private long eodToDestinationDistance_;
    private boolean showDangerZoneEod_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.DangerZoneEod$1, reason: invalid class name */
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
    public final class Builder extends dm<DangerZoneEod, Builder> implements DangerZoneEodOrBuilder {
        private Builder() {
            super(DangerZoneEod.DEFAULT_INSTANCE);
        }

        public Builder clearEodToDestinationDistance() {
            copyOnWrite();
            ((DangerZoneEod) this.instance).clearEodToDestinationDistance();
            return this;
        }

        public Builder clearShowDangerZoneEod() {
            copyOnWrite();
            ((DangerZoneEod) this.instance).clearShowDangerZoneEod();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.DangerZoneEodOrBuilder
        public long getEodToDestinationDistance() {
            return ((DangerZoneEod) this.instance).getEodToDestinationDistance();
        }

        @Override // com.waze.jni.protos.navigate.DangerZoneEodOrBuilder
        public boolean getShowDangerZoneEod() {
            return ((DangerZoneEod) this.instance).getShowDangerZoneEod();
        }

        @Override // com.waze.jni.protos.navigate.DangerZoneEodOrBuilder
        public boolean hasEodToDestinationDistance() {
            return ((DangerZoneEod) this.instance).hasEodToDestinationDistance();
        }

        public Builder setEodToDestinationDistance(long j2) {
            copyOnWrite();
            ((DangerZoneEod) this.instance).setEodToDestinationDistance(j2);
            return this;
        }

        public Builder setShowDangerZoneEod(boolean z) {
            copyOnWrite();
            ((DangerZoneEod) this.instance).setShowDangerZoneEod(z);
            return this;
        }
    }

    static {
        DangerZoneEod dangerZoneEod = new DangerZoneEod();
        DEFAULT_INSTANCE = dangerZoneEod;
        du.registerDefaultInstance(DangerZoneEod.class, dangerZoneEod);
    }

    private DangerZoneEod() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEodToDestinationDistance() {
        this.bitField0_ &= -2;
        this.eodToDestinationDistance_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowDangerZoneEod() {
        this.showDangerZoneEod_ = false;
    }

    public static DangerZoneEod getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DangerZoneEod parseDelimitedFrom(InputStream inputStream) {
        return (DangerZoneEod) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DangerZoneEod parseFrom(v vVar) {
        return (DangerZoneEod) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<DangerZoneEod> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEodToDestinationDistance(long j2) {
        this.bitField0_ |= 1;
        this.eodToDestinationDistance_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowDangerZoneEod(boolean z) {
        this.showDangerZoneEod_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002ဂ\u0000", new Object[]{"bitField0_", "showDangerZoneEod_", "eodToDestinationDistance_"});
        }
        if (iOrdinal == 3) {
            return new DangerZoneEod();
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
        fo<DangerZoneEod> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (DangerZoneEod.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.DangerZoneEodOrBuilder
    public long getEodToDestinationDistance() {
        return this.eodToDestinationDistance_;
    }

    @Override // com.waze.jni.protos.navigate.DangerZoneEodOrBuilder
    public boolean getShowDangerZoneEod() {
        return this.showDangerZoneEod_;
    }

    @Override // com.waze.jni.protos.navigate.DangerZoneEodOrBuilder
    public boolean hasEodToDestinationDistance() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(DangerZoneEod dangerZoneEod) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(dangerZoneEod);
    }

    public static DangerZoneEod parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (DangerZoneEod) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static DangerZoneEod parseFrom(v vVar, de deVar) {
        return (DangerZoneEod) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static DangerZoneEod parseFrom(z zVar) {
        return (DangerZoneEod) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static DangerZoneEod parseFrom(z zVar, de deVar) {
        return (DangerZoneEod) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static DangerZoneEod parseFrom(InputStream inputStream) {
        return (DangerZoneEod) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DangerZoneEod parseFrom(InputStream inputStream, de deVar) {
        return (DangerZoneEod) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static DangerZoneEod parseFrom(ByteBuffer byteBuffer) {
        return (DangerZoneEod) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static DangerZoneEod parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (DangerZoneEod) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static DangerZoneEod parseFrom(byte[] bArr) {
        return (DangerZoneEod) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DangerZoneEod parseFrom(byte[] bArr, de deVar) {
        return (DangerZoneEod) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
