package com.google.android.libraries.handwriting.base;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class ScoredCandidate implements Parcelable {
    public static final Parcelable.Creator<ScoredCandidate> CREATOR = new Parcelable.Creator<ScoredCandidate>() { // from class: com.google.android.libraries.handwriting.base.ScoredCandidate.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScoredCandidate createFromParcel(Parcel parcel) {
            return new ScoredCandidate(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScoredCandidate[] newArray(int i) {
            return new ScoredCandidate[i];
        }
    };
    public final List<String> completions;
    public final float score;
    public final String word;

    public ScoredCandidate(Parcel parcel) {
        this.word = parcel.readString();
        this.score = parcel.readFloat();
        ArrayList arrayList = new ArrayList();
        this.completions = arrayList;
        parcel.readStringList(arrayList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.word);
        parcel.writeFloat(this.score);
        parcel.writeStringList(this.completions);
    }

    public ScoredCandidate(String str, float f, List<String> list) {
        this.word = str;
        this.score = f;
        this.completions = list;
    }

    public ScoredCandidate(String str, float f) {
        this(str, f, new ArrayList(0));
    }
}
