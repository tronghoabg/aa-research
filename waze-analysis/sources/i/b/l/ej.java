package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ej extends com.google.v.du<ej, eh> implements com.google.v.fj {
    private static final ej DEFAULT_INSTANCE;
    public static final int LOGIN_ERROR_FIELD_NUMBER = 2;
    public static final int LOGIN_SUCCESS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ej> PARSER;
    private int responseCase_ = 0;
    private Object response_;

    static {
        ej ejVar = new ej();
        DEFAULT_INSTANCE = ejVar;
        com.google.v.du.registerDefaultInstance(ej.class, ejVar);
    }

    private ej() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoginError() {
        if (this.responseCase_ == 2) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoginSuccess() {
        if (this.responseCase_ == 1) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponse() {
        this.responseCase_ = 0;
        this.response_ = null;
    }

    public static ej getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLoginError(eb ebVar) {
        Objects.requireNonNull(ebVar);
        if (this.responseCase_ == 2 && this.response_ != eb.getDefaultInstance()) {
            dy dyVarNewBuilder = eb.newBuilder((eb) this.response_);
            dyVarNewBuilder.mergeFrom((dy) ebVar);
            ebVar = dyVarNewBuilder.buildPartial();
        }
        this.response_ = ebVar;
        this.responseCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLoginSuccess(el elVar) {
        Objects.requireNonNull(elVar);
        if (this.responseCase_ == 1 && this.response_ != el.getDefaultInstance()) {
            ek ekVarNewBuilder = el.newBuilder((el) this.response_);
            ekVarNewBuilder.mergeFrom((ek) elVar);
            elVar = ekVarNewBuilder.buildPartial();
        }
        this.response_ = elVar;
        this.responseCase_ = 1;
    }

    public static eh newBuilder() {
        return (eh) DEFAULT_INSTANCE.createBuilder();
    }

    public static ej parseDelimitedFrom(InputStream inputStream) {
        return (ej) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ej parseFrom(com.google.v.v vVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ej> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoginError(eb ebVar) {
        Objects.requireNonNull(ebVar);
        this.response_ = ebVar;
        this.responseCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoginSuccess(el elVar) {
        Objects.requireNonNull(elVar);
        this.response_ = elVar;
        this.responseCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"response_", "responseCase_", el.class, eb.class});
        }
        if (iOrdinal == 3) {
            return new ej();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new eh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ej> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ej.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public eb getLoginError() {
        return this.responseCase_ == 2 ? (eb) this.response_ : eb.getDefaultInstance();
    }

    public el getLoginSuccess() {
        return this.responseCase_ == 1 ? (el) this.response_ : el.getDefaultInstance();
    }

    public ei getResponseCase() {
        int i2 = this.responseCase_;
        if (i2 == 0) {
            return ei.f48696c;
        }
        if (i2 == 1) {
            return ei.f48694a;
        }
        if (i2 != 2) {
            return null;
        }
        return ei.f48695b;
    }

    public boolean hasLoginError() {
        return this.responseCase_ == 2;
    }

    public boolean hasLoginSuccess() {
        return this.responseCase_ == 1;
    }

    public static eh newBuilder(ej ejVar) {
        return (eh) DEFAULT_INSTANCE.createBuilder(ejVar);
    }

    public static ej parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ej) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ej parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ej parseFrom(com.google.v.z zVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ej parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ej parseFrom(InputStream inputStream) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ej parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ej parseFrom(ByteBuffer byteBuffer) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ej parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ej parseFrom(byte[] bArr) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ej parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
