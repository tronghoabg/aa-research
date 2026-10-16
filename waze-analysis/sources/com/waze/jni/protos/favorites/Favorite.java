package com.waze.jni.protos.favorites;

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
import com.waze.jni.protos.places.Place;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class Favorite extends du<Favorite, Builder> implements FavoriteOrBuilder {
    private static final Favorite DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile fo<Favorite> PARSER = null;
    public static final int PLACE_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int id_;
    private String name_ = "";
    private Place place_;
    private int type_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.favorites.Favorite$1, reason: invalid class name */
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
    public enum Type implements eg {
        DEFAULT(0),
        HOME(1),
        WORK(2),
        UNRECOGNIZED(-1);

        public static final int DEFAULT_VALUE = 0;
        public static final int HOME_VALUE = 1;
        public static final int WORK_VALUE = 2;
        private static final eh<Type> internalValueMap = new eh<Type>() { // from class: com.waze.jni.protos.favorites.Favorite.Type.1
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
                return DEFAULT;
            }
            if (i2 == 1) {
                return HOME;
            }
            if (i2 != 2) {
                return null;
            }
            return WORK;
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
        Favorite favorite = new Favorite();
        DEFAULT_INSTANCE = favorite;
        du.registerDefaultInstance(Favorite.class, favorite);
    }

    private Favorite() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlace() {
        this.place_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static Favorite getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlace(Place place) {
        Objects.requireNonNull(place);
        Place place2 = this.place_;
        if (place2 != null && place2 != Place.getDefaultInstance()) {
            Place.Builder builderNewBuilder = Place.newBuilder(place2);
            builderNewBuilder.mergeFrom((Place.Builder) place);
            place = builderNewBuilder.buildPartial();
        }
        this.place_ = place;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Favorite parseDelimitedFrom(InputStream inputStream) {
        return (Favorite) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Favorite parseFrom(v vVar) {
        return (Favorite) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<Favorite> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i2) {
        this.id_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.name_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlace(Place place) {
        Objects.requireNonNull(place);
        this.place_ = place;
        this.bitField0_ |= 1;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\f\u0004\u0004", new Object[]{"bitField0_", "place_", "name_", "type_", "id_"});
        }
        if (iOrdinal == 3) {
            return new Favorite();
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
        fo<Favorite> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Favorite.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.favorites.FavoriteOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.waze.jni.protos.favorites.FavoriteOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.waze.jni.protos.favorites.FavoriteOrBuilder
    public v getNameBytes() {
        return v.s(this.name_);
    }

    @Override // com.waze.jni.protos.favorites.FavoriteOrBuilder
    public Place getPlace() {
        Place place = this.place_;
        return place == null ? Place.getDefaultInstance() : place;
    }

    @Override // com.waze.jni.protos.favorites.FavoriteOrBuilder
    public Type getType() {
        Type typeForNumber = Type.forNumber(this.type_);
        return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
    }

    @Override // com.waze.jni.protos.favorites.FavoriteOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.waze.jni.protos.favorites.FavoriteOrBuilder
    public boolean hasPlace() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(Favorite favorite) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(favorite);
    }

    public static Favorite parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (Favorite) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Favorite parseFrom(v vVar, de deVar) {
        return (Favorite) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Favorite parseFrom(z zVar) {
        return (Favorite) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Favorite parseFrom(z zVar, de deVar) {
        return (Favorite) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Favorite parseFrom(InputStream inputStream) {
        return (Favorite) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Favorite parseFrom(InputStream inputStream, de deVar) {
        return (Favorite) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Favorite parseFrom(ByteBuffer byteBuffer) {
        return (Favorite) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Favorite parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (Favorite) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<Favorite, Builder> implements FavoriteOrBuilder {
        private Builder() {
            super(Favorite.DEFAULT_INSTANCE);
        }

        public Builder clearId() {
            copyOnWrite();
            ((Favorite) this.instance).clearId();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Favorite) this.instance).clearName();
            return this;
        }

        public Builder clearPlace() {
            copyOnWrite();
            ((Favorite) this.instance).clearPlace();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((Favorite) this.instance).clearType();
            return this;
        }

        @Override // com.waze.jni.protos.favorites.FavoriteOrBuilder
        public int getId() {
            return ((Favorite) this.instance).getId();
        }

        @Override // com.waze.jni.protos.favorites.FavoriteOrBuilder
        public String getName() {
            return ((Favorite) this.instance).getName();
        }

        @Override // com.waze.jni.protos.favorites.FavoriteOrBuilder
        public v getNameBytes() {
            return ((Favorite) this.instance).getNameBytes();
        }

        @Override // com.waze.jni.protos.favorites.FavoriteOrBuilder
        public Place getPlace() {
            return ((Favorite) this.instance).getPlace();
        }

        @Override // com.waze.jni.protos.favorites.FavoriteOrBuilder
        public Type getType() {
            return ((Favorite) this.instance).getType();
        }

        @Override // com.waze.jni.protos.favorites.FavoriteOrBuilder
        public int getTypeValue() {
            return ((Favorite) this.instance).getTypeValue();
        }

        @Override // com.waze.jni.protos.favorites.FavoriteOrBuilder
        public boolean hasPlace() {
            return ((Favorite) this.instance).hasPlace();
        }

        public Builder mergePlace(Place place) {
            copyOnWrite();
            ((Favorite) this.instance).mergePlace(place);
            return this;
        }

        public Builder setId(int i2) {
            copyOnWrite();
            ((Favorite) this.instance).setId(i2);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Favorite) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(v vVar) {
            copyOnWrite();
            ((Favorite) this.instance).setNameBytes(vVar);
            return this;
        }

        public Builder setPlace(Place.Builder builder) {
            copyOnWrite();
            ((Favorite) this.instance).setPlace(builder.build());
            return this;
        }

        public Builder setType(Type type) {
            copyOnWrite();
            ((Favorite) this.instance).setType(type);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((Favorite) this.instance).setTypeValue(i2);
            return this;
        }

        public Builder setPlace(Place place) {
            copyOnWrite();
            ((Favorite) this.instance).setPlace(place);
            return this;
        }
    }

    public static Favorite parseFrom(byte[] bArr) {
        return (Favorite) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Favorite parseFrom(byte[] bArr, de deVar) {
        return (Favorite) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
