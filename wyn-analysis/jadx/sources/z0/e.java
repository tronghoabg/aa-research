package z0;

import Va.Y7;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3343n;
import r7.AbstractC3935e;

/* loaded from: classes.dex */
public final class e extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48282i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Y7 f48283j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Y7 y72, int i5) {
        super(0);
        this.f48282i = i5;
        this.f48283j = y72;
    }

    @Override // tf.a
    public final Object invoke() {
        Object obj;
        Object obj2;
        switch (this.f48282i) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f48283j.f13870d;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj3 = arrayList.get(0);
                    float fA = ((g) obj3).f48291a.a();
                    int iZ = AbstractC3935e.z(arrayList);
                    int i5 = 1;
                    if (1 <= iZ) {
                        while (true) {
                            Object obj4 = arrayList.get(i5);
                            float fA2 = ((g) obj4).f48291a.a();
                            if (Float.compare(fA, fA2) < 0) {
                                obj3 = obj4;
                                fA = fA2;
                            }
                            if (i5 != iZ) {
                                i5++;
                            }
                        }
                    }
                    obj = obj3;
                }
                g gVar = (g) obj;
                return Float.valueOf(gVar != null ? gVar.f48291a.a() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            default:
                ArrayList arrayList2 = (ArrayList) this.f48283j.f13870d;
                if (arrayList2.isEmpty()) {
                    obj2 = null;
                } else {
                    Object obj5 = arrayList2.get(0);
                    float fB = ((g) obj5).f48291a.b();
                    int iZ2 = AbstractC3935e.z(arrayList2);
                    int i10 = 1;
                    if (1 <= iZ2) {
                        while (true) {
                            Object obj6 = arrayList2.get(i10);
                            float fB2 = ((g) obj6).f48291a.b();
                            if (Float.compare(fB, fB2) < 0) {
                                obj5 = obj6;
                                fB = fB2;
                            }
                            if (i10 != iZ2) {
                                i10++;
                            }
                        }
                    }
                    obj2 = obj5;
                }
                g gVar2 = (g) obj2;
                return Float.valueOf(gVar2 != null ? gVar2.f48291a.b() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }
}
