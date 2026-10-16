package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.UserHandle;
import android.service.notification.StatusBarNotification;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import j$.time.Instant;
import j$.util.Optional;
import java.util.HashSet;
import java.util.List;
import mesquite.messaging.model.Message;

/* loaded from: classes.dex */
public final class lvd {
    private static final yob a = yob.c("com/google/android/apps/auto/components/messaging/assistant/AssistantApiHelper");
    private final Context b;
    private final Class c;
    private int d;
    private Optional e = Optional.empty();

    public lvd(Context context, Class cls) {
        this.b = context;
        this.c = cls;
    }

    public static lvd c() {
        return (lvd) mki.a.i(lvd.class);
    }

    public static final String e(Intent intent) {
        String stringExtra = intent.getStringExtra("app-package");
        stringExtra.getClass();
        return stringExtra;
    }

    public static final String f(Intent intent) {
        String stringExtra = intent.getStringExtra("conversation-id");
        stringExtra.getClass();
        return stringExtra;
    }

    public static final String g(Intent intent) {
        String string = RemoteInput.getResultsFromIntent(intent).getString("reply");
        string.getClass();
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final StatusBarNotification h(String str, lug lugVar, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        duj dujVar = new duj();
        dujVar.a = "me";
        dtm dtmVar = new dtm(new duk(dujVar));
        dtmVar.h(lugVar.g);
        dtmVar.c = lugVar.b;
        yfq yfqVar = lugVar.d;
        int size = yfqVar.size();
        for (int i = 0; i < size; i++) {
            Message message = (Message) yfqVar.get(i);
            dtl dtlVar = new dtl(message.b, message.f, message.e);
            String str2 = message.c;
            Uri uri = message.d;
            if (lvx.a().f(str2, uri, str)) {
                dtlVar.c(str2, uri);
            }
            List list = dtmVar.a;
            list.add(dtlVar);
            if (list.size() > 25) {
                list.remove(0);
            }
        }
        dss dssVar = new dss(0, "mark as read", pendingIntent);
        dssVar.c();
        dssVar.a = 2;
        dst dstVarA = dssVar.a();
        dss dssVar2 = new dss(0, "reply", pendingIntent2);
        dssVar2.c();
        dssVar2.a = 1;
        dssVar2.b(new dum("reply", null, null, true, 0, new Bundle(), new HashSet()));
        dst dstVarA2 = dssVar2.a();
        dsx dsxVar = new dsx(this.b, null);
        dsxVar.o(dtmVar);
        dsxVar.g(dstVarA);
        dsxVar.g(dstVarA2);
        Notification notificationA = dsxVar.a();
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        UserHandle userHandleMyUserHandle = Process.myUserHandle();
        oit.a();
        return new StatusBarNotification(str, str, 0, "aa-generated-sbn", iMyUid, iMyPid, 0, notificationA, userHandleMyUserHandle, Instant.now().toEpochMilli());
    }

    private static final String i(duk dukVar) {
        CharSequence charSequence = dukVar.a;
        charSequence.getClass();
        String string = charSequence.toString();
        String str = dukVar.d;
        return str != null ? str : string;
    }

    public final PendingIntent a(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        int i2 = this.d + 1;
        this.d = i2;
        return PendingIntent.getService(this.b, i2, intent, (i >= 31 ? 33554432 : 0) | 1073741824);
    }

    public final Intent b(String str, lug lugVar, String str2) {
        ((ynz) ((ynz) a.e()).ai((char) 4284)).y("Creating intent with action %s", str2);
        Intent intent = new Intent(this.b, (Class<?>) this.c);
        intent.setAction(str2);
        intent.putExtra("conversation-id", lugVar.a);
        intent.putExtra("app-package", str);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MessagingInfo d(String str, lug lugVar, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        StatusBarNotification statusBarNotificationH;
        Optional optionalEmpty;
        if (actj.v()) {
            if (this.e.isEmpty()) {
                try {
                    optionalEmpty = Optional.of(Long.valueOf(this.b.getPackageManager().getPackageInfo(RemoteApiConstants.NOW_PACKAGE, 0).versionCode));
                } catch (PackageManager.NameNotFoundException e) {
                    ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai(4285)).M("Could not fetch PackageInfo for app: %s\n%s", RemoteApiConstants.NOW_PACKAGE, e);
                    optionalEmpty = Optional.empty();
                }
                this.e = optionalEmpty;
            }
            Optional optional = this.e;
            long jE = actj.e();
            yob yobVar = a;
            ((ynz) ((ynz) yobVar.e()).ai(4282)).L("Omit fake SBN? \nAssistant cur version: %s\nAssistant min version: %s", optional.isPresent() ? optional.get() : "<unknown>", jE);
            if (!optional.isPresent() || ((Long) optional.get()).longValue() < jE) {
                statusBarNotificationH = h(str, lugVar, pendingIntent, pendingIntent2);
            } else {
                ((ynz) ((ynz) yobVar.e()).ai((char) 4283)).u("Omitting fake SBN");
                statusBarNotificationH = null;
            }
        } else {
            statusBarNotificationH = h(str, lugVar, pendingIntent, pendingIntent2);
        }
        qjk qjkVar = new qjk();
        qjkVar.m = lugVar.g;
        qjkVar.a = statusBarNotificationH;
        String str2 = lugVar.b;
        qjkVar.c = str2;
        qjkVar.h = str;
        qjkVar.g = str2;
        qjkVar.l = new RemoteInput.Builder("reply").build();
        if (pendingIntent != null) {
            qjkVar.e = pendingIntent;
        }
        if (pendingIntent2 != null) {
            qjkVar.j = pendingIntent2;
        }
        duk dukVar = lugVar.c;
        if (dukVar != null) {
            qjkVar.n = i(dukVar);
        }
        Bitmap bitmap = lugVar.e;
        if (bitmap != null) {
            qjkVar.i = Icon.createWithBitmap(bitmap);
        }
        yfq yfqVar = lugVar.d;
        int size = yfqVar.size();
        for (int i = 0; i < size; i++) {
            Message message = (Message) yfqVar.get(i);
            duk dukVar2 = message.e;
            CharSequence charSequence = dukVar2.a;
            charSequence.getClass();
            String str3 = message.c;
            Uri uri = message.d;
            String string = charSequence.toString();
            lvx.a().f(str3, uri, str);
            qjkVar.a(new qjl(string, i(dukVar2), message.b, message.f, str3, uri));
        }
        return new MessagingInfo(qjkVar);
    }
}
