package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class rmk extends ijo implements rml {
    public final InputConnection a;
    public volatile boolean b;
    private final rly c;

    public rmk(InputConnection inputConnection, rly rlyVar) {
        super("com.google.android.gms.car.input.IProxyInputConnection");
        this.a = inputConnection;
        this.b = true;
        this.c = rlyVar;
    }

    @ResultIgnorabilityUnspecified
    public final boolean a(Callable callable) {
        if (!this.b) {
            return false;
        }
        rbe.j(new rfc(this, callable, 14));
        return true;
    }

    @Override // defpackage.rml
    public final int e(int i) {
        if (this.b) {
            return ((Integer) rbe.m(new rmm(this, i, 4), 0)).intValue();
        }
        return 0;
    }

    @Override // defpackage.rml
    public final CharSequence f(int i) {
        if (this.b) {
            return (CharSequence) rbe.m(new rmm(this, i, 3), null);
        }
        return null;
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        rmc rmaVar;
        switch (i) {
            case 1:
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                ijp.d(parcel);
                CharSequence charSequenceH = h(i2, i3);
                parcel2.writeNoException();
                ijp.f(parcel2, charSequenceH);
                return true;
            case 2:
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                ijp.d(parcel);
                CharSequence charSequenceG = g(i4, i5);
                parcel2.writeNoException();
                ijp.f(parcel2, charSequenceG);
                return true;
            case 3:
                int i6 = parcel.readInt();
                ijp.d(parcel);
                CharSequence charSequenceF = f(i6);
                parcel2.writeNoException();
                ijp.f(parcel2, charSequenceF);
                return true;
            case 4:
                int i7 = parcel.readInt();
                ijp.d(parcel);
                int iE = e(i7);
                parcel2.writeNoException();
                parcel2.writeInt(iE);
                return true;
            case 5:
                int i8 = parcel.readInt();
                int i9 = parcel.readInt();
                ijp.d(parcel);
                boolean zM = m(i8, i9);
                parcel2.writeNoException();
                parcel2.writeInt(zM ? 1 : 0);
                return true;
            case 6:
                CharSequence charSequenceB = ijp.b(parcel);
                int i10 = parcel.readInt();
                ijp.d(parcel);
                boolean zV = v(charSequenceB, i10);
                parcel2.writeNoException();
                parcel2.writeInt(zV ? 1 : 0);
                return true;
            case 7:
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                ijp.d(parcel);
                boolean zU = u(i11, i12);
                parcel2.writeNoException();
                parcel2.writeInt(zU ? 1 : 0);
                return true;
            case 8:
                boolean zO = o();
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(zO ? 1 : 0);
                return true;
            case 9:
                CharSequence charSequenceB2 = ijp.b(parcel);
                int i13 = parcel.readInt();
                ijp.d(parcel);
                boolean zL = l(charSequenceB2, i13);
                parcel2.writeNoException();
                parcel2.writeInt(zL ? 1 : 0);
                return true;
            case 10:
                int i14 = parcel.readInt();
                int i15 = parcel.readInt();
                ijp.d(parcel);
                boolean zW = w(i14, i15);
                parcel2.writeNoException();
                parcel2.writeInt(zW ? 1 : 0);
                return true;
            case 11:
                int i16 = parcel.readInt();
                ijp.d(parcel);
                boolean zQ = q(i16);
                parcel2.writeNoException();
                parcel2.writeInt(zQ ? 1 : 0);
                return true;
            case 12:
                int i17 = parcel.readInt();
                ijp.d(parcel);
                boolean zP = p(i17);
                parcel2.writeNoException();
                parcel2.writeInt(zP ? 1 : 0);
                return true;
            case 13:
                boolean zJ = j();
                parcel2.writeNoException();
                ClassLoader classLoader2 = ijp.a;
                parcel2.writeInt(zJ ? 1 : 0);
                return true;
            case 14:
                boolean zN = n();
                parcel2.writeNoException();
                ClassLoader classLoader3 = ijp.a;
                parcel2.writeInt(zN ? 1 : 0);
                return true;
            case 15:
                KeyEvent keyEvent = (KeyEvent) ijp.a(parcel, KeyEvent.CREATOR);
                ijp.d(parcel);
                boolean zT = t(keyEvent);
                parcel2.writeNoException();
                parcel2.writeInt(zT ? 1 : 0);
                return true;
            case 16:
                int i18 = parcel.readInt();
                ijp.d(parcel);
                boolean zK = k(i18);
                parcel2.writeNoException();
                parcel2.writeInt(zK ? 1 : 0);
                return true;
            case 17:
                boolean zJ2 = ijp.j(parcel);
                ijp.d(parcel);
                boolean zS = s(zJ2);
                parcel2.writeNoException();
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            case 18:
                String string = parcel.readString();
                Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                boolean zR = r(string, bundle);
                parcel2.writeNoException();
                parcel2.writeInt(zR ? 1 : 0);
                return true;
            case 19:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    rmaVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.input.ICarEditableListener");
                    rmaVar = iInterfaceQueryLocalInterface instanceof rmc ? (rmc) iInterfaceQueryLocalInterface : new rma(strongBinder);
                }
                ijp.d(parcel);
                i(rmaVar);
                parcel2.writeNoException();
                return true;
            case 20:
                ijp.j(parcel);
                ijp.d(parcel);
                throw new RemoteException("Deprecated Method");
            default:
                return false;
        }
    }

    @Override // defpackage.rml
    public final CharSequence g(int i, int i2) {
        if (this.b) {
            return (CharSequence) rbe.m(new rmq(this, i, i2, 2), null);
        }
        return null;
    }

    @Override // defpackage.rml
    public final CharSequence h(int i, int i2) {
        if (this.b) {
            return (CharSequence) rbe.m(new rmq(this, i, i2, 0), null);
        }
        return null;
    }

    @Override // defpackage.rml
    public final void i(rmc rmcVar) {
        this.c.a(new vw(rmcVar));
    }

    @Override // defpackage.rml
    public final boolean j() {
        if (this.b) {
            return ((Boolean) rbe.m(new qmr(this, 5), false)).booleanValue();
        }
        return false;
    }

    @Override // defpackage.rml
    public final boolean k(int i) {
        return a(new rmm(this, i, 2));
    }

    @Override // defpackage.rml
    public final boolean l(CharSequence charSequence, int i) {
        return a(new rmr(this, charSequence, i, 0));
    }

    @Override // defpackage.rml
    public final boolean m(int i, int i2) {
        return a(new rmq(this, i, i2, 3));
    }

    @Override // defpackage.rml
    public final boolean n() {
        if (this.b) {
            return ((Boolean) rbe.m(new qmr(this, 6), false)).booleanValue();
        }
        return false;
    }

    @Override // defpackage.rml
    public final boolean o() {
        return a(new qmr(this, 7));
    }

    @Override // defpackage.rml
    public final boolean p(int i) {
        return a(new rmm(this, i, 0));
    }

    @Override // defpackage.rml
    public final boolean q(int i) {
        return a(new rmm(this, i, 1));
    }

    @Override // defpackage.rml
    public final boolean r(String str, Bundle bundle) {
        return a(new rmp(this, str, bundle));
    }

    @Override // defpackage.rml
    public final boolean s(boolean z) {
        return a(new rmo(this, z));
    }

    @Override // defpackage.rml
    public final boolean t(KeyEvent keyEvent) {
        return a(new rmn(this, keyEvent, 0));
    }

    @Override // defpackage.rml
    public final boolean u(int i, int i2) {
        return a(new rmq(this, i, i2, 4));
    }

    @Override // defpackage.rml
    public final boolean v(CharSequence charSequence, int i) {
        return a(new rmr(this, charSequence, i, 1));
    }

    @Override // defpackage.rml
    public final boolean w(int i, int i2) {
        return a(new rmq(this, i, i2, 1));
    }
}
