package com.google.android.recaptcha.internal;

import Ef.C0514u;
import Ef.H;
import Ef.K;
import Ef.z0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import jf.InterfaceC3106f;

/* loaded from: classes4.dex */
public final class zzas {
    public static final K zza(Task task) {
        final C0514u c0514uB = H.b();
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception != null) {
                c0514uB.Y(exception);
            } else if (task.isCanceled()) {
                c0514uB.cancel(null);
            } else {
                c0514uB.K(task.getResult());
            }
        } else {
            task.addOnCompleteListener(zzo.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzaq
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    InterfaceC3106f interfaceC3106f = c0514uB;
                    Exception exception2 = task2.getException();
                    if (exception2 != null) {
                        ((C0514u) interfaceC3106f).Y(exception2);
                    } else if (task2.isCanceled()) {
                        ((z0) interfaceC3106f).cancel(null);
                    } else {
                        ((C0514u) interfaceC3106f).K(task2.getResult());
                    }
                }
            });
        }
        return new zzar(c0514uB);
    }
}
