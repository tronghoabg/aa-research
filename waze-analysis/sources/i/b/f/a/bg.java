package i.b.f.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bg extends du<bg, bf> implements fj {
    public static final int ACTION_TYPE_ID_FIELD_NUMBER = 1;
    private static final bg DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 3;
    private static volatile fo<bg> PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 2;
    private String actionTypeId_ = "";
    private int bitField0_;
    private af limit_;
    private be target_;

    static {
        bg bgVar = new bg();
        DEFAULT_INSTANCE = bgVar;
        du.registerDefaultInstance(bg.class, bgVar);
    }

    private bg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionTypeId() {
        this.bitField0_ &= -2;
        this.actionTypeId_ = getDefaultInstance().getActionTypeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimit() {
        this.limit_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTarget() {
        this.target_ = null;
        this.bitField0_ &= -3;
    }

    public static bg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLimit(af afVar) {
        Objects.requireNonNull(afVar);
        af afVar2 = this.limit_;
        if (afVar2 != null && afVar2 != af.getDefaultInstance()) {
            ae aeVarNewBuilder = af.newBuilder(afVar2);
            aeVarNewBuilder.mergeFrom((ae) afVar);
            afVar = aeVarNewBuilder.buildPartial();
        }
        this.limit_ = afVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTarget(be beVar) {
        Objects.requireNonNull(beVar);
        be beVar2 = this.target_;
        if (beVar2 != null && beVar2 != be.getDefaultInstance()) {
            bd bdVarNewBuilder = be.newBuilder(beVar2);
            bdVarNewBuilder.mergeFrom((bd) beVar);
            beVar = bdVarNewBuilder.buildPartial();
        }
        this.target_ = beVar;
        this.bitField0_ |= 2;
    }

    public static bf newBuilder() {
        return (bf) DEFAULT_INSTANCE.createBuilder();
    }

    public static bg parseDelimitedFrom(InputStream inputStream) {
        return (bg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bg parseFrom(com.google.v.v vVar) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionTypeId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.actionTypeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionTypeIdBytes(com.google.v.v vVar) {
        this.actionTypeId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimit(af afVar) {
        Objects.requireNonNull(afVar);
        this.limit_ = afVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTarget(be beVar) {
        Objects.requireNonNull(beVar);
        this.target_ = beVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "actionTypeId_", "target_", "limit_"});
        }
        if (iOrdinal == 3) {
            return new bg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getActionTypeId() {
        return this.actionTypeId_;
    }

    public com.google.v.v getActionTypeIdBytes() {
        return com.google.v.v.s(this.actionTypeId_);
    }

    public af getLimit() {
        af afVar = this.limit_;
        return afVar == null ? af.getDefaultInstance() : afVar;
    }

    public be getTarget() {
        be beVar = this.target_;
        return beVar == null ? be.getDefaultInstance() : beVar;
    }

    public boolean hasActionTypeId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLimit() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTarget() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bf newBuilder(bg bgVar) {
        return (bf) DEFAULT_INSTANCE.createBuilder(bgVar);
    }

    public static bg parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bg parseFrom(com.google.v.v vVar, de deVar) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bg parseFrom(com.google.v.z zVar) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bg parseFrom(com.google.v.z zVar, de deVar) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bg parseFrom(InputStream inputStream) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bg parseFrom(InputStream inputStream, de deVar) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bg parseFrom(ByteBuffer byteBuffer) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bg parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bg parseFrom(byte[] bArr) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bg parseFrom(byte[] bArr, de deVar) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
