package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class rd extends com.google.v.du<rd, ra> implements com.google.v.fj {
    public static final int ALERTDETAILS_FIELD_NUMBER = 6;
    private static final rd DEFAULT_INSTANCE;
    public static final int DIFFERENCEMINUTES_FIELD_NUMBER = 3;
    public static final int IMAGELABELTYPE_FIELD_NUMBER = 1;
    public static final int LABELIMAGE_FIELD_NUMBER = 4;
    public static final int LABELTEXT_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<rd> PARSER = null;
    public static final int ROADSHIELD_FIELD_NUMBER = 5;
    private int bitField0_;
    private int differenceMinutes_;
    private Object label_;
    private int labelCase_ = 0;
    private int imageLabelType_ = 1;
    private String labelText_ = "";

    static {
        rd rdVar = new rd();
        DEFAULT_INSTANCE = rdVar;
        com.google.v.du.registerDefaultInstance(rd.class, rdVar);
    }

    private rd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertDetails() {
        if (this.labelCase_ == 6) {
            this.labelCase_ = 0;
            this.label_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDifferenceMinutes() {
        this.bitField0_ &= -5;
        this.differenceMinutes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageLabelType() {
        this.bitField0_ &= -2;
        this.imageLabelType_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.labelCase_ = 0;
        this.label_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabelImage() {
        if (this.labelCase_ == 4) {
            this.labelCase_ = 0;
            this.label_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabelText() {
        this.bitField0_ &= -3;
        this.labelText_ = getDefaultInstance().getLabelText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadShield() {
        if (this.labelCase_ == 5) {
            this.labelCase_ = 0;
            this.label_ = null;
        }
    }

    public static rd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertDetails(com.waze.bg.a.ej ejVar) {
        Objects.requireNonNull(ejVar);
        if (this.labelCase_ == 6 && this.label_ != com.waze.bg.a.ej.getDefaultInstance()) {
            com.waze.bg.a.dk dkVarNewBuilder = com.waze.bg.a.ej.newBuilder((com.waze.bg.a.ej) this.label_);
            dkVarNewBuilder.mergeFrom((com.waze.bg.a.dk) ejVar);
            ejVar = dkVarNewBuilder.buildPartial();
        }
        this.label_ = ejVar;
        this.labelCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoadShield(i.a.a.t tVar) {
        Objects.requireNonNull(tVar);
        if (this.labelCase_ == 5 && this.label_ != i.a.a.t.getDefaultInstance()) {
            i.a.a.s sVarNewBuilder = i.a.a.t.newBuilder((i.a.a.t) this.label_);
            sVarNewBuilder.mergeFrom((i.a.a.s) tVar);
            tVar = sVarNewBuilder.buildPartial();
        }
        this.label_ = tVar;
        this.labelCase_ = 5;
    }

    public static ra newBuilder() {
        return (ra) DEFAULT_INSTANCE.createBuilder();
    }

    public static rd parseDelimitedFrom(InputStream inputStream) {
        return (rd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rd parseFrom(com.google.v.v vVar) {
        return (rd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<rd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertDetails(com.waze.bg.a.ej ejVar) {
        Objects.requireNonNull(ejVar);
        this.label_ = ejVar;
        this.labelCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDifferenceMinutes(int i2) {
        this.bitField0_ |= 4;
        this.differenceMinutes_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageLabelType(rb rbVar) {
        this.imageLabelType_ = rbVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelImage(rb rbVar) {
        this.label_ = Integer.valueOf(rbVar.getNumber());
        this.labelCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.labelText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelTextBytes(com.google.v.v vVar) {
        this.labelText_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadShield(i.a.a.t tVar) {
        Objects.requireNonNull(tVar);
        this.label_ = tVar;
        this.labelCase_ = 5;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            com.google.v.ei eiVar = pa.f48957f;
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u083f\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"label_", "labelCase_", "bitField0_", "imageLabelType_", eiVar, "labelText_", "differenceMinutes_", eiVar, i.a.a.t.class, com.waze.bg.a.ej.class});
        }
        if (iOrdinal == 3) {
            return new rd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ra(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<rd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (rd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.waze.bg.a.ej getAlertDetails() {
        return this.labelCase_ == 6 ? (com.waze.bg.a.ej) this.label_ : com.waze.bg.a.ej.getDefaultInstance();
    }

    public int getDifferenceMinutes() {
        return this.differenceMinutes_;
    }

    public rb getImageLabelType() {
        rb rbVarA = rb.a(this.imageLabelType_);
        return rbVarA == null ? rb.UNKNOWN : rbVarA;
    }

    public rc getLabelCase() {
        int i2 = this.labelCase_;
        if (i2 == 0) {
            return rc.f49022d;
        }
        if (i2 == 4) {
            return rc.f49019a;
        }
        if (i2 == 5) {
            return rc.f49020b;
        }
        if (i2 != 6) {
            return null;
        }
        return rc.f49021c;
    }

    public rb getLabelImage() {
        rb rbVarA;
        return (this.labelCase_ != 4 || (rbVarA = rb.a(((Integer) this.label_).intValue())) == null) ? rb.UNKNOWN : rbVarA;
    }

    public String getLabelText() {
        return this.labelText_;
    }

    public com.google.v.v getLabelTextBytes() {
        return com.google.v.v.s(this.labelText_);
    }

    public i.a.a.t getRoadShield() {
        return this.labelCase_ == 5 ? (i.a.a.t) this.label_ : i.a.a.t.getDefaultInstance();
    }

    public boolean hasAlertDetails() {
        return this.labelCase_ == 6;
    }

    public boolean hasDifferenceMinutes() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasImageLabelType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLabelImage() {
        return this.labelCase_ == 4;
    }

    public boolean hasLabelText() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRoadShield() {
        return this.labelCase_ == 5;
    }

    public static ra newBuilder(rd rdVar) {
        return (ra) DEFAULT_INSTANCE.createBuilder(rdVar);
    }

    public static rd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (rd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static rd parseFrom(com.google.v.z zVar) {
        return (rd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static rd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (rd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static rd parseFrom(InputStream inputStream) {
        return (rd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rd parseFrom(ByteBuffer byteBuffer) {
        return (rd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static rd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (rd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static rd parseFrom(byte[] bArr) {
        return (rd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static rd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (rd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
