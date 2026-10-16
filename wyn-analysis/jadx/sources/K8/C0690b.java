package K8;

import A7.AbstractC0279p0;
import A7.RunnableC0278p;
import J8.C0636k;
import J8.C0638m;
import J8.C0641p;
import Va.Y7;
import android.app.Activity;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.internal.p002firebaseauthapi.zzaep;
import com.google.android.gms.internal.p002firebaseauthapi.zzafb;
import com.google.android.gms.internal.p002firebaseauthapi.zzagh;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.FirebaseAuth;
import h7.C2793a;

/* renamed from: K8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0690b implements Continuation, OnFailureListener {

    /* renamed from: c, reason: collision with root package name */
    public static final C0690b f6623c = new C0690b(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6624a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6625b;

    public /* synthetic */ C0690b(int i5) {
        this.f6624a = i5;
    }

    public static void b(FirebaseAuth firebaseAuth, Activity activity, TaskCompletionSource taskCompletionSource) {
        Task taskForException;
        if (activity == null) {
            taskCompletionSource.setException(new C0636k("ERROR_MISSING_ACTIVITY", "App verification failed - a valid Activity is required to complete the Recaptcha flow"));
            return;
        }
        s8.g gVar = firebaseAuth.f27283a;
        gVar.a();
        x.b(gVar.f45328a, firebaseAuth);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        if (E4.F.f2851d == null) {
            E4.F f10 = new E4.F(3);
            f10.f2853b = false;
            E4.F.f2851d = f10;
        }
        E4.F f11 = E4.F.f2851d;
        if (f11.f2853b) {
            taskForException = Tasks.forException(zzadg.zza(new Status(17057, "reCAPTCHA flow already in progress", null, null)));
        } else {
            r rVar = new r(f11, activity, taskCompletionSource2);
            f11.f2854c = rVar;
            LocalBroadcastManager.getInstance(activity).registerReceiver(rVar, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
            f11.f2853b = true;
            new zzaep(firebaseAuth, activity).zza();
            taskForException = taskCompletionSource2.getTask();
        }
        taskForException.addOnSuccessListener(new G(2, taskCompletionSource)).addOnFailureListener(new G(1, taskCompletionSource));
    }

    public Task a(FirebaseAuth firebaseAuth, String str, Activity activity, boolean z2, boolean z10, boolean z11, RecaptchaAction recaptchaAction) {
        TaskCompletionSource taskCompletionSource;
        C0694f c0694f = firebaseAuth.f27289g;
        F f10 = F.f6577c;
        s8.g gVar = firebaseAuth.f27283a;
        if (zzafb.zza(gVar) || c0694f.f6639a) {
            return Tasks.forResult(new K(null, null, null));
        }
        Log.i("b", "ForceRecaptchaV2Flow from phoneAuthOptions = " + z10 + ", ForceRecaptchav2Flow from firebaseSettings = " + c0694f.f6640b);
        boolean z12 = z10 || c0694f.f6640b;
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        x xVar = f10.f6578a;
        xVar.getClass();
        Task task = System.currentTimeMillis() - xVar.f6686b < 3600000 ? xVar.f6685a : null;
        if (task != null) {
            if (task.isSuccessful()) {
                return Tasks.forResult(new K((String) task.getResult(), null, null));
            }
            Log.e("b", "Error in previous reCAPTCHAV2 flow: " + task.getException().getMessage());
            Log.e("b", "Continuing with application verification as normal");
        }
        if (z12 || z11) {
            taskCompletionSource = taskCompletionSource2;
            c(firebaseAuth, str, activity, z2, z12, f10, taskCompletionSource);
        } else {
            if (firebaseAuth.f27293l == null) {
                firebaseAuth.f27293l = new C6.l(gVar, firebaseAuth);
            }
            Task taskContinueWithTask = firebaseAuth.f27293l.G(firebaseAuth.k, Boolean.FALSE).continueWithTask(new x4.d(20));
            A a5 = new A();
            a5.f6562c = this;
            a5.f6563d = taskCompletionSource2;
            a5.f6564e = firebaseAuth;
            a5.f6565f = recaptchaAction;
            a5.f6560a = str;
            a5.f6566g = activity;
            a5.f6561b = z2;
            a5.f6567h = f10;
            taskContinueWithTask.addOnCompleteListener(a5);
            taskCompletionSource = taskCompletionSource2;
        }
        return taskCompletionSource.getTask();
    }

    public void c(FirebaseAuth firebaseAuth, String str, Activity activity, boolean z2, boolean z10, F f10, TaskCompletionSource taskCompletionSource) {
        if (!z2 || z10) {
            b(firebaseAuth, activity, taskCompletionSource);
            return;
        }
        s8.g gVar = firebaseAuth.f27283a;
        gVar.a();
        IntegrityManager integrityManagerCreate = IntegrityManagerFactory.create(gVar.f45328a);
        Task<TContinuationResult> taskContinueWithTask = (!TextUtils.isEmpty((String) this.f6625b) ? Tasks.forResult(new zzagh((String) this.f6625b)) : firebaseAuth.f27287e.zza()).continueWithTask(firebaseAuth.f27307z, new I(this, str, integrityManagerCreate));
        Y7 y72 = new Y7();
        y72.f13867a = this;
        y72.f13868b = taskCompletionSource;
        y72.f13869c = firebaseAuth;
        y72.f13870d = activity;
        taskContinueWithTask.addOnCompleteListener(y72);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        if (exc instanceof s8.k) {
            C2793a c2793a = C0700l.f6658f;
            c2793a.e("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            C0700l c0700l = (C0700l) ((RunnableC0278p) this.f6625b).f1019c;
            int i5 = (int) c0700l.f6660b;
            c0700l.f6660b = (i5 == 30 || i5 == 60 || i5 == 120 || i5 == 240 || i5 == 480) ? 2 * c0700l.f6660b : i5 != 960 ? 30L : 960L;
            c0700l.f6659a = (c0700l.f6660b * 1000) + System.currentTimeMillis();
            c2793a.e(AbstractC0279p0.k(c0700l.f6659a, "Scheduling refresh for "), new Object[0]);
            c0700l.f6662d.postDelayed(c0700l.f6663e, c0700l.f6660b * 1000);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f6624a) {
            case 1:
                if (!task.isSuccessful()) {
                    return Tasks.forException(task.getException());
                }
                String str = ((C0641p) task.getResult()).f5812a;
                C0696h c0696h = (C0696h) this.f6625b;
                AbstractC1732v.f(str);
                C0698j c0698j = new C0698j();
                c0698j.f6652a = str;
                c0698j.f6656e = c0696h.f6645a;
                return Tasks.forResult(c0698j);
            case 2:
                C0697i c0697i = (C0697i) this.f6625b;
                if (c0697i.f6649d == null) {
                    return task;
                }
                if (task.isSuccessful()) {
                    T t10 = (T) task.getResult();
                    return Tasks.forResult(new T(t10.f6611a, t10.f6612b, c0697i.f6649d));
                }
                Exception exception = task.getException();
                if (exception instanceof C0638m) {
                    ((C0638m) exception).f5809b = c0697i.f6649d;
                }
                return Tasks.forException(exception);
            case 3:
            default:
                if (task.isSuccessful()) {
                    return ((RecaptchaTasksClient) task.getResult()).executeTask((RecaptchaAction) this.f6625b);
                }
                Exception exception2 = task.getException();
                AbstractC1732v.i(exception2);
                if (!(exception2 instanceof y)) {
                    return Tasks.forException(exception2);
                }
                if (Log.isLoggable("RecaptchaHandler", 4)) {
                    Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exception2.getMessage());
                }
                return Tasks.forResult("");
            case 4:
                boolean zIsSuccessful = task.isSuccessful();
                com.moloco.sdk.internal.publisher.H h10 = (com.moloco.sdk.internal.publisher.H) this.f6625b;
                if (zIsSuccessful) {
                    return h10.y0((String) task.getResult());
                }
                Exception exception3 = task.getException();
                AbstractC1732v.i(exception3);
                Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + exception3.getMessage() + "\n\n Failing open with a fake token.");
                return h10.y0("NO_RECAPTCHA");
        }
    }

    public /* synthetic */ C0690b(Object obj, int i5) {
        this.f6624a = i5;
        this.f6625b = obj;
    }
}
