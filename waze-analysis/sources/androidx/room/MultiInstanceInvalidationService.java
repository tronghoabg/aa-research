package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.room.IMultiInstanceInvalidationService;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class MultiInstanceInvalidationService extends Service {
    private int maxClientId;
    private final Map<Integer, String> clientNames = new LinkedHashMap();
    private final RemoteCallbackList<IMultiInstanceInvalidationCallback> callbackList = new RemoteCallbackList<IMultiInstanceInvalidationCallback>() { // from class: androidx.room.MultiInstanceInvalidationService$callbackList$1
        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, Object obj) {
            x.f(iMultiInstanceInvalidationCallback, "callback");
            x.f(obj, "cookie");
            this.this$0.getClientNames$room_runtime().remove((Integer) obj);
        }
    };
    private final IMultiInstanceInvalidationService.Stub binder = new IMultiInstanceInvalidationService.Stub() { // from class: androidx.room.MultiInstanceInvalidationService$binder$1
        @Override // androidx.room.IMultiInstanceInvalidationService
        public void broadcastInvalidation(int i2, String[] strArr) {
            x.f(strArr, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.this$0;
            synchronized (multiInstanceInvalidationService.getCallbackList$room_runtime()) {
                String str = multiInstanceInvalidationService.getClientNames$room_runtime().get(Integer.valueOf(i2));
                if (str == null) {
                    Log.w(Room.LOG_TAG, "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.getCallbackList$room_runtime().beginBroadcast();
                for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.getCallbackList$room_runtime().getBroadcastCookie(i3);
                        x.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = multiInstanceInvalidationService.getClientNames$room_runtime().get(num);
                        if (i2 != iIntValue && x.n(str, str2)) {
                            try {
                                ((IMultiInstanceInvalidationCallback) multiInstanceInvalidationService.getCallbackList$room_runtime().getBroadcastItem(i3)).onInvalidation(strArr);
                            } catch (RemoteException e2) {
                                Log.w(Room.LOG_TAG, "Error invoking a remote callback", e2);
                            }
                        }
                    } finally {
                        multiInstanceInvalidationService.getCallbackList$room_runtime().finishBroadcast();
                    }
                }
            }
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public int registerCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
            x.f(iMultiInstanceInvalidationCallback, "callback");
            int i2 = 0;
            if (str == null) {
                return 0;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.this$0;
            synchronized (multiInstanceInvalidationService.getCallbackList$room_runtime()) {
                multiInstanceInvalidationService.setMaxClientId$room_runtime(multiInstanceInvalidationService.getMaxClientId$room_runtime() + 1);
                int maxClientId$room_runtime = multiInstanceInvalidationService.getMaxClientId$room_runtime();
                Integer numValueOf = Integer.valueOf(maxClientId$room_runtime);
                if (multiInstanceInvalidationService.getCallbackList$room_runtime().register(iMultiInstanceInvalidationCallback, numValueOf)) {
                    multiInstanceInvalidationService.getClientNames$room_runtime().put(numValueOf, str);
                    i2 = maxClientId$room_runtime;
                } else {
                    multiInstanceInvalidationService.setMaxClientId$room_runtime(multiInstanceInvalidationService.getMaxClientId$room_runtime() - 1);
                    multiInstanceInvalidationService.getMaxClientId$room_runtime();
                }
            }
            return i2;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void unregisterCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i2) {
            x.f(iMultiInstanceInvalidationCallback, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.this$0;
            synchronized (multiInstanceInvalidationService.getCallbackList$room_runtime()) {
                multiInstanceInvalidationService.getCallbackList$room_runtime().unregister(iMultiInstanceInvalidationCallback);
                multiInstanceInvalidationService.getClientNames$room_runtime().remove(Integer.valueOf(i2));
            }
        }
    };

    public final RemoteCallbackList<IMultiInstanceInvalidationCallback> getCallbackList$room_runtime() {
        return this.callbackList;
    }

    public final Map<Integer, String> getClientNames$room_runtime() {
        return this.clientNames;
    }

    public final int getMaxClientId$room_runtime() {
        return this.maxClientId;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        return this.binder;
    }

    public final void setMaxClientId$room_runtime(int i2) {
        this.maxClientId = i2;
    }
}
