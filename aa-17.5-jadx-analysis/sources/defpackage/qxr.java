package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import android.provider.CallLog;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.apps.auto.components.telecom.call.CarCall;

/* loaded from: classes.dex */
public final class qxr extends ijo implements qxs {
    public final /* synthetic */ xfx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxr(xfx xfxVar) {
        super("com.google.android.gms.car.ICarPhoneStatusEventListener");
        this.a = xfxVar;
    }

    @Override // defpackage.qxs
    public final void e(final KeyEvent keyEvent) {
        wer.e(new Runnable() { // from class: xfw
            @Override // java.lang.Runnable
            public final void run() {
                mki.a.g();
                CarCall carCallG = odn.a().g();
                xfx xfxVar = this.b.a;
                KeyEvent keyEvent2 = keyEvent;
                if (keyEvent2.getAction() == 0) {
                    xfxVar.b = (keyEvent2.getFlags() & 128) != 0;
                }
                if (keyEvent2.getKeyCode() == 5 && carCallG == null) {
                    if (keyEvent2.getAction() == 1 && keyEvent2.getRepeatCount() == 0 && !xfxVar.b) {
                        Intent component = new Intent().setComponent(mkn.b);
                        component.addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION");
                        try {
                            ols.u(kio.b().e()).j();
                            mpe.a().i(component);
                            return;
                        } catch (IllegalStateException | qrz | qsa e) {
                            ((ype) ((ype) ((ype) xfx.a.g()).p(e)).ai((char) 10269)).u("Trying to start phone app but couldn't.");
                            return;
                        }
                    }
                    if (xfxVar.b) {
                        String lastOutgoingCall = CallLog.Calls.getLastOutgoingCall(xfxVar.c.getApplicationContext());
                        if (TextUtils.isEmpty(lastOutgoingCall)) {
                            ((ype) ((ype) xfx.a.f()).ai((char) 10268)).u("Cannot re-dial the last dialed number: there isn't one.");
                            return;
                        }
                        ohs ohsVarJ = ebf.j();
                        yzz yzzVar = yzz.HARDWARE_INPUT_KEY;
                        ohsVarJ.o(yzzVar, yzy.U);
                        ebf.j().F(rrc.h(yxy.GEARHEAD, yzzVar, yzy.Q).l());
                        ebf.A().p(lastOutgoingCall);
                        return;
                    }
                    return;
                }
                if (keyEvent2.getAction() == 1) {
                    if (carCallG != null && carCallG.e == 2) {
                        if (keyEvent2.getKeyCode() == 5) {
                            ((ype) ((ype) xfx.a.f()).ai((char) 10267)).u("Answering call due to KEYCODE_CALL during ringing call");
                            ebf.j().F(odn.a().j(carCallG, yzz.HARDWARE_INPUT_KEY, yzy.E).l());
                            xfxVar.d.m(carCallG.a);
                            return;
                        } else {
                            if (keyEvent2.getKeyCode() == 6) {
                                ((ype) ((ype) xfx.a.f()).ai((char) 10266)).u("Rejecting call due to KEYCODE_ENDCALL during ringing call");
                                ebf.j().F(odn.a().j(carCallG, yzz.HARDWARE_INPUT_KEY, yzy.G).l());
                                xfxVar.d.y(carCallG.a);
                                return;
                            }
                            return;
                        }
                    }
                    if (carCallG != null && carCallG.e != 7 && keyEvent2.getKeyCode() == 6) {
                        ebf.j().F(odn.a().j(carCallG, yzz.HARDWARE_INPUT_KEY, yzy.I).l());
                        xfxVar.d.y(carCallG.a);
                    } else if (keyEvent2.getKeyCode() == 6) {
                        lau.c().j(ywk.END_CALL_BUTTON_CLICKED);
                    } else {
                        if (carCallG == null || keyEvent2.getKeyCode() != 91) {
                            return;
                        }
                        xfxVar.d.u(carCallG.a, !r7.z(r0));
                    }
                }
            }
        });
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 2) {
            parcel.readString();
            parcel.readString();
            parcel.readInt();
            ijp.d(parcel);
            return true;
        }
        if (i != 3) {
            return false;
        }
        KeyEvent keyEvent = (KeyEvent) ijp.a(parcel, KeyEvent.CREATOR);
        ijp.d(parcel);
        e(keyEvent);
        return true;
    }

    @Override // defpackage.qxs
    public final void f(String str, String str2, int i) throws RemoteException {
    }
}
