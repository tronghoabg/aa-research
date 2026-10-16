package defpackage;

import androidx.car.app.model.CarIcon;
import com.google.android.apps.auto.components.apphost.menu.WrapperMenuView;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes2.dex */
public final /* synthetic */ class jtw implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jtw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [afdr, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        int i = 1;
        switch (this.b) {
            case 0:
                afdr afdrVar = ((fxu) this.a).c;
                if (afdrVar != null) {
                    afdrVar.invoke();
                }
                return afak.a;
            case 1:
                afdr afdrVar2 = ((fxq) this.a).b;
                if (afdrVar2 != null) {
                    afdrVar2.invoke();
                }
                return afak.a;
            case 2:
                afdr afdrVar3 = ((fxu) this.a).c;
                if (afdrVar3 != null) {
                    afdrVar3.invoke();
                }
                return afak.a;
            case 3:
                ?? r3 = this.a;
                int i2 = jua.a;
                if (r3 != 0) {
                    r3.invoke();
                }
                return afak.a;
            case 4:
                afdr afdrVar4 = ((fyf) this.a).c;
                if (afdrVar4 != null) {
                    afdrVar4.invoke();
                }
                return afak.a;
            case 5:
                afdr afdrVar5 = ((fyf) this.a).c;
                if (afdrVar5 != null) {
                    afdrVar5.invoke();
                }
                return afak.a;
            case 6:
                ((jva) this.a).g(true);
                return afak.a;
            case 7:
                jva.a.l().u("Registering user as idle");
                Object obj = this.a;
                ((jva) obj).k.d(gid.a);
                return afak.a;
            case 8:
                boolean zContainsAll = false;
                if (acob.v()) {
                    yfq yfqVarC = ((jve) this.a).a.c();
                    if (!yfqVarC.isEmpty()) {
                        yfq yfqVarA = tgx.a(new jxe(i), acob.g());
                        yfqVarC.getClass();
                        zContainsAll = yfqVarA.containsAll(yfqVarC);
                    }
                }
                return Boolean.valueOf(zContainsAll);
            case 9:
                Object obj2 = this.a;
                return new tgw(((jve) obj2).b, acob.i());
            case 10:
                Object obj3 = this.a;
                return new tgw(((jve) obj3).b, acob.l());
            case 11:
                CarIcon carIconI = ((GhIcon) this.a).i(mki.a.c, -1);
                carIconI.getClass();
                return carIconI;
            case 12:
                ((WrapperMenuView) this.a).requestFocus();
                return afak.a;
            case 13:
                ((afdr) ((affv) this.a).a).invoke();
                return afak.a;
            case 14:
                return new gda((geu) this.a);
            case 15:
                return new gmy((geu) this.a);
            case 16:
                return new ful((geu) this.a);
            case 17:
                return new gvt((geu) this.a);
            case 18:
                return new hmm((geu) this.a);
            case 19:
                return new gzp((geu) this.a);
            default:
                return new grb((geu) this.a);
        }
    }
}
