package defpackage;

import android.animation.ValueAnimator;
import android.app.Notification;
import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.provider.ContactsContract;
import android.service.notification.StatusBarNotification;
import android.telephony.SmsMessage;
import android.view.View;
import androidx.car.app.messaging.model.CarMessage;
import androidx.car.app.messaging.model.ConversationItem;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import mesquite.messaging.model.Message;

/* loaded from: classes.dex */
public final /* synthetic */ class jxf implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jxf(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        switch (this.c) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, scx] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) throws IOException {
        duk sender;
        int i = 0;
        switch (this.c) {
            case 0:
                return ((jxg) this.a).e((qrn) this.b, (nyj) obj);
            case 1:
                juv juvVar = (juv) this.a;
                List listC = mjv.b().c((qrn) this.b, new nyk(juvVar.b, qpi.h, (nyj) obj));
                yph yphVar = juv.a;
                ((ype) yphVar.l().ai((char) 2772)).y("Raw list of template calling apps found: %s", listC);
                Iterator it = Collection.EL.stream(juv.m(listC, aczc.c())).map(new ijt(19)).iterator();
                int i2 = yfq.d;
                yfl yflVar = new yfl(4);
                yflVar.l(it);
                yfq yfqVarG = yflVar.g();
                if (!juvVar.c) {
                    rrb rrbVarA = kad.a(yzy.sL);
                    rrbVarA.q((java.util.Collection) Collection.EL.stream(yfqVarG).map(new ijt(20)).collect(ycm.a));
                    kad.e(rrbVarA);
                    ((ype) yphVar.l().ai((char) 2773)).y("Template calling apps found: %s", yfqVarG);
                    juvVar.c = true;
                }
                return yfqVarG;
            case 2:
                CarMessage carMessage = (CarMessage) obj;
                int i3 = jxt.a;
                Message.Builder builder = new Message.Builder();
                builder.b("fake ID");
                if (carMessage.getSender() == null) {
                    sender = ((ConversationItem) this.a).getSelf();
                } else {
                    sender = carMessage.getSender();
                    sender.getClass();
                }
                Object obj2 = this.b;
                builder.a = sender;
                hmc hmcVar = (hmc) ((geu) obj2).l(hmc.class);
                hmcVar.getClass();
                builder.b = hmcVar.a(carMessage);
                builder.c = carMessage.getReceivedTimeEpochMillis();
                builder.d = carMessage.getMultimediaMimeType();
                builder.e = carMessage.getMultimediaUri();
                return builder.a();
            case 3:
                Object obj3 = this.a;
                yph yphVar2 = jyq.a;
                return jyq.b((Context) obj3, ((StatusBarNotification) this.b).getPackageName(), (Notification.Action) obj);
            case 4:
                Handler handler = ((koo) this.a).e;
                pba pbaVar = (pba) this.b;
                pav pavVar = pbaVar.c == 11 ? (pav) pbaVar.d : pav.a;
                aboh abohVar = (pavVar.b == 3 ? (pas) pavVar.c : pas.a).b;
                pav pavVar2 = pbaVar.c == 11 ? (pav) pbaVar.d : pav.a;
                return new kol(handler, abohVar, (pavVar2.b == 3 ? (pas) pavVar2.c : pas.a).c);
            case 5:
                koo kooVar = (koo) this.a;
                return new kon(kooVar.g, (pba) this.b, kooVar.d);
            case 6:
                BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                int i4 = true != new oyr((Context) this.a, this.b).f(bluetoothDevice, false) ? 1 : 2;
                kqf kqfVarA = kqg.a();
                kqfVarA.d = Optional.of(bluetoothDevice);
                kqfVarA.e(i4);
                return kqfVarA.a();
            case 7:
                String str = (String) this.b;
                boolean zContains = str.contains("content://com.android.contacts/contacts");
                Object obj4 = this.a;
                if (zContains) {
                    try {
                        InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(((kzv) obj4).b.getContentResolver(), Uri.parse(str.replaceFirst("/photo", "")));
                        try {
                            inputStreamOpenContactPhotoInputStream.getClass();
                            GhIcon ghIconN = GhIcon.n(BitmapFactory.decodeStream(inputStreamOpenContactPhotoInputStream));
                            inputStreamOpenContactPhotoInputStream.close();
                            return ghIconN;
                        } finally {
                        }
                    } catch (Exception e) {
                        ((ype) ((ype) ((ype) kzv.a.h()).p(e)).ai((char) 3665)).u("Cannot open contacts uri");
                    }
                }
                Uri uri = Uri.parse(str);
                if ("android.resource".equals(uri.getScheme())) {
                    kzv kzvVar = (kzv) obj4;
                    return GhIcon.r(kzd.c(uri), kzd.b(uri, kzvVar.c, kzvVar.b));
                }
                if (uri == null) {
                    throw new IllegalArgumentException("Uri must not be null.");
                }
                GhIcon ghIcon = new GhIcon(4);
                ghIcon.f = uri.toString();
                return ghIcon;
            case 8:
                lod lodVar = new lod(lok.b, ((loy) this.b).g((ComponentName) obj), (lmb) this.a);
                ((ype) ((ype) loy.a.f()).ai(4127)).M("Fetching new connection %s %s", Integer.toHexString(System.identityHashCode(lodVar)), lodVar);
                return lodVar;
            case 9:
                SmsMessage smsMessage = (SmsMessage) obj;
                int i5 = lva.c;
                long timestampMillis = smsMessage.getTimestampMillis();
                Message.Builder builder2 = new Message.Builder();
                builder2.a = (duk) this.a;
                builder2.b(String.valueOf(Objects.hash(this.b, Long.valueOf(timestampMillis))));
                builder2.b = smsMessage.getMessageBody();
                builder2.c = timestampMillis;
                return builder2.a();
            case 10:
                return new nas((mhv) ((mju) this.a).b.a, new mjt((String) this.b));
            case 11:
                nsv nsvVar = (nsv) obj;
                int iOrdinal = nsvVar.ordinal();
                if (iOrdinal == 0) {
                    return new nrn(new inl(this.a, 9));
                }
                if (iOrdinal == 4) {
                    return new nru();
                }
                if (iOrdinal == 5) {
                    return new nrs();
                }
                if (iOrdinal == 6 || iOrdinal == 7) {
                    return ((nso) this.b).H() ? new nrr() : new nrt();
                }
                throw new IllegalStateException("Unexpected layout type for primary display ".concat(String.valueOf(String.valueOf(nsvVar))));
            default:
                View view = (View) obj;
                view.getRootView().setOnTouchListener(new jzt(this.a, 8, null));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                Object obj5 = this.b;
                valueAnimatorOfFloat.addUpdateListener(new ocf(obj5, view, i));
                valueAnimatorOfFloat.addListener(new ock((oco) obj5, view));
                valueAnimatorOfFloat.start();
                return false;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.c) {
        }
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ jxf(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
