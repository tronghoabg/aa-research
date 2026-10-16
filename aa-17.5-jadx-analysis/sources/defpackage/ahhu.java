package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahhu extends ahoq implements ahph {
    public static ahpi<ahhu> PARSER = new ahhm();
    private static final ahhu defaultInstance;
    private int bitField0_;
    private ahic conclusionOfConditionalEffect_;
    private ahhp conditionKind_;
    private List<ahic> effectConstructorArgument_;
    private ahhr effectType_;
    private ahht kind_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final ahoa unknownFields;

    static {
        ahhu ahhuVar = new ahhu(true);
        defaultInstance = ahhuVar;
        ahhuVar.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ahhu(ahoc ahocVar, ahog ahogVar) throws ahou {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        ahnz ahnzVarNewOutput = ahoa.newOutput();
        ahoe ahoeVarNewInstance = ahoe.newInstance(ahnzVarNewOutput, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    try {
                        int tag = ahocVar.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                int i = ahocVar.readEnum();
                                ahhr ahhrVarValueOf = ahhr.valueOf(i);
                                if (ahhrVarValueOf == null) {
                                    ahoeVarNewInstance.writeRawVarint32(tag);
                                    ahoeVarNewInstance.writeRawVarint32(i);
                                } else {
                                    this.bitField0_ |= 1;
                                    this.effectType_ = ahhrVarValueOf;
                                }
                            } else if (tag == 18) {
                                if ((c & 2) != 2) {
                                    this.effectConstructorArgument_ = new ArrayList();
                                    c = 2;
                                }
                                this.effectConstructorArgument_.add(ahocVar.readMessage(ahic.PARSER, ahogVar));
                            } else if (tag == 26) {
                                ahhz builder = (this.bitField0_ & 2) == 2 ? this.conclusionOfConditionalEffect_.toBuilder() : null;
                                ahic ahicVar = (ahic) ahocVar.readMessage(ahic.PARSER, ahogVar);
                                this.conclusionOfConditionalEffect_ = ahicVar;
                                if (builder != null) {
                                    builder.mergeFrom(ahicVar);
                                    this.conclusionOfConditionalEffect_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 2;
                            } else if (tag == 32) {
                                int i2 = ahocVar.readEnum();
                                ahht ahhtVarValueOf = ahht.valueOf(i2);
                                if (ahhtVarValueOf == null) {
                                    ahoeVarNewInstance.writeRawVarint32(tag);
                                    ahoeVarNewInstance.writeRawVarint32(i2);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.kind_ = ahhtVarValueOf;
                                }
                            } else if (tag == 40) {
                                int i3 = ahocVar.readEnum();
                                ahhp ahhpVarValueOf = ahhp.valueOf(i3);
                                if (ahhpVarValueOf == null) {
                                    ahoeVarNewInstance.writeRawVarint32(tag);
                                    ahoeVarNewInstance.writeRawVarint32(i3);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.conditionKind_ = ahhpVarValueOf;
                                }
                            } else if (!parseUnknownField(ahocVar, ahoeVarNewInstance, ahogVar, tag)) {
                            }
                        }
                        z = true;
                    } catch (ahou e) {
                        e.setUnfinishedMessage(this);
                        throw e;
                    } catch (IOException e2) {
                        ahou ahouVar = new ahou(e2.getMessage());
                        ahouVar.setUnfinishedMessage(this);
                        throw ahouVar;
                    }
                } catch (Throwable th) {
                    if ((c & 2) == 2) {
                        this.effectConstructorArgument_ = DesugarCollections.unmodifiableList(this.effectConstructorArgument_);
                    }
                    try {
                        ahoeVarNewInstance.flush();
                    } catch (IOException unused) {
                    }
                    throw th;
                }
            } finally {
                this.unknownFields = ahnzVarNewOutput.toByteString();
            }
        }
        if ((c & 2) == 2) {
            this.effectConstructorArgument_ = DesugarCollections.unmodifiableList(this.effectConstructorArgument_);
        }
        try {
            ahoeVarNewInstance.flush();
        } catch (IOException unused2) {
        }
    }

    public static ahhu getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.effectType_ = ahhr.RETURNS_CONSTANT;
        this.effectConstructorArgument_ = Collections.EMPTY_LIST;
        this.conclusionOfConditionalEffect_ = ahic.getDefaultInstance();
        this.kind_ = ahht.AT_MOST_ONCE;
        this.conditionKind_ = ahhp.CONCLUSION_CONDITION;
    }

    public static ahhn newBuilder(ahhu ahhuVar) {
        ahhn ahhnVarNewBuilder = newBuilder();
        ahhnVarNewBuilder.mergeFrom(ahhuVar);
        return ahhnVarNewBuilder;
    }

    public ahic getConclusionOfConditionalEffect() {
        return this.conclusionOfConditionalEffect_;
    }

    public ahhp getConditionKind() {
        return this.conditionKind_;
    }

    public ahic getEffectConstructorArgument(int i) {
        return this.effectConstructorArgument_.get(i);
    }

    public int getEffectConstructorArgumentCount() {
        return this.effectConstructorArgument_.size();
    }

    public List<ahic> getEffectConstructorArgumentList() {
        return this.effectConstructorArgument_;
    }

    public ahhr getEffectType() {
        return this.effectType_;
    }

    public ahht getKind() {
        return this.kind_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahhu> getParserForType() {
        return PARSER;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? ahoe.computeEnumSize(1, this.effectType_.getNumber()) : 0;
        for (int i2 = 0; i2 < this.effectConstructorArgument_.size(); i2++) {
            iComputeEnumSize += ahoe.computeMessageSize(2, this.effectConstructorArgument_.get(i2));
        }
        if ((this.bitField0_ & 2) == 2) {
            iComputeEnumSize += ahoe.computeMessageSize(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iComputeEnumSize += ahoe.computeEnumSize(4, this.kind_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            iComputeEnumSize += ahoe.computeEnumSize(5, this.conditionKind_.getNumber());
        }
        int size = iComputeEnumSize + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean hasConclusionOfConditionalEffect() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasConditionKind() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasEffectType() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasKind() {
        return (this.bitField0_ & 4) == 4;
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    @Override // defpackage.ahph
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        ?? r1 = 1;
        r1 = 1;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= getEffectConstructorArgumentCount()) {
                if (hasConclusionOfConditionalEffect() && !getConclusionOfConditionalEffect().isInitialized()) {
                    break;
                }
            } else {
                if (!getEffectConstructorArgument(i).isInitialized()) {
                    break;
                }
                i++;
            }
        }
        r1 = 0;
        this.memoizedIsInitialized = r1;
        return r1;
    }

    @Override // defpackage.ahpg
    public ahhn newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahhn toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeEnum(1, this.effectType_.getNumber());
        }
        for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
            ahoeVar.writeMessage(2, this.effectConstructorArgument_.get(i));
        }
        if ((this.bitField0_ & 2) == 2) {
            ahoeVar.writeMessage(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            ahoeVar.writeEnum(4, this.kind_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            ahoeVar.writeEnum(5, this.conditionKind_.getNumber());
        }
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahhu getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahhn newBuilder() {
        return ahhn.create();
    }

    public /* synthetic */ ahhu(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahhu(ahok ahokVar) {
        super(ahokVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahokVar.getUnknownFields();
    }

    public /* synthetic */ ahhu(ahok ahokVar, ahgm ahgmVar) {
        this(ahokVar);
    }

    private ahhu(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
