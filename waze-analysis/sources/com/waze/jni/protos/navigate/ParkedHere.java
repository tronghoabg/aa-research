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
public final class ParkedHere extends du<ParkedHere, Builder> implements ParkedHereOrBuilder {
    private static final ParkedHere DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile fo<ParkedHere> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 3;
    public static final int SHOW_POPUP_FIELD_NUMBER = 4;
    private int latitude_;
    private int longitude_;
    private int reason_;
    private boolean showPopup_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.ParkedHere$1, reason: invalid class name */
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
    public final class Builder extends dm<ParkedHere, Builder> implements ParkedHereOrBuilder {
        private Builder() {
            super(ParkedHere.DEFAULT_INSTANCE);
        }

        public Builder clearLatitude() {
            copyOnWrite();
            ((ParkedHere) this.instance).clearLatitude();
            return this;
        }

        public Builder clearLongitude() {
            copyOnWrite();
            ((ParkedHere) this.instance).clearLongitude();
            return this;
        }

        public Builder clearReason() {
            copyOnWrite();
            ((ParkedHere) this.instance).clearReason();
            return this;
        }

        public Builder clearShowPopup() {
            copyOnWrite();
            ((ParkedHere) this.instance).clearShowPopup();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.ParkedHereOrBuilder
        public int getLatitude() {
            return ((ParkedHere) this.instance).getLatitude();
        }

        @Override // com.waze.jni.protos.navigate.ParkedHereOrBuilder
        public int getLongitude() {
            return ((ParkedHere) this.instance).getLongitude();
        }

        @Override // com.waze.jni.protos.navigate.ParkedHereOrBuilder
        public ParkedHereSetReason getReason() {
            return ((ParkedHere) this.instance).getReason();
        }

        @Override // com.waze.jni.protos.navigate.ParkedHereOrBuilder
        public int getReasonValue() {
            return ((ParkedHere) this.instance).getReasonValue();
        }

        @Override // com.waze.jni.protos.navigate.ParkedHereOrBuilder
        public boolean getShowPopup() {
            return ((ParkedHere) this.instance).getShowPopup();
        }

        public Builder setLatitude(int i2) {
            copyOnWrite();
            ((ParkedHere) this.instance).setLatitude(i2);
            return this;
        }

        public Builder setLongitude(int i2) {
            copyOnWrite();
            ((ParkedHere) this.instance).setLongitude(i2);
            return this;
        }

        public Builder setReason(ParkedHereSetReason parkedHereSetReason) {
            copyOnWrite();
            ((ParkedHere) this.instance).setReason(parkedHereSetReason);
            return this;
        }

        public Builder setReasonValue(int i2) {
            copyOnWrite();
            ((ParkedHere) this.instance).setReasonValue(i2);
            return this;
        }

        public Builder setShowPopup(boolean z) {
            copyOnWrite();
            ((ParkedHere) this.instance).setShowPopup(z);
            return this;
        }
    }

    static {
        ParkedHere parkedHere = new ParkedHere();
        DEFAULT_INSTANCE = parkedHere;
        du.registerDefaultInstance(ParkedHere.class, parkedHere);
    }

    private ParkedHere() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitude() {
        this.latitude_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongitude() {
        this.longitude_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowPopup() {
        this.showPopup_ = false;
    }

    public static ParkedHere getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ParkedHere parseDelimitedFrom(InputStream inputStream) {
        return (ParkedHere) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ParkedHere parseFrom(v vVar) {
        return (ParkedHere) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ParkedHere> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitude(int i2) {
        this.latitude_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongitude(int i2) {
        this.longitude_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(ParkedHereSetReason parkedHereSetReason) {
        this.reason_ = parkedHereSetReason.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i2) {
        this.reason_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowPopup(boolean z) {
        this.showPopup_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\f\u0004\u0007", new Object[]{"latitude_", "longitude_", "reason_", "showPopup_"});
        }
        if (iOrdinal == 3) {
            return new ParkedHere();
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
        fo<ParkedHere> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ParkedHere.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.ParkedHereOrBuilder
    public int getLatitude() {
        return this.latitude_;
    }

    @Override // com.waze.jni.protos.navigate.ParkedHereOrBuilder
    public int getLongitude() {
        return this.longitude_;
    }

    @Override // com.waze.jni.protos.navigate.ParkedHereOrBuilder
    public ParkedHereSetReason getReason() {
        ParkedHereSetReason parkedHereSetReasonForNumber = ParkedHereSetReason.forNumber(this.reason_);
        return parkedHereSetReasonForNumber == null ? ParkedHereSetReason.UNRECOGNIZED : parkedHereSetReasonForNumber;
    }

    @Override // com.waze.jni.protos.navigate.ParkedHereOrBuilder
    public int getReasonValue() {
        return this.reason_;
    }

    @Override // com.waze.jni.protos.navigate.ParkedHereOrBuilder
    public boolean getShowPopup() {
        return this.showPopup_;
    }

    public static Builder newBuilder(ParkedHere parkedHere) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(parkedHere);
    }

    public static ParkedHere parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ParkedHere) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ParkedHere parseFrom(v vVar, de deVar) {
        return (ParkedHere) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ParkedHere parseFrom(z zVar) {
        return (ParkedHere) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ParkedHere parseFrom(z zVar, de deVar) {
        return (ParkedHere) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ParkedHere parseFrom(InputStream inputStream) {
        return (ParkedHere) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ParkedHere parseFrom(InputStream inputStream, de deVar) {
        return (ParkedHere) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ParkedHere parseFrom(ByteBuffer byteBuffer) {
        return (ParkedHere) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ParkedHere parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ParkedHere) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ParkedHere parseFrom(byte[] bArr) {
        return (ParkedHere) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ParkedHere parseFrom(byte[] bArr, de deVar) {
        return (ParkedHere) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
