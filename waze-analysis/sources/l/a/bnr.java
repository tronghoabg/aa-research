package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bnr extends com.google.v.du<bnr, bno> implements com.google.v.fj {
    public static final int AVAILABLE_SUBTYPES_FIELD_NUMBER = 4;
    public static final int AVAILABLE_TYPES_FIELD_NUMBER = 3;
    public static final int CONVERSATIONAL_REPORTING_BUTTON_VISIBLE_FIELD_NUMBER = 7;
    private static final bnr DEFAULT_INSTANCE;
    public static final int LEVEL_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<bnr> PARSER = null;
    public static final int REPORTING_BUTTON_MARKER_VISIBLE_SUBTYPE_FIELD_NUMBER = 9;
    public static final int REPORTING_BUTTON_MARKER_VISIBLE_TYPE_FIELD_NUMBER = 8;
    public static final int REPORTING_BUTTON_TOOLTIP_VISIBLE_SUBTYPE_FIELD_NUMBER = 11;
    public static final int REPORTING_BUTTON_TOOLTIP_VISIBLE_TYPE_FIELD_NUMBER = 10;
    public static final int SIRI_EDUCATION_CARD_IS_VISIBLE_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int UGC_INFO_FIELD_NUMBER = 1;
    private int availableSubtypesMemoizedSerializedSize;
    private int availableTypesMemoizedSerializedSize;
    private int bitField0_;
    private boolean conversationalReportingButtonVisible_;
    private int level_;
    private Object reportingButtonMarkerVisible_;
    private Object reportingButtonTooltipVisible_;
    private boolean siriEducationCardIsVisible_;
    private int type_;
    private bnb ugcInfo_;
    private static final com.google.v.el<bob> availableTypes_converter_ = new ve(17);
    private static final com.google.v.el<boa> availableSubtypes_converter_ = new ve(18);
    private int reportingButtonMarkerVisibleCase_ = 0;
    private int reportingButtonTooltipVisibleCase_ = 0;
    private com.google.v.ek availableTypes_ = emptyIntList();
    private com.google.v.ek availableSubtypes_ = emptyIntList();

    static {
        bnr bnrVar = new bnr();
        DEFAULT_INSTANCE = bnrVar;
        com.google.v.du.registerDefaultInstance(bnr.class, bnrVar);
    }

    private bnr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAvailableSubtypes(Iterable<? extends boa> iterable) {
        ensureAvailableSubtypesIsMutable();
        Iterator<? extends boa> it = iterable.iterator();
        while (it.hasNext()) {
            this.availableSubtypes_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAvailableSubtypesValue(Iterable<Integer> iterable) {
        ensureAvailableSubtypesIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.availableSubtypes_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAvailableTypes(Iterable<? extends bob> iterable) {
        ensureAvailableTypesIsMutable();
        Iterator<? extends bob> it = iterable.iterator();
        while (it.hasNext()) {
            this.availableTypes_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAvailableTypesValue(Iterable<Integer> iterable) {
        ensureAvailableTypesIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.availableTypes_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAvailableSubtypes(boa boaVar) {
        Objects.requireNonNull(boaVar);
        ensureAvailableSubtypesIsMutable();
        this.availableSubtypes_.i(boaVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAvailableSubtypesValue(int i2) {
        ensureAvailableSubtypesIsMutable();
        this.availableSubtypes_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAvailableTypes(bob bobVar) {
        Objects.requireNonNull(bobVar);
        ensureAvailableTypesIsMutable();
        this.availableTypes_.i(bobVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAvailableTypesValue(int i2) {
        ensureAvailableTypesIsMutable();
        this.availableTypes_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailableSubtypes() {
        this.availableSubtypes_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailableTypes() {
        this.availableTypes_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationalReportingButtonVisible() {
        this.bitField0_ &= -5;
        this.conversationalReportingButtonVisible_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.level_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportingButtonMarkerVisible() {
        this.reportingButtonMarkerVisibleCase_ = 0;
        this.reportingButtonMarkerVisible_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportingButtonMarkerVisibleSubtype() {
        if (this.reportingButtonMarkerVisibleCase_ == 9) {
            this.reportingButtonMarkerVisibleCase_ = 0;
            this.reportingButtonMarkerVisible_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportingButtonMarkerVisibleType() {
        if (this.reportingButtonMarkerVisibleCase_ == 8) {
            this.reportingButtonMarkerVisibleCase_ = 0;
            this.reportingButtonMarkerVisible_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportingButtonTooltipVisible() {
        this.reportingButtonTooltipVisibleCase_ = 0;
        this.reportingButtonTooltipVisible_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportingButtonTooltipVisibleSubtype() {
        if (this.reportingButtonTooltipVisibleCase_ == 11) {
            this.reportingButtonTooltipVisibleCase_ = 0;
            this.reportingButtonTooltipVisible_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportingButtonTooltipVisibleType() {
        if (this.reportingButtonTooltipVisibleCase_ == 10) {
            this.reportingButtonTooltipVisibleCase_ = 0;
            this.reportingButtonTooltipVisible_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSiriEducationCardIsVisible() {
        this.bitField0_ &= -3;
        this.siriEducationCardIsVisible_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcInfo() {
        this.ugcInfo_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureAvailableSubtypesIsMutable() {
        com.google.v.ek ekVar = this.availableSubtypes_;
        if (ekVar.c()) {
            return;
        }
        this.availableSubtypes_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureAvailableTypesIsMutable() {
        com.google.v.ek ekVar = this.availableTypes_;
        if (ekVar.c()) {
            return;
        }
        this.availableTypes_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static bnr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUgcInfo(bnb bnbVar) {
        Objects.requireNonNull(bnbVar);
        bnb bnbVar2 = this.ugcInfo_;
        if (bnbVar2 != null && bnbVar2 != bnb.getDefaultInstance()) {
            bna bnaVarNewBuilder = bnb.newBuilder(bnbVar2);
            bnaVarNewBuilder.mergeFrom((bna) bnbVar);
            bnbVar = bnaVarNewBuilder.buildPartial();
        }
        this.ugcInfo_ = bnbVar;
        this.bitField0_ |= 1;
    }

    public static bno newBuilder() {
        return (bno) DEFAULT_INSTANCE.createBuilder();
    }

    public static bnr parseDelimitedFrom(InputStream inputStream) {
        return (bnr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bnr parseFrom(com.google.v.v vVar) {
        return (bnr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bnr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailableSubtypes(int i2, boa boaVar) {
        Objects.requireNonNull(boaVar);
        ensureAvailableSubtypesIsMutable();
        this.availableSubtypes_.e(i2, boaVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailableSubtypesValue(int i2, int i3) {
        ensureAvailableSubtypesIsMutable();
        this.availableSubtypes_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailableTypes(int i2, bob bobVar) {
        Objects.requireNonNull(bobVar);
        ensureAvailableTypesIsMutable();
        this.availableTypes_.e(i2, bobVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailableTypesValue(int i2, int i3) {
        ensureAvailableTypesIsMutable();
        this.availableTypes_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationalReportingButtonVisible(boolean z) {
        this.bitField0_ |= 4;
        this.conversationalReportingButtonVisible_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(bny bnyVar) {
        this.level_ = bnyVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevelValue(int i2) {
        this.level_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportingButtonMarkerVisibleSubtype(boa boaVar) {
        this.reportingButtonMarkerVisible_ = Integer.valueOf(boaVar.getNumber());
        this.reportingButtonMarkerVisibleCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportingButtonMarkerVisibleSubtypeValue(int i2) {
        this.reportingButtonMarkerVisibleCase_ = 9;
        this.reportingButtonMarkerVisible_ = Integer.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportingButtonMarkerVisibleType(bob bobVar) {
        this.reportingButtonMarkerVisible_ = Integer.valueOf(bobVar.getNumber());
        this.reportingButtonMarkerVisibleCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportingButtonMarkerVisibleTypeValue(int i2) {
        this.reportingButtonMarkerVisibleCase_ = 8;
        this.reportingButtonMarkerVisible_ = Integer.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportingButtonTooltipVisibleSubtype(boa boaVar) {
        this.reportingButtonTooltipVisible_ = Integer.valueOf(boaVar.getNumber());
        this.reportingButtonTooltipVisibleCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportingButtonTooltipVisibleSubtypeValue(int i2) {
        this.reportingButtonTooltipVisibleCase_ = 11;
        this.reportingButtonTooltipVisible_ = Integer.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportingButtonTooltipVisibleType(bob bobVar) {
        this.reportingButtonTooltipVisible_ = Integer.valueOf(bobVar.getNumber());
        this.reportingButtonTooltipVisibleCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportingButtonTooltipVisibleTypeValue(int i2) {
        this.reportingButtonTooltipVisibleCase_ = 10;
        this.reportingButtonTooltipVisible_ = Integer.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSiriEducationCardIsVisible(boolean z) {
        this.bitField0_ |= 2;
        this.siriEducationCardIsVisible_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bob bobVar) {
        this.type_ = bobVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcInfo(bnb bnbVar) {
        Objects.requireNonNull(bnbVar);
        this.ugcInfo_ = bnbVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0002\u0001\u0001\u000b\u000b\u0000\u0002\u0000\u0001ဉ\u0000\u0002\f\u0003,\u0004,\u0005\f\u0006ဇ\u0001\u0007ဇ\u0002\b?\u0000\t?\u0000\n?\u0001\u000b?\u0001", new Object[]{"reportingButtonMarkerVisible_", "reportingButtonMarkerVisibleCase_", "reportingButtonTooltipVisible_", "reportingButtonTooltipVisibleCase_", "bitField0_", "ugcInfo_", "level_", "availableTypes_", "availableSubtypes_", "type_", "siriEducationCardIsVisible_", "conversationalReportingButtonVisible_"});
        }
        if (iOrdinal == 3) {
            return new bnr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bno(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bnr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bnr.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boa getAvailableSubtypes(int i2) {
        boa boaVarA = boa.a(this.availableSubtypes_.d(i2));
        return boaVarA == null ? boa.UNRECOGNIZED : boaVarA;
    }

    public int getAvailableSubtypesCount() {
        return this.availableSubtypes_.size();
    }

    public List<boa> getAvailableSubtypesList() {
        return new com.google.v.em(this.availableSubtypes_, availableSubtypes_converter_);
    }

    public int getAvailableSubtypesValue(int i2) {
        return this.availableSubtypes_.d(i2);
    }

    public List<Integer> getAvailableSubtypesValueList() {
        return this.availableSubtypes_;
    }

    public bob getAvailableTypes(int i2) {
        bob bobVarA = bob.a(this.availableTypes_.d(i2));
        return bobVarA == null ? bob.UNRECOGNIZED : bobVarA;
    }

    public int getAvailableTypesCount() {
        return this.availableTypes_.size();
    }

    public List<bob> getAvailableTypesList() {
        return new com.google.v.em(this.availableTypes_, availableTypes_converter_);
    }

    public int getAvailableTypesValue(int i2) {
        return this.availableTypes_.d(i2);
    }

    public List<Integer> getAvailableTypesValueList() {
        return this.availableTypes_;
    }

    public boolean getConversationalReportingButtonVisible() {
        return this.conversationalReportingButtonVisible_;
    }

    public bny getLevel() {
        bny bnyVarA = bny.a(this.level_);
        return bnyVarA == null ? bny.UNRECOGNIZED : bnyVarA;
    }

    public int getLevelValue() {
        return this.level_;
    }

    public bnp getReportingButtonMarkerVisibleCase() {
        int i2 = this.reportingButtonMarkerVisibleCase_;
        if (i2 == 0) {
            return bnp.f54352c;
        }
        if (i2 == 8) {
            return bnp.f54350a;
        }
        if (i2 != 9) {
            return null;
        }
        return bnp.f54351b;
    }

    public boa getReportingButtonMarkerVisibleSubtype() {
        if (this.reportingButtonMarkerVisibleCase_ != 9) {
            return boa.UGC_SUBTYPE_UNSPECIFIED;
        }
        boa boaVarA = boa.a(((Integer) this.reportingButtonMarkerVisible_).intValue());
        return boaVarA == null ? boa.UNRECOGNIZED : boaVarA;
    }

    public int getReportingButtonMarkerVisibleSubtypeValue() {
        if (this.reportingButtonMarkerVisibleCase_ == 9) {
            return ((Integer) this.reportingButtonMarkerVisible_).intValue();
        }
        return 0;
    }

    public bob getReportingButtonMarkerVisibleType() {
        if (this.reportingButtonMarkerVisibleCase_ != 8) {
            return bob.UGC_TYPE_UNSPECIFIED;
        }
        bob bobVarA = bob.a(((Integer) this.reportingButtonMarkerVisible_).intValue());
        return bobVarA == null ? bob.UNRECOGNIZED : bobVarA;
    }

    public int getReportingButtonMarkerVisibleTypeValue() {
        if (this.reportingButtonMarkerVisibleCase_ == 8) {
            return ((Integer) this.reportingButtonMarkerVisible_).intValue();
        }
        return 0;
    }

    public bnq getReportingButtonTooltipVisibleCase() {
        int i2 = this.reportingButtonTooltipVisibleCase_;
        if (i2 == 0) {
            return bnq.f54356c;
        }
        if (i2 == 10) {
            return bnq.f54354a;
        }
        if (i2 != 11) {
            return null;
        }
        return bnq.f54355b;
    }

    @Deprecated
    public boa getReportingButtonTooltipVisibleSubtype() {
        if (this.reportingButtonTooltipVisibleCase_ != 11) {
            return boa.UGC_SUBTYPE_UNSPECIFIED;
        }
        boa boaVarA = boa.a(((Integer) this.reportingButtonTooltipVisible_).intValue());
        return boaVarA == null ? boa.UNRECOGNIZED : boaVarA;
    }

    @Deprecated
    public int getReportingButtonTooltipVisibleSubtypeValue() {
        if (this.reportingButtonTooltipVisibleCase_ == 11) {
            return ((Integer) this.reportingButtonTooltipVisible_).intValue();
        }
        return 0;
    }

    @Deprecated
    public bob getReportingButtonTooltipVisibleType() {
        if (this.reportingButtonTooltipVisibleCase_ != 10) {
            return bob.UGC_TYPE_UNSPECIFIED;
        }
        bob bobVarA = bob.a(((Integer) this.reportingButtonTooltipVisible_).intValue());
        return bobVarA == null ? bob.UNRECOGNIZED : bobVarA;
    }

    @Deprecated
    public int getReportingButtonTooltipVisibleTypeValue() {
        if (this.reportingButtonTooltipVisibleCase_ == 10) {
            return ((Integer) this.reportingButtonTooltipVisible_).intValue();
        }
        return 0;
    }

    public boolean getSiriEducationCardIsVisible() {
        return this.siriEducationCardIsVisible_;
    }

    public bob getType() {
        bob bobVarA = bob.a(this.type_);
        return bobVarA == null ? bob.UNRECOGNIZED : bobVarA;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public bnb getUgcInfo() {
        bnb bnbVar = this.ugcInfo_;
        return bnbVar == null ? bnb.getDefaultInstance() : bnbVar;
    }

    public boolean hasConversationalReportingButtonVisible() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasReportingButtonMarkerVisibleSubtype() {
        return this.reportingButtonMarkerVisibleCase_ == 9;
    }

    public boolean hasReportingButtonMarkerVisibleType() {
        return this.reportingButtonMarkerVisibleCase_ == 8;
    }

    @Deprecated
    public boolean hasReportingButtonTooltipVisibleSubtype() {
        return this.reportingButtonTooltipVisibleCase_ == 11;
    }

    @Deprecated
    public boolean hasReportingButtonTooltipVisibleType() {
        return this.reportingButtonTooltipVisibleCase_ == 10;
    }

    public boolean hasSiriEducationCardIsVisible() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUgcInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bno newBuilder(bnr bnrVar) {
        return (bno) DEFAULT_INSTANCE.createBuilder(bnrVar);
    }

    public static bnr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bnr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bnr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bnr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bnr parseFrom(com.google.v.z zVar) {
        return (bnr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bnr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bnr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bnr parseFrom(InputStream inputStream) {
        return (bnr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bnr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bnr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bnr parseFrom(ByteBuffer byteBuffer) {
        return (bnr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bnr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bnr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bnr parseFrom(byte[] bArr) {
        return (bnr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bnr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bnr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
