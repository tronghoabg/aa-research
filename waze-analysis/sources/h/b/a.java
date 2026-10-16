package h.b;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.waze.app_nav.hub.a.f;
import com.waze.shared_infra.s.c;
import h.c.j;
import h.c.k;
import h.g.a.l;
import h.g.b.x;
import h.s;
import h.v;
import java.util.Comparator;
import l.a.blz;
import l.a.bnx;
import l.a.bow;
import l.a.bpe;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class a {
    public static final int a(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final Comparator b(l... lVarArr) {
        x.f(lVarArr, "selectors");
        return new f(lVarArr, 4);
    }

    public static final Comparator c() {
        return b.f48036b;
    }

    public static final Comparator d() {
        return b.f48035a;
    }

    public static float e(float f2, float... fArr) {
        x.f(fArr, "other");
        for (int i2 = 0; i2 < 3; i2++) {
            f2 = Math.max(f2, fArr[i2]);
        }
        return f2;
    }

    public static float f(float f2, float... fArr) {
        x.f(fArr, "other");
        for (int i2 = 0; i2 < 3; i2++) {
            f2 = Math.min(f2, fArr[i2]);
        }
        return f2;
    }

    public static int g(int i2, int... iArr) {
        x.f(iArr, "other");
        for (int i3 : iArr) {
            i2 = Math.max(i2, i3);
        }
        return i2;
    }

    public static Comparable h(Comparable comparable, Comparable comparable2) {
        x.f(comparable, CmcdData.OBJECT_TYPE_AUDIO_ONLY);
        x.f(comparable2, "b");
        return comparable.compareTo(comparable2) >= 0 ? comparable : comparable2;
    }

    public static j i(j jVar, j jVar2) {
        x.f(jVar2, "context");
        return jVar2 == k.f48060a ? jVar : (j) jVar2.fold(jVar, new com.waze.cf.j(4));
    }

    public static final v j(String str) {
        x.f(str, "<this>");
        x.f(str, "<this>");
        h.m.k.y(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (x.a(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j2 = 0;
        long j3 = 512409557603043100L;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) > 0) {
                if (j3 == 512409557603043100L) {
                    j3 = 1844674407370955161L;
                    if (Long.compare(j2 ^ Long.MIN_VALUE, 1844674407370955161L ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long j4 = j2 * 10;
            long j5 = iDigit + j4;
            if (Long.compare(j5 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            j2 = j5;
        }
        return v.b(j2);
    }

    public static final s k(String str) {
        int i2;
        x.f(str, "<this>");
        h.m.k.y(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        if (x.a(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int i4 = 119304647;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), 10);
            if (iDigit < 0) {
                return null;
            }
            if (l(i3, i4) > 0) {
                if (i4 != 119304647) {
                    return null;
                }
                i4 = 429496729;
                if (l(i3, 429496729) > 0) {
                    return null;
                }
            }
            int i5 = i3 * 10;
            int i6 = iDigit + i5;
            if (l(i6, i5) < 0) {
                return null;
            }
            i2++;
            i3 = i6;
        }
        return s.b(i3);
    }

    public static /* synthetic */ int l(int i2, int i3) {
        return Integer.compare(i2 ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE);
    }

    public static final /* synthetic */ c m(blz blzVar) {
        x.f(blzVar, "builder");
        return new c(blzVar);
    }

    public static final /* synthetic */ com.waze.sharedui.d.a.b n(bpe bpeVar) {
        x.f(bpeVar, "builder");
        return new com.waze.sharedui.d.a.b(bpeVar);
    }

    public static final /* synthetic */ com.waze.sharedui.d.a.b o(bow bowVar) {
        x.f(bowVar, "builder");
        return new com.waze.sharedui.d.a.b(bowVar);
    }

    public static final /* synthetic */ com.waze.sharedui.d.a.b p(bnx bnxVar) {
        x.f(bnxVar, "builder");
        return new com.waze.sharedui.d.a.b(bnxVar);
    }
}
