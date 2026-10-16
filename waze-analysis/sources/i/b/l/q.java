package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class q extends com.google.v.du<q, o> implements com.google.v.fj {
    private static final q DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 10222;
    public static final int NAME_FIELD_NUMBER = 10221;
    private static volatile com.google.v.fo<q> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 10223;
    private int bitField0_;
    private int status_;
    private String name_ = "";
    private String icon_ = "";

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        com.google.v.du.registerDefaultInstance(q.class, qVar);
    }

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.bitField0_ &= -3;
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.bitField0_ &= -5;
        this.status_ = 0;
    }

    public static q getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static o newBuilder() {
        return (o) DEFAULT_INSTANCE.createBuilder();
    }

    public static q parseDelimitedFrom(InputStream inputStream) {
        return (q) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static q parseFrom(com.google.v.v vVar) {
        return (q) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<q> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(com.google.v.v vVar) {
        this.icon_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(p pVar) {
        this.status_ = pVar.getNumber();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001⟭⟯\u0003\u0000\u0000\u0000⟭ဈ\u0000⟮ဈ\u0001⟯᠌\u0002", new Object[]{"bitField0_", "name_", "icon_", "status_", e.f48661h});
        }
        if (iOrdinal == 3) {
            return new q();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new o(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<q> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (q.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getIcon() {
        return this.icon_;
    }

    public com.google.v.v getIconBytes() {
        return com.google.v.v.s(this.icon_);
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public p getStatus() {
        p pVarA = p.a(this.status_);
        return pVarA == null ? p.IRRELEVANT : pVarA;
    }

    public boolean hasIcon() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 4) != 0;
    }

    public static o newBuilder(q qVar) {
        return (o) DEFAULT_INSTANCE.createBuilder(qVar);
    }

    public static q parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (q) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static q parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (q) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static q parseFrom(com.google.v.z zVar) {
        return (q) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static q parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (q) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static q parseFrom(InputStream inputStream) {
        return (q) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static q parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (q) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static q parseFrom(ByteBuffer byteBuffer) {
        return (q) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static q parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (q) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static q parseFrom(byte[] bArr) {
        return (q) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static q parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (q) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
