package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.spu;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new PatternItemCreator();
    public static final int TYPE_DASH = 0;
    public static final int TYPE_DOT = 1;
    public static final int TYPE_GAP = 2;
    public static final String UNRECOGNIZED_PATTERN_ITEM_IN_LIST_ERROR_MESSAGE_TEMPLATE = "Skipping unrecognized PatternItem at position %s for %s.";
    private static final String a = "PatternItem";
    private final int b;
    private final Float c;

    public PatternItem(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < BitmapDescriptorFactory.HUE_RED)) {
            z = false;
        }
        spu.an(z, "Invalid PatternItem: type=" + i + " length=" + f);
        this.b = i;
        this.c = f;
    }

    static List a(List list) {
        PatternItem dash;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PatternItem dot = (PatternItem) it.next();
            if (dot == null) {
                dot = null;
            } else {
                int i = dot.b;
                if (i == 0) {
                    dash = new Dash(dot.c.floatValue());
                } else if (i == 1) {
                    dot = new Dot();
                } else if (i != 2) {
                    Log.w(a, a.bp(i, "Unknown PatternItem type: "));
                } else {
                    dash = new Gap(dot.c.floatValue());
                }
                dot = dash;
            }
            arrayList.add(dot);
        }
        return arrayList;
    }

    public static boolean isRecognizedPatternItem(PatternItem patternItem) {
        if (patternItem == null) {
            return false;
        }
        int i = patternItem.b;
        return i == 0 || i == 1 || i == 2;
    }

    public static PatternItem[] validatePatternItems(List<PatternItem> list, String str) {
        if (list == null) {
            return null;
        }
        PatternItem[] patternItemArr = (PatternItem[]) list.toArray(new PatternItem[list.size()]);
        for (int i = 0; i < patternItemArr.length; i++) {
            if (!isRecognizedPatternItem(patternItemArr[i])) {
                Log.e(str, String.format(UNRECOGNIZED_PATTERN_ITEM_IN_LIST_ERROR_MESSAGE_TEMPLATE, Integer.valueOf(i), str));
            }
        }
        return patternItemArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.b == patternItem.b && Objects.equals(this.c, patternItem.c);
    }

    public Float getLength() {
        return this.c;
    }

    public int getType() {
        return this.b;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), this.c);
    }

    public String toString() {
        return "[PatternItem: type=" + this.b + " length=" + this.c + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 2, getType());
        spu.x(parcel, 3, getLength());
        spu.m(parcel, iL);
    }
}
