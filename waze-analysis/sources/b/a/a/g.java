package b.a.a;

import androidx.media3.common.C;
import androidx.media3.exoplayer.MediaPeriodQueue;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.math.BigInteger;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final BigInteger f1694a = BigInteger.valueOf(5);

    /* renamed from: b, reason: collision with root package name */
    static final BigInteger f1695b = BigInteger.valueOf(10000000000000000L);

    /* renamed from: c, reason: collision with root package name */
    static final BigInteger f1696c = BigInteger.valueOf(152587890625L);

    /* renamed from: d, reason: collision with root package name */
    private static final BigInteger[] f1697d = {BigInteger.ONE, BigInteger.TEN, BigInteger.valueOf(100), BigInteger.valueOf(1000), BigInteger.valueOf(10000), BigInteger.valueOf(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US), BigInteger.valueOf(1000000), BigInteger.valueOf(10000000), BigInteger.valueOf(100000000), BigInteger.valueOf(C.NANOS_PER_SECOND), BigInteger.valueOf(10000000000L), BigInteger.valueOf(100000000000L), BigInteger.valueOf(MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US), BigInteger.valueOf(10000000000000L), BigInteger.valueOf(100000000000000L), BigInteger.valueOf(1000000000000000L)};

    static int a(int i2, int i3) {
        return i3 - ((((i3 - i2) + 31) >>> 5) << 4);
    }

    public static long b(long j2) {
        return ((j2 * 3402) >>> 10) + 1;
    }

    static BigInteger c(NavigableMap navigableMap, int i2) {
        BigInteger[] bigIntegerArr = f1697d;
        int length = bigIntegerArr.length;
        if (i2 < 16) {
            return bigIntegerArr[i2];
        }
        if (navigableMap == null) {
            return f1694a.pow(i2).shiftLeft(i2);
        }
        Map.Entry entryFloorEntry = navigableMap.floorEntry(Integer.valueOf(i2));
        Integer num = (Integer) entryFloorEntry.getKey();
        return num.intValue() == i2 ? (BigInteger) entryFloorEntry.getValue() : j.d((BigInteger) entryFloorEntry.getValue(), c(navigableMap, i2 - num.intValue()));
    }

    static BigInteger d(NavigableMap navigableMap, int i2) {
        int i3 = i2 & (-16);
        Map.Entry entryFloorEntry = navigableMap.floorEntry(Integer.valueOf(i3));
        int iIntValue = ((Integer) entryFloorEntry.getKey()).intValue();
        BigInteger bigInteger = (BigInteger) entryFloorEntry.getValue();
        if (iIntValue == i3) {
            return bigInteger;
        }
        int i4 = i3 - iIntValue;
        Object objValueOf = Integer.valueOf(i4);
        BigInteger bigIntegerD = (BigInteger) navigableMap.get(objValueOf);
        if (bigIntegerD == null) {
            bigIntegerD = d(navigableMap, i4);
            navigableMap.put(objValueOf, bigIntegerD);
        }
        return j.d(bigInteger, bigIntegerD);
    }

    static NavigableMap e() {
        TreeMap treeMap = new TreeMap();
        treeMap.put(0, BigInteger.ONE);
        treeMap.put(16, f1695b);
        return treeMap;
    }

    static void f(NavigableMap navigableMap, int i2, int i3) {
        if (i3 - i2 <= 18) {
            return;
        }
        int iA = a(i2, i3);
        int i4 = i3 - iA;
        Integer numValueOf = Integer.valueOf(i4);
        if (navigableMap.containsKey(numValueOf)) {
            return;
        }
        f(navigableMap, i2, iA);
        f(navigableMap, iA, i3);
        navigableMap.put(numValueOf, d(navigableMap, i4));
    }
}
