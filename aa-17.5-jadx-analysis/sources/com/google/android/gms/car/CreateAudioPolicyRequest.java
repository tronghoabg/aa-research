package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qte;
import defpackage.spu;

/* loaded from: classes2.dex */
public class CreateAudioPolicyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateAudioPolicyRequest> CREATOR = new qte(1);
    public final AudioPolicyMixData[] a;

    public CreateAudioPolicyRequest(AudioPolicyMixData[] audioPolicyMixDataArr) {
        this.a = audioPolicyMixDataArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AudioPolicyMixData[] audioPolicyMixDataArr = this.a;
        int iL = spu.l(parcel, 20293);
        spu.I(parcel, 1, audioPolicyMixDataArr, i);
        spu.m(parcel, iL);
    }
}
