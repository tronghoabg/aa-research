package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.phenotype.ExperimentTokens;

/* loaded from: classes.dex */
public final class sis implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        PlayLoggerContext playLoggerContext = null;
        byte[] bArrAg = null;
        int[] iArrAh = null;
        String[] strArrAj = null;
        int[] iArrAh2 = null;
        byte[][] bArrAk = null;
        ExperimentTokens[] experimentTokensArr = null;
        LogVerifierResultParcelable logVerifierResultParcelable = null;
        String[] strArrAj2 = null;
        DataCollectionIdentifierParcelable dataCollectionIdentifierParcelable = null;
        BatchedLogErrorParcelable batchedLogErrorParcelable = null;
        byte[] bArrAg2 = null;
        Long lW = null;
        int iN = 0;
        boolean zAf = true;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    playLoggerContext = (PlayLoggerContext) spu.T(parcel, i, PlayLoggerContext.CREATOR);
                    break;
                case 3:
                    bArrAg = spu.ag(parcel, i);
                    break;
                case 4:
                    iArrAh = spu.ah(parcel, i);
                    break;
                case 5:
                    strArrAj = spu.aj(parcel, i);
                    break;
                case 6:
                    iArrAh2 = spu.ah(parcel, i);
                    break;
                case 7:
                    bArrAk = spu.ak(parcel, i);
                    break;
                case '\b':
                    zAf = spu.af(parcel, i);
                    break;
                case '\t':
                    experimentTokensArr = (ExperimentTokens[]) spu.ai(parcel, i, ExperimentTokens.CREATOR);
                    break;
                case '\n':
                default:
                    spu.ae(parcel, i);
                    break;
                case 11:
                    logVerifierResultParcelable = (LogVerifierResultParcelable) spu.T(parcel, i, LogVerifierResultParcelable.CREATOR);
                    break;
                case '\f':
                    strArrAj2 = spu.aj(parcel, i);
                    break;
                case '\r':
                    iN = spu.N(parcel, i);
                    break;
                case 14:
                    dataCollectionIdentifierParcelable = (DataCollectionIdentifierParcelable) spu.T(parcel, i, DataCollectionIdentifierParcelable.CREATOR);
                    break;
                case 15:
                    batchedLogErrorParcelable = (BatchedLogErrorParcelable) spu.T(parcel, i, BatchedLogErrorParcelable.CREATOR);
                    break;
                case 16:
                    bArrAg2 = spu.ag(parcel, i);
                    break;
                case 17:
                    lW = spu.W(parcel, i);
                    break;
            }
        }
        spu.ac(parcel, iP);
        return new LogEventParcelable(playLoggerContext, bArrAg, iArrAh, strArrAj, iArrAh2, bArrAk, zAf, experimentTokensArr, logVerifierResultParcelable, strArrAj2, iN, dataCollectionIdentifierParcelable, batchedLogErrorParcelable, bArrAg2, lW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LogEventParcelable[i];
    }
}
