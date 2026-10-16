package androidx.browser.auth;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.IBinder;
import android.support.a.c;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AuthTabSession {
    private final c mCallback;
    private final ComponentName mComponentName;
    private final PendingIntent mId;

    /* compiled from: WazeSource */
    public class PendingSession {
        private final AuthTabCallback mCallback;
        private final Executor mExecutor;
        private final PendingIntent mId;

        public PendingSession(PendingIntent pendingIntent, Executor executor, AuthTabCallback authTabCallback) {
            this.mId = pendingIntent;
            this.mExecutor = executor;
            this.mCallback = authTabCallback;
        }

        public AuthTabCallback getCallback() {
            return this.mCallback;
        }

        public Executor getExecutor() {
            return this.mExecutor;
        }

        public PendingIntent getId() {
            return this.mId;
        }
    }

    public AuthTabSession(c cVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.mCallback = cVar;
        this.mComponentName = componentName;
        this.mId = pendingIntent;
    }

    IBinder getBinder() {
        return this.mCallback.asBinder();
    }

    ComponentName getComponentName() {
        return this.mComponentName;
    }

    PendingIntent getId() {
        return this.mId;
    }
}
