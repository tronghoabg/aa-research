package A;

import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC3343n;
import z.EnumC4601f;

/* loaded from: classes.dex */
public final class T extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ U f78j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(U u10, int i5) {
        super(0);
        this.f77i = i5;
        this.f78j = u10;
    }

    @Override // tf.a
    public final Object invoke() {
        switch (this.f77i) {
            case 0:
                U u10 = this.f78j;
                ListIterator listIterator = u10.f86h.listIterator();
                long jMax = 0;
                while (true) {
                    X.v vVar = (X.v) listIterator;
                    if (vVar.hasNext()) {
                        jMax = Math.max(jMax, ((O) vVar.next()).a().f51h);
                    } else {
                        ListIterator listIterator2 = u10.f87i.listIterator();
                        while (true) {
                            X.v vVar2 = (X.v) listIterator2;
                            if (!vVar2.hasNext()) {
                                return Long.valueOf(jMax);
                            }
                            jMax = Math.max(jMax, ((Number) ((U) vVar2.next()).k.getValue()).longValue());
                        }
                    }
                }
            default:
                U u11 = this.f78j;
                Object objB = u11.b();
                EnumC4601f enumC4601f = EnumC4601f.f48219b;
                return Boolean.valueOf(objB == enumC4601f || u11.f81c.getValue() == enumC4601f);
        }
    }
}
