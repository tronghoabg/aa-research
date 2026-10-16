package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahjy extends ahoq implements ahph {
    public static ahpi<ahjy> PARSER = new ahjw();
    private static final ahjy defaultInstance;
    private int bitField0_;
    private int firstNullable_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<ahjn> type_;
    private final ahoa unknownFields;

    static {
        ahjy ahjyVar = new ahjy(true);
        defaultInstance = ahjyVar;
        ahjyVar.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private ahjy(defpackage.ahoc r9, defpackage.ahog r10) throws java.lang.Throwable {
        /*
            r8 = this;
            r8.<init>()
            r0 = -1
            r8.memoizedIsInitialized = r0
            r8.memoizedSerializedSize = r0
            r8.initFields()
            ahnz r0 = defpackage.ahoa.newOutput()
            r1 = 1
            ahoe r2 = defpackage.ahoe.newInstance(r0, r1)
            r3 = 0
            r4 = r3
            r5 = r4
        L17:
            if (r4 != 0) goto L8e
            int r6 = r9.readTag()     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L65 defpackage.ahou -> L74
            if (r6 == 0) goto L60
            r7 = 10
            if (r6 == r7) goto L3a
            r7 = 16
            if (r6 == r7) goto L2e
            boolean r6 = r8.parseUnknownField(r9, r2, r10, r6)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L65 defpackage.ahou -> L74
            if (r6 != 0) goto L17
            goto L60
        L2e:
            int r6 = r8.bitField0_     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L65 defpackage.ahou -> L74
            r6 = r6 | r1
            r8.bitField0_ = r6     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L65 defpackage.ahou -> L74
            int r6 = r9.readInt32()     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L65 defpackage.ahou -> L74
            r8.firstNullable_ = r6     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L65 defpackage.ahou -> L74
            goto L17
        L3a:
            if (r5 == r1) goto L4a
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46 defpackage.ahou -> L48
            r5.<init>()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46 defpackage.ahou -> L48
            r8.type_ = r5     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46 defpackage.ahou -> L48
            goto L4a
        L44:
            r9 = move-exception
            goto L7a
        L46:
            r9 = move-exception
            goto L67
        L48:
            r9 = move-exception
            goto L76
        L4a:
            java.util.List<ahjn> r5 = r8.type_     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5a defpackage.ahou -> L5d
            ahpi<ahjn> r6 = defpackage.ahjn.PARSER     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5a defpackage.ahou -> L5d
            ahpg r6 = r9.readMessage(r6, r10)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5a defpackage.ahou -> L5d
            r5.add(r6)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5a defpackage.ahou -> L5d
            r5 = r1
            goto L17
        L57:
            r9 = move-exception
            r3 = r1
            goto L7a
        L5a:
            r9 = move-exception
            r3 = r1
            goto L67
        L5d:
            r9 = move-exception
            r3 = r1
            goto L76
        L60:
            r4 = r1
            goto L17
        L62:
            r9 = move-exception
            r3 = r5
            goto L7a
        L65:
            r9 = move-exception
            r3 = r5
        L67:
            ahou r10 = new ahou     // Catch: java.lang.Throwable -> L44
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L44
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L44
            r10.setUnfinishedMessage(r8)     // Catch: java.lang.Throwable -> L44
            throw r10     // Catch: java.lang.Throwable -> L44
        L74:
            r9 = move-exception
            r3 = r5
        L76:
            r9.setUnfinishedMessage(r8)     // Catch: java.lang.Throwable -> L44
            throw r9     // Catch: java.lang.Throwable -> L44
        L7a:
            if (r3 != r1) goto L84
            java.util.List<ahjn> r10 = r8.type_
            java.util.List r10 = j$.util.DesugarCollections.unmodifiableList(r10)
            r8.type_ = r10
        L84:
            r2.flush()     // Catch: java.io.IOException -> L87 java.lang.Throwable -> L9c
        L87:
            ahoa r10 = r0.toByteString()
            r8.unknownFields = r10
            throw r9
        L8e:
            if (r5 != r1) goto L98
            java.util.List<ahjn> r9 = r8.type_
            java.util.List r9 = j$.util.DesugarCollections.unmodifiableList(r9)
            r8.type_ = r9
        L98:
            r2.flush()     // Catch: java.lang.Throwable -> L9c java.io.IOException -> La4
            goto La4
        L9c:
            r9 = move-exception
            ahoa r10 = r0.toByteString()
            r8.unknownFields = r10
            throw r9
        La4:
            ahoa r9 = r0.toByteString()
            r8.unknownFields = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahjy.<init>(ahoc, ahog):void");
    }

    public static ahjy getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.type_ = Collections.EMPTY_LIST;
        this.firstNullable_ = -1;
    }

    public static ahjx newBuilder(ahjy ahjyVar) {
        ahjx ahjxVarNewBuilder = newBuilder();
        ahjxVarNewBuilder.mergeFrom(ahjyVar);
        return ahjxVarNewBuilder;
    }

    public int getFirstNullable() {
        return this.firstNullable_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahjy> getParserForType() {
        return PARSER;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeInt32Size = 0;
        for (int i2 = 0; i2 < this.type_.size(); i2++) {
            iComputeInt32Size += ahoe.computeMessageSize(1, this.type_.get(i2));
        }
        if ((this.bitField0_ & 1) == 1) {
            iComputeInt32Size += ahoe.computeInt32Size(2, this.firstNullable_);
        }
        int size = iComputeInt32Size + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public ahjn getType(int i) {
        return this.type_.get(i);
    }

    public int getTypeCount() {
        return this.type_.size();
    }

    public List<ahjn> getTypeList() {
        return this.type_;
    }

    public boolean hasFirstNullable() {
        return (this.bitField0_ & 1) == 1;
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
            if (i >= getTypeCount()) {
                break;
            }
            if (!getType(i).isInitialized()) {
                r1 = 0;
                break;
            }
            i++;
        }
        this.memoizedIsInitialized = r1;
        return r1;
    }

    @Override // defpackage.ahpg
    public ahjx newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahjx toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.type_.size(); i++) {
            ahoeVar.writeMessage(1, this.type_.get(i));
        }
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeInt32(2, this.firstNullable_);
        }
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahjy getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahjx newBuilder() {
        return ahjx.create();
    }

    public /* synthetic */ ahjy(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahjy(ahok ahokVar) {
        super(ahokVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahokVar.getUnknownFields();
    }

    public /* synthetic */ ahjy(ahok ahokVar, ahgm ahgmVar) {
        this(ahokVar);
    }

    private ahjy(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
