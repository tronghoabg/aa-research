package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.car.BlackHoleParams;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarRegionId;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rah implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        ProjectionWindowAnimationParams projectionWindowAnimationParams = null;
        ProjectionWindowAnimationParams projectionWindowAnimationParams2 = null;
        Rect rect = null;
        Bundle bundleR = null;
        CarRegionId carRegionId = null;
        ArrayList arrayListAb = null;
        ProjectionWindowDecorationParams projectionWindowDecorationParams = null;
        ProjectionWindowAnimationParams projectionWindowAnimationParams3 = null;
        ProjectionWindowAnimationParams projectionWindowAnimationParams4 = null;
        String strX = null;
        BlackHoleParams blackHoleParams = null;
        Rect rect2 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        boolean zAf = false;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (parcel.dataPosition() < iP) {
            int i17 = parcel.readInt();
            char c = (char) i17;
            if (c != 1000) {
                switch (c) {
                    case 1:
                        spu.ad(parcel, i17, 4);
                        i2 = parcel.readInt();
                        break;
                    case 2:
                        spu.ad(parcel, i17, 4);
                        i3 = parcel.readInt();
                        break;
                    case 3:
                        spu.ad(parcel, i17, 4);
                        i4 = parcel.readInt();
                        break;
                    case 4:
                        spu.ad(parcel, i17, 4);
                        i5 = parcel.readInt();
                        break;
                    case 5:
                        spu.ad(parcel, i17, 4);
                        i6 = parcel.readInt();
                        break;
                    case 6:
                        spu.ad(parcel, i17, 4);
                        i7 = parcel.readInt();
                        break;
                    case 7:
                        spu.ad(parcel, i17, 4);
                        i8 = parcel.readInt();
                        break;
                    case '\b':
                        spu.ad(parcel, i17, 4);
                        i9 = parcel.readInt();
                        break;
                    case '\t':
                        projectionWindowAnimationParams = (ProjectionWindowAnimationParams) spu.T(parcel, i17, ProjectionWindowAnimationParams.CREATOR);
                        break;
                    case '\n':
                        projectionWindowAnimationParams2 = (ProjectionWindowAnimationParams) spu.T(parcel, i17, ProjectionWindowAnimationParams.CREATOR);
                        break;
                    case 11:
                        spu.ad(parcel, i17, 4);
                        i10 = parcel.readInt();
                        break;
                    case '\f':
                        zAf = spu.af(parcel, i17);
                        break;
                    case '\r':
                        spu.ad(parcel, i17, 4);
                        i11 = parcel.readInt();
                        break;
                    case 14:
                        spu.ad(parcel, i17, 4);
                        i12 = parcel.readInt();
                        break;
                    case 15:
                        spu.ad(parcel, i17, 4);
                        i13 = parcel.readInt();
                        break;
                    case 16:
                        rect = (Rect) spu.T(parcel, i17, Rect.CREATOR);
                        break;
                    case 17:
                        bundleR = spu.R(parcel, i17);
                        break;
                    case 18:
                        carRegionId = (CarRegionId) spu.T(parcel, i17, CarRegionId.CREATOR);
                        break;
                    case 19:
                        arrayListAb = spu.ab(parcel, i17, CarRegionId.CREATOR);
                        break;
                    case 20:
                        projectionWindowDecorationParams = (ProjectionWindowDecorationParams) spu.T(parcel, i17, ProjectionWindowDecorationParams.CREATOR);
                        break;
                    case 21:
                        projectionWindowAnimationParams3 = (ProjectionWindowAnimationParams) spu.T(parcel, i17, ProjectionWindowAnimationParams.CREATOR);
                        break;
                    case 22:
                        projectionWindowAnimationParams4 = (ProjectionWindowAnimationParams) spu.T(parcel, i17, ProjectionWindowAnimationParams.CREATOR);
                        break;
                    case 23:
                        strX = spu.X(parcel, i17);
                        break;
                    case 24:
                        spu.ad(parcel, i17, 4);
                        i14 = parcel.readInt();
                        break;
                    case 25:
                        spu.ad(parcel, i17, 4);
                        i15 = parcel.readInt();
                        break;
                    case 26:
                        spu.ad(parcel, i17, 4);
                        i16 = parcel.readInt();
                        break;
                    case 27:
                        blackHoleParams = (BlackHoleParams) spu.T(parcel, i17, BlackHoleParams.CREATOR);
                        break;
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        spu.ad(parcel, i17, 4);
                        f = parcel.readFloat();
                        break;
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        rect2 = (Rect) spu.T(parcel, i17, Rect.CREATOR);
                        break;
                    default:
                        spu.ae(parcel, i17);
                        break;
                }
            } else {
                spu.ad(parcel, i17, 4);
                i = parcel.readInt();
            }
        }
        spu.ac(parcel, iP);
        return new CarWindowLayoutParams(i, i2, i3, i4, i5, i6, i7, i8, i9, projectionWindowAnimationParams, projectionWindowAnimationParams2, i10, zAf, i11, i12, i13, rect, bundleR, carRegionId, arrayListAb, projectionWindowDecorationParams, projectionWindowAnimationParams3, projectionWindowAnimationParams4, strX, i14, i15, i16, blackHoleParams, f, rect2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CarWindowLayoutParams[i];
    }
}
