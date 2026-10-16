package Va;

import android.os.Process;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class S7 implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f13678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13679b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1126r8 f13680c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1203x8 f13681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1214y7 f13682e;

    public S7(C1214y7 c1214y7, C1126r8 c1126r8, C1203x8 c1203x8, List list, boolean z2) {
        this.f13678a = list;
        this.f13679b = z2;
        this.f13680c = c1126r8;
        this.f13681d = c1203x8;
        this.f13682e = c1214y7;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        try {
            ArrayList arrayListN1 = E7.N1(this.f13678a, new Object[]{this, view, Integer.valueOf(i5), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16)});
            if (this.f13679b) {
                this.f13680c.c(this.f13681d, this.f13682e, arrayListN1);
                return;
            }
            C1206y c1206y = new C1206y(14);
            c1206y.f14799e = this;
            c1206y.f14798d = arrayListN1;
            Cb.j(c1206y);
        } catch (Throwable th) {
            String strF = this.f13682e.f();
            StringBuilder sb2 = new StringBuilder();
            int gidForName = Process.getGidForName("") + 19422;
            char[] charArray = "ޱ䱛逼\ue40c⣲粅삳ᒑ夼굾\uf138䗇觉\uddb4\u218d癲멐บ刖꛲\ueade㺲药흣ᬥ漒돲ߞ䮶龘\ue460⠗簽샧ᓝ墪겄\uf160䔚".toCharArray();
            synchronized (AbstractC0897a.f13937u) {
                try {
                    AbstractC0897a.f13936t = gidForName;
                    char[] cArr = new char[charArray.length];
                    AbstractC0897a.f13935s = 0;
                    while (true) {
                        int i17 = AbstractC0897a.f13935s;
                        if (i17 >= charArray.length) {
                            sb2.append(new String(cArr).intern());
                            C1126r8 c1126r8 = this.f13680c;
                            c1126r8.getClass();
                            C1126r8.f14551g = (C1126r8.f14550f + 25) % 128;
                            sb2.append(c1126r8.f14552a);
                            AbstractC0897a.f(strF, sb2.toString(), th);
                            return;
                        }
                        cArr[i17] = (char) ((charArray[i17] ^ (AbstractC0897a.f13936t * i17)) ^ (-6191082541804156940L));
                        AbstractC0897a.f13935s = i17 + 1;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
