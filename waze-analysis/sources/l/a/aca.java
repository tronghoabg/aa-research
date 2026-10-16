package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aca extends com.google.v.du<aca, aby> implements com.google.v.fj {
    private static final aca DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aca> PARSER = null;
    public static final int POPUP_INFORMATION_ELEMENTS_FIELD_NUMBER = 1;
    private static final com.google.v.el<abz> popupInformationElements_converter_ = new ve(3);
    private int popupInformationElementsMemoizedSerializedSize;
    private com.google.v.ek popupInformationElements_ = emptyIntList();

    static {
        aca acaVar = new aca();
        DEFAULT_INSTANCE = acaVar;
        com.google.v.du.registerDefaultInstance(aca.class, acaVar);
    }

    private aca() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPopupInformationElements(Iterable<? extends abz> iterable) {
        ensurePopupInformationElementsIsMutable();
        Iterator<? extends abz> it = iterable.iterator();
        while (it.hasNext()) {
            this.popupInformationElements_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPopupInformationElementsValue(Iterable<Integer> iterable) {
        ensurePopupInformationElementsIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.popupInformationElements_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPopupInformationElements(abz abzVar) {
        Objects.requireNonNull(abzVar);
        ensurePopupInformationElementsIsMutable();
        this.popupInformationElements_.i(abzVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPopupInformationElementsValue(int i2) {
        ensurePopupInformationElementsIsMutable();
        this.popupInformationElements_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopupInformationElements() {
        this.popupInformationElements_ = emptyIntList();
    }

    private void ensurePopupInformationElementsIsMutable() {
        com.google.v.ek ekVar = this.popupInformationElements_;
        if (ekVar.c()) {
            return;
        }
        this.popupInformationElements_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static aca getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aby newBuilder() {
        return (aby) DEFAULT_INSTANCE.createBuilder();
    }

    public static aca parseDelimitedFrom(InputStream inputStream) {
        return (aca) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aca parseFrom(com.google.v.v vVar) {
        return (aca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aca> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopupInformationElements(int i2, abz abzVar) {
        Objects.requireNonNull(abzVar);
        ensurePopupInformationElementsIsMutable();
        this.popupInformationElements_.e(i2, abzVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopupInformationElementsValue(int i2, int i3) {
        ensurePopupInformationElementsIsMutable();
        this.popupInformationElements_.e(i2, i3);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"popupInformationElements_"});
        }
        if (iOrdinal == 3) {
            return new aca();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aby(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aca> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aca.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public abz getPopupInformationElements(int i2) {
        abz abzVarA = abz.a(this.popupInformationElements_.d(i2));
        return abzVarA == null ? abz.UNRECOGNIZED : abzVarA;
    }

    public int getPopupInformationElementsCount() {
        return this.popupInformationElements_.size();
    }

    public List<abz> getPopupInformationElementsList() {
        return new com.google.v.em(this.popupInformationElements_, popupInformationElements_converter_);
    }

    public int getPopupInformationElementsValue(int i2) {
        return this.popupInformationElements_.d(i2);
    }

    public List<Integer> getPopupInformationElementsValueList() {
        return this.popupInformationElements_;
    }

    public static aby newBuilder(aca acaVar) {
        return (aby) DEFAULT_INSTANCE.createBuilder(acaVar);
    }

    public static aca parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aca) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aca parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aca parseFrom(com.google.v.z zVar) {
        return (aca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aca parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aca parseFrom(InputStream inputStream) {
        return (aca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aca parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aca parseFrom(ByteBuffer byteBuffer) {
        return (aca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aca parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aca parseFrom(byte[] bArr) {
        return (aca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aca parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
