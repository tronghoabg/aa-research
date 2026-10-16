package Va;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.persistence.Repository;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: Va.n6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1073n6 extends Z0 {

    /* renamed from: S, reason: collision with root package name */
    public static final char[] f14411S;

    /* renamed from: T, reason: collision with root package name */
    public static final long f14412T;

    /* renamed from: U, reason: collision with root package name */
    public static final char[] f14413U;

    /* renamed from: V, reason: collision with root package name */
    public static final int f14414V;

    /* renamed from: W, reason: collision with root package name */
    public static final boolean f14415W;

    /* renamed from: X, reason: collision with root package name */
    public static final boolean f14416X;

    /* renamed from: Y, reason: collision with root package name */
    public static int f14417Y = 0;

    /* renamed from: Z, reason: collision with root package name */
    public static int f14418Z = 1;

    /* renamed from: R, reason: collision with root package name */
    public String f14419R;

    static {
        char[] cArr = new char[531];
        R8.v.k("7;ý¡ä\bÎ\u008d±\u000e\u009b³\u0082 d\u008aO\\1Æ\u0018W\u0002üåw\u0000V\u0019ÿ3zLùfD\u007f×\u0099x²´Ì?å³ÿ\u0000\u0000V\u0019ÿ3zLùfD\u007f×\u0000V\u0019ÿ3zLùfD\u007f×\u0099}²¥Ì$å³ÿ\u0012\u0018\u00872\fL{\u0000c\u0019å3yL°f^\u007fÇ\u0099R²¡Ì<å¿ÿJ\u0018\u00992\u0019Lpeþ\u007fs\u0098Î²\u0004ËÁåWþæ\u0018\u00041©K\bd\u0097~\u0016\u0098a±ÏË{äÖþE\u0017À1)J¾d-\u0000c\u0019å3yL°f^\u007fÇ\u0099R²¡Ì<å¿ÿJ\u0018\u00992\u0019Lpeþ\u007fs\u0098Î²\u0004ËÁåWþæ\u0018\u00041©K\bd\u0097~\u0016\u0098a±ÙË}äÀþz\u0017ß1%J½d\u0015}½\u0097\u001c°\u009bÊ\näoýä\u0017c/Ï6`\u001cìcuIÔPH¶Û\u009d;ã»Ê9Ð\u008f7\u000e\u001d\u0082\u0000P\u0019æ3uLýfM\u007fß\u0099Y²¨Ì$\u0000V\u0019ÿ3zLùfD\u007f×\u0099k²£Ì2å\u0099ÿ\b\u0018\u00872\u001dLleø\u0096µ\u008f\b¥\u0083Ú\u0016ð½é!\u0097\u008d\u008e;¤¨Û:ñ´è\u000b\u000e¢%z[árkhÛ\u008fR¥ÆÛ´höq_[Í$E\u000eþ\u0017IñâÚ?¤\u0085\u008d\u000e\u0097ªp&Z£$Û\rB=w$Þ\u000eLqÄ[\u007fBÈ¤c\u008f«ñ\u0002Ø\u0084Â(\u0000L\u0019å3wLÿfD\u007fó\u0099X²\u0096Ì\"å¿ÿ\u0017\u0018\u008b2\u0016Lveé\u007fd\u0000M\u0019Ø3UL×fl\u007fó\u0099X²\u0096Ì\"å¿ÿ\u0017\u0018\u008b2\u0016Lveé\u007fd7\n.¥\u0004){°Q\u0011H\u008d®\u001e\u0085þû~ÒüÈJ/Ë\u0005G{\u0019RµH8¯\u0098\u0085\u0004ü\u0091Ò\u0001Éâ/m\u0006þ|BSÕIw¯.\u0086¦ü'Ó\u0086É\u0015 \u0084\u0000W\u0019ï3vLßfL\u007fä\u0099U²£Ì'\u0000W\u0019ï3vLßfL\u007fâ\u0099N²£Ì#å¿ÿ\n\u0018\u009a2\u001dLp\u0000M\u0019Ø3UL×fl\u007fó\u0099X²\u0090Ì9å¿ÿ\u0013\u0000M\u0019Ø3UL×fl\u007fö\u0099Y²ªÌ5å½ÿ\u0005\u0018\u009a2\u001d³üªS\u0080ßÿFÕçÌ{*è\u0001\b\u007f\u0088V\nL¼«=\u0081±ÿïÖCÌÎ+n\u0001òxgV÷M\u0010«\u009d\u0082>ø\u009e×;Í¢+×\u0002GxéWvMâ¤\u007f\u0082\u0098ù\u0019×\u008cÎ\u0011\u0000A\u0019î3ULýf\\\u007fÛ\u0099J²¯Ì$å£Ó;Ê\u0092à\u0017\u009f\u0094µ)¬ºJ\u0013aÊ\u001fS6Ù,lËñ\u0000c\u0019å3yL°f^\u007fÇ\u0099R²¡Ì<å¿ÿJ\u0018\u00992\u0019Lpeþ\u007fs\u0098Î²\u0004ËâåKþ¦\u001851°K\u0003d²~\u001b\u0098j±àË}äÐ7d.Í\u0004H{ËQvHå®L\u0085\u0095û\fÒ\u0086È3/®\u0005\u001c{YRÛHS\u000f×\u0016Q<ÍC\u0004iêps\u0096æ½\u0015Ã\u0088ê\u000bðþ\u0017-=\u00adCÄjJpÇ\u0097z½°ÄuêãñR\u0017\u0090>\u0001D·k3qà\u0097æ¾OÄÂëqñô\u0018g>¶E\u001fk\u008er\u0004\u0098¹¿4Å\u009eëÛòA\u0018Ù¡\u0012¸»\u0092>í½Ç\u0000Þ\u009386\u0013ãm`D÷^V¹Ï\u0093jí/Ä\u00adÞ%4ù-\u007f\u0007ãx*RÄK]\u00adÈ\u0086;ø¦Ñ%ËÐ,\u0003\u0006\u0083xêQdKé¬T\u0086\u009eÿ[ÑÍÊ|,¾\u0005/\u007f\u0099P\u001dJÎ¬È\u0085aÿìÐ_ÊÚ#I\u0005\u0094~1PºI-£\u0084\u0084\rþ°ÐõÉo#÷\u0000g\u0019ï3`LÎfD\u007fÓ\u0099_²£Ì=å¿ÿ\n\u0018\u009a", "ISO-8859-1", cArr, 0, 531);
        f14411S = cArr;
        f14412T = 593050940662815114L;
        f14415W = true;
        f14416X = true;
        f14414V = 11;
        f14413U = new char[]{'F', 'a', 128, 'y', 'r', 'w', 'p', 'b', 'm', 't', 130, 'L', 'n', 127, 129, 132, ']', '{', 'z', '~', '}', 'o', 'N', 'l', 'W', '[', 'j', 'x', 'T', 133, 'X', 'v', 'O', '`'};
    }

    public static Class C0() {
        int i5 = (f14418Z + 11) % 128;
        f14417Y = i5;
        int i10 = i5 + 73;
        f14418Z = i10 % 128;
        if (i10 % 2 != 0) {
            return VungleApiClient.class;
        }
        throw null;
    }

    public static Map D0(Advertisement advertisement) {
        int i5 = f14417Y + 47;
        f14418Z = i5 % 128;
        if (i5 % 2 == 0) {
            advertisement.getDownloadableUrls();
            throw null;
        }
        Map downloadableUrls = advertisement.getDownloadableUrls();
        int i10 = f14417Y + 51;
        f14418Z = i10 % 128;
        if (i10 % 2 != 0) {
            return downloadableUrls;
        }
        throw null;
    }

    public static String E0(Advertisement advertisement) {
        int i5 = f14418Z + 9;
        f14417Y = i5 % 128;
        if (i5 % 2 == 0) {
            return advertisement.getAdMarketId();
        }
        advertisement.getAdMarketId();
        throw null;
    }

    public static Placement F0(Repository repository, String str) {
        Placement placement;
        int i5 = f14418Z + 51;
        f14417Y = i5 % 128;
        if (i5 % 2 != 0) {
            placement = (Placement) repository.load(str, Placement.class).get();
            int i10 = 21 / 0;
        } else {
            placement = (Placement) repository.load(str, Placement.class).get();
        }
        int i11 = f14417Y + 95;
        f14418Z = i11 % 128;
        if (i11 % 2 != 0) {
            return placement;
        }
        throw null;
    }

    public static String G0(int i5, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f14413U;
                int i10 = f14414V;
                if (!f14416X) {
                    if (f14415W) {
                        throw null;
                    }
                    throw null;
                }
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i11 = AbstractC0897a.f13938v;
                    int i12 = AbstractC0897a.f13939w;
                    if (i11 < i12) {
                        cArr2[i11] = (char) (cArr[bytes[(i12 - 1) - i11] + i5] - i10);
                        AbstractC0897a.f13938v = i11 + 1;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static boolean H0(Placement placement) {
        int i5 = f14418Z + 111;
        f14417Y = i5 % 128;
        int i10 = i5 % 2;
        boolean zIsIncentivized = placement.isIncentivized();
        if (i10 != 0) {
            int i11 = 42 / 0;
        }
        int i12 = f14417Y + 43;
        f14418Z = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 91 / 0;
        }
        return zIsIncentivized;
    }

    public static String I0(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14411S[i5 + i11] ^ (i11 * f14412T)) ^ c10);
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

    public static String J0(Advertisement advertisement) {
        f14417Y = (f14418Z + 73) % 128;
        String campaign = advertisement.getCampaign();
        f14417Y = (f14418Z + 29) % 128;
        return campaign;
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(I0(519 - (ViewConfiguration.getTapTimeout() >> 16), 13 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), new C1060m6());
        map.put(G0(127 - ExpandableListView.getPackedPositionType(0L), "\u0096\u0087\u009e\u008a\u008f\u008a\u008e\u0084\u0087\u008d\u0084\u009d\u0094\u008a").intern(), new C1021j6());
        map.put(G0((ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u0096\u009d\u008e\u0087 \u0095\u0098\u009f\u0096\u008c\u008e\u0087\u0085").intern(), new C1008i6());
        map.put(G0(127 - (Process.myTid() >> 22), "\u0084\u0085\u008a\u0098\u0092\u009c\u0098\u0097\u008e\u0087\u0085").intern(), new C1047l6());
        map.put(G0(View.resolveSizeAndState(0, 0, 0) + 127, "\u0094\u0086\u0095¢\u0087\u0086\u0089\u0098\u0096\u0098\u0093\u0086\u0084\u008b\u0093¡\u008e\u0087\u0085").intern(), new C1034k6());
        int i5 = f14417Y + 9;
        f14418Z = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    @Override // Va.Z0
    public final String t0() {
        int i5 = f14417Y + 39;
        f14418Z = i5 % 128;
        if (i5 % 2 == 0) {
            u0();
            throw null;
        }
        String strU0 = u0();
        if (strU0 == null) {
            return null;
        }
        String str = strU0.split(I0(ViewConfiguration.getScrollDefaultDelay() >> 16, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (14099 - TextUtils.indexOf((CharSequence) "", '0'))).intern())[1];
        f14418Z = (f14417Y + 99) % 128;
        return str;
    }

    @Override // Va.Z0
    public final String u0() {
        String str;
        int i5 = f14417Y;
        int i10 = i5 + 87;
        f14418Z = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (this.f14419R == null) {
            f14418Z = (i5 + 37) % 128;
            Class clsC0 = C0();
            C0999ha.j().getClass();
            C0947da c0947da = new C0947da(0);
            c0947da.f14118O = new C0960ea();
            c0947da.a1(String.class);
            c0947da.Z0(8);
            c0947da.b1(16);
            int i11 = C0947da.f14113S + 45;
            C0947da.f14112R = i11 % 128;
            int i12 = i11 % 2;
            C0960ea c0960ea = (C0960ea) c0947da.f14118O;
            if (i12 != 0) {
                int i13 = 2 / 0;
            }
            C0921ba c0921ba = (C0921ba) C0999ha.j().f14263a;
            ArrayList arrayList = new ArrayList();
            c0921ba.h(clsC0, c0960ea, arrayList);
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f14418Z = (f14417Y + 31) % 128;
                    String str2 = (String) ((Field) it.next()).get(null);
                    if (!str2.startsWith(I0(-TextUtils.indexOf((CharSequence) "", '0', 0, 0), 11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (65016 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern())) {
                        if (!str2.startsWith(I0((ViewConfiguration.getLongPressTimeout() >> 16) + 13, ((byte) KeyEvent.getModifierMetaStateMask()) + 12, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                            f14417Y = (f14418Z + 11) % 128;
                        }
                    }
                    str = str2.split(G0((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 126, "\u0081").intern())[0];
                }
            } catch (Exception unused) {
            }
            str = null;
            this.f14419R = str;
            int i14 = Z0.f13886P + 89;
            Z0.f13887Q = i14 % 128;
            int i15 = i14 % 2;
            this.f13889M = str;
            if (i15 == 0) {
                throw null;
            }
        }
        String str3 = this.f14419R;
        int i16 = f14417Y + 21;
        f14418Z = i16 % 128;
        if (i16 % 2 != 0) {
            return str3;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0544  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 1644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1073n6.w0(java.lang.String):java.lang.Class");
    }
}
