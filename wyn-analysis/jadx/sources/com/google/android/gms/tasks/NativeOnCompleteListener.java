package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    public NativeOnCompleteListener(long j8) {
        this.zza = j8;
    }

    public static void createAndAddCallback(Task<Object> task, long j8) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j8));
    }

    public native void nativeOnComplete(long j8, Object obj, boolean z2, boolean z10, String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task<Object> task) {
        Object result;
        String message;
        Exception exception;
        if (task.isSuccessful()) {
            result = task.getResult();
            message = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            result = null;
            message = null;
        } else {
            message = exception.getMessage();
            result = null;
        }
        nativeOnComplete(this.zza, result, task.isSuccessful(), task.isCanceled(), message);
    }
}
