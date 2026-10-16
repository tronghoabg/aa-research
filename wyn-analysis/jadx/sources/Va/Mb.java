package Va;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class Mb implements Lb {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f13534c = {'A', 'd', ' ', 'i', 's', 'p', 'l', 'a', 'y', 'e', ':', 'c', 'k', 'f', 'r', 'o', 'm', 'j', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f13535d = {34353, 51064, 1160, 16976, 33705, 49439, 3720, 20456, 36209, 51909, 2093, 18864, 38720, 54377, 5600, 21328, 37058, 56893, 8146, 50572, 33989, 18229, 490, 49169, 33470, 19766, 3164, 52937, 'v', 16645, 33469, 50227, 1424, 18301, 35068, 51584, 2817, 19631, 36432, 53185, 4468, 21062, 30155, 13459, 63271, 45560, 28745, 13046, 64881, 48134, 32392, 14698, 37393, 54091, 4345, 22114, 38797, 54563, 6906, 23491, 39236, 57083, 7172, 23938, 33656, 23045, 6988, 55508, 40545, 24474, 7484, 53920, 37845, 20822, 5848, 54286, 38287, 19244, 2113, 23818, 7275, 57298, 11862, 28429, 44217, 59960, 11217, 26927, 42744, 59285, 9494, 25278, 41055, 57822, 16237, 31752, 48603, 64290, 14501, 30298, 47077, 62819, 12867, 29605, 45352, 52936, 3165};

    /* renamed from: e, reason: collision with root package name */
    public static int f13536e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f13537f = 1;

    /* renamed from: a, reason: collision with root package name */
    public Object f13538a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13539b = new x4.d(28);

    public static String g(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f13534c;
                char[] cArr2 = new char[i5];
                if (i5 % 2 != 0) {
                    i5--;
                    cArr2[i5] = (char) (charArray[i5] - b5);
                }
                if (i5 > 1) {
                    Ab.f13193A = 0;
                    while (true) {
                        int i10 = Ab.f13193A;
                        if (i10 >= i5) {
                            break;
                        }
                        char c10 = charArray[i10];
                        int i11 = i10 + 1;
                        char c11 = charArray[i11];
                        if (c10 == c11) {
                            cArr2[i10] = (char) (c10 - b5);
                            cArr2[i11] = (char) (c11 - b5);
                        } else {
                            int i12 = c10 / 5;
                            int i13 = c10 % 5;
                            int i14 = c11 / 5;
                            int i15 = c11 % 5;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 4) % 5) * 5) + i13];
                                cArr2[i11] = cArr[(((i14 + 4) % 5) * 5) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 5) + ((i13 + 4) % 5)];
                                cArr2[i11] = cArr[(i14 * 5) + ((i15 + 4) % 5)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 5) + i15];
                                cArr2[i11] = cArr[(i14 * 5) + i13];
                            }
                        }
                        Ab.f13193A = i10 + 2;
                    }
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String o(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i5];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i5) {
                        cArr[i11] = (char) ((f13535d[i10 + i11] ^ (i11 * (-6741400427508252308L))) ^ c10);
                        Ab.f13217t = i11 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public synchronized JSONObject e() {
        return (JSONObject) this.f13538a;
    }

    public void f(JSONObject jSONObject, Object obj) throws JSONException {
        f13537f = (f13536e + 27) % 128;
        try {
            String str = AbstractC1141sa.f14614e;
            if (!jSONObject.has(str)) {
                f13537f = (f13536e + 41) % 128;
                jSONObject.put(str, q(obj));
                f13537f = (f13536e + 21) % 128;
            }
            String str2 = AbstractC1141sa.f14615f;
            if (jSONObject.has(str2)) {
                return;
            }
            jSONObject.put(str2, AbstractC1104pb.g0());
            f13536e = (f13537f + 77) % 128;
        } catch (JSONException e7) {
            Ab.R(o((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 13, TextUtils.getTrimmedLength("") + 65, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23108)).intern(), o(Color.blue(0) + 25, 82 - TextUtils.indexOf("", ""), (char) (11795 - TextUtils.indexOf("", "", 0))).intern(), e7);
        }
    }

    @Override // Va.Lb
    public void h(JSONObject jSONObject, View view, Object obj) {
        f13537f = (f13536e + 17) % 128;
        f(jSONObject, obj);
        i(o((ViewConfiguration.getPressedStateDuration() >> 16) + 13, (ViewConfiguration.getFadingEdgeLength() >> 16) + 52, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37457)).intern(), jSONObject);
        p().h(jSONObject, view, obj);
        f13537f = (f13536e + 15) % 128;
    }

    public void i(String str, JSONObject jSONObject) {
        String strIntern = o((ViewConfiguration.getFadingEdgeLength() >> 16) + 14, 65 - KeyEvent.keyCodeFromString(""), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 23108)).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append(o((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2, 79 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (23851 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern());
        sb2.append(str);
        String string = sb2.toString();
        int i5 = Ab.f13216s + 97;
        Ab.f13215r = i5 % 128;
        int i10 = i5 % 2;
        Ab.z(strIntern, strIntern, string, jSONObject, false);
        f13536e = (f13537f + 43) % 128;
    }

    public synchronized void j(JSONObject jSONObject) {
        this.f13538a = jSONObject;
    }

    @Override // Va.Lb
    public void k(JSONObject jSONObject, View view, KeyEvent.Callback callback) throws JSONException {
        f13537f = (f13536e + 83) % 128;
        f(jSONObject, callback);
        i(o(KeyEvent.getDeadChar(0, 0) + 9, ((byte) KeyEvent.getModifierMetaStateMask()) + 20, (char) (View.combineMeasuredStates(0, 0) + 50637)).intern(), jSONObject);
        p().k(jSONObject, view, callback);
        f13536e = (f13537f + 27) % 128;
    }

    public void l(Lb lb2) {
        int i5 = f13536e;
        int i10 = i5 + 115;
        f13537f = i10 % 128;
        int i11 = i10 % 2;
        this.f13538a = lb2;
        if (i11 == 0) {
            throw null;
        }
        int i12 = i5 + 49;
        f13537f = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 20 / 0;
        }
    }

    @Override // Va.Lb
    public void m(JSONObject jSONObject, Object obj, Object obj2) throws JSONException {
        f13537f = (f13536e + 65) % 128;
        f(jSONObject, obj2);
        i(o(TextUtils.indexOf((CharSequence) "", '0') + 15, TextUtils.getCapsMode("", 0, 0) + 28, (char) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), jSONObject);
        p().m(jSONObject, obj, obj2);
        f13537f = (f13536e + 99) % 128;
    }

    @Override // Va.Lb
    public void n(JSONObject jSONObject, View view, InterfaceC0950e0 interfaceC0950e0, Object obj) {
        f13536e = (f13537f + 121) % 128;
        f(jSONObject, obj);
        i(g((byte) (Drawable.resolveOpacity(0, 0) + 34), 10 - MotionEvent.axisFromString(""), "\u0001\u0002\u0001\f\b\u0001\f\r\u0006\u0004\\").intern(), jSONObject);
        p().n(jSONObject, view, interfaceC0950e0, obj);
        int i5 = f13537f + 79;
        f13536e = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 17 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return (Va.Lb) r3.f13538a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r1 = (x4.d) r3.f13539b;
        r0 = r0 + 43;
        Va.Mb.f13536e = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if ((r0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        r0 = 41 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (((Va.Lb) r3.f13538a) != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (((Va.Lb) r3.f13538a) != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Va.Lb p() {
        /*
            r3 = this;
            int r0 = Va.Mb.f13537f
            int r1 = r0 + 53
            int r2 = r1 % 128
            Va.Mb.f13536e = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L17
            java.lang.Object r1 = r3.f13538a
            Va.Lb r1 = (Va.Lb) r1
            r2 = 38
            int r2 = r2 / 0
            if (r1 == 0) goto L22
            goto L1d
        L17:
            java.lang.Object r1 = r3.f13538a
            Va.Lb r1 = (Va.Lb) r1
            if (r1 == 0) goto L22
        L1d:
            java.lang.Object r0 = r3.f13538a
            Va.Lb r0 = (Va.Lb) r0
            return r0
        L22:
            java.lang.Object r1 = r3.f13539b
            x4.d r1 = (x4.d) r1
            int r0 = r0 + 43
            int r2 = r0 % 128
            Va.Mb.f13536e = r2
            int r0 = r0 % 2
            if (r0 == 0) goto L34
            r0 = 41
            int r0 = r0 / 0
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Mb.p():Va.Lb");
    }

    public abstract String q(Object obj);

    @Override // Va.Lb
    public void r(JSONObject jSONObject, View view, Object obj) {
        f13537f = (f13536e + 101) % 128;
        f(jSONObject, obj);
        i(o((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18, Process.myTid() >> 22, (char) (34416 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern(), jSONObject);
        p().r(jSONObject, view, obj);
        f13536e = (f13537f + 89) % 128;
    }

    @Override // Va.Lb
    public void s(JSONObject jSONObject, Object obj, InterfaceC0950e0 interfaceC0950e0, Object obj2) {
        f13536e = (f13537f + 39) % 128;
        f(jSONObject, obj2);
        i(g((byte) (View.MeasureSpec.getMode(0) + 31), 19 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0001\u0002\u0001\f\b\u0001\f\r\u0006\u0004\u0003\f\n\u0013\u0011\u0001\u0013\u0002Y").intern(), jSONObject);
        p().s(jSONObject, obj, interfaceC0950e0, obj2);
        int i5 = f13537f + 55;
        f13536e = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 27 / 0;
        }
    }

    @Override // Va.Lb
    public void v(JSONObject jSONObject, View view, Object obj) {
        f13536e = (f13537f + 107) % 128;
        f(jSONObject, obj);
        i(g((byte) (120 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Color.blue(0) + 13, "\u0001\u0002\u0003\u0002\u0004\u0000\u0006\u0007\b\t\u0006\u0004²").intern(), jSONObject);
        p().v(jSONObject, view, obj);
        int i5 = f13536e + 27;
        f13537f = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 28 / 0;
        }
    }

    @Override // Va.Lb
    public void w(JSONObject jSONObject, View view, Vb vb2, Object obj) {
        f13537f = (f13536e + 121) % 128;
        f(jSONObject, obj);
        i(o(10 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43, (char) (30108 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).intern(), jSONObject);
        p().w(jSONObject, view, vb2, obj);
        int i5 = f13536e + 95;
        f13537f = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
