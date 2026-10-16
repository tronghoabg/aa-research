package defpackage;

import android.view.inputmethod.ExtractedText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class aclh {
    private aclh() {
    }

    public static /* synthetic */ Object a(Object obj) {
        return (abrh) abnv.x(abrh.a, (byte[]) obj);
    }

    public static /* synthetic */ Object b(Object obj) {
        return (ajfz) abnv.x(ajfz.a, (byte[]) obj);
    }

    public static /* synthetic */ int c(int i) {
        return i == 1 ? aboi.b() : i - 2;
    }

    public static /* synthetic */ int d(int i) {
        return i == 1 ? aboi.b() : i - 2;
    }

    public static /* synthetic */ int e(int i) {
        return i == 1 ? aboi.b() : i - 2;
    }

    public static /* synthetic */ int f(int i) {
        return i == 1 ? aboi.b() : i - 2;
    }

    public static /* synthetic */ int g(int i) {
        return i == 1 ? aboi.b() : i - 2;
    }

    public static /* synthetic */ Object h(Object obj) {
        return (abru) abnv.x(abru.a, (byte[]) obj);
    }

    public static /* synthetic */ Object i(Object obj) throws abon {
        byte[] bArr = (byte[]) obj;
        abnv abnvVarD = abnv.D(abrs.a, bArr, 0, bArr.length, abnj.a);
        abnv.U(abnvVarD);
        return (abrs) abnvVarD;
    }

    public static /* synthetic */ int j(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int k(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    public static /* synthetic */ double l(double d) {
        double dPow = Math.pow(Math.abs(d), 0.42d);
        return ((a.r(d) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    public static /* synthetic */ double m(double d) {
        double dAbs = Math.abs(d);
        return a.r(d) * Math.pow(Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs)), 2.380952380952381d);
    }

    public static /* synthetic */ boolean n(double d, double d2, double d3) {
        return ((d2 - d) + 25.132741228718345d) % 6.283185307179586d < ((d3 - d) + 25.132741228718345d) % 6.283185307179586d;
    }

    public static /* synthetic */ void o(boolean z, String str, Object[] objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static /* synthetic */ abii p(abcs abcsVar) {
        abnh abnhVar = abhx.a;
        abcsVar.j(abnhVar);
        Object objJ = abcsVar.w.j(abnhVar.d);
        return (abii) (objJ == null ? abnhVar.b : abnhVar.c(objJ));
    }

    public static /* synthetic */ afak q(tiw tiwVar, bux buxVar, int i) {
        tiwVar.getClass();
        if (!buxVar.I((i & 17) != 16, i & 1)) {
            buxVar.s();
        }
        return afak.a;
    }

    public static /* synthetic */ int[] r() {
        return new int[]{1, 2, 3};
    }

    public static /* synthetic */ yzj s(UUID uuid) {
        abnp abnpVarN = yzj.a.n();
        long mostSignificantBits = uuid.getMostSignificantBits();
        abnpVarN.t();
        yzj yzjVar = (yzj) abnpVarN.b;
        yzjVar.b |= 1;
        yzjVar.c = mostSignificantBits;
        long leastSignificantBits = uuid.getLeastSignificantBits();
        abnpVarN.t();
        yzj yzjVar2 = (yzj) abnpVarN.b;
        yzjVar2.b |= 2;
        yzjVar2.d = leastSignificantBits;
        return (yzj) abnpVarN.q();
    }

    public static /* synthetic */ yzz t(xhi xhiVar) {
        int iOrdinal = xhiVar.ordinal();
        if (iOrdinal == 0) {
            return yzz.AUDIO_FOCUS_REQUEST_GAIN;
        }
        if (iOrdinal == 1) {
            return yzz.AUDIO_FOCUS_REQUEST_GAIN_TR;
        }
        if (iOrdinal == 2) {
            return yzz.AUDIO_FOCUS_REQUEST_GAIN_TR_DUCK;
        }
        if (iOrdinal == 3) {
            return yzz.AUDIO_FOCUS_REQUEST_RELEASE;
        }
        throw new RuntimeException(null, null);
    }

    public static /* synthetic */ int u(Map map) {
        Object obj;
        Collection collectionValues = map.values();
        ArrayList arrayList = new ArrayList(woy.bp(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((List) it.next()).size()));
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() + ((Number) it2.next()).intValue());
            }
            obj = next;
        } else {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static /* synthetic */ ExtractedText w(djv djvVar) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = djvVar.a();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = djvVar.a().length();
        extractedText.partialStartOffset = -1;
        long j = djvVar.b;
        extractedText.selectionStart = dfv.d(j);
        extractedText.selectionEnd = dfv.c(j);
        extractedText.flags = !afyh.A(djvVar.a(), '\n') ? 1 : 0;
        return extractedText;
    }

    public static /* synthetic */ boolean x(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static /* synthetic */ long y(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public aclh(byte[] bArr) {
    }

    public static /* synthetic */ void v(Object obj) {
    }
}
