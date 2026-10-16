package c7;

import A7.V;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import x.C4429v;

/* renamed from: c7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1566b {

    /* renamed from: h, reason: collision with root package name */
    public static int f19671h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f19672i;

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f19673j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f19675b;

    /* renamed from: c, reason: collision with root package name */
    public final M2.e f19676c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f19677d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f19679f;

    /* renamed from: g, reason: collision with root package name */
    public C1571g f19680g;

    /* renamed from: a, reason: collision with root package name */
    public final C4429v f19674a = new C4429v(0);

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f19678e = new Messenger(new HandlerC1569e(this, Looper.getMainLooper()));

    public C1566b(Context context) {
        this.f19675b = context;
        this.f19676c = new M2.e(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f19677d = scheduledThreadPoolExecutor;
    }

    public static synchronized String b() {
        int i5;
        i5 = f19671h;
        f19671h = i5 + 1;
        return Integer.toString(i5);
    }

    public static synchronized void c(Context context, Intent intent) {
        try {
            if (f19672i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f19672i = PendingIntent.getBroadcast(context, 0, intent2, zza.zza);
            }
            intent.putExtra("app", f19672i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Task a(Bundle bundle) throws RemoteException {
        String strB = b();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f19674a) {
            this.f19674a.put(strB, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f19676c.f() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        c(this.f19675b, intent);
        intent.putExtra("kid", "|ID|" + strB + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f19678e);
        if (this.f19679f != null || this.f19680g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f19679f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f19680g.f19687a;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
        } else if (this.f19676c.f() == 2) {
            this.f19675b.sendBroadcast(intent);
        } else {
            this.f19675b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(ExecutorC1572h.f19689c, new Dd.c(19, this, strB, this.f19677d.schedule(new V(taskCompletionSource, 24), 30L, TimeUnit.SECONDS), false));
        return taskCompletionSource.getTask();
    }

    public final void d(Bundle bundle, String str) {
        synchronized (this.f19674a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f19674a.remove(str);
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
