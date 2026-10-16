package Va;

import android.view.ViewConfiguration;
import com.amazon.device.ads.DTBFetchManager;
import java.util.HashMap;

/* renamed from: Va.v1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1171v1 extends HashMap implements H9 {

    /* renamed from: c, reason: collision with root package name */
    public static int f14691c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f14692d = 1;

    /* renamed from: a, reason: collision with root package name */
    public final Ra f14693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1196x1 f14694b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1171v1(C1196x1 c1196x1, HashMap map, Ra ra2) {
        super(map);
        this.f14694b = c1196x1;
        this.f14693a = ra2;
    }

    public static String a(int i5) {
        String str;
        char[] charArray = "騶呋죥驲\udd38\ue457\udae9罤뻏識\ufe6c\u242e퍃虵錍\u009b\uf785ꋕ䢵\ued75ࠎ侽氨짚\u2d77ᐙǏ뛸䇮ヱ╧".toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(9070945986215708967L, charArray, i5);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i10 = AbstractC1104pb.f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * 9070945986215708967L));
                        AbstractC1104pb.f14483C = i10 + 1;
                    } else {
                        str = new String(cArrZ, 4, cArrZ.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final DTBFetchManager c(String str, DTBFetchManager dTBFetchManager) {
        int i5 = f14692d + 67;
        f14691c = i5 % 128;
        int i10 = i5 % 2;
        Ra ra2 = this.f14693a;
        C1196x1 c1196x1 = this.f14694b;
        if (i10 != 0) {
            String strIntern = a(0 - (ViewConfiguration.getTapTimeout() % 42)).intern();
            Object[] objArr = new Object[5];
            objArr[1] = str;
            objArr[1] = dTBFetchManager;
            c1196x1.B0(this, ra2, strIntern, objArr);
        } else {
            c1196x1.B0(this, ra2, a(1 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), str, dTBFetchManager);
        }
        return (DTBFetchManager) super.put(str, dTBFetchManager);
    }

    @Override // Va.H9
    public final Object d() {
        int i5 = f14691c + 25;
        int i10 = i5 % 128;
        f14692d = i10;
        if (i5 % 2 != 0) {
            int i11 = i10 + 41;
            f14691c = i11 % 128;
            if (i11 % 2 == 0) {
                return this;
            }
            throw null;
        }
        int i12 = i10 + 41;
        f14691c = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        int i13 = 71 / 0;
        return this;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        int i5 = f14691c + 71;
        f14692d = i5 % 128;
        int i10 = i5 % 2;
        DTBFetchManager dTBFetchManagerC = c((String) obj, (DTBFetchManager) obj2);
        if (i10 == 0) {
            int i11 = 64 / 0;
        }
        int i12 = f14692d + 29;
        f14691c = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 75 / 0;
        }
        return dTBFetchManagerC;
    }
}
