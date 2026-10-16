package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.UiStyle;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;

/* loaded from: classes.dex */
public final class iuq extends rkl {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("CAR.SERVICE");
    private final yfy c;
    private boolean d = true;

    public iuq(yfy yfyVar) {
        woy.aa(true ^ yfyVar.isEmpty(), "No car displays are attached. Displays have not been discovered or car is disconnected/disconnecting.");
        this.c = yfyVar;
    }

    @Override // defpackage.rkm
    public final int a() throws RemoteException {
        Optional optionalFindFirst = Collection.EL.stream(this.c.values()).filter(new iup(0)).findFirst();
        if (true == optionalFindFirst.isPresent()) {
            iva ivaVar = ((iuu) optionalFindFirst.get()).o;
            ivaVar.getClass();
            int iW = ivaVar.w();
            int i = iW - 1;
            if (iW == 0) {
                throw null;
            }
            optionalFindFirst = Optional.ofNullable(Integer.valueOf(i));
        }
        return ((Integer) optionalFindFirst.orElse(0)).intValue();
    }

    @Override // defpackage.rkm
    public final void b(boolean z) {
        ((ype) ((ype) b.h()).ai((char) 1353)).y("Setting updates enabled %s", Boolean.valueOf(z));
        this.d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rkm
    public final void c(UiStyle uiStyle) {
        if (!this.d) {
            ((ype) ((ype) b.h()).ai((char) 1354)).u("Blocking theme update.");
            return;
        }
        abnp abnpVarN = xox.a.n();
        abnp abnpVarN2 = xor.a.n();
        Stream map = Collection.EL.stream(uiStyle.a).map(new ric(6));
        abnpVarN2.getClass();
        map.forEach(new qio(abnpVarN2, 2));
        Collection.EL.stream(uiStyle.b).map(new ric(6)).forEach(new qio(abnpVarN2, 3));
        xor xorVar = (xor) abnpVarN2.q();
        abnpVarN.t();
        xox xoxVar = (xox) abnpVarN.b;
        xorVar.getClass();
        xoxVar.c = xorVar;
        xoxVar.b |= 1;
        xox xoxVar2 = (xox) abnpVarN.q();
        ynp ynpVarListIterator = ((yfq) this.c.values()).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            iuu iuuVar = (iuu) ynpVarListIterator.next();
            iva ivaVar = iuuVar.o;
            CarDisplayId carDisplayId = iuuVar.j;
            ivaVar.getClass();
            ivaVar.p(xoxVar2);
        }
    }
}
