package A7;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import com.google.android.gms.internal.measurement.zznr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n7.AbstractC3598c;
import n7.C3597b;

/* renamed from: A7.s0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class BinderC0287s0 extends zzbx implements F {

    /* renamed from: a, reason: collision with root package name */
    public final L1 f1045a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f1046b;

    /* renamed from: c, reason: collision with root package name */
    public String f1047c;

    public BinderC0287s0(L1 l12) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        AbstractC1732v.i(l12);
        this.f1045a = l12;
        this.f1047c = null;
    }

    @Override // A7.F
    public final List E(String str, String str2, N1 n12) {
        T(n12);
        String str3 = n12.f619a;
        AbstractC1732v.i(str3);
        L1 l12 = this.f1045a;
        try {
            return (List) l12.zzl().h0(new CallableC0302x0(this, str3, str, str2, 3)).get();
        } catch (InterruptedException | ExecutionException e7) {
            l12.zzj().f605f.d("Failed to get conditional user properties", e7);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // A7.F
    public final void H(N1 n12) {
        T(n12);
        U(new RunnableC0293u0(this, n12, 3));
    }

    @Override // A7.F
    public final void K(R1 r12, N1 n12) {
        AbstractC1732v.i(r12);
        T(n12);
        U(new RunnableC0299w0(this, r12, n12, 3));
    }

    @Override // A7.F
    public final void M(N1 n12) {
        AbstractC1732v.f(n12.f619a);
        AbstractC1732v.i(n12.f639v);
        RunnableC0293u0 runnableC0293u0 = new RunnableC0293u0(1);
        runnableC0293u0.f1076b = this;
        runnableC0293u0.f1077c = n12;
        R(runnableC0293u0);
    }

    @Override // A7.F
    public final void Q(N1 n12) {
        AbstractC1732v.f(n12.f619a);
        AbstractC1732v.i(n12.f639v);
        RunnableC0293u0 runnableC0293u0 = new RunnableC0293u0(0);
        runnableC0293u0.f1076b = this;
        runnableC0293u0.f1077c = n12;
        R(runnableC0293u0);
    }

    public final void R(Runnable runnable) {
        L1 l12 = this.f1045a;
        if (l12.zzl().o0()) {
            runnable.run();
        } else {
            l12.zzl().n0(runnable);
        }
    }

    public final void S(String str, boolean z2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        L1 l12 = this.f1045a;
        if (zIsEmpty) {
            l12.zzj().f605f.c("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z2) {
            try {
                if (this.f1046b == null) {
                    this.f1046b = Boolean.valueOf("com.google.android.gms".equals(this.f1047c) || AbstractC3598c.j(l12.f577l.f973a, Binder.getCallingUid()) || d7.j.b(l12.f577l.f973a).e(Binder.getCallingUid()));
                }
                if (this.f1046b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e7) {
                l12.zzj().f605f.d("Measurement Service called with invalid calling package. appId", N.h0(str));
                throw e7;
            }
        }
        if (this.f1047c == null) {
            Context context = l12.f577l.f973a;
            int callingUid = Binder.getCallingUid();
            int i5 = d7.i.f34135e;
            if (AbstractC3598c.n(context, callingUid, str)) {
                this.f1047c = str;
            }
        }
        if (str.equals(this.f1047c)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void T(N1 n12) {
        AbstractC1732v.i(n12);
        String str = n12.f619a;
        AbstractC1732v.f(str);
        S(str, false);
        this.f1045a.Y().P0(n12.f620b, n12.f634q);
    }

    public final void U(Runnable runnable) {
        L1 l12 = this.f1045a;
        if (l12.zzl().o0()) {
            runnable.run();
        } else {
            l12.zzl().m0(runnable);
        }
    }

    public final void V(C0301x c0301x, N1 n12) throws IOException {
        L1 l12 = this.f1045a;
        l12.Z();
        l12.j(c0301x, n12);
    }

    @Override // A7.F
    public final List a(N1 n12, Bundle bundle) {
        T(n12);
        String str = n12.f619a;
        AbstractC1732v.i(str);
        L1 l12 = this.f1045a;
        try {
            return (List) l12.zzl().h0(new CallableC0308z0(this, n12, bundle, 0)).get();
        } catch (InterruptedException | ExecutionException e7) {
            N nZzj = l12.zzj();
            nZzj.f605f.b(N.h0(str), "Failed to get trigger URIs. appId", e7);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // A7.F
    public final void b(N1 n12) {
        T(n12);
        U(new RunnableC0293u0(this, n12, 2));
    }

    @Override // A7.F
    public final void c(N1 n12) {
        T(n12);
        U(new RunnableC0293u0(this, n12, 4));
    }

    @Override // A7.F
    public final List d(String str, String str2, String str3, boolean z2) {
        S(str, true);
        L1 l12 = this.f1045a;
        try {
            List<T1> list = (List) l12.zzl().h0(new CallableC0302x0(this, str, str2, str3, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (T1 t12 : list) {
                if (z2 || !U1.j1(t12.f703c)) {
                    arrayList.add(new R1(t12));
                }
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            Object obj = e;
            N nZzj = l12.zzj();
            nZzj.f605f.b(N.h0(str), "Failed to get user properties as. appId", obj);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e10) {
            e = e10;
            Object obj2 = e;
            N nZzj2 = l12.zzj();
            nZzj2.f605f.b(N.h0(str), "Failed to get user properties as. appId", obj2);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // A7.F
    public final void f(N1 n12) {
        AbstractC1732v.f(n12.f619a);
        AbstractC1732v.i(n12.f639v);
        R(new RunnableC0293u0(this, n12, 5));
    }

    @Override // A7.F
    public final void g(N1 n12) {
        AbstractC1732v.f(n12.f619a);
        S(n12.f619a, false);
        U(new RunnableC0293u0(this, n12, 6));
    }

    @Override // A7.F
    public final void h(long j8, String str, String str2, String str3) {
        U(new RunnableC0296v0(this, str2, str3, str, j8, 0));
    }

    @Override // A7.F
    public final List i(String str, String str2, String str3) {
        S(str, true);
        L1 l12 = this.f1045a;
        try {
            return (List) l12.zzl().h0(new CallableC0302x0(this, str, str2, str3, 2)).get();
        } catch (InterruptedException | ExecutionException e7) {
            l12.zzj().f605f.d("Failed to get conditional user properties as", e7);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // A7.F
    public final List j(String str, String str2, boolean z2, N1 n12) {
        T(n12);
        String str3 = n12.f619a;
        AbstractC1732v.i(str3);
        L1 l12 = this.f1045a;
        try {
            List<T1> list = (List) l12.zzl().h0(new CallableC0302x0(this, str3, str, str2, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (T1 t12 : list) {
                if (z2 || !U1.j1(t12.f703c)) {
                    arrayList.add(new R1(t12));
                }
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            Object obj = e;
            N nZzj = l12.zzj();
            nZzj.f605f.b(N.h0(str3), "Failed to query user properties. appId", obj);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e10) {
            e = e10;
            Object obj2 = e;
            N nZzj2 = l12.zzj();
            nZzj2.f605f.b(N.h0(str3), "Failed to query user properties. appId", obj2);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // A7.F
    public final void l(C0242d c0242d, N1 n12) {
        AbstractC1732v.i(c0242d);
        AbstractC1732v.i(c0242d.f835c);
        T(n12);
        C0242d c0242d2 = new C0242d(c0242d);
        c0242d2.f833a = n12.f619a;
        U(new RunnableC0299w0(this, c0242d2, n12, 0));
    }

    @Override // A7.F
    public final String o(N1 n12) {
        T(n12);
        L1 l12 = this.f1045a;
        try {
            return (String) l12.zzl().h0(new CallableC0305y0(2, l12, n12)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            N nZzj = l12.zzj();
            nZzj.f605f.b(N.h0(n12.f619a), "Failed to get app instance id. appId", e7);
            return null;
        }
    }

    @Override // A7.F
    public final C0251g r(N1 n12) {
        T(n12);
        String str = n12.f619a;
        AbstractC1732v.f(str);
        L1 l12 = this.f1045a;
        try {
            return (C0251g) l12.zzl().l0(new CallableC0305y0(0, this, n12)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            N nZzj = l12.zzj();
            nZzj.f605f.b(N.h0(str), "Failed to get consent. appId", e7);
            return new C0251g(null);
        }
    }

    @Override // A7.F
    public final void s(C0301x c0301x, N1 n12) {
        AbstractC1732v.i(c0301x);
        T(n12);
        U(new RunnableC0299w0(this, c0301x, n12, 1));
    }

    @Override // A7.F
    public final byte[] w(C0301x c0301x, String str) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(c0301x);
        S(str, true);
        L1 l12 = this.f1045a;
        N nZzj = l12.zzj();
        C0273n0 c0273n0 = l12.f577l;
        J j8 = c0273n0.f984m;
        String str2 = c0301x.f1103a;
        nZzj.f611m.d("Log and bundle. event", j8.c(str2));
        ((C3597b) l12.zzb()).getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) l12.zzl().l0(new CallableC0255h0(this, c0301x, str)).get();
            if (bArr == null) {
                l12.zzj().f605f.d("Log and bundle returned null. appId", N.h0(str));
                bArr = new byte[0];
            }
            ((C3597b) l12.zzb()).getClass();
            l12.zzj().f611m.a(c0273n0.f984m.c(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime), "Log and bundle processed. event, size, time_ms");
            return bArr;
        } catch (InterruptedException e7) {
            e = e7;
            N nZzj2 = l12.zzj();
            nZzj2.f605f.a(N.h0(str), c0273n0.f984m.c(str2), e, "Failed to log and bundle. appId, event, error");
            return null;
        } catch (ExecutionException e10) {
            e = e10;
            N nZzj22 = l12.zzj();
            nZzj22.f605f.a(N.h0(str), c0273n0.f984m.c(str2), e, "Failed to log and bundle. appId, event, error");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean zza(int i5, Parcel parcel, Parcel parcel2, int i10) {
        ArrayList arrayList = null;
        L1 l12 = this.f1045a;
        switch (i5) {
            case 1:
                C0301x c0301x = (C0301x) zzbw.zza(parcel, C0301x.CREATOR);
                N1 n12 = (N1) zzbw.zza(parcel, N1.CREATOR);
                zzbw.zzb(parcel);
                s(c0301x, n12);
                parcel2.writeNoException();
                return true;
            case 2:
                R1 r12 = (R1) zzbw.zza(parcel, R1.CREATOR);
                N1 n13 = (N1) zzbw.zza(parcel, N1.CREATOR);
                zzbw.zzb(parcel);
                K(r12, n13);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                N1 n14 = (N1) zzbw.zza(parcel, N1.CREATOR);
                zzbw.zzb(parcel);
                b(n14);
                parcel2.writeNoException();
                return true;
            case 5:
                C0301x c0301x2 = (C0301x) zzbw.zza(parcel, C0301x.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                zzbw.zzb(parcel);
                AbstractC1732v.i(c0301x2);
                AbstractC1732v.f(string);
                S(string, true);
                U(new RunnableC0299w0(this, c0301x2, string, 2));
                parcel2.writeNoException();
                return true;
            case 6:
                N1 n15 = (N1) zzbw.zza(parcel, N1.CREATOR);
                zzbw.zzb(parcel);
                H(n15);
                parcel2.writeNoException();
                return true;
            case 7:
                N1 n16 = (N1) zzbw.zza(parcel, N1.CREATOR);
                boolean zZzc = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                T(n16);
                String str = n16.f619a;
                AbstractC1732v.i(str);
                try {
                    List<T1> list = (List) l12.zzl().h0(new CallableC0305y0(1, this, str)).get();
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (T1 t12 : list) {
                        if (zZzc || !U1.j1(t12.f703c)) {
                            arrayList2.add(new R1(t12));
                        }
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e7) {
                    e = e7;
                    N nZzj = l12.zzj();
                    nZzj.f605f.b(N.h0(str), "Failed to get user properties. appId", e);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e10) {
                    e = e10;
                    N nZzj2 = l12.zzj();
                    nZzj2.f605f.b(N.h0(str), "Failed to get user properties. appId", e);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                C0301x c0301x3 = (C0301x) zzbw.zza(parcel, C0301x.CREATOR);
                String string2 = parcel.readString();
                zzbw.zzb(parcel);
                byte[] bArrW = w(c0301x3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrW);
                return true;
            case 10:
                long j8 = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                zzbw.zzb(parcel);
                h(j8, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                N1 n17 = (N1) zzbw.zza(parcel, N1.CREATOR);
                zzbw.zzb(parcel);
                String strO = o(n17);
                parcel2.writeNoException();
                parcel2.writeString(strO);
                break;
            case 12:
                C0242d c0242d = (C0242d) zzbw.zza(parcel, C0242d.CREATOR);
                N1 n18 = (N1) zzbw.zza(parcel, N1.CREATOR);
                zzbw.zzb(parcel);
                l(c0242d, n18);
                parcel2.writeNoException();
                break;
            case 13:
                C0242d c0242d2 = (C0242d) zzbw.zza(parcel, C0242d.CREATOR);
                zzbw.zzb(parcel);
                AbstractC1732v.i(c0242d2);
                AbstractC1732v.i(c0242d2.f835c);
                AbstractC1732v.f(c0242d2.f833a);
                S(c0242d2.f833a, true);
                U(new RunnableC0278p(3, this, new C0242d(c0242d2)));
                parcel2.writeNoException();
                break;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                boolean zZzc2 = zzbw.zzc(parcel);
                N1 n19 = (N1) zzbw.zza(parcel, N1.CREATOR);
                zzbw.zzb(parcel);
                List listJ = j(string6, string7, zZzc2, n19);
                parcel2.writeNoException();
                parcel2.writeTypedList(listJ);
                break;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                boolean zZzc3 = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                List listD = d(string8, string9, string10, zZzc3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listD);
                break;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                N1 n110 = (N1) zzbw.zza(parcel, N1.CREATOR);
                zzbw.zzb(parcel);
                List listE = E(string11, string12, n110);
                parcel2.writeNoException();
                parcel2.writeTypedList(listE);
                break;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                zzbw.zzb(parcel);
                List listI = i(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listI);
                break;
            case 18:
                N1 n111 = (N1) zzbw.zza(parcel, N1.CREATOR);
                zzbw.zzb(parcel);
                g(n111);
                parcel2.writeNoException();
                break;
            case 19:
                Bundle bundle = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                N1 n112 = (N1) zzbw.zza(parcel, N1.CREATOR);
                zzbw.zzb(parcel);
                mo2a(n112, bundle);
                parcel2.writeNoException();
                break;
            case 20:
                N1 n113 = (N1) zzbw.zza(parcel, N1.CREATOR);
                zzbw.zzb(parcel);
                f(n113);
                parcel2.writeNoException();
                break;
            case 21:
                N1 n114 = (N1) zzbw.zza(parcel, N1.CREATOR);
                zzbw.zzb(parcel);
                C0251g c0251gR = r(n114);
                parcel2.writeNoException();
                zzbw.zzb(parcel2, c0251gR);
                break;
            case 24:
                N1 n115 = (N1) zzbw.zza(parcel, N1.CREATOR);
                Bundle bundle2 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                zzbw.zzb(parcel);
                List listA = a(n115, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listA);
                break;
            case 25:
                N1 n116 = (N1) zzbw.zza(parcel, N1.CREATOR);
                zzbw.zzb(parcel);
                Q(n116);
                parcel2.writeNoException();
                break;
            case 26:
                N1 n117 = (N1) zzbw.zza(parcel, N1.CREATOR);
                zzbw.zzb(parcel);
                M(n117);
                parcel2.writeNoException();
                break;
            case 27:
                N1 n118 = (N1) zzbw.zza(parcel, N1.CREATOR);
                zzbw.zzb(parcel);
                c(n118);
                parcel2.writeNoException();
                break;
            case 28:
                Bundle bundle3 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                N1 n119 = (N1) zzbw.zza(parcel, N1.CREATOR);
                zzbw.zzb(parcel);
                if (zznr.zza() && l12.O().o0(null, AbstractC0304y.f1185g1)) {
                    T(n119);
                    String str2 = n119.f619a;
                    AbstractC1732v.i(str2);
                    RunnableC0290t0 runnableC0290t0 = new RunnableC0290t0(0);
                    runnableC0290t0.f1062b = this;
                    runnableC0290t0.f1063c = bundle3;
                    runnableC0290t0.f1064d = str2;
                    U(runnableC0290t0);
                }
                parcel2.writeNoException();
                break;
        }
        return true;
    }

    @Override // A7.F
    /* renamed from: a */
    public final void mo2a(N1 n12, Bundle bundle) {
        T(n12);
        String str = n12.f619a;
        AbstractC1732v.i(str);
        RunnableC0290t0 runnableC0290t0 = new RunnableC0290t0(1);
        runnableC0290t0.f1062b = this;
        runnableC0290t0.f1063c = bundle;
        runnableC0290t0.f1064d = str;
        U(runnableC0290t0);
    }
}
