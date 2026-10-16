package com.waze.jni.protos.places;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PlaceKey extends du<PlaceKey, Builder> implements PlaceKeyOrBuilder {
    public static final int DB_ID_FIELD_NUMBER = 1;
    private static final PlaceKey DEFAULT_INSTANCE;
    private static volatile fo<PlaceKey> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int dbId_;
    private int type_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.places.PlaceKey$1, reason: invalid class name */
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
    public final class Builder extends dm<PlaceKey, Builder> implements PlaceKeyOrBuilder {
        private Builder() {
            super(PlaceKey.DEFAULT_INSTANCE);
        }

        public Builder clearDbId() {
            copyOnWrite();
            ((PlaceKey) this.instance).clearDbId();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((PlaceKey) this.instance).clearType();
            return this;
        }

        @Override // com.waze.jni.protos.places.PlaceKeyOrBuilder
        public int getDbId() {
            return ((PlaceKey) this.instance).getDbId();
        }

        @Override // com.waze.jni.protos.places.PlaceKeyOrBuilder
        public Type getType() {
            return ((PlaceKey) this.instance).getType();
        }

        @Override // com.waze.jni.protos.places.PlaceKeyOrBuilder
        public int getTypeValue() {
            return ((PlaceKey) this.instance).getTypeValue();
        }

        public Builder setDbId(int i2) {
            copyOnWrite();
            ((PlaceKey) this.instance).setDbId(i2);
            return this;
        }

        public Builder setType(Type type) {
            copyOnWrite();
            ((PlaceKey) this.instance).setType(type);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((PlaceKey) this.instance).setTypeValue(i2);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum Type implements eg {
        None(0),
        Favorite(1),
        Recent(2),
        Event(3),
        UNRECOGNIZED(-1);

        public static final int Event_VALUE = 3;
        public static final int Favorite_VALUE = 1;
        public static final int None_VALUE = 0;
        public static final int Recent_VALUE = 2;
        private static final eh<Type> internalValueMap = new eh<Type>() { // from class: com.waze.jni.protos.places.PlaceKey.Type.1
            @Override // com.google.v.eh
            public Type findValueByNumber(int i2) {
                return Type.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class TypeVerifier implements ei {
            static final ei INSTANCE = new TypeVerifier();

            private TypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return Type.forNumber(i2) != null;
            }
        }

        Type(int i2) {
            this.value = i2;
        }

        public static Type forNumber(int i2) {
            if (i2 == 0) {
                return None;
            }
            if (i2 == 1) {
                return Favorite;
            }
            if (i2 == 2) {
                return Recent;
            }
            if (i2 != 3) {
                return null;
            }
            return Event;
        }

        public static eh<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return TypeVerifier.INSTANCE;
        }

        @Override // com.google.v.eg
        public final int getNumber() {
            return this == UNRECOGNIZED ? ep.b() : this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    static {
        PlaceKey placeKey = new PlaceKey();
        DEFAULT_INSTANCE = placeKey;
        du.registerDefaultInstance(PlaceKey.class, placeKey);
    }

    private PlaceKey() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDbId() {
        this.dbId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static PlaceKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PlaceKey parseDelimitedFrom(InputStream inputStream) {
        return (PlaceKey) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaceKey parseFrom(v vVar) {
        return (PlaceKey) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<PlaceKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDbId(int i2) {
        this.dbId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(Type type) {
        this.type_ = type.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\f", new Object[]{"dbId_", "type_"});
        }
        if (iOrdinal == 3) {
            return new PlaceKey();
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
        fo<PlaceKey> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (PlaceKey.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.places.PlaceKeyOrBuilder
    public int getDbId() {
        return this.dbId_;
    }

    @Override // com.waze.jni.protos.places.PlaceKeyOrBuilder
    public Type getType() {
        Type typeForNumber = Type.forNumber(this.type_);
        return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
    }

    @Override // com.waze.jni.protos.places.PlaceKeyOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    public static Builder newBuilder(PlaceKey placeKey) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(placeKey);
    }

    public static PlaceKey parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (PlaceKey) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static PlaceKey parseFrom(v vVar, de deVar) {
        return (PlaceKey) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static PlaceKey parseFrom(z zVar) {
        return (PlaceKey) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static PlaceKey parseFrom(z zVar, de deVar) {
        return (PlaceKey) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static PlaceKey parseFrom(InputStream inputStream) {
        return (PlaceKey) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaceKey parseFrom(InputStream inputStream, de deVar) {
        return (PlaceKey) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static PlaceKey parseFrom(ByteBuffer byteBuffer) {
        return (PlaceKey) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PlaceKey parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (PlaceKey) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static PlaceKey parseFrom(byte[] bArr) {
        return (PlaceKey) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlaceKey parseFrom(byte[] bArr, de deVar) {
        return (PlaceKey) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
