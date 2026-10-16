package com.google.android.libraries.surveys;

/* JADX INFO: loaded from: classes3.dex */
public final class SurveyMetadata implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.surveys.SurveyMetadata> CREATOR = new defpackage.sse(2);
    public final java.lang.String a;
    public final java.lang.String b;
    private final java.lang.String c;
    private final int d;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public SurveyMetadata(android.os.Parcel parcel) {
        int i;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        java.lang.String string = parcel.readString();
        switch (string.hashCode()) {
            case -1446966090:
                if (string.equals("NOT_SET")) {
                    i = 1;
                    this.d = i;
                    return;
                }
                break;
            case 364290440:
                if (string.equals("CONFIDENTIAL")) {
                    i = 4;
                    this.d = i;
                    return;
                }
                break;
            case 1053567612:
                if (string.equals("DISABLED")) {
                    i = 2;
                    this.d = i;
                    return;
                }
                break;
            case 2095255229:
                if (string.equals("STANDARD")) {
                    i = 3;
                    this.d = i;
                    return;
                }
                break;
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.surveys.SurveyMetadata)) {
            return false;
        }
        com.google.android.libraries.surveys.SurveyMetadata surveyMetadata = (com.google.android.libraries.surveys.SurveyMetadata) obj;
        return j$.util.Objects.equals(this.a, surveyMetadata.a) && j$.util.Objects.equals(this.b, surveyMetadata.b) && j$.util.Objects.equals(this.c, surveyMetadata.c) && this.d == surveyMetadata.d;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b, this.c, java.lang.Integer.valueOf(this.d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        int i2 = this.d;
        if (i2 == 1) {
            str = "NOT_SET";
        } else if (i2 != 2) {
            str = i2 != 3 ? "CONFIDENTIAL" : "STANDARD";
        } else {
            str = "DISABLED";
        }
        parcel.writeString(str);
    }

    public SurveyMetadata(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }
}
