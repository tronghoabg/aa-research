package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class act extends com.google.v.du<act, acr> implements com.google.v.fj {
    private static final act DEFAULT_INSTANCE;
    public static final int IN_CAR_MAIN_SCREEN_BUTTONS_CHANGED_FIELD_NUMBER = 2;
    public static final int IN_CAR_MAIN_SCREEN_BUTTON_CLICKED_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<act> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        act actVar = new act();
        DEFAULT_INSTANCE = actVar;
        com.google.v.du.registerDefaultInstance(act.class, actVar);
    }

    private act() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarMainScreenButtonClicked() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarMainScreenButtonsChanged() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static act getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInCarMainScreenButtonClicked(acn acnVar) {
        Objects.requireNonNull(acnVar);
        if (this.statCase_ == 1 && this.stat_ != acn.getDefaultInstance()) {
            acl aclVarNewBuilder = acn.newBuilder((acn) this.stat_);
            aclVarNewBuilder.mergeFrom((acl) acnVar);
            acnVar = aclVarNewBuilder.buildPartial();
        }
        this.stat_ = acnVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInCarMainScreenButtonsChanged(acp acpVar) {
        Objects.requireNonNull(acpVar);
        if (this.statCase_ == 2 && this.stat_ != acp.getDefaultInstance()) {
            aco acoVarNewBuilder = acp.newBuilder((acp) this.stat_);
            acoVarNewBuilder.mergeFrom((aco) acpVar);
            acpVar = acoVarNewBuilder.buildPartial();
        }
        this.stat_ = acpVar;
        this.statCase_ = 2;
    }

    public static acr newBuilder() {
        return (acr) DEFAULT_INSTANCE.createBuilder();
    }

    public static act parseDelimitedFrom(InputStream inputStream) {
        return (act) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static act parseFrom(com.google.v.v vVar) {
        return (act) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<act> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarMainScreenButtonClicked(acn acnVar) {
        Objects.requireNonNull(acnVar);
        this.stat_ = acnVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarMainScreenButtonsChanged(acp acpVar) {
        Objects.requireNonNull(acpVar);
        this.stat_ = acpVar;
        this.statCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"stat_", "statCase_", acn.class, acp.class});
        }
        if (iOrdinal == 3) {
            return new act();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new acr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<act> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (act.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public acn getInCarMainScreenButtonClicked() {
        return this.statCase_ == 1 ? (acn) this.stat_ : acn.getDefaultInstance();
    }

    public acp getInCarMainScreenButtonsChanged() {
        return this.statCase_ == 2 ? (acp) this.stat_ : acp.getDefaultInstance();
    }

    public acs getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return acs.f52219c;
        }
        if (i2 == 1) {
            return acs.f52217a;
        }
        if (i2 != 2) {
            return null;
        }
        return acs.f52218b;
    }

    public boolean hasInCarMainScreenButtonClicked() {
        return this.statCase_ == 1;
    }

    public boolean hasInCarMainScreenButtonsChanged() {
        return this.statCase_ == 2;
    }

    public static acr newBuilder(act actVar) {
        return (acr) DEFAULT_INSTANCE.createBuilder(actVar);
    }

    public static act parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (act) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static act parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (act) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static act parseFrom(com.google.v.z zVar) {
        return (act) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static act parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (act) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static act parseFrom(InputStream inputStream) {
        return (act) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static act parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (act) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static act parseFrom(ByteBuffer byteBuffer) {
        return (act) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static act parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (act) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static act parseFrom(byte[] bArr) {
        return (act) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static act parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (act) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
