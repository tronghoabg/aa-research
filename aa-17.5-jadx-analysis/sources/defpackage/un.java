package defpackage;

import androidx.car.app.model.Metadata;
import com.google.android.apps.auto.sdk.nav.state.DestinationDetails;
import com.google.android.apps.auto.sdk.nav.state.NavigationSummary;
import com.google.android.apps.auto.sdk.nav.state.TurnEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class un {
    public Object a;

    public un(Metadata metadata) {
        metadata.getClass();
        this.a = metadata.getPlace();
    }

    public final void a(List list) {
        ((TurnEvent) this.a).l = list == null ? null : new ArrayList(list);
    }

    @Deprecated
    public final void b(List list) {
        ((TurnEvent) this.a).n = list == null ? null : new ArrayList(list);
    }

    public final void c(List list) {
        if (list == null) {
            ((TurnEvent) this.a).p = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DestinationDetails) it.next()).a);
        }
        TurnEvent turnEvent = (TurnEvent) this.a;
        turnEvent.n = arrayList;
        turnEvent.p = new ArrayList(list);
    }

    public final void d(List list) {
        ((TurnEvent) this.a).o = new ArrayList(list);
    }

    public final void e(List list) {
        ((TurnEvent) this.a).m = list == null ? null : new ArrayList(list);
    }

    public final void f(int i) {
        if (i < 0 || i > 50) {
            throw new IllegalArgumentException(a.bp(i, "maneuver type value is inavlid: "));
        }
        ((TurnEvent) this.a).k = i;
    }

    public final void g(int i) {
        if (i > 360 || i <= 0) {
            throw new IllegalArgumentException("Turn angle must be in [1, 360]");
        }
        ((TurnEvent) this.a).d = i;
    }

    public final void h(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("roundabout exit number can't be negative.");
        }
        ((TurnEvent) this.a).e = i;
    }

    public final void i(int i, int i2) throws IllegalArgumentException {
        if (i > 360 || i <= 0) {
            throw new IllegalArgumentException("Turn angle must be in [1, 360]");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("Turn number must be > 0");
        }
        TurnEvent turnEvent = (TurnEvent) this.a;
        turnEvent.a = 13;
        turnEvent.d = i;
        turnEvent.e = i2;
    }

    public final void j(int i) throws IllegalArgumentException {
        if (i < 0 && i != -1) {
            throw new IllegalArgumentException("turnEtaSeconds must be >= 0 or INVALID_VALUE");
        }
        ((TurnEvent) this.a).h = i;
    }

    public final void k(int i) throws IllegalArgumentException {
        if (i < 0) {
            throw new IllegalArgumentException("displayDistanceE3 must be >= 0");
        }
        ((TurnEvent) this.a).i = i;
    }

    public final void l(int i) throws IllegalArgumentException {
        if (i < 0) {
            throw new IllegalArgumentException("distanceMeters must be >= 0");
        }
        ((TurnEvent) this.a).g = i;
    }

    public final void m(int i) {
        ((TurnEvent) this.a).j = i;
    }

    public final void n(CharSequence charSequence) {
        ((TurnEvent) this.a).b = charSequence;
    }

    public final void o(int i) throws IllegalArgumentException {
        if (i <= 0 || i > 19) {
            throw new IllegalArgumentException(a.bp(i, "turnEvent is invalid: "));
        }
        TurnEvent turnEvent = (TurnEvent) this.a;
        turnEvent.a = i;
        turnEvent.d = -1;
        turnEvent.e = -1;
    }

    public final void p(byte[] bArr) {
        ((TurnEvent) this.a).f = bArr;
    }

    public final void q(int i) throws IllegalArgumentException {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("turnSide must be one of TurnSide.LEFT, TurnSide.RIGHT or TurnSide.UNKNOWN");
        }
        ((TurnEvent) this.a).c = i;
    }

    public final void r(int i) throws IllegalArgumentException {
        if (i != 2 && i != 1 && i != 4 && i != 3 && i != 5) {
            throw new IllegalArgumentException("Invalid navigation status value");
        }
        ((NavigationSummary) this.a).a = i;
    }

    public un(char[] cArr) {
        this.a = new TurnEvent();
    }

    public un(byte[] bArr, byte[] bArr2) {
        this.a = new NavigationSummary();
    }
}
