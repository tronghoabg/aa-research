package Ka;

import Z9.e;
import Z9.h;
import android.location.Location;
import cb.AbstractC1593a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import pd.f;
import tc.g;
import w4.InterfaceC4359a;
import x4.l;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements OnFailureListener, OnCompleteListener, InterfaceC4359a, l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f6712b;

    public /* synthetic */ b(g gVar, int i5) {
        this.f6711a = i5;
        this.f6712b = gVar;
    }

    @Override // x4.l
    public void a(Location location) {
        this.f6712b.a(gc.b.M(location));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        String message;
        switch (this.f6711a) {
            case 1:
                boolean zIsSuccessful = task.isSuccessful();
                g gVar = this.f6712b;
                if (!zIsSuccessful) {
                    Exception exception = task.getException();
                    gVar.b("firebase_analytics", exception != null ? exception.getMessage() : "An unknown error occurred", null);
                    break;
                } else {
                    gVar.a(task.getResult());
                    break;
                }
            case 2:
                boolean zIsSuccessful2 = task.isSuccessful();
                g gVar2 = this.f6712b;
                if (!zIsSuccessful2) {
                    Exception exception2 = task.getException();
                    gVar2.b("firebase_crashlytics", exception2 != null ? exception2.getMessage() : "An unknown error occurred", null);
                    break;
                } else {
                    gVar2.a(task.getResult());
                    break;
                }
            case 3:
                boolean zIsSuccessful3 = task.isSuccessful();
                g gVar3 = this.f6712b;
                if (!zIsSuccessful3) {
                    Exception exception3 = task.getException();
                    String message2 = exception3 != null ? exception3.getMessage() : null;
                    HashMap mapL = AbstractC1593a.l("code", "unknown");
                    if (exception3 != null) {
                        mapL.put(PglCryptUtils.KEY_MESSAGE, exception3.getMessage());
                    } else {
                        mapL.put(PglCryptUtils.KEY_MESSAGE, "An unknown error has occurred.");
                    }
                    gVar3.b("firebase_dynamic_links", message2, mapL);
                    break;
                } else {
                    gVar3.a(task.getResult());
                    break;
                }
            default:
                boolean zIsSuccessful4 = task.isSuccessful();
                g gVar4 = this.f6712b;
                if (!zIsSuccessful4) {
                    Exception exception4 = task.getException();
                    HashMap map = new HashMap();
                    if (exception4 instanceof Z9.g) {
                        map.put("code", "throttled");
                        map.put(PglCryptUtils.KEY_MESSAGE, "frequency of requests exceeds throttled limits");
                    } else if (exception4 instanceof e) {
                        map.put("code", "internal");
                        map.put(PglCryptUtils.KEY_MESSAGE, "internal remote config fetch error");
                    } else if (exception4 instanceof h) {
                        map.put("code", "remote-config-server-error");
                        map.put(PglCryptUtils.KEY_MESSAGE, exception4.getMessage());
                        Throwable cause = exception4.getCause();
                        if (cause != null && (message = cause.getMessage()) != null && message.contains("Forbidden")) {
                            map.put("code", "forbidden");
                        }
                    } else {
                        map.put("code", "unknown");
                        map.put(PglCryptUtils.KEY_MESSAGE, "unknown remote config error");
                    }
                    gVar4.b("firebase_remote_config", exception4 != null ? exception4.getMessage() : null, map);
                    break;
                } else {
                    gVar4.a(task.getResult());
                    break;
                }
                break;
        }
    }

    @Override // w4.InterfaceC4359a
    public void onError(int i5) {
        switch (this.f6711a) {
            case 7:
                this.f6712b.b(f.h(i5), f.g(i5), null);
                break;
            default:
                this.f6712b.b(f.h(i5), f.g(i5), null);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.f6712b.b("TextRecognizerError", exc.toString(), null);
    }
}
