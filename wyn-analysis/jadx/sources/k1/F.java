package k1;

import android.text.TextUtils;
import android.view.View;
import gf.AbstractC2758e;

/* loaded from: classes.dex */
public final class F extends AbstractC2758e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38770e;

    public F(int i5, Class cls, int i10, int i11, int i12) {
        this.f38770e = i12;
        this.f35890a = i5;
        this.f35893d = cls;
        this.f35892c = i10;
        this.f35891b = i11;
    }

    @Override // gf.AbstractC2758e
    public final Object d(View view) {
        switch (this.f38770e) {
            case 0:
                return Boolean.valueOf(M.c(view));
            case 1:
                return M.a(view);
            case 2:
                return O.b(view);
            default:
                return Boolean.valueOf(M.b(view));
        }
    }

    @Override // gf.AbstractC2758e
    public final void e(View view, Object obj) {
        switch (this.f38770e) {
            case 0:
                M.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                M.e(view, (CharSequence) obj);
                break;
            case 2:
                O.c(view, (CharSequence) obj);
                break;
            default:
                M.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // gf.AbstractC2758e
    public final boolean h(Object obj, Object obj2) {
        switch (this.f38770e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
