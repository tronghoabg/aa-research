package com.google.android.libraries.surveys.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.surveys.SurveyData;
import com.google.android.libraries.surveys.SurveyMetadata;
import defpackage.abnj;
import defpackage.abon;
import defpackage.abyn;
import defpackage.abzc;
import defpackage.srg;
import defpackage.wid;
import defpackage.wox;
import defpackage.yfq;
import defpackage.yls;

/* loaded from: classes3.dex */
public class SurveyDataImpl implements SurveyData {
    public static final Parcelable.Creator<SurveyDataImpl> CREATOR = new srg(4);
    public final String a;
    public final abyn b;
    public final abzc c;
    public final String d;
    public final long e;
    public final yfq f;
    private final String g;

    public SurveyDataImpl(Parcel parcel) throws abon {
        this.a = parcel.readString();
        this.g = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readLong();
        int i = yfq.d;
        yfq yfqVar = yls.a;
        this.f = yfqVar;
        parcel.readStringList(yfqVar);
        abyn abynVar = abyn.a;
        abnj abnjVar = abnj.a;
        this.b = (abyn) wox.ak(parcel, abynVar, abnjVar);
        this.c = (abzc) wox.ak(parcel, abzc.a, abnjVar);
    }

    @Override // com.google.android.libraries.surveys.SurveyData
    public final SurveyMetadata a() {
        return new SurveyMetadata(this.a, this.g, b(), true != wid.l(this.b) ? 2 : 3);
    }

    public final String b() {
        abzc abzcVar = this.c;
        if (abzcVar != null) {
            return abzcVar.b;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.g);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeStringList(this.f);
        wox.am(parcel, this.b);
        wox.am(parcel, this.c);
    }

    public SurveyDataImpl(String str, String str2, long j, abzc abzcVar, abyn abynVar, String str3, yfq yfqVar) {
        this.a = str;
        this.g = str2;
        this.e = j;
        this.d = str3;
        this.f = yfqVar;
        this.b = abynVar;
        this.c = abzcVar;
    }
}
