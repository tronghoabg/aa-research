package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class sqs {
    public sqs() {
    }

    public static void A(android.os.Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iP = p(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        q(parcel, iP);
    }

    public static void B(android.os.Parcel parcel, int i, java.lang.Float f) {
        if (f == null) {
            return;
        }
        parcel.writeInt(i | 262144);
        parcel.writeFloat(f.floatValue());
    }

    public static void C(android.os.Parcel parcel, int i, android.os.IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iP = p(parcel, i);
        parcel.writeStrongBinder(iBinder);
        q(parcel, iP);
    }

    public static void D(android.os.Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iP = p(parcel, i);
        parcel.writeIntArray(iArr);
        q(parcel, iP);
    }

    public static void E(android.os.Parcel parcel, int i, java.util.List list) {
        if (list == null) {
            return;
        }
        int iP = p(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((java.lang.Integer) list.get(i2)).intValue());
        }
        q(parcel, iP);
    }

    public static void F(android.os.Parcel parcel, int i, java.lang.Integer num) {
        if (num == null) {
            return;
        }
        parcel.writeInt(i | 262144);
        parcel.writeInt(num.intValue());
    }

    public static void G(android.os.Parcel parcel, int i, java.util.List list) {
        if (list == null) {
            return;
        }
        int iP = p(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeLong(((java.lang.Long) list.get(i2)).longValue());
        }
        q(parcel, iP);
    }

    public static void H(android.os.Parcel parcel, int i, java.lang.Long l) {
        if (l == null) {
            return;
        }
        parcel.writeInt(i | 524288);
        parcel.writeLong(l.longValue());
    }

    public static void I(android.os.Parcel parcel, int i, android.os.Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iP = p(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        q(parcel, iP);
    }

    public static void J(android.os.Parcel parcel, int i, java.lang.String str) {
        if (str == null) {
            return;
        }
        int iP = p(parcel, i);
        parcel.writeString(str);
        q(parcel, iP);
    }

    public static void K(android.os.Parcel parcel, int i, java.lang.String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iP = p(parcel, i);
        parcel.writeStringArray(strArr);
        q(parcel, iP);
    }

    public static void L(android.os.Parcel parcel, int i, java.util.List list) {
        if (list == null) {
            return;
        }
        int iP = p(parcel, i);
        parcel.writeStringList(list);
        q(parcel, iP);
    }

    public static void M(android.os.Parcel parcel, int i, android.os.Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iP = p(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (android.os.Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                x(parcel, parcelable, i2);
            }
        }
        q(parcel, iP);
    }

    public static void N(android.os.Parcel parcel, int i, java.util.List list) {
        if (list == null) {
            return;
        }
        int iP = p(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            android.os.Parcelable parcelable = (android.os.Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                x(parcel, parcelable, 0);
            }
        }
        q(parcel, iP);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static byte O(android.os.Parcel parcel, int i) throws spq {
        ah(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static double P(android.os.Parcel parcel, int i) throws spq {
        ah(parcel, i, 8);
        return parcel.readDouble();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static float Q(android.os.Parcel parcel, int i) throws spq {
        ah(parcel, i, 4);
        return parcel.readFloat();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static int R(android.os.Parcel parcel, int i) throws spq {
        ah(parcel, i, 4);
        return parcel.readInt();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static int S(android.os.Parcel parcel, int i) throws spq {
        int i2 = (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
        if (i2 < 0 || parcel.dataPosition() + i2 > parcel.dataSize()) {
            throw new spq(defpackage.a.bo(i2, "Invalid field size: "), parcel);
        }
        return i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static int T(android.os.Parcel parcel) throws spq {
        int i = parcel.readInt();
        int iS = S(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new spq("Expected object header. Got 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(i))), parcel);
        }
        int i2 = iS + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new spq(defpackage.a.bn(i2, iDataPosition, "Size read is invalid start=", " end="), parcel);
        }
        return i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static long U(android.os.Parcel parcel, int i) throws spq {
        ah(parcel, i, 8);
        return parcel.readLong();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static android.os.Bundle V(android.os.Parcel parcel, int i) throws spq {
        int iS = S(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        android.os.Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iS);
        return bundle;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static android.os.IBinder W(android.os.Parcel parcel, int i) throws spq {
        int iS = S(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iS);
        return strongBinder;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static android.os.Parcelable X(android.os.Parcel parcel, int i, android.os.Parcelable.Creator creator) throws spq {
        int iS = S(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        android.os.Parcelable parcelable = (android.os.Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iS);
        return parcelable;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static java.lang.Float Y(android.os.Parcel parcel, int i) throws spq {
        int iS = S(parcel, i);
        if (iS == 0) {
            return null;
        }
        ap(parcel, iS, 4);
        return java.lang.Float.valueOf(parcel.readFloat());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static java.lang.Integer Z(android.os.Parcel parcel, int i) throws spq {
        int iS = S(parcel, i);
        if (iS == 0) {
            return null;
        }
        ap(parcel, iS, 4);
        return java.lang.Integer.valueOf(parcel.readInt());
    }

    public static void aA(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("null reference");
        }
    }

    public static void aB(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException((java.lang.String) obj2);
        }
    }

    public static defpackage.sls aC(com.google.android.gms.common.api.Status status) {
        return status.h != null ? new smd(status) : new defpackage.sls(status);
    }

    public static void aD(com.google.android.gms.common.api.Status status, java.lang.Object obj, defpackage.lhe lheVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        if (apiMetadata != null) {
            sub subVar = stf.a;
        }
        aE(status, obj, lheVar);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static void aE(com.google.android.gms.common.api.Status status, java.lang.Object obj, defpackage.lhe lheVar) {
        if (status.c()) {
            lheVar.f(obj);
        } else {
            lheVar.e(aC(status));
        }
    }

    public static defpackage.thq aF(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        return new defpackage.thr(parcelFileDescriptor, new java.io.FileInputStream(parcelFileDescriptor.getFileDescriptor()), new java.io.FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
    }

    public static defpackage.thq aG(java.net.Socket socket) throws java.io.IOException {
        return new defpackage.thr(socket, socket.getInputStream(), socket.getOutputStream());
    }

    public static java.lang.String aH(java.lang.String str, java.lang.Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            try {
                return java.lang.String.format(java.util.Locale.US, str, new java.lang.Object[0]);
            } catch (java.util.IllegalFormatException unused) {
                return str;
            }
        }
        for (int i = 0; i < objArr.length; i++) {
            try {
                java.lang.Object obj = objArr[i];
                if (obj != null && obj.getClass().isArray()) {
                    java.lang.String strDeepToString = java.util.Arrays.deepToString(new java.lang.Object[]{obj});
                    objArr[i] = strDeepToString.substring(1, strDeepToString.length() - 1);
                }
            } catch (java.lang.Throwable th) {
                return str + " [Error formatting log arguments: " + th.getClass().getSimpleName() + "]";
            }
        }
        return java.lang.String.format(java.util.Locale.US, str, objArr);
    }

    public static boolean aI(java.lang.String str, int i, int i2) {
        return i >= i2 || defpackage.omv.c(str, i) || defpackage.omv.c("all", i) || defpackage.omv.c("GH", i);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static java.lang.Object aJ(java.lang.Object obj, tfj tfjVar) {
        if (obj != null) {
            return tfjVar.a(obj);
        }
        return null;
    }

    public static /* synthetic */ defpackage.tfh aK(java.lang.Enum r1, defpackage.tfe tfeVar, defpackage.tfg tfgVar, defpackage.affc affcVar) {
        tfeVar.getClass();
        defpackage.ntl ntlVar = new defpackage.ntl(r1, tfeVar, tfgVar);
        affcVar.invoke(ntlVar);
        return ((defpackage.tfd) ntlVar.a).a();
    }

    public static byte[] aL(char c) {
        return new byte[]{(byte) (c & 255), (byte) (c >> '\b')};
    }

    public static byte[] aM(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public static defpackage.eqp aN(defpackage.affc affcVar) {
        defpackage.npc npcVar = new defpackage.npc((char[]) null);
        defpackage.eqp eqpVarS = (defpackage.eqp) affcVar.invoke(npcVar);
        ?? r0 = npcVar.a;
        if (!r0.isEmpty()) {
            java.util.ListIterator listIterator = r0.listIterator(r0.size());
            while (listIterator.hasPrevious()) {
                defpackage.afau afauVar = (defpackage.afau) listIterator.previous();
                eqpVarS = defpackage.tcu.s((defpackage.eqp) afauVar.a, (defpackage.eqp) afauVar.b, eqpVarS);
            }
        }
        return eqpVarS;
    }

    public static java.lang.Object aO(j$.time.Duration duration, defpackage.afdk afdkVar) {
        return duration.compareTo(j$.time.Duration.ZERO) > 0 ? defpackage.ysr.cH(duration, afdkVar) : defpackage.afgz.n(afdkVar);
    }

    public static void aP(defpackage.eqr eqrVar, defpackage.eqp[] eqpVarArr, defpackage.affc affcVar) {
        eqpVarArr.getClass();
        int length = eqpVarArr.length;
        if (length == 0) {
            affcVar.invoke(defpackage.afce.a);
            return;
        }
        boolean[] zArr = new boolean[length];
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(null);
        }
        defpackage.ydg ydgVar = new defpackage.ydg(12, 3);
        int length2 = eqpVarArr.length;
        int i3 = 0;
        while (i < length2) {
            ydgVar.c(eqpVarArr[i]).add(java.lang.Integer.valueOf(i3));
            i++;
            i3++;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(defpackage.afga.P(eqpVarArr.length));
        defpackage.afga.cu(eqpVarArr, linkedHashSet);
        for (defpackage.eqp eqpVar : defpackage.afga.aZ(linkedHashSet)) {
            defpackage.affc affcVar2 = affcVar;
            eqrVar.r(eqpVar, new defpackage.kku(new defpackage.bia(eqpVar, ydgVar, zArr, arrayList, affcVar2, 2), 11));
            affcVar = affcVar2;
        }
    }

    public static defpackage.adpi aQ(android.content.Context context, java.util.concurrent.Executor executor) {
        defpackage.adpe adpeVar = defpackage.taf.b;
        adpeVar.getClass();
        defpackage.adpi adpiVar = new defpackage.adpi(adpeVar, context, new defpackage.adrq());
        adpiVar.b.d = defpackage.zfh.u(context, new defpackage.ynu("com.google.android.googlequicksearchbox"));
        defpackage.adxc adxcVar = adpiVar.a;
        adxcVar.f = new defpackage.aeas(executor, 1);
        adxcVar.h.addAll(java.util.Arrays.asList(defpackage.vcb.a()));
        adpiVar.d();
        return adpiVar;
    }

    public static boolean aR(android.content.Context context) {
        android.net.Uri uri = defpackage.syo.a;
        int i = context.getApplicationInfo().uid;
        return (i == -1 || android.os.Build.FINGERPRINT.equals("robolectric") || context.checkUriPermission(defpackage.syo.a, 0, i, 1) != 0) ? false : true;
    }

    public static defpackage.swx aS(java.lang.Object obj) {
        defpackage.sxc sxcVar = new defpackage.sxc();
        sxcVar.p(obj);
        return sxcVar;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static java.lang.Object aT(defpackage.swx swxVar) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        au("Must not be called on the main application thread");
        az();
        if (swxVar.f()) {
            return bV(swxVar);
        }
        sxd sxdVar = new sxd();
        aV(swxVar, sxdVar);
        sxdVar.a.await();
        return bV(swxVar);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static java.lang.Object aU(defpackage.swx swxVar, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        au("Must not be called on the main application thread");
        az();
        aB(timeUnit, "TimeUnit must not be null");
        if (swxVar.f()) {
            return bV(swxVar);
        }
        sxd sxdVar = new sxd();
        aV(swxVar, sxdVar);
        if (sxdVar.a.await(j, timeUnit)) {
            return bV(swxVar);
        }
        throw new java.util.concurrent.TimeoutException("Timed out waiting for Task");
    }

    public static void aV(defpackage.swx swxVar, sxe sxeVar) {
        java.util.concurrent.Executor executor = defpackage.sxb.b;
        swxVar.l(executor, sxeVar);
        swxVar.k(executor, sxeVar);
        swxVar.h(executor, sxeVar);
    }

    public static void aW(java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.e("WakeLock", java.lang.String.format(str, objArr));
    }

    public static java.lang.Object aX(java.lang.Class cls, java.lang.String str, defpackage.rkq... rkqVarArr) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        int length = rkqVarArr.length;
        java.lang.Class<?>[] clsArr = new java.lang.Class[length];
        java.lang.Object[] objArr = new java.lang.Object[length];
        for (int i = 0; i < rkqVarArr.length; i++) {
            defpackage.rkq rkqVar = rkqVarArr[i];
            rkqVar.getClass();
            clsArr[i] = (java.lang.Class) rkqVar.a;
            objArr[i] = rkqVarArr[i].b;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }

    public static defpackage.xvg aY(java.lang.String str) {
        return defpackage.ysr.bG(str, defpackage.xvj.a, false);
    }

    public static int aZ(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static java.lang.Long aa(android.os.Parcel parcel, int i) throws spq {
        int iS = S(parcel, i);
        if (iS == 0) {
            return null;
        }
        ap(parcel, iS, 8);
        return java.lang.Long.valueOf(parcel.readLong());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static java.lang.String ab(android.os.Parcel parcel, int i) throws spq {
        int iS = S(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        java.lang.String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iS);
        return string;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static java.util.ArrayList ac(android.os.Parcel parcel, int i) throws spq {
        int iS = S(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(java.lang.Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iS);
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static java.util.ArrayList ad(android.os.Parcel parcel, int i) throws spq {
        int iS = S(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(java.lang.Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(iDataPosition + iS);
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static java.util.ArrayList ae(android.os.Parcel parcel, int i) throws spq {
        int iS = S(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iS);
        return arrayListCreateStringArrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static java.util.ArrayList af(android.os.Parcel parcel, int i, android.os.Parcelable.Creator creator) throws spq {
        int iS = S(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iS);
        return arrayListCreateTypedArrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static void ag(android.os.Parcel parcel, int i) throws spq {
        if (parcel.dataPosition() != i) {
            throw new spq(defpackage.a.bo(i, "Overread allowed size end="), parcel);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static void ah(android.os.Parcel parcel, int i, int i2) throws spq {
        int iS = S(parcel, i);
        if (iS == i2) {
            return;
        }
        throw new spq("Expected size " + i2 + " got " + iS + " (0x" + java.lang.Integer.toHexString(iS) + ")", parcel);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static void ai(android.os.Parcel parcel, int i) throws spq {
        parcel.setDataPosition(parcel.dataPosition() + S(parcel, i));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static boolean aj(android.os.Parcel parcel, int i) throws spq {
        ah(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static byte[] ak(android.os.Parcel parcel, int i) throws spq {
        int iS = S(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iS);
        return bArrCreateByteArray;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static int[] al(android.os.Parcel parcel, int i) throws spq {
        int iS = S(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iS);
        return iArrCreateIntArray;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static java.lang.Object[] am(android.os.Parcel parcel, int i, android.os.Parcelable.Creator creator) throws spq {
        int iS = S(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        java.lang.Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iS);
        return objArrCreateTypedArray;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static java.lang.String[] an(android.os.Parcel parcel, int i) throws spq {
        int iS = S(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        java.lang.String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iS);
        return strArrCreateStringArray;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static byte[][] ao(android.os.Parcel parcel, int i) throws spq {
        int iS = S(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iS);
        return bArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    public static void ap(android.os.Parcel parcel, int i, int i2) throws spq {
        if (i == i2) {
            return;
        }
        throw new spq("Expected size " + i2 + " got " + i + " (0x" + java.lang.Integer.toHexString(i) + ")", parcel);
    }

    public static void aq(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void ar(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
    }

    public static void as(android.os.Handler handler) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            java.lang.String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new java.lang.IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void at(java.lang.String str) {
        if (!defpackage.tis.u()) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static void au(java.lang.String str) {
        if (defpackage.tis.u()) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static void av(boolean z) {
        if (!z) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void aw(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException((java.lang.String) obj);
        }
    }

    public static void ax(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void ay(java.lang.String str, java.lang.Object obj) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException((java.lang.String) obj);
        }
    }

    public static void az() {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        if (looperMyLooper != null && j$.util.Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new java.lang.IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
    }

    public static java.lang.Integer bA(android.content.Context context, int i) {
        android.util.TypedValue typedValueBo = bo(context.getTheme(), i);
        if (typedValueBo != null) {
            return java.lang.Integer.valueOf(by(context, typedValueBo));
        }
        return null;
    }

    public static boolean bB(int i) {
        return i != 0 && defpackage.dvk.b(i) > 0.5d;
    }

    public static int bC(android.content.Context context, java.lang.String str) {
        return by(context, bp(context, 2130969016, str));
    }

    public static android.net.Uri bD(android.net.Uri uri, java.lang.String str) {
        return uri.buildUpon().path(java.lang.String.valueOf(uri.getPath()).concat(str)).build();
    }

    public static defpackage.zhs bE(defpackage.zhs zhsVar) {
        defpackage.xye xyeVar = new defpackage.xye();
        defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
        int i = defpackage.zgh.c;
        defpackage.zgg zggVar = new defpackage.zgg(zhsVar, xyeVar);
        zhsVar.c(zggVar, defpackage.ysr.ch(zgtVar, zggVar));
        return zggVar;
    }

    public static void bF(defpackage.why whyVar, java.util.HashMap map) {
        java.lang.String strA = whyVar.a();
        defpackage.ysr.bc(!map.containsKey(strA), "There is already a factory registered for the ID %s", strA);
        map.put(strA, whyVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wgg */
    public static java.io.File bG(android.net.Uri uri) throws wgg {
        if (!uri.getScheme().equals("file")) {
            throw new wgg("Scheme must be 'file'");
        }
        if (!android.text.TextUtils.isEmpty(uri.getQuery())) {
            throw new wgg("Did not expect uri to have query");
        }
        if (android.text.TextUtils.isEmpty(uri.getAuthority())) {
            return new java.io.File(uri.getPath());
        }
        throw new wgg("Did not expect uri to have authority");
    }

    public static java.io.File bH(android.content.Context context) {
        java.io.File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        android.os.SystemClock.sleep(100L);
        java.io.File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        throw new java.lang.IllegalStateException("getFilesDir returned null twice.");
    }

    public static void bI(defpackage.zhs zhsVar) {
        zhsVar.c(new defpackage.wyl(zhsVar, 1), defpackage.zgt.INSTANCE);
    }

    public static /* synthetic */ boolean bJ(java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray, int i, java.lang.Object obj) {
        while (!atomicReferenceArray.compareAndSet(i, null, obj)) {
            if (atomicReferenceArray.get(i) != null) {
                return false;
            }
        }
        return true;
    }

    public static int bK(int i) {
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static void bL(java.util.logging.Level level, java.util.concurrent.Executor executor, java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        executor.execute(defpackage.xvx.c(new defpackage.sbn(level, th, str, objArr, 12)));
    }

    public static java.lang.Object bM(defpackage.was wasVar) {
        try {
            return wasVar.a();
        } catch (java.lang.SecurityException unused) {
            long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                return wasVar.a();
            } finally {
                android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    public static /* synthetic */ ajgy bN() {
        try {
            return defpackage.abox.x(ajgy.a, android.util.Base64.decode("EAAYAg==", 3));
        } catch (defpackage.abpp e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public static /* synthetic */ ajgy bO() {
        try {
            return defpackage.abox.x(ajgy.a, android.util.Base64.decode("EOgHGAQ=", 3));
        } catch (defpackage.abpp e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public static defpackage.vrp bP(defpackage.xyn xynVar, defpackage.afak afakVar) {
        return (defpackage.vrp) ((defpackage.afak) xynVar.d(afakVar)).a();
    }

    public static defpackage.zhs bQ(defpackage.swx swxVar) {
        final defpackage.vbu vbuVar = new defpackage.vbu(swxVar);
        swxVar.i(defpackage.zgt.INSTANCE, new defpackage.swq() { // from class: vbt
            @Override // defpackage.swq
            public final void a(defpackage.swx swxVar2) {
                boolean z = ((defpackage.sxc) swxVar2).c;
                defpackage.vbu vbuVar2 = vbuVar;
                if (z) {
                    vbuVar2.cancel(false);
                    return;
                }
                if (swxVar2.g()) {
                    vbuVar2.o(swxVar2.e());
                    return;
                }
                java.lang.Exception excD = swxVar2.d();
                if (excD == null) {
                    throw new java.lang.IllegalStateException();
                }
                vbuVar2.p(excD);
            }
        });
        return vbuVar;
    }

    public static int bR(android.content.Context context, int i) {
        context.getClass();
        return bU(context, i);
    }

    public static android.content.res.ColorStateList bS(android.content.Context context, int i) {
        context.getClass();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        typedArrayObtainStyledAttributes.getClass();
        android.util.TypedValue typedValue = new android.util.TypedValue();
        typedArrayObtainStyledAttributes.getValue(0, typedValue);
        android.content.res.ColorStateList colorStateListBS = typedValue.type == 2 ? bS(context, typedValue.data) : typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        return colorStateListBS;
    }

    public static boolean bT(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{2130969088});
        typedArrayObtainStyledAttributes.getClass();
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public static int bU(android.content.Context context, int i) {
        context.getClass();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        typedArrayObtainStyledAttributes.getClass();
        android.util.TypedValue typedValue = new android.util.TypedValue();
        typedArrayObtainStyledAttributes.getValue(0, typedValue);
        return typedValue.type == 2 ? bU(context, typedValue.data) : typedArrayObtainStyledAttributes.getColor(0, -1);
    }

    private static java.lang.Object bV(defpackage.swx swxVar) throws java.util.concurrent.ExecutionException {
        if (swxVar.g()) {
            return swxVar.e();
        }
        if (((defpackage.sxc) swxVar).c) {
            throw new java.util.concurrent.CancellationException("Task is already canceled");
        }
        throw new java.util.concurrent.ExecutionException(swxVar.d());
    }

    public static /* synthetic */ java.lang.String ba(int i) {
        if (i == 1) {
            return "MEDIA_MESSAGE_DATA";
        }
        if (i == 2) {
            return "MEDIA_MESSAGE_CODEC_CONFIG";
        }
        switch (i) {
            case 32769:
                return "MEDIA_MESSAGE_SETUP";
            case 32770:
                return "MEDIA_MESSAGE_START";
            case 32771:
                return "MEDIA_MESSAGE_STOP";
            case 32772:
                return "MEDIA_MESSAGE_CONFIG";
            case 32773:
                return "MEDIA_MESSAGE_ACK";
            case 32774:
                return "MEDIA_MESSAGE_MICROPHONE_REQUEST";
            case 32775:
                return "MEDIA_MESSAGE_MICROPHONE_RESPONSE";
            case 32776:
                return "MEDIA_MESSAGE_VIDEO_FOCUS_REQUEST";
            case 32777:
                return "MEDIA_MESSAGE_VIDEO_FOCUS_NOTIFICATION";
            case 32778:
                return "MEDIA_MESSAGE_UPDATE_UI_CONFIG_REQUEST";
            case 32779:
                return "MEDIA_MESSAGE_UPDATE_UI_CONFIG_REPLY";
            case 32780:
                return "MEDIA_MESSAGE_AUDIO_UNDERFLOW_NOTIFICATION";
            case 32781:
                return "MEDIA_MESSAGE_ACTION_TAKEN_NOTIFICATION";
            case 32782:
                return "MEDIA_MESSAGE_INTEGRATED_OVERLAY_PARAMETERS_NOTIFICATION";
            case 32783:
                return "MEDIA_MESSAGE_INTEGRATED_OVERLAY_START_NOTIFICATION";
            case 32784:
                return "MEDIA_MESSAGE_INTEGRATED_OVERLAY_STOP_NOTIFICATION";
            case 32785:
                return "MEDIA_MESSAGE_INTEGRATED_OVERLAY_SESSION_DATA_UPDATE";
            case 32786:
                return "MEDIA_MESSAGE_UPDATE_HU_UI_CONFIG_REQUEST";
            case 32787:
                return "MEDIA_MESSAGE_UPDATE_HU_UI_CONFIG_RESPONSE";
            case 32788:
                return "MEDIA_MESSAGE_MEDIA_STATS";
            case 32789:
                return "MEDIA_MESSAGE_MEDIA_OPTIONS";
            case 32790:
                return "MEDIA_MESSAGE_CRITICAL_UI_NOTIFICATION";
            default:
                return "null";
        }
    }

    public static int bb(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        switch (i) {
            case 32768:
                return 32769;
            case 32769:
                return 32770;
            case 32770:
                return 32771;
            case 32771:
                return 32772;
            case 32772:
                return 32773;
            case 32773:
                return 32774;
            case 32774:
                return 32775;
            case 32775:
                return 32776;
            case 32776:
                return 32777;
            case 32777:
                return 32778;
            case 32778:
                return 32779;
            case 32779:
                return 32780;
            case 32780:
                return 32781;
            case 32781:
                return 32782;
            case 32782:
                return 32783;
            case 32783:
                return 32784;
            case 32784:
                return 32785;
            case 32785:
                return 32786;
            case 32786:
                return 32787;
            case 32787:
                return 32788;
            case 32788:
                return 32789;
            case 32789:
                return 32790;
            default:
                return 0;
        }
    }

    public static /* synthetic */ java.lang.String bc(int i) {
        if (i == 255) {
            return "MESSAGE_UNEXPECTED_MESSAGE";
        }
        if (i == 4095) {
            return "MESSAGE_INTERNAL_ERROR";
        }
        if (i == 57005) {
            return "MESSAGE_HARD_SHUTDOWN";
        }
        if (i == 65535) {
            return "MESSAGE_FRAMING_ERROR";
        }
        switch (i) {
            case 1:
                return "MESSAGE_VERSION_REQUEST";
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return "MESSAGE_VERSION_RESPONSE";
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return "MESSAGE_ENCAPSULATED_SSL";
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return "MESSAGE_AUTH_COMPLETE";
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return "MESSAGE_SERVICE_DISCOVERY_REQUEST";
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return "MESSAGE_SERVICE_DISCOVERY_RESPONSE";
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return "MESSAGE_CHANNEL_OPEN_REQUEST";
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return "MESSAGE_CHANNEL_OPEN_RESPONSE";
            case 9:
                return "MESSAGE_CHANNEL_CLOSE_NOTIFICATION";
            default:
                switch (i) {
                    case 11:
                        return "MESSAGE_PING_REQUEST";
                    case 12:
                        return "MESSAGE_PING_RESPONSE";
                    case 13:
                        return "MESSAGE_NAV_FOCUS_REQUEST";
                    case 14:
                        return "MESSAGE_NAV_FOCUS_NOTIFICATION";
                    case 15:
                        return "MESSAGE_BYEBYE_REQUEST";
                    case 16:
                        return "MESSAGE_BYEBYE_RESPONSE";
                    case 17:
                        return "MESSAGE_VOICE_SESSION_NOTIFICATION";
                    case 18:
                        return "MESSAGE_AUDIO_FOCUS_REQUEST";
                    case 19:
                        return "MESSAGE_AUDIO_FOCUS_NOTIFICATION";
                    case 20:
                        return "MESSAGE_CAR_CONNECTED_DEVICES_REQUEST";
                    case 21:
                        return "MESSAGE_CAR_CONNECTED_DEVICES_RESPONSE";
                    case 22:
                        return "MESSAGE_USER_SWITCH_REQUEST";
                    case 23:
                        return "MESSAGE_BATTERY_STATUS_NOTIFICATION";
                    case 24:
                        return "MESSAGE_CALL_AVAILABILITY_STATUS";
                    case 25:
                        return "MESSAGE_USER_SWITCH_RESPONSE";
                    case 26:
                        return "MESSAGE_SERVICE_DISCOVERY_UPDATE";
                    default:
                        return "null";
                }
        }
    }

    public static int bd(int i) {
        int i2 = 255;
        if (i != 255) {
            i2 = 4095;
            if (i != 4095) {
                i2 = 57005;
                if (i != 57005) {
                    i2 = 65535;
                    if (i != 65535) {
                        switch (i) {
                            case 1:
                                return 1;
                            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                return 2;
                            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                return 3;
                            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                return 4;
                            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                return 5;
                            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                return 6;
                            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                return 7;
                            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                return 8;
                            case 9:
                                return 9;
                            default:
                                switch (i) {
                                    case 11:
                                        return 11;
                                    case 12:
                                        return 12;
                                    case 13:
                                        return 13;
                                    case 14:
                                        return 14;
                                    case 15:
                                        return 15;
                                    case 16:
                                        return 16;
                                    case 17:
                                        return 17;
                                    case 18:
                                        return 18;
                                    case 19:
                                        return 19;
                                    case 20:
                                        return 20;
                                    case 21:
                                        return 21;
                                    case 22:
                                        return 22;
                                    case 23:
                                        return 23;
                                    case 24:
                                        return 24;
                                    case 25:
                                        return 25;
                                    case 26:
                                        return 26;
                                    default:
                                        return 0;
                                }
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ java.lang.String be(int i) {
        if (i == 1) {
            return "AUDIO_STREAM_GUIDANCE";
        }
        if (i != 2) {
            return i != 3 ? "AUDIO_STREAM_TELEPHONY" : "AUDIO_STREAM_MEDIA";
        }
        return "AUDIO_STREAM_SYSTEM_AUDIO";
    }

    public static void bf() {
        defpackage.sqs sqsVar = defpackage.wzc.a.e;
    }

    public static int bg(android.content.Context context, android.content.res.TypedArray typedArray, int i, int i2) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static int bh(android.content.res.TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    public static android.content.res.ColorStateList bi(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        int resourceId;
        android.content.res.ColorStateList colorStateListD;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListD = defpackage.duw.d(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListD;
    }

    public static android.graphics.drawable.Drawable bj(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        int resourceId;
        android.graphics.drawable.Drawable drawableE;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableE = defpackage.ca.e(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableE;
    }

    public static boolean bk(android.content.Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean bl(android.content.Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static int bm(android.content.Context context, int i, int i2) {
        android.util.TypedValue typedValueBo = bo(context.getTheme(), i);
        return (typedValueBo == null || typedValueBo.type != 16) ? i2 : typedValueBo.data;
    }

    public static android.util.TypedValue bn(android.content.Context context, int i) {
        return bo(context.getTheme(), i);
    }

    public static android.util.TypedValue bo(android.content.res.Resources.Theme theme, int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static android.util.TypedValue bp(android.content.Context context, int i, java.lang.String str) {
        android.util.TypedValue typedValueBn = bn(context, i);
        if (typedValueBn != null) {
            return typedValueBn;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static boolean bq(android.content.Context context, int i, boolean z) {
        return br(context.getTheme(), i, z);
    }

    public static boolean br(android.content.res.Resources.Theme theme, int i, boolean z) {
        android.util.TypedValue typedValueBo = bo(theme, i);
        if (typedValueBo == null || typedValueBo.type != 18) {
            return z;
        }
        return typedValueBo.data != 0;
    }

    public static int bs(android.content.Context context, java.lang.String str) {
        return bp(context, 2130969886, str).data;
    }

    public static android.content.res.ColorStateList bt(android.content.Context context, defpackage.lam lamVar, int i) {
        int iQ;
        android.content.res.ColorStateList colorStateListD;
        return (!lamVar.y(i) || (iQ = lamVar.q(i, 0)) == 0 || (colorStateListD = defpackage.duw.d(context, iQ)) == null) ? lamVar.r(i) : colorStateListD;
    }

    public static int bu(int i, int i2) {
        return defpackage.dvk.e(i, (android.graphics.Color.alpha(i) * i2) / 255);
    }

    public static int bv(android.view.View view, int i) {
        return by(view.getContext(), bp(view.getContext(), i, view.getClass().getCanonicalName()));
    }

    public static int bw(android.content.Context context, int i, int i2) {
        java.lang.Integer numBA = bA(context, i);
        return numBA != null ? numBA.intValue() : i2;
    }

    public static int bx(int i, int i2, float f) {
        return defpackage.dvk.d(defpackage.dvk.e(i2, java.lang.Math.round(android.graphics.Color.alpha(i2) * f)), i);
    }

    public static int by(android.content.Context context, android.util.TypedValue typedValue) {
        return typedValue.resourceId != 0 ? context.getColor(typedValue.resourceId) : typedValue.data;
    }

    public static android.content.res.ColorStateList bz(android.content.Context context, int i) {
        android.util.TypedValue typedValueBn = bn(context, i);
        if (typedValueBn == null) {
            return null;
        }
        if (typedValueBn.resourceId != 0) {
            return defpackage.duw.d(context, typedValueBn.resourceId);
        }
        if (typedValueBn.data != 0) {
            return android.content.res.ColorStateList.valueOf(typedValueBn.data);
        }
        return null;
    }

    public static android.os.StrictMode.VmPolicy.Builder c(android.os.StrictMode.VmPolicy.Builder builder) {
        return a$.ExternalSyntheticApiModelOutline0.m(builder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (defpackage.dwc.a("VanillaIceCream", r0) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d() {
        /*
            int r0 = defpackage.dwc.a
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
            boolean r0 = defpackage.dwc.a(r1, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sqs.d():boolean");
    }

    public static boolean e() {
        return android.os.Build.VERSION.SDK_INT >= 29;
    }

    public static boolean f() {
        return android.os.Build.VERSION.SDK_INT >= 31;
    }

    public static java.lang.Object[] fC(java.lang.Object[]... objArr) {
        int length = 0;
        for (int i = 0; i < 2; i++) {
            length += objArr[i].length;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr[0], length);
        int length2 = objArr[0].length;
        for (char c = 1; c < 2; c = 2) {
            java.lang.Object[] objArr2 = objArr[1];
            int length3 = objArr2.length;
            java.lang.System.arraycopy(objArr2, 0, objArrCopyOf, length2, length3);
            length2 += length3;
        }
        return objArrCopyOf;
    }

    public static java.util.concurrent.ScheduledExecutorService fD() {
        return java.util.concurrent.Executors.unconfigurableScheduledExecutorService(java.util.concurrent.Executors.newScheduledThreadPool(1, new defpackage.sto(0)));
    }

    public static boolean fE(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static java.util.concurrent.ExecutorService h(int i) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(i, i, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new defpackage.sto(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static int i(java.lang.Object[] objArr, java.lang.Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (j$.util.Objects.equals(objArr[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public static com.google.android.gms.common.internal.safeparcel.SafeParcelable l(byte[] bArr, android.os.Parcelable.Creator creator) {
        if (creator == null) {
            throw new java.lang.NullPointerException("null reference");
        }
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelable safeParcelable = (com.google.android.gms.common.internal.safeparcel.SafeParcelable) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return safeParcelable;
    }

    public static com.google.android.gms.common.internal.safeparcel.SafeParcelable m(java.lang.String str, android.os.Parcelable.Creator creator) {
        return l(android.util.Base64.decode(str, 10), creator);
    }

    public static java.lang.String n(com.google.android.gms.common.internal.safeparcel.SafeParcelable safeParcelable) {
        byte[] bArrO = o(safeParcelable);
        if (bArrO == null) {
            return null;
        }
        return android.util.Base64.encodeToString(bArrO, 10);
    }

    public static byte[] o(com.google.android.gms.common.internal.safeparcel.SafeParcelable safeParcelable) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        safeParcelable.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static int p(android.os.Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void q(android.os.Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void r(android.os.Parcel parcel, int i, boolean z) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void s(android.os.Parcel parcel, int i, byte b) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(b);
    }

    public static void t(android.os.Parcel parcel, int i, double d) {
        parcel.writeInt(i | 524288);
        parcel.writeDouble(d);
    }

    public static void u(android.os.Parcel parcel, int i, float f) {
        parcel.writeInt(i | 262144);
        parcel.writeFloat(f);
    }

    public static void v(android.os.Parcel parcel, int i, int i2) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(i2);
    }

    public static void w(android.os.Parcel parcel, int i, long j) {
        parcel.writeInt(i | 524288);
        parcel.writeLong(j);
    }

    public static void x(android.os.Parcel parcel, android.os.Parcelable parcelable, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    public static void y(android.os.Parcel parcel, int i, android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iP = p(parcel, i);
        parcel.writeBundle(bundle);
        q(parcel, iP);
    }

    public static void z(android.os.Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iP = p(parcel, i);
        parcel.writeByteArray(bArr);
        q(parcel, iP);
    }

    public defpackage.slr a(android.content.Context context, android.os.Looper looper, defpackage.som somVar, java.lang.Object obj, defpackage.smx smxVar, defpackage.snr snrVar) {
        throw new java.lang.UnsupportedOperationException("buildClient must be implemented");
    }

    @java.lang.Deprecated
    public defpackage.slr b(android.content.Context context, android.os.Looper looper, defpackage.som somVar, java.lang.Object obj, defpackage.slx slxVar, defpackage.sly slyVar) {
        return a(context, looper, somVar, obj, slxVar, slyVar);
    }

    public sqs(byte[] bArr, char[] cArr) {
    }
}
