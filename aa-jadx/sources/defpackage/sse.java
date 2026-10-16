package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sse implements android.os.Parcelable.Creator {
    private final /* synthetic */ int a;

    public sse(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.a) {
            case 0:
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
            case 2:
                return new com.google.android.libraries.surveys.SurveyMetadata(parcel);
            case 3:
                return new com.google.android.libraries.surveys.internal.model.Answer(parcel);
            case 4:
                return new com.google.android.libraries.surveys.internal.model.QuestionMetrics(parcel);
            case 5:
                try {
                    return new com.google.android.libraries.surveys.internal.model.SurveyDataImpl(parcel);
                } catch (defpackage.abpp e) {
                    throw new android.os.BadParcelableException(e);
                }
            case 6:
                return new com.google.android.material.checkbox.MaterialCheckBox.SavedState(parcel);
            case 7:
                return new com.google.android.projection.sdk.demand.Template(parcel);
            case 8:
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
            case 0:
                return new com.google.android.gms.feedback.ServiceDumpRequest[i];
            case 1:
                return new com.google.android.libraries.social.licenses.License[i];
            case 2:
                return new com.google.android.libraries.surveys.SurveyMetadata[i];
            case 3:
                return new com.google.android.libraries.surveys.internal.model.Answer[i];
            case 4:
                return new com.google.android.libraries.surveys.internal.model.QuestionMetrics[i];
            case 5:
                return new com.google.android.libraries.surveys.internal.model.SurveyDataImpl[i];
            case 6:
                return new com.google.android.material.checkbox.MaterialCheckBox.SavedState[i];
            case 7:
                return new com.google.android.projection.sdk.demand.Template[i];
            case 8:
                return new com.google.android.projection.sdk.demand.TemplateArgument[i];
            default:
                return new com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse[i];
        }
    }
}
