package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ih extends com.google.v.du<ih, ig> implements ii {
    private static final ih DEFAULT_INSTANCE;
    public static final int ITEM_OPTION_FIELD_NUMBER = 2;
    public static final int NAME_INFO_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ih> PARSER;
    private com.google.v.eo<iz> nameInfo_ = emptyProtobufList();
    private com.google.v.eo<ie> itemOption_ = emptyProtobufList();

    static {
        ih ihVar = new ih();
        DEFAULT_INSTANCE = ihVar;
        com.google.v.du.registerDefaultInstance(ih.class, ihVar);
    }

    private ih() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItemOption(Iterable<? extends ie> iterable) {
        ensureItemOptionIsMutable();
        com.google.v.c.addAll(iterable, this.itemOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNameInfo(Iterable<? extends iz> iterable) {
        ensureNameInfoIsMutable();
        com.google.v.c.addAll(iterable, this.nameInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItemOption(int i2, ie ieVar) {
        Objects.requireNonNull(ieVar);
        ensureItemOptionIsMutable();
        this.itemOption_.add(i2, ieVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNameInfo(int i2, iz izVar) {
        Objects.requireNonNull(izVar);
        ensureNameInfoIsMutable();
        this.nameInfo_.add(i2, izVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItemOption() {
        this.itemOption_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNameInfo() {
        this.nameInfo_ = emptyProtobufList();
    }

    private void ensureItemOptionIsMutable() {
        com.google.v.eo<ie> eoVar = this.itemOption_;
        if (eoVar.c()) {
            return;
        }
        this.itemOption_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureNameInfoIsMutable() {
        com.google.v.eo<iz> eoVar = this.nameInfo_;
        if (eoVar.c()) {
            return;
        }
        this.nameInfo_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ih getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ig newBuilder() {
        return (ig) DEFAULT_INSTANCE.createBuilder();
    }

    public static ih parseDelimitedFrom(InputStream inputStream) {
        return (ih) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ih parseFrom(com.google.v.v vVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ih> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItemOption(int i2) {
        ensureItemOptionIsMutable();
        this.itemOption_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNameInfo(int i2) {
        ensureNameInfoIsMutable();
        this.nameInfo_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemOption(int i2, ie ieVar) {
        Objects.requireNonNull(ieVar);
        ensureItemOptionIsMutable();
        this.itemOption_.set(i2, ieVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameInfo(int i2, iz izVar) {
        Objects.requireNonNull(izVar);
        ensureNameInfoIsMutable();
        this.nameInfo_.set(i2, izVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"nameInfo_", iz.class, "itemOption_", ie.class});
        }
        if (iOrdinal == 3) {
            return new ih();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ig(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ih> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ih.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ie getItemOption(int i2) {
        return this.itemOption_.get(i2);
    }

    public int getItemOptionCount() {
        return this.itemOption_.size();
    }

    public List<ie> getItemOptionList() {
        return this.itemOption_;
    }

    public Cif getItemOptionOrBuilder(int i2) {
        return this.itemOption_.get(i2);
    }

    public List<? extends Cif> getItemOptionOrBuilderList() {
        return this.itemOption_;
    }

    public iz getNameInfo(int i2) {
        return this.nameInfo_.get(i2);
    }

    public int getNameInfoCount() {
        return this.nameInfo_.size();
    }

    public List<iz> getNameInfoList() {
        return this.nameInfo_;
    }

    public ja getNameInfoOrBuilder(int i2) {
        return this.nameInfo_.get(i2);
    }

    public List<? extends ja> getNameInfoOrBuilderList() {
        return this.nameInfo_;
    }

    public static ig newBuilder(ih ihVar) {
        return (ig) DEFAULT_INSTANCE.createBuilder(ihVar);
    }

    public static ih parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ih) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ih parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ih parseFrom(com.google.v.z zVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ih parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItemOption(ie ieVar) {
        Objects.requireNonNull(ieVar);
        ensureItemOptionIsMutable();
        this.itemOption_.add(ieVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNameInfo(iz izVar) {
        Objects.requireNonNull(izVar);
        ensureNameInfoIsMutable();
        this.nameInfo_.add(izVar);
    }

    public static ih parseFrom(InputStream inputStream) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ih parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ih parseFrom(ByteBuffer byteBuffer) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ih parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ih parseFrom(byte[] bArr) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ih parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
