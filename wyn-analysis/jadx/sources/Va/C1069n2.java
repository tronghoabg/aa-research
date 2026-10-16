package Va;

import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: Va.n2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1069n2 extends WeakHashMap implements H9 {

    /* renamed from: c, reason: collision with root package name */
    public static int f14407c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f14408d = 1;

    /* renamed from: a, reason: collision with root package name */
    public final Ra f14409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1082o2 f14410b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1069n2(C1082o2 c1082o2, WeakHashMap weakHashMap, Ra ra2) {
        super(weakHashMap);
        this.f14410b = c1082o2;
        this.f14409a = ra2;
    }

    public final WeakReference a(View view, WeakReference weakReference) {
        String str;
        f14407c = (f14408d + 17) % 128;
        C1082o2 c1082o2 = this.f14410b;
        Ra ra2 = this.f14409a;
        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 283;
        int iMyTid = (Process.myTid() >> 22) + 1;
        char[] charArray = "\u0013￭\u0000\u0013\b\u0015\u0004￠\u0003\ufff6\u0004\u0000\n\uffe7\u0000\u0012\u0007￬\u0000\u000fￍ\u000f\u0014".toCharArray();
        synchronized (Ab.f13221x) {
            try {
                char[] cArr = new char[longPressTimeout];
                Ab.f13219v = 0;
                while (true) {
                    int i5 = Ab.f13219v;
                    if (i5 >= longPressTimeout) {
                        break;
                    }
                    char c10 = (char) (charArray[i5] + packedPositionType);
                    cArr[i5] = c10;
                    cArr[i5] = (char) (c10 - 186);
                    Ab.f13219v = i5 + 1;
                }
                if (iMyTid > 0) {
                    Ab.f13220w = iMyTid;
                    char[] cArr2 = new char[longPressTimeout];
                    System.arraycopy(cArr, 0, cArr2, 0, longPressTimeout);
                    int i10 = Ab.f13220w;
                    System.arraycopy(cArr2, 0, cArr, longPressTimeout - i10, i10);
                    int i11 = Ab.f13220w;
                    System.arraycopy(cArr2, i11, cArr, 0, longPressTimeout - i11);
                }
                str = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        c1082o2.B0(this, ra2, str.intern(), view, weakReference);
        WeakReference weakReference2 = (WeakReference) super.put(view, weakReference);
        f14407c = (f14408d + 89) % 128;
        return weakReference2;
    }

    @Override // Va.H9
    public final Object d() {
        int i5 = (f14407c + 109) % 128;
        f14408d = i5;
        int i10 = i5 + 57;
        int i11 = i10 % 128;
        f14407c = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        int i12 = i11 + 95;
        int i13 = i12 % 128;
        f14408d = i13;
        if (i12 % 2 == 0) {
            throw null;
        }
        int i14 = i13 + 111;
        f14407c = i14 % 128;
        if (i14 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        int i5 = f14407c + 71;
        f14408d = i5 % 128;
        int i10 = i5 % 2;
        WeakReference weakReferenceA = a((View) obj, (WeakReference) obj2);
        if (i10 == 0) {
            int i11 = 44 / 0;
        }
        return weakReferenceA;
    }
}
