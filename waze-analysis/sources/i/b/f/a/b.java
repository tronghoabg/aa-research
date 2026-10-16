package i.b.f.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends du<b, a> implements c {
    private static final b DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 3;
    private static volatile fo<b> PARSER = null;
    public static final int STATE_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String id_ = "";
    private e state_;
    private w type_;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -5;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = null;
        this.bitField0_ &= -2;
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeState(e eVar) {
        Objects.requireNonNull(eVar);
        e eVar2 = this.state_;
        if (eVar2 != null && eVar2 != e.getDefaultInstance()) {
            d dVarNewBuilder = e.newBuilder(eVar2);
            dVarNewBuilder.mergeFrom((d) eVar);
            eVar = dVarNewBuilder.buildPartial();
        }
        this.state_ = eVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeType(w wVar) {
        Objects.requireNonNull(wVar);
        w wVar2 = this.type_;
        if (wVar2 != null && wVar2 != w.getDefaultInstance()) {
            v vVarNewBuilder = w.newBuilder(wVar2);
            vVarNewBuilder.mergeFrom((v) wVar);
            wVar = vVarNewBuilder.buildPartial();
        }
        this.type_ = wVar;
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(com.google.v.v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(e eVar) {
        Objects.requireNonNull(eVar);
        this.state_ = eVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(w wVar) {
        Objects.requireNonNull(wVar);
        this.type_ = wVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "type_", "state_", "id_"});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public e getState() {
        e eVar = this.state_;
        return eVar == null ? e.getDefaultInstance() : eVar;
    }

    public w getType() {
        w wVar = this.type_;
        return wVar == null ? w.getDefaultInstance() : wVar;
    }

    public boolean hasId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasState() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(com.google.v.v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(com.google.v.z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(com.google.v.z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
