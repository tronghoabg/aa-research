package com.android.car.libraries.apphost.external.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ITelephoneKeypadEventListener;
import androidx.car.app.utils.RemoteUtils$1;
import com.android.car.libraries.apphost.external.model.TelephoneKeypadEventListenerDelegateImpl;
import defpackage.afeu;
import defpackage.gkk;
import defpackage.gkl;
import defpackage.qu;
import defpackage.rb;
import defpackage.tr;
import defpackage.xy;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000:\u0001\u0010¨\u0006\u0011"}, d2 = {"Lcom/android/car/libraries/apphost/external/model/TelephoneKeypadEventListenerDelegateImpl;", "Lcom/android/car/libraries/apphost/external/model/TelephoneKeypadEventListenerDelegate;", "clientListener", "Lcom/android/car/libraries/apphost/external/model/TelephoneKeypadEventListener;", "<init>", "(Lcom/android/car/libraries/apphost/external/model/TelephoneKeypadEventListener;)V", "binder", "Landroidx/car/app/model/ITelephoneKeypadEventListener;", "sendKeyLongPress", "", "key", "", "callback", "Landroidx/car/app/OnDoneCallback;", "sendKeyDown", "sendKeyUp", "TelephoneKeypadEventBinder", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.external.model_model"}, k = 1, mv = {2, 3, 0}, xi = 48)
@rb
/* loaded from: classes2.dex */
public final class TelephoneKeypadEventListenerDelegateImpl implements gkl {
    private final ITelephoneKeypadEventListener binder;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/android/car/libraries/apphost/external/model/TelephoneKeypadEventListenerDelegateImpl$TelephoneKeypadEventBinder;", "Landroidx/car/app/model/ITelephoneKeypadEventListener$Stub;", "clientListener", "Lcom/android/car/libraries/apphost/external/model/TelephoneKeypadEventListener;", "<init>", "(Lcom/android/car/libraries/apphost/external/model/TelephoneKeypadEventListener;)V", "onKeyLongPress", "", "key", "", "callback", "Landroidx/car/app/IOnDoneCallback;", "onKeyDown", "onKeyUp", "getInterfaceVersion", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.external.model_model"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @rb
    public static final class TelephoneKeypadEventBinder extends ITelephoneKeypadEventListener.Stub {
        private final gkk clientListener;

        public TelephoneKeypadEventBinder(gkk gkkVar) {
            gkkVar.getClass();
            this.clientListener = gkkVar;
        }

        public static final Object onKeyDown$lambda$0(TelephoneKeypadEventBinder telephoneKeypadEventBinder, int i) {
            telephoneKeypadEventBinder.clientListener.a();
            return null;
        }

        public static final Object onKeyLongPress$lambda$0(TelephoneKeypadEventBinder telephoneKeypadEventBinder, int i) {
            telephoneKeypadEventBinder.clientListener.b();
            return null;
        }

        public static final Object onKeyUp$lambda$0(TelephoneKeypadEventBinder telephoneKeypadEventBinder, int i) {
            telephoneKeypadEventBinder.clientListener.c();
            return null;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadEventListener
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadEventListener
        public void onKeyDown(final int key, IOnDoneCallback callback) {
            callback.getClass();
            tr.b(callback, "TelephoneKeypadEventBinder#onKeyDown", new xy() { // from class: gkn
                @Override // defpackage.xy
                public final Object a() {
                    TelephoneKeypadEventListenerDelegateImpl.TelephoneKeypadEventBinder.onKeyDown$lambda$0(this.a, key);
                    return null;
                }
            });
        }

        @Override // androidx.car.app.model.ITelephoneKeypadEventListener
        public void onKeyLongPress(final int key, IOnDoneCallback callback) {
            callback.getClass();
            tr.b(callback, "TelephoneKeypadEventBinder#onKeyLongPress", new xy() { // from class: gko
                @Override // defpackage.xy
                public final Object a() {
                    TelephoneKeypadEventListenerDelegateImpl.TelephoneKeypadEventBinder.onKeyLongPress$lambda$0(this.a, key);
                    return null;
                }
            });
        }

        @Override // androidx.car.app.model.ITelephoneKeypadEventListener
        public void onKeyUp(final int key, IOnDoneCallback callback) {
            callback.getClass();
            tr.b(callback, "TelephoneKeypadEventBinder#onKeyUp", new xy() { // from class: gkm
                @Override // defpackage.xy
                public final Object a() {
                    TelephoneKeypadEventListenerDelegateImpl.TelephoneKeypadEventBinder.onKeyUp$lambda$0(this.a, key);
                    return null;
                }
            });
        }
    }

    public TelephoneKeypadEventListenerDelegateImpl(gkk gkkVar) {
        this.binder = gkkVar != null ? new TelephoneKeypadEventBinder(gkkVar) : new ITelephoneKeypadEventListener.Default();
    }

    @Override // defpackage.gkl
    public void sendKeyDown(int i, qu quVar) {
        quVar.getClass();
        try {
            this.binder.onKeyDown(i, new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.gkl
    public void sendKeyLongPress(int i, qu quVar) {
        quVar.getClass();
        try {
            this.binder.onKeyLongPress(i, new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.gkl
    public void sendKeyUp(int i, qu quVar) {
        quVar.getClass();
        try {
            this.binder.onKeyUp(i, new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TelephoneKeypadEventListenerDelegateImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ TelephoneKeypadEventListenerDelegateImpl(gkk gkkVar, int i, afeu afeuVar) {
        this(1 == (i & 1) ? null : gkkVar);
    }
}
