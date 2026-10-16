package com.waze.ap.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class z extends du<z, y> implements aa {
    public static final int CONFIRMATION_ANSWER_FIELD_NUMBER = 1;
    private static final z DEFAULT_INSTANCE;
    private static volatile fo<z> PARSER;
    private int answerContentCase_ = 0;
    private Object answerContent_;

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        du.registerDefaultInstance(z.class, zVar);
    }

    private z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswerContent() {
        this.answerContentCase_ = 0;
        this.answerContent_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfirmationAnswer() {
        if (this.answerContentCase_ == 1) {
            this.answerContentCase_ = 0;
            this.answerContent_ = null;
        }
    }

    public static z getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConfirmationAnswer(e eVar) {
        Objects.requireNonNull(eVar);
        if (this.answerContentCase_ == 1 && this.answerContent_ != e.getDefaultInstance()) {
            c cVarNewBuilder = e.newBuilder((e) this.answerContent_);
            cVarNewBuilder.mergeFrom((c) eVar);
            eVar = cVarNewBuilder.buildPartial();
        }
        this.answerContent_ = eVar;
        this.answerContentCase_ = 1;
    }

    public static y newBuilder() {
        return (y) DEFAULT_INSTANCE.createBuilder();
    }

    public static z parseDelimitedFrom(InputStream inputStream) {
        return (z) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static z parseFrom(com.google.v.v vVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<z> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfirmationAnswer(e eVar) {
        Objects.requireNonNull(eVar);
        this.answerContent_ = eVar;
        this.answerContentCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"answerContent_", "answerContentCase_", e.class});
        }
        if (iOrdinal == 3) {
            return new z();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new y(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<z> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (z.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public x getAnswerContentCase() {
        int i2 = this.answerContentCase_;
        if (i2 == 0) {
            return x.f14979b;
        }
        if (i2 != 1) {
            return null;
        }
        return x.f14978a;
    }

    public e getConfirmationAnswer() {
        return this.answerContentCase_ == 1 ? (e) this.answerContent_ : e.getDefaultInstance();
    }

    public boolean hasConfirmationAnswer() {
        return this.answerContentCase_ == 1;
    }

    public static y newBuilder(z zVar) {
        return (y) DEFAULT_INSTANCE.createBuilder(zVar);
    }

    public static z parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (z) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static z parseFrom(com.google.v.v vVar, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static z parseFrom(com.google.v.z zVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static z parseFrom(com.google.v.z zVar, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static z parseFrom(InputStream inputStream) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static z parseFrom(InputStream inputStream, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static z parseFrom(ByteBuffer byteBuffer) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static z parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static z parseFrom(byte[] bArr) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static z parseFrom(byte[] bArr, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
