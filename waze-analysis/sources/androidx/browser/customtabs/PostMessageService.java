package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.a.f;
import android.support.a.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class PostMessageService extends Service {
    private o mBinder = new o() { // from class: androidx.browser.customtabs.PostMessageService.1
        @Override // android.support.a.p
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // android.support.a.p
        public void onMessageChannelReady(f fVar, Bundle bundle) {
            fVar.onMessageChannelReady(bundle);
        }

        @Override // android.support.a.p
        public void onPostMessage(f fVar, String str, Bundle bundle) {
            fVar.onPostMessage(str, bundle);
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }
}
