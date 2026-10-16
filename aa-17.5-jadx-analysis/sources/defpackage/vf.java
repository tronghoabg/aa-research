package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarProgressBar;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Metadata;
import androidx.car.app.model.OnClickDelegateImpl;
import androidx.car.app.model.Row;
import androidx.car.app.model.Toggle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class vf {
    public CarText b;
    public CarIcon d;
    public CarIcon e;
    public Toggle h;
    public uq i;
    public boolean k;
    public CarProgressBar o;
    public boolean a = true;
    public final List c = new ArrayList();
    public final List f = new ArrayList();
    public int g = -1;
    public Metadata j = Metadata.EMPTY_METADATA;
    public int l = 1;
    public final int m = 1;
    public boolean n = true;

    public final Row a() {
        if (this.b == null) {
            throw new IllegalStateException("A title must be set on the row");
        }
        if (this.k) {
            if (this.h != null) {
                throw new IllegalStateException("A browsable row must not have a toggle set");
            }
            if (this.i == null) {
                throw new IllegalStateException("A browsable row must have its onClickListener set");
            }
            if (!this.f.isEmpty()) {
                throw new IllegalStateException("A browsable row must not have a secondary action set");
            }
        }
        if (this.h != null) {
            if (this.i != null) {
                throw new IllegalStateException("If a row contains a toggle, it must not have an onClickListener set");
            }
            if (this.g != -1) {
                throw new IllegalStateException("If a row contains a toggle, it must not have a numeric decoration set");
            }
            if (!this.f.isEmpty()) {
                throw new IllegalStateException("If a row contains a toggle, it must not have a secondary action set");
            }
        }
        return new Row(this);
    }

    public final void b(Action action) {
        List list = this.f;
        ArrayList arrayList = new ArrayList(list);
        action.getClass();
        arrayList.add(action);
        wf.e.a(arrayList);
        list.add(action);
    }

    public final void c(CarText carText) {
        wi wiVar = wi.f;
        carText.getClass();
        wiVar.a(carText);
        this.c.add(carText);
    }

    public final void d(CharSequence charSequence) {
        charSequence.getClass();
        wi.f.a(CarText.create(charSequence));
        this.c.add(CarText.create(charSequence));
    }

    public final void e(CarIcon carIcon, int i) {
        wh.a.a(carIcon);
        this.d = carIcon;
        this.l = i;
    }

    public final void f(int i) {
        if (i < 0 && i != -1) {
            throw new IllegalArgumentException(String.format("Decoration should be positive, zero, or equal to NO_DECORATION. Instead, was %d", Integer.valueOf(i)));
        }
        this.g = i;
    }

    public final void g(us usVar) {
        this.i = OnClickDelegateImpl.create(usVar);
    }

    public final void h(CarText carText) {
        carText.getClass();
        if (carText.isEmpty()) {
            throw new IllegalArgumentException("The title cannot be null or empty");
        }
        wi.e.a(carText);
        this.b = carText;
    }

    public final void i(CharSequence charSequence) {
        charSequence.getClass();
        CarText carTextCreate = CarText.create(charSequence);
        if (carTextCreate.isEmpty()) {
            throw new IllegalArgumentException("The title cannot be null or empty");
        }
        wi.e.a(carTextCreate);
        this.b = carTextCreate;
    }

    public final void j(Toggle toggle) {
        toggle.getClass();
        this.h = toggle;
    }
}
