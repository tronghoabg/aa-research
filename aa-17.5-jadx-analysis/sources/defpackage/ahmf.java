package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahmf extends ahoq implements ahph {
    public static ahpi<ahmf> PARSER = new ahmb();
    private static final ahmf defaultInstance;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private ahme operation_;
    private int predefinedIndex_;
    private int range_;
    private int replaceCharMemoizedSerializedSize;
    private List<Integer> replaceChar_;
    private Object string_;
    private int substringIndexMemoizedSerializedSize;
    private List<Integer> substringIndex_;
    private final ahoa unknownFields;

    static {
        ahmf ahmfVar = new ahmf(true);
        defaultInstance = ahmfVar;
        ahmfVar.initFields();
    }

    private ahmf(ahoc ahocVar, ahog ahogVar) throws ahou {
        this.substringIndexMemoizedSerializedSize = -1;
        this.replaceCharMemoizedSerializedSize = -1;
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
                                this.range_ = ahocVar.readInt32();
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.predefinedIndex_ = ahocVar.readInt32();
                            } else if (tag == 24) {
                                int i2 = ahocVar.readEnum();
                                ahme ahmeVarValueOf = ahme.valueOf(i2);
                                if (ahmeVarValueOf == null) {
                                    ahoeVarNewInstance.writeRawVarint32(tag);
                                    ahoeVarNewInstance.writeRawVarint32(i2);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.operation_ = ahmeVarValueOf;
                                }
                            } else if (tag == 32) {
                                if ((i & 16) != 16) {
                                    this.substringIndex_ = new ArrayList();
                                    i |= 16;
                                }
                                this.substringIndex_.add(Integer.valueOf(ahocVar.readInt32()));
                            } else if (tag == 34) {
                                int iPushLimit = ahocVar.pushLimit(ahocVar.readRawVarint32());
                                if ((i & 16) != 16 && ahocVar.getBytesUntilLimit() > 0) {
                                    this.substringIndex_ = new ArrayList();
                                    i |= 16;
                                }
                                while (ahocVar.getBytesUntilLimit() > 0) {
                                    this.substringIndex_.add(Integer.valueOf(ahocVar.readInt32()));
                                }
                                ahocVar.popLimit(iPushLimit);
                            } else if (tag == 40) {
                                if ((i & 32) != 32) {
                                    this.replaceChar_ = new ArrayList();
                                    i |= 32;
                                }
                                this.replaceChar_.add(Integer.valueOf(ahocVar.readInt32()));
                            } else if (tag == 42) {
                                int iPushLimit2 = ahocVar.pushLimit(ahocVar.readRawVarint32());
                                if ((i & 32) != 32 && ahocVar.getBytesUntilLimit() > 0) {
                                    this.replaceChar_ = new ArrayList();
                                    i |= 32;
                                }
                                while (ahocVar.getBytesUntilLimit() > 0) {
                                    this.replaceChar_.add(Integer.valueOf(ahocVar.readInt32()));
                                }
                                ahocVar.popLimit(iPushLimit2);
                            } else if (tag == 50) {
                                ahoa bytes = ahocVar.readBytes();
                                this.bitField0_ |= 4;
                                this.string_ = bytes;
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
                    if ((i & 16) == 16) {
                        this.substringIndex_ = DesugarCollections.unmodifiableList(this.substringIndex_);
                    }
                    if ((i & 32) == 32) {
                        this.replaceChar_ = DesugarCollections.unmodifiableList(this.replaceChar_);
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
        if ((i & 16) == 16) {
            this.substringIndex_ = DesugarCollections.unmodifiableList(this.substringIndex_);
        }
        if ((i & 32) == 32) {
            this.replaceChar_ = DesugarCollections.unmodifiableList(this.replaceChar_);
        }
        try {
            ahoeVarNewInstance.flush();
        } catch (IOException unused2) {
        }
    }

    public static ahmf getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.range_ = 1;
        this.predefinedIndex_ = 0;
        this.string_ = "";
        this.operation_ = ahme.NONE;
        this.substringIndex_ = Collections.EMPTY_LIST;
        this.replaceChar_ = Collections.EMPTY_LIST;
    }

    public static ahmc newBuilder(ahmf ahmfVar) {
        ahmc ahmcVarNewBuilder = newBuilder();
        ahmcVarNewBuilder.mergeFrom(ahmfVar);
        return ahmcVarNewBuilder;
    }

    public ahme getOperation() {
        return this.operation_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahmf> getParserForType() {
        return PARSER;
    }

    public int getPredefinedIndex() {
        return this.predefinedIndex_;
    }

    public int getRange() {
        return this.range_;
    }

    public int getReplaceCharCount() {
        return this.replaceChar_.size();
    }

    public List<Integer> getReplaceCharList() {
        return this.replaceChar_;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.bitField0_;
        int iComputeInt32Size = (i2 & 1) == 1 ? ahoe.computeInt32Size(1, this.range_) : 0;
        if ((i2 & 2) == 2) {
            iComputeInt32Size += ahoe.computeInt32Size(2, this.predefinedIndex_);
        }
        if ((i2 & 8) == 8) {
            iComputeInt32Size += ahoe.computeEnumSize(3, this.operation_.getNumber());
        }
        int iComputeInt32SizeNoTag = 0;
        for (int i3 = 0; i3 < this.substringIndex_.size(); i3++) {
            iComputeInt32SizeNoTag += ahoe.computeInt32SizeNoTag(this.substringIndex_.get(i3).intValue());
        }
        int iComputeInt32SizeNoTag2 = iComputeInt32Size + iComputeInt32SizeNoTag;
        if (!getSubstringIndexList().isEmpty()) {
            iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + ahoe.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
        }
        this.substringIndexMemoizedSerializedSize = iComputeInt32SizeNoTag;
        int iComputeInt32SizeNoTag3 = 0;
        for (int i4 = 0; i4 < this.replaceChar_.size(); i4++) {
            iComputeInt32SizeNoTag3 += ahoe.computeInt32SizeNoTag(this.replaceChar_.get(i4).intValue());
        }
        int iComputeBytesSize = iComputeInt32SizeNoTag2 + iComputeInt32SizeNoTag3;
        if (!getReplaceCharList().isEmpty()) {
            iComputeBytesSize = iComputeBytesSize + 1 + ahoe.computeInt32SizeNoTag(iComputeInt32SizeNoTag3);
        }
        this.replaceCharMemoizedSerializedSize = iComputeInt32SizeNoTag3;
        if ((this.bitField0_ & 4) == 4) {
            iComputeBytesSize += ahoe.computeBytesSize(6, getStringBytes());
        }
        int size = iComputeBytesSize + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public String getString() {
        Object obj = this.string_;
        if (obj instanceof String) {
            return (String) obj;
        }
        ahoa ahoaVar = (ahoa) obj;
        String stringUtf8 = ahoaVar.toStringUtf8();
        if (ahoaVar.isValidUtf8()) {
            this.string_ = stringUtf8;
        }
        return stringUtf8;
    }

    public ahoa getStringBytes() {
        Object obj = this.string_;
        if (!(obj instanceof String)) {
            return (ahoa) obj;
        }
        ahoa ahoaVarCopyFromUtf8 = ahoa.copyFromUtf8((String) obj);
        this.string_ = ahoaVarCopyFromUtf8;
        return ahoaVarCopyFromUtf8;
    }

    public int getSubstringIndexCount() {
        return this.substringIndex_.size();
    }

    public List<Integer> getSubstringIndexList() {
        return this.substringIndex_;
    }

    public boolean hasOperation() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasPredefinedIndex() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasRange() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasString() {
        return (this.bitField0_ & 4) == 4;
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // defpackage.ahpg
    public ahmc newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahmc toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeInt32(1, this.range_);
        }
        if ((this.bitField0_ & 2) == 2) {
            ahoeVar.writeInt32(2, this.predefinedIndex_);
        }
        if ((this.bitField0_ & 8) == 8) {
            ahoeVar.writeEnum(3, this.operation_.getNumber());
        }
        if (getSubstringIndexList().size() > 0) {
            ahoeVar.writeRawVarint32(34);
            ahoeVar.writeRawVarint32(this.substringIndexMemoizedSerializedSize);
        }
        for (int i = 0; i < this.substringIndex_.size(); i++) {
            ahoeVar.writeInt32NoTag(this.substringIndex_.get(i).intValue());
        }
        if (getReplaceCharList().size() > 0) {
            ahoeVar.writeRawVarint32(42);
            ahoeVar.writeRawVarint32(this.replaceCharMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.replaceChar_.size(); i2++) {
            ahoeVar.writeInt32NoTag(this.replaceChar_.get(i2).intValue());
        }
        if ((this.bitField0_ & 4) == 4) {
            ahoeVar.writeBytes(6, getStringBytes());
        }
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahmf getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahmc newBuilder() {
        return ahmc.create();
    }

    private ahmf(ahok ahokVar) {
        super(ahokVar);
        this.substringIndexMemoizedSerializedSize = -1;
        this.replaceCharMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahokVar.getUnknownFields();
    }

    private ahmf(boolean z) {
        this.substringIndexMemoizedSerializedSize = -1;
        this.replaceCharMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
