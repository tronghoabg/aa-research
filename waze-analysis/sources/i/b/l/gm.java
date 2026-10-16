package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class gm extends com.google.v.du<gm, gl> implements com.google.v.fj {
    private static final gm DEFAULT_INSTANCE;
    public static final int ITEM_SUBTYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<gm> PARSER;
    private static final com.google.v.el<hg> itemSubtype_converter_ = new ff(5);
    private com.google.v.ek itemSubtype_ = emptyIntList();

    static {
        gm gmVar = new gm();
        DEFAULT_INSTANCE = gmVar;
        com.google.v.du.registerDefaultInstance(gm.class, gmVar);
    }

    private gm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItemSubtype(Iterable<? extends hg> iterable) {
        ensureItemSubtypeIsMutable();
        Iterator<? extends hg> it = iterable.iterator();
        while (it.hasNext()) {
            this.itemSubtype_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItemSubtype(hg hgVar) {
        Objects.requireNonNull(hgVar);
        ensureItemSubtypeIsMutable();
        this.itemSubtype_.i(hgVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItemSubtype() {
        this.itemSubtype_ = emptyIntList();
    }

    private void ensureItemSubtypeIsMutable() {
        com.google.v.ek ekVar = this.itemSubtype_;
        if (ekVar.c()) {
            return;
        }
        this.itemSubtype_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static gm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gl newBuilder() {
        return (gl) DEFAULT_INSTANCE.createBuilder();
    }

    public static gm parseDelimitedFrom(InputStream inputStream) {
        return (gm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gm parseFrom(com.google.v.v vVar) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemSubtype(int i2, hg hgVar) {
        Objects.requireNonNull(hgVar);
        ensureItemSubtypeIsMutable();
        this.itemSubtype_.e(i2, hgVar.getNumber());
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"itemSubtype_", hf.f48737a});
        }
        if (iOrdinal == 3) {
            return new gm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public hg getItemSubtype(int i2) {
        hg hgVarA = hg.a(this.itemSubtype_.d(i2));
        return hgVarA == null ? hg.MAP_ISSUE_UNSPECIFIED : hgVarA;
    }

    public int getItemSubtypeCount() {
        return this.itemSubtype_.size();
    }

    public List<hg> getItemSubtypeList() {
        return new com.google.v.em(this.itemSubtype_, itemSubtype_converter_);
    }

    public static gl newBuilder(gm gmVar) {
        return (gl) DEFAULT_INSTANCE.createBuilder(gmVar);
    }

    public static gm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gm parseFrom(com.google.v.z zVar) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gm parseFrom(InputStream inputStream) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gm parseFrom(ByteBuffer byteBuffer) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gm parseFrom(byte[] bArr) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
