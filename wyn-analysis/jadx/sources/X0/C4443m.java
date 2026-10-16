package x0;

import ef.C2515C;
import ef.InterfaceC2521e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: x0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4443m extends AbstractC3343n implements tf.p {

    /* renamed from: j, reason: collision with root package name */
    public static final C4443m f47607j = new C4443m(2, 0);
    public static final C4443m k = new C4443m(2, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C4443m f47608l = new C4443m(2, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final C4443m f47609m = new C4443m(2, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final C4443m f47610n = new C4443m(2, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final C4443m f47611o = new C4443m(2, 5);

    /* renamed from: p, reason: collision with root package name */
    public static final C4443m f47612p = new C4443m(2, 6);

    /* renamed from: q, reason: collision with root package name */
    public static final C4443m f47613q = new C4443m(2, 7);

    /* renamed from: r, reason: collision with root package name */
    public static final C4443m f47614r = new C4443m(2, 8);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f47615i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4443m(int i5, int i10) {
        super(i5);
        this.f47615i = i10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        String str;
        InterfaceC2521e interfaceC2521e;
        switch (this.f47615i) {
            case 0:
                List list = (List) obj;
                List childValue = (List) obj2;
                AbstractC3340k.e(childValue, "childValue");
                if (list == null) {
                    return childValue;
                }
                ArrayList arrayListU0 = ff.o.U0(list);
                arrayListU0.addAll(childValue);
                return arrayListU0;
            case 1:
                C2515C c2515c = (C2515C) obj;
                AbstractC3340k.e((C2515C) obj2, "<anonymous parameter 1>");
                return c2515c;
            case 2:
                AbstractC3340k.e((String) obj2, "<anonymous parameter 1>");
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 3:
                C4435e c4435e = (C4435e) obj;
                int i5 = ((C4435e) obj2).f47578a;
                return c4435e;
            case 4:
                String str2 = (String) obj;
                AbstractC3340k.e((String) obj2, "<anonymous parameter 1>");
                return str2;
            case 5:
                List list2 = (List) obj;
                List childValue2 = (List) obj2;
                AbstractC3340k.e(childValue2, "childValue");
                if (list2 == null) {
                    return childValue2;
                }
                ArrayList arrayListU02 = ff.o.U0(list2);
                arrayListU02.addAll(childValue2);
                return arrayListU02;
            case 6:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 7:
                C4431a c4431a = (C4431a) obj;
                C4431a childValue3 = (C4431a) obj2;
                AbstractC3340k.e(childValue3, "childValue");
                if (c4431a == null || (str = c4431a.f47567a) == null) {
                    str = childValue3.f47567a;
                }
                if (c4431a == null || (interfaceC2521e = c4431a.f47568b) == null) {
                    interfaceC2521e = childValue3.f47568b;
                }
                return new C4431a(str, interfaceC2521e);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
