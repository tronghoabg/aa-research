package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class us {
    public java.lang.Object a;

    public us(androidx.car.app.model.Metadata metadata) {
        metadata.getClass();
        this.a = metadata.getPlace();
    }

    public final void a(java.util.List list) {
        ((com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.a).l = list == null ? null : new java.util.ArrayList(list);
    }

    @java.lang.Deprecated
    public final void b(java.util.List list) {
        ((com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.a).n = list == null ? null : new java.util.ArrayList(list);
    }

    public final void c(java.util.List list) {
        if (list == null) {
            ((com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.a).p = null;
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.google.android.apps.auto.sdk.nav.state.DestinationDetails) it.next()).a);
        }
        com.google.android.apps.auto.sdk.nav.state.TurnEvent turnEvent = (com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.a;
        turnEvent.n = arrayList;
        turnEvent.p = new java.util.ArrayList(list);
    }

    public final void d(java.util.List list) {
        ((com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.a).o = new java.util.ArrayList(list);
    }

    public final void e(java.util.List list) {
        ((com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.a).m = list == null ? null : new java.util.ArrayList(list);
    }

    public final void f(int i) {
        if (i < 0 || i > 50) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "maneuver type value is inavlid: "));
        }
        ((com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.a).k = i;
    }

    public final void g(int i) {
        if (i > 360 || i <= 0) {
            throw new java.lang.IllegalArgumentException("Turn angle must be in [1, 360]");
        }
        ((com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.a).d = i;
    }

    public final void h(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("roundabout exit number can't be negative.");
        }
        ((com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.a).e = i;
    }

    public final void i(int i, int i2) throws java.lang.IllegalArgumentException {
        if (i > 360 || i <= 0) {
            throw new java.lang.IllegalArgumentException("Turn angle must be in [1, 360]");
        }
        if (i2 <= 0) {
            throw new java.lang.IllegalArgumentException("Turn number must be > 0");
        }
        com.google.android.apps.auto.sdk.nav.state.TurnEvent turnEvent = (com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.a;
        turnEvent.a = 13;
        turnEvent.d = i;
        turnEvent.e = i2;
    }

    public final void j(int i) throws java.lang.IllegalArgumentException {
        if (i < 0 && i != -1) {
            throw new java.lang.IllegalArgumentException("turnEtaSeconds must be >= 0 or INVALID_VALUE");
        }
        ((com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.a).h = i;
    }

    public final void k(int i) throws java.lang.IllegalArgumentException {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("displayDistanceE3 must be >= 0");
        }
        ((com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.a).i = i;
    }

    public final void l(int i) throws java.lang.IllegalArgumentException {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("distanceMeters must be >= 0");
        }
        ((com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.a).g = i;
    }

    public final void m(int i) {
        ((com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.a).j = i;
    }

    public final void n(java.lang.CharSequence charSequence) {
        ((com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.a).b = charSequence;
    }

    public final void o(int i) throws java.lang.IllegalArgumentException {
        if (i <= 0 || i > 19) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "turnEvent is invalid: "));
        }
        com.google.android.apps.auto.sdk.nav.state.TurnEvent turnEvent = (com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.a;
        turnEvent.a = i;
        turnEvent.d = -1;
        turnEvent.e = -1;
    }

    public final void p(byte[] bArr) {
        ((com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.a).f = bArr;
    }

    public final void q(int i) throws java.lang.IllegalArgumentException {
        if (i < 0 || i > 2) {
            throw new java.lang.IllegalArgumentException("turnSide must be one of TurnSide.LEFT, TurnSide.RIGHT or TurnSide.UNKNOWN");
        }
        ((com.google.android.apps.auto.sdk.nav.state.TurnEvent) this.a).c = i;
    }

    public final void r(int i) throws java.lang.IllegalArgumentException {
        if (i != 2 && i != 1 && i != 4 && i != 3 && i != 5) {
            throw new java.lang.IllegalArgumentException("Invalid navigation status value");
        }
        ((com.google.android.apps.auto.sdk.nav.state.NavigationSummary) this.a).a = i;
    }

    public us(char[] cArr) {
        this.a = new com.google.android.apps.auto.sdk.nav.state.TurnEvent();
    }

    public us(byte[] bArr, byte[] bArr2) {
        this.a = new com.google.android.apps.auto.sdk.nav.state.NavigationSummary();
    }
}
