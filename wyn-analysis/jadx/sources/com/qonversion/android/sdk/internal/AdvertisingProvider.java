package com.qonversion.android.sdk.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.sdk.nativeAd.e;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/qonversion/android/sdk/internal/AdvertisingProvider;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;", "callback", "Lef/C;", "init", "(Landroid/content/Context;Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;)V", "AdvertisingConnection", "AdvertisingInterface", "Callback", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdvertisingProvider {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/qonversion/android/sdk/internal/AdvertisingProvider$AdvertisingConnection;", "Landroid/content/ServiceConnection;", "<init>", "()V", "Landroid/content/ComponentName;", MediationMetaData.KEY_NAME, "Landroid/os/IBinder;", "service", "Lef/C;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "", "retrieved", "Z", "Ljava/util/concurrent/LinkedBlockingQueue;", "queue", "Ljava/util/concurrent/LinkedBlockingQueue;", "getBinder$sdk_release", "()Landroid/os/IBinder;", "binder", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AdvertisingConnection implements ServiceConnection {

        @NotNull
        private final LinkedBlockingQueue<IBinder> queue = new LinkedBlockingQueue<>(1);
        private boolean retrieved;

        @NotNull
        public final IBinder getBinder$sdk_release() throws InterruptedException {
            if (this.retrieved) {
                throw new IllegalStateException();
            }
            this.retrieved = true;
            IBinder iBinderTake = this.queue.take();
            AbstractC3340k.c(iBinderTake, "null cannot be cast to non-null type android.os.IBinder");
            return iBinderTake;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) throws InterruptedException {
            AbstractC3340k.e(name, "name");
            AbstractC3340k.e(service, "service");
            try {
                this.queue.put(service);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@NotNull ComponentName name) {
            AbstractC3340k.e(name, "name");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/qonversion/android/sdk/internal/AdvertisingProvider$AdvertisingInterface;", "Landroid/os/IInterface;", "binder", "Landroid/os/IBinder;", "(Landroid/os/IBinder;)V", "id", "", "getId", "()Ljava/lang/String;", "asBinder", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AdvertisingInterface implements IInterface {

        @NotNull
        private final IBinder binder;

        public AdvertisingInterface(@NotNull IBinder binder) {
            AbstractC3340k.e(binder, "binder");
            this.binder = binder;
        }

        @Override // android.os.IInterface
        @NotNull
        public IBinder asBinder() {
            return this.binder;
        }

        @Nullable
        public final String getId() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            AbstractC3340k.d(parcelObtain, "obtain(...)");
            Parcel parcelObtain2 = Parcel.obtain();
            AbstractC3340k.d(parcelObtain2, "obtain(...)");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.binder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;", "", "", "advertisingId", "Lef/C;", "onSuccess", "(Ljava/lang/String;)V", "", "t", "onFailure", "(Ljava/lang/Throwable;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Callback {
        void onFailure(@NotNull Throwable t10);

        void onSuccess(@NotNull String advertisingId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$2(Context context, Callback callback) {
        AbstractC3340k.e(context, "$context");
        AbstractC3340k.e(callback, "$callback");
        if (AbstractC3340k.a(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        AdvertisingConnection advertisingConnection = new AdvertisingConnection();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, advertisingConnection, 1)) {
            callback.onFailure(new IllegalStateException("Binding to advertising id service failed"));
            return;
        }
        try {
            String id2 = new AdvertisingInterface(advertisingConnection.getBinder$sdk_release()).getId();
            if (id2 != null) {
                callback.onSuccess(id2);
            }
        } catch (Exception e7) {
            callback.onFailure(e7);
        } finally {
            context.unbindService(advertisingConnection);
        }
    }

    public final void init(@NotNull Context context, @NotNull Callback callback) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(callback, "callback");
        new Thread(new e(5, context, callback)).start();
    }
}
