package com.google.android.apps.auto.components.demand.audio;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class GhMicrophoneContentProvider extends android.content.ContentProvider {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.MicContentProv");
    public static com.google.android.apps.auto.components.demand.audio.GhMicrophoneContentProvider b;
    public java.lang.String c;
    public defpackage.kxl d;

    public static com.google.android.apps.auto.components.demand.audio.GhMicrophoneContentProvider a() {
        return (com.google.android.apps.auto.components.demand.audio.GhMicrophoneContentProvider) defpackage.mkp.a.b(com.google.android.apps.auto.components.demand.audio.GhMicrophoneContentProvider.class, new defpackage.jqx(13));
    }

    public final void b() {
        this.c = null;
        defpackage.kxl kxlVar = this.d;
        if (kxlVar == null || !kxlVar.d()) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3468)).u("stopRecording");
        kxlVar.b();
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        if ("/mic".equals(uri.getPath())) {
            return "audio/l16";
        }
        throw new java.lang.IllegalArgumentException("Unknown URI: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        ((defpackage.yqj) a.l().ai((char) 3461)).u("onCreate");
        b = this;
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.content.ContentProvider
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) throws java.io.FileNotFoundException {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3462)).u("openFile()");
        defpackage.kxl kxlVar = this.d;
        java.lang.String callingPackage = getCallingPackage();
        java.lang.String queryParameter = uri.getQueryParameter("mic_owner_package_key");
        if (callingPackage == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 3465)).u("Calling package not identifiable in GhMicrophoneContentProvider");
            return null;
        }
        if (!defpackage.mdp.d().o(callingPackage)) {
            throw new java.lang.SecurityException("Calling package is not allowed: ".concat(callingPackage));
        }
        android.content.Context context = getContext();
        if (context == null) {
            throw new java.lang.SecurityException("Content provider context not initialized.");
        }
        if (context.checkPermission("android.permission.RECORD_AUDIO", android.os.Binder.getCallingPid(), android.os.Binder.getCallingUid()) != 0) {
            throw new java.lang.SecurityException("Calling package does not have microphone permission: ".concat(callingPackage));
        }
        if (queryParameter != null) {
            this.c = queryParameter;
        } else {
            this.c = callingPackage;
        }
        kxlVar.getClass();
        defpackage.lam lamVarA = defpackage.lam.a();
        defpackage.wfp.f(lamVarA.c);
        lamVarA.h(23, null);
        if (kxlVar.d()) {
            b();
            ((defpackage.yqj) yqmVar.l().ai((char) 3464)).u("Recording stopped new recording started.");
        }
        try {
            return kxlVar.a();
        } catch (java.io.IOException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 3463)).u("Error creating audio pipe.");
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException();
    }
}
