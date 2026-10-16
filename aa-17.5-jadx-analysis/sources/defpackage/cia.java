package defpackage;

import android.content.Context;
import android.support.v4.app.FragmentContainerView;

/* loaded from: classes.dex */
public final /* synthetic */ class cia implements afec {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ cia(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((ciu) obj).k(this.a));
            case 1:
                return Boolean.valueOf(((ciu) obj).k(this.a));
            case 2:
                return Boolean.valueOf(((ciu) obj).j(this.a));
            case 3:
                Class cls = czq.a;
                return Boolean.valueOf(((ciu) obj).k(this.a));
            case 4:
                Class cls2 = czq.a;
                return Boolean.valueOf(((ciu) obj).k(this.a));
            case 5:
                Context context = (Context) obj;
                int i = jvk.a;
                context.getClass();
                FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
                fragmentContainerView.setId(this.a);
                return fragmentContainerView;
            case 6:
                cis cisVar = (cis) obj;
                cisVar.getClass();
                if (cisVar.b()) {
                    kml.b = Integer.valueOf(this.a);
                }
                return afak.a;
            case 7:
                return Integer.valueOf(this.a * ((Integer) obj).intValue());
            case 8:
                return Integer.valueOf((-this.a) * ((Integer) obj).intValue());
            case 9:
                oqb oqbVar = (oqb) obj;
                oqbVar.getClass();
                return Boolean.valueOf(oqbVar.a == this.a);
            case 10:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.a + ".");
            default:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.a + ".");
        }
    }
}
