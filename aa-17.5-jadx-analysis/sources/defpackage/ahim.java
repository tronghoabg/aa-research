package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahim extends ahon<ahim> implements ahph {
    public static ahpi<ahim> PARSER = new ahik();
    private static final ahim defaultInstance;
    private int bitField0_;
    private List<ahif> function_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<ahis> property_;
    private List<ahjq> typeAlias_;
    private ahjy typeTable_;
    private final ahoa unknownFields;
    private ahkl versionRequirementTable_;

    static {
        ahim ahimVar = new ahim(true);
        defaultInstance = ahimVar;
        ahimVar.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    private ahim(ahoc ahocVar, ahog ahogVar) throws ahou {
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
                        try {
                            int tag = ahocVar.readTag();
                            if (tag != 0) {
                                if (tag == 26) {
                                    int i = (c == true ? 1 : 0) & 1;
                                    c = c;
                                    if (i != 1) {
                                        this.function_ = new ArrayList();
                                        c = (c == true ? 1 : 0) | 1;
                                    }
                                    this.function_.add(ahocVar.readMessage(ahif.PARSER, ahogVar));
                                } else if (tag == 34) {
                                    int i2 = (c == true ? 1 : 0) & 2;
                                    c = c;
                                    if (i2 != 2) {
                                        this.property_ = new ArrayList();
                                        c = (c == true ? 1 : 0) | 2;
                                    }
                                    this.property_.add(ahocVar.readMessage(ahis.PARSER, ahogVar));
                                } else if (tag != 42) {
                                    if (tag == 242) {
                                        ahjx builder = (this.bitField0_ & 1) == 1 ? this.typeTable_.toBuilder() : null;
                                        ahjy ahjyVar = (ahjy) ahocVar.readMessage(ahjy.PARSER, ahogVar);
                                        this.typeTable_ = ahjyVar;
                                        if (builder != null) {
                                            builder.mergeFrom(ahjyVar);
                                            this.typeTable_ = builder.buildPartial();
                                        }
                                        this.bitField0_ |= 1;
                                    } else if (tag == 258) {
                                        ahkk builder2 = (this.bitField0_ & 2) == 2 ? this.versionRequirementTable_.toBuilder() : null;
                                        ahkl ahklVar = (ahkl) ahocVar.readMessage(ahkl.PARSER, ahogVar);
                                        this.versionRequirementTable_ = ahklVar;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(ahklVar);
                                            this.versionRequirementTable_ = builder2.buildPartial();
                                        }
                                        this.bitField0_ |= 2;
                                    } else if (!parseUnknownField(ahocVar, ahoeVarNewInstance, ahogVar, tag)) {
                                    }
                                } else {
                                    int i3 = (c == true ? 1 : 0) & 4;
                                    c = c;
                                    if (i3 != 4) {
                                        this.typeAlias_ = new ArrayList();
                                        c = (c == true ? 1 : 0) | 4;
                                    }
                                    this.typeAlias_.add(ahocVar.readMessage(ahjq.PARSER, ahogVar));
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            ahou ahouVar = new ahou(e.getMessage());
                            ahouVar.setUnfinishedMessage(this);
                            throw ahouVar;
                        }
                    } catch (ahou e2) {
                        e2.setUnfinishedMessage(this);
                        throw e2;
                    }
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & 1) == 1) {
                        this.function_ = DesugarCollections.unmodifiableList(this.function_);
                    }
                    if (((c == true ? 1 : 0) & 2) == 2) {
                        this.property_ = DesugarCollections.unmodifiableList(this.property_);
                    }
                    if (((c == true ? 1 : 0) & 4) == 4) {
                        this.typeAlias_ = DesugarCollections.unmodifiableList(this.typeAlias_);
                    }
                    try {
                        ahoeVarNewInstance.flush();
                    } catch (IOException unused) {
                    }
                    this.unknownFields = ahnzVarNewOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            } catch (Throwable th2) {
                this.unknownFields = ahnzVarNewOutput.toByteString();
                throw th2;
            }
        }
        if (((c == true ? 1 : 0) & 1) == 1) {
            this.function_ = DesugarCollections.unmodifiableList(this.function_);
        }
        if (((c == true ? 1 : 0) & 2) == 2) {
            this.property_ = DesugarCollections.unmodifiableList(this.property_);
        }
        if (((c == true ? 1 : 0) & 4) == 4) {
            this.typeAlias_ = DesugarCollections.unmodifiableList(this.typeAlias_);
        }
        try {
            ahoeVarNewInstance.flush();
        } catch (IOException unused2) {
        }
        this.unknownFields = ahnzVarNewOutput.toByteString();
        makeExtensionsImmutable();
    }

    public static ahim getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.function_ = Collections.EMPTY_LIST;
        this.property_ = Collections.EMPTY_LIST;
        this.typeAlias_ = Collections.EMPTY_LIST;
        this.typeTable_ = ahjy.getDefaultInstance();
        this.versionRequirementTable_ = ahkl.getDefaultInstance();
    }

    public static ahil newBuilder(ahim ahimVar) {
        ahil ahilVarNewBuilder = newBuilder();
        ahilVarNewBuilder.mergeFrom(ahimVar);
        return ahilVarNewBuilder;
    }

    public static ahim parseFrom(InputStream inputStream, ahog ahogVar) throws IOException {
        return PARSER.parseFrom(inputStream, ahogVar);
    }

    public ahif getFunction(int i) {
        return this.function_.get(i);
    }

    public int getFunctionCount() {
        return this.function_.size();
    }

    public List<ahif> getFunctionList() {
        return this.function_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahim> getParserForType() {
        return PARSER;
    }

    public ahis getProperty(int i) {
        return this.property_.get(i);
    }

    public int getPropertyCount() {
        return this.property_.size();
    }

    public List<ahis> getPropertyList() {
        return this.property_;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = 0;
        for (int i2 = 0; i2 < this.function_.size(); i2++) {
            iComputeMessageSize += ahoe.computeMessageSize(3, this.function_.get(i2));
        }
        for (int i3 = 0; i3 < this.property_.size(); i3++) {
            iComputeMessageSize += ahoe.computeMessageSize(4, this.property_.get(i3));
        }
        for (int i4 = 0; i4 < this.typeAlias_.size(); i4++) {
            iComputeMessageSize += ahoe.computeMessageSize(5, this.typeAlias_.get(i4));
        }
        if ((this.bitField0_ & 1) == 1) {
            iComputeMessageSize += ahoe.computeMessageSize(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            iComputeMessageSize += ahoe.computeMessageSize(32, this.versionRequirementTable_);
        }
        int iExtensionsSerializedSize = iComputeMessageSize + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = iExtensionsSerializedSize;
        return iExtensionsSerializedSize;
    }

    public ahjq getTypeAlias(int i) {
        return this.typeAlias_.get(i);
    }

    public int getTypeAliasCount() {
        return this.typeAlias_.size();
    }

    public List<ahjq> getTypeAliasList() {
        return this.typeAlias_;
    }

    public ahjy getTypeTable() {
        return this.typeTable_;
    }

    public ahkl getVersionRequirementTable() {
        return this.versionRequirementTable_;
    }

    public boolean hasTypeTable() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasVersionRequirementTable() {
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
        int i = 0;
        while (true) {
            if (i >= getFunctionCount()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= getPropertyCount()) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= getTypeAliasCount()) {
                                if ((hasTypeTable() && !getTypeTable().isInitialized()) || !extensionsAreInitialized()) {
                                    break;
                                }
                            } else {
                                if (!getTypeAlias(i3).isInitialized()) {
                                    break;
                                }
                                i3++;
                            }
                        }
                    } else {
                        if (!getProperty(i2).isInitialized()) {
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                if (!getFunction(i).isInitialized()) {
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
    public ahil newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahil toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        ahom ahomVarNewExtensionWriter = newExtensionWriter();
        for (int i = 0; i < this.function_.size(); i++) {
            ahoeVar.writeMessage(3, this.function_.get(i));
        }
        for (int i2 = 0; i2 < this.property_.size(); i2++) {
            ahoeVar.writeMessage(4, this.property_.get(i2));
        }
        for (int i3 = 0; i3 < this.typeAlias_.size(); i3++) {
            ahoeVar.writeMessage(5, this.typeAlias_.get(i3));
        }
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeMessage(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            ahoeVar.writeMessage(32, this.versionRequirementTable_);
        }
        ahomVarNewExtensionWriter.writeUntil(200, ahoeVar);
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahim getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahil newBuilder() {
        return ahil.create();
    }

    public /* synthetic */ ahim(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahim(ahol<ahim, ?> aholVar) {
        super(aholVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = aholVar.getUnknownFields();
    }

    public /* synthetic */ ahim(ahol aholVar, ahgm ahgmVar) {
        this((ahol<ahim, ?>) aholVar);
    }

    private ahim(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
