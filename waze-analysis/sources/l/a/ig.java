package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ig extends com.google.v.du<ig, Cif> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final ig DEFAULT_INSTANCE;
    public static final int DONT_SHOW_AGAIN_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ig> PARSER = null;
    public static final int REQUEST_TRIGGER_FIELD_NUMBER = 3;
    private int action_;
    private int bitField0_;
    private boolean dontShowAgain_;
    private int requestTrigger_;

    static {
        ig igVar = new ig();
        DEFAULT_INSTANCE = igVar;
        com.google.v.du.registerDefaultInstance(ig.class, igVar);
    }

    private ig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDontShowAgain() {
        this.bitField0_ &= -2;
        this.dontShowAgain_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestTrigger() {
        this.requestTrigger_ = 0;
    }

    public static ig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Cif newBuilder() {
        return (Cif) DEFAULT_INSTANCE.createBuilder();
    }

    public static ig parseDelimitedFrom(InputStream inputStream) {
        return (ig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ig parseFrom(com.google.v.v vVar) {
        return (ig) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(ie ieVar) {
        this.action_ = ieVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDontShowAgain(boolean z) {
        this.bitField0_ |= 1;
        this.dontShowAgain_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTrigger(in inVar) {
        this.requestTrigger_ = inVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTriggerValue(int i2) {
        this.requestTrigger_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဇ\u0000\u0003\f", new Object[]{"bitField0_", "action_", "dontShowAgain_", "requestTrigger_"});
        }
        if (iOrdinal == 3) {
            return new ig();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new Cif(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ig> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ig.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ie getAction() {
        int i2 = this.action_;
        ie ieVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : ie.TAP_OUTSIDE : ie.BACK : ie.CLOSE : ie.CONTINUE : ie.ACTION_UNSPECIFIED;
        return ieVar == null ? ie.UNRECOGNIZED : ieVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public boolean getDontShowAgain() {
        return this.dontShowAgain_;
    }

    public in getRequestTrigger() {
        in inVarA = in.a(this.requestTrigger_);
        return inVarA == null ? in.UNRECOGNIZED : inVarA;
    }

    public int getRequestTriggerValue() {
        return this.requestTrigger_;
    }

    public boolean hasDontShowAgain() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Cif newBuilder(ig igVar) {
        return (Cif) DEFAULT_INSTANCE.createBuilder(igVar);
    }

    public static ig parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ig) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ig parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ig) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ig parseFrom(com.google.v.z zVar) {
        return (ig) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ig parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ig) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ig parseFrom(InputStream inputStream) {
        return (ig) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ig parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ig) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ig parseFrom(ByteBuffer byteBuffer) {
        return (ig) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ig parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ig) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ig parseFrom(byte[] bArr) {
        return (ig) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ig parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ig) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
