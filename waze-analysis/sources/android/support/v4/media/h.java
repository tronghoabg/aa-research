package android.support.v4.media;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import androidx.media.MediaBrowserCompatUtils;
import androidx.media.MediaBrowserProtocol;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Object f457a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f458b;

    public h() {
        this.f457a = new ArrayList();
        this.f458b = new ArrayList();
    }

    private final void j(int i2, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i2;
        messageObtain.arg1 = 1;
        messageObtain.setData(bundle);
        messageObtain.replyTo = messenger;
        ((Messenger) this.f458b).send(messageObtain);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    public final k a(Bundle bundle) {
        int i2 = 0;
        while (true) {
            ?? r1 = this.f458b;
            if (i2 >= r1.size()) {
                return null;
            }
            if (MediaBrowserCompatUtils.areSameOptions((Bundle) r1.get(i2), bundle)) {
                return (k) this.f457a.get(i2);
            }
            i2++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final List b() {
        return this.f457a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final List c() {
        return this.f458b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void d() {
        this.f457a.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    public final void e(k kVar) {
        int i2 = 0;
        while (true) {
            ?? r1 = this.f458b;
            if (i2 >= r1.size()) {
                this.f457a.add(kVar);
                r1.add(null);
                return;
            } else {
                if (MediaBrowserCompatUtils.areSameOptions((Bundle) r1.get(i2), null)) {
                    this.f457a.set(i2, kVar);
                    return;
                }
                i2++;
            }
        }
    }

    final void f(Context context, Messenger messenger) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
        bundle.putInt(MediaBrowserProtocol.DATA_CALLING_PID, Process.myPid());
        bundle.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, (Bundle) this.f457a);
        j(6, bundle, messenger);
    }

    final void g(Messenger messenger) throws RemoteException {
        j(7, null, messenger);
    }

    final void h(String str, IBinder iBinder, Messenger messenger) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
        bundle.putBinder(MediaBrowserProtocol.DATA_CALLBACK_TOKEN, iBinder);
        bundle.putBundle(MediaBrowserProtocol.DATA_OPTIONS, null);
        j(3, bundle, messenger);
    }

    final void i(String str, Messenger messenger) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
        bundle.putBinder(MediaBrowserProtocol.DATA_CALLBACK_TOKEN, null);
        j(4, bundle, messenger);
    }

    public h(IBinder iBinder, Bundle bundle) {
        this.f458b = new Messenger(iBinder);
        this.f457a = bundle;
    }
}
