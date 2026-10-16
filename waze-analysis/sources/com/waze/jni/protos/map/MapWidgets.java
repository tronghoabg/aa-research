package com.waze.jni.protos.map;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.NativeBitmap;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapWidgets extends du<MapWidgets, Builder> implements MapWidgetsOrBuilder {
    public static final int ACTIVE_PILL_FIELD_NUMBER = 3;
    private static final MapWidgets DEFAULT_INSTANCE;
    private static volatile fo<MapWidgets> PARSER = null;
    public static final int SHOW_LOADING_INDICATOR_FIELD_NUMBER = 2;
    public static final int SHOW_SPEEDOMETER_FIELD_NUMBER = 1;
    private Pill activePill_;
    private int bitField0_;
    private boolean showLoadingIndicator_;
    private boolean showSpeedometer_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.MapWidgets$1, reason: invalid class name */
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
    public interface PillOrBuilder extends fj {
        NativeBitmap getImage();

        Pill.Type getType();

        int getTypeValue();

        boolean hasImage();
    }

    static {
        MapWidgets mapWidgets = new MapWidgets();
        DEFAULT_INSTANCE = mapWidgets;
        du.registerDefaultInstance(MapWidgets.class, mapWidgets);
    }

    private MapWidgets() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivePill() {
        this.activePill_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowLoadingIndicator() {
        this.showLoadingIndicator_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowSpeedometer() {
        this.showSpeedometer_ = false;
    }

    public static MapWidgets getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActivePill(Pill pill) {
        Objects.requireNonNull(pill);
        Pill pill2 = this.activePill_;
        if (pill2 != null && pill2 != Pill.getDefaultInstance()) {
            Pill.Builder builderNewBuilder = Pill.newBuilder(pill2);
            builderNewBuilder.mergeFrom((Pill.Builder) pill);
            pill = builderNewBuilder.buildPartial();
        }
        this.activePill_ = pill;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MapWidgets parseDelimitedFrom(InputStream inputStream) {
        return (MapWidgets) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapWidgets parseFrom(v vVar) {
        return (MapWidgets) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<MapWidgets> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivePill(Pill pill) {
        Objects.requireNonNull(pill);
        this.activePill_ = pill;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowLoadingIndicator(boolean z) {
        this.showLoadingIndicator_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowSpeedometer(boolean z) {
        this.showSpeedometer_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003ဉ\u0000", new Object[]{"bitField0_", "showSpeedometer_", "showLoadingIndicator_", "activePill_"});
        }
        if (iOrdinal == 3) {
            return new MapWidgets();
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
        fo<MapWidgets> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (MapWidgets.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.MapWidgetsOrBuilder
    public Pill getActivePill() {
        Pill pill = this.activePill_;
        return pill == null ? Pill.getDefaultInstance() : pill;
    }

    @Override // com.waze.jni.protos.map.MapWidgetsOrBuilder
    public boolean getShowLoadingIndicator() {
        return this.showLoadingIndicator_;
    }

    @Override // com.waze.jni.protos.map.MapWidgetsOrBuilder
    public boolean getShowSpeedometer() {
        return this.showSpeedometer_;
    }

    @Override // com.waze.jni.protos.map.MapWidgetsOrBuilder
    public boolean hasActivePill() {
        return (this.bitField0_ & 1) != 0;
    }

    /* compiled from: WazeSource */
    public final class Pill extends du<Pill, Builder> implements PillOrBuilder {
        private static final Pill DEFAULT_INSTANCE;
        public static final int IMAGE_FIELD_NUMBER = 2;
        private static volatile fo<Pill> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private NativeBitmap image_;
        private int type_;

        /* compiled from: WazeSource */
        public enum Type implements eg {
            PILL_TYPE_CURRENT_STREET(0),
            PILL_TYPE_TRAFFIC_METER(1),
            PILL_TYPE_AVG_SPEED_CAM(2),
            UNRECOGNIZED(-1);

            public static final int PILL_TYPE_AVG_SPEED_CAM_VALUE = 2;
            public static final int PILL_TYPE_CURRENT_STREET_VALUE = 0;
            public static final int PILL_TYPE_TRAFFIC_METER_VALUE = 1;
            private static final eh<Type> internalValueMap = new eh<Type>() { // from class: com.waze.jni.protos.map.MapWidgets.Pill.Type.1
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
                    return PILL_TYPE_CURRENT_STREET;
                }
                if (i2 == 1) {
                    return PILL_TYPE_TRAFFIC_METER;
                }
                if (i2 != 2) {
                    return null;
                }
                return PILL_TYPE_AVG_SPEED_CAM;
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
            Pill pill = new Pill();
            DEFAULT_INSTANCE = pill;
            du.registerDefaultInstance(Pill.class, pill);
        }

        private Pill() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImage() {
            this.image_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static Pill getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeImage(NativeBitmap nativeBitmap) {
            Objects.requireNonNull(nativeBitmap);
            NativeBitmap nativeBitmap2 = this.image_;
            if (nativeBitmap2 != null && nativeBitmap2 != NativeBitmap.getDefaultInstance()) {
                NativeBitmap.Builder builderNewBuilder = NativeBitmap.newBuilder(nativeBitmap2);
                builderNewBuilder.mergeFrom((NativeBitmap.Builder) nativeBitmap);
                nativeBitmap = builderNewBuilder.buildPartial();
            }
            this.image_ = nativeBitmap;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Pill parseDelimitedFrom(InputStream inputStream) {
            return (Pill) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Pill parseFrom(v vVar) {
            return (Pill) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<Pill> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImage(NativeBitmap nativeBitmap) {
            Objects.requireNonNull(nativeBitmap);
            this.image_ = nativeBitmap;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "type_", "image_"});
            }
            if (iOrdinal == 3) {
                return new Pill();
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
            fo<Pill> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (Pill.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.map.MapWidgets.PillOrBuilder
        public NativeBitmap getImage() {
            NativeBitmap nativeBitmap = this.image_;
            return nativeBitmap == null ? NativeBitmap.getDefaultInstance() : nativeBitmap;
        }

        @Override // com.waze.jni.protos.map.MapWidgets.PillOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
        }

        @Override // com.waze.jni.protos.map.MapWidgets.PillOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.waze.jni.protos.map.MapWidgets.PillOrBuilder
        public boolean hasImage() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(Pill pill) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(pill);
        }

        public static Pill parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (Pill) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Pill parseFrom(v vVar, de deVar) {
            return (Pill) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static Pill parseFrom(z zVar) {
            return (Pill) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static Pill parseFrom(z zVar, de deVar) {
            return (Pill) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static Pill parseFrom(InputStream inputStream) {
            return (Pill) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Pill parseFrom(InputStream inputStream, de deVar) {
            return (Pill) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Pill parseFrom(ByteBuffer byteBuffer) {
            return (Pill) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Pill parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (Pill) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<Pill, Builder> implements PillOrBuilder {
            private Builder() {
                super(Pill.DEFAULT_INSTANCE);
            }

            public Builder clearImage() {
                copyOnWrite();
                ((Pill) this.instance).clearImage();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((Pill) this.instance).clearType();
                return this;
            }

            @Override // com.waze.jni.protos.map.MapWidgets.PillOrBuilder
            public NativeBitmap getImage() {
                return ((Pill) this.instance).getImage();
            }

            @Override // com.waze.jni.protos.map.MapWidgets.PillOrBuilder
            public Type getType() {
                return ((Pill) this.instance).getType();
            }

            @Override // com.waze.jni.protos.map.MapWidgets.PillOrBuilder
            public int getTypeValue() {
                return ((Pill) this.instance).getTypeValue();
            }

            @Override // com.waze.jni.protos.map.MapWidgets.PillOrBuilder
            public boolean hasImage() {
                return ((Pill) this.instance).hasImage();
            }

            public Builder mergeImage(NativeBitmap nativeBitmap) {
                copyOnWrite();
                ((Pill) this.instance).mergeImage(nativeBitmap);
                return this;
            }

            public Builder setImage(NativeBitmap.Builder builder) {
                copyOnWrite();
                ((Pill) this.instance).setImage(builder.build());
                return this;
            }

            public Builder setType(Type type) {
                copyOnWrite();
                ((Pill) this.instance).setType(type);
                return this;
            }

            public Builder setTypeValue(int i2) {
                copyOnWrite();
                ((Pill) this.instance).setTypeValue(i2);
                return this;
            }

            public Builder setImage(NativeBitmap nativeBitmap) {
                copyOnWrite();
                ((Pill) this.instance).setImage(nativeBitmap);
                return this;
            }
        }

        public static Pill parseFrom(byte[] bArr) {
            return (Pill) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Pill parseFrom(byte[] bArr, de deVar) {
            return (Pill) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(MapWidgets mapWidgets) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(mapWidgets);
    }

    public static MapWidgets parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (MapWidgets) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapWidgets parseFrom(v vVar, de deVar) {
        return (MapWidgets) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static MapWidgets parseFrom(z zVar) {
        return (MapWidgets) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static MapWidgets parseFrom(z zVar, de deVar) {
        return (MapWidgets) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static MapWidgets parseFrom(InputStream inputStream) {
        return (MapWidgets) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MapWidgets parseFrom(InputStream inputStream, de deVar) {
        return (MapWidgets) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static MapWidgets parseFrom(ByteBuffer byteBuffer) {
        return (MapWidgets) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MapWidgets parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (MapWidgets) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<MapWidgets, Builder> implements MapWidgetsOrBuilder {
        private Builder() {
            super(MapWidgets.DEFAULT_INSTANCE);
        }

        public Builder clearActivePill() {
            copyOnWrite();
            ((MapWidgets) this.instance).clearActivePill();
            return this;
        }

        public Builder clearShowLoadingIndicator() {
            copyOnWrite();
            ((MapWidgets) this.instance).clearShowLoadingIndicator();
            return this;
        }

        public Builder clearShowSpeedometer() {
            copyOnWrite();
            ((MapWidgets) this.instance).clearShowSpeedometer();
            return this;
        }

        @Override // com.waze.jni.protos.map.MapWidgetsOrBuilder
        public Pill getActivePill() {
            return ((MapWidgets) this.instance).getActivePill();
        }

        @Override // com.waze.jni.protos.map.MapWidgetsOrBuilder
        public boolean getShowLoadingIndicator() {
            return ((MapWidgets) this.instance).getShowLoadingIndicator();
        }

        @Override // com.waze.jni.protos.map.MapWidgetsOrBuilder
        public boolean getShowSpeedometer() {
            return ((MapWidgets) this.instance).getShowSpeedometer();
        }

        @Override // com.waze.jni.protos.map.MapWidgetsOrBuilder
        public boolean hasActivePill() {
            return ((MapWidgets) this.instance).hasActivePill();
        }

        public Builder mergeActivePill(Pill pill) {
            copyOnWrite();
            ((MapWidgets) this.instance).mergeActivePill(pill);
            return this;
        }

        public Builder setActivePill(Pill.Builder builder) {
            copyOnWrite();
            ((MapWidgets) this.instance).setActivePill(builder.build());
            return this;
        }

        public Builder setShowLoadingIndicator(boolean z) {
            copyOnWrite();
            ((MapWidgets) this.instance).setShowLoadingIndicator(z);
            return this;
        }

        public Builder setShowSpeedometer(boolean z) {
            copyOnWrite();
            ((MapWidgets) this.instance).setShowSpeedometer(z);
            return this;
        }

        public Builder setActivePill(Pill pill) {
            copyOnWrite();
            ((MapWidgets) this.instance).setActivePill(pill);
            return this;
        }
    }

    public static MapWidgets parseFrom(byte[] bArr) {
        return (MapWidgets) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MapWidgets parseFrom(byte[] bArr, de deVar) {
        return (MapWidgets) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
