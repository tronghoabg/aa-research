package com.waze.jni.protos.navigate;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.navigate.Instruction;
import com.waze.jni.protos.navigate.NavigationRoadSign;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationItem extends du<NavigationItem, Builder> implements NavigationItemOrBuilder {
    public static final int ADDRESS_FIELD_NUMBER = 3;
    private static final NavigationItem DEFAULT_INSTANCE;
    public static final int DISTANCE_FIELD_NUMBER = 2;
    public static final int HOV_FIELD_NUMBER = 10;
    public static final int ICON_FIELD_NUMBER = 4;
    public static final int INSTRUCTIONEXIT_FIELD_NUMBER = 6;
    public static final int INSTRUCTIONSEGMENTIDX_FIELD_NUMBER = 12;
    public static final int INSTRUCTION_FIELD_NUMBER = 5;
    public static final int LABEL_FIELD_NUMBER = 1;
    public static final int LAT_FIELD_NUMBER = 7;
    public static final int LON_FIELD_NUMBER = 8;
    public static final int NAVSEGMENTIDX_FIELD_NUMBER = 11;
    private static volatile fo<NavigationItem> PARSER = null;
    public static final int ROADSIGN_FIELD_NUMBER = 13;
    public static final int ROTATION_FIELD_NUMBER = 9;
    private int bitField0_;
    private boolean hov_;
    private int instructionExit_;
    private int instructionSegmentIdx_;
    private int instruction_;
    private int lat_;
    private int lon_;
    private int navSegmentIdx_;
    private NavigationRoadSign roadSign_;
    private int rotation_;
    private String label_ = "";
    private String distance_ = "";
    private String address_ = "";
    private String icon_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.NavigationItem$1, reason: invalid class name */
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

    static {
        NavigationItem navigationItem = new NavigationItem();
        DEFAULT_INSTANCE = navigationItem;
        du.registerDefaultInstance(NavigationItem.class, navigationItem);
    }

    private NavigationItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddress() {
        this.address_ = getDefaultInstance().getAddress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistance() {
        this.distance_ = getDefaultInstance().getDistance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHov() {
        this.hov_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstruction() {
        this.instruction_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstructionExit() {
        this.instructionExit_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstructionSegmentIdx() {
        this.instructionSegmentIdx_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = getDefaultInstance().getLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLat() {
        this.lat_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLon() {
        this.lon_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavSegmentIdx() {
        this.navSegmentIdx_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadSign() {
        this.roadSign_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRotation() {
        this.rotation_ = 0;
    }

    public static NavigationItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoadSign(NavigationRoadSign navigationRoadSign) {
        Objects.requireNonNull(navigationRoadSign);
        NavigationRoadSign navigationRoadSign2 = this.roadSign_;
        if (navigationRoadSign2 != null && navigationRoadSign2 != NavigationRoadSign.getDefaultInstance()) {
            NavigationRoadSign.Builder builderNewBuilder = NavigationRoadSign.newBuilder(navigationRoadSign2);
            builderNewBuilder.mergeFrom((NavigationRoadSign.Builder) navigationRoadSign);
            navigationRoadSign = builderNewBuilder.buildPartial();
        }
        this.roadSign_ = navigationRoadSign;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NavigationItem parseDelimitedFrom(InputStream inputStream) {
        return (NavigationItem) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationItem parseFrom(v vVar) {
        return (NavigationItem) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NavigationItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddress(String str) {
        Objects.requireNonNull(str);
        this.address_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.address_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistance(String str) {
        Objects.requireNonNull(str);
        this.distance_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.distance_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHov(boolean z) {
        this.hov_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        Objects.requireNonNull(str);
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.icon_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstruction(Instruction.Type type) {
        this.instruction_ = type.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstructionExit(int i2) {
        this.instructionExit_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstructionSegmentIdx(int i2) {
        this.instructionSegmentIdx_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstructionValue(int i2) {
        this.instruction_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(String str) {
        Objects.requireNonNull(str);
        this.label_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.label_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLat(int i2) {
        this.lat_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLon(int i2) {
        this.lon_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavSegmentIdx(int i2) {
        this.navSegmentIdx_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadSign(NavigationRoadSign navigationRoadSign) {
        Objects.requireNonNull(navigationRoadSign);
        this.roadSign_ = navigationRoadSign;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRotation(int i2) {
        this.rotation_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f\u0006\u0004\u0007\u0004\b\u0004\t\u0004\n\u0007\u000b\u0004\f\u0004\rဉ\u0000", new Object[]{"bitField0_", "label_", "distance_", "address_", "icon_", "instruction_", "instructionExit_", "lat_", "lon_", "rotation_", "hov_", "navSegmentIdx_", "instructionSegmentIdx_", "roadSign_"});
        }
        if (iOrdinal == 3) {
            return new NavigationItem();
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
        fo<NavigationItem> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NavigationItem.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
    public String getAddress() {
        return this.address_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
    public v getAddressBytes() {
        return v.s(this.address_);
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
    public String getDistance() {
        return this.distance_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
    public v getDistanceBytes() {
        return v.s(this.distance_);
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
    public boolean getHov() {
        return this.hov_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
    public String getIcon() {
        return this.icon_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
    public v getIconBytes() {
        return v.s(this.icon_);
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
    public Instruction.Type getInstruction() {
        Instruction.Type typeForNumber = Instruction.Type.forNumber(this.instruction_);
        return typeForNumber == null ? Instruction.Type.UNRECOGNIZED : typeForNumber;
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
    public int getInstructionExit() {
        return this.instructionExit_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
    public int getInstructionSegmentIdx() {
        return this.instructionSegmentIdx_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
    public int getInstructionValue() {
        return this.instruction_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
    public String getLabel() {
        return this.label_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
    public v getLabelBytes() {
        return v.s(this.label_);
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
    public int getLat() {
        return this.lat_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
    public int getLon() {
        return this.lon_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
    public int getNavSegmentIdx() {
        return this.navSegmentIdx_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
    public NavigationRoadSign getRoadSign() {
        NavigationRoadSign navigationRoadSign = this.roadSign_;
        return navigationRoadSign == null ? NavigationRoadSign.getDefaultInstance() : navigationRoadSign;
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
    public int getRotation() {
        return this.rotation_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
    public boolean hasRoadSign() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(NavigationItem navigationItem) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(navigationItem);
    }

    public static NavigationItem parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NavigationItem) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationItem parseFrom(v vVar, de deVar) {
        return (NavigationItem) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NavigationItem parseFrom(z zVar) {
        return (NavigationItem) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NavigationItem parseFrom(z zVar, de deVar) {
        return (NavigationItem) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NavigationItem parseFrom(InputStream inputStream) {
        return (NavigationItem) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationItem parseFrom(InputStream inputStream, de deVar) {
        return (NavigationItem) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationItem parseFrom(ByteBuffer byteBuffer) {
        return (NavigationItem) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NavigationItem parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NavigationItem) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NavigationItem, Builder> implements NavigationItemOrBuilder {
        private Builder() {
            super(NavigationItem.DEFAULT_INSTANCE);
        }

        public Builder clearAddress() {
            copyOnWrite();
            ((NavigationItem) this.instance).clearAddress();
            return this;
        }

        public Builder clearDistance() {
            copyOnWrite();
            ((NavigationItem) this.instance).clearDistance();
            return this;
        }

        public Builder clearHov() {
            copyOnWrite();
            ((NavigationItem) this.instance).clearHov();
            return this;
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((NavigationItem) this.instance).clearIcon();
            return this;
        }

        public Builder clearInstruction() {
            copyOnWrite();
            ((NavigationItem) this.instance).clearInstruction();
            return this;
        }

        public Builder clearInstructionExit() {
            copyOnWrite();
            ((NavigationItem) this.instance).clearInstructionExit();
            return this;
        }

        public Builder clearInstructionSegmentIdx() {
            copyOnWrite();
            ((NavigationItem) this.instance).clearInstructionSegmentIdx();
            return this;
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((NavigationItem) this.instance).clearLabel();
            return this;
        }

        public Builder clearLat() {
            copyOnWrite();
            ((NavigationItem) this.instance).clearLat();
            return this;
        }

        public Builder clearLon() {
            copyOnWrite();
            ((NavigationItem) this.instance).clearLon();
            return this;
        }

        public Builder clearNavSegmentIdx() {
            copyOnWrite();
            ((NavigationItem) this.instance).clearNavSegmentIdx();
            return this;
        }

        public Builder clearRoadSign() {
            copyOnWrite();
            ((NavigationItem) this.instance).clearRoadSign();
            return this;
        }

        public Builder clearRotation() {
            copyOnWrite();
            ((NavigationItem) this.instance).clearRotation();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
        public String getAddress() {
            return ((NavigationItem) this.instance).getAddress();
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
        public v getAddressBytes() {
            return ((NavigationItem) this.instance).getAddressBytes();
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
        public String getDistance() {
            return ((NavigationItem) this.instance).getDistance();
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
        public v getDistanceBytes() {
            return ((NavigationItem) this.instance).getDistanceBytes();
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
        public boolean getHov() {
            return ((NavigationItem) this.instance).getHov();
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
        public String getIcon() {
            return ((NavigationItem) this.instance).getIcon();
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
        public v getIconBytes() {
            return ((NavigationItem) this.instance).getIconBytes();
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
        public Instruction.Type getInstruction() {
            return ((NavigationItem) this.instance).getInstruction();
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
        public int getInstructionExit() {
            return ((NavigationItem) this.instance).getInstructionExit();
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
        public int getInstructionSegmentIdx() {
            return ((NavigationItem) this.instance).getInstructionSegmentIdx();
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
        public int getInstructionValue() {
            return ((NavigationItem) this.instance).getInstructionValue();
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
        public String getLabel() {
            return ((NavigationItem) this.instance).getLabel();
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
        public v getLabelBytes() {
            return ((NavigationItem) this.instance).getLabelBytes();
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
        public int getLat() {
            return ((NavigationItem) this.instance).getLat();
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
        public int getLon() {
            return ((NavigationItem) this.instance).getLon();
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
        public int getNavSegmentIdx() {
            return ((NavigationItem) this.instance).getNavSegmentIdx();
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
        public NavigationRoadSign getRoadSign() {
            return ((NavigationItem) this.instance).getRoadSign();
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
        public int getRotation() {
            return ((NavigationItem) this.instance).getRotation();
        }

        @Override // com.waze.jni.protos.navigate.NavigationItemOrBuilder
        public boolean hasRoadSign() {
            return ((NavigationItem) this.instance).hasRoadSign();
        }

        public Builder mergeRoadSign(NavigationRoadSign navigationRoadSign) {
            copyOnWrite();
            ((NavigationItem) this.instance).mergeRoadSign(navigationRoadSign);
            return this;
        }

        public Builder setAddress(String str) {
            copyOnWrite();
            ((NavigationItem) this.instance).setAddress(str);
            return this;
        }

        public Builder setAddressBytes(v vVar) {
            copyOnWrite();
            ((NavigationItem) this.instance).setAddressBytes(vVar);
            return this;
        }

        public Builder setDistance(String str) {
            copyOnWrite();
            ((NavigationItem) this.instance).setDistance(str);
            return this;
        }

        public Builder setDistanceBytes(v vVar) {
            copyOnWrite();
            ((NavigationItem) this.instance).setDistanceBytes(vVar);
            return this;
        }

        public Builder setHov(boolean z) {
            copyOnWrite();
            ((NavigationItem) this.instance).setHov(z);
            return this;
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((NavigationItem) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(v vVar) {
            copyOnWrite();
            ((NavigationItem) this.instance).setIconBytes(vVar);
            return this;
        }

        public Builder setInstruction(Instruction.Type type) {
            copyOnWrite();
            ((NavigationItem) this.instance).setInstruction(type);
            return this;
        }

        public Builder setInstructionExit(int i2) {
            copyOnWrite();
            ((NavigationItem) this.instance).setInstructionExit(i2);
            return this;
        }

        public Builder setInstructionSegmentIdx(int i2) {
            copyOnWrite();
            ((NavigationItem) this.instance).setInstructionSegmentIdx(i2);
            return this;
        }

        public Builder setInstructionValue(int i2) {
            copyOnWrite();
            ((NavigationItem) this.instance).setInstructionValue(i2);
            return this;
        }

        public Builder setLabel(String str) {
            copyOnWrite();
            ((NavigationItem) this.instance).setLabel(str);
            return this;
        }

        public Builder setLabelBytes(v vVar) {
            copyOnWrite();
            ((NavigationItem) this.instance).setLabelBytes(vVar);
            return this;
        }

        public Builder setLat(int i2) {
            copyOnWrite();
            ((NavigationItem) this.instance).setLat(i2);
            return this;
        }

        public Builder setLon(int i2) {
            copyOnWrite();
            ((NavigationItem) this.instance).setLon(i2);
            return this;
        }

        public Builder setNavSegmentIdx(int i2) {
            copyOnWrite();
            ((NavigationItem) this.instance).setNavSegmentIdx(i2);
            return this;
        }

        public Builder setRoadSign(NavigationRoadSign.Builder builder) {
            copyOnWrite();
            ((NavigationItem) this.instance).setRoadSign(builder.build());
            return this;
        }

        public Builder setRotation(int i2) {
            copyOnWrite();
            ((NavigationItem) this.instance).setRotation(i2);
            return this;
        }

        public Builder setRoadSign(NavigationRoadSign navigationRoadSign) {
            copyOnWrite();
            ((NavigationItem) this.instance).setRoadSign(navigationRoadSign);
            return this;
        }
    }

    public static NavigationItem parseFrom(byte[] bArr) {
        return (NavigationItem) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NavigationItem parseFrom(byte[] bArr, de deVar) {
        return (NavigationItem) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
