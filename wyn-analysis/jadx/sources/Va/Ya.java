package Va;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class Ya implements InterfaceC1180va {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Za f13882a;

    @Override // Va.InterfaceC1180va
    public final void a() {
        List arrayList;
        AbstractC1104pb.f14509t = (AbstractC1104pb.f14510u + 19) % 128;
        try {
            if (AbstractC1104pb.f14501l == null || AbstractC1104pb.f14502m == null) {
                Class<?> cls = Class.forName(AbstractC1104pb.W(127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0091\u0081\u0097\u0085\u0091\u0096\u0084\u0089\u008d\u0081\u0082\u0081\u008c\u008a\u0085\u0083\u0082\u0086\u008b\u0087\u008a\u0089\u0086\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern());
                AbstractC1104pb.f14501l = cls;
                AbstractC1104pb.f14502m = cls.getMethod(AbstractC1104pb.A((byte) (TextUtils.indexOf("", "", 0) + 20), TextUtils.lastIndexOf("", '0') + 12, "\u0001\u0002\u0003\u0004\u0005\u0000\u0000\b\u0001\ny").intern(), new Class[0]).invoke(null, new Object[0]);
            }
            arrayList = AbstractC1104pb.H(AbstractC1104pb.f14501l, AbstractC1104pb.f14502m);
        } catch (Throwable th) {
            String strIntern = AbstractC1104pb.A((byte) (TextUtils.getOffsetAfter("", 0) + 93), TextUtils.lastIndexOf("", '0', 0) + 13, "\n\u0002\n\u000b\u0006\u0011\u0007\u000f\u0000\u000e\u0011\u0002").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractC1104pb.A((byte) (AndroidCharacter.getMirror('0') - 21), 35 - TextUtils.getTrimmedLength(""), "\u0010\t\u000b\u0006\u0010\u0016\u0001\u0002\u008f\u008f\u0010\u0000\u0004\f\f\r\u0003\n\u0006\u0017\u0012\u0007\u0000\n\u0001\u0002\u0010\u0016\u0012\u000e\u0000\u0013\u0003\u0017;").intern());
            sb2.append(th.getLocalizedMessage());
            Ab.b(strIntern, sb2.toString());
            arrayList = new ArrayList();
        }
        ((ArrayList) this.f13882a.f13916b).clear();
        Za za2 = this.f13882a;
        ((ArrayList) za2.f13916b).addAll((ArrayList) za2.f13915a);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            View view = (View) arrayList.get(i5);
            ((ArrayList) this.f13882a.f13916b).remove(view);
            if (!((ArrayList) this.f13882a.f13915a).contains(view)) {
                ((ArrayList) this.f13882a.f13915a).add(view);
                Za za3 = this.f13882a;
                synchronized (za3) {
                    Iterator it = ((ArrayList) za3.f13917c).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0987gb) it.next()).a(view);
                    }
                }
            }
        }
        for (int i10 = 0; i10 < ((ArrayList) this.f13882a.f13916b).size(); i10++) {
            View view2 = (View) ((ArrayList) this.f13882a.f13916b).get(i10);
            ((ArrayList) this.f13882a.f13915a).remove(view2);
            Za.l(this.f13882a, view2);
        }
        ((ArrayList) this.f13882a.f13916b).clear();
    }
}
