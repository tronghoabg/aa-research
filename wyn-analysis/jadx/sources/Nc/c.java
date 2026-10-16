package Nc;

import R8.m;
import Uc.f;
import W9.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8651b;

    public /* synthetic */ c(int i5, TaskCompletionSource taskCompletionSource) {
        this.f8650a = i5;
        this.f8651b = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Task task;
        TaskCompletionSource taskCompletionSource = this.f8651b;
        switch (this.f8650a) {
            case 0:
                try {
                    taskCompletionSource.setResult(null);
                    break;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
            case 1:
                try {
                    taskCompletionSource.setResult(null);
                    break;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 2:
                try {
                    taskCompletionSource.setResult(null);
                    break;
                } catch (Exception e11) {
                    taskCompletionSource.setException(e11);
                    return;
                }
            case 3:
                FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1(taskCompletionSource);
                break;
            case 4:
                try {
                    taskCompletionSource.setResult(null);
                    break;
                } catch (Exception e12) {
                    taskCompletionSource.setException(e12);
                    return;
                }
            case 5:
                try {
                    m mVar = N8.c.a().f8600a.f10517h;
                    mVar.f10492q.trySetResult(Boolean.FALSE);
                    mVar.f10493r.getTask();
                    taskCompletionSource.setResult(null);
                    break;
                } catch (Exception e13) {
                    taskCompletionSource.setException(e13);
                    return;
                }
            case 6:
                try {
                    m mVar2 = N8.c.a().f8600a.f10517h;
                    mVar2.f10492q.trySetResult(Boolean.TRUE);
                    mVar2.f10493r.getTask();
                    taskCompletionSource.setResult(null);
                    break;
                } catch (Exception e14) {
                    taskCompletionSource.setException(e14);
                    return;
                }
            case 7:
                taskCompletionSource.setResult(null);
                break;
            case 8:
                taskCompletionSource.setResult(null);
                break;
            case 9:
                HashMap map = f.f12728h;
                try {
                    taskCompletionSource.setResult(null);
                    break;
                } catch (Exception e15) {
                    taskCompletionSource.setException(e15);
                    return;
                }
            case 10:
                try {
                    taskCompletionSource.setResult(null);
                    break;
                } catch (Exception e16) {
                    taskCompletionSource.setException(e16);
                    return;
                }
            case 11:
                try {
                    taskCompletionSource.setResult(null);
                    break;
                } catch (Exception e17) {
                    taskCompletionSource.setException(e17);
                    return;
                }
            case 12:
                taskCompletionSource.setResult(null);
                break;
            default:
                try {
                    FirebaseMessaging firebaseMessagingC = FirebaseMessaging.c();
                    if (firebaseMessagingC.f() == null) {
                        task = Tasks.forResult(null);
                    } else {
                        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                        Executors.newSingleThreadExecutor(new H6.b("Firebase-Messaging-Network-Io", 2)).execute(new l(firebaseMessagingC, taskCompletionSource2, 1));
                        task = taskCompletionSource2.getTask();
                    }
                    Tasks.await(task);
                    taskCompletionSource.setResult(null);
                    break;
                } catch (Exception e18) {
                    taskCompletionSource.setException(e18);
                    return;
                }
        }
    }
}
