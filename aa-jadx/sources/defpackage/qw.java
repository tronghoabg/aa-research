package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qw {
    public androidx.car.app.ICarHost a;
    private androidx.car.app.IAppHost b;
    private androidx.car.app.constraints.IConstraintHost c;
    private androidx.car.app.navigation.INavigationHost d;
    private androidx.car.app.suggestion.ISuggestionHost e;
    private androidx.car.app.media.IMediaPlaybackHost f;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    final android.os.IInterface a(java.lang.String str) throws android.os.RemoteException {
        androidx.car.app.ICarHost iCarHost = this.a;
        if (iCarHost == null) {
            android.util.Log.e("CarApp.Dispatch", "Host is not bound when attempting to retrieve host service");
            return null;
        }
        try {
            switch (str.hashCode()) {
                case -1606703562:
                    if (str.equals("constraints")) {
                        androidx.car.app.constraints.IConstraintHost iConstraintHost = this.c;
                        if (iConstraintHost != null) {
                            return iConstraintHost;
                        }
                        final int i = 0;
                        androidx.car.app.constraints.IConstraintHost iConstraintHost2 = (androidx.car.app.constraints.IConstraintHost) defpackage.tw.a("getHost(Constraints)", new defpackage.yg(this) { // from class: qv
                            public final /* synthetic */ defpackage.qw a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.yg
                            public final java.lang.Object a() {
                                int i2 = i;
                                if (i2 == 0) {
                                    androidx.car.app.ICarHost iCarHost2 = this.a.a;
                                    iCarHost2.getClass();
                                    return androidx.car.app.constraints.IConstraintHost.Stub.asInterface(iCarHost2.getHost("constraints"));
                                }
                                if (i2 == 1) {
                                    androidx.car.app.ICarHost iCarHost3 = this.a.a;
                                    iCarHost3.getClass();
                                    return androidx.car.app.IAppHost.Stub.asInterface(iCarHost3.getHost(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.APP));
                                }
                                if (i2 == 2) {
                                    androidx.car.app.ICarHost iCarHost4 = this.a.a;
                                    iCarHost4.getClass();
                                    return androidx.car.app.suggestion.ISuggestionHost.Stub.asInterface(iCarHost4.getHost("suggestion"));
                                }
                                defpackage.qw qwVar = this.a;
                                if (i2 != 3) {
                                    androidx.car.app.ICarHost iCarHost5 = qwVar.a;
                                    iCarHost5.getClass();
                                    return androidx.car.app.navigation.INavigationHost.Stub.asInterface(iCarHost5.getHost("navigation"));
                                }
                                androidx.car.app.ICarHost iCarHost6 = qwVar.a;
                                iCarHost6.getClass();
                                return androidx.car.app.media.IMediaPlaybackHost.Stub.asInterface(iCarHost6.getHost("media_playback"));
                            }
                        });
                        this.c = iConstraintHost2;
                        return iConstraintHost2;
                    }
                    break;
                case 96801:
                    if (str.equals(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.APP)) {
                        androidx.car.app.IAppHost iAppHost = this.b;
                        if (iAppHost != null) {
                            return iAppHost;
                        }
                        final int i2 = 1;
                        androidx.car.app.IAppHost iAppHost2 = (androidx.car.app.IAppHost) defpackage.tw.a("getHost(App)", new defpackage.yg(this) { // from class: qv
                            public final /* synthetic */ defpackage.qw a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.yg
                            public final java.lang.Object a() {
                                int i3 = i2;
                                if (i3 == 0) {
                                    androidx.car.app.ICarHost iCarHost2 = this.a.a;
                                    iCarHost2.getClass();
                                    return androidx.car.app.constraints.IConstraintHost.Stub.asInterface(iCarHost2.getHost("constraints"));
                                }
                                if (i3 == 1) {
                                    androidx.car.app.ICarHost iCarHost3 = this.a.a;
                                    iCarHost3.getClass();
                                    return androidx.car.app.IAppHost.Stub.asInterface(iCarHost3.getHost(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.APP));
                                }
                                if (i3 == 2) {
                                    androidx.car.app.ICarHost iCarHost4 = this.a.a;
                                    iCarHost4.getClass();
                                    return androidx.car.app.suggestion.ISuggestionHost.Stub.asInterface(iCarHost4.getHost("suggestion"));
                                }
                                defpackage.qw qwVar = this.a;
                                if (i3 != 3) {
                                    androidx.car.app.ICarHost iCarHost5 = qwVar.a;
                                    iCarHost5.getClass();
                                    return androidx.car.app.navigation.INavigationHost.Stub.asInterface(iCarHost5.getHost("navigation"));
                                }
                                androidx.car.app.ICarHost iCarHost6 = qwVar.a;
                                iCarHost6.getClass();
                                return androidx.car.app.media.IMediaPlaybackHost.Stub.asInterface(iCarHost6.getHost("media_playback"));
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
                        androidx.car.app.suggestion.ISuggestionHost iSuggestionHost = this.e;
                        if (iSuggestionHost != null) {
                            return iSuggestionHost;
                        }
                        final int i3 = 2;
                        androidx.car.app.suggestion.ISuggestionHost iSuggestionHost2 = (androidx.car.app.suggestion.ISuggestionHost) defpackage.tw.a("getHost(Suggestion)", new defpackage.yg(this) { // from class: qv
                            public final /* synthetic */ defpackage.qw a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.yg
                            public final java.lang.Object a() {
                                int i4 = i3;
                                if (i4 == 0) {
                                    androidx.car.app.ICarHost iCarHost2 = this.a.a;
                                    iCarHost2.getClass();
                                    return androidx.car.app.constraints.IConstraintHost.Stub.asInterface(iCarHost2.getHost("constraints"));
                                }
                                if (i4 == 1) {
                                    androidx.car.app.ICarHost iCarHost3 = this.a.a;
                                    iCarHost3.getClass();
                                    return androidx.car.app.IAppHost.Stub.asInterface(iCarHost3.getHost(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.APP));
                                }
                                if (i4 == 2) {
                                    androidx.car.app.ICarHost iCarHost4 = this.a.a;
                                    iCarHost4.getClass();
                                    return androidx.car.app.suggestion.ISuggestionHost.Stub.asInterface(iCarHost4.getHost("suggestion"));
                                }
                                defpackage.qw qwVar = this.a;
                                if (i4 != 3) {
                                    androidx.car.app.ICarHost iCarHost5 = qwVar.a;
                                    iCarHost5.getClass();
                                    return androidx.car.app.navigation.INavigationHost.Stub.asInterface(iCarHost5.getHost("navigation"));
                                }
                                androidx.car.app.ICarHost iCarHost6 = qwVar.a;
                                iCarHost6.getClass();
                                return androidx.car.app.media.IMediaPlaybackHost.Stub.asInterface(iCarHost6.getHost("media_playback"));
                            }
                        });
                        this.e = iSuggestionHost2;
                        return iSuggestionHost2;
                    }
                    break;
                case 1569536022:
                    if (str.equals("media_playback")) {
                        androidx.car.app.media.IMediaPlaybackHost iMediaPlaybackHost = this.f;
                        if (iMediaPlaybackHost != null) {
                            return iMediaPlaybackHost;
                        }
                        final int i4 = 3;
                        androidx.car.app.media.IMediaPlaybackHost iMediaPlaybackHost2 = (androidx.car.app.media.IMediaPlaybackHost) defpackage.tw.a("getHost(Media)", new defpackage.yg(this) { // from class: qv
                            public final /* synthetic */ defpackage.qw a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.yg
                            public final java.lang.Object a() {
                                int i5 = i4;
                                if (i5 == 0) {
                                    androidx.car.app.ICarHost iCarHost2 = this.a.a;
                                    iCarHost2.getClass();
                                    return androidx.car.app.constraints.IConstraintHost.Stub.asInterface(iCarHost2.getHost("constraints"));
                                }
                                if (i5 == 1) {
                                    androidx.car.app.ICarHost iCarHost3 = this.a.a;
                                    iCarHost3.getClass();
                                    return androidx.car.app.IAppHost.Stub.asInterface(iCarHost3.getHost(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.APP));
                                }
                                if (i5 == 2) {
                                    androidx.car.app.ICarHost iCarHost4 = this.a.a;
                                    iCarHost4.getClass();
                                    return androidx.car.app.suggestion.ISuggestionHost.Stub.asInterface(iCarHost4.getHost("suggestion"));
                                }
                                defpackage.qw qwVar = this.a;
                                if (i5 != 3) {
                                    androidx.car.app.ICarHost iCarHost5 = qwVar.a;
                                    iCarHost5.getClass();
                                    return androidx.car.app.navigation.INavigationHost.Stub.asInterface(iCarHost5.getHost("navigation"));
                                }
                                androidx.car.app.ICarHost iCarHost6 = qwVar.a;
                                iCarHost6.getClass();
                                return androidx.car.app.media.IMediaPlaybackHost.Stub.asInterface(iCarHost6.getHost("media_playback"));
                            }
                        });
                        this.f = iMediaPlaybackHost2;
                        return iMediaPlaybackHost2;
                    }
                    break;
                case 1862666772:
                    if (str.equals("navigation")) {
                        androidx.car.app.navigation.INavigationHost iNavigationHost = this.d;
                        if (iNavigationHost != null) {
                            return iNavigationHost;
                        }
                        final int i5 = 4;
                        androidx.car.app.navigation.INavigationHost iNavigationHost2 = (androidx.car.app.navigation.INavigationHost) defpackage.tw.a("getHost(Navigation)", new defpackage.yg(this) { // from class: qv
                            public final /* synthetic */ defpackage.qw a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.yg
                            public final java.lang.Object a() {
                                int i6 = i5;
                                if (i6 == 0) {
                                    androidx.car.app.ICarHost iCarHost2 = this.a.a;
                                    iCarHost2.getClass();
                                    return androidx.car.app.constraints.IConstraintHost.Stub.asInterface(iCarHost2.getHost("constraints"));
                                }
                                if (i6 == 1) {
                                    androidx.car.app.ICarHost iCarHost3 = this.a.a;
                                    iCarHost3.getClass();
                                    return androidx.car.app.IAppHost.Stub.asInterface(iCarHost3.getHost(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.APP));
                                }
                                if (i6 == 2) {
                                    androidx.car.app.ICarHost iCarHost4 = this.a.a;
                                    iCarHost4.getClass();
                                    return androidx.car.app.suggestion.ISuggestionHost.Stub.asInterface(iCarHost4.getHost("suggestion"));
                                }
                                defpackage.qw qwVar = this.a;
                                if (i6 != 3) {
                                    androidx.car.app.ICarHost iCarHost5 = qwVar.a;
                                    iCarHost5.getClass();
                                    return androidx.car.app.navigation.INavigationHost.Stub.asInterface(iCarHost5.getHost("navigation"));
                                }
                                androidx.car.app.ICarHost iCarHost6 = qwVar.a;
                                iCarHost6.getClass();
                                return androidx.car.app.media.IMediaPlaybackHost.Stub.asInterface(iCarHost6.getHost("media_playback"));
                            }
                        });
                        this.d = iNavigationHost2;
                        return iNavigationHost2;
                    }
                    break;
            }
            throw new java.security.InvalidParameterException(defpackage.a.bA(str, "Invalid host type: "));
        } catch (defpackage.qx unused) {
            android.util.Log.e("CarApp.Dispatch", "Host threw an exception when attempting to retrieve host service");
            return null;
        }
    }

    public final java.lang.Object b(java.lang.String str, java.lang.String str2, defpackage.qt qtVar) throws android.os.RemoteException {
        return defpackage.tw.a(str2, new defpackage.qu(this, str, str2, qtVar, 0));
    }

    public final void c(java.lang.String str, java.lang.String str2, defpackage.qt qtVar) {
        defpackage.tw.e(str2, new defpackage.qu(this, str, str2, qtVar, 1));
    }

    public final void d() {
        defpackage.yq.a();
        this.a = null;
        this.b = null;
        this.d = null;
    }
}
