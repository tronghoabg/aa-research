package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ServiceDumpRequest;
import com.google.android.libraries.surveys.SurveyMetadata;
import com.google.android.libraries.surveys.internal.model.Answer;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.android.libraries.surveys.internal.model.SurveyDataImpl;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.projection.sdk.demand.Template;
import com.google.android.projection.sdk.demand.TemplateArgument;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;

/* loaded from: classes.dex */
public final class srg implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public srg(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int iP = spu.P(parcel);
                String strX = null;
                String strX2 = null;
                String[] strArrAj = null;
                int iN = 0;
                boolean zAf = false;
                while (parcel.dataPosition() < iP) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        strX = spu.X(parcel, i);
                    } else if (c == 3) {
                        strArrAj = spu.aj(parcel, i);
                    } else if (c == 4) {
                        iN = spu.N(parcel, i);
                    } else if (c == 5) {
                        zAf = spu.af(parcel, i);
                    } else if (c != 6) {
                        spu.ae(parcel, i);
                    } else {
                        strX2 = spu.X(parcel, i);
                    }
                }
                spu.ac(parcel, iP);
                return new ServiceDumpRequest(strX, strX2, strArrAj, iN, zAf);
            case 1:
                return new SurveyMetadata(parcel);
            case 2:
                return new Answer(parcel);
            case 3:
                return new QuestionMetrics(parcel);
            case 4:
                try {
                    return new SurveyDataImpl(parcel);
                } catch (abon e) {
                    throw new BadParcelableException(e);
                }
            case 5:
                return new MaterialCheckBox.SavedState(parcel);
            case 6:
                return new Template(parcel);
            case 7:
                return new TemplateArgument(parcel);
            default:
                byte[] bArr = new byte[parcel.readInt()];
                parcel.readByteArray(bArr);
                return new ProtoParsers$InternalDontUse(bArr, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ServiceDumpRequest[i];
            case 1:
                return new SurveyMetadata[i];
            case 2:
                return new Answer[i];
            case 3:
                return new QuestionMetrics[i];
            case 4:
                return new SurveyDataImpl[i];
            case 5:
                return new MaterialCheckBox.SavedState[i];
            case 6:
                return new Template[i];
            case 7:
                return new TemplateArgument[i];
            default:
                return new ProtoParsers$InternalDontUse[i];
        }
    }
}
