package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahkl extends ahoq implements ahph {
    public static ahpi<ahkl> PARSER = new ahkj();
    private static final ahkl defaultInstance;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<ahki> requirement_;
    private final ahoa unknownFields;

    static {
        ahkl ahklVar = new ahkl(true);
        defaultInstance = ahklVar;
        ahklVar.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private ahkl(defpackage.ahoc r9, defpackage.ahog r10) throws java.lang.Throwable {
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
            if (r4 != 0) goto L7e
            int r6 = r9.readTag()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55 defpackage.ahou -> L64
            if (r6 == 0) goto L50
            r7 = 10
            if (r6 == r7) goto L2a
            boolean r6 = r8.parseUnknownField(r9, r2, r10, r6)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55 defpackage.ahou -> L64
            if (r6 != 0) goto L17
            goto L50
        L2a:
            if (r5 == r1) goto L3a
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 defpackage.ahou -> L38
            r5.<init>()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 defpackage.ahou -> L38
            r8.requirement_ = r5     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36 defpackage.ahou -> L38
            goto L3a
        L34:
            r9 = move-exception
            goto L6a
        L36:
            r9 = move-exception
            goto L57
        L38:
            r9 = move-exception
            goto L66
        L3a:
            java.util.List<ahki> r5 = r8.requirement_     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a defpackage.ahou -> L4d
            ahpi<ahki> r6 = defpackage.ahki.PARSER     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a defpackage.ahou -> L4d
            ahpg r6 = r9.readMessage(r6, r10)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a defpackage.ahou -> L4d
            r5.add(r6)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a defpackage.ahou -> L4d
            r5 = r1
            goto L17
        L47:
            r9 = move-exception
            r3 = r1
            goto L6a
        L4a:
            r9 = move-exception
            r3 = r1
            goto L57
        L4d:
            r9 = move-exception
            r3 = r1
            goto L66
        L50:
            r4 = r1
            goto L17
        L52:
            r9 = move-exception
            r3 = r5
            goto L6a
        L55:
            r9 = move-exception
            r3 = r5
        L57:
            ahou r10 = new ahou     // Catch: java.lang.Throwable -> L34
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L34
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L34
            r10.setUnfinishedMessage(r8)     // Catch: java.lang.Throwable -> L34
            throw r10     // Catch: java.lang.Throwable -> L34
        L64:
            r9 = move-exception
            r3 = r5
        L66:
            r9.setUnfinishedMessage(r8)     // Catch: java.lang.Throwable -> L34
            throw r9     // Catch: java.lang.Throwable -> L34
        L6a:
            if (r3 != r1) goto L74
            java.util.List<ahki> r10 = r8.requirement_
            java.util.List r10 = j$.util.DesugarCollections.unmodifiableList(r10)
            r8.requirement_ = r10
        L74:
            r2.flush()     // Catch: java.io.IOException -> L77 java.lang.Throwable -> L8c
        L77:
            ahoa r10 = r0.toByteString()
            r8.unknownFields = r10
            throw r9
        L7e:
            if (r5 != r1) goto L88
            java.util.List<ahki> r9 = r8.requirement_
            java.util.List r9 = j$.util.DesugarCollections.unmodifiableList(r9)
            r8.requirement_ = r9
        L88:
            r2.flush()     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L94
            goto L94
        L8c:
            r9 = move-exception
            ahoa r10 = r0.toByteString()
            r8.unknownFields = r10
            throw r9
        L94:
            ahoa r9 = r0.toByteString()
            r8.unknownFields = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahkl.<init>(ahoc, ahog):void");
    }

    public static ahkl getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.requirement_ = Collections.EMPTY_LIST;
    }

    public static ahkk newBuilder(ahkl ahklVar) {
        ahkk ahkkVarNewBuilder = newBuilder();
        ahkkVarNewBuilder.mergeFrom(ahklVar);
        return ahkkVarNewBuilder;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahkl> getParserForType() {
        return PARSER;
    }

    public int getRequirementCount() {
        return this.requirement_.size();
    }

    public List<ahki> getRequirementList() {
        return this.requirement_;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = 0;
        for (int i2 = 0; i2 < this.requirement_.size(); i2++) {
            iComputeMessageSize += ahoe.computeMessageSize(1, this.requirement_.get(i2));
        }
        int size = iComputeMessageSize + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
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
    public ahkk newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahkk toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.requirement_.size(); i++) {
            ahoeVar.writeMessage(1, this.requirement_.get(i));
        }
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahkl getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahkk newBuilder() {
        return ahkk.create();
    }

    public /* synthetic */ ahkl(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahkl(ahok ahokVar) {
        super(ahokVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahokVar.getUnknownFields();
    }

    public /* synthetic */ ahkl(ahok ahokVar, ahgm ahgmVar) {
        this(ahokVar);
    }

    private ahkl(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
