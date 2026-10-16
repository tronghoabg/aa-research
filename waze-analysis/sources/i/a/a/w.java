package i.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w extends du<w, v> implements fj {
    private static final w DEFAULT_INSTANCE;
    public static final int EXIT_SIGNS_FIELD_NUMBER = 1;
    private static volatile fo<w> PARSER = null;
    public static final int PRIMARY_MARKUP_FIELD_NUMBER = 3;
    public static final int ROAD_SHIELDS_FIELD_NUMBER = 2;
    public static final int SECONDARY_MARKUP_FIELD_NUMBER = 4;
    public static final int TEXT_REPRESENTATION_FIELD_NUMBER = 5;
    private int bitField0_;
    private eo<q> exitSigns_ = emptyProtobufList();
    private eo<t> roadShields_ = emptyProtobufList();
    private String primaryMarkup_ = "";
    private String secondaryMarkup_ = "";
    private String textRepresentation_ = "";

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        du.registerDefaultInstance(w.class, wVar);
    }

    private w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExitSigns(Iterable<? extends q> iterable) {
        ensureExitSignsIsMutable();
        com.google.v.c.addAll(iterable, this.exitSigns_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRoadShields(Iterable<? extends t> iterable) {
        ensureRoadShieldsIsMutable();
        com.google.v.c.addAll(iterable, this.roadShields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExitSigns(int i2, q qVar) {
        Objects.requireNonNull(qVar);
        ensureExitSignsIsMutable();
        this.exitSigns_.add(i2, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRoadShields(int i2, t tVar) {
        Objects.requireNonNull(tVar);
        ensureRoadShieldsIsMutable();
        this.roadShields_.add(i2, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExitSigns() {
        this.exitSigns_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryMarkup() {
        this.bitField0_ &= -2;
        this.primaryMarkup_ = getDefaultInstance().getPrimaryMarkup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadShields() {
        this.roadShields_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondaryMarkup() {
        this.bitField0_ &= -3;
        this.secondaryMarkup_ = getDefaultInstance().getSecondaryMarkup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextRepresentation() {
        this.bitField0_ &= -5;
        this.textRepresentation_ = getDefaultInstance().getTextRepresentation();
    }

    private void ensureExitSignsIsMutable() {
        eo<q> eoVar = this.exitSigns_;
        if (eoVar.c()) {
            return;
        }
        this.exitSigns_ = du.mutableCopy(eoVar);
    }

    private void ensureRoadShieldsIsMutable() {
        eo<t> eoVar = this.roadShields_;
        if (eoVar.c()) {
            return;
        }
        this.roadShields_ = du.mutableCopy(eoVar);
    }

    public static w getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static v newBuilder() {
        return (v) DEFAULT_INSTANCE.createBuilder();
    }

    public static w parseDelimitedFrom(InputStream inputStream) {
        return (w) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static w parseFrom(com.google.v.v vVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<w> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExitSigns(int i2) {
        ensureExitSignsIsMutable();
        this.exitSigns_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRoadShields(int i2) {
        ensureRoadShieldsIsMutable();
        this.roadShields_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExitSigns(int i2, q qVar) {
        Objects.requireNonNull(qVar);
        ensureExitSignsIsMutable();
        this.exitSigns_.set(i2, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryMarkup(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.primaryMarkup_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryMarkupBytes(com.google.v.v vVar) {
        this.primaryMarkup_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadShields(int i2, t tVar) {
        Objects.requireNonNull(tVar);
        ensureRoadShieldsIsMutable();
        this.roadShields_.set(i2, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondaryMarkup(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.secondaryMarkup_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondaryMarkupBytes(com.google.v.v vVar) {
        this.secondaryMarkup_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextRepresentation(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.textRepresentation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextRepresentationBytes(com.google.v.v vVar) {
        this.textRepresentation_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဈ\u0000\u0004ဈ\u0001\u0005ဈ\u0002", new Object[]{"bitField0_", "exitSigns_", q.class, "roadShields_", t.class, "primaryMarkup_", "secondaryMarkup_", "textRepresentation_"});
        }
        if (iOrdinal == 3) {
            return new w();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new v(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<w> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (w.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public q getExitSigns(int i2) {
        return this.exitSigns_.get(i2);
    }

    public int getExitSignsCount() {
        return this.exitSigns_.size();
    }

    public List<q> getExitSignsList() {
        return this.exitSigns_;
    }

    public r getExitSignsOrBuilder(int i2) {
        return this.exitSigns_.get(i2);
    }

    public List<? extends r> getExitSignsOrBuilderList() {
        return this.exitSigns_;
    }

    public String getPrimaryMarkup() {
        return this.primaryMarkup_;
    }

    public com.google.v.v getPrimaryMarkupBytes() {
        return com.google.v.v.s(this.primaryMarkup_);
    }

    public t getRoadShields(int i2) {
        return this.roadShields_.get(i2);
    }

    public int getRoadShieldsCount() {
        return this.roadShields_.size();
    }

    public List<t> getRoadShieldsList() {
        return this.roadShields_;
    }

    public u getRoadShieldsOrBuilder(int i2) {
        return this.roadShields_.get(i2);
    }

    public List<? extends u> getRoadShieldsOrBuilderList() {
        return this.roadShields_;
    }

    public String getSecondaryMarkup() {
        return this.secondaryMarkup_;
    }

    public com.google.v.v getSecondaryMarkupBytes() {
        return com.google.v.v.s(this.secondaryMarkup_);
    }

    public String getTextRepresentation() {
        return this.textRepresentation_;
    }

    public com.google.v.v getTextRepresentationBytes() {
        return com.google.v.v.s(this.textRepresentation_);
    }

    public boolean hasPrimaryMarkup() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSecondaryMarkup() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTextRepresentation() {
        return (this.bitField0_ & 4) != 0;
    }

    public static v newBuilder(w wVar) {
        return (v) DEFAULT_INSTANCE.createBuilder(wVar);
    }

    public static w parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (w) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static w parseFrom(com.google.v.v vVar, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static w parseFrom(z zVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static w parseFrom(z zVar, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExitSigns(q qVar) {
        Objects.requireNonNull(qVar);
        ensureExitSignsIsMutable();
        this.exitSigns_.add(qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRoadShields(t tVar) {
        Objects.requireNonNull(tVar);
        ensureRoadShieldsIsMutable();
        this.roadShields_.add(tVar);
    }

    public static w parseFrom(InputStream inputStream) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static w parseFrom(InputStream inputStream, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static w parseFrom(ByteBuffer byteBuffer) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static w parseFrom(byte[] bArr) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static w parseFrom(byte[] bArr, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
