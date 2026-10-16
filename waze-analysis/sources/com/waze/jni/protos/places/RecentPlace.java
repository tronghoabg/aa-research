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
public final class RecentPlace extends du<RecentPlace, Builder> implements RecentPlaceOrBuilder {
    public static final int ACCESS_TIME_SEC_FIELD_NUMBER = 2;
    private static final RecentPlace DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IMAGE_ID_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 6;
    private static volatile fo<RecentPlace> PARSER = null;
    public static final int SHOULD_CONFIRM_LOCATION_UPDATE_FIELD_NUMBER = 7;
    public static final int TYPE_FIELD_NUMBER = 4;
    public static final int WAYPOINT_ACCESS_TIME_SEC_FIELD_NUMBER = 3;
    private long accessTimeSec_;
    private int id_;
    private String imageId_ = "";
    private String name_ = "";
    private boolean shouldConfirmLocationUpdate_;
    private int type_;
    private long waypointAccessTimeSec_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.places.RecentPlace$1, reason: invalid class name */
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
    public final class Builder extends dm<RecentPlace, Builder> implements RecentPlaceOrBuilder {
        private Builder() {
            super(RecentPlace.DEFAULT_INSTANCE);
        }

        public Builder clearAccessTimeSec() {
            copyOnWrite();
            ((RecentPlace) this.instance).clearAccessTimeSec();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((RecentPlace) this.instance).clearId();
            return this;
        }

        public Builder clearImageId() {
            copyOnWrite();
            ((RecentPlace) this.instance).clearImageId();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((RecentPlace) this.instance).clearName();
            return this;
        }

        public Builder clearShouldConfirmLocationUpdate() {
            copyOnWrite();
            ((RecentPlace) this.instance).clearShouldConfirmLocationUpdate();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((RecentPlace) this.instance).clearType();
            return this;
        }

        public Builder clearWaypointAccessTimeSec() {
            copyOnWrite();
            ((RecentPlace) this.instance).clearWaypointAccessTimeSec();
            return this;
        }

        @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
        public long getAccessTimeSec() {
            return ((RecentPlace) this.instance).getAccessTimeSec();
        }

        @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
        public int getId() {
            return ((RecentPlace) this.instance).getId();
        }

        @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
        public String getImageId() {
            return ((RecentPlace) this.instance).getImageId();
        }

        @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
        public v getImageIdBytes() {
            return ((RecentPlace) this.instance).getImageIdBytes();
        }

        @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
        public String getName() {
            return ((RecentPlace) this.instance).getName();
        }

        @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
        public v getNameBytes() {
            return ((RecentPlace) this.instance).getNameBytes();
        }

        @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
        public boolean getShouldConfirmLocationUpdate() {
            return ((RecentPlace) this.instance).getShouldConfirmLocationUpdate();
        }

        @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
        public RecentPlaceType getType() {
            return ((RecentPlace) this.instance).getType();
        }

        @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
        public int getTypeValue() {
            return ((RecentPlace) this.instance).getTypeValue();
        }

        @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
        public long getWaypointAccessTimeSec() {
            return ((RecentPlace) this.instance).getWaypointAccessTimeSec();
        }

        public Builder setAccessTimeSec(long j2) {
            copyOnWrite();
            ((RecentPlace) this.instance).setAccessTimeSec(j2);
            return this;
        }

        public Builder setId(int i2) {
            copyOnWrite();
            ((RecentPlace) this.instance).setId(i2);
            return this;
        }

        public Builder setImageId(String str) {
            copyOnWrite();
            ((RecentPlace) this.instance).setImageId(str);
            return this;
        }

