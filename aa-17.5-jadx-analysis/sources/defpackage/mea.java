package defpackage;

import android.content.Intent;
import android.telephony.PhoneNumberUtils;
import android.util.Log;
import com.google.android.apps.auto.components.phone.PhoneCarAppService;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Deque;

/* loaded from: classes2.dex */
public final class mea extends qz {
    final /* synthetic */ PhoneCarAppService c;
    private mee d;

    public mea(PhoneCarAppService phoneCarAppService) {
        this.c = phoneCarAppService;
    }

    private final qw f(Intent intent) {
        String action = intent.getAction();
        mee meeVar = null;
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1986533159) {
                if (iHashCode != -1173745501) {
                    if (iHashCode == -1173708363 && action.equals("android.intent.action.DIAL")) {
                        String numberFromIntent = PhoneNumberUtils.getNumberFromIntent(intent, a());
                        numberFromIntent.getClass();
                        if (!ebf.A().i().isEmpty()) {
                            g();
                            return null;
                        }
                        ebf.j().o(yzz.PHONE_FACET, yzy.X);
                        mee meeVar2 = this.d;
                        if (meeVar2 == null) {
                            affa.d("browseScreen");
                        } else {
                            meeVar = meeVar2;
                        }
                        qx qxVarG = meeVar.g();
                        yj.a();
                        if (!((eqc) qxVarG.b).e.equals(eps.a)) {
                            Deque deque = qxVarG.a;
                            if (deque.size() > 1) {
                                ArrayList arrayList = new ArrayList();
                                while (deque.size() > 1) {
                                    arrayList.add((qw) deque.pop());
                                }
                                qxVarG.d(arrayList);
                            }
                        } else if (Log.isLoggable("CarApp", 3)) {
                            Log.d("CarApp", "Popping screens after the DESTROYED state is a no-op");
                        }
                        return oct.f(a(), numberFromIntent);
                    }
                } else if (action.equals("android.intent.action.CALL")) {
                    if (!ebf.A().i().isEmpty()) {
                        g();
                        return null;
                    }
                    ebf.j().o(yzz.PHONE_FACET, yzy.ae);
                    ebf.A().p(PhoneNumberUtils.getNumberFromIntent(intent, a()));
                    return null;
                }
            } else if (action.equals("com.google.android.gearhead.telecom.OPEN_CONTACTS")) {
                mee meeVar3 = this.d;
                if (meeVar3 == null) {
                    affa.d("browseScreen");
                    meeVar3 = null;
                }
                meeVar3.g.invoke();
            }
            ((ynz) PhoneCarAppService.c.h().ai(4803)).y("Received unknown action %s", intent.getAction());
            return null;
        }
        return null;
    }

    private final void g() {
        qn qnVarA = a();
        adzp.b(qnVarA, qnVarA.getString(R.string.new_call_blocked_by_ongoing)).a();
        ebf.j().o(yzz.PHONE_FACET, yzy.ac);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, tho] */
    @Override // defpackage.qz
    public final qw b(Intent intent) {
        intent.getClass();
        if (!lgv.c().k()) {
            return new mdz(a());
        }
        PhoneCarAppService phoneCarAppService = this.c;
        qn qnVarA = a();
        affv affvVar = new affv();
        affv affvVar2 = new affv();
        affq affqVar = new affq();
        lxu lxuVar = new lxu(affvVar, affqVar, affvVar2, 2, (char[]) null);
        oct octVar = phoneCarAppService.d;
        this.d = new mee(qnVarA, octVar.a, lxuVar, new ewo(qnVarA, octVar, affvVar2, affqVar, affvVar, 4));
        qw qwVarF = f(intent);
        mee meeVar = this.d;
        if (qwVarF == null) {
            if (meeVar != null) {
                return meeVar;
            }
            affa.d("browseScreen");
            return null;
        }
        if (meeVar == null) {
            affa.d("browseScreen");
            meeVar = null;
        }
        lvl.C(meeVar);
        return qwVarF;
    }

    @Override // defpackage.qz
    public final void e(Intent intent) {
        intent.getClass();
        qw qwVarF = f(intent);
        if (qwVarF != null) {
            lvl.C(qwVarF);
        }
    }
}
