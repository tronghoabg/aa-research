package com.google.android.gms.f;

import android.app.BroadcastOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.app.ae;
import android.util.Log;
import androidx.car.app.CarContext;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.o.ag;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5207a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static int f5208b;

    /* renamed from: c, reason: collision with root package name */
    private static PendingIntent f5209c;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f5210d = new v(0);

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f5211e = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: g, reason: collision with root package name */
    private final Context f5213g;

    /* renamed from: h, reason: collision with root package name */
    private final u f5214h;

    /* renamed from: i, reason: collision with root package name */
    private final ScheduledExecutorService f5215i;

    /* renamed from: k, reason: collision with root package name */
    private Messenger f5217k;

    /* renamed from: l, reason: collision with root package name */
    private d f5218l;

    /* renamed from: f, reason: collision with root package name */
    private final SimpleArrayMap f5212f = new SimpleArrayMap();

    /* renamed from: j, reason: collision with root package name */
    private final Messenger f5216j = new Messenger(new z(this, Looper.getMainLooper()));

    public aa(Context context) {
        this.f5213g = context;
        this.f5214h = new u(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.a.b("fcm-rpc-timeout-executor"));
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f5215i = scheduledThreadPoolExecutor;
    }

    public static /* synthetic */ com.google.android.gms.o.t a(aa aaVar, Bundle bundle, com.google.android.gms.o.t tVar) {
        return (tVar.k() && m((Bundle) tVar.g())) ? aaVar.i(bundle).e(f5210d, new w(0)) : tVar;
    }

    static /* synthetic */ com.google.android.gms.o.t c(Bundle bundle) {
        return m(bundle) ? ag.c(null) : ag.c(bundle);
    }

    static /* bridge */ /* synthetic */ void f(aa aaVar, Message message) {
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("Rpc", "Dropping invalid message");
            return;
        }
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(new c());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof d) {
                aaVar.f5218l = (d) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                aaVar.f5217k = (Messenger) parcelableExtra;
            }
        }
        Intent intent2 = (Intent) message.obj;
        String action = intent2.getAction();
        if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
            if (Log.isLoggable("Rpc", 3)) {
                Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                return;
            }
            return;
        }
        String stringExtra = intent2.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent2.getStringExtra("unregistered");
        }
        if (stringExtra != null) {
            Matcher matcher = f5211e.matcher(stringExtra);
            if (!matcher.matches()) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                    return;
                }
                return;
            }
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                Bundle extras = intent2.getExtras();
                extras.putString("registration_id", strGroup2);
                aaVar.l(strGroup, extras);
                return;
            }
            return;
        }
        String stringExtra2 = intent2.getStringExtra("error");
        if (stringExtra2 == null) {
            Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(String.valueOf(intent2.getExtras()))));
            return;
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
        }
        if (!stringExtra2.startsWith("|")) {
            SimpleArrayMap simpleArrayMap = aaVar.f5212f;
            synchronized (simpleArrayMap) {
                for (int i2 = 0; i2 < simpleArrayMap.size(); i2++) {
                    aaVar.l((String) simpleArrayMap.keyAt(i2), intent2.getExtras());
                }
            }
            return;
        }
        String[] strArrSplit = stringExtra2.split("\\|");
        if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
            Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
            return;
        }
        String str = strArrSplit[2];
        String strSubstring = strArrSplit[3];
        if (strSubstring.startsWith(":")) {
            strSubstring = strSubstring.substring(1);
        }
        aaVar.l(str, intent2.putExtra("error", strSubstring).getExtras());
    }

    public static /* synthetic */ void g(aa aaVar, String str, ScheduledFuture scheduledFuture) {
        SimpleArrayMap simpleArrayMap = aaVar.f5212f;
        synchronized (simpleArrayMap) {
            simpleArrayMap.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    private final com.google.android.gms.o.t i(Bundle bundle) throws RemoteException {
        final String strJ = j();
        com.google.android.gms.o.w wVar = new com.google.android.gms.o.w();
        SimpleArrayMap simpleArrayMap = this.f5212f;
        synchronized (simpleArrayMap) {
            simpleArrayMap.put(strJ, wVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f5214h.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        k(this.f5213g, intent);
        intent.putExtra("kid", "|ID|" + strJ + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(String.valueOf(intent.getExtras()))));
        }
        intent.putExtra("google.messenger", this.f5216j);
        if (this.f5217k == null && this.f5218l == null) {
            int iB = this.f5214h.b();
            Context context = this.f5213g;
            if (iB != 2) {
                context.startService(intent);
            } else if (Build.VERSION.SDK_INT < 34) {
                context.sendBroadcast(intent);
            } else {
                context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        } else {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f5217k;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f5218l.b(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f5215i.schedule(new ae(wVar, 11), 30L, TimeUnit.SECONDS);
        wVar.a().n(f5210d, new com.google.android.gms.o.k() { // from class: com.google.android.gms.f.y
            @Override // com.google.android.gms.o.k
            public final void a(com.google.android.gms.o.t tVar) {
                aa.g(this.f5261a, strJ, scheduledFutureSchedule);
            }
        });
        return wVar.a();
    }

    private static synchronized String j() {
        int i2;
        i2 = f5208b;
        f5208b = i2 + 1;
        return Integer.toString(i2);
    }

    private static synchronized void k(Context context, Intent intent) {
        PendingIntent pendingIntentB = f5209c;
        if (pendingIntentB == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            pendingIntentB = com.google.android.gms.k.d.a.b(context, intent2, com.google.android.gms.k.d.a.f5570a);
            f5209c = pendingIntentB;
        }
        intent.putExtra(CarContext.APP_SERVICE, pendingIntentB);
    }

    private final void l(String str, Bundle bundle) {
        SimpleArrayMap simpleArrayMap = this.f5212f;
        synchronized (simpleArrayMap) {
            com.google.android.gms.o.w wVar = (com.google.android.gms.o.w) simpleArrayMap.remove(str);
            if (wVar != null) {
                wVar.c(bundle);
                return;
            }
            Log.w("Rpc", "Missing callback for " + str);
        }
    }

    private static boolean m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public final com.google.android.gms.o.t b() {
        return this.f5214h.a() >= 241100000 ? t.b(this.f5213g).d(5, Bundle.EMPTY).b(f5210d, new x(0)) : ag.b(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public final com.google.android.gms.o.t d(Bundle bundle) {
        u uVar = this.f5214h;
        int i2 = 1;
        return uVar.a() < 12000000 ? uVar.b() != 0 ? i(bundle).c(f5210d, new com.google.android.gms.l.q(this, bundle, i2, null)) : ag.b(new IOException("MISSING_INSTANCEID_SERVICE")) : t.b(this.f5213g).d(1, bundle).b(f5210d, new x(i2));
    }

    public final com.google.android.gms.o.t e(boolean z) {
        if (this.f5214h.a() < 241100000) {
            return ag.b(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z);
        return t.b(this.f5213g).c(4, bundle);
    }

    public final void h(a aVar) {
        if (this.f5214h.a() < 233700000) {
            ag.b(new IOException("SERVICE_NOT_AVAILABLE"));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", aVar.c());
        Integer numB = aVar.b();
        if (numB != null) {
            bundle.putInt("google.product_id", numB.intValue());
        }
        t.b(this.f5213g).c(3, bundle);
    }
}
