package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.projection.gearhead.R;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class sey implements zge {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public sey(adng adngVar, adqk adqkVar, admc admcVar, adnh adnhVar, int i) {
        this.e = i;
        this.d = adngVar;
        this.a = adqkVar;
        this.c = admcVar;
        this.b = adnhVar;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        int i = this.e;
        if (i == 0) {
            if (((AtomicInteger) this.a).incrementAndGet() == ((sez) this.d).a.size()) {
                ((dnw) this.c).d(th);
                return;
            }
            return;
        }
        if (i != 1) {
            ((adng) this.d).d(adpa.a(th), new admc());
        } else {
            ((ype) ((ype) ((ype) kyw.a.g()).p(th)).ai((char) 3563)).u("Locale retrieval failed");
            lah.a();
            lah.e(ywj.LOCALE_RETRIEVAL_FAILED, null);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, xxj] */
    /* JADX WARN: Type inference failed for: r5v8, types: [adnh, java.lang.Object] */
    @Override // defpackage.zge
    public final /* synthetic */ void b(Object obj) throws Resources.NotFoundException {
        int i = this.e;
        if (i == 0) {
            Object obj2 = this.d;
            int iIncrementAndGet = ((AtomicInteger) this.a).incrementAndGet();
            int size = ((sez) obj2).a.size();
            for (BluetoothDevice bluetoothDevice : (Collection) obj) {
                if (this.b.a(bluetoothDevice)) {
                    ((dnw) this.c).b(xxh.h(bluetoothDevice));
                    return;
                }
            }
            if (iIncrementAndGet == size) {
                ((dnw) this.c).b(xvy.a);
                return;
            }
            return;
        }
        if (i == 1) {
            kyw kywVar = (kyw) this.c;
            Resources resourcesQ = kywVar.Q((String) obj);
            Object obj3 = this.b;
            String string = resourcesQ.getString(R.string.messaging_compose_via_app, obj3);
            Bundle bundle = new Bundle();
            bundle.putBoolean("IS_SEND_A_MESSAGE_QUERY", true);
            bundle.putString("SEND_A_MESSAGE_APP_NAME", (String) obj3);
            bundle.putString("SEND_A_MESSAGE_APP_PACKAGE_NAME", (String) this.a);
            bundle.putInt("DIRECT_QUERY_TRIGGER_ID", ((osv) this.d).C);
            kywVar.Y(string, bundle);
            return;
        }
        adnq adnqVar = (adnq) obj;
        if (!adnqVar.g()) {
            ((adng) this.d).d(adnqVar, new admc());
            return;
        }
        Object obj4 = this.a;
        Object obj5 = this.d;
        try {
            adqk adqkVar = (adqk) obj4;
            adqkVar.a.set(this.b.a((adng) obj5, (admc) this.c));
            adqkVar.g();
        } catch (RuntimeException e) {
            ((adng) obj5).d(adnq.l.d(e).e("Failed to start server call after authorization check"), new admc());
        }
    }

    public sey(kyw kywVar, String str, String str2, osv osvVar, int i) {
        this.e = i;
        this.b = str;
        this.a = str2;
        this.d = osvVar;
        this.c = kywVar;
    }

    public sey(sez sezVar, AtomicInteger atomicInteger, xxj xxjVar, dnw dnwVar, int i) {
        this.e = i;
        this.a = atomicInteger;
        this.b = xxjVar;
        this.c = dnwVar;
        this.d = sezVar;
    }
}
