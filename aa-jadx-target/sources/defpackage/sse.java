package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sse implements android.os.Parcelable.Creator {
    private final /* synthetic */ int a;

    public sse(int i) {
        this.a = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) throws spq {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                int iT = defpackage.sqs.T(parcel);
                java.lang.String strAb = null;
                java.lang.String strAb2 = null;
                java.lang.String[] strArrAn = null;
                int iR = 0;
                boolean zAj = false;
                while (parcel.dataPosition() < iT) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        strAb = defpackage.sqs.ab(parcel, i);
                    } else if (c == 3) {
                        strArrAn = defpackage.sqs.an(parcel, i);
                    } else if (c == 4) {
                        iR = defpackage.sqs.R(parcel, i);
                    } else if (c == 5) {
                        zAj = defpackage.sqs.aj(parcel, i);
                    } else if (c != 6) {
                        defpackage.sqs.ai(parcel, i);
                    } else {
                        strAb2 = defpackage.sqs.ab(parcel, i);
                    }
                }
                defpackage.sqs.ag(parcel, iT);
                return new com.google.android.gms.feedback.ServiceDumpRequest(strAb, strAb2, strArrAn, iR, zAj);
            case 1:
                return new com.google.android.libraries.social.licenses.License(parcel);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new com.google.android.libraries.surveys.SurveyMetadata(parcel);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new com.google.android.libraries.surveys.internal.model.Answer(parcel);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new com.google.android.libraries.surveys.internal.model.QuestionMetrics(parcel);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                try {
                    return new com.google.android.libraries.surveys.internal.model.SurveyDataImpl(parcel);
                } catch (defpackage.abpp e) {
                    throw new android.os.BadParcelableException(e);
                }
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new com.google.android.material.checkbox.MaterialCheckBox.SavedState(parcel);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new com.google.android.projection.sdk.demand.Template(parcel);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new com.google.android.projection.sdk.demand.TemplateArgument(parcel);
            default:
                byte[] bArr = new byte[parcel.readInt()];
                parcel.readByteArray(bArr);
                return new com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse(bArr, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return new com.google.android.gms.feedback.ServiceDumpRequest[i];
            case 1:
                return new com.google.android.libraries.social.licenses.License[i];
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new com.google.android.libraries.surveys.SurveyMetadata[i];
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new com.google.android.libraries.surveys.internal.model.Answer[i];
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new com.google.android.libraries.surveys.internal.model.QuestionMetrics[i];
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new com.google.android.libraries.surveys.internal.model.SurveyDataImpl[i];
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new com.google.android.material.checkbox.MaterialCheckBox.SavedState[i];
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new com.google.android.projection.sdk.demand.Template[i];
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new com.google.android.projection.sdk.demand.TemplateArgument[i];
            default:
                return new com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse[i];
        }
    }
}
