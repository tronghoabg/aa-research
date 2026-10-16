package defpackage;

import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.SparseArray;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class qir implements luc {
    public static final yph a = yph.c("GH.MessagingManager");
    public boolean c;
    private final Consumer e;
    private final lwj f;
    private zs h;
    private SparseArray i;
    private final lyo d = new qip(this, 0);
    final SharedPreferences.OnSharedPreferenceChangeListener b = new kwq(this, 7);
    private final eqn g = new lkn(16);
    private final lwh j = new qiq(0);

    public qir(Context context, lwj lwjVar) {
        this.f = lwjVar;
        this.e = new qio(context, 0);
    }

    public static void l(Consumer consumer) {
        Iterator it = mlq.e().b(yzr.SMS_NOTIFICATION, yzr.IM_NOTIFICATION).iterator();
        while (it.hasNext()) {
            consumer.accept((lue) ((moa) it.next()));
        }
    }

    public static void n(lue lueVar) {
        mlq.e().l(lueVar);
    }

    public static final boolean o(Bundle bundle) {
        mko mkoVarA = mpl.f().a();
        if (!mkoVarA.n()) {
            return true;
        }
        boolean zL = mkoVarA.l();
        int i = lxb.e;
        return bundle.getBoolean("group_conversation") && !zL;
    }

    private static final boolean p() {
        return nsr.c().b().F();
    }

    private static final void q(lue lueVar) {
        mlq.e().l(lueVar);
    }

    @Override // defpackage.luc
    @ResultIgnorabilityUnspecified
    public final Bundle a(long j) {
        if (!this.c) {
            throw new IllegalStateException("Cannot get IM persistent state when manager is not started");
        }
        Bundle bundle = (Bundle) this.h.d(j);
        if (bundle != null) {
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        this.h.g(j, bundle2);
        return bundle2;
    }

    @Override // defpackage.luc
    public final Bundle b(int i) {
        if (!this.c) {
            throw new IllegalStateException("Cannot get SMS persistent state when manager is not started");
        }
        Bundle bundle = (Bundle) this.i.get(i);
        if (bundle != null) {
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        this.i.put(i, bundle2);
        return bundle2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.lhg
    public final void c() {
        this.h = new zs(10);
        this.i = new SparseArray();
        this.c = true;
        lwi.a().b(this.j);
        lws.d().b(this.d);
        mpl.f().a().b.registerOnSharedPreferenceChangeListener(this.b);
        if (!actj.x()) {
            lwx.a().b(this.e);
        }
        mad.e().b().fE(lbh.d(), this.g);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.lhg
    public final void d() {
        lwx.a().e(this.e);
        mpl.f().a().b.unregisterOnSharedPreferenceChangeListener(this.b);
        lwi.a().e(this.j);
        lws.d().f(this.d);
        mad.e().b().k(this.g);
        this.c = false;
        this.h = null;
        this.i = null;
    }

    @Override // defpackage.luc
    public final void e(lue lueVar) {
        if (lueVar instanceof lwz) {
            ((lwz) lueVar).o();
            q(lueVar);
        }
    }

    @Override // defpackage.luc
    public final void f(lue lueVar, boolean z) {
        lueVar.g(z);
        q(lueVar);
    }

    @Override // defpackage.luc
    public final void g(lue lueVar) {
        q(lueVar.d(lueVar.a()));
    }

    @Override // defpackage.luc
    public final void h(lue lueVar, boolean z) {
        lnm.l().a(lueVar, z);
    }

    @Override // defpackage.luc
    public final boolean i(long j) {
        return this.h.i(j);
    }

    @Override // defpackage.luc
    public final boolean j(lue lueVar) {
        return o(lueVar.c());
    }

    @Override // defpackage.luc
    public final MessagingInfo k(lue lueVar, whg whgVar, yzy yzyVar, yzy yzyVar2, yzy yzyVar3, Integer num, Integer num2, Integer num3) {
        MessagingInfo messagingInfo;
        whg whgVar2 = whgVar;
        yzr yzrVar = lueVar.j;
        if (yzrVar == yzr.IM_NOTIFICATION) {
            lwz lwzVar = (lwz) lueVar;
            MessagingInfo messagingInfo2 = lwzVar.a;
            qjk qjkVar = new qjk();
            qjkVar.b(messagingInfo2);
            lwj lwjVar = this.f;
            qjkVar.e = lwjVar.b(lwzVar, whgVar2, yzyVar2, num2);
            RemoteInput remoteInput = messagingInfo2.j;
            remoteInput.getClass();
            PendingIntent pendingIntentD = lwjVar.d(lwzVar, remoteInput, whgVar2, yzyVar, num);
            whgVar2 = whgVar2;
            qjkVar.j = pendingIntentD;
            if (actj.o() && !p() && kfl.h().k().a()) {
                qjkVar.k = lwjVar.c(lwzVar, whgVar2, yzyVar3, num3);
            }
            messagingInfo = new MessagingInfo(qjkVar);
        } else {
            messagingInfo = null;
        }
        if (yzrVar == yzr.SMS_NOTIFICATION) {
            lxd lxdVar = (lxd) lueVar;
            Long l = lxdVar.c;
            qjk qjkVar2 = new qjk();
            ArrayList arrayList = new ArrayList();
            Iterator it = lxdVar.a.iterator();
            while (it.hasNext()) {
                roc.ay((SmsMessage[]) it.next(), arrayList);
            }
            Iterator it2 = lxdVar.b.iterator();
            while (it2.hasNext()) {
                roc.ay((SmsMessage[]) it2.next(), arrayList);
            }
            qjkVar2.b = arrayList;
            String str = lxdVar.f;
            qjkVar2.c = str;
            qjkVar2.d = ((Long) new ntn(l).i(0L)).longValue();
            qjkVar2.h = "generated.android.auto.sms.package.name";
            qjkVar2.m = false;
            qjkVar2.i = null;
            qjkVar2.g = str;
            lwj lwjVar2 = this.f;
            qjkVar2.e = lwjVar2.b(lxdVar, whgVar2, yzyVar2, num2);
            if (acxm.c()) {
                RemoteInput remoteInputBuild = new RemoteInput.Builder("reply-remote-input-key").build();
                qjkVar2.j = lwjVar2.d(lxdVar, remoteInputBuild, whgVar2, yzyVar, num);
                qjkVar2.l = remoteInputBuild;
            }
            if (actj.o() && !p() && kfl.h().k().a()) {
                qjkVar2.k = lwjVar2.c(lxdVar, whgVar2, yzyVar3, num3);
            }
            messagingInfo = new MessagingInfo(qjkVar2);
        }
        if (messagingInfo != null) {
            return messagingInfo;
        }
        throw new IllegalArgumentException("Unknown messaging stream item type: " + yzrVar.J);
    }

    public final void m(Consumer consumer) {
        woy.aa(this.c, "Method should only be called if MessagingManagerImpl is started.");
        for (int i = 0; i < this.h.b(); i++) {
            consumer.accept((Bundle) this.h.e(i));
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            consumer.accept((Bundle) this.i.valueAt(i2));
        }
    }
}
