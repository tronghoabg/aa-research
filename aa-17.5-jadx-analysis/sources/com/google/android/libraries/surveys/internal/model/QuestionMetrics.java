package com.google.android.libraries.surveys.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import defpackage.srg;
import defpackage.wid;

/* loaded from: classes3.dex */
public class QuestionMetrics implements Parcelable {
    public static final Parcelable.Creator<QuestionMetrics> CREATOR = new srg(3);
    private long a;
    private long b;

    public QuestionMetrics(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
    }

    public final void a() {
        if (!c()) {
            Log.e("SurveyQuestionMetrics", "Question was marked as answered but was never marked as shown.");
        } else if (this.b >= 0) {
            long j = wid.a;
        } else {
            this.b = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (c()) {
            return;
        }
        this.a = SystemClock.elapsedRealtime();
    }

    public final boolean c() {
        return this.a >= 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    public QuestionMetrics() {
        this.a = -1L;
        this.b = -1L;
    }
}
