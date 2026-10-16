package com.google.android.libraries.surveys;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.srg;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class SurveyMetadata implements Parcelable {
    public static final Parcelable.Creator<SurveyMetadata> CREATOR = new srg(1);
    public final String a;
    public final String b;
    private final String c;
    private final int d;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public SurveyMetadata(Parcel parcel) {
        int i;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        String string = parcel.readString();
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
        throw new IllegalArgumentException();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SurveyMetadata)) {
            return false;
        }
        SurveyMetadata surveyMetadata = (SurveyMetadata) obj;
        return Objects.equals(this.a, surveyMetadata.a) && Objects.equals(this.b, surveyMetadata.b) && Objects.equals(this.c, surveyMetadata.c) && this.d == surveyMetadata.d;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Integer.valueOf(this.d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        int i2 = this.d;
        parcel.writeString(i2 != 1 ? i2 != 2 ? i2 != 3 ? "CONFIDENTIAL" : "STANDARD" : "DISABLED" : "NOT_SET");
    }

    public SurveyMetadata(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }
}
