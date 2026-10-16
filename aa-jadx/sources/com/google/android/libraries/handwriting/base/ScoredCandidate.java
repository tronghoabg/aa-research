package com.google.android.libraries.handwriting.base;

/* JADX INFO: loaded from: classes3.dex */
public class ScoredCandidate implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.handwriting.base.ScoredCandidate> CREATOR = new android.os.Parcelable.Creator<com.google.android.libraries.handwriting.base.ScoredCandidate>() { // from class: com.google.android.libraries.handwriting.base.ScoredCandidate.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.libraries.handwriting.base.ScoredCandidate createFromParcel(android.os.Parcel parcel) {
            return new com.google.android.libraries.handwriting.base.ScoredCandidate(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.libraries.handwriting.base.ScoredCandidate[] newArray(int i) {
            return new com.google.android.libraries.handwriting.base.ScoredCandidate[i];
        }
    };
    public final java.util.List<java.lang.String> completions;
    public final float score;
    public final java.lang.String word;

    public ScoredCandidate(android.os.Parcel parcel) {
        this.word = parcel.readString();
        this.score = parcel.readFloat();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.completions = arrayList;
        parcel.readStringList(arrayList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.word);
        parcel.writeFloat(this.score);
        parcel.writeStringList(this.completions);
    }

    public ScoredCandidate(java.lang.String str, float f, java.util.List<java.lang.String> list) {
        this.word = str;
        this.score = f;
        this.completions = list;
    }

    public ScoredCandidate(java.lang.String str, float f) {
        this(str, f, new java.util.ArrayList(0));
    }
}
