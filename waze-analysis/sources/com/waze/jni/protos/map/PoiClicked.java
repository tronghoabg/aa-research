package com.waze.jni.protos.map;

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
public final class PoiClicked extends du<PoiClicked, Builder> implements PoiClickedOrBuilder {
    private static final PoiClicked DEFAULT_INSTANCE;
    private static volatile fo<PoiClicked> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.PoiClicked$1, reason: invalid class name */
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
    public final class Builder extends dm<PoiClicked, Builder> implements PoiClickedOrBuilder {
        private Builder() {
            super(PoiClicked.DEFAULT_INSTANCE);
        }

        public Builder clearType() {
            copyOnWrite();
            ((PoiClicked) this.instance).clearType();
            return this;
        }

        @Override // com.waze.jni.protos.map.PoiClickedOrBuilder
        public ClickedPoiType getType() {
            return ((PoiClicked) this.instance).getType();
        }

        @Override // com.waze.jni.protos.map.PoiClickedOrBuilder
        public int getTypeValue() {
            return ((PoiClicked) this.instance).getTypeValue();
        }

        public Builder setType(ClickedPoiType clickedPoiType) {
            copyOnWrite();
            ((PoiClicked) this.instance).setType(clickedPoiType);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((PoiClicked) this.instance).setTypeValue(i2);
            return this;
        }
    }

    static {
        PoiClicked poiClicked = new PoiClicked();
        DEFAULT_INSTANCE = poiClicked;
        du.registerDefaultInstance(PoiClicked.class, poiClicked);
    }

    private PoiClicked() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static PoiClicked getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PoiClicked parseDelimitedFrom(InputStream inputStream) {
        return (PoiClicked) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PoiClicked parseFrom(v vVar) {
        return (PoiClicked) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<PoiClicked> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ClickedPoiType clickedPoiType) {
        this.type_ = clickedPoiType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"type_"});
        }
        if (iOrdinal == 3) {
            return new PoiClicked();
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
        fo<PoiClicked> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (PoiClicked.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.PoiClickedOrBuilder
    public ClickedPoiType getType() {
        ClickedPoiType clickedPoiTypeForNumber = ClickedPoiType.forNumber(this.type_);
        return clickedPoiTypeForNumber == null ? ClickedPoiType.UNRECOGNIZED : clickedPoiTypeForNumber;
    }

    @Override // com.waze.jni.protos.map.PoiClickedOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    public static Builder newBuilder(PoiClicked poiClicked) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(poiClicked);
    }

    public static PoiClicked parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (PoiClicked) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static PoiClicked parseFrom(v vVar, de deVar) {
        return (PoiClicked) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static PoiClicked parseFrom(z zVar) {
        return (PoiClicked) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static PoiClicked parseFrom(z zVar, de deVar) {
        return (PoiClicked) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static PoiClicked parseFrom(InputStream inputStream) {
        return (PoiClicked) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PoiClicked parseFrom(InputStream inputStream, de deVar) {
        return (PoiClicked) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static PoiClicked parseFrom(ByteBuffer byteBuffer) {
        return (PoiClicked) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PoiClicked parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (PoiClicked) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static PoiClicked parseFrom(byte[] bArr) {
        return (PoiClicked) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PoiClicked parseFrom(byte[] bArr, de deVar) {
        return (PoiClicked) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
