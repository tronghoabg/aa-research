package com.waze.jni.protos.places;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class FavoritePlace extends du<FavoritePlace, Builder> implements FavoritePlaceOrBuilder {
    public static final int ACCESS_TIME_SEC_FIELD_NUMBER = 2;
    private static final FavoritePlace DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MODIFIED_TIME_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 8;
    private static volatile fo<FavoritePlace> PARSER = null;
    public static final int RANK_FIELD_NUMBER = 6;
    public static final int SERVER_ID_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int WAYPOINT_ACCESS_TIME_SEC_FIELD_NUMBER = 3;
    private long accessTimeSec_;
    private int id_;
    private int modifiedTime_;
    private String name_ = "";
    private int rank_;
    private long serverId_;
    private int type_;
    private long waypointAccessTimeSec_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.places.FavoritePlace$1, reason: invalid class name */
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
    public final class Builder extends dm<FavoritePlace, Builder> implements FavoritePlaceOrBuilder {
        private Builder() {
            super(FavoritePlace.DEFAULT_INSTANCE);
        }

        public Builder clearAccessTimeSec() {
            copyOnWrite();
            ((FavoritePlace) this.instance).clearAccessTimeSec();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((FavoritePlace) this.instance).clearId();
            return this;
        }

        public Builder clearModifiedTime() {
            copyOnWrite();
            ((FavoritePlace) this.instance).clearModifiedTime();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((FavoritePlace) this.instance).clearName();
            return this;
        }

        public Builder clearRank() {
            copyOnWrite();
            ((FavoritePlace) this.instance).clearRank();
            return this;
        }

        public Builder clearServerId() {
            copyOnWrite();
            ((FavoritePlace) this.instance).clearServerId();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((FavoritePlace) this.instance).clearType();
            return this;
        }

        public Builder clearWaypointAccessTimeSec() {
            copyOnWrite();
            ((FavoritePlace) this.instance).clearWaypointAccessTimeSec();
            return this;
        }

        @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
        public long getAccessTimeSec() {
            return ((FavoritePlace) this.instance).getAccessTimeSec();
        }

        @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
        public int getId() {
            return ((FavoritePlace) this.instance).getId();
        }

        @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
        public int getModifiedTime() {
            return ((FavoritePlace) this.instance).getModifiedTime();
        }

        @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
        public String getName() {
            return ((FavoritePlace) this.instance).getName();
        }

        @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
        public v getNameBytes() {
            return ((FavoritePlace) this.instance).getNameBytes();
        }

        @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
        public int getRank() {
            return ((FavoritePlace) this.instance).getRank();
        }

        @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
        public long getServerId() {
            return ((FavoritePlace) this.instance).getServerId();
        }

        @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
        public FavoritePlaceType getType() {
            return ((FavoritePlace) this.instance).getType();
        }

        @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
        public int getTypeValue() {
            return ((FavoritePlace) this.instance).getTypeValue();
        }

        @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
        public long getWaypointAccessTimeSec() {
            return ((FavoritePlace) this.instance).getWaypointAccessTimeSec();
        }

        public Builder setAccessTimeSec(long j2) {
            copyOnWrite();
            ((FavoritePlace) this.instance).setAccessTimeSec(j2);
            return this;
        }

        public Builder setId(int i2) {
            copyOnWrite();
            ((FavoritePlace) this.instance).setId(i2);
            return this;
        }

        public Builder setModifiedTime(int i2) {
            copyOnWrite();
            ((FavoritePlace) this.instance).setModifiedTime(i2);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((FavoritePlace) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(v vVar) {
            copyOnWrite();
            ((FavoritePlace) this.instance).setNameBytes(vVar);
            return this;
        }

        public Builder setRank(int i2) {
            copyOnWrite();
            ((FavoritePlace) this.instance).setRank(i2);
            return this;
        }

        public Builder setServerId(long j2) {
            copyOnWrite();
            ((FavoritePlace) this.instance).setServerId(j2);
            return this;
        }

        public Builder setType(FavoritePlaceType favoritePlaceType) {
            copyOnWrite();
            ((FavoritePlace) this.instance).setType(favoritePlaceType);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((FavoritePlace) this.instance).setTypeValue(i2);
            return this;
        }

        public Builder setWaypointAccessTimeSec(long j2) {
            copyOnWrite();
            ((FavoritePlace) this.instance).setWaypointAccessTimeSec(j2);
            return this;
        }
    }

    static {
        FavoritePlace favoritePlace = new FavoritePlace();
        DEFAULT_INSTANCE = favoritePlace;
        du.registerDefaultInstance(FavoritePlace.class, favoritePlace);
    }

    private FavoritePlace() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessTimeSec() {
        this.accessTimeSec_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModifiedTime() {
        this.modifiedTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRank() {
        this.rank_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerId() {
        this.serverId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaypointAccessTimeSec() {
        this.waypointAccessTimeSec_ = 0L;
    }

    public static FavoritePlace getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FavoritePlace parseDelimitedFrom(InputStream inputStream) {
        return (FavoritePlace) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FavoritePlace parseFrom(v vVar) {
        return (FavoritePlace) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<FavoritePlace> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessTimeSec(long j2) {
        this.accessTimeSec_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i2) {
        this.id_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModifiedTime(int i2) {
        this.modifiedTime_ = i2;
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
    public void setRank(int i2) {
        this.rank_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerId(long j2) {
        this.serverId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(FavoritePlaceType favoritePlaceType) {
        this.type_ = favoritePlaceType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaypointAccessTimeSec(long j2) {
        this.waypointAccessTimeSec_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002\u0004\u0002\u0005\f\u0006\u0004\u0007\u0004\bȈ", new Object[]{"id_", "accessTimeSec_", "waypointAccessTimeSec_", "serverId_", "type_", "rank_", "modifiedTime_", "name_"});
        }
        if (iOrdinal == 3) {
            return new FavoritePlace();
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
        fo<FavoritePlace> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (FavoritePlace.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
    public long getAccessTimeSec() {
        return this.accessTimeSec_;
    }

    @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
    public int getModifiedTime() {
        return this.modifiedTime_;
    }

    @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
    public v getNameBytes() {
        return v.s(this.name_);
    }

    @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
    public int getRank() {
        return this.rank_;
    }

    @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
    public long getServerId() {
        return this.serverId_;
    }

    @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
    public FavoritePlaceType getType() {
        FavoritePlaceType favoritePlaceTypeForNumber = FavoritePlaceType.forNumber(this.type_);
        return favoritePlaceTypeForNumber == null ? FavoritePlaceType.UNRECOGNIZED : favoritePlaceTypeForNumber;
    }

    @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.waze.jni.protos.places.FavoritePlaceOrBuilder
    public long getWaypointAccessTimeSec() {
        return this.waypointAccessTimeSec_;
    }

    public static Builder newBuilder(FavoritePlace favoritePlace) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(favoritePlace);
    }

    public static FavoritePlace parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (FavoritePlace) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static FavoritePlace parseFrom(v vVar, de deVar) {
        return (FavoritePlace) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static FavoritePlace parseFrom(z zVar) {
        return (FavoritePlace) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static FavoritePlace parseFrom(z zVar, de deVar) {
        return (FavoritePlace) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static FavoritePlace parseFrom(InputStream inputStream) {
        return (FavoritePlace) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FavoritePlace parseFrom(InputStream inputStream, de deVar) {
        return (FavoritePlace) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static FavoritePlace parseFrom(ByteBuffer byteBuffer) {
        return (FavoritePlace) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FavoritePlace parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (FavoritePlace) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static FavoritePlace parseFrom(byte[] bArr) {
        return (FavoritePlace) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FavoritePlace parseFrom(byte[] bArr, de deVar) {
        return (FavoritePlace) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
