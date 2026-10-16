package i.b.o;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class n extends du<n, m> implements o {
    public static final int CHINASHIFTCOORD_FIELD_NUMBER = 3004;
    private static final n DEFAULT_INSTANCE;
    public static final int DISABLEICONONLIST_FIELD_NUMBER = 3006;
    public static final int DISABLEICONONMAP_FIELD_NUMBER = 3005;
    public static final int DISABLESPECIALSONLIST_FIELD_NUMBER = 3008;
    public static final int DISABLESPECIALSONMAP_FIELD_NUMBER = 3007;
    public static final int ID_FIELD_NUMBER = 3001;
    public static final int NAME_FIELD_NUMBER = 3002;
    public static final int NOTALLOWEDONMAP_FIELD_NUMBER = 3003;
    private static volatile fo<n> PARSER = null;
    public static final int PRODUCTSUPDATEABLE_FIELD_NUMBER = 3009;
    private int bitField0_;
    private boolean chinaShiftCoord_;
    private boolean disableIconOnList_;
    private boolean disableIconOnMap_;
    private boolean disableSpecialsOnList_;
    private boolean disableSpecialsOnMap_;
    private String id_ = "";
    private String name_ = "";
    private boolean notAllowedOnMap_;
    private boolean productsUpdateable_;

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        du.registerDefaultInstance(n.class, nVar);
    }

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChinaShiftCoord() {
        this.bitField0_ &= -9;
        this.chinaShiftCoord_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableIconOnList() {
        this.bitField0_ &= -33;
        this.disableIconOnList_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableIconOnMap() {
        this.bitField0_ &= -17;
        this.disableIconOnMap_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableSpecialsOnList() {
        this.bitField0_ &= -129;
        this.disableSpecialsOnList_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableSpecialsOnMap() {
        this.bitField0_ &= -65;
        this.disableSpecialsOnMap_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotAllowedOnMap() {
        this.bitField0_ &= -5;
        this.notAllowedOnMap_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductsUpdateable() {
        this.bitField0_ &= -257;
        this.productsUpdateable_ = false;
    }

    public static n getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static m newBuilder() {
        return (m) DEFAULT_INSTANCE.createBuilder();
    }

    public static n parseDelimitedFrom(InputStream inputStream) {
        return (n) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static n parseFrom(v vVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<n> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChinaShiftCoord(boolean z) {
        this.bitField0_ |= 8;
        this.chinaShiftCoord_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableIconOnList(boolean z) {
        this.bitField0_ |= 32;
        this.disableIconOnList_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableIconOnMap(boolean z) {
        this.bitField0_ |= 16;
        this.disableIconOnMap_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableSpecialsOnList(boolean z) {
        this.bitField0_ |= 128;
        this.disableSpecialsOnList_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableSpecialsOnMap(boolean z) {
        this.bitField0_ |= 64;
        this.disableSpecialsOnMap_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotAllowedOnMap(boolean z) {
        this.bitField0_ |= 4;
        this.notAllowedOnMap_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductsUpdateable(boolean z) {
        this.bitField0_ |= 256;
        this.productsUpdateable_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001ஹு\t\u0000\u0000\u0000ஹဈ\u0000\u0bbaဈ\u0001\u0bbbဇ\u0002\u0bbcဇ\u0003\u0bbdဇ\u0004ாဇ\u0005ிဇ\u0006ீဇ\u0007ுဇ\b", new Object[]{"bitField0_", "id_", "name_", "notAllowedOnMap_", "chinaShiftCoord_", "disableIconOnMap_", "disableIconOnList_", "disableSpecialsOnMap_", "disableSpecialsOnList_", "productsUpdateable_"});
        }
        if (iOrdinal == 3) {
            return new n();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new m(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<n> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (n.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getChinaShiftCoord() {
        return this.chinaShiftCoord_;
    }

    public boolean getDisableIconOnList() {
        return this.disableIconOnList_;
    }

    public boolean getDisableIconOnMap() {
        return this.disableIconOnMap_;
    }

    public boolean getDisableSpecialsOnList() {
        return this.disableSpecialsOnList_;
    }

    public boolean getDisableSpecialsOnMap() {
        return this.disableSpecialsOnMap_;
    }

    public String getId() {
        return this.id_;
    }

    public v getIdBytes() {
        return v.s(this.id_);
    }

    public String getName() {
        return this.name_;
    }

    public v getNameBytes() {
        return v.s(this.name_);
    }

    public boolean getNotAllowedOnMap() {
        return this.notAllowedOnMap_;
    }

    public boolean getProductsUpdateable() {
        return this.productsUpdateable_;
    }

    public boolean hasChinaShiftCoord() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasDisableIconOnList() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasDisableIconOnMap() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasDisableSpecialsOnList() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasDisableSpecialsOnMap() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNotAllowedOnMap() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasProductsUpdateable() {
        return (this.bitField0_ & 256) != 0;
    }

    public static m newBuilder(n nVar) {
        return (m) DEFAULT_INSTANCE.createBuilder(nVar);
    }

    public static n parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (n) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static n parseFrom(v vVar, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static n parseFrom(z zVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static n parseFrom(z zVar, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static n parseFrom(InputStream inputStream) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static n parseFrom(InputStream inputStream, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static n parseFrom(ByteBuffer byteBuffer) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static n parseFrom(byte[] bArr) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static n parseFrom(byte[] bArr, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
