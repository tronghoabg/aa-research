package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes2.dex */
final class ets extends Handler {
    public ett a;

    public ets(ett ettVar) {
        this.a = ettVar;
    }

    public final void a(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ett ettVar = this.a;
        if (ettVar == null) {
            removeCallbacksAndMessages(null);
            return;
        }
        Bundle data = message.getData();
        switch (message.what) {
            case 1:
                Bundle bundle = data.getBundle("data_root_hints");
                MediaSessionCompat.c(bundle);
                ajmd ajmdVar = ettVar.f;
                String string = data.getString("data_package_name");
                int i = data.getInt("data_calling_pid");
                int i2 = data.getInt("data_calling_uid");
                erb erbVar = new erb(message.replyTo);
                if (string != null) {
                    ett ettVar2 = (ett) ajmdVar.a;
                    for (String str : ettVar2.getPackageManager().getPackagesForUid(i2)) {
                        if (str.equals(string)) {
                            ettVar2.d.a(new etq(ajmdVar, erbVar, string, i, i2, bundle));
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + string);
            case 2:
                ajmd ajmdVar2 = ettVar.f;
                ((ett) ajmdVar2.a).d.a(new esx(ajmdVar2, new erb(message.replyTo), 4));
                return;
            case 3:
                Bundle bundle2 = data.getBundle("data_options");
                MediaSessionCompat.c(bundle2);
                ajmd ajmdVar3 = ettVar.f;
                ((ett) ajmdVar3.a).d.a(new etr(ajmdVar3, new erb(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle2, 1));
                return;
            case 4:
                ajmd ajmdVar4 = ettVar.f;
                ((ett) ajmdVar4.a).d.a(new xx(ajmdVar4, new erb(message.replyTo), data.getString("data_media_item_id"), (Object) data.getBinder("data_callback_token"), 3));
                return;
            case 5:
                ajmd ajmdVar5 = ettVar.f;
                String string2 = data.getString("data_media_item_id");
                ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                erb erbVar2 = new erb(message.replyTo);
                if (TextUtils.isEmpty(string2) || resultReceiver == null) {
                    return;
                }
                ((ett) ajmdVar5.a).d.a(new xx(ajmdVar5, erbVar2, string2, (Object) resultReceiver, 4));
                return;
            case 6:
                MediaSessionCompat.c(data.getBundle("data_root_hints"));
                ajmd ajmdVar6 = ettVar.f;
                ((ett) ajmdVar6.a).d.a(new ius(ajmdVar6, new erb(message.replyTo), data.getInt("data_calling_uid"), data.getString("data_package_name"), data.getInt("data_calling_pid"), 1));
                return;
            case 7:
                ajmd ajmdVar7 = ettVar.f;
                ((ett) ajmdVar7.a).d.a(new esx(ajmdVar7, new erb(message.replyTo), 5));
                return;
            case 8:
                MediaSessionCompat.c(data.getBundle("data_search_extras"));
                ajmd ajmdVar8 = ettVar.f;
                String string3 = data.getString("data_search_query");
                ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                erb erbVar3 = new erb(message.replyTo);
                if (TextUtils.isEmpty(string3) || resultReceiver2 == null) {
                    return;
                }
                ((ett) ajmdVar8.a).d.a(new xx(ajmdVar8, erbVar3, string3, (Object) resultReceiver2, 5));
                return;
            case 9:
                Bundle bundle3 = data.getBundle("data_custom_action_extras");
                MediaSessionCompat.c(bundle3);
                ajmd ajmdVar9 = ettVar.f;
                String string4 = data.getString("data_custom_action");
                ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                erb erbVar4 = new erb(message.replyTo);
                if (TextUtils.isEmpty(string4) || resultReceiver3 == null) {
                    return;
                }
                ((ett) ajmdVar9.a).d.a(new etr(ajmdVar9, erbVar4, string4, bundle3, resultReceiver3, 0));
                return;
            default:
                Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                return;
        }
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        Bundle data = message.getData();
        data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
        data.putInt("data_calling_uid", Binder.getCallingUid());
        int callingPid = Binder.getCallingPid();
        if (callingPid > 0) {
            data.putInt("data_calling_pid", callingPid);
        } else if (!data.containsKey("data_calling_pid")) {
            data.putInt("data_calling_pid", -1);
        }
        return super.sendMessageAtTime(message, j);
    }
}
