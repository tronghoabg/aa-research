package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Point;
import android.util.Base64;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.LatLngBounds;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class ysi {
    public ysi(Context context, std stdVar, psj psjVar, tnq tnqVar, float f) {
        new aacq(context, f, stdVar, tnqVar.r(), psjVar);
        gjv gjvVar = tnqVar.z;
    }

    public static int A(double d) {
        return (int) Math.round(Math.log(Math.tan((Math.toRadians(d) * 0.5d) + 0.7853981633974483d)) * 1.708913188941079E8d);
    }

    public static int B(double d) {
        return (int) Math.round(Math.toRadians(d) * 1.708913188941079E8d);
    }

    public static String C(absu absuVar) {
        byte[] bArrH = absuVar.h();
        abnr abnrVar = (abnr) absu.a.n();
        if ((absuVar.b & 1) != 0) {
            zkk zkkVar = absuVar.c;
            if (zkkVar == null) {
                zkkVar = zkk.a;
            }
            abnrVar.t();
            absu absuVar2 = (absu) abnrVar.b;
            zkkVar.getClass();
            absuVar2.c = zkkVar;
            absuVar2.b |= 1;
        }
        if (!absuVar.d.isEmpty()) {
            String str = absuVar.d;
            abnrVar.t();
            absu absuVar3 = (absu) abnrVar.b;
            str.getClass();
            absuVar3.b |= 2;
            absuVar3.d = str;
        }
        if (Arrays.equals(((absu) abnrVar.q()).h(), bArrH)) {
            return Base64.encodeToString(bArrH, 11);
        }
        throw new IllegalArgumentException("The place id is not normalized");
    }

    public static Path D(String str, float f) {
        Path path = new Path();
        ArrayList<List> arrayList = new ArrayList();
        Iterable iterableG = xxx.c(' ').g(str.replaceAll("([A-Za-z])", "\n$1").replaceAll("[\\t\\n\\r]+", " "));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = iterableG.iterator();
        while (it.hasNext()) {
            String strTrim = ((String) it.next()).trim();
            if (!strTrim.isEmpty()) {
                arrayList2.add(strTrim);
            }
        }
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList2.get(i);
            if (Character.isLetter(str2.charAt(0))) {
                arrayList.add(new ArrayList());
            }
            ((List) yrm.an(arrayList)).add(str2);
        }
        for (List<String> list : arrayList) {
            for (String str3 : list) {
                ArrayList arrayList3 = new ArrayList();
                int i2 = 0;
                while (i2 < list.size()) {
                    String strReplaceAll = (String) list.get(i2);
                    if (i2 == 0) {
                        strReplaceAll = strReplaceAll.replaceAll("[A-Za-z]+", "");
                        i2 = 0;
                    }
                    if (!strReplaceAll.isEmpty()) {
                        arrayList3.add(Float.valueOf(Float.parseFloat(strReplaceAll) * f));
                    }
                    i2++;
                }
                if (str3.startsWith("M") || str3.startsWith("m")) {
                    path.moveTo(((Float) arrayList3.get(0)).floatValue(), ((Float) arrayList3.get(1)).floatValue());
                } else if (str3.startsWith("C") || str3.startsWith("c")) {
                    path.cubicTo(((Float) arrayList3.get(0)).floatValue(), ((Float) arrayList3.get(1)).floatValue(), ((Float) arrayList3.get(2)).floatValue(), ((Float) arrayList3.get(3)).floatValue(), ((Float) arrayList3.get(4)).floatValue(), ((Float) arrayList3.get(5)).floatValue());
                }
            }
        }
        path.close();
        return path;
    }

    public static void E(StringBuffer stringBuffer, String str, String str2) {
        if (stringBuffer.length() > 0) {
            stringBuffer.append(str2);
        }
        stringBuffer.append(str);
    }

    public static zbu F(zyb zybVar, zbi zbiVar, String str) {
        return (zbu) G(zybVar, zbiVar, str).q();
    }

    public static abnp G(zyb zybVar, zbi zbiVar, String str) {
        abnp abnpVarN = zbu.a.n();
        abnpVarN.t();
        zbu zbuVar = (zbu) abnpVarN.b;
        zbuVar.g = 1;
        zbuVar.b |= 32;
        abnpVarN.t();
        zbu zbuVar2 = (zbu) abnpVarN.b;
        zbuVar2.c |= 33554432;
        zbuVar2.k = "3.4.0";
        ved vedVar = vjb.a;
        abnpVarN.t();
        zbu zbuVar3 = (zbu) abnpVarN.b;
        zbuVar3.j = 3;
        zbuVar3.c |= 8388608;
        if (zybVar.k != null) {
            zav zavVar = zybVar.k.o;
            if (zavVar == null) {
                zavVar = zav.a;
            }
            abnpVarN.t();
            zbu zbuVar4 = (zbu) abnpVarN.b;
            zavVar.getClass();
            zbuVar4.i = zavVar;
            zbuVar4.c |= 2097152;
        }
        abnpVarN.t();
        zbu zbuVar5 = (zbu) abnpVarN.b;
        zbuVar5.c |= 262144;
        zbuVar5.h = true;
        abnpVarN.t();
        zbu zbuVar6 = (zbu) abnpVarN.b;
        zbuVar6.d |= 16;
        zbuVar6.p = true;
        abnpVarN.t();
        zbu zbuVar7 = (zbu) abnpVarN.b;
        zbuVar7.d |= 64;
        zbuVar7.q = 0;
        if (zbiVar != null && !zbiVar.b.isEmpty()) {
            if (zrn.e("DataRequestDispatcher", 3)) {
                Log.d("DataRequestDispatcher", "Included server version metadata in dimens");
            }
            abnpVarN.t();
            zbu zbuVar8 = (zbu) abnpVarN.b;
            zbuVar8.n = zbiVar;
            zbuVar8.c |= 1073741824;
        }
        abnpVarN.t();
        zbu zbuVar9 = (zbu) abnpVarN.b;
        str.getClass();
        zbuVar9.d |= 8192;
        zbuVar9.r = str;
        return abnpVarN;
    }

    public static double H(LatLng latLng, double d) {
        return Math.toDegrees(d / (Math.cos(Math.toRadians(latLng.latitude)) * 6371009.0d));
    }

    public static double I(double d, double d2) {
        double dAbs = Math.abs(d - d2);
        return Math.min(dAbs, 360.0d - dAbs);
    }

    public static float J(LatLng latLng, LatLng latLng2) {
        double d = latLng.latitude;
        return ((float) Math.toDegrees(Math.atan2((latLng2.longitude - latLng.longitude) * Math.cos(Math.toRadians(d)), latLng2.latitude - d))) - (((float) Math.floor(r8 / 360.0f)) * 360.0f);
    }

    static LatLng K(LatLng latLng, LatLng latLng2) {
        if (O(latLng, latLng2)) {
            return new LatLng(0.0d, (latLng.longitude + latLng2.longitude) / 2.0d);
        }
        zxt zxtVarB = zxt.b(latLng);
        zxt zxtVarB2 = zxt.b(latLng2);
        double d = zxtVarB.a;
        double d2 = zxtVarB2.a;
        return new zxt((d + d2) / 2.0d, (zxtVarB.b + zxtVarB2.b) / 2.0d, (zxtVarB.c + zxtVarB2.c) / 2.0d).a();
    }

    public static LatLng L(LatLng latLng, LatLng latLng2, double d) {
        if (O(latLng, latLng2)) {
            LatLng latLngK = K(latLng, latLng2);
            if (d <= 0.5d) {
                return L(latLng, latLngK, d + d);
            }
            double d2 = d - 0.5d;
            return L(latLngK, latLng2, d2 + d2);
        }
        zxt zxtVarB = zxt.b(latLng);
        zxt zxtVarB2 = zxt.b(latLng2);
        double dAcos = Math.acos(Math.min(1.0d, Math.max(-1.0d, (zxtVarB.a * zxtVarB2.a) + (zxtVarB.b * zxtVarB2.b) + (zxtVarB.c * zxtVarB2.c))));
        double dSin = Math.sin(dAcos);
        if (dSin < 1.0E-6d) {
            return new LatLng(latLng.latitude, latLng.longitude);
        }
        double dSin2 = Math.sin((1.0d - d) * dAcos) / dSin;
        double dSin3 = Math.sin(dAcos * d) / dSin;
        zxt zxtVarC = zxtVarB.c(dSin2);
        zxt zxtVarC2 = zxtVarB2.c(dSin3);
        return new zxt(zxtVarC.a + zxtVarC2.a, zxtVarC.b + zxtVarC2.b, zxtVarC.c + zxtVarC2.c).a();
    }

    public static LatLngBounds M(LatLng latLng, double d, double d2, double d3, double d4) {
        zkt.n(latLng, "Null anchor");
        aclh.o(d3 >= 0.0d, "Negative latSpan: %s", new Object[]{Double.valueOf(d3)});
        aclh.o(d4 >= 0.0d, "Negative lngSpan: %s", new Object[]{Double.valueOf(d4)});
        double dMin = Math.min(359.999999d, d4);
        double d5 = latLng.latitude;
        double d6 = (d3 * d2) + d5;
        double d7 = d5 - (d3 * (1.0d - d2));
        double d8 = latLng.longitude;
        return new LatLngBounds(new LatLng(d7, d8 - (dMin * d)), new LatLng(d6, d8 + (dMin * (1.0d - d))));
    }

    public static void N(List list, List list2, List list3) {
        zkt.n(list, "Null inputPoints");
        zkt.n(list2, "Null outputPoints");
        list2.clear();
        list3.clear();
        if (list.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(list);
        LinkedList linkedList = new LinkedList(list);
        LatLng latLng = (LatLng) linkedList.removeFirst();
        while (!linkedList.isEmpty()) {
            LatLng latLng2 = (LatLng) linkedList.getFirst();
            if (Math.max(Math.abs(latLng.latitude - latLng2.latitude), I(latLng.longitude, latLng2.longitude)) < 4.0d) {
                list2.add(latLng);
                if (hashSet.contains(latLng)) {
                    list3.add(Integer.valueOf(list2.size() - 1));
                }
                latLng = (LatLng) linkedList.removeFirst();
            } else {
                linkedList.addFirst(K(latLng, latLng2));
            }
        }
        list2.add(latLng);
        list3.add(Integer.valueOf(list2.size() - 1));
    }

    public static boolean O(LatLng latLng, LatLng latLng2) {
        return latLng.latitude == (-latLng2.latitude) && Math.abs(latLng.longitude - latLng2.longitude) == 180.0d;
    }

    public static Bitmap P(Bitmap bitmap, float f) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int i = height * width;
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArr2 = new int[i];
        float[] fArr = new float[3];
        for (int i2 = 0; i2 < i; i2++) {
            Color.colorToHSV(iArr[i2], fArr);
            fArr[0] = f;
            iArr2[i2] = Color.HSVToColor(Color.alpha(iArr[i2]), fArr);
        }
        return Bitmap.createBitmap(iArr2, 0, width, width, height, Bitmap.Config.ARGB_8888);
    }

    public static boolean Q(Context context) {
        if (context.getSystemService("accessibility") == null) {
            return false;
        }
        return ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
    }

    public static boolean R(String str) {
        return str == null || str.isEmpty();
    }

    public static String S(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

    public static void T(boolean z, Object obj) {
        if (z) {
            return;
        }
        zkt.n(obj, "Developer error message cannot be null.");
        throw new zsd(String.valueOf(obj));
    }

    public static void U(float f, String str) {
        if (Float.isNaN(f)) {
            throw new zsd(String.format("Zoom value is Float.NaN%s", String.format(": %s", str)));
        }
    }

    public static void V(boolean z, Object obj) {
        if (!z) {
            throw new zse((String) obj);
        }
    }

    public static void W(Object obj) {
        try {
            zrt.a.a();
        } catch (IllegalStateException e) {
            throw new zse(String.valueOf(obj), e);
        }
    }

    public static void X(Object obj, Object obj2) {
        if (obj == null) {
            throw new zsf((String) obj2);
        }
    }

    private static void Y(abnr abnrVar, int i) {
        abnr abnrVar2 = (abnr) abgd.a.n();
        abnrVar2.t();
        abgd abgdVar = (abgd) abnrVar2.b;
        abgdVar.c = i - 1;
        abgdVar.b |= 1;
        abnrVar2.t();
        abgd abgdVar2 = (abgd) abnrVar2.b;
        abgdVar2.b |= 4;
        abgdVar2.e = 999999;
        abgd abgdVar3 = (abgd) abnrVar2.q();
        abnrVar.t();
        abgj abgjVar = (abgj) abnrVar.b;
        abgj abgjVar2 = abgj.a;
        abgdVar3.getClass();
        abgjVar.b();
        abgjVar.d.add(abgdVar3);
    }

    public static void a(String str, Object... objArr) {
        System.err.println(ysi.class.toString() + ": " + String.format(str, objArr));
    }

    public static char[] b(char[] cArr, int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }

    public static boolean c(Comparable comparable, Comparable comparable2) {
        return comparable2.compareTo(comparable) > 0;
    }

    public static boolean d(Comparable comparable, Comparable comparable2) {
        return comparable2.compareTo(comparable) < 0;
    }

    public static boolean e(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = yli.a;
            }
        } else {
            if (!(iterable instanceof ymr)) {
                return false;
            }
            comparator2 = ((ymr) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }

    public static void f(yks yksVar, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collectionC = yksVar.c(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                collectionC.add(objectInputStream.readObject());
            }
        }
    }

    public static void g(yks yksVar, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(yksVar.w().size());
        for (Map.Entry entry : yksVar.w().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static Iterator h(ylc ylcVar) {
        return new ylh(ylcVar, ylcVar.l().iterator());
    }

    public static void i(Object obj, Object obj2, Object obj3, List list) {
        list.add(yhe.o(obj, obj2, obj3));
    }

    public static Comparable j(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2) >= 0 ? comparable : comparable2;
    }

    public static Comparable k(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2) <= 0 ? comparable : comparable2;
    }

    public static boolean l(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean m(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static String n(Map map, xxd xxdVar, String str) throws IOException {
        yno ynoVarE = ((ylu) ((ylx) map).entrySet()).iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (ynoVarE.hasNext()) {
                Map.Entry entry = (Map.Entry) ynoVarE.next();
                sb.append(xxdVar.a(entry.getKey()));
                sb.append((CharSequence) "=");
                sb.append(xxdVar.a(entry.getValue()));
                while (ynoVarE.hasNext()) {
                    sb.append((CharSequence) xxdVar.c);
                    Map.Entry entry2 = (Map.Entry) ynoVarE.next();
                    sb.append(xxdVar.a(entry2.getKey()));
                    sb.append((CharSequence) "=");
                    sb.append(xxdVar.a(entry2.getValue()));
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static xul o() {
        final xty xtyVarA = xts.a(null);
        return new xul() { // from class: xuz
            @Override // defpackage.xul, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                xts.a(xtyVarA);
            }
        };
    }

    public static void p(xuk xukVar) {
        String strC = xukVar.c();
        AtomicReference atomicReference = xts.a;
        if (strC.length() > 127) {
            strC.substring(0, 127);
        }
    }

    public static void q(xuk xukVar) {
        if (s(xukVar) || xukVar.a() == null) {
            xukVar.d();
            p(xukVar);
        } else {
            q(xukVar.a());
            p(xukVar);
        }
    }

    public static void r(xuk xukVar) {
        if (s(xukVar) || xukVar.a() == null) {
            return;
        }
        r(xukVar.a());
    }

    public static boolean s(xuk xukVar) {
        return xukVar.e() != Thread.currentThread();
    }

    static int t(int i, double d) {
        return Math.min((int) Math.ceil(i / d), (int) Math.floor(2048.0d / d));
    }

    static int u(double d) {
        return (int) Math.round(d * 1.0E7d);
    }

    public static String v(abgj abgjVar, String str) {
        return a.bJ(Base64.encodeToString(abgjVar.h(), 10), str, "bpb=");
    }

    public static abnp w(abgj abgjVar) {
        if ((abgjVar.b & 2) == 0) {
            return abgm.a.n();
        }
        abgm abgmVar = abgjVar.e;
        if (abgmVar == null) {
            abgmVar = abgm.a;
        }
        return abgm.a.o(abgmVar);
    }

    public static void x(abnr abnrVar, aaao aaaoVar) {
        CameraPosition cameraPosition = aaaoVar.e;
        int i = (int) cameraPosition.zoom;
        abnp abnpVarN = abgt.a.n();
        abnp abnpVarN2 = abfz.a.n();
        abnpVarN2.t();
        abfz abfzVar = (abfz) abnpVarN2.b;
        abfzVar.b |= 1;
        abfzVar.c = i;
        abnp abnpVarN3 = abgs.a.n();
        int i2 = aaaoVar.f;
        double d = aaaoVar.h;
        int iT = t(i2, d);
        abnpVarN3.t();
        abgs abgsVar = (abgs) abnpVarN3.b;
        abgsVar.b |= 1;
        abgsVar.c = iT;
        int i3 = aaaoVar.g;
        int iT2 = t(i3, d);
        abnpVarN3.t();
        abgs abgsVar2 = (abgs) abnpVarN3.b;
        abgsVar2.b |= 2;
        abgsVar2.d = iT2;
        abgs abgsVar3 = (abgs) abnpVarN3.q();
        abnpVarN2.t();
        abfz abfzVar2 = (abfz) abnpVarN2.b;
        abgsVar3.getClass();
        abfzVar2.d = abgsVar3;
        abfzVar2.b |= 8;
        abnp abnpVarN4 = zkl.a.n();
        LatLng latLngB = (aaaoVar.a == aaaoVar.c && aaaoVar.b == aaaoVar.d) ? cameraPosition.target : aaaoVar.b(new Point(i2 / 2, i3 / 2));
        int iU = u(latLngB.latitude);
        abnpVarN4.t();
        zkl zklVar = (zkl) abnpVarN4.b;
        zklVar.b |= 1;
        zklVar.c = iU;
        int iU2 = u(latLngB.longitude);
        abnpVarN4.t();
        zkl zklVar2 = (zkl) abnpVarN4.b;
        zklVar2.b |= 2;
        zklVar2.d = iU2;
        zkl zklVar3 = (zkl) abnpVarN4.q();
        abnpVarN2.t();
        abfz abfzVar3 = (abfz) abnpVarN2.b;
        zklVar3.getClass();
        abfzVar3.e = zklVar3;
        abfzVar3.b |= 16;
        abfz abfzVar4 = (abfz) abnpVarN2.q();
        abnpVarN.t();
        abgt abgtVar = (abgt) abnpVarN.b;
        abfzVar4.getClass();
        abgtVar.d = abfzVar4;
        abgtVar.b |= 16;
        abnrVar.bf((abgt) abnpVarN.q());
    }

    public static void y(abnr abnrVar, abnp abnpVar, int i) {
        zkt.e(i != 0, "Shouldn't fetch for MAP_TYPE_NONE");
        if (i == 1) {
            abnr abnrVar2 = (abnr) abha.a.n();
            abnrVar2.t();
            abha abhaVar = (abha) abnrVar2.b;
            abhaVar.c = 37;
            abhaVar.b |= 1;
            abnp abnpVarN = abgz.a.n();
            abnpVarN.t();
            abgz abgzVar = (abgz) abnpVarN.b;
            abgzVar.b |= 1;
            abgzVar.c = "smartmaps";
            abnrVar2.bi((abgz) abnpVarN.q());
            abnpVar.ab((abha) abnrVar2.q());
        } else {
            if (i == 2) {
                Y(abnrVar, 2);
                return;
            }
            if (i == 3) {
                Y(abnrVar, 5);
                Y(abnrVar, 1);
                abnr abnrVar3 = (abnr) abha.a.n();
                abnrVar3.t();
                abha abhaVar2 = (abha) abnrVar3.b;
                abhaVar2.c = 5;
                abhaVar2.b |= 1;
                abnpVar.ab((abha) abnrVar3.q());
                return;
            }
            if (i == 4) {
                Y(abnrVar, 2);
                Y(abnrVar, 1);
                abnr abnrVar4 = (abnr) abha.a.n();
                abnrVar4.t();
                abha abhaVar3 = (abha) abnrVar4.b;
                abhaVar3.c = 4;
                abhaVar3.b = 1 | abhaVar3.b;
                abnpVar.ab((abha) abnrVar4.q());
                return;
            }
        }
        Y(abnrVar, 1);
    }

    public static String z(abgj abgjVar, aaao aaaoVar, int i, ztc ztcVar, String str, String str2, List list) {
        abnr abnrVar = (abnr) abgj.a.o(abgjVar);
        abnrVar.t();
        ((abgj) abnrVar.b).i = abnw.a;
        abnrVar.t();
        abgj abgjVar2 = (abgj) abnrVar.b;
        abod abodVar = abgjVar2.i;
        if (!abodVar.c()) {
            abgjVar2.i = abnv.G(abodVar);
        }
        abmc.i(list, abgjVar2.i);
        abnp abnpVarW = w(abgjVar);
        abfw abfwVar = ((abgj) abnrVar.b).g;
        if (abfwVar == null) {
            abfwVar = abfw.a;
        }
        abnp abnpVarO = abfw.a.o(abfwVar);
        float f = (float) aaaoVar.h;
        abnpVarO.t();
        abfw abfwVar2 = (abfw) abnpVarO.b;
        abfwVar2.b |= 128;
        abfwVar2.c = f;
        abfw abfwVar3 = (abfw) abnpVarO.q();
        abnrVar.t();
        abgj abgjVar3 = (abgj) abnrVar.b;
        abfwVar3.getClass();
        abgjVar3.g = abfwVar3;
        abgjVar3.b |= 16;
        x(abnrVar, aaaoVar);
        if (ztcVar != null) {
            Y(abnrVar, 1);
            abnr abnrVar2 = (abnr) abha.a.n();
            abnrVar2.t();
            abha abhaVar = (abha) abnrVar2.b;
            abhaVar.c = 68;
            abhaVar.b |= 1;
            abnp abnpVarN = abgz.a.n();
            abnpVarN.t();
            abgz abgzVar = (abgz) abnpVarN.b;
            abgzVar.b |= 1;
            abgzVar.c = "set";
            abnpVarN.t();
            abgz abgzVar2 = (abgz) abnpVarN.b;
            abgzVar2.b |= 2;
            abgzVar2.d = true != ztcVar.b ? "RoadmapAmbiactive" : "RoadmapAmbiactiveLowBit";
            abnrVar2.bi((abgz) abnpVarN.q());
            abnpVarW.ab((abha) abnrVar2.q());
        } else {
            y(abnrVar, abnpVarW, i);
            if (!R(str2) && i == 1) {
                abnr abnrVar3 = (abnr) abha.a.n();
                abnrVar3.t();
                abha abhaVar2 = (abha) abnrVar3.b;
                abhaVar2.c = 26;
                abhaVar2.b |= 1;
                abnp abnpVarN2 = abgz.a.n();
                abnpVarN2.t();
                abgz abgzVar3 = (abgz) abnpVarN2.b;
                abgzVar3.b = 1 | abgzVar3.b;
                abgzVar3.c = "styles";
                abnpVarN2.t();
                abgz abgzVar4 = (abgz) abnpVarN2.b;
                str2.getClass();
                abgzVar4.b |= 2;
                abgzVar4.d = str2;
                abnrVar3.bi((abgz) abnpVarN2.q());
                abnpVarW.ab((abha) abnrVar3.q());
            }
        }
        abgm abgmVar = (abgm) abnpVarW.q();
        abnrVar.t();
        abgj abgjVar4 = (abgj) abnrVar.b;
        abgmVar.getClass();
        abgjVar4.e = abgmVar;
        abgjVar4.b |= 2;
        return v((abgj) abnrVar.q(), str);
    }

    protected ysi(byte[] bArr) {
    }

    private ysi() {
    }
}
