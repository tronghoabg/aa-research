package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackRequest;
import com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackStatus;
import com.google.android.gms.car.control.CarAction;
import com.google.android.gms.car.control.CarAreaId;
import com.google.android.gms.car.control.CarAreaIdConfig;
import com.google.android.gms.car.control.CarControl;
import com.google.android.gms.car.control.CarControlGroup;
import com.google.android.gms.car.control.CarProperty;
import com.google.android.gms.car.control.CarPropertyConfig;
import com.google.android.gms.car.control.CarPropertyControl;
import com.google.android.gms.car.control.CarPropertySetError;
import com.google.android.gms.car.control.CarPropertyState;
import com.google.android.gms.car.control.CarPropertyValue;
import com.google.android.gms.car.diagnostics.CriticalError;
import com.google.android.gms.car.display.CarDisplayBlendedUiConfig;
import com.google.android.gms.car.display.CarDisplayCornerRadii;
import com.google.android.gms.car.display.CarDisplayNativeUiElement;
import com.google.android.gms.car.display.UiStyle;
import com.google.android.gms.car.display.UiStyleColorToken;
import com.google.android.gms.car.display.UiStyleToken;
import com.google.android.gms.car.display.integratedoverlay.OverlayParameters;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class rhl implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public rhl(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iN = 0;
        ArrayList arrayListAb = null;
        Rect rect = null;
        String strX = null;
        ArrayList arrayListAb2 = null;
        Rect rect2 = null;
        Integer numV = null;
        CarDisplayCornerRadii carDisplayCornerRadii = null;
        CarAreaId carAreaId = null;
        CarProperty carProperty = null;
        switch (this.a) {
            case 0:
                int iP = spu.P(parcel);
                int iN2 = 0;
                String strX2 = null;
                ArrayList arrayListY = null;
                long jQ = 0;
                while (parcel.dataPosition() < iP) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iN2 = spu.N(parcel, i);
                    } else if (c == 2) {
                        strX2 = spu.X(parcel, i);
                    } else if (c == 3) {
                        jQ = spu.Q(parcel, i);
                    } else if (c != 4) {
                        spu.ae(parcel, i);
                    } else {
                        arrayListY = spu.Y(parcel, i);
                    }
                }
                spu.ac(parcel, iP);
                return new CarLocalMediaPlaybackStatus(iN2, strX2, jQ, arrayListY);
            case 1:
                int iP2 = spu.P(parcel);
                while (parcel.dataPosition() < iP2) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        spu.ae(parcel, i2);
                    } else {
                        iN = spu.N(parcel, i2);
                    }
                }
                spu.ac(parcel, iP2);
                return new CarLocalMediaPlaybackRequest(iN);
            case 2:
                int iP3 = spu.P(parcel);
                while (parcel.dataPosition() < iP3) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        spu.ae(parcel, i3);
                    } else {
                        iN = spu.N(parcel, i3);
                    }
                }
                spu.ac(parcel, iP3);
                return new CarAction(iN);
            case 3:
                String string = parcel.readString();
                string.getClass();
                return new CarAreaIdConfig((CarAreaId) spu.i(string, CarAreaId.CREATOR), parcel.readValue(getClass().getClassLoader()), parcel.readValue(getClass().getClassLoader()));
            case 4:
                int iP4 = spu.P(parcel);
                int iN3 = 0;
                while (parcel.dataPosition() < iP4) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 1) {
                        iN = spu.N(parcel, i4);
                    } else if (c2 != 2) {
                        spu.ae(parcel, i4);
                    } else {
                        iN3 = spu.N(parcel, i4);
                    }
                }
                spu.ac(parcel, iP4);
                return new CarAreaId(iN, iN3);
            case 5:
                int iP5 = spu.P(parcel);
                boolean zAf = false;
                int iN4 = 0;
                CarPropertyControl carPropertyControl = null;
                CarAction carAction = null;
                CarControlGroup carControlGroup = null;
                ArrayList arrayListY2 = null;
                while (parcel.dataPosition() < iP5) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 1:
                            carPropertyControl = (CarPropertyControl) spu.T(parcel, i5, CarPropertyControl.CREATOR);
                            break;
                        case 2:
                            carAction = (CarAction) spu.T(parcel, i5, CarAction.CREATOR);
                            break;
                        case 3:
                            carControlGroup = (CarControlGroup) spu.T(parcel, i5, CarControlGroup.CREATOR);
                            break;
                        case 4:
                            zAf = spu.af(parcel, i5);
                            break;
                        case 5:
                            arrayListY2 = spu.Y(parcel, i5);
                            break;
                        case 6:
                            iN4 = spu.N(parcel, i5);
                            break;
                        default:
                            spu.ae(parcel, i5);
                            break;
                    }
                }
                spu.ac(parcel, iP5);
                return new CarControl(carPropertyControl, carAction, carControlGroup, zAf, arrayListY2, iN4);
            case 6:
                int iP6 = spu.P(parcel);
                while (parcel.dataPosition() < iP6) {
                    int i6 = parcel.readInt();
                    char c3 = (char) i6;
                    if (c3 == 1) {
                        iN = spu.N(parcel, i6);
                    } else if (c3 != 2) {
                        spu.ae(parcel, i6);
                    } else {
                        arrayListAb = spu.ab(parcel, i6, CarControl.CREATOR);
                    }
                }
                spu.ac(parcel, iP6);
                return new CarControlGroup(iN, arrayListAb);
            case 7:
                return new CarPropertyConfig(parcel);
            case 8:
                int iP7 = spu.P(parcel);
                CarAction carAction2 = null;
                CarProperty carProperty2 = null;
                while (parcel.dataPosition() < iP7) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 1) {
                        carProperty = (CarProperty) spu.T(parcel, i7, CarProperty.CREATOR);
                    } else if (c4 == 2) {
                        carAction2 = (CarAction) spu.T(parcel, i7, CarAction.CREATOR);
                    } else if (c4 != 3) {
                        spu.ae(parcel, i7);
                    } else {
                        carProperty2 = (CarProperty) spu.T(parcel, i7, CarProperty.CREATOR);
                    }
                }
                spu.ac(parcel, iP7);
                return new CarPropertyControl(carProperty, carAction2, carProperty2);
            case 9:
                int iP8 = spu.P(parcel);
                while (parcel.dataPosition() < iP8) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 1) {
                        iN = spu.N(parcel, i8);
                    } else if (c5 != 2) {
                        spu.ae(parcel, i8);
                    } else {
                        carAreaId = (CarAreaId) spu.T(parcel, i8, CarAreaId.CREATOR);
                    }
                }
                spu.ac(parcel, iP8);
                return new CarProperty(iN, carAreaId);
            case 10:
                int iP9 = spu.P(parcel);
                while (parcel.dataPosition() < iP9) {
                    int i9 = parcel.readInt();
                    if (((char) i9) != 1) {
                        spu.ae(parcel, i9);
                    } else {
                        iN = spu.N(parcel, i9);
                    }
                }
                spu.ac(parcel, iP9);
                return new CarPropertySetError(iN);
            case 11:
                String string2 = parcel.readString();
                string2.getClass();
                CarProperty carProperty3 = (CarProperty) spu.i(string2, CarProperty.CREATOR);
                String string3 = parcel.readString();
                string3.getClass();
                return new CarPropertyState(carProperty3, (CarPropertyValue) spu.i(string3, CarPropertyValue.CREATOR), parcel.readInt());
            case 12:
                return new CarPropertyValue(parcel.readValue(getClass().getClassLoader()));
            case 13:
                int iP10 = spu.P(parcel);
                int iN5 = 0;
                while (parcel.dataPosition() < iP10) {
                    int i10 = parcel.readInt();
                    char c6 = (char) i10;
                    if (c6 == 1) {
                        iN = spu.N(parcel, i10);
                    } else if (c6 != 2) {
                        spu.ae(parcel, i10);
                    } else {
                        iN5 = spu.N(parcel, i10);
                    }
                }
                spu.ac(parcel, iP10);
                return new CriticalError(iN, iN5);
            case 14:
                int iP11 = spu.P(parcel);
                ArrayList arrayListAb3 = null;
                while (parcel.dataPosition() < iP11) {
                    int i11 = parcel.readInt();
                    char c7 = (char) i11;
                    if (c7 == 1) {
                        carDisplayCornerRadii = (CarDisplayCornerRadii) spu.T(parcel, i11, CarDisplayCornerRadii.CREATOR);
                    } else if (c7 != 2) {
                        spu.ae(parcel, i11);
                    } else {
                        arrayListAb3 = spu.ab(parcel, i11, CarDisplayNativeUiElement.CREATOR);
                    }
                }
                spu.ac(parcel, iP11);
                return new CarDisplayBlendedUiConfig(carDisplayCornerRadii, arrayListAb3);
            case 15:
                int iP12 = spu.P(parcel);
                Integer numV2 = null;
                Integer numV3 = null;
                Integer numV4 = null;
                while (parcel.dataPosition() < iP12) {
                    int i12 = parcel.readInt();
                    char c8 = (char) i12;
                    if (c8 == 1) {
                        numV = spu.V(parcel, i12);
                    } else if (c8 == 2) {
                        numV2 = spu.V(parcel, i12);
                    } else if (c8 == 3) {
                        numV3 = spu.V(parcel, i12);
                    } else if (c8 != 4) {
                        spu.ae(parcel, i12);
                    } else {
                        numV4 = spu.V(parcel, i12);
                    }
                }
                spu.ac(parcel, iP12);
                return new CarDisplayCornerRadii(numV, numV2, numV3, numV4);
            case 16:
                int iP13 = spu.P(parcel);
                while (parcel.dataPosition() < iP13) {
                    int i13 = parcel.readInt();
                    char c9 = (char) i13;
                    if (c9 == 1) {
                        rect2 = (Rect) spu.T(parcel, i13, Rect.CREATOR);
                    } else if (c9 != 2) {
                        spu.ae(parcel, i13);
                    } else {
                        iN = spu.N(parcel, i13);
                    }
                }
                spu.ac(parcel, iP13);
                return new CarDisplayNativeUiElement(rect2, iN);
            case 17:
                int iP14 = spu.P(parcel);
                while (parcel.dataPosition() < iP14) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        spu.ae(parcel, i14);
                    } else {
                        iN = spu.N(parcel, i14);
                    }
                }
                spu.ac(parcel, iP14);
                return new UiStyleColorToken(iN);
            case 18:
                int iP15 = spu.P(parcel);
                ArrayList arrayListAb4 = null;
                while (parcel.dataPosition() < iP15) {
                    int i15 = parcel.readInt();
                    char c10 = (char) i15;
                    if (c10 == 1) {
                        arrayListAb2 = spu.ab(parcel, i15, UiStyleToken.CREATOR);
                    } else if (c10 != 2) {
                        spu.ae(parcel, i15);
                    } else {
                        arrayListAb4 = spu.ab(parcel, i15, UiStyleToken.CREATOR);
                    }
                }
                spu.ac(parcel, iP15);
                return new UiStyle(arrayListAb2, arrayListAb4);
            case 19:
                int iP16 = spu.P(parcel);
                UiStyleColorToken uiStyleColorToken = null;
                while (parcel.dataPosition() < iP16) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 1) {
                        strX = spu.X(parcel, i16);
                    } else if (c11 != 2) {
                        spu.ae(parcel, i16);
                    } else {
                        uiStyleColorToken = (UiStyleColorToken) spu.T(parcel, i16, UiStyleColorToken.CREATOR);
                    }
                }
                spu.ac(parcel, iP16);
                return new UiStyleToken(strX, uiStyleColorToken);
            default:
                int iP17 = spu.P(parcel);
                float fM = BitmapDescriptorFactory.HUE_RED;
                while (parcel.dataPosition() < iP17) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 1) {
                        iN = spu.N(parcel, i17);
                    } else if (c12 == 2) {
                        rect = (Rect) spu.T(parcel, i17, Rect.CREATOR);
                    } else if (c12 != 3) {
                        spu.ae(parcel, i17);
                    } else {
                        fM = spu.M(parcel, i17);
                    }
                }
                spu.ac(parcel, iP17);
                return new OverlayParameters(iN, rect, fM);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new CarLocalMediaPlaybackStatus[i];
            case 1:
                return new CarLocalMediaPlaybackRequest[i];
            case 2:
                return new CarAction[i];
            case 3:
                return new CarAreaIdConfig[0];
            case 4:
                return new CarAreaId[i];
            case 5:
                return new CarControl[i];
            case 6:
                return new CarControlGroup[i];
            case 7:
                return new CarPropertyConfig[0];
            case 8:
                return new CarPropertyControl[i];
            case 9:
                return new CarProperty[i];
            case 10:
                return new CarPropertySetError[i];
            case 11:
                return new CarPropertyState[0];
            case 12:
                return new CarPropertyValue[0];
            case 13:
                return new CriticalError[i];
            case 14:
                return new CarDisplayBlendedUiConfig[i];
            case 15:
                return new CarDisplayCornerRadii[i];
            case 16:
                return new CarDisplayNativeUiElement[i];
            case 17:
                return new UiStyleColorToken[i];
            case 18:
                return new UiStyle[i];
            case 19:
                return new UiStyleToken[i];
            default:
                return new OverlayParameters[i];
        }
    }
}
