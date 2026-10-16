package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public class PatternItem extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.maps.model.PatternItem> CREATOR = new com.google.android.libraries.maps.model.PatternItemCreator();
    public static final int TYPE_DASH = 0;
    public static final int TYPE_DOT = 1;
    public static final int TYPE_GAP = 2;
    public static final java.lang.String UNRECOGNIZED_PATTERN_ITEM_IN_LIST_ERROR_MESSAGE_TEMPLATE = "Skipping unrecognized PatternItem at position %s for %s.";
    private static final java.lang.String a = "PatternItem";
    private final int b;
    private final java.lang.Float c;

    public PatternItem(int i, java.lang.Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED)) {
            z = false;
        }
        defpackage.sqs.ar(z, "Invalid PatternItem: type=" + i + " length=" + f);
        this.b = i;
        this.c = f;
    }

    static java.util.List a(java.util.List list) {
        com.google.android.libraries.maps.model.PatternItem dash;
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.libraries.maps.model.PatternItem dot = (com.google.android.libraries.maps.model.PatternItem) it.next();
            if (dot == null) {
                dot = null;
            } else {
                int i = dot.b;
                if (i == 0) {
                    dash = new com.google.android.libraries.maps.model.Dash(dot.c.floatValue());
                } else if (i == 1) {
                    dot = new com.google.android.libraries.maps.model.Dot();
                } else if (i != 2) {
                    android.util.Log.w(a, defpackage.a.bo(i, "Unknown PatternItem type: "));
                } else {
                    dash = new com.google.android.libraries.maps.model.Gap(dot.c.floatValue());
                }
                dot = dash;
            }
            arrayList.add(dot);
        }
        return arrayList;
    }

    public static boolean isRecognizedPatternItem(com.google.android.libraries.maps.model.PatternItem patternItem) {
        if (patternItem == null) {
            return false;
        }
        int i = patternItem.b;
        return i == 0 || i == 1 || i == 2;
    }

    public static com.google.android.libraries.maps.model.PatternItem[] validatePatternItems(java.util.List<com.google.android.libraries.maps.model.PatternItem> list, java.lang.String str) {
        if (list == null) {
            return null;
        }
        com.google.android.libraries.maps.model.PatternItem[] patternItemArr = (com.google.android.libraries.maps.model.PatternItem[]) list.toArray(new com.google.android.libraries.maps.model.PatternItem[list.size()]);
        for (int i = 0; i < patternItemArr.length; i++) {
            if (!isRecognizedPatternItem(patternItemArr[i])) {
                android.util.Log.e(str, java.lang.String.format(UNRECOGNIZED_PATTERN_ITEM_IN_LIST_ERROR_MESSAGE_TEMPLATE, java.lang.Integer.valueOf(i), str));
            }
        }
        return patternItemArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.maps.model.PatternItem)) {
            return false;
        }
        com.google.android.libraries.maps.model.PatternItem patternItem = (com.google.android.libraries.maps.model.PatternItem) obj;
        return this.b == patternItem.b && j$.util.Objects.equals(this.c, patternItem.c);
    }

    public java.lang.Float getLength() {
        return this.c;
    }

    public int getType() {
        return this.b;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.b), this.c);
    }

    public java.lang.String toString() {
        return "[PatternItem: type=" + this.b + " length=" + this.c + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 2, getType());
        defpackage.sqs.B(parcel, 3, getLength());
        defpackage.sqs.q(parcel, iP);
    }
}
