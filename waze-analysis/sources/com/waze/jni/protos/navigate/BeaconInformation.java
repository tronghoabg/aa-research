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
public final class BeaconInformation extends du<BeaconInformation, Builder> implements BeaconInformationOrBuilder {
    private static final BeaconInformation DEFAULT_INSTANCE;
    public static final int HAS_BEACONS_FIELD_NUMBER = 1;
    private static volatile fo<BeaconInformation> PARSER;
    private int bitField0_;
    private boolean hasBeacons_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.BeaconInformation$1, reason: invalid class name */
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
    public final class Builder extends dm<BeaconInformation, Builder> implements BeaconInformationOrBuilder {
        private Builder() {
            super(BeaconInformation.DEFAULT_INSTANCE);
        }

        public Builder clearHasBeacons() {
            copyOnWrite();
            ((BeaconInformation) this.instance).clearHasBeacons();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.BeaconInformationOrBuilder
        public boolean getHasBeacons() {
            return ((BeaconInformation) this.instance).getHasBeacons();
        }

        @Override // com.waze.jni.protos.navigate.BeaconInformationOrBuilder
        public boolean hasHasBeacons() {
            return ((BeaconInformation) this.instance).hasHasBeacons();
        }

        public Builder setHasBeacons(boolean z) {
            copyOnWrite();
            ((BeaconInformation) this.instance).setHasBeacons(z);
            return this;
        }
    }

    static {
        BeaconInformation beaconInformation = new BeaconInformation();
        DEFAULT_INSTANCE = beaconInformation;
        du.registerDefaultInstance(BeaconInformation.class, beaconInformation);
    }

    private BeaconInformation() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasBeacons() {
        this.bitField0_ &= -2;
        this.hasBeacons_ = false;
    }

    public static BeaconInformation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static BeaconInformation parseDelimitedFrom(InputStream inputStream) {
        return (BeaconInformation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BeaconInformation parseFrom(v vVar) {
        return (BeaconInformation) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<BeaconInformation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasBeacons(boolean z) {
        this.bitField0_ |= 1;
        this.hasBeacons_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "hasBeacons_"});
        }
        if (iOrdinal == 3) {
            return new BeaconInformation();
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
        fo<BeaconInformation> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (BeaconInformation.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.BeaconInformationOrBuilder
    public boolean getHasBeacons() {
        return this.hasBeacons_;
    }

    @Override // com.waze.jni.protos.navigate.BeaconInformationOrBuilder
    public boolean hasHasBeacons() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(BeaconInformation beaconInformation) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(beaconInformation);
    }

    public static BeaconInformation parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (BeaconInformation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static BeaconInformation parseFrom(v vVar, de deVar) {
        return (BeaconInformation) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static BeaconInformation parseFrom(z zVar) {
        return (BeaconInformation) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static BeaconInformation parseFrom(z zVar, de deVar) {
        return (BeaconInformation) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static BeaconInformation parseFrom(InputStream inputStream) {
        return (BeaconInformation) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BeaconInformation parseFrom(InputStream inputStream, de deVar) {
        return (BeaconInformation) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static BeaconInformation parseFrom(ByteBuffer byteBuffer) {
        return (BeaconInformation) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static BeaconInformation parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (BeaconInformation) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static BeaconInformation parseFrom(byte[] bArr) {
        return (BeaconInformation) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BeaconInformation parseFrom(byte[] bArr, de deVar) {
        return (BeaconInformation) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
