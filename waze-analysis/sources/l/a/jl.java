package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class jl extends com.google.v.du<jl, jj> implements com.google.v.fj {
    public static final int CARPLAY_DISCONNECT_WITHOUT_SHUTDOWN_FIELD_NUMBER = 5;
    public static final int CARPLAY_TOPBAR_NAV_ROUTES_FIELD_NUMBER = 1;
    public static final int CARPLAY_TOPBAR_NAV_SEARCH_FIELD_NUMBER = 2;
    public static final int CARPLAY_TOPBAR_NAV_STOP_FIELD_NUMBER = 3;
    public static final int CARPLAY_TOPBAR_ROAM_SEARCH_FIELD_NUMBER = 4;
    private static final jl DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<jl> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        jl jlVar = new jl();
        DEFAULT_INSTANCE = jlVar;
        com.google.v.du.registerDefaultInstance(jl.class, jlVar);
    }

    private jl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarplayDisconnectWithoutShutdown() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarplayTopbarNavRoutes() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarplayTopbarNavSearch() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarplayTopbarNavStop() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarplayTopbarRoamSearch() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static jl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCarplayDisconnectWithoutShutdown(jg jgVar) {
        Objects.requireNonNull(jgVar);
        if (this.statCase_ == 5 && this.stat_ != jg.getDefaultInstance()) {
            jf jfVarNewBuilder = jg.newBuilder((jg) this.stat_);
            jfVarNewBuilder.mergeFrom((jf) jgVar);
            jgVar = jfVarNewBuilder.buildPartial();
        }
        this.stat_ = jgVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCarplayTopbarNavRoutes(jn jnVar) {
        Objects.requireNonNull(jnVar);
        if (this.statCase_ == 1 && this.stat_ != jn.getDefaultInstance()) {
            jm jmVarNewBuilder = jn.newBuilder((jn) this.stat_);
            jmVarNewBuilder.mergeFrom((jm) jnVar);
            jnVar = jmVarNewBuilder.buildPartial();
        }
        this.stat_ = jnVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCarplayTopbarNavSearch(jp jpVar) {
        Objects.requireNonNull(jpVar);
        if (this.statCase_ == 2 && this.stat_ != jp.getDefaultInstance()) {
            jo joVarNewBuilder = jp.newBuilder((jp) this.stat_);
            joVarNewBuilder.mergeFrom((jo) jpVar);
            jpVar = joVarNewBuilder.buildPartial();
        }
        this.stat_ = jpVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCarplayTopbarNavStop(jr jrVar) {
        Objects.requireNonNull(jrVar);
        if (this.statCase_ == 3 && this.stat_ != jr.getDefaultInstance()) {
            jq jqVarNewBuilder = jr.newBuilder((jr) this.stat_);
            jqVarNewBuilder.mergeFrom((jq) jrVar);
            jrVar = jqVarNewBuilder.buildPartial();
        }
        this.stat_ = jrVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCarplayTopbarRoamSearch(jt jtVar) {
        Objects.requireNonNull(jtVar);
        if (this.statCase_ == 4 && this.stat_ != jt.getDefaultInstance()) {
            js jsVarNewBuilder = jt.newBuilder((jt) this.stat_);
            jsVarNewBuilder.mergeFrom((js) jtVar);
            jtVar = jsVarNewBuilder.buildPartial();
        }
        this.stat_ = jtVar;
        this.statCase_ = 4;
    }

    public static jj newBuilder() {
        return (jj) DEFAULT_INSTANCE.createBuilder();
    }

    public static jl parseDelimitedFrom(InputStream inputStream) {
        return (jl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jl parseFrom(com.google.v.v vVar) {
        return (jl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarplayDisconnectWithoutShutdown(jg jgVar) {
        Objects.requireNonNull(jgVar);
        this.stat_ = jgVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarplayTopbarNavRoutes(jn jnVar) {
        Objects.requireNonNull(jnVar);
        this.stat_ = jnVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarplayTopbarNavSearch(jp jpVar) {
        Objects.requireNonNull(jpVar);
        this.stat_ = jpVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarplayTopbarNavStop(jr jrVar) {
        Objects.requireNonNull(jrVar);
        this.stat_ = jrVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarplayTopbarRoamSearch(jt jtVar) {
        Objects.requireNonNull(jtVar);
        this.stat_ = jtVar;
        this.statCase_ = 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"stat_", "statCase_", jn.class, jp.class, jr.class, jt.class, jg.class});
        }
        if (iOrdinal == 3) {
            return new jl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new jj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public jg getCarplayDisconnectWithoutShutdown() {
        return this.statCase_ == 5 ? (jg) this.stat_ : jg.getDefaultInstance();
    }

    public jn getCarplayTopbarNavRoutes() {
        return this.statCase_ == 1 ? (jn) this.stat_ : jn.getDefaultInstance();
    }

    public jp getCarplayTopbarNavSearch() {
        return this.statCase_ == 2 ? (jp) this.stat_ : jp.getDefaultInstance();
    }

    public jr getCarplayTopbarNavStop() {
        return this.statCase_ == 3 ? (jr) this.stat_ : jr.getDefaultInstance();
    }

    public jt getCarplayTopbarRoamSearch() {
        return this.statCase_ == 4 ? (jt) this.stat_ : jt.getDefaultInstance();
    }

    public jk getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return jk.f54993f;
        }
        if (i2 == 1) {
            return jk.f54988a;
        }
        if (i2 == 2) {
            return jk.f54989b;
        }
        if (i2 == 3) {
            return jk.f54990c;
        }
        if (i2 == 4) {
            return jk.f54991d;
        }
        if (i2 != 5) {
            return null;
        }
        return jk.f54992e;
    }

    public boolean hasCarplayDisconnectWithoutShutdown() {
        return this.statCase_ == 5;
    }

    public boolean hasCarplayTopbarNavRoutes() {
        return this.statCase_ == 1;
    }

    public boolean hasCarplayTopbarNavSearch() {
        return this.statCase_ == 2;
    }

    public boolean hasCarplayTopbarNavStop() {
        return this.statCase_ == 3;
    }

    public boolean hasCarplayTopbarRoamSearch() {
        return this.statCase_ == 4;
    }

    public static jj newBuilder(jl jlVar) {
        return (jj) DEFAULT_INSTANCE.createBuilder(jlVar);
    }

    public static jl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jl parseFrom(com.google.v.z zVar) {
        return (jl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static jl parseFrom(InputStream inputStream) {
        return (jl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jl parseFrom(ByteBuffer byteBuffer) {
        return (jl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jl parseFrom(byte[] bArr) {
        return (jl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
