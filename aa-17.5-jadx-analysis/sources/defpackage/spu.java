package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.projection.gearhead.R;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.time.Duration;
import j$.util.Objects;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class spu {
    public spu() {
    }

    public static void A(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iL = l(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        m(parcel, iL);
    }

    public static void B(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        parcel.writeInt(i | 262144);
        parcel.writeInt(num.intValue());
    }

    public static void C(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iL = l(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeLong(((Long) list.get(i2)).longValue());
        }
        m(parcel, iL);
    }

    public static void D(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        parcel.writeInt(i | 524288);
        parcel.writeLong(l.longValue());
    }

    public static void E(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iL = l(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m(parcel, iL);
    }

    public static void F(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iL = l(parcel, i);
        parcel.writeString(str);
        m(parcel, iL);
    }

    public static void G(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iL = l(parcel, i);
        parcel.writeStringArray(strArr);
        m(parcel, iL);
    }

    public static void H(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iL = l(parcel, i);
        parcel.writeStringList(list);
        m(parcel, iL);
    }

    public static void I(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iL = l(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                t(parcel, parcelable, i2);
            }
        }
        m(parcel, iL);
    }

    public static void J(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iL = l(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                t(parcel, parcelable, 0);
            }
        }
        m(parcel, iL);
    }

    public static byte K(Parcel parcel, int i) {
        ad(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static double L(Parcel parcel, int i) {
        ad(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float M(Parcel parcel, int i) {
        ad(parcel, i, 4);
        return parcel.readFloat();
    }

    public static int N(Parcel parcel, int i) {
        ad(parcel, i, 4);
        return parcel.readInt();
    }

    public static int O(Parcel parcel, int i) {
        int i2 = (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
        if (i2 < 0 || parcel.dataPosition() + i2 > parcel.dataSize()) {
            throw new sov(a.bp(i2, "Invalid field size: "), parcel);
        }
        return i2;
    }

    public static int P(Parcel parcel) {
        int i = parcel.readInt();
        int iO = O(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new sov("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iO + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new sov(a.bo(i2, iDataPosition, "Size read is invalid start=", " end="), parcel);
        }
        return i2;
    }

    public static long Q(Parcel parcel, int i) {
        ad(parcel, i, 8);
        return parcel.readLong();
    }

    public static Bundle R(Parcel parcel, int i) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iO);
        return bundle;
    }

    public static IBinder S(Parcel parcel, int i) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iO);
        return strongBinder;
    }

    public static Parcelable T(Parcel parcel, int i, Parcelable.Creator creator) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iO);
        return parcelable;
    }

    public static Float U(Parcel parcel, int i) {
        int iO = O(parcel, i);
        if (iO == 0) {
            return null;
        }
        al(parcel, iO, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static Integer V(Parcel parcel, int i) {
        int iO = O(parcel, i);
        if (iO == 0) {
            return null;
        }
        al(parcel, iO, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static Long W(Parcel parcel, int i) {
        int iO = O(parcel, i);
        if (iO == 0) {
            return null;
        }
        al(parcel, iO, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static String X(Parcel parcel, int i) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iO);
        return string;
    }

    public static ArrayList Y(Parcel parcel, int i) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iO);
        return arrayList;
    }

    public static ArrayList Z(Parcel parcel, int i) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(iDataPosition + iO);
        return arrayList;
    }

    public static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }

    @ResultIgnorabilityUnspecified
    public static Object aA(svz svzVar) throws ExecutionException, InterruptedException {
        aq("Must not be called on the main application thread");
        av();
        if (svzVar.f()) {
            return bb(svzVar);
        }
        swf swfVar = new swf();
        aC(svzVar, swfVar);
        swfVar.a.await();
        return bb(svzVar);
    }

    @ResultIgnorabilityUnspecified
    public static Object aB(svz svzVar, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        aq("Must not be called on the main application thread");
        av();
        ax(timeUnit, "TimeUnit must not be null");
        if (svzVar.f()) {
            return bb(svzVar);
        }
        swf swfVar = new swf();
        aC(svzVar, swfVar);
        if (swfVar.a.await(j, timeUnit)) {
            return bb(svzVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static void aC(svz svzVar, swg swgVar) {
        Executor executor = swd.b;
        svzVar.l(executor, swgVar);
        svzVar.k(executor, swgVar);
        svzVar.h(executor, swgVar);
    }

    public static void aD(String str, Object... objArr) {
        Log.e("WakeLock", String.format(str, objArr));
    }

    public static ScheduledExecutorService aE() {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ssq(0)));
    }

    public static ExecutorService aF(int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ssq(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static Object aG(Class cls, String str, rju... rjuVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        int length = rjuVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < rjuVarArr.length; i++) {
            rju rjuVar = rjuVarArr[i];
            rjuVar.getClass();
            clsArr[i] = (Class) rjuVar.a;
            objArr[i] = rjuVarArr[i].b;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }

    public static /* synthetic */ ajfz aH() {
        try {
            return (ajfz) abnv.x(ajfz.a, Base64.decode("EAAYAg==", 3));
        } catch (abon e) {
            throw new AssertionError(e);
        }
    }

    public static /* synthetic */ ajfz aI() {
        try {
            return (ajfz) abnv.x(ajfz.a, Base64.decode("EOgHGAQ=", 3));
        } catch (abon e) {
            throw new AssertionError(e);
        }
    }

    public static vqu aJ(xxh xxhVar, aezk aezkVar) {
        return (vqu) ((aezk) xxhVar.d(aezkVar)).a();
    }

    public static zgp aK(svz svzVar) {
        final vax vaxVar = new vax(svzVar);
        svzVar.i(zfq.a, new svs() { // from class: vaw
            @Override // defpackage.svs
            public final void a(svz svzVar2) {
                boolean z = ((swe) svzVar2).c;
                vax vaxVar2 = vaxVar;
                if (z) {
                    vaxVar2.cancel(false);
                    return;
                }
                if (svzVar2.g()) {
                    vaxVar2.o(svzVar2.e());
                    return;
                }
                Exception excD = svzVar2.d();
                if (excD == null) {
                    throw new IllegalStateException();
                }
                vaxVar2.p(excD);
            }
        });
        return vaxVar;
    }

    public static int aL(Context context, int i) {
        context.getClass();
        return aO(context, i);
    }

    public static ColorStateList aM(Context context, int i) {
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        typedArrayObtainStyledAttributes.getClass();
        TypedValue typedValue = new TypedValue();
        typedArrayObtainStyledAttributes.getValue(0, typedValue);
        ColorStateList colorStateListAM = typedValue.type == 2 ? aM(context, typedValue.data) : typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        return colorStateListAM;
    }

    public static boolean aN(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.coolwalk_applyPaletteChanges});
        typedArrayObtainStyledAttributes.getClass();
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public static int aO(Context context, int i) {
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        typedArrayObtainStyledAttributes.getClass();
        TypedValue typedValue = new TypedValue();
        typedArrayObtainStyledAttributes.getValue(0, typedValue);
        return typedValue.type == 2 ? aO(context, typedValue.data) : typedArrayObtainStyledAttributes.getColor(0, -1);
    }

    public static tgu aP(ParcelFileDescriptor parcelFileDescriptor) {
        return new tgv(parcelFileDescriptor, new FileInputStream(parcelFileDescriptor.getFileDescriptor()), new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
    }

    public static tgu aQ(Socket socket) throws IOException {
        return new tgv(socket, socket.getInputStream(), socket.getOutputStream());
    }

    public static String aR(String str, Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            try {
                return String.format(Locale.US, str, new Object[0]);
            } catch (IllegalFormatException unused) {
                return str;
            }
        }
        for (int i = 0; i < objArr.length; i++) {
            try {
                Object obj = objArr[i];
                if (obj != null && obj.getClass().isArray()) {
                    objArr[i] = Arrays.deepToString(new Object[]{obj}).substring(1, r2.length() - 1);
                }
            } catch (Throwable th) {
                return str + " [Error formatting log arguments: " + th.getClass().getSimpleName() + "]";
            }
        }
        return String.format(Locale.US, str, objArr);
    }

    public static boolean aS(String str, int i, int i2) {
        return i >= i2 || omc.c(str, i) || omc.c("all", i) || omc.c("GH", i);
    }

    @ResultIgnorabilityUnspecified
    public static Object aT(Object obj, ten tenVar) {
        if (obj != null) {
            return tenVar.a(obj);
        }
        return null;
    }

    public static /* synthetic */ tel aU(Enum r1, tei teiVar, tek tekVar, afec afecVar) {
        teiVar.getClass();
        nsy nsyVar = new nsy(r1, teiVar, tekVar);
        afecVar.invoke(nsyVar);
        return ((teh) nsyVar.a).a();
    }

    public static byte[] aV(char c) {
        return new byte[]{(byte) (c & 255), (byte) (c >> '\b')};
    }

    public static byte[] aW(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public static eqj aX(afec afecVar) {
        nok nokVar = new nok((char[]) null);
        eqj eqjVarS = (eqj) afecVar.invoke(nokVar);
        ?? r0 = nokVar.a;
        if (!r0.isEmpty()) {
            ListIterator listIterator = r0.listIterator(r0.size());
            while (listIterator.hasPrevious()) {
                aezu aezuVar = (aezu) listIterator.previous();
                eqjVarS = tby.s((eqj) aezuVar.a, (eqj) aezuVar.b, eqjVarS);
            }
        }
        return eqjVarS;
    }

    public static Object aY(Duration duration, afck afckVar) {
        return duration.compareTo(Duration.ZERO) > 0 ? wub.aq(duration, afckVar) : affz.o(afckVar);
    }

    public static void aZ(eql eqlVar, eqj[] eqjVarArr, afec afecVar) {
        eqjVarArr.getClass();
        int length = eqjVarArr.length;
        if (length == 0) {
            afecVar.invoke(afbe.a);
            return;
        }
        boolean[] zArr = new boolean[length];
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(null);
        }
        yca ycaVar = new yca(12, 3);
        int length2 = eqjVarArr.length;
        int i3 = 0;
        while (i < length2) {
            ycaVar.c(eqjVarArr[i]).add(Integer.valueOf(i3));
            i++;
            i3++;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(woy.aV(eqjVarArr.length));
        woy.dA(eqjVarArr, linkedHashSet);
        for (eqj eqjVar : woy.cf(linkedHashSet)) {
            afec afecVar2 = afecVar;
            eqlVar.r(eqjVar, new kko(new bhw(eqjVar, ycaVar, zArr, arrayList, afecVar2, 2), 11));
            afecVar = afecVar2;
        }
    }

    public static ArrayList aa(Parcel parcel, int i) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iO);
        return arrayListCreateStringArrayList;
    }

    public static ArrayList ab(Parcel parcel, int i, Parcelable.Creator creator) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iO);
        return arrayListCreateTypedArrayList;
    }

    public static void ac(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new sov(a.bp(i, "Overread allowed size end="), parcel);
        }
    }

    public static void ad(Parcel parcel, int i, int i2) {
        int iO = O(parcel, i);
        if (iO == i2) {
            return;
        }
        throw new sov("Expected size " + i2 + " got " + iO + " (0x" + Integer.toHexString(iO) + ")", parcel);
    }

    public static void ae(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + O(parcel, i));
    }

    public static boolean af(Parcel parcel, int i) {
        ad(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte[] ag(Parcel parcel, int i) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iO);
        return bArrCreateByteArray;
    }

    public static int[] ah(Parcel parcel, int i) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iO);
        return iArrCreateIntArray;
    }

    public static Object[] ai(Parcel parcel, int i, Parcelable.Creator creator) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iO);
        return objArrCreateTypedArray;
    }

    public static String[] aj(Parcel parcel, int i) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iO);
        return strArrCreateStringArray;
    }

    public static byte[][] ak(Parcel parcel, int i) {
        int iO = O(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iO == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iO);
        return bArr;
    }

    public static void al(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        throw new sov("Expected size " + i2 + " got " + i + " (0x" + Integer.toHexString(i) + ")", parcel);
    }

    public static void am(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void an(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void ao(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void ap(String str) {
        if (!thg.t()) {
            throw new IllegalStateException(str);
        }
    }

    public static void aq(String str) {
        if (thg.t()) {
            throw new IllegalStateException(str);
        }
    }

    public static void ar(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void as(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void at(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void au(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void av() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
    }

    public static void aw(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void ax(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static boolean ay(Context context) {
        Uri uri = sxq.a;
        int i = context.getApplicationInfo().uid;
        return (i == -1 || Build.FINGERPRINT.equals("robolectric") || context.checkUriPermission(sxq.a, 0, i, 1) != 0) ? false : true;
    }

    public static svz az(Object obj) {
        swe sweVar = new swe();
        sweVar.p(obj);
        return sweVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (defpackage.dvv.a("VanillaIceCream", r0) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b() {
        /*
            int r0 = defpackage.dvv.a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            r2 = 0
            if (r0 >= r1) goto L1e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L1d
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            r0.getClass()
            java.lang.String r1 = "VanillaIceCream"
            boolean r0 = defpackage.dvv.a(r1, r0)
            if (r0 == 0) goto L1d
            goto L1e
        L1d:
            return r2
        L1e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            r3 = 1
            if (r0 < r1) goto L26
            return r3
        L26:
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            char r0 = r0.charAt(r2)
            r1 = 66
            if (r0 < r1) goto L3b
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            char r0 = r0.charAt(r2)
            r1 = 67
            if (r0 > r1) goto L3b
            return r3
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spu.b():boolean");
    }

    public static adoh ba(Context context, Executor executor) {
        adod adodVar = szh.b;
        adodVar.getClass();
        adoh adohVar = new adoh(adodVar, context, new adqq());
        adohVar.b.d = zkt.y(context, new ymp(RemoteApiConstants.NOW_PACKAGE));
        adwb adwbVar = adohVar.a;
        adwbVar.f = new adzs(executor, 1);
        adwbVar.h.addAll(Arrays.asList(vbe.a()));
        adohVar.d();
        return adohVar;
    }

    private static Object bb(svz svzVar) throws ExecutionException {
        if (svzVar.g()) {
            return svzVar.e();
        }
        if (((swe) svzVar).c) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(svzVar.d());
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static int e(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (Objects.equals(objArr[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean f(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static Object[] g(Object[]... objArr) {
        int length = 0;
        for (int i = 0; i < 2; i++) {
            length += objArr[i].length;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr[0], length);
        int length2 = objArr[0].length;
        for (char c = 1; c < 2; c = 2) {
            Object[] objArr2 = objArr[1];
            int length3 = objArr2.length;
            System.arraycopy(objArr2, 0, objArrCopyOf, length2, length3);
            length2 += length3;
        }
        return objArrCopyOf;
    }

    public static SafeParcelable h(byte[] bArr, Parcelable.Creator creator) {
        if (creator == null) {
            throw new NullPointerException("null reference");
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return safeParcelable;
    }

    public static SafeParcelable i(String str, Parcelable.Creator creator) {
        return h(Base64.decode(str, 10), creator);
    }

    public static String j(SafeParcelable safeParcelable) {
        byte[] bArrK = k(safeParcelable);
        if (bArrK == null) {
            return null;
        }
        return Base64.encodeToString(bArrK, 10);
    }

    public static byte[] k(SafeParcelable safeParcelable) {
        Parcel parcelObtain = Parcel.obtain();
        safeParcelable.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static int l(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void m(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void n(Parcel parcel, int i, boolean z) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void o(Parcel parcel, int i, byte b) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(b);
    }

    public static void p(Parcel parcel, int i, double d) {
        parcel.writeInt(i | 524288);
        parcel.writeDouble(d);
    }

    public static void q(Parcel parcel, int i, float f) {
        parcel.writeInt(i | 262144);
        parcel.writeFloat(f);
    }

    public static void r(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(i2);
    }

    public static void s(Parcel parcel, int i, long j) {
        parcel.writeInt(i | 524288);
        parcel.writeLong(j);
    }

    public static void t(Parcel parcel, Parcelable parcelable, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    public static void u(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iL = l(parcel, i);
        parcel.writeBundle(bundle);
        m(parcel, iL);
    }

    public static void v(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iL = l(parcel, i);
        parcel.writeByteArray(bArr);
        m(parcel, iL);
    }

    public static void w(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iL = l(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        m(parcel, iL);
    }

    public static void x(Parcel parcel, int i, Float f) {
        if (f == null) {
            return;
        }
        parcel.writeInt(i | 262144);
        parcel.writeFloat(f.floatValue());
    }

    public static void y(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iL = l(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m(parcel, iL);
    }

    public static void z(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iL = l(parcel, i);
        parcel.writeIntArray(iArr);
        m(parcel, iL);
    }

    public spu(byte[] bArr, char[] cArr) {
    }
}
