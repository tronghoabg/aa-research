package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahic extends ahoq implements ahph {
    public static ahpi<ahic> PARSER = new ahhy();
    private static final ahic defaultInstance;
    private List<ahic> andArgument_;
    private int bitField0_;
    private ahib constantValue_;
    private int flags_;
    private int isInstanceTypeId_;
    private ahjn isInstanceType_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<ahic> orArgument_;
    private final ahoa unknownFields;
    private int valueParameterReference_;

    static {
        ahic ahicVar = new ahic(true);
        defaultInstance = ahicVar;
        ahicVar.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ahic(ahoc ahocVar, ahog ahogVar) throws ahou {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        ahnz ahnzVarNewOutput = ahoa.newOutput();
        ahoe ahoeVarNewInstance = ahoe.newInstance(ahnzVarNewOutput, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int tag = ahocVar.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.bitField0_ |= 1;
                                this.flags_ = ahocVar.readInt32();
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.valueParameterReference_ = ahocVar.readInt32();
                            } else if (tag == 24) {
                                int i2 = ahocVar.readEnum();
                                ahib ahibVarValueOf = ahib.valueOf(i2);
                                if (ahibVarValueOf == null) {
                                    ahoeVarNewInstance.writeRawVarint32(tag);
                                    ahoeVarNewInstance.writeRawVarint32(i2);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.constantValue_ = ahibVarValueOf;
                                }
                            } else if (tag == 34) {
                                ahjm builder = (this.bitField0_ & 8) == 8 ? this.isInstanceType_.toBuilder() : null;
                                ahjn ahjnVar = (ahjn) ahocVar.readMessage(ahjn.PARSER, ahogVar);
                                this.isInstanceType_ = ahjnVar;
                                if (builder != null) {
                                    builder.mergeFrom(ahjnVar);
                                    this.isInstanceType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 8;
                            } else if (tag == 40) {
                                this.bitField0_ |= 16;
                                this.isInstanceTypeId_ = ahocVar.readInt32();
                            } else if (tag == 50) {
                                if ((i & 32) != 32) {
                                    this.andArgument_ = new ArrayList();
                                    i |= 32;
                                }
                                this.andArgument_.add(ahocVar.readMessage(PARSER, ahogVar));
                            } else if (tag == 58) {
                                if ((i & 64) != 64) {
                                    this.orArgument_ = new ArrayList();
                                    i |= 64;
                                }
                                this.orArgument_.add(ahocVar.readMessage(PARSER, ahogVar));
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
                    if ((i & 32) == 32) {
                        this.andArgument_ = DesugarCollections.unmodifiableList(this.andArgument_);
                    }
                    if ((i & 64) == 64) {
                        this.orArgument_ = DesugarCollections.unmodifiableList(this.orArgument_);
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
        if ((i & 32) == 32) {
            this.andArgument_ = DesugarCollections.unmodifiableList(this.andArgument_);
        }
        if ((i & 64) == 64) {
            this.orArgument_ = DesugarCollections.unmodifiableList(this.orArgument_);
        }
        try {
            ahoeVarNewInstance.flush();
        } catch (IOException unused2) {
        }
    }

    public static ahic getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.flags_ = 0;
        this.valueParameterReference_ = 0;
        this.constantValue_ = ahib.TRUE;
        this.isInstanceType_ = ahjn.getDefaultInstance();
        this.isInstanceTypeId_ = 0;
        this.andArgument_ = Collections.EMPTY_LIST;
        this.orArgument_ = Collections.EMPTY_LIST;
    }

    public static ahhz newBuilder(ahic ahicVar) {
        ahhz ahhzVarNewBuilder = newBuilder();
        ahhzVarNewBuilder.mergeFrom(ahicVar);
        return ahhzVarNewBuilder;
    }

    public ahic getAndArgument(int i) {
        return this.andArgument_.get(i);
    }

    public int getAndArgumentCount() {
        return this.andArgument_.size();
    }

    public List<ahic> getAndArgumentList() {
        return this.andArgument_;
    }

    public ahib getConstantValue() {
        return this.constantValue_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public ahjn getIsInstanceType() {
        return this.isInstanceType_;
    }

    public int getIsInstanceTypeId() {
        return this.isInstanceTypeId_;
    }

    public ahic getOrArgument(int i) {
        return this.orArgument_.get(i);
    }

    public int getOrArgumentCount() {
        return this.orArgument_.size();
    }

    public List<ahic> getOrArgumentList() {
        return this.orArgument_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahic> getParserForType() {
        return PARSER;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.bitField0_;
        int iComputeInt32Size = (i2 & 1) == 1 ? ahoe.computeInt32Size(1, this.flags_) : 0;
        if ((i2 & 2) == 2) {
            iComputeInt32Size += ahoe.computeInt32Size(2, this.valueParameterReference_);
        }
        if ((i2 & 4) == 4) {
            iComputeInt32Size += ahoe.computeEnumSize(3, this.constantValue_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            iComputeInt32Size += ahoe.computeMessageSize(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iComputeInt32Size += ahoe.computeInt32Size(5, this.isInstanceTypeId_);
        }
        for (int i3 = 0; i3 < this.andArgument_.size(); i3++) {
            iComputeInt32Size += ahoe.computeMessageSize(6, this.andArgument_.get(i3));
        }
        for (int i4 = 0; i4 < this.orArgument_.size(); i4++) {
            iComputeInt32Size += ahoe.computeMessageSize(7, this.orArgument_.get(i4));
        }
        int size = iComputeInt32Size + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public int getValueParameterReference() {
        return this.valueParameterReference_;
    }

    public boolean hasConstantValue() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasIsInstanceType() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasIsInstanceTypeId() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasValueParameterReference() {
        return (this.bitField0_ & 2) == 2;
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // defpackage.ahph
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        ?? r1 = 1;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!hasIsInstanceType() || getIsInstanceType().isInitialized()) {
            int i = 0;
            while (true) {
                if (i >= getAndArgumentCount()) {
                    for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
                        if (getOrArgument(i2).isInitialized()) {
                        }
                    }
                } else {
                    if (!getAndArgument(i).isInitialized()) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            r1 = 0;
        }
        this.memoizedIsInitialized = r1;
        return r1;
    }

    @Override // defpackage.ahpg
    public ahhz newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahhz toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeInt32(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            ahoeVar.writeInt32(2, this.valueParameterReference_);
        }
        if ((this.bitField0_ & 4) == 4) {
            ahoeVar.writeEnum(3, this.constantValue_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            ahoeVar.writeMessage(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            ahoeVar.writeInt32(5, this.isInstanceTypeId_);
        }
        for (int i = 0; i < this.andArgument_.size(); i++) {
            ahoeVar.writeMessage(6, this.andArgument_.get(i));
        }
        for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
            ahoeVar.writeMessage(7, this.orArgument_.get(i2));
        }
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahic getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahhz newBuilder() {
        return ahhz.create();
    }

    public /* synthetic */ ahic(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahic(ahok ahokVar) {
        super(ahokVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahokVar.getUnknownFields();
    }

    public /* synthetic */ ahic(ahok ahokVar, ahgm ahgmVar) {
        this(ahokVar);
    }

    private ahic(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