        public Builder setImageIdBytes(v vVar) {
            copyOnWrite();
            ((RecentPlace) this.instance).setImageIdBytes(vVar);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((RecentPlace) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(v vVar) {
            copyOnWrite();
            ((RecentPlace) this.instance).setNameBytes(vVar);
            return this;
        }

        public Builder setShouldConfirmLocationUpdate(boolean z) {
            copyOnWrite();
            ((RecentPlace) this.instance).setShouldConfirmLocationUpdate(z);
            return this;
        }

        public Builder setType(RecentPlaceType recentPlaceType) {
            copyOnWrite();
            ((RecentPlace) this.instance).setType(recentPlaceType);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((RecentPlace) this.instance).setTypeValue(i2);
            return this;
        }

        public Builder setWaypointAccessTimeSec(long j2) {
            copyOnWrite();
            ((RecentPlace) this.instance).setWaypointAccessTimeSec(j2);
            return this;
        }
    }

    static {
        RecentPlace recentPlace = new RecentPlace();
        DEFAULT_INSTANCE = recentPlace;
        du.registerDefaultInstance(RecentPlace.class, recentPlace);
    }

    private RecentPlace() {
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
    public void clearImageId() {
        this.imageId_ = getDefaultInstance().getImageId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShouldConfirmLocationUpdate() {
        this.shouldConfirmLocationUpdate_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaypointAccessTimeSec() {
        this.waypointAccessTimeSec_ = 0L;
    }

    public static RecentPlace getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RecentPlace parseDelimitedFrom(InputStream inputStream) {
        return (RecentPlace) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecentPlace parseFrom(v vVar) {
        return (RecentPlace) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<RecentPlace> parser() {
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
    public void setImageId(String str) {
        Objects.requireNonNull(str);
        this.imageId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.imageId_ = vVar.u();
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
    public void setShouldConfirmLocationUpdate(boolean z) {
        this.shouldConfirmLocationUpdate_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(RecentPlaceType recentPlaceType) {
        this.type_ = recentPlaceType.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007\u0007", new Object[]{"id_", "accessTimeSec_", "waypointAccessTimeSec_", "type_", "imageId_", "name_", "shouldConfirmLocationUpdate_"});
        }
        if (iOrdinal == 3) {
            return new RecentPlace();
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
        fo<RecentPlace> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (RecentPlace.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
    public long getAccessTimeSec() {
        return this.accessTimeSec_;
    }

    @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
    public String getImageId() {
        return this.imageId_;
    }

    @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
    public v getImageIdBytes() {
        return v.s(this.imageId_);
    }

    @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
    public v getNameBytes() {
        return v.s(this.name_);
    }

    @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
    public boolean getShouldConfirmLocationUpdate() {
        return this.shouldConfirmLocationUpdate_;
    }

    @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
    public RecentPlaceType getType() {
        RecentPlaceType recentPlaceTypeForNumber = RecentPlaceType.forNumber(this.type_);
        return recentPlaceTypeForNumber == null ? RecentPlaceType.UNRECOGNIZED : recentPlaceTypeForNumber;
    }

    @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.waze.jni.protos.places.RecentPlaceOrBuilder
    public long getWaypointAccessTimeSec() {
        return this.waypointAccessTimeSec_;
    }

    public static Builder newBuilder(RecentPlace recentPlace) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(recentPlace);
    }

    public static RecentPlace parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (RecentPlace) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RecentPlace parseFrom(v vVar, de deVar) {
        return (RecentPlace) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static RecentPlace parseFrom(z zVar) {
        return (RecentPlace) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static RecentPlace parseFrom(z zVar, de deVar) {
        return (RecentPlace) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static RecentPlace parseFrom(InputStream inputStream) {
        return (RecentPlace) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecentPlace parseFrom(InputStream inputStream, de deVar) {
        return (RecentPlace) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RecentPlace parseFrom(ByteBuffer byteBuffer) {
        return (RecentPlace) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RecentPlace parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (RecentPlace) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static RecentPlace parseFrom(byte[] bArr) {
        return (RecentPlace) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecentPlace parseFrom(byte[] bArr, de deVar) {
        return (RecentPlace) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
