package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bej extends com.google.v.du<bej, bei> implements com.google.v.fj {
    private static final bej DEFAULT_INSTANCE;
    public static final int MENTIONED_REPORT_TYPES_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bej> PARSER = null;
    public static final int SIRI_DIALOG_TEXT_FIELD_NUMBER = 3;
    public static final int UGC_CONTEXT_ID_FIELD_NUMBER = 2;
    private static final com.google.v.el<bob> mentionedReportTypes_converter_ = new ve(14);
    private int mentionedReportTypesMemoizedSerializedSize;
    private com.google.v.ek mentionedReportTypes_ = emptyIntList();
    private String ugcContextId_ = "";
    private String siriDialogText_ = "";

    static {
        bej bejVar = new bej();
        DEFAULT_INSTANCE = bejVar;
        com.google.v.du.registerDefaultInstance(bej.class, bejVar);
    }

    private bej() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMentionedReportTypes(Iterable<? extends bob> iterable) {
        ensureMentionedReportTypesIsMutable();
        Iterator<? extends bob> it = iterable.iterator();
        while (it.hasNext()) {
            this.mentionedReportTypes_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMentionedReportTypesValue(Iterable<Integer> iterable) {
        ensureMentionedReportTypesIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.mentionedReportTypes_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMentionedReportTypes(bob bobVar) {
        Objects.requireNonNull(bobVar);
        ensureMentionedReportTypesIsMutable();
        this.mentionedReportTypes_.i(bobVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMentionedReportTypesValue(int i2) {
        ensureMentionedReportTypesIsMutable();
        this.mentionedReportTypes_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMentionedReportTypes() {
        this.mentionedReportTypes_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSiriDialogText() {
        this.siriDialogText_ = getDefaultInstance().getSiriDialogText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcContextId() {
        this.ugcContextId_ = getDefaultInstance().getUgcContextId();
    }

    private void ensureMentionedReportTypesIsMutable() {
        com.google.v.ek ekVar = this.mentionedReportTypes_;
        if (ekVar.c()) {
            return;
        }
        this.mentionedReportTypes_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static bej getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bei newBuilder() {
        return (bei) DEFAULT_INSTANCE.createBuilder();
    }

    public static bej parseDelimitedFrom(InputStream inputStream) {
        return (bej) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bej parseFrom(com.google.v.v vVar) {
        return (bej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bej> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMentionedReportTypes(int i2, bob bobVar) {
        Objects.requireNonNull(bobVar);
        ensureMentionedReportTypesIsMutable();
        this.mentionedReportTypes_.e(i2, bobVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMentionedReportTypesValue(int i2, int i3) {
        ensureMentionedReportTypesIsMutable();
        this.mentionedReportTypes_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSiriDialogText(String str) {
        Objects.requireNonNull(str);
        this.siriDialogText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSiriDialogTextBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.siriDialogText_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcContextId(String str) {
        Objects.requireNonNull(str);
        this.ugcContextId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcContextIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.ugcContextId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001,\u0002Ȉ\u0003Ȉ", new Object[]{"mentionedReportTypes_", "ugcContextId_", "siriDialogText_"});
        }
        if (iOrdinal == 3) {
            return new bej();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bei(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bej> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bej.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bob getMentionedReportTypes(int i2) {
        bob bobVarA = bob.a(this.mentionedReportTypes_.d(i2));
        return bobVarA == null ? bob.UNRECOGNIZED : bobVarA;
    }

    public int getMentionedReportTypesCount() {
        return this.mentionedReportTypes_.size();
    }

    public List<bob> getMentionedReportTypesList() {
        return new com.google.v.em(this.mentionedReportTypes_, mentionedReportTypes_converter_);
    }

    public int getMentionedReportTypesValue(int i2) {
        return this.mentionedReportTypes_.d(i2);
    }

    public List<Integer> getMentionedReportTypesValueList() {
        return this.mentionedReportTypes_;
    }

    public String getSiriDialogText() {
        return this.siriDialogText_;
    }

    public com.google.v.v getSiriDialogTextBytes() {
        return com.google.v.v.s(this.siriDialogText_);
    }

    public String getUgcContextId() {
        return this.ugcContextId_;
    }

    public com.google.v.v getUgcContextIdBytes() {
        return com.google.v.v.s(this.ugcContextId_);
    }

    public static bei newBuilder(bej bejVar) {
        return (bei) DEFAULT_INSTANCE.createBuilder(bejVar);
    }

    public static bej parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bej) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bej parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bej parseFrom(com.google.v.z zVar) {
        return (bej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bej parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bej parseFrom(InputStream inputStream) {
        return (bej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bej parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bej parseFrom(ByteBuffer byteBuffer) {
        return (bej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bej parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bej parseFrom(byte[] bArr) {
        return (bej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bej parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
