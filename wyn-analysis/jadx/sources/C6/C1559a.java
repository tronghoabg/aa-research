package c6;

import U8.v0;
import a.AbstractC1304a;
import android.accounts.Account;
import android.app.PendingIntent;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C1718g;
import com.google.android.gms.common.internal.C1721j;
import com.google.android.gms.common.internal.C1722k;
import com.google.android.gms.common.internal.C1730t;
import com.google.android.gms.common.internal.C1734x;
import com.google.android.gms.common.internal.C1735y;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.F;
import com.google.android.gms.common.internal.T;
import com.google.android.material.datepicker.n;
import d.BinderC2380c;
import d.C2378a;
import d.C2381d;
import d.InterfaceC2379b;
import d6.C2388a;
import d6.C2392e;
import d6.C2393f;
import d6.C2396i;
import d6.C2397j;
import d7.s;
import d7.t;
import d7.u;
import e6.C2473a;
import java.util.ArrayList;

/* renamed from: c6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1559a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19654a;

    public /* synthetic */ C1559a(int i5) {
        this.f19654a = i5;
    }

    public static void a(C1722k c1722k, Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(c1722k.f26660a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(c1722k.f26661b);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(c1722k.f26662c);
        AbstractC1304a.a0(parcel, 4, c1722k.f26663d, false);
        AbstractC1304a.V(parcel, 5, c1722k.f26664e);
        AbstractC1304a.d0(parcel, 6, c1722k.f26665f, i5);
        AbstractC1304a.S(parcel, 7, c1722k.f26666g, false);
        AbstractC1304a.Z(parcel, 8, c1722k.f26667h, i5, false);
        AbstractC1304a.d0(parcel, 10, c1722k.f26668i, i5);
        AbstractC1304a.d0(parcel, 11, c1722k.f26669j, i5);
        AbstractC1304a.k0(parcel, 12, 4);
        parcel.writeInt(c1722k.k ? 1 : 0);
        AbstractC1304a.k0(parcel, 13, 4);
        parcel.writeInt(c1722k.f26670l);
        boolean z2 = c1722k.f26671m;
        AbstractC1304a.k0(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC1304a.a0(parcel, 15, c1722k.f26672n, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iF0 = 0;
        boolean Z10 = false;
        int iF02 = 0;
        int iF03 = 0;
        int iF04 = 0;
        String strY = null;
        String strY2 = null;
        InterfaceC2379b interfaceC2379b = null;
        Bundle bundleQ = null;
        Account account = null;
        ArrayList arrayListC = null;
        switch (this.f19654a) {
            case 0:
                return new C1560b(parcel);
            case 1:
                return new C1561c(parcel);
            case 2:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, C1562d.class.getClassLoader());
                return new C1563e(arrayList);
            case 3:
                return new C1562d(parcel.readLong(), parcel.readLong(), parcel.readInt());
            case 4:
                return new C1564f(parcel);
            case 5:
                int iO0 = v0.o0(parcel);
                while (parcel.dataPosition() < iO0) {
                    int i5 = parcel.readInt();
                    char c10 = (char) i5;
                    if (c10 == 1) {
                        iF0 = v0.f0(i5, parcel);
                    } else if (c10 != 2) {
                        v0.m0(i5, parcel);
                    } else {
                        strY = v0.y(i5, parcel);
                    }
                }
                v0.D(iO0, parcel);
                return new C1718g(iF0, strY);
            case 6:
                int iO02 = v0.o0(parcel);
                while (parcel.dataPosition() < iO02) {
                    int i10 = parcel.readInt();
                    char c11 = (char) i10;
                    if (c11 == 1) {
                        iF04 = v0.f0(i10, parcel);
                    } else if (c11 != 2) {
                        v0.m0(i10, parcel);
                    } else {
                        arrayListC = v0.C(parcel, i10, C1730t.CREATOR);
                    }
                }
                v0.D(iO02, parcel);
                return new C1735y(iF04, arrayListC);
            case 7:
                int iO03 = v0.o0(parcel);
                int iF05 = -1;
                long jH0 = 0;
                long jH02 = 0;
                int iF06 = 0;
                int iF07 = 0;
                int iF08 = 0;
                int iF09 = 0;
                String strY3 = null;
                String strY4 = null;
                while (parcel.dataPosition() < iO03) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iF06 = v0.f0(i11, parcel);
                            break;
                        case 2:
                            iF07 = v0.f0(i11, parcel);
                            break;
                        case 3:
                            iF08 = v0.f0(i11, parcel);
                            break;
                        case 4:
                            jH0 = v0.h0(i11, parcel);
                            break;
                        case 5:
                            jH02 = v0.h0(i11, parcel);
                            break;
                        case 6:
                            strY3 = v0.y(i11, parcel);
                            break;
                        case 7:
                            strY4 = v0.y(i11, parcel);
                            break;
                        case '\b':
                            iF09 = v0.f0(i11, parcel);
                            break;
                        case '\t':
                            iF05 = v0.f0(i11, parcel);
                            break;
                        default:
                            v0.m0(i11, parcel);
                            break;
                    }
                }
                v0.D(iO03, parcel);
                return new C1730t(iF06, iF07, iF08, jH0, jH02, strY3, strY4, iF09, iF05);
            case 8:
                int iO04 = v0.o0(parcel);
                int iF010 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iO04) {
                    int i12 = parcel.readInt();
                    char c12 = (char) i12;
                    if (c12 == 1) {
                        iF03 = v0.f0(i12, parcel);
                    } else if (c12 == 2) {
                        account = (Account) v0.x(parcel, i12, Account.CREATOR);
                    } else if (c12 == 3) {
                        iF010 = v0.f0(i12, parcel);
                    } else if (c12 != 4) {
                        v0.m0(i12, parcel);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) v0.x(parcel, i12, GoogleSignInAccount.CREATOR);
                    }
                }
                v0.D(iO04, parcel);
                return new E(iF03, account, iF010, googleSignInAccount);
            case 9:
                int iO05 = v0.o0(parcel);
                int iF011 = 0;
                boolean Z11 = false;
                boolean Z12 = false;
                IBinder iBinderE0 = null;
                d7.b bVar = null;
                while (parcel.dataPosition() < iO05) {
                    int i13 = parcel.readInt();
                    char c13 = (char) i13;
                    if (c13 == 1) {
                        iF011 = v0.f0(i13, parcel);
                    } else if (c13 == 2) {
                        iBinderE0 = v0.e0(i13, parcel);
                    } else if (c13 == 3) {
                        bVar = (d7.b) v0.x(parcel, i13, d7.b.CREATOR);
                    } else if (c13 == 4) {
                        Z11 = v0.Z(i13, parcel);
                    } else if (c13 != 5) {
                        v0.m0(i13, parcel);
                    } else {
                        Z12 = v0.Z(i13, parcel);
                    }
                }
                v0.D(iO05, parcel);
                return new F(iF011, iBinderE0, bVar, Z11, Z12);
            case 10:
                int iO06 = v0.o0(parcel);
                int iF012 = 0;
                int iF013 = 0;
                int iF014 = 0;
                boolean Z13 = false;
                boolean Z14 = false;
                while (parcel.dataPosition() < iO06) {
                    int i14 = parcel.readInt();
                    char c14 = (char) i14;
                    if (c14 == 1) {
                        iF012 = v0.f0(i14, parcel);
                    } else if (c14 == 2) {
                        Z13 = v0.Z(i14, parcel);
                    } else if (c14 == 3) {
                        Z14 = v0.Z(i14, parcel);
                    } else if (c14 == 4) {
                        iF013 = v0.f0(i14, parcel);
                    } else if (c14 != 5) {
                        v0.m0(i14, parcel);
                    } else {
                        iF014 = v0.f0(i14, parcel);
                    }
                }
                v0.D(iO06, parcel);
                return new C1734x(iF012, iF013, iF014, Z13, Z14);
            case 11:
                int iO07 = v0.o0(parcel);
                d7.d[] dVarArr = null;
                C1721j c1721j = null;
                while (parcel.dataPosition() < iO07) {
                    int i15 = parcel.readInt();
                    char c15 = (char) i15;
                    if (c15 == 1) {
                        bundleQ = v0.q(i15, parcel);
                    } else if (c15 == 2) {
                        dVarArr = (d7.d[]) v0.B(parcel, i15, d7.d.CREATOR);
                    } else if (c15 == 3) {
                        iF02 = v0.f0(i15, parcel);
                    } else if (c15 != 4) {
                        v0.m0(i15, parcel);
                    } else {
                        c1721j = (C1721j) v0.x(parcel, i15, C1721j.CREATOR);
                    }
                }
                v0.D(iO07, parcel);
                T t10 = new T();
                t10.f26614a = bundleQ;
                t10.f26615b = dVarArr;
                t10.f26616c = iF02;
                t10.f26617d = c1721j;
                return t10;
            case 12:
                int iO08 = v0.o0(parcel);
                boolean Z15 = false;
                boolean Z16 = false;
                int iF015 = 0;
                C1734x c1734x = null;
                int[] iArrT = null;
                int[] iArrT2 = null;
                while (parcel.dataPosition() < iO08) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            c1734x = (C1734x) v0.x(parcel, i16, C1734x.CREATOR);
                            break;
                        case 2:
                            Z15 = v0.Z(i16, parcel);
                            break;
                        case 3:
                            Z16 = v0.Z(i16, parcel);
                            break;
                        case 4:
                            iArrT = v0.t(i16, parcel);
                            break;
                        case 5:
                            iF015 = v0.f0(i16, parcel);
                            break;
                        case 6:
                            iArrT2 = v0.t(i16, parcel);
                            break;
                        default:
                            v0.m0(i16, parcel);
                            break;
                    }
                }
                v0.D(iO08, parcel);
                return new C1721j(c1734x, Z15, Z16, iArrT, iF015, iArrT2);
            case 13:
                int iO09 = v0.o0(parcel);
                Scope[] scopeArr = C1722k.f26658o;
                Bundle bundle = new Bundle();
                d7.d[] dVarArr2 = C1722k.f26659p;
                d7.d[] dVarArr3 = dVarArr2;
                int iF016 = 0;
                int iF017 = 0;
                int iF018 = 0;
                boolean Z17 = false;
                int iF019 = 0;
                boolean Z18 = false;
                String strY5 = null;
                IBinder iBinderE02 = null;
                Account account2 = null;
                String strY6 = null;
                while (parcel.dataPosition() < iO09) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            iF016 = v0.f0(i17, parcel);
                            break;
                        case 2:
                            iF017 = v0.f0(i17, parcel);
                            break;
                        case 3:
                            iF018 = v0.f0(i17, parcel);
                            break;
                        case 4:
                            strY5 = v0.y(i17, parcel);
                            break;
                        case 5:
                            iBinderE02 = v0.e0(i17, parcel);
                            break;
                        case 6:
                            scopeArr = (Scope[]) v0.B(parcel, i17, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = v0.q(i17, parcel);
                            break;
                        case '\b':
                            account2 = (Account) v0.x(parcel, i17, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            v0.m0(i17, parcel);
                            break;
                        case '\n':
                            dVarArr2 = (d7.d[]) v0.B(parcel, i17, d7.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (d7.d[]) v0.B(parcel, i17, d7.d.CREATOR);
                            break;
                        case '\f':
                            Z17 = v0.Z(i17, parcel);
                            break;
                        case '\r':
                            iF019 = v0.f0(i17, parcel);
                            break;
                        case 14:
                            Z18 = v0.Z(i17, parcel);
                            break;
                        case 15:
                            strY6 = v0.y(i17, parcel);
                            break;
                    }
                }
                v0.D(iO09, parcel);
                return new C1722k(iF016, iF017, iF018, strY5, iBinderE02, scopeArr, bundle, account2, dVarArr2, dVarArr3, Z17, iF019, Z18, strY6);
            case 14:
                return new com.google.android.material.datepicker.b((n) parcel.readParcelable(n.class.getClassLoader()), (n) parcel.readParcelable(n.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (n) parcel.readParcelable(n.class.getClassLoader()), parcel.readInt());
            case 15:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 16:
                return n.c(parcel.readInt(), parcel.readInt());
            case 17:
                C2381d c2381d = new C2381d();
                IBinder strongBinder = parcel.readStrongBinder();
                int i18 = BinderC2380c.f33922b;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC2379b.f33921Y8);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC2379b)) {
                        C2378a c2378a = new C2378a();
                        c2378a.f33920a = strongBinder;
                        interfaceC2379b = c2378a;
                    } else {
                        interfaceC2379b = (InterfaceC2379b) iInterfaceQueryLocalInterface;
                    }
                }
                c2381d.f33924a = interfaceC2379b;
                return c2381d;
            case 18:
                return new C2388a(parcel);
            case 19:
                return new C2392e(parcel);
            case 20:
                return new C2393f();
            case 21:
                return new C2396i(parcel);
            case 22:
                return new C2397j(parcel.readLong(), parcel.readLong());
            case 23:
                int iO010 = v0.o0(parcel);
                int iF020 = 0;
                int iF021 = 0;
                PendingIntent pendingIntent = null;
                String strY7 = null;
                Integer numG0 = null;
                while (parcel.dataPosition() < iO010) {
                    int i19 = parcel.readInt();
                    char c16 = (char) i19;
                    if (c16 == 1) {
                        iF020 = v0.f0(i19, parcel);
                    } else if (c16 == 2) {
                        iF021 = v0.f0(i19, parcel);
                    } else if (c16 == 3) {
                        pendingIntent = (PendingIntent) v0.x(parcel, i19, PendingIntent.CREATOR);
                    } else if (c16 == 4) {
                        strY7 = v0.y(i19, parcel);
                    } else if (c16 != 5) {
                        v0.m0(i19, parcel);
                    } else {
                        numG0 = v0.g0(i19, parcel);
                    }
                }
                v0.D(iO010, parcel);
                return new d7.b(iF020, iF021, pendingIntent, strY7, numG0);
            case 24:
                int iO011 = v0.o0(parcel);
                long jH03 = -1;
                int iF022 = 0;
                boolean Z19 = false;
                String strY8 = null;
                while (parcel.dataPosition() < iO011) {
                    int i20 = parcel.readInt();
                    char c17 = (char) i20;
                    if (c17 == 1) {
                        strY8 = v0.y(i20, parcel);
                    } else if (c17 == 2) {
                        iF022 = v0.f0(i20, parcel);
                    } else if (c17 == 3) {
                        jH03 = v0.h0(i20, parcel);
                    } else if (c17 != 4) {
                        v0.m0(i20, parcel);
                    } else {
                        Z19 = v0.Z(i20, parcel);
                    }
                }
                v0.D(iO011, parcel);
                return new d7.d(iF022, jH03, strY8, Z19);
            case 25:
                int iO012 = v0.o0(parcel);
                boolean Z20 = false;
                boolean Z21 = false;
                boolean Z22 = false;
                boolean Z23 = false;
                boolean Z24 = false;
                String strY9 = null;
                IBinder iBinderE03 = null;
                while (parcel.dataPosition() < iO012) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            strY9 = v0.y(i21, parcel);
                            break;
                        case 2:
                            Z20 = v0.Z(i21, parcel);
                            break;
                        case 3:
                            Z21 = v0.Z(i21, parcel);
                            break;
                        case 4:
                            iBinderE03 = v0.e0(i21, parcel);
                            break;
                        case 5:
                            Z22 = v0.Z(i21, parcel);
                            break;
                        case 6:
                            Z23 = v0.Z(i21, parcel);
                            break;
                        case 7:
                        default:
                            v0.m0(i21, parcel);
                            break;
                        case '\b':
                            Z24 = v0.Z(i21, parcel);
                            break;
                    }
                }
                v0.D(iO012, parcel);
                return new s(strY9, Z20, Z21, iBinderE03, Z22, Z23, Z24);
            case 26:
                int iO013 = v0.o0(parcel);
                long jH04 = -1;
                boolean Z25 = false;
                int iF023 = 0;
                int iF024 = 0;
                String strY10 = null;
                while (parcel.dataPosition() < iO013) {
                    int i22 = parcel.readInt();
                    char c18 = (char) i22;
                    if (c18 == 1) {
                        Z25 = v0.Z(i22, parcel);
                    } else if (c18 == 2) {
                        strY10 = v0.y(i22, parcel);
                    } else if (c18 == 3) {
                        iF023 = v0.f0(i22, parcel);
                    } else if (c18 == 4) {
                        iF024 = v0.f0(i22, parcel);
                    } else if (c18 != 5) {
                        v0.m0(i22, parcel);
                    } else {
                        jH04 = v0.h0(i22, parcel);
                    }
                }
                v0.D(iO013, parcel);
                return new t(Z25, strY10, iF023, iF024, jH04);
            case 27:
                int iO014 = v0.o0(parcel);
                boolean Z26 = false;
                IBinder iBinderE04 = null;
                while (parcel.dataPosition() < iO014) {
                    int i23 = parcel.readInt();
                    char c19 = (char) i23;
                    if (c19 == 1) {
                        strY2 = v0.y(i23, parcel);
                    } else if (c19 == 2) {
                        iBinderE04 = v0.e0(i23, parcel);
                    } else if (c19 == 3) {
                        Z10 = v0.Z(i23, parcel);
                    } else if (c19 != 4) {
                        v0.m0(i23, parcel);
                    } else {
                        Z26 = v0.Z(i23, parcel);
                    }
                }
                v0.D(iO014, parcel);
                return new u(strY2, iBinderE04, Z10, Z26);
            case 28:
                return new C2473a(parcel);
            default:
                int iO015 = v0.o0(parcel);
                int iF025 = 0;
                int iF026 = 0;
                String[] strArrZ = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundleQ2 = null;
                while (parcel.dataPosition() < iO015) {
                    int i24 = parcel.readInt();
                    char c20 = (char) i24;
                    if (c20 == 1) {
                        strArrZ = v0.z(i24, parcel);
                    } else if (c20 == 2) {
                        cursorWindowArr = (CursorWindow[]) v0.B(parcel, i24, CursorWindow.CREATOR);
                    } else if (c20 == 3) {
                        iF026 = v0.f0(i24, parcel);
                    } else if (c20 == 4) {
                        bundleQ2 = v0.q(i24, parcel);
                    } else if (c20 != 1000) {
                        v0.m0(i24, parcel);
                    } else {
                        iF025 = v0.f0(i24, parcel);
                    }
                }
                v0.D(iO015, parcel);
                DataHolder dataHolder = new DataHolder(iF025, strArrZ, cursorWindowArr, iF026, bundleQ2);
                dataHolder.f26571c = new Bundle();
                int i25 = 0;
                while (true) {
                    String[] strArr = dataHolder.f26570b;
                    if (i25 >= strArr.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.f26572d;
                        dataHolder.f26575g = new int[cursorWindowArr2.length];
                        int numRows = 0;
                        for (int i26 = 0; i26 < cursorWindowArr2.length; i26++) {
                            dataHolder.f26575g[i26] = numRows;
                            numRows += cursorWindowArr2[i26].getNumRows() - (numRows - cursorWindowArr2[i26].getStartPosition());
                        }
                        return dataHolder;
                    }
                    dataHolder.f26571c.putInt(strArr[i25], i25);
                    i25++;
                }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f19654a) {
            case 0:
                return new C1560b[i5];
            case 1:
                return new C1561c[i5];
            case 2:
                return new C1563e[i5];
            case 3:
                return new C1562d[i5];
            case 4:
                return new C1564f[i5];
            case 5:
                return new C1718g[i5];
            case 6:
                return new C1735y[i5];
            case 7:
                return new C1730t[i5];
            case 8:
                return new E[i5];
            case 9:
                return new F[i5];
            case 10:
                return new C1734x[i5];
            case 11:
                return new T[i5];
            case 12:
                return new C1721j[i5];
            case 13:
                return new C1722k[i5];
            case 14:
                return new com.google.android.material.datepicker.b[i5];
            case 15:
                return new com.google.android.material.datepicker.d[i5];
            case 16:
                return new n[i5];
            case 17:
                return new C2381d[i5];
            case 18:
                return new C2388a[i5];
            case 19:
                return new C2392e[i5];
            case 20:
                return new C2393f[i5];
            case 21:
                return new C2396i[i5];
            case 22:
                return new C2397j[i5];
            case 23:
                return new d7.b[i5];
            case 24:
                return new d7.d[i5];
            case 25:
                return new s[i5];
            case 26:
                return new t[i5];
            case 27:
                return new u[i5];
            case 28:
                return new C2473a[i5];
            default:
                return new DataHolder[i5];
        }
    }
}
