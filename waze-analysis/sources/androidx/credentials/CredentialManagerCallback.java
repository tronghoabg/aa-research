package androidx.credentials;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface CredentialManagerCallback<R, E> {
    void onError(E e2);

    void onResult(R r);
}
