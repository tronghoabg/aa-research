package U8;

import B.C0310a;
import N.C0729i0;
import N.C0740o;
import U8.v0;
import Va.M6;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.activity.ComponentActivity;
import b1.AbstractC1492a;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.common.api.internal.C1701o;
import com.google.android.gms.common.api.internal.C1703q;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzbkt;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzcgb;
import com.unity3d.services.UnityAdsConstants;
import d0.C2384c;
import e0.C2465q;
import e0.InterfaceC2442E;
import ef.C2515C;
import ef.C2527k;
import f7.C2615b;
import ff.AbstractC2640A;
import ff.AbstractC2641B;
import g5.C2709f;
import h0.AbstractC2765c;
import h5.InterfaceC2781e;
import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.fork.ForkServer;
import vf.AbstractC4345a;
import x0.C4433c;
import x0.C4438h;

/* loaded from: classes4.dex */
public abstract class v0 implements InterfaceC2781e, k1.Y {
    public static ArrayList A(int i5, Parcel parcel) {
        int iK0 = k0(i5, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iK0 == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iK0);
        return arrayListCreateStringArrayList;
    }

    public static Object[] B(Parcel parcel, int i5, Parcelable.Creator creator) {
        int iK0 = k0(i5, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iK0 == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iK0);
        return objArrCreateTypedArray;
    }

    public static ArrayList C(Parcel parcel, int i5, Parcelable.Creator creator) {
        int iK0 = k0(i5, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iK0 == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iK0);
        return arrayListCreateTypedArrayList;
    }

    public static void D(int i5, Parcel parcel) {
        if (parcel.dataPosition() != i5) {
            throw new C2615b(N0.a.d(i5, "Overread allowed size end=", new StringBuilder(String.valueOf(i5).length() + 26)), parcel);
        }
    }

    public static final t0.t E(t0.t tVar, tf.l lVar) {
        AbstractC3340k.e(tVar, "<this>");
        if (((Boolean) lVar.invoke(tVar)).booleanValue()) {
            return tVar;
        }
        P.a aVarI = tVar.i();
        int i5 = aVarI.f8964a.f8972c;
        for (int i10 = 0; i10 < i5; i10++) {
            t0.t tVarE = E((t0.t) aVarI.get(i10), lVar);
            if (tVarE != null) {
                return tVarE;
            }
        }
        return null;
    }

