package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ie extends com.google.v.du<ie, hv> implements Cif {
    public static final int ALLERGEN_ABSENT_FIELD_NUMBER = 6;
    public static final int ALLERGEN_PRESENT_FIELD_NUMBER = 5;
    public static final int CALORIES_FIELD_NUMBER = 3;
    private static final ie DEFAULT_INSTANCE;
    public static final int INGREDIENTS_FIELD_NUMBER = 9;
    public static final int MEDIA_FIELD_NUMBER = 12;
    public static final int NAME_INFO_FIELD_NUMBER = 1;
    public static final int NUTRITION_FACTS_FIELD_NUMBER = 8;
    private static volatile com.google.v.fo<ie> PARSER = null;
    public static final int PORTION_SIZE_FIELD_NUMBER = 13;
    public static final int PREPARATION_METHODS_FIELD_NUMBER = 11;
    public static final int PRICE_FIELD_NUMBER = 2;
    public static final int RESTRICTION_FIELD_NUMBER = 7;
    public static final int SERVES_NUM_PEOPLE_FIELD_NUMBER = 10;
    public static final int SPICINESS_FIELD_NUMBER = 4;
    private int bitField0_;
    private int calories_;
    private hj nutritionFacts_;
    private ic portionSize_;
    private com.google.k.a.a.b.fe price_;
    private int servesNumPeople_;
    private int spiciness_;
    private static final com.google.v.el<hx> allergenPresent_converter_ = new fn(5);
    private static final com.google.v.el<hx> allergenAbsent_converter_ = new fn(6);
    private static final com.google.v.el<hw> restriction_converter_ = new fn(7);
    private static final com.google.v.el<hk> preparationMethods_converter_ = new fn(8);
    private com.google.v.eo<iz> nameInfo_ = emptyProtobufList();
    private com.google.v.ek allergenPresent_ = emptyIntList();
    private com.google.v.ek allergenAbsent_ = emptyIntList();
    private com.google.v.ek restriction_ = emptyIntList();
    private com.google.v.eo<hz> ingredients_ = emptyProtobufList();
    private com.google.v.ek preparationMethods_ = emptyIntList();
    private com.google.v.eo<is> media_ = emptyProtobufList();

    static {
        ie ieVar = new ie();
        DEFAULT_INSTANCE = ieVar;
        com.google.v.du.registerDefaultInstance(ie.class, ieVar);
    }

    private ie() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAllergenAbsent(Iterable<? extends hx> iterable) {
        ensureAllergenAbsentIsMutable();
        Iterator<? extends hx> it = iterable.iterator();
        while (it.hasNext()) {
            this.allergenAbsent_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAllergenPresent(Iterable<? extends hx> iterable) {
        ensureAllergenPresentIsMutable();
        Iterator<? extends hx> it = iterable.iterator();
        while (it.hasNext()) {
            this.allergenPresent_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllIngredients(Iterable<? extends hz> iterable) {
        ensureIngredientsIsMutable();
        com.google.v.c.addAll(iterable, this.ingredients_);
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
    public void addAllPreparationMethods(Iterable<? extends hk> iterable) {
        ensurePreparationMethodsIsMutable();
        Iterator<? extends hk> it = iterable.iterator();
        while (it.hasNext()) {
            this.preparationMethods_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRestriction(Iterable<? extends hw> iterable) {
        ensureRestrictionIsMutable();
        Iterator<? extends hw> it = iterable.iterator();
        while (it.hasNext()) {
            this.restriction_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllergenAbsent(hx hxVar) {
        Objects.requireNonNull(hxVar);
        ensureAllergenAbsentIsMutable();
        this.allergenAbsent_.i(hxVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllergenPresent(hx hxVar) {
        Objects.requireNonNull(hxVar);
        ensureAllergenPresentIsMutable();
        this.allergenPresent_.i(hxVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIngredients(int i2, hz hzVar) {
        Objects.requireNonNull(hzVar);
        ensureIngredientsIsMutable();
        this.ingredients_.add(i2, hzVar);
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
    public void addPreparationMethods(hk hkVar) {
        Objects.requireNonNull(hkVar);
        ensurePreparationMethodsIsMutable();
        this.preparationMethods_.i(hkVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRestriction(hw hwVar) {
        Objects.requireNonNull(hwVar);
        ensureRestrictionIsMutable();
        this.restriction_.i(hwVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllergenAbsent() {
        this.allergenAbsent_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllergenPresent() {
        this.allergenPresent_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCalories() {
        this.bitField0_ &= -3;
        this.calories_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIngredients() {
        this.ingredients_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMedia() {
        this.media_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNameInfo() {
        this.nameInfo_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNutritionFacts() {
        this.nutritionFacts_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPortionSize() {
        this.portionSize_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreparationMethods() {
        this.preparationMethods_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrice() {
        this.price_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestriction() {
        this.restriction_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServesNumPeople() {
        this.bitField0_ &= -17;
        this.servesNumPeople_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpiciness() {
        this.bitField0_ &= -5;
        this.spiciness_ = 0;
    }

    private void ensureAllergenAbsentIsMutable() {
        com.google.v.ek ekVar = this.allergenAbsent_;
        if (ekVar.c()) {
            return;
        }
        this.allergenAbsent_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureAllergenPresentIsMutable() {
        com.google.v.ek ekVar = this.allergenPresent_;
        if (ekVar.c()) {
            return;
        }
        this.allergenPresent_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureIngredientsIsMutable() {
        com.google.v.eo<hz> eoVar = this.ingredients_;
        if (eoVar.c()) {
            return;
        }
        this.ingredients_ = com.google.v.du.mutableCopy(eoVar);
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

    private void ensurePreparationMethodsIsMutable() {
        com.google.v.ek ekVar = this.preparationMethods_;
        if (ekVar.c()) {
            return;
        }
        this.preparationMethods_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureRestrictionIsMutable() {
        com.google.v.ek ekVar = this.restriction_;
        if (ekVar.c()) {
            return;
        }
        this.restriction_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static ie getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNutritionFacts(hj hjVar) {
        Objects.requireNonNull(hjVar);
        hj hjVar2 = this.nutritionFacts_;
        if (hjVar2 != null && hjVar2 != hj.getDefaultInstance()) {
            hc hcVarNewBuilder = hj.newBuilder(hjVar2);
            hcVarNewBuilder.mergeFrom((hc) hjVar);
            hjVar = hcVarNewBuilder.buildPartial();
        }
        this.nutritionFacts_ = hjVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePortionSize(ic icVar) {
        Objects.requireNonNull(icVar);
        ic icVar2 = this.portionSize_;
        if (icVar2 != null && icVar2 != ic.getDefaultInstance()) {
            ib ibVarNewBuilder = ic.newBuilder(icVar2);
            ibVarNewBuilder.mergeFrom((ib) icVar);
            icVar = ibVarNewBuilder.buildPartial();
        }
        this.portionSize_ = icVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePrice(com.google.k.a.a.b.fe feVar) {
        Objects.requireNonNull(feVar);
        com.google.k.a.a.b.fe feVar2 = this.price_;
        if (feVar2 != null && feVar2 != com.google.k.a.a.b.fe.getDefaultInstance()) {
            com.google.k.a.a.b.fc fcVarNewBuilder = com.google.k.a.a.b.fe.newBuilder(feVar2);
            fcVarNewBuilder.mergeFrom((com.google.k.a.a.b.fc) feVar);
            feVar = fcVarNewBuilder.buildPartial();
        }
        this.price_ = feVar;
        this.bitField0_ |= 1;
    }

    public static hv newBuilder() {
        return (hv) DEFAULT_INSTANCE.createBuilder();
    }

    public static ie parseDelimitedFrom(InputStream inputStream) {
        return (ie) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ie parseFrom(com.google.v.v vVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ie> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeIngredients(int i2) {
        ensureIngredientsIsMutable();
        this.ingredients_.remove(i2);
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
    public void setAllergenAbsent(int i2, hx hxVar) {
        Objects.requireNonNull(hxVar);
        ensureAllergenAbsentIsMutable();
        this.allergenAbsent_.e(i2, hxVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllergenPresent(int i2, hx hxVar) {
        Objects.requireNonNull(hxVar);
        ensureAllergenPresentIsMutable();
        this.allergenPresent_.e(i2, hxVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCalories(int i2) {
        this.bitField0_ |= 2;
        this.calories_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIngredients(int i2, hz hzVar) {
        Objects.requireNonNull(hzVar);
        ensureIngredientsIsMutable();
        this.ingredients_.set(i2, hzVar);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setNutritionFacts(hj hjVar) {
        Objects.requireNonNull(hjVar);
        this.nutritionFacts_ = hjVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPortionSize(ic icVar) {
        Objects.requireNonNull(icVar);
        this.portionSize_ = icVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreparationMethods(int i2, hk hkVar) {
        Objects.requireNonNull(hkVar);
        ensurePreparationMethodsIsMutable();
        this.preparationMethods_.e(i2, hkVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrice(com.google.k.a.a.b.fe feVar) {
        Objects.requireNonNull(feVar);
        this.price_ = feVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestriction(int i2, hw hwVar) {
        Objects.requireNonNull(hwVar);
        ensureRestrictionIsMutable();
        this.restriction_.e(i2, hwVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServesNumPeople(int i2) {
        this.bitField0_ |= 16;
        this.servesNumPeople_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpiciness(id idVar) {
        this.spiciness_ = idVar.getNumber();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            com.google.v.ei eiVar = ha.f11893j;
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0007\u0000\u0001\u001b\u0002ဉ\u0000\u0003င\u0001\u0004᠌\u0002\u0005ࠞ\u0006ࠞ\u0007ࠞ\bဉ\u0003\t\u001b\nင\u0004\u000bࠞ\f\u001b\rဉ\u0005", new Object[]{"bitField0_", "nameInfo_", iz.class, "price_", "calories_", "spiciness_", ha.f11894k, "allergenPresent_", eiVar, "allergenAbsent_", eiVar, "restriction_", ha.f11892i, "nutritionFacts_", "ingredients_", hz.class, "servesNumPeople_", "preparationMethods_", ha.f11888e, "media_", is.class, "portionSize_"});
        }
        if (iOrdinal == 3) {
            return new ie();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ie> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ie.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public hx getAllergenAbsent(int i2) {
        hx hxVarA = hx.a(this.allergenAbsent_.d(i2));
        return hxVarA == null ? hx.ALLERGEN_DAIRY : hxVarA;
    }

    public int getAllergenAbsentCount() {
        return this.allergenAbsent_.size();
    }

    public List<hx> getAllergenAbsentList() {
        return new com.google.v.em(this.allergenAbsent_, allergenAbsent_converter_);
    }

    public hx getAllergenPresent(int i2) {
        hx hxVarA = hx.a(this.allergenPresent_.d(i2));
        return hxVarA == null ? hx.ALLERGEN_DAIRY : hxVarA;
    }

    public int getAllergenPresentCount() {
        return this.allergenPresent_.size();
    }

    public List<hx> getAllergenPresentList() {
        return new com.google.v.em(this.allergenPresent_, allergenPresent_converter_);
    }

    public int getCalories() {
        return this.calories_;
    }

    public hz getIngredients(int i2) {
        return this.ingredients_.get(i2);
    }

    public int getIngredientsCount() {
        return this.ingredients_.size();
    }

    public List<hz> getIngredientsList() {
        return this.ingredients_;
    }

    public ia getIngredientsOrBuilder(int i2) {
        return this.ingredients_.get(i2);
    }

    public List<? extends ia> getIngredientsOrBuilderList() {
        return this.ingredients_;
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

    public hj getNutritionFacts() {
        hj hjVar = this.nutritionFacts_;
        return hjVar == null ? hj.getDefaultInstance() : hjVar;
    }

    public ic getPortionSize() {
        ic icVar = this.portionSize_;
        return icVar == null ? ic.getDefaultInstance() : icVar;
    }

    public hk getPreparationMethods(int i2) {
        hk hkVarA = hk.a(this.preparationMethods_.d(i2));
        return hkVarA == null ? hk.METHOD_UNDEFINED : hkVarA;
    }

    public int getPreparationMethodsCount() {
        return this.preparationMethods_.size();
    }

    public List<hk> getPreparationMethodsList() {
        return new com.google.v.em(this.preparationMethods_, preparationMethods_converter_);
    }

    public com.google.k.a.a.b.fe getPrice() {
        com.google.k.a.a.b.fe feVar = this.price_;
        return feVar == null ? com.google.k.a.a.b.fe.getDefaultInstance() : feVar;
    }

    public hw getRestriction(int i2) {
        hw hwVarA = hw.a(this.restriction_.d(i2));
        return hwVarA == null ? hw.DIET_HALAL : hwVarA;
    }

    public int getRestrictionCount() {
        return this.restriction_.size();
    }

    public List<hw> getRestrictionList() {
        return new com.google.v.em(this.restriction_, restriction_converter_);
    }

    public int getServesNumPeople() {
        return this.servesNumPeople_;
    }

    public id getSpiciness() {
        id idVarA = id.a(this.spiciness_);
        return idVarA == null ? id.SPICINESS_NONE : idVarA;
    }

    public boolean hasCalories() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNutritionFacts() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPortionSize() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasPrice() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasServesNumPeople() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSpiciness() {
        return (this.bitField0_ & 4) != 0;
    }

    public static hv newBuilder(ie ieVar) {
        return (hv) DEFAULT_INSTANCE.createBuilder(ieVar);
    }

    public static ie parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ie) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ie parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ie parseFrom(com.google.v.z zVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ie parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIngredients(hz hzVar) {
        Objects.requireNonNull(hzVar);
        ensureIngredientsIsMutable();
        this.ingredients_.add(hzVar);
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

    public static ie parseFrom(InputStream inputStream) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ie parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ie parseFrom(ByteBuffer byteBuffer) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ie parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ie parseFrom(byte[] bArr) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ie parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
