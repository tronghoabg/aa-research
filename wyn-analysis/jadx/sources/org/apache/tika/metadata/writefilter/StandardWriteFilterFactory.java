package org.apache.tika.metadata.writefilter;

import R8.v;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public class StandardWriteFilterFactory implements MetadataWriteFilterFactory {
    public static int DEFAULT_MAX_FIELD_SIZE = 102400;
    public static int DEFAULT_MAX_KEY_SIZE = 1024;
    public static int DEFAULT_MAX_VALUES_PER_FIELD = 10;
    public static int DEFAULT_TOTAL_ESTIMATED_BYTES = 10485760;
    private Set<String> excludeFields;
    private boolean includeEmpty;
    private Set<String> includeFields;
    private int maxFieldSize;
    private int maxKeySize;
    private int maxTotalEstimatedBytes;
    private int maxValuesPerField;

    public StandardWriteFilterFactory() {
        Set<String> set = Collections.EMPTY_SET;
        this.includeFields = set;
        this.excludeFields = set;
        this.maxKeySize = DEFAULT_MAX_KEY_SIZE;
        this.maxFieldSize = DEFAULT_MAX_FIELD_SIZE;
        this.maxTotalEstimatedBytes = DEFAULT_TOTAL_ESTIMATED_BYTES;
        this.maxValuesPerField = DEFAULT_MAX_VALUES_PER_FIELD;
        this.includeEmpty = false;
    }

    public Set<String> getIncludeFields() {
        return this.includeFields;
    }

    public int getMaxFieldSize() {
        return this.maxFieldSize;
    }

    public int getMaxKeySize() {
        return this.maxKeySize;
    }

    public int getMaxTotalEstimatedBytes() {
        return this.maxTotalEstimatedBytes;
    }

    public int getMaxValuesPerField() {
        return this.maxValuesPerField;
    }

    public boolean isIncludeEmpty() {
        return this.includeEmpty;
    }

    @Override // org.apache.tika.metadata.writefilter.MetadataWriteFilterFactory
    public MetadataWriteFilter newInstance() {
        if (this.maxFieldSize < 0) {
            throw new IllegalArgumentException("maxFieldSize must be > 0");
        }
        if (this.maxValuesPerField < 1) {
            throw new IllegalArgumentException("maxValuesPerField must be > 0");
        }
        if (this.maxTotalEstimatedBytes >= 0) {
            return new StandardWriteFilter(this.maxKeySize, this.maxFieldSize, this.maxTotalEstimatedBytes, this.maxValuesPerField, this.includeFields, this.excludeFields, this.includeEmpty);
        }
        throw new IllegalArgumentException("max estimated size must be > 0");
    }

    public void setExcludeFields(List<String> list) {
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet(list.size());
        keySetViewNewKeySet.addAll(list);
        this.excludeFields = DesugarCollections.unmodifiableSet(keySetViewNewKeySet);
    }

    public void setIncludeEmpty(boolean z2) {
        this.includeEmpty = z2;
    }

    public void setIncludeFields(List<String> list) {
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet(list.size());
        keySetViewNewKeySet.addAll(list);
        this.includeFields = DesugarCollections.unmodifiableSet(keySetViewNewKeySet);
    }

    public void setMaxFieldSize(int i5) {
        this.maxFieldSize = i5;
    }

    public void setMaxKeySize(int i5) {
        this.maxKeySize = i5;
    }

    public void setMaxTotalEstimatedBytes(int i5) {
        this.maxTotalEstimatedBytes = i5;
    }

    public void setMaxValuesPerField(int i5) {
        this.maxValuesPerField = i5;
    }

    public String toString() {
        Set<String> set = this.includeFields;
        int i5 = this.maxKeySize;
        int i10 = this.maxFieldSize;
        int i11 = this.maxTotalEstimatedBytes;
        int i12 = this.maxValuesPerField;
        boolean z2 = this.includeEmpty;
        StringBuilder sb2 = new StringBuilder("StandardWriteFilterFactory{includeFields=");
        sb2.append(set);
        sb2.append(", maxKeySize=");
        sb2.append(i5);
        sb2.append(", maxFieldSize=");
        v.i(i10, i11, ", maxTotalEstimatedBytes=", ", maxValuesPerField=", sb2);
        sb2.append(i12);
        sb2.append(", includeEmpty=");
        sb2.append(z2);
        sb2.append("}");
        return sb2.toString();
    }
}
