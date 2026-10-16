package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class viy extends ijo implements viz {
    final /* synthetic */ zvf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public viy(zvf zvfVar) {
        super("com.google.android.libraries.maps.internal.IUiSettingsDelegate");
        this.a = zvfVar;
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 1:
                boolean zJ = ijp.j(parcel);
                ijp.d(parcel);
                hc(zJ);
                parcel2.writeNoException();
                return true;
            case 2:
                boolean zJ2 = ijp.j(parcel);
                ijp.d(parcel);
                gU(zJ2);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zJ3 = ijp.j(parcel);
                ijp.d(parcel);
                gX(zJ3);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zJ4 = ijp.j(parcel);
                ijp.d(parcel);
                gZ(zJ4);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean zJ5 = ijp.j(parcel);
                ijp.d(parcel);
                hd(zJ5);
                parcel2.writeNoException();
                return true;
            case 6:
                boolean zJ6 = ijp.j(parcel);
                ijp.d(parcel);
                hb(zJ6);
                parcel2.writeNoException();
                return true;
            case 7:
                boolean zJ7 = ijp.j(parcel);
                ijp.d(parcel);
                gY(zJ7);
                parcel2.writeNoException();
                return true;
            case 8:
                boolean zJ8 = ijp.j(parcel);
                ijp.d(parcel);
                gT(zJ8);
                parcel2.writeNoException();
                return true;
            case 9:
                boolean zHl = hl();
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(zHl ? 1 : 0);
                return true;
            case 10:
                boolean zHe = he();
                parcel2.writeNoException();
                ClassLoader classLoader2 = ijp.a;
                parcel2.writeInt(zHe ? 1 : 0);
                return true;
            case 11:
                boolean zHh = hh();
                parcel2.writeNoException();
                ClassLoader classLoader3 = ijp.a;
                parcel2.writeInt(zHh ? 1 : 0);
                return true;
            case 12:
                boolean zHj = hj();
                parcel2.writeNoException();
                ClassLoader classLoader4 = ijp.a;
                parcel2.writeInt(zHj ? 1 : 0);
                return true;
            case 13:
                boolean zHm = hm();
                parcel2.writeNoException();
                ClassLoader classLoader5 = ijp.a;
                parcel2.writeInt(zHm ? 1 : 0);
                return true;
            case 14:
                boolean zHk = hk();
                parcel2.writeNoException();
                ClassLoader classLoader6 = ijp.a;
                parcel2.writeInt(zHk ? 1 : 0);
                return true;
            case 15:
                boolean zHi = hi();
                parcel2.writeNoException();
                ClassLoader classLoader7 = ijp.a;
                parcel2.writeInt(zHi ? 1 : 0);
                return true;
            case 16:
                boolean zJ9 = ijp.j(parcel);
                ijp.d(parcel);
                gV(zJ9);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zHf = hf();
                parcel2.writeNoException();
                ClassLoader classLoader8 = ijp.a;
                parcel2.writeInt(zHf ? 1 : 0);
                return true;
            case 18:
                boolean zJ10 = ijp.j(parcel);
                ijp.d(parcel);
                gW(zJ10);
                parcel2.writeNoException();
                return true;
            case 19:
                boolean zHg = hg();
                parcel2.writeNoException();
                ClassLoader classLoader9 = ijp.a;
                parcel2.writeInt(zHg ? 1 : 0);
                return true;
            case 20:
                boolean zJ11 = ijp.j(parcel);
                ijp.d(parcel);
                ha(zJ11);
                parcel2.writeNoException();
                return true;
            case 21:
                try {
                    boolean zQ = this.a.b.Q();
                    parcel2.writeNoException();
                    ClassLoader classLoader10 = ijp.a;
                    parcel2.writeInt(zQ ? 1 : 0);
                    return true;
                } catch (Throwable th) {
                    zus.a(th);
                    if (th instanceof RuntimeException) {
                        throw ((RuntimeException) th);
                    }
                    if (th instanceof Error) {
                        throw ((Error) th);
                    }
                    throw new RuntimeException(th);
                }
            default:
                return false;
        }
    }

    @Override // defpackage.viz
    public final void gT(boolean z) {
        this.a.gT(z);
    }

    @Override // defpackage.viz
    public final void gU(boolean z) {
        this.a.gU(z);
    }

    @Override // defpackage.viz
    public final void gV(boolean z) {
        this.a.gV(z);
    }

    @Override // defpackage.viz
    public final void gW(boolean z) {
        this.a.gW(z);
    }

    @Override // defpackage.viz
    public final void gX(boolean z) {
        this.a.gX(z);
    }

    @Override // defpackage.viz
    public final void gY(boolean z) {
        this.a.gY(z);
    }

    @Override // defpackage.viz
    public final void gZ(boolean z) {
        this.a.gZ(z);
    }

    @Override // defpackage.viz
    public final void ha(boolean z) {
        this.a.ha(z);
    }

    @Override // defpackage.viz
    public final void hb(boolean z) {
        this.a.hb(z);
    }

    @Override // defpackage.viz
    public final void hc(boolean z) {
        this.a.hc(z);
    }

    @Override // defpackage.viz
    public final void hd(boolean z) {
        this.a.hd(z);
    }

    @Override // defpackage.viz
    public final boolean he() {
        return this.a.he();
    }

    @Override // defpackage.viz
    public final boolean hf() {
        return this.a.hf();
    }

    @Override // defpackage.viz
    public final boolean hg() {
        return this.a.hg();
    }

    @Override // defpackage.viz
    public final boolean hh() {
        return this.a.hh();
    }

    @Override // defpackage.viz
    public final boolean hi() {
        return this.a.hi();
    }

    @Override // defpackage.viz
    public final boolean hj() {
        return this.a.hj();
    }

    @Override // defpackage.viz
    public final boolean hk() {
        return this.a.hk();
    }

    @Override // defpackage.viz
    public final boolean hl() {
        return this.a.hl();
    }

    @Override // defpackage.viz
    public final boolean hm() {
        return this.a.hm();
    }
}
