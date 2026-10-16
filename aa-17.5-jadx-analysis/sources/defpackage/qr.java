package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IAppHost;
import androidx.car.app.ICarHost;
import androidx.car.app.constraints.IConstraintHost;
import androidx.car.app.media.IMediaPlaybackHost;
import androidx.car.app.navigation.INavigationHost;
import androidx.car.app.suggestion.ISuggestionHost;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.security.InvalidParameterException;

/* loaded from: classes2.dex */
public final class qr {
    public ICarHost a;
    private IAppHost b;
    private IConstraintHost c;
    private INavigationHost d;
    private ISuggestionHost e;
    private IMediaPlaybackHost f;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    final IInterface a(String str) throws RemoteException {
        ICarHost iCarHost = this.a;
        if (iCarHost == null) {
            Log.e("CarApp.Dispatch", "Host is not bound when attempting to retrieve host service");
            return null;
        }
        try {
            switch (str.hashCode()) {
                case -1606703562:
                    if (str.equals("constraints")) {
                        IConstraintHost iConstraintHost = this.c;
                        if (iConstraintHost != null) {
                            return iConstraintHost;
                        }
                        final int i = 0;
                        IConstraintHost iConstraintHost2 = (IConstraintHost) tr.a("getHost(Constraints)", new xz(this) { // from class: qq
                            public final /* synthetic */ qr a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.xz
                            public final Object a() {
                                int i2 = i;
                                if (i2 == 0) {
                                    ICarHost iCarHost2 = this.a.a;
                                    iCarHost2.getClass();
                                    return IConstraintHost.Stub.asInterface(iCarHost2.getHost("constraints"));
                                }
                                if (i2 == 1) {
                                    ICarHost iCarHost3 = this.a.a;
                                    iCarHost3.getClass();
                                    return IAppHost.Stub.asInterface(iCarHost3.getHost(CloudRecognizerProtocolStrings.APP));
                                }
                                if (i2 == 2) {
                                    ICarHost iCarHost4 = this.a.a;
                                    iCarHost4.getClass();
                                    return ISuggestionHost.Stub.asInterface(iCarHost4.getHost("suggestion"));
                                }
                                qr qrVar = this.a;
                                if (i2 != 3) {
                                    ICarHost iCarHost5 = qrVar.a;
                                    iCarHost5.getClass();
                                    return INavigationHost.Stub.asInterface(iCarHost5.getHost("navigation"));
                                }
                                ICarHost iCarHost6 = qrVar.a;
                                iCarHost6.getClass();
                                return IMediaPlaybackHost.Stub.asInterface(iCarHost6.getHost("media_playback"));
                            }
                        });
                        this.c = iConstraintHost2;
                        return iConstraintHost2;
                    }
                    break;
                case 96801:
                    if (str.equals(CloudRecognizerProtocolStrings.APP)) {
                        IAppHost iAppHost = this.b;
                        if (iAppHost != null) {
                            return iAppHost;
                        }
                        final int i2 = 1;
                        IAppHost iAppHost2 = (IAppHost) tr.a("getHost(App)", new xz(this) { // from class: qq
                            public final /* synthetic */ qr a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.xz
                            public final Object a() {
                                int i22 = i2;
                                if (i22 == 0) {
                                    ICarHost iCarHost2 = this.a.a;
                                    iCarHost2.getClass();
                                    return IConstraintHost.Stub.asInterface(iCarHost2.getHost("constraints"));
                                }
                                if (i22 == 1) {
                                    ICarHost iCarHost3 = this.a.a;
                                    iCarHost3.getClass();
                                    return IAppHost.Stub.asInterface(iCarHost3.getHost(CloudRecognizerProtocolStrings.APP));
                                }
                                if (i22 == 2) {
                                    ICarHost iCarHost4 = this.a.a;
                                    iCarHost4.getClass();
                                    return ISuggestionHost.Stub.asInterface(iCarHost4.getHost("suggestion"));
                                }
                                qr qrVar = this.a;
                                if (i22 != 3) {
                                    ICarHost iCarHost5 = qrVar.a;
                                    iCarHost5.getClass();
                                    return INavigationHost.Stub.asInterface(iCarHost5.getHost("navigation"));
                                }
                                ICarHost iCarHost6 = qrVar.a;
                                iCarHost6.getClass();
                                return IMediaPlaybackHost.Stub.asInterface(iCarHost6.getHost("media_playback"));
                            }
                        });
                        this.b = iAppHost2;
                        return iAppHost2;
                    }
                    break;
                case 98260:
                    if (str.equals("car")) {
                        return iCarHost;
                    }
                    break;
                case 1197722116:
                    if (str.equals("suggestion")) {
                        ISuggestionHost iSuggestionHost = this.e;
                        if (iSuggestionHost != null) {
                            return iSuggestionHost;
                        }
                        final int i3 = 2;
                        ISuggestionHost iSuggestionHost2 = (ISuggestionHost) tr.a("getHost(Suggestion)", new xz(this) { // from class: qq
                            public final /* synthetic */ qr a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.xz
                            public final Object a() {
                                int i22 = i3;
                                if (i22 == 0) {
                                    ICarHost iCarHost2 = this.a.a;
                                    iCarHost2.getClass();
                                    return IConstraintHost.Stub.asInterface(iCarHost2.getHost("constraints"));
                                }
                                if (i22 == 1) {
                                    ICarHost iCarHost3 = this.a.a;
                                    iCarHost3.getClass();
                                    return IAppHost.Stub.asInterface(iCarHost3.getHost(CloudRecognizerProtocolStrings.APP));
                                }
                                if (i22 == 2) {
                                    ICarHost iCarHost4 = this.a.a;
                                    iCarHost4.getClass();
                                    return ISuggestionHost.Stub.asInterface(iCarHost4.getHost("suggestion"));
                                }
                                qr qrVar = this.a;
                                if (i22 != 3) {
                                    ICarHost iCarHost5 = qrVar.a;
                                    iCarHost5.getClass();
                                    return INavigationHost.Stub.asInterface(iCarHost5.getHost("navigation"));
                                }
                                ICarHost iCarHost6 = qrVar.a;
                                iCarHost6.getClass();
                                return IMediaPlaybackHost.Stub.asInterface(iCarHost6.getHost("media_playback"));
                            }
                        });
                        this.e = iSuggestionHost2;
                        return iSuggestionHost2;
                    }
                    break;
                case 1569536022:
                    if (str.equals("media_playback")) {
                        IMediaPlaybackHost iMediaPlaybackHost = this.f;
                        if (iMediaPlaybackHost != null) {
                            return iMediaPlaybackHost;
                        }
                        final int i4 = 3;
                        IMediaPlaybackHost iMediaPlaybackHost2 = (IMediaPlaybackHost) tr.a("getHost(Media)", new xz(this) { // from class: qq
                            public final /* synthetic */ qr a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.xz
                            public final Object a() {
                                int i22 = i4;
                                if (i22 == 0) {
                                    ICarHost iCarHost2 = this.a.a;
                                    iCarHost2.getClass();
                                    return IConstraintHost.Stub.asInterface(iCarHost2.getHost("constraints"));
                                }
                                if (i22 == 1) {
                                    ICarHost iCarHost3 = this.a.a;
                                    iCarHost3.getClass();
                                    return IAppHost.Stub.asInterface(iCarHost3.getHost(CloudRecognizerProtocolStrings.APP));
                                }
                                if (i22 == 2) {
                                    ICarHost iCarHost4 = this.a.a;
                                    iCarHost4.getClass();
                                    return ISuggestionHost.Stub.asInterface(iCarHost4.getHost("suggestion"));
                                }
                                qr qrVar = this.a;
                                if (i22 != 3) {
                                    ICarHost iCarHost5 = qrVar.a;
                                    iCarHost5.getClass();
                                    return INavigationHost.Stub.asInterface(iCarHost5.getHost("navigation"));
                                }
                                ICarHost iCarHost6 = qrVar.a;
                                iCarHost6.getClass();
                                return IMediaPlaybackHost.Stub.asInterface(iCarHost6.getHost("media_playback"));
                            }
                        });
                        this.f = iMediaPlaybackHost2;
                        return iMediaPlaybackHost2;
                    }
                    break;
                case 1862666772:
                    if (str.equals("navigation")) {
                        INavigationHost iNavigationHost = this.d;
                        if (iNavigationHost != null) {
                            return iNavigationHost;
                        }
                        final int i5 = 4;
                        INavigationHost iNavigationHost2 = (INavigationHost) tr.a("getHost(Navigation)", new xz(this) { // from class: qq
                            public final /* synthetic */ qr a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.xz
                            public final Object a() {
                                int i22 = i5;
                                if (i22 == 0) {
                                    ICarHost iCarHost2 = this.a.a;
                                    iCarHost2.getClass();
                                    return IConstraintHost.Stub.asInterface(iCarHost2.getHost("constraints"));
                                }
                                if (i22 == 1) {
                                    ICarHost iCarHost3 = this.a.a;
                                    iCarHost3.getClass();
                                    return IAppHost.Stub.asInterface(iCarHost3.getHost(CloudRecognizerProtocolStrings.APP));
                                }
                                if (i22 == 2) {
                                    ICarHost iCarHost4 = this.a.a;
                                    iCarHost4.getClass();
                                    return ISuggestionHost.Stub.asInterface(iCarHost4.getHost("suggestion"));
                                }
                                qr qrVar = this.a;
                                if (i22 != 3) {
                                    ICarHost iCarHost5 = qrVar.a;
                                    iCarHost5.getClass();
                                    return INavigationHost.Stub.asInterface(iCarHost5.getHost("navigation"));
                                }
                                ICarHost iCarHost6 = qrVar.a;
                                iCarHost6.getClass();
                                return IMediaPlaybackHost.Stub.asInterface(iCarHost6.getHost("media_playback"));
                            }
                        });
                        this.d = iNavigationHost2;
                        return iNavigationHost2;
                    }
                    break;
            }
            throw new InvalidParameterException(a.bz(str, "Invalid host type: "));
        } catch (qs unused) {
            Log.e("CarApp.Dispatch", "Host threw an exception when attempting to retrieve host service");
            return null;
        }
    }

    public final Object b(String str, String str2, qo qoVar) throws RemoteException {
        return tr.a(str2, new qp(this, str, str2, qoVar, 0));
    }

    public final void c(String str, String str2, qo qoVar) {
        tr.e(str2, new qp(this, str, str2, qoVar, 1));
    }

    public final void d() {
        yj.a();
        this.a = null;
        this.b = null;
        this.d = null;
    }
}
