package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class ahjf extends ahoq implements ahph {
    public static ahpi<ahjf> PARSER = new ahjd();
    private static final ahjf defaultInstance;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private ahpb string_;
    private final ahoa unknownFields;

    static {
        ahjf ahjfVar = new ahjf(true);
        defaultInstance = ahjfVar;
        ahjfVar.initFields();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private ahjf(defpackage.ahoc r9, defpackage.ahog r10) throws java.lang.Throwable {
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
            if (r4 != 0) goto L7c
            int r6 = r9.readTag()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53 defpackage.ahou -> L62
            if (r6 == 0) goto L4e
            r7 = 10
            if (r6 == r7) goto L2a
            boolean r6 = r8.parseUnknownField(r9, r2, r10, r6)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53 defpackage.ahou -> L62
            if (r6 != 0) goto L17
            goto L4e
        L2a:
            ahoa r6 = r9.readBytes()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53 defpackage.ahou -> L62
            if (r5 == r1) goto L3e
            ahpa r5 = new ahpa     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a defpackage.ahou -> L3c
            r5.<init>()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a defpackage.ahou -> L3c
            r8.string_ = r5     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a defpackage.ahou -> L3c
            goto L3e
        L38:
            r9 = move-exception
            goto L68
        L3a:
            r9 = move-exception
            goto L55
        L3c:
            r9 = move-exception
            goto L64
        L3e:
            ahpb r5 = r8.string_     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48 defpackage.ahou -> L4b
            r5.add(r6)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48 defpackage.ahou -> L4b
            r5 = r1
            goto L17
        L45:
            r9 = move-exception
            r3 = r1
            goto L68
        L48:
            r9 = move-exception
            r3 = r1
            goto L55
        L4b:
            r9 = move-exception
            r3 = r1
            goto L64
        L4e:
            r4 = r1
            goto L17
        L50:
            r9 = move-exception
            r3 = r5
            goto L68
        L53:
            r9 = move-exception
            r3 = r5
        L55:
            ahou r10 = new ahou     // Catch: java.lang.Throwable -> L38
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L38
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L38
            r10.setUnfinishedMessage(r8)     // Catch: java.lang.Throwable -> L38
            throw r10     // Catch: java.lang.Throwable -> L38
        L62:
            r9 = move-exception
            r3 = r5
        L64:
            r9.setUnfinishedMessage(r8)     // Catch: java.lang.Throwable -> L38
            throw r9     // Catch: java.lang.Throwable -> L38
        L68:
            if (r3 != r1) goto L72
            ahpb r10 = r8.string_
            ahpb r10 = r10.getUnmodifiableView()
            r8.string_ = r10
        L72:
            r2.flush()     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L8a
        L75:
            ahoa r10 = r0.toByteString()
            r8.unknownFields = r10
            throw r9
        L7c:
            if (r5 != r1) goto L86
            ahpb r9 = r8.string_
            ahpb r9 = r9.getUnmodifiableView()
            r8.string_ = r9
        L86:
            r2.flush()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L92
            goto L92
        L8a:
            r9 = move-exception
            ahoa r10 = r0.toByteString()
            r8.unknownFields = r10
            throw r9
        L92:
            ahoa r9 = r0.toByteString()
            r8.unknownFields = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahjf.<init>(ahoc, ahog):void");
    }

    public static ahjf getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.string_ = ahpa.EMPTY;
    }

    public static ahje newBuilder(ahjf ahjfVar) {
        ahje ahjeVarNewBuilder = newBuilder();
        ahjeVarNewBuilder.mergeFrom(ahjfVar);
        return ahjeVarNewBuilder;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahjf> getParserForType() {
        return PARSER;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeBytesSizeNoTag = 0;
        for (int i2 = 0; i2 < this.string_.size(); i2++) {
            iComputeBytesSizeNoTag += ahoe.computeBytesSizeNoTag(this.string_.getByteString(i2));
        }
        int size = iComputeBytesSizeNoTag + getStringList().size() + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public String getString(int i) {
        return (String) this.string_.get(i);
    }

    public ahpj getStringList() {
        return this.string_;
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
    public ahje newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahje toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.string_.size(); i++) {
            ahoeVar.writeBytes(1, this.string_.getByteString(i));
        }
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahjf getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahje newBuilder() {
        return ahje.create();
    }

    public /* synthetic */ ahjf(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahjf(ahok ahokVar) {
        super(ahokVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahokVar.getUnknownFields();
    }

    public /* synthetic */ ahjf(ahok ahokVar, ahgm ahgmVar) {
        this(ahokVar);
    }

    private ahjf(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
