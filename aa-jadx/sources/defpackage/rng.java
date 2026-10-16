package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rng extends defpackage.ijw implements defpackage.rnh {
    public final android.view.inputmethod.InputConnection a;
    public volatile boolean b;
    private final defpackage.rmu c;

    public rng(android.view.inputmethod.InputConnection inputConnection, defpackage.rmu rmuVar) {
        super("com.google.android.gms.car.input.IProxyInputConnection");
        this.a = inputConnection;
        this.b = true;
        this.c = rmuVar;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean a(java.util.concurrent.Callable callable) {
        if (!this.b) {
            return false;
        }
        defpackage.rbz.j(new defpackage.rft(this, callable, 17));
        return true;
    }

    @Override // defpackage.rnh
    public final int e(int i) {
        if (this.b) {
            return ((java.lang.Integer) defpackage.rbz.m(new defpackage.rni(this, i, 4), 0)).intValue();
        }
        return 0;
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.rmy rmwVar;
        switch (i) {
            case 1:
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                defpackage.ijx.d(parcel);
                java.lang.CharSequence charSequenceH = h(i2, i3);
                parcel2.writeNoException();
                defpackage.ijx.f(parcel2, charSequenceH);
                return true;
            case 2:
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                defpackage.ijx.d(parcel);
                java.lang.CharSequence charSequenceG = g(i4, i5);
                parcel2.writeNoException();
                defpackage.ijx.f(parcel2, charSequenceG);
                return true;
            case 3:
                int i6 = parcel.readInt();
                defpackage.ijx.d(parcel);
                java.lang.CharSequence charSequenceF = f(i6);
                parcel2.writeNoException();
                defpackage.ijx.f(parcel2, charSequenceF);
                return true;
            case 4:
                int i7 = parcel.readInt();
                defpackage.ijx.d(parcel);
                int iE = e(i7);
                parcel2.writeNoException();
                parcel2.writeInt(iE);
                return true;
            case 5:
                int i8 = parcel.readInt();
                int i9 = parcel.readInt();
                defpackage.ijx.d(parcel);
                boolean zM = m(i8, i9);
                parcel2.writeNoException();
                parcel2.writeInt(zM ? 1 : 0);
                return true;
            case 6:
                java.lang.CharSequence charSequenceB = defpackage.ijx.b(parcel);
                int i10 = parcel.readInt();
                defpackage.ijx.d(parcel);
                boolean zV = v(charSequenceB, i10);
                parcel2.writeNoException();
                parcel2.writeInt(zV ? 1 : 0);
                return true;
            case 7:
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                defpackage.ijx.d(parcel);
                boolean zU = u(i11, i12);
                parcel2.writeNoException();
                parcel2.writeInt(zU ? 1 : 0);
                return true;
            case 8:
                boolean zO = o();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcel2.writeInt(zO ? 1 : 0);
                return true;
            case 9:
                java.lang.CharSequence charSequenceB2 = defpackage.ijx.b(parcel);
                int i13 = parcel.readInt();
                defpackage.ijx.d(parcel);
                boolean zL = l(charSequenceB2, i13);
                parcel2.writeNoException();
                parcel2.writeInt(zL ? 1 : 0);
                return true;
            case 10:
                int i14 = parcel.readInt();
                int i15 = parcel.readInt();
                defpackage.ijx.d(parcel);
                boolean zW = w(i14, i15);
                parcel2.writeNoException();
                parcel2.writeInt(zW ? 1 : 0);
                return true;
            case 11:
                int i16 = parcel.readInt();
                defpackage.ijx.d(parcel);
                boolean zQ = q(i16);
                parcel2.writeNoException();
                parcel2.writeInt(zQ ? 1 : 0);
                return true;
            case 12:
                int i17 = parcel.readInt();
                defpackage.ijx.d(parcel);
                boolean zP = p(i17);
                parcel2.writeNoException();
                parcel2.writeInt(zP ? 1 : 0);
                return true;
            case 13:
                boolean zJ = j();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader2 = defpackage.ijx.a;
                parcel2.writeInt(zJ ? 1 : 0);
                return true;
            case 14:
                boolean zN = n();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader3 = defpackage.ijx.a;
                parcel2.writeInt(zN ? 1 : 0);
                return true;
            case 15:
                android.view.KeyEvent keyEvent = (android.view.KeyEvent) defpackage.ijx.a(parcel, android.view.KeyEvent.CREATOR);
                defpackage.ijx.d(parcel);
                boolean zT = t(keyEvent);
                parcel2.writeNoException();
                parcel2.writeInt(zT ? 1 : 0);
                return true;
            case 16:
                int i18 = parcel.readInt();
                defpackage.ijx.d(parcel);
                boolean zK = k(i18);
                parcel2.writeNoException();
                parcel2.writeInt(zK ? 1 : 0);
                return true;
            case 17:
                boolean zJ2 = defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                boolean zS = s(zJ2);
                parcel2.writeNoException();
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            case 18:
                java.lang.String string = parcel.readString();
                android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
                defpackage.ijx.d(parcel);
                boolean zR = r(string, bundle);
                parcel2.writeNoException();
                parcel2.writeInt(zR ? 1 : 0);
                return true;
            case 19:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    rmwVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.input.ICarEditableListener");
                    rmwVar = iInterfaceQueryLocalInterface instanceof defpackage.rmy ? (defpackage.rmy) iInterfaceQueryLocalInterface : new defpackage.rmw(strongBinder);
                }
                defpackage.ijx.d(parcel);
                i(rmwVar);
                parcel2.writeNoException();
                return true;
            case 20:
                defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                throw new android.os.RemoteException("Deprecated Method");
            default:
                return false;
        }
    }

    @Override // defpackage.rnh
    public final java.lang.CharSequence f(int i) {
        if (this.b) {
            return (java.lang.CharSequence) defpackage.rbz.m(new defpackage.rni(this, i, 3), null);
        }
        return null;
    }

    @Override // defpackage.rnh
    public final java.lang.CharSequence g(int i, int i2) {
        if (this.b) {
            return (java.lang.CharSequence) defpackage.rbz.m(new defpackage.rnl(this, i, i2, 2), null);
        }
        return null;
    }

    @Override // defpackage.rnh
    public final java.lang.CharSequence h(int i, int i2) {
        if (this.b) {
            return (java.lang.CharSequence) defpackage.rbz.m(new defpackage.rnl(this, i, i2, 0), null);
        }
        return null;
    }

    @Override // defpackage.rnh
    public final void i(defpackage.rmy rmyVar) {
        this.c.a(new defpackage.wd(rmyVar));
    }

    @Override // defpackage.rnh
    public final boolean j() {
        if (this.b) {
            return ((java.lang.Boolean) defpackage.rbz.m(new defpackage.qnn(this, 6), java.lang.Boolean.FALSE)).booleanValue();
        }
        return false;
    }

    @Override // defpackage.rnh
    public final boolean k(int i) {
        return a(new defpackage.rni(this, i, 2));
    }

    @Override // defpackage.rnh
    public final boolean l(java.lang.CharSequence charSequence, int i) {
        return a(new defpackage.rnm(this, charSequence, i, 0));
    }

    @Override // defpackage.rnh
    public final boolean m(int i, int i2) {
        return a(new defpackage.rnl(this, i, i2, 3));
    }

    @Override // defpackage.rnh
    public final boolean n() {
        if (this.b) {
            return ((java.lang.Boolean) defpackage.rbz.m(new defpackage.qnn(this, 7), java.lang.Boolean.FALSE)).booleanValue();
        }
        return false;
    }

    @Override // defpackage.rnh
    public final boolean o() {
        return a(new defpackage.qnn(this, 8));
    }

    @Override // defpackage.rnh
    public final boolean p(int i) {
        return a(new defpackage.rni(this, i, 0));
    }

    @Override // defpackage.rnh
    public final boolean q(int i) {
        return a(new defpackage.rni(this, i, 1));
    }

    @Override // defpackage.rnh
    public final boolean r(java.lang.String str, android.os.Bundle bundle) {
        return a(new defpackage.rnk(this, str, bundle));
    }

    @Override // defpackage.rnh
    public final boolean s(boolean z) {
        return a(new defpackage.rnj(this, z));
    }

    @Override // defpackage.rnh
    public final boolean t(android.view.KeyEvent keyEvent) {
        return a(new defpackage.qrw(this, keyEvent, 2));
    }

    @Override // defpackage.rnh
    public final boolean u(int i, int i2) {
        return a(new defpackage.rnl(this, i, i2, 4));
    }

    @Override // defpackage.rnh
    public final boolean v(java.lang.CharSequence charSequence, int i) {
        return a(new defpackage.rnm(this, charSequence, i, 1));
    }

    @Override // defpackage.rnh
    public final boolean w(int i, int i2) {
        return a(new defpackage.rnl(this, i, i2, 1));
    }
}
