package a7;

import U8.v0;
import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import b7.C1518a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* renamed from: a7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1338d implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17396a;

    public /* synthetic */ C1338d(int i5) {
        this.f17396a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f17396a) {
            case 0:
                int iO0 = v0.o0(parcel);
                String strY = null;
                String strY2 = null;
                String strY3 = null;
                String strY4 = null;
                Uri uri = null;
                String strY5 = null;
                String strY6 = null;
                ArrayList arrayListC = null;
                String strY7 = null;
                String strY8 = null;
                long jH0 = 0;
                int iF0 = 0;
                while (parcel.dataPosition() < iO0) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 1:
                            iF0 = v0.f0(i5, parcel);
                            break;
                        case 2:
                            strY = v0.y(i5, parcel);
                            break;
                        case 3:
                            strY2 = v0.y(i5, parcel);
                            break;
                        case 4:
                            strY3 = v0.y(i5, parcel);
                            break;
                        case 5:
                            strY4 = v0.y(i5, parcel);
                            break;
                        case 6:
                            uri = (Uri) v0.x(parcel, i5, Uri.CREATOR);
                            break;
                        case 7:
                            strY5 = v0.y(i5, parcel);
                            break;
                        case '\b':
                            jH0 = v0.h0(i5, parcel);
                            break;
                        case '\t':
                            strY6 = v0.y(i5, parcel);
                            break;
                        case '\n':
                            arrayListC = v0.C(parcel, i5, Scope.CREATOR);
                            break;
                        case 11:
                            strY7 = v0.y(i5, parcel);
                            break;
                        case '\f':
                            strY8 = v0.y(i5, parcel);
                            break;
                        default:
                            v0.m0(i5, parcel);
                            break;
                    }
                }
                v0.D(iO0, parcel);
                return new GoogleSignInAccount(iF0, strY, strY2, strY3, strY4, uri, strY5, jH0, strY6, arrayListC, strY7, strY8);
            case 1:
                int iO02 = v0.o0(parcel);
                ArrayList arrayListC2 = null;
                ArrayList arrayListC3 = null;
                Account account = null;
                String strY9 = null;
                String strY10 = null;
                String strY11 = null;
                int iF02 = 0;
                boolean Z10 = false;
                boolean Z11 = false;
                boolean Z12 = false;
                while (parcel.dataPosition() < iO02) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iF02 = v0.f0(i10, parcel);
                            break;
                        case 2:
                            arrayListC3 = v0.C(parcel, i10, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) v0.x(parcel, i10, Account.CREATOR);
                            break;
                        case 4:
                            Z10 = v0.Z(i10, parcel);
                            break;
                        case 5:
                            Z11 = v0.Z(i10, parcel);
                            break;
                        case 6:
                            Z12 = v0.Z(i10, parcel);
                            break;
                        case 7:
                            strY9 = v0.y(i10, parcel);
                            break;
                        case '\b':
                            strY10 = v0.y(i10, parcel);
                            break;
                        case '\t':
                            arrayListC2 = v0.C(parcel, i10, C1518a.CREATOR);
                            break;
                        case '\n':
                            strY11 = v0.y(i10, parcel);
                            break;
                        default:
                            v0.m0(i10, parcel);
                            break;
                    }
                }
                v0.D(iO02, parcel);
                return new GoogleSignInOptions(iF02, arrayListC3, account, Z10, Z11, Z12, strY9, strY10, GoogleSignInOptions.X(arrayListC2), strY11);
            default:
                int iO03 = v0.o0(parcel);
                String strY12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String strY13 = "";
                while (parcel.dataPosition() < iO03) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 4) {
                        strY12 = v0.y(i11, parcel);
                    } else if (c10 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) v0.x(parcel, i11, GoogleSignInAccount.CREATOR);
                    } else if (c10 != '\b') {
                        v0.m0(i11, parcel);
                    } else {
                        strY13 = v0.y(i11, parcel);
                    }
                }
                v0.D(iO03, parcel);
                return new SignInAccount(strY12, googleSignInAccount, strY13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        switch (this.f17396a) {
            case 0:
                return new GoogleSignInAccount[i5];
            case 1:
                return new GoogleSignInOptions[i5];
            default:
                return new SignInAccount[i5];
        }
    }
}
