package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class sg extends com.google.v.du<sg, se> implements com.google.v.fj {
    private static final sg DEFAULT_INSTANCE;
    public static final int DETOUR_APPROACHING_FIELD_NUMBER = 2;
    public static final int DETOUR_CLICKED_FIELD_NUMBER = 6;
    public static final int DETOUR_REACHED_FIELD_NUMBER = 4;
    public static final int DETOUR_RECEIVED_FIELD_NUMBER = 5;
    public static final int DETOUR_REMOVED_FIELD_NUMBER = 3;
    public static final int DETOUR_SHOWN_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<sg> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        sg sgVar = new sg();
        DEFAULT_INSTANCE = sgVar;
        com.google.v.du.registerDefaultInstance(sg.class, sgVar);
    }

    private sg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourApproaching() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourClicked() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourReached() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourReceived() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourRemoved() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourShown() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static sg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDetourApproaching(rq rqVar) {
        Objects.requireNonNull(rqVar);
        if (this.statCase_ == 2 && this.stat_ != rq.getDefaultInstance()) {
            rp rpVarNewBuilder = rq.newBuilder((rq) this.stat_);
            rpVarNewBuilder.mergeFrom((rp) rqVar);
            rqVar = rpVarNewBuilder.buildPartial();
        }
        this.stat_ = rqVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDetourClicked(rt rtVar) {
        Objects.requireNonNull(rtVar);
        if (this.statCase_ == 6 && this.stat_ != rt.getDefaultInstance()) {
            rs rsVarNewBuilder = rt.newBuilder((rt) this.stat_);
            rsVarNewBuilder.mergeFrom((rs) rtVar);
            rtVar = rsVarNewBuilder.buildPartial();
        }
        this.stat_ = rtVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDetourReached(rw rwVar) {
        Objects.requireNonNull(rwVar);
        if (this.statCase_ == 4 && this.stat_ != rw.getDefaultInstance()) {
            rv rvVarNewBuilder = rw.newBuilder((rw) this.stat_);
            rvVarNewBuilder.mergeFrom((rv) rwVar);
            rwVar = rvVarNewBuilder.buildPartial();
        }
        this.stat_ = rwVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDetourReceived(ry ryVar) {
        Objects.requireNonNull(ryVar);
        if (this.statCase_ == 5 && this.stat_ != ry.getDefaultInstance()) {
            rx rxVarNewBuilder = ry.newBuilder((ry) this.stat_);
            rxVarNewBuilder.mergeFrom((rx) ryVar);
            ryVar = rxVarNewBuilder.buildPartial();
        }
        this.stat_ = ryVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDetourRemoved(sb sbVar) {
        Objects.requireNonNull(sbVar);
        if (this.statCase_ == 3 && this.stat_ != sb.getDefaultInstance()) {
            rz rzVarNewBuilder = sb.newBuilder((sb) this.stat_);
            rzVarNewBuilder.mergeFrom((rz) sbVar);
            sbVar = rzVarNewBuilder.buildPartial();
        }
        this.stat_ = sbVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDetourShown(sd sdVar) {
        Objects.requireNonNull(sdVar);
        if (this.statCase_ == 1 && this.stat_ != sd.getDefaultInstance()) {
            sc scVarNewBuilder = sd.newBuilder((sd) this.stat_);
            scVarNewBuilder.mergeFrom((sc) sdVar);
            sdVar = scVarNewBuilder.buildPartial();
        }
        this.stat_ = sdVar;
        this.statCase_ = 1;
    }

    public static se newBuilder() {
        return (se) DEFAULT_INSTANCE.createBuilder();
    }

    public static sg parseDelimitedFrom(InputStream inputStream) {
        return (sg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sg parseFrom(com.google.v.v vVar) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<sg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourApproaching(rq rqVar) {
        Objects.requireNonNull(rqVar);
        this.stat_ = rqVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourClicked(rt rtVar) {
        Objects.requireNonNull(rtVar);
        this.stat_ = rtVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourReached(rw rwVar) {
        Objects.requireNonNull(rwVar);
        this.stat_ = rwVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourReceived(ry ryVar) {
        Objects.requireNonNull(ryVar);
        this.stat_ = ryVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourRemoved(sb sbVar) {
        Objects.requireNonNull(sbVar);
        this.stat_ = sbVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourShown(sd sdVar) {
        Objects.requireNonNull(sdVar);
        this.stat_ = sdVar;
        this.statCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"stat_", "statCase_", sd.class, rq.class, sb.class, rw.class, ry.class, rt.class});
        }
        if (iOrdinal == 3) {
            return new sg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new se(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<sg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (sg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public rq getDetourApproaching() {
        return this.statCase_ == 2 ? (rq) this.stat_ : rq.getDefaultInstance();
    }

    public rt getDetourClicked() {
        return this.statCase_ == 6 ? (rt) this.stat_ : rt.getDefaultInstance();
    }

    public rw getDetourReached() {
        return this.statCase_ == 4 ? (rw) this.stat_ : rw.getDefaultInstance();
    }

    public ry getDetourReceived() {
        return this.statCase_ == 5 ? (ry) this.stat_ : ry.getDefaultInstance();
    }

    public sb getDetourRemoved() {
        return this.statCase_ == 3 ? (sb) this.stat_ : sb.getDefaultInstance();
    }

    public sd getDetourShown() {
        return this.statCase_ == 1 ? (sd) this.stat_ : sd.getDefaultInstance();
    }

    public sf getStatCase() {
        switch (this.statCase_) {
            case 0:
                return sf.f55394g;
            case 1:
                return sf.f55388a;
            case 2:
                return sf.f55389b;
            case 3:
                return sf.f55390c;
            case 4:
                return sf.f55391d;
            case 5:
                return sf.f55392e;
            case 6:
                return sf.f55393f;
            default:
                return null;
        }
    }

    public boolean hasDetourApproaching() {
        return this.statCase_ == 2;
    }

    public boolean hasDetourClicked() {
        return this.statCase_ == 6;
    }

    public boolean hasDetourReached() {
        return this.statCase_ == 4;
    }

    public boolean hasDetourReceived() {
        return this.statCase_ == 5;
    }

    public boolean hasDetourRemoved() {
        return this.statCase_ == 3;
    }

    public boolean hasDetourShown() {
        return this.statCase_ == 1;
    }

    public static se newBuilder(sg sgVar) {
        return (se) DEFAULT_INSTANCE.createBuilder(sgVar);
    }

    public static sg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static sg parseFrom(com.google.v.z zVar) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static sg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static sg parseFrom(InputStream inputStream) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sg parseFrom(ByteBuffer byteBuffer) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static sg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static sg parseFrom(byte[] bArr) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static sg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (sg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
