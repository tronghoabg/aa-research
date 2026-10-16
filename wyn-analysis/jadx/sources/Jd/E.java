package Jd;

import java.util.ArrayList;
import kotlin.reflect.KType;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public final /* synthetic */ class E implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6023b;

    public /* synthetic */ E(ArrayList arrayList, int i5) {
        this.f6022a = i5;
        this.f6023b = arrayList;
    }

    @Override // tf.a
    public final Object invoke() {
        switch (this.f6022a) {
            case 0:
                ArrayList arrayList = this.f6023b;
                if (arrayList.isEmpty()) {
                    return ff.v.f35432a;
                }
                return arrayList.subList((((CharSequence) ff.o.q0(arrayList)).length() != 0 || arrayList.size() <= 1) ? 0 : 1, ((CharSequence) ff.o.y0(arrayList)).length() == 0 ? AbstractC3935e.z(arrayList) : 1 + AbstractC3935e.z(arrayList));
            default:
                return ((KType) this.f6023b.get(0)).getClassifier();
        }
    }
}
