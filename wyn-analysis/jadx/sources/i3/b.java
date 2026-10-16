package i3;

import ad.r;
import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import ka.AbstractC3256n;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final r f36759a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f36760b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f36761c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f36762d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f36763e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f36764f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f36765g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f36766h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f36767i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f36768j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(h2.e[] eVarArr, byte[] bArr) throws IOException {
        int length = 0;
        for (h2.e eVar : eVarArr) {
            length += ((((eVar.f36009i * 2) + 7) & (-8)) / 8) + (eVar.f36006f * 2) + d((String) eVar.f36002b, (String) eVar.f36003c, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + eVar.f36008h;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f36764f)) {
            for (h2.e eVar2 : eVarArr) {
                p(byteArrayOutputStream, eVar2, d((String) eVar2.f36002b, (String) eVar2.f36003c, bArr));
                r(byteArrayOutputStream, eVar2);
                int[] iArr = (int[]) eVar2.f36004d;
                int length2 = iArr.length;
                int i5 = 0;
                int i10 = 0;
                while (i5 < length2) {
                    int i11 = iArr[i5];
                    u(byteArrayOutputStream, i11 - i10);
                    i5++;
                    i10 = i11;
                }
                q(byteArrayOutputStream, eVar2);
            }
        } else {
            for (h2.e eVar3 : eVarArr) {
                p(byteArrayOutputStream, eVar3, d((String) eVar3.f36002b, (String) eVar3.f36003c, bArr));
            }
            for (h2.e eVar4 : eVarArr) {
                r(byteArrayOutputStream, eVar4);
                int[] iArr2 = (int[]) eVar4.f36004d;
                int length3 = iArr2.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length3) {
                    int i14 = iArr2[i12];
                    u(byteArrayOutputStream, i14 - i13);
                    i12++;
                    i13 = i14;
                }
                q(byteArrayOutputStream, eVar4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : fileArrListFiles) {
            z2 = c(file2) && z2;
        }
        return z2;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f36766h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f36765g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, "!");
            }
            if (TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER.equals(obj)) {
                return str2.replace("!", TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) {
                if ("!".equals(obj)) {
                    return str2.replace(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, "!");
                }
                if (TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER.equals(obj)) {
                    return str2.replace("!", TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                }
            } else if (!str2.endsWith(".apk")) {
                return wg.b.c(N0.a.j(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i5) throws IOException {
        byte[] bArr = new byte[i5];
        int i10 = 0;
        while (i10 < i5) {
            int i11 = inputStream.read(bArr, i10, i5 - i10);
            if (i11 < 0) {
                throw new IllegalStateException(AbstractC3256n.g(i5, "Not enough bytes to read: "));
            }
            i10 += i11;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i5) {
        int[] iArr = new int[i5];
        int iM = 0;
        for (int i10 = 0; i10 < i5; i10++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i10] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i5, int i10) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i10];
            byte[] bArr2 = new byte[2048];
            int i11 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i11 < i5) {
                int i12 = fileInputStream.read(bArr2);
                if (i12 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i5 + " bytes");
                }
                inflater.setInput(bArr2, 0, i12);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i10 - iInflate);
                    i11 += i12;
                } catch (DataFormatException e7) {
                    throw new IllegalStateException(e7.getMessage());
                }
            }
            if (i11 == i5) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i5 + " actual=" + i11);
        } finally {
            inflater.end();
        }
    }

    public static h2.e[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, h2.e[] eVarArr) throws IOException {
        byte[] bArr3 = f36767i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f36768j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                h2.e[] eVarArrK = k(byteArrayInputStream, bArr2, iM, eVarArr);
                byteArrayInputStream.close();
                return eVarArrK;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f36762d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            h2.e[] eVarArrJ = j(byteArrayInputStream2, iM2, eVarArr);
            byteArrayInputStream2.close();
            return eVarArrJ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static h2.e[] j(ByteArrayInputStream byteArrayInputStream, int i5, h2.e[] eVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new h2.e[0];
        }
        if (i5 != eVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i5];
        int[] iArr = new int[i5];
        for (int i10 = 0; i10 < i5; i10++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i10] = (int) m(byteArrayInputStream, 2);
            strArr[i10] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i11 = 0; i11 < i5; i11++) {
            h2.e eVar = eVarArr[i11];
            if (!((String) eVar.f36003c).equals(strArr[i11])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i12 = iArr[i11];
            eVar.f36006f = i12;
            eVar.f36004d = g(byteArrayInputStream, i12);
        }
        return eVarArr;
    }

    public static h2.e[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i5, h2.e[] eVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new h2.e[0];
        }
        if (i5 != eVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i10 = 0; i10 < i5; i10++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            h2.e eVar = null;
            if (eVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i11 = 0;
                while (true) {
                    if (i11 >= eVarArr.length) {
                        break;
                    }
                    if (((String) eVarArr[i11].f36003c).equals(strSubstring)) {
                        eVar = eVarArr[i11];
                        break;
                    }
                    i11++;
                }
            }
            if (eVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            eVar.f36010j = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f36766h)) {
                eVar.f36006f = iM;
                eVar.f36004d = iArrG;
            }
        }
        return eVarArr;
    }

    public static h2.e[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f36763e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            h2.e[] eVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return eVarArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i5) throws IOException {
        byte[] bArrF = f(inputStream, i5);
        long j8 = 0;
        for (int i10 = 0; i10 < i5; i10++) {
            j8 += (bArrF[i10] & ForkServer.ERROR) << (i10 * 8);
        }
        return j8;
    }

    public static h2.e[] n(ByteArrayInputStream byteArrayInputStream, String str, int i5) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new h2.e[0];
        }
        h2.e[] eVarArr = new h2.e[i5];
        for (int i10 = 0; i10 < i5; i10++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            eVarArr[i10] = new h2.e(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        for (int i11 = 0; i11 < i5; i11++) {
            h2.e eVar = eVarArr[i11];
            int iAvailable = byteArrayInputStream.available() - eVar.f36008h;
            int iM3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = (TreeMap) eVar.f36005e;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                for (int iM4 = (int) m(byteArrayInputStream, 2); iM4 > 0; iM4--) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            eVar.f36004d = g(byteArrayInputStream, eVar.f36006f);
            int i12 = eVar.f36009i;
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i12 * 2) + 7) & (-8)) / 8));
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = bitSetValueOf.get(i13) ? 2 : 0;
                if (bitSetValueOf.get(i13 + i12)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | num.intValue()));
                }
            }
        }
        return eVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, h2.e[] eVarArr) throws IOException {
        long j8;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f36762d;
        int i5 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f36763e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(eVarArr, bArr3);
                t(byteArrayOutputStream, eVarArr.length, 1);
                t(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                t(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f36765g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, eVarArr.length, 1);
                for (h2.e eVar : eVarArr) {
                    int size = ((TreeMap) eVar.f36005e).size() * 4;
                    String strD = d((String) eVar.f36002b, (String) eVar.f36003c, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, strD.getBytes(charset).length);
                    u(byteArrayOutputStream, ((int[]) eVar.f36004d).length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, eVar.f36007g, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = ((TreeMap) eVar.f36005e).keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i10 : (int[]) eVar.f36004d) {
                        u(byteArrayOutputStream, i10);
                    }
                }
                return true;
            }
            byte[] bArr5 = f36764f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(eVarArr, bArr5);
                t(byteArrayOutputStream, eVarArr.length, 1);
                t(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                t(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f36766h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, eVarArr.length);
            for (h2.e eVar2 : eVarArr) {
                String strD2 = d((String) eVar2.f36002b, (String) eVar2.f36003c, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, strD2.getBytes(charset2).length);
                TreeMap treeMap = (TreeMap) eVar2.f36005e;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, ((int[]) eVar2.f36004d).length);
                t(byteArrayOutputStream, eVar2.f36007g, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i11 : (int[]) eVar2.f36004d) {
                    u(byteArrayOutputStream, i11);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, eVarArr.length);
            int i12 = 2;
            int i13 = 2;
            for (h2.e eVar3 : eVarArr) {
                t(byteArrayOutputStream2, eVar3.f36007g, 4);
                t(byteArrayOutputStream2, eVar3.f36010j, 4);
                t(byteArrayOutputStream2, eVar3.f36009i, 4);
                String strD3 = d((String) eVar3.f36002b, (String) eVar3.f36003c, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i13 = i13 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i13 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray.length);
            }
            j jVar = new j(byteArray, 1, false);
            byteArrayOutputStream2.close();
            arrayList2.add(jVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = 0;
            int i15 = 0;
            while (i14 < eVarArr.length) {
                try {
                    h2.e eVar4 = eVarArr[i14];
                    u(byteArrayOutputStream3, i14);
                    u(byteArrayOutputStream3, eVar4.f36006f);
                    i15 = i15 + 4 + (eVar4.f36006f * i12);
                    int[] iArr = (int[]) eVar4.f36004d;
                    int length3 = iArr.length;
                    int i16 = i5;
                    int i17 = i12;
                    int i18 = i16;
                    while (i18 < length3) {
                        int i19 = iArr[i18];
                        u(byteArrayOutputStream3, i19 - i16);
                        i18++;
                        i16 = i19;
                    }
                    i14++;
                    i12 = i17;
                    i5 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i15 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray2.length);
            }
            j jVar2 = new j(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList2.add(jVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i20 = 0;
            int i21 = 0;
            while (i20 < eVarArr.length) {
                try {
                    h2.e eVar5 = eVarArr[i20];
                    Iterator it3 = ((TreeMap) eVar5.f36005e).entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream4, eVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream4, eVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            u(byteArrayOutputStream3, i20);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i22 = i21 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i21 = i22 + length4;
                            i20++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i21 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i21 + ", does not match actual size " + byteArray5.length);
            }
            j jVar3 = new j(byteArray5, 4, true);
            byteArrayOutputStream3.close();
            arrayList2.add(jVar3);
            long j10 = 4;
            long size2 = j10 + j10 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i23 = 0;
            while (i23 < arrayList2.size()) {
                j jVar4 = (j) arrayList2.get(i23);
                int i24 = jVar4.f36779a;
                if (i24 == 1) {
                    j8 = 0;
                } else if (i24 == 2) {
                    j8 = 1;
                } else if (i24 == 3) {
                    j8 = 2;
                } else if (i24 == 4) {
                    j8 = 3;
                } else {
                    if (i24 != 5) {
                        throw null;
                    }
                    j8 = 4;
                }
                t(byteArrayOutputStream, j8, 4);
                t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = jVar4.f36780b;
                if (jVar4.f36781c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    t(byteArrayOutputStream, bArrA3.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i23++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i25 = 0; i25 < arrayList6.size(); i25++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i25));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, h2.e eVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, eVar.f36006f);
        t(byteArrayOutputStream, eVar.f36008h, 4);
        t(byteArrayOutputStream, eVar.f36007g, 4);
        t(byteArrayOutputStream, eVar.f36009i, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, h2.e eVar) throws IOException {
        byte[] bArr = new byte[(((eVar.f36009i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) eVar.f36005e).entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i10 = iIntValue + eVar.f36009i;
                int i11 = i10 / 8;
                bArr[i11] = (byte) ((1 << (i10 % 8)) | bArr[i11]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, h2.e eVar) throws IOException {
        int i5 = 0;
        for (Map.Entry entry : ((TreeMap) eVar.f36005e).entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, iIntValue - i5);
                u(byteArrayOutputStream, 0);
                i5 = iIntValue;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:272|53|54)|256|(3:274|62|(4:64|252|65|86)(2:76|77))|92|(4:(3:276|104|(3:249|106|(4:108|109|110|(1:134))(2:119|120))(3:(1:127)|132|(0)))(1:102)|(1:230)(1:229)|231|232)|135|(3:137|140|(0)(0))|167|(0)(0)|(0)|220|(1:230)(0)|231|232) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0158, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0159, code lost:
    
        r18.a(7, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0194 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x01f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0176  */
    /* JADX WARN: Type inference failed for: r10v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void s(android.content.Context r16, java.util.concurrent.Executor r17, i3.a r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.b.s(android.content.Context, java.util.concurrent.Executor, i3.a, boolean):void");
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j8, int i5) throws IOException {
        byte[] bArr = new byte[i5];
        for (int i10 = 0; i10 < i5; i10++) {
            bArr[i10] = (byte) ((j8 >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i5) throws IOException {
        t(byteArrayOutputStream, i5, 2);
    }
}
