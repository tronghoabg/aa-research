package defpackage;

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

/* loaded from: classes2.dex */
public final class lvv implements lud {
    public static final yph a = yph.c("GH.MsgStateManager");
    public boolean c;
    private final Consumer f;
    private final lwk g;
    private zs i;
    private SparseArray j;
    private final lyo d = new qip(this, 1);
    final SharedPreferences.OnSharedPreferenceChangeListener b = new kwq(this, 2);
    private final lwh e = new qiq(1);
    private final eqn h = new lkn(11);

    public lvv(Context context, lwk lwkVar) {
        this.g = lwkVar;
        this.f = new kok(context, 7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l(Consumer consumer) {
        yfq yfqVarB = lnm.m().b();
        int size = yfqVarB.size();
        for (int i = 0; i < size; i++) {
            consumer.accept((lvg) yfqVarB.get(i));
        }
    }

    public static final boolean n(Bundle bundle) {
        mko mkoVarA = mpl.f().a();
        if (!mkoVarA.n()) {
            return true;
        }
        boolean zL = mkoVarA.l();
        int i = lvg.l;
        return bundle.getBoolean("group_conversation") && !zL;
    }

    private static final boolean o() {
        return nsr.c().b().F();
    }

    @Override // defpackage.lud
    @ResultIgnorabilityUnspecified
    public final Bundle a(long j) {
        if (!this.c) {
            throw new IllegalStateException("Cannot get IM persistent state when manager is not started");
        }
        Bundle bundle = (Bundle) this.i.d(j);
        if (bundle != null) {
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        this.i.g(j, bundle2);
        return bundle2;
    }

    @Override // defpackage.lud
    public final Bundle b(int i) {
        if (!this.c) {
            throw new IllegalStateException("Cannot get SMS persistent state when manager is not started");
        }
        Bundle bundle = (Bundle) this.j.get(i);
        if (bundle != null) {
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        this.j.put(i, bundle2);
        return bundle2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.lhg
    public final void c() {
        this.i = new zs(10);
        this.j = new SparseArray();
        this.c = true;
        lwi.a().b(this.e);
        lws.d().b(this.d);
        mpl.f().a().b.registerOnSharedPreferenceChangeListener(this.b);
        lwx.a().b(this.f);
        mad.e().b().fE(lbh.d(), this.h);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.lhg
    public final void d() {
        lwx.a().e(this.f);
        mpl.f().a().b.unregisterOnSharedPreferenceChangeListener(this.b);
        lwi.a().e(this.e);
        lws.d().f(this.d);
        mad.e().b().k(this.h);
        this.c = false;
        this.i = null;
        this.j = null;
    }

    @Override // defpackage.lud
    public final lvg e(long j) {
        return lnm.m().a(j);
    }

    @Override // defpackage.lud
    public final void f(lvg lvgVar) {
        if (lvgVar instanceof lvi) {
            lvh lvhVar = new lvh();
            lvhVar.c((lvi) lvgVar);
            lvi lviVar = new lvi(lvhVar);
            lviVar.r();
            lnm.m().f(lviVar, false, true);
        }
    }

    @Override // defpackage.lud
    public final void g(lvg lvgVar, boolean z) {
        lvgVar.h(z);
        lnm.m().e(lvgVar);
    }

    @Override // defpackage.lud
    public final void h(lvg lvgVar) {
        lvl.a(lvgVar.c(lvgVar.a()));
    }

    @Override // defpackage.lud
    public final boolean i(long j) {
        return this.i.i(j);
    }

    @Override // defpackage.lud
    public final boolean j(lvg lvgVar) {
        return n(lvgVar.b);
    }

    @Override // defpackage.lud
    public final MessagingInfo k(lvg lvgVar, whg whgVar, yzy yzyVar, yzy yzyVar2, yzy yzyVar3) {
        MessagingInfo messagingInfo = null;
        if (lvgVar instanceof lvk) {
            lvk lvkVar = (lvk) lvgVar;
            Long l = lvkVar.o;
            qjk qjkVar = new qjk();
            ArrayList arrayList = new ArrayList();
            Iterator it = lvkVar.m.iterator();
            while (it.hasNext()) {
                roc.ay((SmsMessage[]) it.next(), arrayList);
            }
            Iterator it2 = lvkVar.n.iterator();
            while (it2.hasNext()) {
                roc.ay((SmsMessage[]) it2.next(), arrayList);
            }
            qjkVar.b = arrayList;
            String str = lvkVar.p;
            qjkVar.c = str;
            qjkVar.d = ((Long) new ntn(l).i(0L)).longValue();
            qjkVar.h = "generated.android.auto.sms.package.name";
            qjkVar.m = false;
            qjkVar.i = null;
            qjkVar.g = str;
            lwk lwkVar = this.g;
            qjkVar.e = lwkVar.b(lvkVar, whgVar, yzyVar2);
            if (acxm.c()) {
                RemoteInput remoteInputBuild = new RemoteInput.Builder("reply-remote-input-key").build();
                qjkVar.j = lwkVar.d(lvkVar, remoteInputBuild, whgVar, yzyVar);
                qjkVar.l = remoteInputBuild;
            }
            if (actj.o() && !o() && kfl.h().k().a()) {
                qjkVar.k = lwkVar.c(lvkVar, whgVar, yzyVar3);
            }
            messagingInfo = new MessagingInfo(qjkVar);
        } else if (lvgVar instanceof lvi) {
            lvi lviVar = (lvi) lvgVar;
            MessagingInfo messagingInfo2 = lviVar.m;
            qjk qjkVar2 = new qjk();
            qjkVar2.b(messagingInfo2);
            lwk lwkVar2 = this.g;
            qjkVar2.e = lwkVar2.b(lviVar, whgVar, yzyVar2);
            RemoteInput remoteInput = messagingInfo2.j;
            remoteInput.getClass();
            qjkVar2.j = lwkVar2.d(lviVar, remoteInput, whgVar, yzyVar);
            if (actj.o() && !o() && kfl.h().k().a()) {
                qjkVar2.k = lwkVar2.c(lviVar, whgVar, yzyVar3);
            }
            messagingInfo = new MessagingInfo(qjkVar2);
        }
        if (messagingInfo != null) {
            return messagingInfo;
        }
        throw new IllegalArgumentException("Unknown messaging conversation type:");
    }

    public final void m(Consumer consumer) {
        woy.aa(this.c, "Method should only be called if MessagingStateManagerImpl is started.");
        for (int i = 0; i < this.i.b(); i++) {
            consumer.accept((Bundle) this.i.e(i));
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            consumer.accept((Bundle) this.j.valueAt(i2));
        }
    }
}
