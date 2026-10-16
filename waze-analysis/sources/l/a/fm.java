package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class fm extends com.google.v.du<fm, fk> implements com.google.v.fj {
    private static final fm DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fm> PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    private int state_;

    static {
        fm fmVar = new fm();
        DEFAULT_INSTANCE = fmVar;
        com.google.v.du.registerDefaultInstance(fm.class, fmVar);
    }

    private fm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    public static fm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fk newBuilder() {
        return (fk) DEFAULT_INSTANCE.createBuilder();
    }

    public static fm parseDelimitedFrom(InputStream inputStream) {
        return (fm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fm parseFrom(com.google.v.v vVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(fl flVar) {
        this.state_ = flVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i2) {
        this.state_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"state_"});
        }
        if (iOrdinal == 3) {
            return new fm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public fl getState() {
        int i2 = this.state_;
        fl flVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : fl.BACKGOUND : fl.FOREGROUND : fl.STATE_UNKNOWN;
        return flVar == null ? fl.UNRECOGNIZED : flVar;
    }

    public int getStateValue() {
        return this.state_;
    }

    public static fk newBuilder(fm fmVar) {
        return (fk) DEFAULT_INSTANCE.createBuilder(fmVar);
    }

    public static fm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fm parseFrom(com.google.v.z zVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fm parseFrom(InputStream inputStream) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fm parseFrom(ByteBuffer byteBuffer) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fm parseFrom(byte[] bArr) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
