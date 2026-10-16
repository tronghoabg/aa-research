package com.waze.jni.protos.navigate;

import androidx.camera.video.AudioStats;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class Toll extends du<Toll, Builder> implements TollOrBuilder {
    private static final Toll DEFAULT_INSTANCE;
    public static final int DISABLED_FIELD_NUMBER = 8;
    public static final int DYNAMICPRICE_FIELD_NUMBER = 2;
    public static final int FIXEDPRICE_FIELD_NUMBER = 1;
    public static final int MISSINGPASS_FIELD_NUMBER = 4;
    public static final int NOPRICE_FIELD_NUMBER = 3;
    private static volatile fo<Toll> PARSER = null;
    public static final int PRICECHANGEDATTIME_FIELD_NUMBER = 5;
    public static final int PRICECHANGEDBYTIME_FIELD_NUMBER = 6;
    public static final int WITHPASS_FIELD_NUMBER = 7;
    private int typeCase_ = 0;
    private Object type_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.Toll$1, reason: invalid class name */
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
    public interface DisabledOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface DynamicPriceOrBuilder extends fj {
        boolean getPriceShown();
    }

    /* compiled from: WazeSource */
    public interface FixedPriceOrBuilder extends fj {
        double getTollPrice();

        String getTollPriceCurrencyCode();

        v getTollPriceCurrencyCodeBytes();

        boolean hasTollPrice();

        boolean hasTollPriceCurrencyCode();
    }

    /* compiled from: WazeSource */
    public interface MissingPassOrBuilder extends fj {
        String getMissingPassName();

        v getMissingPassNameBytes();

        MissingPass.PriceInfo getPriceInfo();

        boolean hasPriceInfo();
    }

    /* compiled from: WazeSource */
    public interface NoPriceOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public interface PriceChangeAtTimeOrBuilder extends fj {
        FixedPrice getFixedPrice();

        String getRoadName();

        v getRoadNameBytes();

        double getTimeBasedPrice();

        int getTimeBasedPriceChangeAtSeconds();

        boolean hasFixedPrice();
    }

    /* compiled from: WazeSource */
    public interface PriceChangingByTimeOrBuilder extends fj {
        String getRoadName();

        v getRoadNameBytes();
    }

    /* compiled from: WazeSource */
    public enum TypeCase {
        FIXEDPRICE(1),
        DYNAMICPRICE(2),
        NOPRICE(3),
        MISSINGPASS(4),
        PRICECHANGEDATTIME(5),
        PRICECHANGEDBYTIME(6),
        WITHPASS(7),
        DISABLED(8),
        TYPE_NOT_SET(0);

        private final int value;

        TypeCase(int i2) {
            this.value = i2;
        }

        public static TypeCase forNumber(int i2) {
            switch (i2) {
                case 0:
                    return TYPE_NOT_SET;
                case 1:
                    return FIXEDPRICE;
                case 2:
                    return DYNAMICPRICE;
                case 3:
                    return NOPRICE;
                case 4:
                    return MISSINGPASS;
                case 5:
                    return PRICECHANGEDATTIME;
                case 6:
                    return PRICECHANGEDBYTIME;
                case 7:
                    return WITHPASS;
                case 8:
                    return DISABLED;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }
    }

    /* compiled from: WazeSource */
    public interface WithPassOrBuilder extends fj {
        FixedPrice getFixedPrice();

        String getName();

        v getNameBytes();

        boolean hasFixedPrice();
    }

    static {
        Toll toll = new Toll();
        DEFAULT_INSTANCE = toll;
        du.registerDefaultInstance(Toll.class, toll);
    }

    private Toll() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisabled() {
        if (this.typeCase_ == 8) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDynamicPrice() {
        if (this.typeCase_ == 2) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFixedPrice() {
        if (this.typeCase_ == 1) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMissingPass() {
        if (this.typeCase_ == 4) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoPrice() {
        if (this.typeCase_ == 3) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceChangedAtTime() {
        if (this.typeCase_ == 5) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceChangedByTime() {
        if (this.typeCase_ == 6) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.typeCase_ = 0;
        this.type_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWithPass() {
        if (this.typeCase_ == 7) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    public static Toll getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDisabled(Disabled disabled) {
        Objects.requireNonNull(disabled);
        if (this.typeCase_ == 8 && this.type_ != Disabled.getDefaultInstance()) {
            Disabled.Builder builderNewBuilder = Disabled.newBuilder((Disabled) this.type_);
            builderNewBuilder.mergeFrom((Disabled.Builder) disabled);
            disabled = builderNewBuilder.buildPartial();
        }
        this.type_ = disabled;
        this.typeCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDynamicPrice(DynamicPrice dynamicPrice) {
        Objects.requireNonNull(dynamicPrice);
        if (this.typeCase_ == 2 && this.type_ != DynamicPrice.getDefaultInstance()) {
            DynamicPrice.Builder builderNewBuilder = DynamicPrice.newBuilder((DynamicPrice) this.type_);
            builderNewBuilder.mergeFrom((DynamicPrice.Builder) dynamicPrice);
            dynamicPrice = builderNewBuilder.buildPartial();
        }
        this.type_ = dynamicPrice;
        this.typeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFixedPrice(FixedPrice fixedPrice) {
        Objects.requireNonNull(fixedPrice);
        if (this.typeCase_ == 1 && this.type_ != FixedPrice.getDefaultInstance()) {
            FixedPrice.Builder builderNewBuilder = FixedPrice.newBuilder((FixedPrice) this.type_);
            builderNewBuilder.mergeFrom((FixedPrice.Builder) fixedPrice);
            fixedPrice = builderNewBuilder.buildPartial();
        }
        this.type_ = fixedPrice;
        this.typeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMissingPass(MissingPass missingPass) {
        Objects.requireNonNull(missingPass);
        if (this.typeCase_ == 4 && this.type_ != MissingPass.getDefaultInstance()) {
            MissingPass.Builder builderNewBuilder = MissingPass.newBuilder((MissingPass) this.type_);
            builderNewBuilder.mergeFrom((MissingPass.Builder) missingPass);
            missingPass = builderNewBuilder.buildPartial();
        }
        this.type_ = missingPass;
        this.typeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNoPrice(NoPrice noPrice) {
        Objects.requireNonNull(noPrice);
        if (this.typeCase_ == 3 && this.type_ != NoPrice.getDefaultInstance()) {
            NoPrice.Builder builderNewBuilder = NoPrice.newBuilder((NoPrice) this.type_);
            builderNewBuilder.mergeFrom((NoPrice.Builder) noPrice);
            noPrice = builderNewBuilder.buildPartial();
        }
        this.type_ = noPrice;
        this.typeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePriceChangedAtTime(PriceChangeAtTime priceChangeAtTime) {
        Objects.requireNonNull(priceChangeAtTime);
        if (this.typeCase_ == 5 && this.type_ != PriceChangeAtTime.getDefaultInstance()) {
            PriceChangeAtTime.Builder builderNewBuilder = PriceChangeAtTime.newBuilder((PriceChangeAtTime) this.type_);
            builderNewBuilder.mergeFrom((PriceChangeAtTime.Builder) priceChangeAtTime);
            priceChangeAtTime = builderNewBuilder.buildPartial();
        }
        this.type_ = priceChangeAtTime;
        this.typeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePriceChangedByTime(PriceChangingByTime priceChangingByTime) {
        Objects.requireNonNull(priceChangingByTime);
        if (this.typeCase_ == 6 && this.type_ != PriceChangingByTime.getDefaultInstance()) {
            PriceChangingByTime.Builder builderNewBuilder = PriceChangingByTime.newBuilder((PriceChangingByTime) this.type_);
            builderNewBuilder.mergeFrom((PriceChangingByTime.Builder) priceChangingByTime);
            priceChangingByTime = builderNewBuilder.buildPartial();
        }
        this.type_ = priceChangingByTime;
        this.typeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWithPass(WithPass withPass) {
        Objects.requireNonNull(withPass);
        if (this.typeCase_ == 7 && this.type_ != WithPass.getDefaultInstance()) {
            WithPass.Builder builderNewBuilder = WithPass.newBuilder((WithPass) this.type_);
            builderNewBuilder.mergeFrom((WithPass.Builder) withPass);
            withPass = builderNewBuilder.buildPartial();
        }
        this.type_ = withPass;
        this.typeCase_ = 7;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Toll parseDelimitedFrom(InputStream inputStream) {
        return (Toll) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Toll parseFrom(v vVar) {
        return (Toll) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<Toll> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisabled(Disabled disabled) {
        Objects.requireNonNull(disabled);
        this.type_ = disabled;
        this.typeCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDynamicPrice(DynamicPrice dynamicPrice) {
        Objects.requireNonNull(dynamicPrice);
        this.type_ = dynamicPrice;
        this.typeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFixedPrice(FixedPrice fixedPrice) {
        Objects.requireNonNull(fixedPrice);
        this.type_ = fixedPrice;
        this.typeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMissingPass(MissingPass missingPass) {
        Objects.requireNonNull(missingPass);
        this.type_ = missingPass;
        this.typeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoPrice(NoPrice noPrice) {
        Objects.requireNonNull(noPrice);
        this.type_ = noPrice;
        this.typeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceChangedAtTime(PriceChangeAtTime priceChangeAtTime) {
        Objects.requireNonNull(priceChangeAtTime);
        this.type_ = priceChangeAtTime;
        this.typeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceChangedByTime(PriceChangingByTime priceChangingByTime) {
        Objects.requireNonNull(priceChangingByTime);
        this.type_ = priceChangingByTime;
        this.typeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWithPass(WithPass withPass) {
        Objects.requireNonNull(withPass);
        this.type_ = withPass;
        this.typeCase_ = 7;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"type_", "typeCase_", FixedPrice.class, DynamicPrice.class, NoPrice.class, MissingPass.class, PriceChangeAtTime.class, PriceChangingByTime.class, WithPass.class, Disabled.class});
        }
        if (iOrdinal == 3) {
            return new Toll();
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
        fo<Toll> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Toll.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.TollOrBuilder
    public Disabled getDisabled() {
        return this.typeCase_ == 8 ? (Disabled) this.type_ : Disabled.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.TollOrBuilder
    public DynamicPrice getDynamicPrice() {
        return this.typeCase_ == 2 ? (DynamicPrice) this.type_ : DynamicPrice.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.TollOrBuilder
    public FixedPrice getFixedPrice() {
        return this.typeCase_ == 1 ? (FixedPrice) this.type_ : FixedPrice.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.TollOrBuilder
    public MissingPass getMissingPass() {
        return this.typeCase_ == 4 ? (MissingPass) this.type_ : MissingPass.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.TollOrBuilder
    public NoPrice getNoPrice() {
        return this.typeCase_ == 3 ? (NoPrice) this.type_ : NoPrice.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.TollOrBuilder
    public PriceChangeAtTime getPriceChangedAtTime() {
        return this.typeCase_ == 5 ? (PriceChangeAtTime) this.type_ : PriceChangeAtTime.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.TollOrBuilder
    public PriceChangingByTime getPriceChangedByTime() {
        return this.typeCase_ == 6 ? (PriceChangingByTime) this.type_ : PriceChangingByTime.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.TollOrBuilder
    public TypeCase getTypeCase() {
        return TypeCase.forNumber(this.typeCase_);
    }

    @Override // com.waze.jni.protos.navigate.TollOrBuilder
    public WithPass getWithPass() {
        return this.typeCase_ == 7 ? (WithPass) this.type_ : WithPass.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.navigate.TollOrBuilder
    public boolean hasDisabled() {
        return this.typeCase_ == 8;
    }

    @Override // com.waze.jni.protos.navigate.TollOrBuilder
    public boolean hasDynamicPrice() {
        return this.typeCase_ == 2;
    }

    @Override // com.waze.jni.protos.navigate.TollOrBuilder
    public boolean hasFixedPrice() {
        return this.typeCase_ == 1;
    }

    @Override // com.waze.jni.protos.navigate.TollOrBuilder
    public boolean hasMissingPass() {
        return this.typeCase_ == 4;
    }

    @Override // com.waze.jni.protos.navigate.TollOrBuilder
    public boolean hasNoPrice() {
        return this.typeCase_ == 3;
    }

    @Override // com.waze.jni.protos.navigate.TollOrBuilder
    public boolean hasPriceChangedAtTime() {
        return this.typeCase_ == 5;
    }

    @Override // com.waze.jni.protos.navigate.TollOrBuilder
    public boolean hasPriceChangedByTime() {
        return this.typeCase_ == 6;
    }

    @Override // com.waze.jni.protos.navigate.TollOrBuilder
    public boolean hasWithPass() {
        return this.typeCase_ == 7;
    }

    /* compiled from: WazeSource */
    public final class MissingPass extends du<MissingPass, Builder> implements MissingPassOrBuilder {
        private static final MissingPass DEFAULT_INSTANCE;
        public static final int MISSINGPASSNAME_FIELD_NUMBER = 1;
        private static volatile fo<MissingPass> PARSER = null;
        public static final int PRICEINFO_FIELD_NUMBER = 2;
        private int bitField0_;
        private String missingPassName_ = "";
        private PriceInfo priceInfo_;

        /* compiled from: WazeSource */
        public interface PriceInfoOrBuilder extends fj {
            FixedPrice getFixedPrice();

            double getPassPrice();

            boolean hasFixedPrice();
        }

        static {
            MissingPass missingPass = new MissingPass();
            DEFAULT_INSTANCE = missingPass;
            du.registerDefaultInstance(MissingPass.class, missingPass);
        }

        private MissingPass() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMissingPassName() {
            this.missingPassName_ = getDefaultInstance().getMissingPassName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPriceInfo() {
            this.priceInfo_ = null;
            this.bitField0_ &= -2;
        }

        public static MissingPass getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePriceInfo(PriceInfo priceInfo) {
            Objects.requireNonNull(priceInfo);
            PriceInfo priceInfo2 = this.priceInfo_;
            if (priceInfo2 != null && priceInfo2 != PriceInfo.getDefaultInstance()) {
                PriceInfo.Builder builderNewBuilder = PriceInfo.newBuilder(priceInfo2);
                builderNewBuilder.mergeFrom((PriceInfo.Builder) priceInfo);
                priceInfo = builderNewBuilder.buildPartial();
            }
            this.priceInfo_ = priceInfo;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MissingPass parseDelimitedFrom(InputStream inputStream) {
            return (MissingPass) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MissingPass parseFrom(v vVar) {
            return (MissingPass) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<MissingPass> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMissingPassName(String str) {
            Objects.requireNonNull(str);
            this.missingPassName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMissingPassNameBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.missingPassName_ = vVar.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPriceInfo(PriceInfo priceInfo) {
            Objects.requireNonNull(priceInfo);
            this.priceInfo_ = priceInfo;
            this.bitField0_ |= 1;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "missingPassName_", "priceInfo_"});
            }
            if (iOrdinal == 3) {
                return new MissingPass();
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
            fo<MissingPass> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (MissingPass.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.navigate.Toll.MissingPassOrBuilder
        public String getMissingPassName() {
            return this.missingPassName_;
        }

        @Override // com.waze.jni.protos.navigate.Toll.MissingPassOrBuilder
        public v getMissingPassNameBytes() {
            return v.s(this.missingPassName_);
        }

        @Override // com.waze.jni.protos.navigate.Toll.MissingPassOrBuilder
        public PriceInfo getPriceInfo() {
            PriceInfo priceInfo = this.priceInfo_;
            return priceInfo == null ? PriceInfo.getDefaultInstance() : priceInfo;
        }

        @Override // com.waze.jni.protos.navigate.Toll.MissingPassOrBuilder
        public boolean hasPriceInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        /* compiled from: WazeSource */
        public final class PriceInfo extends du<PriceInfo, Builder> implements PriceInfoOrBuilder {
            private static final PriceInfo DEFAULT_INSTANCE;
            public static final int FIXEDPRICE_FIELD_NUMBER = 1;
            private static volatile fo<PriceInfo> PARSER = null;
            public static final int PASSPRICE_FIELD_NUMBER = 2;
            private int bitField0_;
            private FixedPrice fixedPrice_;
            private double passPrice_;

            static {
                PriceInfo priceInfo = new PriceInfo();
                DEFAULT_INSTANCE = priceInfo;
                du.registerDefaultInstance(PriceInfo.class, priceInfo);
            }

            private PriceInfo() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearFixedPrice() {
                this.fixedPrice_ = null;
                this.bitField0_ &= -2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPassPrice() {
                this.passPrice_ = AudioStats.AUDIO_AMPLITUDE_NONE;
            }

            public static PriceInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeFixedPrice(FixedPrice fixedPrice) {
                Objects.requireNonNull(fixedPrice);
                FixedPrice fixedPrice2 = this.fixedPrice_;
                if (fixedPrice2 != null && fixedPrice2 != FixedPrice.getDefaultInstance()) {
                    FixedPrice.Builder builderNewBuilder = FixedPrice.newBuilder(fixedPrice2);
                    builderNewBuilder.mergeFrom((FixedPrice.Builder) fixedPrice);
                    fixedPrice = builderNewBuilder.buildPartial();
                }
                this.fixedPrice_ = fixedPrice;
                this.bitField0_ |= 1;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static PriceInfo parseDelimitedFrom(InputStream inputStream) {
                return (PriceInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PriceInfo parseFrom(v vVar) {
                return (PriceInfo) du.parseFrom(DEFAULT_INSTANCE, vVar);
            }

            public static fo<PriceInfo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setFixedPrice(FixedPrice fixedPrice) {
                Objects.requireNonNull(fixedPrice);
                this.fixedPrice_ = fixedPrice;
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPassPrice(double d2) {
                this.passPrice_ = d2;
            }

            @Override // com.google.v.du
            protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
                fo dnVar;
                int iOrdinal = dtVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000", new Object[]{"bitField0_", "fixedPrice_", "passPrice_"});
                }
                if (iOrdinal == 3) {
                    return new PriceInfo();
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
                fo<PriceInfo> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (PriceInfo.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            }

            @Override // com.waze.jni.protos.navigate.Toll.MissingPass.PriceInfoOrBuilder
            public FixedPrice getFixedPrice() {
                FixedPrice fixedPrice = this.fixedPrice_;
                return fixedPrice == null ? FixedPrice.getDefaultInstance() : fixedPrice;
            }

            @Override // com.waze.jni.protos.navigate.Toll.MissingPass.PriceInfoOrBuilder
            public double getPassPrice() {
                return this.passPrice_;
            }

            @Override // com.waze.jni.protos.navigate.Toll.MissingPass.PriceInfoOrBuilder
            public boolean hasFixedPrice() {
                return (this.bitField0_ & 1) != 0;
            }

            public static Builder newBuilder(PriceInfo priceInfo) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(priceInfo);
            }

            public static PriceInfo parseDelimitedFrom(InputStream inputStream, de deVar) {
                return (PriceInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
            }

            public static PriceInfo parseFrom(v vVar, de deVar) {
                return (PriceInfo) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
            }

            public static PriceInfo parseFrom(z zVar) {
                return (PriceInfo) du.parseFrom(DEFAULT_INSTANCE, zVar);
            }

            public static PriceInfo parseFrom(z zVar, de deVar) {
                return (PriceInfo) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
            }

            public static PriceInfo parseFrom(InputStream inputStream) {
                return (PriceInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PriceInfo parseFrom(InputStream inputStream, de deVar) {
                return (PriceInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
            }

            public static PriceInfo parseFrom(ByteBuffer byteBuffer) {
                return (PriceInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static PriceInfo parseFrom(ByteBuffer byteBuffer, de deVar) {
                return (PriceInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
            }

            /* compiled from: WazeSource */
            public final class Builder extends dm<PriceInfo, Builder> implements PriceInfoOrBuilder {
                private Builder() {
                    super(PriceInfo.DEFAULT_INSTANCE);
                }

                public Builder clearFixedPrice() {
                    copyOnWrite();
                    ((PriceInfo) this.instance).clearFixedPrice();
                    return this;
                }

                public Builder clearPassPrice() {
                    copyOnWrite();
                    ((PriceInfo) this.instance).clearPassPrice();
                    return this;
                }

                @Override // com.waze.jni.protos.navigate.Toll.MissingPass.PriceInfoOrBuilder
                public FixedPrice getFixedPrice() {
                    return ((PriceInfo) this.instance).getFixedPrice();
                }

                @Override // com.waze.jni.protos.navigate.Toll.MissingPass.PriceInfoOrBuilder
                public double getPassPrice() {
                    return ((PriceInfo) this.instance).getPassPrice();
                }

                @Override // com.waze.jni.protos.navigate.Toll.MissingPass.PriceInfoOrBuilder
                public boolean hasFixedPrice() {
                    return ((PriceInfo) this.instance).hasFixedPrice();
                }

                public Builder mergeFixedPrice(FixedPrice fixedPrice) {
                    copyOnWrite();
                    ((PriceInfo) this.instance).mergeFixedPrice(fixedPrice);
                    return this;
                }

                public Builder setFixedPrice(FixedPrice.Builder builder) {
                    copyOnWrite();
                    ((PriceInfo) this.instance).setFixedPrice(builder.build());
                    return this;
                }

                public Builder setPassPrice(double d2) {
                    copyOnWrite();
                    ((PriceInfo) this.instance).setPassPrice(d2);
                    return this;
                }

                public Builder setFixedPrice(FixedPrice fixedPrice) {
                    copyOnWrite();
                    ((PriceInfo) this.instance).setFixedPrice(fixedPrice);
                    return this;
                }
            }

            public static PriceInfo parseFrom(byte[] bArr) {
                return (PriceInfo) du.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PriceInfo parseFrom(byte[] bArr, de deVar) {
                return (PriceInfo) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
            }
        }

        public static Builder newBuilder(MissingPass missingPass) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(missingPass);
        }

        public static MissingPass parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (MissingPass) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static MissingPass parseFrom(v vVar, de deVar) {
            return (MissingPass) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static MissingPass parseFrom(z zVar) {
            return (MissingPass) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static MissingPass parseFrom(z zVar, de deVar) {
            return (MissingPass) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static MissingPass parseFrom(InputStream inputStream) {
            return (MissingPass) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MissingPass parseFrom(InputStream inputStream, de deVar) {
            return (MissingPass) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static MissingPass parseFrom(ByteBuffer byteBuffer) {
            return (MissingPass) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MissingPass parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (MissingPass) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<MissingPass, Builder> implements MissingPassOrBuilder {
            private Builder() {
                super(MissingPass.DEFAULT_INSTANCE);
            }

            public Builder clearMissingPassName() {
                copyOnWrite();
                ((MissingPass) this.instance).clearMissingPassName();
                return this;
            }

            public Builder clearPriceInfo() {
                copyOnWrite();
                ((MissingPass) this.instance).clearPriceInfo();
                return this;
            }

            @Override // com.waze.jni.protos.navigate.Toll.MissingPassOrBuilder
            public String getMissingPassName() {
                return ((MissingPass) this.instance).getMissingPassName();
            }

            @Override // com.waze.jni.protos.navigate.Toll.MissingPassOrBuilder
            public v getMissingPassNameBytes() {
                return ((MissingPass) this.instance).getMissingPassNameBytes();
            }

            @Override // com.waze.jni.protos.navigate.Toll.MissingPassOrBuilder
            public PriceInfo getPriceInfo() {
                return ((MissingPass) this.instance).getPriceInfo();
            }

            @Override // com.waze.jni.protos.navigate.Toll.MissingPassOrBuilder
            public boolean hasPriceInfo() {
                return ((MissingPass) this.instance).hasPriceInfo();
            }

            public Builder mergePriceInfo(PriceInfo priceInfo) {
                copyOnWrite();
                ((MissingPass) this.instance).mergePriceInfo(priceInfo);
                return this;
            }

            public Builder setMissingPassName(String str) {
                copyOnWrite();
                ((MissingPass) this.instance).setMissingPassName(str);
                return this;
            }

            public Builder setMissingPassNameBytes(v vVar) {
                copyOnWrite();
                ((MissingPass) this.instance).setMissingPassNameBytes(vVar);
                return this;
            }

            public Builder setPriceInfo(PriceInfo.Builder builder) {
                copyOnWrite();
                ((MissingPass) this.instance).setPriceInfo(builder.build());
                return this;
            }

            public Builder setPriceInfo(PriceInfo priceInfo) {
                copyOnWrite();
                ((MissingPass) this.instance).setPriceInfo(priceInfo);
                return this;
            }
        }

        public static MissingPass parseFrom(byte[] bArr) {
            return (MissingPass) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MissingPass parseFrom(byte[] bArr, de deVar) {
            return (MissingPass) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class Disabled extends du<Disabled, Builder> implements DisabledOrBuilder {
        private static final Disabled DEFAULT_INSTANCE;
        private static volatile fo<Disabled> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<Disabled, Builder> implements DisabledOrBuilder {
            private Builder() {
                super(Disabled.DEFAULT_INSTANCE);
            }
        }

        static {
            Disabled disabled = new Disabled();
            DEFAULT_INSTANCE = disabled;
            du.registerDefaultInstance(Disabled.class, disabled);
        }

        private Disabled() {
        }

        public static Disabled getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Disabled parseDelimitedFrom(InputStream inputStream) {
            return (Disabled) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Disabled parseFrom(v vVar) {
            return (Disabled) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<Disabled> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new Disabled();
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
            fo<Disabled> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (Disabled.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(Disabled disabled) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(disabled);
        }

        public static Disabled parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (Disabled) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Disabled parseFrom(v vVar, de deVar) {
            return (Disabled) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static Disabled parseFrom(z zVar) {
            return (Disabled) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static Disabled parseFrom(z zVar, de deVar) {
            return (Disabled) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static Disabled parseFrom(InputStream inputStream) {
            return (Disabled) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Disabled parseFrom(InputStream inputStream, de deVar) {
            return (Disabled) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Disabled parseFrom(ByteBuffer byteBuffer) {
            return (Disabled) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Disabled parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (Disabled) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static Disabled parseFrom(byte[] bArr) {
            return (Disabled) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Disabled parseFrom(byte[] bArr, de deVar) {
            return (Disabled) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class DynamicPrice extends du<DynamicPrice, Builder> implements DynamicPriceOrBuilder {
        private static final DynamicPrice DEFAULT_INSTANCE;
        private static volatile fo<DynamicPrice> PARSER = null;
        public static final int PRICESHOWN_FIELD_NUMBER = 1;
        private boolean priceShown_;

        /* compiled from: WazeSource */
        public final class Builder extends dm<DynamicPrice, Builder> implements DynamicPriceOrBuilder {
            private Builder() {
                super(DynamicPrice.DEFAULT_INSTANCE);
            }

            public Builder clearPriceShown() {
                copyOnWrite();
                ((DynamicPrice) this.instance).clearPriceShown();
                return this;
            }

            @Override // com.waze.jni.protos.navigate.Toll.DynamicPriceOrBuilder
            public boolean getPriceShown() {
                return ((DynamicPrice) this.instance).getPriceShown();
            }

            public Builder setPriceShown(boolean z) {
                copyOnWrite();
                ((DynamicPrice) this.instance).setPriceShown(z);
                return this;
            }
        }

        static {
            DynamicPrice dynamicPrice = new DynamicPrice();
            DEFAULT_INSTANCE = dynamicPrice;
            du.registerDefaultInstance(DynamicPrice.class, dynamicPrice);
        }

        private DynamicPrice() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPriceShown() {
            this.priceShown_ = false;
        }

        public static DynamicPrice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DynamicPrice parseDelimitedFrom(InputStream inputStream) {
            return (DynamicPrice) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DynamicPrice parseFrom(v vVar) {
            return (DynamicPrice) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<DynamicPrice> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPriceShown(boolean z) {
            this.priceShown_ = z;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"priceShown_"});
            }
            if (iOrdinal == 3) {
                return new DynamicPrice();
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
            fo<DynamicPrice> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (DynamicPrice.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.navigate.Toll.DynamicPriceOrBuilder
        public boolean getPriceShown() {
            return this.priceShown_;
        }

        public static Builder newBuilder(DynamicPrice dynamicPrice) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(dynamicPrice);
        }

        public static DynamicPrice parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (DynamicPrice) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static DynamicPrice parseFrom(v vVar, de deVar) {
            return (DynamicPrice) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static DynamicPrice parseFrom(z zVar) {
            return (DynamicPrice) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static DynamicPrice parseFrom(z zVar, de deVar) {
            return (DynamicPrice) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static DynamicPrice parseFrom(InputStream inputStream) {
            return (DynamicPrice) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DynamicPrice parseFrom(InputStream inputStream, de deVar) {
            return (DynamicPrice) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static DynamicPrice parseFrom(ByteBuffer byteBuffer) {
            return (DynamicPrice) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DynamicPrice parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (DynamicPrice) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static DynamicPrice parseFrom(byte[] bArr) {
            return (DynamicPrice) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DynamicPrice parseFrom(byte[] bArr, de deVar) {
            return (DynamicPrice) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class FixedPrice extends du<FixedPrice, Builder> implements FixedPriceOrBuilder {
        private static final FixedPrice DEFAULT_INSTANCE;
        private static volatile fo<FixedPrice> PARSER = null;
        public static final int TOLLPRICECURRENCYCODE_FIELD_NUMBER = 2;
        public static final int TOLLPRICE_FIELD_NUMBER = 1;
        private int bitField0_;
        private String tollPriceCurrencyCode_ = "";
        private double tollPrice_;

        /* compiled from: WazeSource */
        public final class Builder extends dm<FixedPrice, Builder> implements FixedPriceOrBuilder {
            private Builder() {
                super(FixedPrice.DEFAULT_INSTANCE);
            }

            public Builder clearTollPrice() {
                copyOnWrite();
                ((FixedPrice) this.instance).clearTollPrice();
                return this;
            }

            public Builder clearTollPriceCurrencyCode() {
                copyOnWrite();
                ((FixedPrice) this.instance).clearTollPriceCurrencyCode();
                return this;
            }

            @Override // com.waze.jni.protos.navigate.Toll.FixedPriceOrBuilder
            public double getTollPrice() {
                return ((FixedPrice) this.instance).getTollPrice();
            }

            @Override // com.waze.jni.protos.navigate.Toll.FixedPriceOrBuilder
            public String getTollPriceCurrencyCode() {
                return ((FixedPrice) this.instance).getTollPriceCurrencyCode();
            }

            @Override // com.waze.jni.protos.navigate.Toll.FixedPriceOrBuilder
            public v getTollPriceCurrencyCodeBytes() {
                return ((FixedPrice) this.instance).getTollPriceCurrencyCodeBytes();
            }

            @Override // com.waze.jni.protos.navigate.Toll.FixedPriceOrBuilder
            public boolean hasTollPrice() {
                return ((FixedPrice) this.instance).hasTollPrice();
            }

            @Override // com.waze.jni.protos.navigate.Toll.FixedPriceOrBuilder
            public boolean hasTollPriceCurrencyCode() {
                return ((FixedPrice) this.instance).hasTollPriceCurrencyCode();
            }

            public Builder setTollPrice(double d2) {
                copyOnWrite();
                ((FixedPrice) this.instance).setTollPrice(d2);
                return this;
            }

            public Builder setTollPriceCurrencyCode(String str) {
                copyOnWrite();
                ((FixedPrice) this.instance).setTollPriceCurrencyCode(str);
                return this;
            }

            public Builder setTollPriceCurrencyCodeBytes(v vVar) {
                copyOnWrite();
                ((FixedPrice) this.instance).setTollPriceCurrencyCodeBytes(vVar);
                return this;
            }
        }

        static {
            FixedPrice fixedPrice = new FixedPrice();
            DEFAULT_INSTANCE = fixedPrice;
            du.registerDefaultInstance(FixedPrice.class, fixedPrice);
        }

        private FixedPrice() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTollPrice() {
            this.bitField0_ &= -2;
            this.tollPrice_ = AudioStats.AUDIO_AMPLITUDE_NONE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTollPriceCurrencyCode() {
            this.bitField0_ &= -3;
            this.tollPriceCurrencyCode_ = getDefaultInstance().getTollPriceCurrencyCode();
        }

        public static FixedPrice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FixedPrice parseDelimitedFrom(InputStream inputStream) {
            return (FixedPrice) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FixedPrice parseFrom(v vVar) {
            return (FixedPrice) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<FixedPrice> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTollPrice(double d2) {
            this.bitField0_ |= 1;
            this.tollPrice_ = d2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTollPriceCurrencyCode(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 2;
            this.tollPriceCurrencyCode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTollPriceCurrencyCodeBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.tollPriceCurrencyCode_ = vVar.u();
            this.bitField0_ |= 2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "tollPrice_", "tollPriceCurrencyCode_"});
            }
            if (iOrdinal == 3) {
                return new FixedPrice();
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
            fo<FixedPrice> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (FixedPrice.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.navigate.Toll.FixedPriceOrBuilder
        public double getTollPrice() {
            return this.tollPrice_;
        }

        @Override // com.waze.jni.protos.navigate.Toll.FixedPriceOrBuilder
        public String getTollPriceCurrencyCode() {
            return this.tollPriceCurrencyCode_;
        }

        @Override // com.waze.jni.protos.navigate.Toll.FixedPriceOrBuilder
        public v getTollPriceCurrencyCodeBytes() {
            return v.s(this.tollPriceCurrencyCode_);
        }

        @Override // com.waze.jni.protos.navigate.Toll.FixedPriceOrBuilder
        public boolean hasTollPrice() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.waze.jni.protos.navigate.Toll.FixedPriceOrBuilder
        public boolean hasTollPriceCurrencyCode() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(FixedPrice fixedPrice) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(fixedPrice);
        }

        public static FixedPrice parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (FixedPrice) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static FixedPrice parseFrom(v vVar, de deVar) {
            return (FixedPrice) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static FixedPrice parseFrom(z zVar) {
            return (FixedPrice) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static FixedPrice parseFrom(z zVar, de deVar) {
            return (FixedPrice) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static FixedPrice parseFrom(InputStream inputStream) {
            return (FixedPrice) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FixedPrice parseFrom(InputStream inputStream, de deVar) {
            return (FixedPrice) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static FixedPrice parseFrom(ByteBuffer byteBuffer) {
            return (FixedPrice) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static FixedPrice parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (FixedPrice) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static FixedPrice parseFrom(byte[] bArr) {
            return (FixedPrice) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FixedPrice parseFrom(byte[] bArr, de deVar) {
            return (FixedPrice) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class NoPrice extends du<NoPrice, Builder> implements NoPriceOrBuilder {
        private static final NoPrice DEFAULT_INSTANCE;
        private static volatile fo<NoPrice> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<NoPrice, Builder> implements NoPriceOrBuilder {
            private Builder() {
                super(NoPrice.DEFAULT_INSTANCE);
            }
        }

        static {
            NoPrice noPrice = new NoPrice();
            DEFAULT_INSTANCE = noPrice;
            du.registerDefaultInstance(NoPrice.class, noPrice);
        }

        private NoPrice() {
        }

        public static NoPrice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NoPrice parseDelimitedFrom(InputStream inputStream) {
            return (NoPrice) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NoPrice parseFrom(v vVar) {
            return (NoPrice) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<NoPrice> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            if (iOrdinal == 3) {
                return new NoPrice();
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
            fo<NoPrice> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (NoPrice.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(NoPrice noPrice) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(noPrice);
        }

        public static NoPrice parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (NoPrice) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static NoPrice parseFrom(v vVar, de deVar) {
            return (NoPrice) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static NoPrice parseFrom(z zVar) {
            return (NoPrice) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static NoPrice parseFrom(z zVar, de deVar) {
            return (NoPrice) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static NoPrice parseFrom(InputStream inputStream) {
            return (NoPrice) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NoPrice parseFrom(InputStream inputStream, de deVar) {
            return (NoPrice) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static NoPrice parseFrom(ByteBuffer byteBuffer) {
            return (NoPrice) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static NoPrice parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (NoPrice) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static NoPrice parseFrom(byte[] bArr) {
            return (NoPrice) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NoPrice parseFrom(byte[] bArr, de deVar) {
            return (NoPrice) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class PriceChangeAtTime extends du<PriceChangeAtTime, Builder> implements PriceChangeAtTimeOrBuilder {
        private static final PriceChangeAtTime DEFAULT_INSTANCE;
        public static final int FIXEDPRICE_FIELD_NUMBER = 1;
        private static volatile fo<PriceChangeAtTime> PARSER = null;
        public static final int ROADNAME_FIELD_NUMBER = 3;
        public static final int TIMEBASEDPRICECHANGEATSECONDS_FIELD_NUMBER = 4;
        public static final int TIMEBASEDPRICE_FIELD_NUMBER = 2;
        private int bitField0_;
        private FixedPrice fixedPrice_;
        private String roadName_ = "";
        private int timeBasedPriceChangeAtSeconds_;
        private double timeBasedPrice_;

        static {
            PriceChangeAtTime priceChangeAtTime = new PriceChangeAtTime();
            DEFAULT_INSTANCE = priceChangeAtTime;
            du.registerDefaultInstance(PriceChangeAtTime.class, priceChangeAtTime);
        }

        private PriceChangeAtTime() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFixedPrice() {
            this.fixedPrice_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoadName() {
            this.roadName_ = getDefaultInstance().getRoadName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeBasedPrice() {
            this.timeBasedPrice_ = AudioStats.AUDIO_AMPLITUDE_NONE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeBasedPriceChangeAtSeconds() {
            this.timeBasedPriceChangeAtSeconds_ = 0;
        }

        public static PriceChangeAtTime getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFixedPrice(FixedPrice fixedPrice) {
            Objects.requireNonNull(fixedPrice);
            FixedPrice fixedPrice2 = this.fixedPrice_;
            if (fixedPrice2 != null && fixedPrice2 != FixedPrice.getDefaultInstance()) {
                FixedPrice.Builder builderNewBuilder = FixedPrice.newBuilder(fixedPrice2);
                builderNewBuilder.mergeFrom((FixedPrice.Builder) fixedPrice);
                fixedPrice = builderNewBuilder.buildPartial();
            }
            this.fixedPrice_ = fixedPrice;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PriceChangeAtTime parseDelimitedFrom(InputStream inputStream) {
            return (PriceChangeAtTime) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PriceChangeAtTime parseFrom(v vVar) {
            return (PriceChangeAtTime) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<PriceChangeAtTime> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFixedPrice(FixedPrice fixedPrice) {
            Objects.requireNonNull(fixedPrice);
            this.fixedPrice_ = fixedPrice;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoadName(String str) {
            Objects.requireNonNull(str);
            this.roadName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoadNameBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.roadName_ = vVar.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeBasedPrice(double d2) {
            this.timeBasedPrice_ = d2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeBasedPriceChangeAtSeconds(int i2) {
            this.timeBasedPriceChangeAtSeconds_ = i2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000\u0003Ȉ\u0004\u0004", new Object[]{"bitField0_", "fixedPrice_", "timeBasedPrice_", "roadName_", "timeBasedPriceChangeAtSeconds_"});
            }
            if (iOrdinal == 3) {
                return new PriceChangeAtTime();
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
            fo<PriceChangeAtTime> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (PriceChangeAtTime.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.navigate.Toll.PriceChangeAtTimeOrBuilder
        public FixedPrice getFixedPrice() {
            FixedPrice fixedPrice = this.fixedPrice_;
            return fixedPrice == null ? FixedPrice.getDefaultInstance() : fixedPrice;
        }

        @Override // com.waze.jni.protos.navigate.Toll.PriceChangeAtTimeOrBuilder
        public String getRoadName() {
            return this.roadName_;
        }

        @Override // com.waze.jni.protos.navigate.Toll.PriceChangeAtTimeOrBuilder
        public v getRoadNameBytes() {
            return v.s(this.roadName_);
        }

        @Override // com.waze.jni.protos.navigate.Toll.PriceChangeAtTimeOrBuilder
        public double getTimeBasedPrice() {
            return this.timeBasedPrice_;
        }

        @Override // com.waze.jni.protos.navigate.Toll.PriceChangeAtTimeOrBuilder
        public int getTimeBasedPriceChangeAtSeconds() {
            return this.timeBasedPriceChangeAtSeconds_;
        }

        @Override // com.waze.jni.protos.navigate.Toll.PriceChangeAtTimeOrBuilder
        public boolean hasFixedPrice() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(PriceChangeAtTime priceChangeAtTime) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(priceChangeAtTime);
        }

        public static PriceChangeAtTime parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (PriceChangeAtTime) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static PriceChangeAtTime parseFrom(v vVar, de deVar) {
            return (PriceChangeAtTime) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static PriceChangeAtTime parseFrom(z zVar) {
            return (PriceChangeAtTime) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static PriceChangeAtTime parseFrom(z zVar, de deVar) {
            return (PriceChangeAtTime) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static PriceChangeAtTime parseFrom(InputStream inputStream) {
            return (PriceChangeAtTime) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PriceChangeAtTime parseFrom(InputStream inputStream, de deVar) {
            return (PriceChangeAtTime) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static PriceChangeAtTime parseFrom(ByteBuffer byteBuffer) {
            return (PriceChangeAtTime) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PriceChangeAtTime parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (PriceChangeAtTime) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<PriceChangeAtTime, Builder> implements PriceChangeAtTimeOrBuilder {
            private Builder() {
                super(PriceChangeAtTime.DEFAULT_INSTANCE);
            }

            public Builder clearFixedPrice() {
                copyOnWrite();
                ((PriceChangeAtTime) this.instance).clearFixedPrice();
                return this;
            }

            public Builder clearRoadName() {
                copyOnWrite();
                ((PriceChangeAtTime) this.instance).clearRoadName();
                return this;
            }

            public Builder clearTimeBasedPrice() {
                copyOnWrite();
                ((PriceChangeAtTime) this.instance).clearTimeBasedPrice();
                return this;
            }

            public Builder clearTimeBasedPriceChangeAtSeconds() {
                copyOnWrite();
                ((PriceChangeAtTime) this.instance).clearTimeBasedPriceChangeAtSeconds();
                return this;
            }

            @Override // com.waze.jni.protos.navigate.Toll.PriceChangeAtTimeOrBuilder
            public FixedPrice getFixedPrice() {
                return ((PriceChangeAtTime) this.instance).getFixedPrice();
            }

            @Override // com.waze.jni.protos.navigate.Toll.PriceChangeAtTimeOrBuilder
            public String getRoadName() {
                return ((PriceChangeAtTime) this.instance).getRoadName();
            }

            @Override // com.waze.jni.protos.navigate.Toll.PriceChangeAtTimeOrBuilder
            public v getRoadNameBytes() {
                return ((PriceChangeAtTime) this.instance).getRoadNameBytes();
            }

            @Override // com.waze.jni.protos.navigate.Toll.PriceChangeAtTimeOrBuilder
            public double getTimeBasedPrice() {
                return ((PriceChangeAtTime) this.instance).getTimeBasedPrice();
            }

            @Override // com.waze.jni.protos.navigate.Toll.PriceChangeAtTimeOrBuilder
            public int getTimeBasedPriceChangeAtSeconds() {
                return ((PriceChangeAtTime) this.instance).getTimeBasedPriceChangeAtSeconds();
            }

            @Override // com.waze.jni.protos.navigate.Toll.PriceChangeAtTimeOrBuilder
            public boolean hasFixedPrice() {
                return ((PriceChangeAtTime) this.instance).hasFixedPrice();
            }

            public Builder mergeFixedPrice(FixedPrice fixedPrice) {
                copyOnWrite();
                ((PriceChangeAtTime) this.instance).mergeFixedPrice(fixedPrice);
                return this;
            }

            public Builder setFixedPrice(FixedPrice.Builder builder) {
                copyOnWrite();
                ((PriceChangeAtTime) this.instance).setFixedPrice(builder.build());
                return this;
            }

            public Builder setRoadName(String str) {
                copyOnWrite();
                ((PriceChangeAtTime) this.instance).setRoadName(str);
                return this;
            }

            public Builder setRoadNameBytes(v vVar) {
                copyOnWrite();
                ((PriceChangeAtTime) this.instance).setRoadNameBytes(vVar);
                return this;
            }

            public Builder setTimeBasedPrice(double d2) {
                copyOnWrite();
                ((PriceChangeAtTime) this.instance).setTimeBasedPrice(d2);
                return this;
            }

            public Builder setTimeBasedPriceChangeAtSeconds(int i2) {
                copyOnWrite();
                ((PriceChangeAtTime) this.instance).setTimeBasedPriceChangeAtSeconds(i2);
                return this;
            }

            public Builder setFixedPrice(FixedPrice fixedPrice) {
                copyOnWrite();
                ((PriceChangeAtTime) this.instance).setFixedPrice(fixedPrice);
                return this;
            }
        }

        public static PriceChangeAtTime parseFrom(byte[] bArr) {
            return (PriceChangeAtTime) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PriceChangeAtTime parseFrom(byte[] bArr, de deVar) {
            return (PriceChangeAtTime) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class PriceChangingByTime extends du<PriceChangingByTime, Builder> implements PriceChangingByTimeOrBuilder {
        private static final PriceChangingByTime DEFAULT_INSTANCE;
        private static volatile fo<PriceChangingByTime> PARSER = null;
        public static final int ROADNAME_FIELD_NUMBER = 1;
        private String roadName_ = "";

        /* compiled from: WazeSource */
        public final class Builder extends dm<PriceChangingByTime, Builder> implements PriceChangingByTimeOrBuilder {
            private Builder() {
                super(PriceChangingByTime.DEFAULT_INSTANCE);
            }

            public Builder clearRoadName() {
                copyOnWrite();
                ((PriceChangingByTime) this.instance).clearRoadName();
                return this;
            }

            @Override // com.waze.jni.protos.navigate.Toll.PriceChangingByTimeOrBuilder
            public String getRoadName() {
                return ((PriceChangingByTime) this.instance).getRoadName();
            }

            @Override // com.waze.jni.protos.navigate.Toll.PriceChangingByTimeOrBuilder
            public v getRoadNameBytes() {
                return ((PriceChangingByTime) this.instance).getRoadNameBytes();
            }

            public Builder setRoadName(String str) {
                copyOnWrite();
                ((PriceChangingByTime) this.instance).setRoadName(str);
                return this;
            }

            public Builder setRoadNameBytes(v vVar) {
                copyOnWrite();
                ((PriceChangingByTime) this.instance).setRoadNameBytes(vVar);
                return this;
            }
        }

        static {
            PriceChangingByTime priceChangingByTime = new PriceChangingByTime();
            DEFAULT_INSTANCE = priceChangingByTime;
            du.registerDefaultInstance(PriceChangingByTime.class, priceChangingByTime);
        }

        private PriceChangingByTime() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoadName() {
            this.roadName_ = getDefaultInstance().getRoadName();
        }

        public static PriceChangingByTime getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PriceChangingByTime parseDelimitedFrom(InputStream inputStream) {
            return (PriceChangingByTime) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PriceChangingByTime parseFrom(v vVar) {
            return (PriceChangingByTime) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<PriceChangingByTime> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoadName(String str) {
            Objects.requireNonNull(str);
            this.roadName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoadNameBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.roadName_ = vVar.u();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"roadName_"});
            }
            if (iOrdinal == 3) {
                return new PriceChangingByTime();
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
            fo<PriceChangingByTime> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (PriceChangingByTime.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.navigate.Toll.PriceChangingByTimeOrBuilder
        public String getRoadName() {
            return this.roadName_;
        }

        @Override // com.waze.jni.protos.navigate.Toll.PriceChangingByTimeOrBuilder
        public v getRoadNameBytes() {
            return v.s(this.roadName_);
        }

        public static Builder newBuilder(PriceChangingByTime priceChangingByTime) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(priceChangingByTime);
        }

        public static PriceChangingByTime parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (PriceChangingByTime) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static PriceChangingByTime parseFrom(v vVar, de deVar) {
            return (PriceChangingByTime) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static PriceChangingByTime parseFrom(z zVar) {
            return (PriceChangingByTime) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static PriceChangingByTime parseFrom(z zVar, de deVar) {
            return (PriceChangingByTime) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static PriceChangingByTime parseFrom(InputStream inputStream) {
            return (PriceChangingByTime) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PriceChangingByTime parseFrom(InputStream inputStream, de deVar) {
            return (PriceChangingByTime) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static PriceChangingByTime parseFrom(ByteBuffer byteBuffer) {
            return (PriceChangingByTime) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PriceChangingByTime parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (PriceChangingByTime) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static PriceChangingByTime parseFrom(byte[] bArr) {
            return (PriceChangingByTime) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PriceChangingByTime parseFrom(byte[] bArr, de deVar) {
            return (PriceChangingByTime) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class WithPass extends du<WithPass, Builder> implements WithPassOrBuilder {
        private static final WithPass DEFAULT_INSTANCE;
        public static final int FIXEDPRICE_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile fo<WithPass> PARSER;
        private int bitField0_;
        private FixedPrice fixedPrice_;
        private String name_ = "";

        static {
            WithPass withPass = new WithPass();
            DEFAULT_INSTANCE = withPass;
            du.registerDefaultInstance(WithPass.class, withPass);
        }

        private WithPass() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFixedPrice() {
            this.fixedPrice_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        public static WithPass getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFixedPrice(FixedPrice fixedPrice) {
            Objects.requireNonNull(fixedPrice);
            FixedPrice fixedPrice2 = this.fixedPrice_;
            if (fixedPrice2 != null && fixedPrice2 != FixedPrice.getDefaultInstance()) {
                FixedPrice.Builder builderNewBuilder = FixedPrice.newBuilder(fixedPrice2);
                builderNewBuilder.mergeFrom((FixedPrice.Builder) fixedPrice);
                fixedPrice = builderNewBuilder.buildPartial();
            }
            this.fixedPrice_ = fixedPrice;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static WithPass parseDelimitedFrom(InputStream inputStream) {
            return (WithPass) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WithPass parseFrom(v vVar) {
            return (WithPass) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<WithPass> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFixedPrice(FixedPrice fixedPrice) {
            Objects.requireNonNull(fixedPrice);
            this.fixedPrice_ = fixedPrice;
            this.bitField0_ |= 1;
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

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "fixedPrice_"});
            }
            if (iOrdinal == 3) {
                return new WithPass();
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
            fo<WithPass> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (WithPass.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.navigate.Toll.WithPassOrBuilder
        public FixedPrice getFixedPrice() {
            FixedPrice fixedPrice = this.fixedPrice_;
            return fixedPrice == null ? FixedPrice.getDefaultInstance() : fixedPrice;
        }

        @Override // com.waze.jni.protos.navigate.Toll.WithPassOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.waze.jni.protos.navigate.Toll.WithPassOrBuilder
        public v getNameBytes() {
            return v.s(this.name_);
        }

        @Override // com.waze.jni.protos.navigate.Toll.WithPassOrBuilder
        public boolean hasFixedPrice() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(WithPass withPass) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(withPass);
        }

        public static WithPass parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (WithPass) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static WithPass parseFrom(v vVar, de deVar) {
            return (WithPass) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static WithPass parseFrom(z zVar) {
            return (WithPass) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static WithPass parseFrom(z zVar, de deVar) {
            return (WithPass) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static WithPass parseFrom(InputStream inputStream) {
            return (WithPass) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WithPass parseFrom(InputStream inputStream, de deVar) {
            return (WithPass) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static WithPass parseFrom(ByteBuffer byteBuffer) {
            return (WithPass) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static WithPass parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (WithPass) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        /* compiled from: WazeSource */
        public final class Builder extends dm<WithPass, Builder> implements WithPassOrBuilder {
            private Builder() {
                super(WithPass.DEFAULT_INSTANCE);
            }

            public Builder clearFixedPrice() {
                copyOnWrite();
                ((WithPass) this.instance).clearFixedPrice();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((WithPass) this.instance).clearName();
                return this;
            }

            @Override // com.waze.jni.protos.navigate.Toll.WithPassOrBuilder
            public FixedPrice getFixedPrice() {
                return ((WithPass) this.instance).getFixedPrice();
            }

            @Override // com.waze.jni.protos.navigate.Toll.WithPassOrBuilder
            public String getName() {
                return ((WithPass) this.instance).getName();
            }

            @Override // com.waze.jni.protos.navigate.Toll.WithPassOrBuilder
            public v getNameBytes() {
                return ((WithPass) this.instance).getNameBytes();
            }

            @Override // com.waze.jni.protos.navigate.Toll.WithPassOrBuilder
            public boolean hasFixedPrice() {
                return ((WithPass) this.instance).hasFixedPrice();
            }

            public Builder mergeFixedPrice(FixedPrice fixedPrice) {
                copyOnWrite();
                ((WithPass) this.instance).mergeFixedPrice(fixedPrice);
                return this;
            }

            public Builder setFixedPrice(FixedPrice.Builder builder) {
                copyOnWrite();
                ((WithPass) this.instance).setFixedPrice(builder.build());
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((WithPass) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(v vVar) {
                copyOnWrite();
                ((WithPass) this.instance).setNameBytes(vVar);
                return this;
            }

            public Builder setFixedPrice(FixedPrice fixedPrice) {
                copyOnWrite();
                ((WithPass) this.instance).setFixedPrice(fixedPrice);
                return this;
            }
        }

        public static WithPass parseFrom(byte[] bArr) {
            return (WithPass) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WithPass parseFrom(byte[] bArr, de deVar) {
            return (WithPass) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(Toll toll) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(toll);
    }

    public static Toll parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (Toll) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Toll parseFrom(v vVar, de deVar) {
        return (Toll) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Toll parseFrom(z zVar) {
        return (Toll) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Toll parseFrom(z zVar, de deVar) {
        return (Toll) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Toll parseFrom(InputStream inputStream) {
        return (Toll) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Toll parseFrom(InputStream inputStream, de deVar) {
        return (Toll) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Toll parseFrom(ByteBuffer byteBuffer) {
        return (Toll) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Toll parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (Toll) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<Toll, Builder> implements TollOrBuilder {
        private Builder() {
            super(Toll.DEFAULT_INSTANCE);
        }

        public Builder clearDisabled() {
            copyOnWrite();
            ((Toll) this.instance).clearDisabled();
            return this;
        }

        public Builder clearDynamicPrice() {
            copyOnWrite();
            ((Toll) this.instance).clearDynamicPrice();
            return this;
        }

        public Builder clearFixedPrice() {
            copyOnWrite();
            ((Toll) this.instance).clearFixedPrice();
            return this;
        }

        public Builder clearMissingPass() {
            copyOnWrite();
            ((Toll) this.instance).clearMissingPass();
            return this;
        }

        public Builder clearNoPrice() {
            copyOnWrite();
            ((Toll) this.instance).clearNoPrice();
            return this;
        }

        public Builder clearPriceChangedAtTime() {
            copyOnWrite();
            ((Toll) this.instance).clearPriceChangedAtTime();
            return this;
        }

        public Builder clearPriceChangedByTime() {
            copyOnWrite();
            ((Toll) this.instance).clearPriceChangedByTime();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((Toll) this.instance).clearType();
            return this;
        }

        public Builder clearWithPass() {
            copyOnWrite();
            ((Toll) this.instance).clearWithPass();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.TollOrBuilder
        public Disabled getDisabled() {
            return ((Toll) this.instance).getDisabled();
        }

        @Override // com.waze.jni.protos.navigate.TollOrBuilder
        public DynamicPrice getDynamicPrice() {
            return ((Toll) this.instance).getDynamicPrice();
        }

        @Override // com.waze.jni.protos.navigate.TollOrBuilder
        public FixedPrice getFixedPrice() {
            return ((Toll) this.instance).getFixedPrice();
        }

        @Override // com.waze.jni.protos.navigate.TollOrBuilder
        public MissingPass getMissingPass() {
            return ((Toll) this.instance).getMissingPass();
        }

        @Override // com.waze.jni.protos.navigate.TollOrBuilder
        public NoPrice getNoPrice() {
            return ((Toll) this.instance).getNoPrice();
        }

        @Override // com.waze.jni.protos.navigate.TollOrBuilder
        public PriceChangeAtTime getPriceChangedAtTime() {
            return ((Toll) this.instance).getPriceChangedAtTime();
        }

        @Override // com.waze.jni.protos.navigate.TollOrBuilder
        public PriceChangingByTime getPriceChangedByTime() {
            return ((Toll) this.instance).getPriceChangedByTime();
        }

        @Override // com.waze.jni.protos.navigate.TollOrBuilder
        public TypeCase getTypeCase() {
            return ((Toll) this.instance).getTypeCase();
        }

        @Override // com.waze.jni.protos.navigate.TollOrBuilder
        public WithPass getWithPass() {
            return ((Toll) this.instance).getWithPass();
        }

        @Override // com.waze.jni.protos.navigate.TollOrBuilder
        public boolean hasDisabled() {
            return ((Toll) this.instance).hasDisabled();
        }

        @Override // com.waze.jni.protos.navigate.TollOrBuilder
        public boolean hasDynamicPrice() {
            return ((Toll) this.instance).hasDynamicPrice();
        }

        @Override // com.waze.jni.protos.navigate.TollOrBuilder
        public boolean hasFixedPrice() {
            return ((Toll) this.instance).hasFixedPrice();
        }

        @Override // com.waze.jni.protos.navigate.TollOrBuilder
        public boolean hasMissingPass() {
            return ((Toll) this.instance).hasMissingPass();
        }

        @Override // com.waze.jni.protos.navigate.TollOrBuilder
        public boolean hasNoPrice() {
            return ((Toll) this.instance).hasNoPrice();
        }

        @Override // com.waze.jni.protos.navigate.TollOrBuilder
        public boolean hasPriceChangedAtTime() {
            return ((Toll) this.instance).hasPriceChangedAtTime();
        }

        @Override // com.waze.jni.protos.navigate.TollOrBuilder
        public boolean hasPriceChangedByTime() {
            return ((Toll) this.instance).hasPriceChangedByTime();
        }

        @Override // com.waze.jni.protos.navigate.TollOrBuilder
        public boolean hasWithPass() {
            return ((Toll) this.instance).hasWithPass();
        }

        public Builder mergeDisabled(Disabled disabled) {
            copyOnWrite();
            ((Toll) this.instance).mergeDisabled(disabled);
            return this;
        }

        public Builder mergeDynamicPrice(DynamicPrice dynamicPrice) {
            copyOnWrite();
            ((Toll) this.instance).mergeDynamicPrice(dynamicPrice);
            return this;
        }

        public Builder mergeFixedPrice(FixedPrice fixedPrice) {
            copyOnWrite();
            ((Toll) this.instance).mergeFixedPrice(fixedPrice);
            return this;
        }

        public Builder mergeMissingPass(MissingPass missingPass) {
            copyOnWrite();
            ((Toll) this.instance).mergeMissingPass(missingPass);
            return this;
        }

        public Builder mergeNoPrice(NoPrice noPrice) {
            copyOnWrite();
            ((Toll) this.instance).mergeNoPrice(noPrice);
            return this;
        }

        public Builder mergePriceChangedAtTime(PriceChangeAtTime priceChangeAtTime) {
            copyOnWrite();
            ((Toll) this.instance).mergePriceChangedAtTime(priceChangeAtTime);
            return this;
        }

        public Builder mergePriceChangedByTime(PriceChangingByTime priceChangingByTime) {
            copyOnWrite();
            ((Toll) this.instance).mergePriceChangedByTime(priceChangingByTime);
            return this;
        }

        public Builder mergeWithPass(WithPass withPass) {
            copyOnWrite();
            ((Toll) this.instance).mergeWithPass(withPass);
            return this;
        }

        public Builder setDisabled(Disabled.Builder builder) {
            copyOnWrite();
            ((Toll) this.instance).setDisabled(builder.build());
            return this;
        }

        public Builder setDynamicPrice(DynamicPrice.Builder builder) {
            copyOnWrite();
            ((Toll) this.instance).setDynamicPrice(builder.build());
            return this;
        }

        public Builder setFixedPrice(FixedPrice.Builder builder) {
            copyOnWrite();
            ((Toll) this.instance).setFixedPrice(builder.build());
            return this;
        }

        public Builder setMissingPass(MissingPass.Builder builder) {
            copyOnWrite();
            ((Toll) this.instance).setMissingPass(builder.build());
            return this;
        }

        public Builder setNoPrice(NoPrice.Builder builder) {
            copyOnWrite();
            ((Toll) this.instance).setNoPrice(builder.build());
            return this;
        }

        public Builder setPriceChangedAtTime(PriceChangeAtTime.Builder builder) {
            copyOnWrite();
            ((Toll) this.instance).setPriceChangedAtTime(builder.build());
            return this;
        }

        public Builder setPriceChangedByTime(PriceChangingByTime.Builder builder) {
            copyOnWrite();
            ((Toll) this.instance).setPriceChangedByTime(builder.build());
            return this;
        }

        public Builder setWithPass(WithPass.Builder builder) {
            copyOnWrite();
            ((Toll) this.instance).setWithPass(builder.build());
            return this;
        }

        public Builder setDisabled(Disabled disabled) {
            copyOnWrite();
            ((Toll) this.instance).setDisabled(disabled);
            return this;
        }

        public Builder setDynamicPrice(DynamicPrice dynamicPrice) {
            copyOnWrite();
            ((Toll) this.instance).setDynamicPrice(dynamicPrice);
            return this;
        }

        public Builder setFixedPrice(FixedPrice fixedPrice) {
            copyOnWrite();
            ((Toll) this.instance).setFixedPrice(fixedPrice);
            return this;
        }

        public Builder setMissingPass(MissingPass missingPass) {
            copyOnWrite();
            ((Toll) this.instance).setMissingPass(missingPass);
            return this;
        }

        public Builder setNoPrice(NoPrice noPrice) {
            copyOnWrite();
            ((Toll) this.instance).setNoPrice(noPrice);
            return this;
        }

        public Builder setPriceChangedAtTime(PriceChangeAtTime priceChangeAtTime) {
            copyOnWrite();
            ((Toll) this.instance).setPriceChangedAtTime(priceChangeAtTime);
            return this;
        }

        public Builder setPriceChangedByTime(PriceChangingByTime priceChangingByTime) {
            copyOnWrite();
            ((Toll) this.instance).setPriceChangedByTime(priceChangingByTime);
            return this;
        }

        public Builder setWithPass(WithPass withPass) {
            copyOnWrite();
            ((Toll) this.instance).setWithPass(withPass);
            return this;
        }
    }

    public static Toll parseFrom(byte[] bArr) {
        return (Toll) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Toll parseFrom(byte[] bArr, de deVar) {
        return (Toll) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