    public static final void F(t0.t tVar, ArrayList arrayList) {
        ArrayList arrayListU0;
        AbstractC3340k.e(tVar, "<this>");
        if (tVar.r()) {
            ArrayList arrayList2 = new ArrayList();
            P.a aVarI = tVar.i();
            int i5 = aVarI.f8964a.f8972c;
            for (int i10 = 0; i10 < i5; i10++) {
                t0.t tVar2 = (t0.t) aVarI.get(i10);
                if (tVar2.r()) {
                    arrayList2.add(new C4433c(tVar, tVar2));
                }
            }
            try {
                C4433c.f47571e = 1;
                arrayListU0 = ff.o.U0(arrayList2);
                ff.s.c0(arrayListU0);
            } catch (IllegalArgumentException unused) {
                C4433c.f47571e = 2;
                arrayListU0 = ff.o.U0(arrayList2);
                ff.s.c0(arrayListU0);
            }
            ArrayList arrayList3 = new ArrayList(arrayListU0.size());
            int size = arrayListU0.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList3.add(((C4433c) arrayListU0.get(i11)).f47573b);
            }
            int size2 = arrayList3.size();
            for (int i12 = 0; i12 < size2; i12++) {
                t0.t tVar3 = (t0.t) arrayList3.get(i12);
                C4438h c4438hV = S3.f.v(tVar3);
                if (c4438hV != null) {
                    arrayList.add(c4438hV);
                } else {
                    F(tVar3, arrayList);
                }
            }
        }
    }

    public static final t0.y G(t0.t tVar) {
        t0.y yVar;
        AbstractC3340k.e(tVar, "<this>");
        C4438h c4438hU = S3.f.u(tVar);
        if (c4438hU == null) {
            c4438hU = S3.f.v(tVar);
        }
        return (c4438hU == null || (yVar = (t0.y) c4438hU.f15788b) == null) ? tVar.f45533x : yVar;
    }

    public static int I(int i5, View view) {
        Context context = view.getContext();
        TypedValue typedValueL = A6.h.L(view.getContext(), i5, view.getClass().getCanonicalName());
        int i10 = typedValueL.resourceId;
        return i10 != 0 ? Y0.e.getColor(context, i10) : typedValueL.data;
    }

    public static int J(Context context, int i5, int i10) {
        TypedValue typedValueJ = A6.h.J(context, i5);
        if (typedValueJ == null) {
            return i10;
        }
        int i11 = typedValueJ.resourceId;
        return i11 != 0 ? Y0.e.getColor(context, i11) : typedValueJ.data;
    }

    public static final int K(Cursor c10, String str) {
        String strA0;
        AbstractC3340k.e(c10, "c");
        int columnIndex = c10.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = c10.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = c10.getColumnNames();
                    AbstractC3340k.d(columnNames, "columnNames");
                    String strConcat = ".".concat(str);
                    String strF = AbstractC3256n.f('`', ".", str);
                    int length = columnNames.length;
                    int i5 = 0;
                    int i10 = 0;
                    while (i10 < length) {
                        String str2 = columnNames[i10];
                        int i11 = i5 + 1;
                        if (str2.length() >= str.length() + 2 && (Bf.r.b0(str2, strConcat, false) || (str2.charAt(0) == '`' && Bf.r.b0(str2, strF, false)))) {
                            columnIndex = i5;
                            break;
                        }
                        i10++;
                        i5 = i11;
                    }
                    columnIndex = -1;
                } else {
                    columnIndex = -1;
                }
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = c10.getColumnNames();
            AbstractC3340k.d(columnNames2, "c.columnNames");
            strA0 = ff.m.A0(columnNames2, null, null, null, null, 63);
        } catch (Exception e7) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e7);
            strA0 = "unknown";
        }
        throw new IllegalArgumentException(N0.a.h("column '", str, "' does not exist. Available columns: ", strA0));
    }

    public static int O(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    public static boolean P(int i5, Rect rect, Rect rect2) {
        if (i5 == 17) {
            int i10 = rect.right;
            int i11 = rect2.right;
            return (i10 > i11 || rect.left >= i11) && rect.left > rect2.left;
        }
        if (i5 == 33) {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            return (i12 > i13 || rect.top >= i13) && rect.top > rect2.top;
        }
        if (i5 == 66) {
            int i14 = rect.left;
            int i15 = rect2.left;
            return (i14 < i15 || rect.right <= i15) && rect.right < rect2.right;
        }
        if (i5 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i16 = rect.top;
        int i17 = rect2.top;
        return (i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom;
    }

    public static boolean Q(int i5) {
        if (i5 == 0) {
            return false;
        }
        ThreadLocal threadLocal = AbstractC1492a.f19119a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i5);
        int iGreen = Color.green(i5);
        int iBlue = Color.blue(i5);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d3 = iRed / 255.0d;
        double dPow = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d5 = iGreen / 255.0d;
        double dPow2 = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        double d10 = iBlue / 255.0d;
        double dPow3 = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d11 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d11;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d11 / 100.0d > 0.5d;
    }

    public static final boolean R(long j8) {
        float fB = C2384c.b(j8);
        if (Float.isInfinite(fB) || Float.isNaN(fB)) {
            return false;
        }
        float fC = C2384c.c(j8);
        return (Float.isInfinite(fC) || Float.isNaN(fC)) ? false : true;
    }

    public static int S(float f10, int i5, int i10) {
        return AbstractC1492a.b(AbstractC1492a.d(i10, Math.round(Color.alpha(i10) * f10)), i5);
    }

    public static int T(int i5, Rect rect, Rect rect2) {
        int i10;
        int i11;
        if (i5 == 17) {
            i10 = rect.left;
            i11 = rect2.right;
        } else if (i5 == 33) {
            i10 = rect.top;
            i11 = rect2.bottom;
        } else if (i5 == 66) {
            i10 = rect2.left;
            i11 = rect.right;
        } else {
            if (i5 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i10 = rect2.top;
            i11 = rect.bottom;
        }
        return Math.max(0, i10 - i11);
    }

    public static long U(long... jArr) {
        Fe.e.q(jArr.length > 0);
        long j8 = jArr[0];
        for (int i5 = 1; i5 < jArr.length; i5++) {
            long j10 = jArr[i5];
            if (j10 > j8) {
                j8 = j10;
            }
        }
        return j8;
    }

    public static final void V(Context context) {
        AbstractC3340k.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        AbstractC3340k.d(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            J3.r.d().a(K3.n.f6495a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            AbstractC3340k.d(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(K3.a.f6455a.a(context), "androidx.work.workdb");
            String[] strArr = K3.n.f6496b;
            int iD = AbstractC2641B.D(strArr.length);
            if (iD < 16) {
                iD = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iD);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            for (Map.Entry entry : AbstractC2640A.U(linkedHashMap, new C2527k(databasePath2, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        J3.r.d().g(K3.n.f6495a, "Over-writing contents of " + file3);
                    }
                    J3.r.d().a(K3.n.f6495a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    public static int W(int i5, Rect rect, Rect rect2) {
        if (i5 != 17) {
            if (i5 != 33) {
                if (i5 != 66) {
                    if (i5 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final Z.k X(Z.k kVar, tf.l lVar) {
        AbstractC3340k.e(kVar, "<this>");
        return kVar.g(new r0.p(lVar));
    }

    public static void Y(P2.d dVar, int i5, Q1.c cVar) {
        long jK = dVar.k(i5);
        List listG = dVar.g(jK);
        if (listG.isEmpty()) {
            return;
        }
        if (i5 == dVar.p() - 1) {
            throw new IllegalStateException();
        }
        long jK2 = dVar.k(i5 + 1) - dVar.k(i5);
        if (jK2 > 0) {
            cVar.accept(new P2.a(listG, jK, jK2));
        }
    }

    public static boolean Z(int i5, Parcel parcel) {
        r0(parcel, i5, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean a0(int i5, Parcel parcel) {
        int iK0 = k0(i5, parcel);
        if (iK0 == 0) {
            return null;
        }
        s0(parcel, iK0, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double b0(int i5, Parcel parcel) {
        int iK0 = k0(i5, parcel);
        if (iK0 == 0) {
            return null;
        }
        s0(parcel, iK0, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float c0(int i5, Parcel parcel) {
        r0(parcel, i5, 4);
        return parcel.readFloat();
    }

    public static int d0(int i5, Y4.b bVar) {
        switch (i5) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i5 - 2);
            case 6:
                return bVar.q() + 1;
            case 7:
                return bVar.v() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i5 - 8);
            default:
                return -1;
        }
    }

    public static IBinder e0(int i5, Parcel parcel) {
        int iK0 = k0(i5, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iK0 == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iK0);
        return strongBinder;
    }

    public static final long f(float f10, float f11) {
        long jFloatToIntBits = (Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32);
        int i5 = C2384c.f33934e;
        return jFloatToIntBits;
    }

    public static int f0(int i5, Parcel parcel) {
        r0(parcel, i5, 4);
        return parcel.readInt();
    }

    public static final long g(int i5, int i10) {
        if (i5 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i5 + ']').toString());
        }
        if (i10 >= 0) {
            long j8 = (i10 & 4294967295L) | (i5 << 32);
            int i11 = z0.o.f48335b;
            return j8;
        }
        throw new IllegalArgumentException(("end cannot negative. [end: " + i10 + ']').toString());
    }

    public static Integer g0(int i5, Parcel parcel) {
        int iK0 = k0(i5, parcel);
        if (iK0 == 0) {
            return null;
        }
        s0(parcel, iK0, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static final void h(final String str, final AbstractC2765c abstractC2765c, final String str2, final long j8, final InterfaceC2442E backgroundShape, final long j10, final long j11, final long j12, final boolean z2, final boolean z10, final long j13, final tf.a onClick, C0740o c0740o, final int i5) {
        AbstractC3340k.e(backgroundShape, "backgroundShape");
        AbstractC3340k.e(onClick, "onClick");
        c0740o.N(-2051575724);
        int i10 = i5 | (c0740o.e(str) ? 4 : 2) | (c0740o.e(abstractC2765c) ? 32 : 16) | (c0740o.e(str2) ? 256 : 128) | (c0740o.d(j8) ? 2048 : Segment.SHARE_MINIMUM) | (c0740o.e(backgroundShape) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE) | (c0740o.d(j10) ? 131072 : 65536) | (c0740o.d(j12) ? 8388608 : 4194304) | (c0740o.f(z2) ? 67108864 : 33554432) | (c0740o.f(z10) ? 536870912 : 268435456);
        int i11 = (c0740o.d(j13) ? (char) 4 : (char) 2) | (c0740o.e(onClick) ? ' ' : (char) 16);
        if ((i10 & 306783379) == 306783378 && (i11 & 19) == 18 && c0740o.x()) {
            c0740o.I();
        } else {
            c0740o.K();
            if ((i5 & 1) != 0 && !c0740o.w()) {
                c0740o.I();
            }
            c0740o.q();
            L0.d dVar = new L0.d(L0.f.a(j11));
            L0.d dVar2 = new L0.d(L0.f.a(j8));
            if (dVar.compareTo(dVar2) < 0) {
                dVar = dVar2;
            }
            int i12 = i10 >> 9;
            Fe.g.e(null, backgroundShape, j10, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, V.e.b(c0740o, -1541935208, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.N(dVar.f6795a, str2, onClick, z2, z10, str, j12, j13, j8, abstractC2765c)), c0740o, (i12 & 112) | 1572864 | (i12 & 896));
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new tf.p(str, abstractC2765c, str2, j8, backgroundShape, j10, j11, j12, z2, z10, j13, onClick, i5) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.K

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f30819a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AbstractC2765c f30820b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f30821c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f30822d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2442E f30823e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f30824f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ long f30825g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ long f30826h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ boolean f30827i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ boolean f30828j;
                public final /* synthetic */ long k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ tf.a f30829l;

                @Override // tf.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    String str3 = this.f30819a;
                    AbstractC2765c abstractC2765c2 = this.f30820b;
                    String str4 = this.f30821c;
                    long j14 = this.k;
                    tf.a aVar = this.f30829l;
                    v0.h(str3, abstractC2765c2, str4, this.f30822d, this.f30823e, this.f30824f, this.f30825g, this.f30826h, this.f30827i, this.f30828j, j14, aVar, (C0740o) obj, 1572865);
                    return C2515C.f34653a;
                }
            };
        }
    }

    public static long h0(int i5, Parcel parcel) {
        r0(parcel, i5, 8);
        return parcel.readLong();
    }

    public static final void i(M0.o oVar, t0.t tVar) {
        long jG = Fe.g.G(tVar.f45533x);
        int iH = AbstractC4345a.H(C2384c.b(jG));
        int iH2 = AbstractC4345a.H(C2384c.c(jG));
        oVar.layout(iH, iH2, oVar.getMeasuredWidth() + iH, oVar.getMeasuredHeight() + iH2);
    }

    public static Long i0(int i5, Parcel parcel) {
        int iK0 = k0(i5, parcel);
        if (iK0 == 0) {
            return null;
        }
        s0(parcel, iK0, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static androidx.activity.x j(androidx.activity.w wVar, ComponentActivity componentActivity, tf.l onBackPressed) {
        AbstractC3340k.e(onBackPressed, "onBackPressed");
        androidx.activity.x xVar = new androidx.activity.x(onBackPressed, 0);
        wVar.a(componentActivity, xVar);
        return xVar;
    }

    public static long j0(Q1.o oVar, int i5, int i10) {
        oVar.G(i5);
        if (oVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iH = oVar.h();
        if ((8388608 & iH) != 0 || ((2096896 & iH) >> 8) != i10 || (iH & 32) == 0 || oVar.u() < 7 || oVar.a() < 7 || (oVar.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        oVar.f(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((255 & r0[4]) >> 7);
    }

    public static final String k(String str) throws NoSuchAlgorithmException {
        AbstractC3340k.e(str, "<this>");
        URI uri = new URI(str);
        String string = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        AbstractC3340k.d(string, "run(...)");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = string.getBytes(Bf.a.f1670a);
        AbstractC3340k.d(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] bArrDigest = messageDigest.digest();
        AbstractC3340k.d(bArrDigest, "digest(...)");
        char[] cArr = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.u0.f30766a;
        char[] cArr2 = new char[bArrDigest.length * 2];
        int length = bArrDigest.length;
        for (int i5 = 0; i5 < length; i5++) {
            byte b5 = bArrDigest[i5];
            int i10 = i5 * 2;
            int i11 = (b5 & ForkServer.ERROR) >>> 4;
            char[] cArr3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.u0.f30766a;
            cArr2[i10] = cArr3[i11];
            cArr2[i10 + 1] = cArr3[b5 & 15];
        }
        return new String(cArr2);
    }

    public static int k0(int i5, Parcel parcel) {
        return (i5 & (-65536)) != -65536 ? (char) (i5 >> 16) : parcel.readInt();
    }

    public static final Z.k l(Z.k background, long j8, InterfaceC2442E shape) {
        AbstractC3340k.e(background, "$this$background");
        AbstractC3340k.e(shape, "shape");
        return background.g(new C0310a(new C2465q(j8), null, shape, 6));
    }

    public static V2.g l0(V2.g gVar, String[] strArr, Map map) {
        int i5 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (V2.g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                V2.g gVar2 = new V2.g();
                int length = strArr.length;
                while (i5 < length) {
                    gVar2.a((V2.g) map.get(strArr[i5]));
                    i5++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                gVar.a((V2.g) map.get(strArr[0]));
                return gVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i5 < length2) {
                    gVar.a((V2.g) map.get(strArr[i5]));
                    i5++;
                }
            }
        }
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = n(r8, r9, r10)
            boolean r1 = n(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = T(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: U8.v0.m(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static void m0(int i5, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + k0(i5, parcel));
    }

    public static boolean n(int i5, Rect rect, Rect rect2) {
        if (i5 != 17) {
            if (i5 != 33) {
                if (i5 != 66) {
                    if (i5 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n0(P2.d r12, P2.k r13, Q1.c r14) {
        /*
            long r0 = r13.f9081a
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r12.a(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r12.p()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r12.k(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L51
            int r2 = r12.p()
            if (r4 >= r2) goto L51
            java.util.List r7 = r12.g(r0)
            long r2 = r12.k(r4)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L51
            long r8 = r13.f9081a
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 >= 0) goto L51
            P2.a r6 = new P2.a
            long r10 = r2 - r8
            r6.<init>(r7, r8, r10)
            r14.accept(r6)
            r2 = 1
            goto L52
        L51:
            r2 = r5
        L52:
            r3 = r4
        L53:
            int r6 = r12.p()
            if (r3 >= r6) goto L5f
            Y(r12, r3, r14)
            int r3 = r3 + 1
            goto L53
        L5f:
            boolean r13 = r13.f9082b
            if (r13 == 0) goto L87
            if (r2 == 0) goto L67
            int r4 = r4 + (-1)
        L67:
            if (r5 >= r4) goto L6f
            Y(r12, r5, r14)
            int r5 = r5 + 1
            goto L67
        L6f:
            if (r2 == 0) goto L87
            P2.a r6 = new P2.a
            java.util.List r7 = r12.g(r0)
            long r8 = r12.k(r4)
            long r12 = r12.k(r4)
            long r10 = r0 - r12
            r6.<init>(r7, r8, r10)
            r14.accept(r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U8.v0.n0(P2.d, P2.k, Q1.c):void");
    }

    public static boolean o(Y4.b bVar, J5.p pVar, int i5, J5.n nVar) {
        int i10 = bVar.f16680b;
        long jR = bVar.r();
        long j8 = jR >>> 16;
        if (j8 != i5) {
            return false;
        }
        boolean z2 = (j8 & 1) == 1;
        int i11 = (int) ((jR >> 12) & 15);
        int i12 = (int) ((jR >> 8) & 15);
        int i13 = (int) ((jR >> 4) & 15);
        int i14 = (int) ((jR >> 1) & 7);
        boolean z10 = (jR & 1) == 1;
        if (i13 <= 7) {
            if (i13 != pVar.f5666h - 1) {
                return false;
            }
        } else if (i13 > 10 || pVar.f5666h != 2) {
            return false;
        }
        if (!(i14 == 0 || i14 == pVar.f5668j) || z10) {
            return false;
        }
        try {
            long jW = bVar.w();
            if (!z2) {
                jW *= pVar.f5661c;
            }
            nVar.f5655a = jW;
            int iD0 = d0(i11, bVar);
            if (iD0 == -1 || iD0 > pVar.f5661c) {
                return false;
            }
            if (i12 != 0) {
                if (i12 > 11) {
                    int i15 = pVar.f5664f;
                    if (i12 != 12) {
                        if (i12 > 14) {
                            return false;
                        }
                        int iV = bVar.v();
                        if (i12 == 14) {
                            iV *= 10;
                        }
                        if (iV != i15) {
                            return false;
                        }
                    } else if (bVar.q() * 1000 != i15) {
                        return false;
                    }
                } else if (i12 != pVar.f5665g) {
                    return false;
                }
            }
            int iQ = bVar.q();
            int i16 = bVar.f16680b;
            byte[] bArr = bVar.f16679a;
            int i17 = i16 - 1;
            int i18 = u6.v.f46721a;
            int i19 = 0;
            for (int i20 = i10; i20 < i17; i20++) {
                i19 = u6.v.f46731l[i19 ^ (bArr[i20] & ForkServer.ERROR)];
            }
            return iQ == i19;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int o0(Parcel parcel) {
        int i5 = parcel.readInt();
        int iK0 = k0(i5, parcel);
        char c10 = (char) i5;
        int iDataPosition = parcel.dataPosition();
        if (c10 != 20293) {
            throw new C2615b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i5))), parcel);
        }
        int i10 = iK0 + iDataPosition;
        if (i10 >= iDataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        throw new C2615b(com.google.android.gms.internal.consent_sdk.a.u(iDataPosition, i10, "Size read is invalid start=", " end=", new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i10).length())), parcel);
    }

    public static BigDecimal p(int i5, Parcel parcel) {
        int iK0 = k0(i5, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iK0 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i10 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iK0);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i10);
    }

    public static void p0(boolean z2, String str, Object obj) {
        if (!z2) {
            throw new E5.Q(Fe.g.E(str, obj), 12);
        }
    }

    public static Bundle q(int i5, Parcel parcel) {
        int iK0 = k0(i5, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iK0 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iK0);
        return bundle;
    }

    public static void q0(Context context) {
        boolean z2;
        Object obj = H6.i.f4948b;
        if (((Boolean) zzbkt.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    synchronized (H6.i.f4948b) {
                        z2 = H6.i.f4949c;
                    }
                    if (z2) {
                        return;
                    }
                    p8.p pVarZzb = new F6.j(context).zzb();
                    int i5 = G6.L.f4523b;
                    H6.l.e("Updating ad debug logging enablement.");
                    zzcgb.zza(pVarZzb, "AdDebugLogUpdater.updateEnablement", zzcfy.zzh);
                }
            } catch (Exception e7) {
                H6.l.g("Fail to determine debug setting.", e7);
            }
        }
    }

    public static byte[] r(int i5, Parcel parcel) {
        int iK0 = k0(i5, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iK0 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iK0);
        return bArrCreateByteArray;
    }

    public static void r0(Parcel parcel, int i5, int i10) {
        int iK0 = k0(i5, parcel);
        if (iK0 == i10) {
            return;
        }
        String hexString = Integer.toHexString(iK0);
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iK0).length() + 4 + 1);
        N0.a.l(i10, iK0, "Expected size ", " got ", sb2);
        throw new C2615b(M6.t(sb2, " (0x", hexString, ")"), parcel);
    }

    public static final Dd.c s(String str, tf.a createConfiguration, tf.l lVar) {
        AbstractC3340k.e(createConfiguration, "createConfiguration");
        return new Dd.c(str, createConfiguration, lVar);
    }

    public static void s0(Parcel parcel, int i5, int i10) {
        if (i5 == i10) {
            return;
        }
        String hexString = Integer.toHexString(i5);
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i5).length() + 4 + 1);
        N0.a.l(i10, i5, "Expected size ", " got ", sb2);
        throw new C2615b(M6.t(sb2, " (0x", hexString, ")"), parcel);
    }

    public static int[] t(int i5, Parcel parcel) {
        int iK0 = k0(i5, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iK0 == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iK0);
        return iArrCreateIntArray;
    }

    public static C1703q u(Looper looper, Object obj, String str) {
        AbstractC1732v.j(obj, "Listener must not be null");
        AbstractC1732v.j(looper, "Looper must not be null");
        AbstractC1732v.j(str, "Listener type must not be null");
        return new C1703q(looper, obj, str);
    }

    public static C1703q v(Object obj, String str, Executor executor) {
        AbstractC1732v.j(obj, "Listener must not be null");
        AbstractC1732v.j(executor, "Executor must not be null");
        return new C1703q(obj, str, executor);
    }

    public static C1701o w(Object obj, String str) {
        AbstractC1732v.j(obj, "Listener must not be null");
        AbstractC1732v.g(str, "Listener type must not be empty");
        return new C1701o(obj, str);
    }

    public static Parcelable x(Parcel parcel, int i5, Parcelable.Creator creator) {
        int iK0 = k0(i5, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iK0 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iK0);
        return parcelable;
    }

    public static String y(int i5, Parcel parcel) {
        int iK0 = k0(i5, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iK0 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iK0);
        return string;
    }

    public static String[] z(int i5, Parcel parcel) {
        int iK0 = k0(i5, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iK0 == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iK0);
        return strArrCreateStringArray;
    }

    public abstract Object H(String str);

    public Boolean L() {
        Object objH = H("inTransaction");
        if (objH instanceof Boolean) {
            return (Boolean) objH;
        }
        return null;
    }

    public boolean M() {
        return Boolean.TRUE.equals(H("noResult"));
    }

    public C2709f N() {
        return new C2709f((String) H("sql"), (List) H("arguments"));
    }

    @Override // k1.Y
    public void c() {
    }

    @Override // k1.Y
    public void d() {
    }
}
