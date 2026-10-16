package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jf extends com.google.v.du<jf, je> implements jg {
    public static final int CALL_TO_ACTION_FIELD_NUMBER = 6;
    private static final jf DEFAULT_INSTANCE;
    public static final int FOOD_ITEM_FIELD_NUMBER = 3;
    public static final int ITEM_FIELD_NUMBER = 4;
    public static final int ITEM_TYPE_FIELD_NUMBER = 2;
    public static final int LANGUAGE_FIELD_NUMBER = 7;
    public static final int MEDIA_FIELD_NUMBER = 5;
    public static final int NAME_INFO_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<jf> PARSER;
    private static final com.google.v.el<gz> itemType_converter_ = new fn(10);
    private int bitField0_;
    private ho callToAction_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<iz> nameInfo_ = emptyProtobufList();
    private com.google.v.ek itemType_ = emptyIntList();
    private com.google.v.eo<ih> foodItem_ = emptyProtobufList();
    private com.google.v.eo<ht> item_ = emptyProtobufList();
    private com.google.v.eo<is> media_ = emptyProtobufList();
    private String language_ = "";

    static {
        jf jfVar = new jf();
        DEFAULT_INSTANCE = jfVar;
        com.google.v.du.registerDefaultInstance(jf.class, jfVar);
    }

    private jf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFoodItem(Iterable<? extends ih> iterable) {
        ensureFoodItemIsMutable();
        com.google.v.c.addAll(iterable, this.foodItem_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItem(Iterable<? extends ht> iterable) {
        ensureItemIsMutable();
        com.google.v.c.addAll(iterable, this.item_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItemType(Iterable<? extends gz> iterable) {
        ensureItemTypeIsMutable();
        Iterator<? extends gz> it = iterable.iterator();
        while (it.hasNext()) {
            this.itemType_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMedia(Iterable<? extends is> iterable) {
        ensureMediaIsMutable();
        com.google.v.c.addAll(iterable, this.media_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNameInfo(Iterable<? extends iz> iterable) {
        ensureNameInfoIsMutable();
        com.google.v.c.addAll(iterable, this.nameInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFoodItem(int i2, ih ihVar) {
        Objects.requireNonNull(ihVar);
        ensureFoodItemIsMutable();
        this.foodItem_.add(i2, ihVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItem(int i2, ht htVar) {
        Objects.requireNonNull(htVar);
        ensureItemIsMutable();
        this.item_.add(i2, htVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItemType(gz gzVar) {
        Objects.requireNonNull(gzVar);
        ensureItemTypeIsMutable();
        this.itemType_.i(gzVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMedia(int i2, is isVar) {
        Objects.requireNonNull(isVar);
        ensureMediaIsMutable();
        this.media_.add(i2, isVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNameInfo(int i2, iz izVar) {
        Objects.requireNonNull(izVar);
        ensureNameInfoIsMutable();
        this.nameInfo_.add(i2, izVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallToAction() {
        this.callToAction_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFoodItem() {
        this.foodItem_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItem() {
        this.item_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItemType() {
        this.itemType_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.bitField0_ &= -3;
        this.language_ = getDefaultInstance().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMedia() {
        this.media_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNameInfo() {
        this.nameInfo_ = emptyProtobufList();
    }

    private void ensureFoodItemIsMutable() {
        com.google.v.eo<ih> eoVar = this.foodItem_;
        if (eoVar.c()) {
            return;
        }
        this.foodItem_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureItemIsMutable() {
        com.google.v.eo<ht> eoVar = this.item_;
        if (eoVar.c()) {
            return;
        }
        this.item_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureItemTypeIsMutable() {
        com.google.v.ek ekVar = this.itemType_;
        if (ekVar.c()) {
            return;
        }
        this.itemType_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureMediaIsMutable() {
        com.google.v.eo<is> eoVar = this.media_;
        if (eoVar.c()) {
            return;
        }
        this.media_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureNameInfoIsMutable() {
        com.google.v.eo<iz> eoVar = this.nameInfo_;
        if (eoVar.c()) {
            return;
        }
        this.nameInfo_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static jf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCallToAction(ho hoVar) {
        Objects.requireNonNull(hoVar);
        ho hoVar2 = this.callToAction_;
        if (hoVar2 != null && hoVar2 != ho.getDefaultInstance()) {
            hl hlVarNewBuilder = ho.newBuilder(hoVar2);
            hlVarNewBuilder.mergeFrom((hl) hoVar);
            hoVar = hlVarNewBuilder.buildPartial();
        }
        this.callToAction_ = hoVar;
        this.bitField0_ |= 1;
    }

    public static je newBuilder() {
        return (je) DEFAULT_INSTANCE.createBuilder();
    }

    public static jf parseDelimitedFrom(InputStream inputStream) {
        return (jf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jf parseFrom(com.google.v.v vVar) {
        return (jf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFoodItem(int i2) {
        ensureFoodItemIsMutable();
        this.foodItem_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItem(int i2) {
        ensureItemIsMutable();
        this.item_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMedia(int i2) {
        ensureMediaIsMutable();
        this.media_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNameInfo(int i2) {
        ensureNameInfoIsMutable();
        this.nameInfo_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallToAction(ho hoVar) {
        Objects.requireNonNull(hoVar);
        this.callToAction_ = hoVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFoodItem(int i2, ih ihVar) {
        Objects.requireNonNull(ihVar);
        ensureFoodItemIsMutable();
        this.foodItem_.set(i2, ihVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItem(int i2, ht htVar) {
        Objects.requireNonNull(htVar);
        ensureItemIsMutable();
        this.item_.set(i2, htVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemType(int i2, gz gzVar) {
        Objects.requireNonNull(gzVar);
        ensureItemTypeIsMutable();
        this.itemType_.e(i2, gzVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.language_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageBytes(com.google.v.v vVar) {
        this.language_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMedia(int i2, is isVar) {
        Objects.requireNonNull(isVar);
        ensureMediaIsMutable();
        this.media_.set(i2, isVar);
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
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0005\u0002\u0001\u001b\u0002ࠞ\u0003\u001b\u0004Л\u0005\u001b\u0006ᐉ\u0000\u0007ဈ\u0001", new Object[]{"bitField0_", "nameInfo_", iz.class, "itemType_", ha.f11885b, "foodItem_", ih.class, "item_", ht.class, "media_", is.class, "callToAction_", "language_"});
            case 3:
                return new jf();
            case 4:
                return new je(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<jf> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (jf.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public ho getCallToAction() {
        ho hoVar = this.callToAction_;
        return hoVar == null ? ho.getDefaultInstance() : hoVar;
    }

    public ih getFoodItem(int i2) {
        return this.foodItem_.get(i2);
    }

    public int getFoodItemCount() {
        return this.foodItem_.size();
    }

    public List<ih> getFoodItemList() {
        return this.foodItem_;
    }

    public ii getFoodItemOrBuilder(int i2) {
        return this.foodItem_.get(i2);
    }

    public List<? extends ii> getFoodItemOrBuilderList() {
        return this.foodItem_;
    }

    public ht getItem(int i2) {
        return this.item_.get(i2);
    }

    public int getItemCount() {
        return this.item_.size();
    }

    public List<ht> getItemList() {
        return this.item_;
    }

    public hu getItemOrBuilder(int i2) {
        return this.item_.get(i2);
    }

    public List<? extends hu> getItemOrBuilderList() {
        return this.item_;
    }

    public gz getItemType(int i2) {
        gz gzVarA = gz.a(this.itemType_.d(i2));
        return gzVarA == null ? gz.TYPE_ANY : gzVarA;
    }

    public int getItemTypeCount() {
        return this.itemType_.size();
    }

    public List<gz> getItemTypeList() {
        return new com.google.v.em(this.itemType_, itemType_converter_);
    }

    public String getLanguage() {
        return this.language_;
    }

    public com.google.v.v getLanguageBytes() {
        return com.google.v.v.s(this.language_);
    }

    public is getMedia(int i2) {
        return this.media_.get(i2);
    }

    public int getMediaCount() {
        return this.media_.size();
    }

    public List<is> getMediaList() {
        return this.media_;
    }

    public it getMediaOrBuilder(int i2) {
        return this.media_.get(i2);
    }

    public List<? extends it> getMediaOrBuilderList() {
        return this.media_;
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

    public boolean hasCallToAction() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLanguage() {
        return (this.bitField0_ & 2) != 0;
    }

    public static je newBuilder(jf jfVar) {
        return (je) DEFAULT_INSTANCE.createBuilder(jfVar);
    }

    public static jf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jf parseFrom(com.google.v.z zVar) {
        return (jf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFoodItem(ih ihVar) {
        Objects.requireNonNull(ihVar);
        ensureFoodItemIsMutable();
        this.foodItem_.add(ihVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItem(ht htVar) {
        Objects.requireNonNull(htVar);
        ensureItemIsMutable();
        this.item_.add(htVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMedia(is isVar) {
        Objects.requireNonNull(isVar);
        ensureMediaIsMutable();
        this.media_.add(isVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNameInfo(iz izVar) {
        Objects.requireNonNull(izVar);
        ensureNameInfoIsMutable();
        this.nameInfo_.add(izVar);
    }

    public static jf parseFrom(InputStream inputStream) {
        return (jf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jf parseFrom(ByteBuffer byteBuffer) {
        return (jf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jf parseFrom(byte[] bArr) {
        return (jf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
