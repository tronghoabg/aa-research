package com.google.android.apps.auto.components.demand.audio;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.jqw;
import defpackage.kxe;
import defpackage.lah;
import defpackage.lgv;
import defpackage.mki;
import defpackage.sk;
import defpackage.wer;
import defpackage.ype;
import defpackage.yph;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public class GhMicrophoneContentProvider extends ContentProvider {
    public static final yph a = yph.c("GH.MicContentProv");
    public static GhMicrophoneContentProvider b;
    public String c;
    public kxe d;

    public static GhMicrophoneContentProvider a() {
        return (GhMicrophoneContentProvider) mki.a.b(GhMicrophoneContentProvider.class, new jqw(13));
    }

    public final void b() {
        this.c = null;
        kxe kxeVar = this.d;
        if (kxeVar == null || !kxeVar.d()) {
            return;
        }
        ((ype) ((ype) a.f()).ai((char) 3465)).u("stopRecording");
        kxeVar.b();
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        if ("/mic".equals(uri.getPath())) {
            return sk.AUDIO_CONTENT_MIME;
        }
        throw new IllegalArgumentException("Unknown URI: ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        ((ype) a.l().ai((char) 3458)).u("onCreate");
        b = this;
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.content.ContentProvider
    @ResultIgnorabilityUnspecified
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 3459)).u("openFile()");
        kxe kxeVar = this.d;
        String callingPackage = getCallingPackage();
        String queryParameter = uri.getQueryParameter("mic_owner_package_key");
        if (callingPackage == null) {
            ((ype) ((ype) yphVar.g()).ai((char) 3462)).u("Calling package not identifiable in GhMicrophoneContentProvider");
            return null;
        }
        if (!lgv.c().o(callingPackage)) {
            throw new SecurityException("Calling package is not allowed: ".concat(callingPackage));
        }
        Context context = getContext();
        if (context == null) {
            throw new SecurityException("Content provider context not initialized.");
        }
        if (context.checkPermission("android.permission.RECORD_AUDIO", Binder.getCallingPid(), Binder.getCallingUid()) != 0) {
            throw new SecurityException("Calling package does not have microphone permission: ".concat(callingPackage));
        }
        if (queryParameter != null) {
            this.c = queryParameter;
        } else {
            this.c = callingPackage;
        }
        kxeVar.getClass();
        lah lahVarA = lah.a();
        wer.f(lahVarA.c);
        lahVarA.h(23, null);
        if (kxeVar.d()) {
            b();
            ((ype) yphVar.l().ai((char) 3461)).u("Recording stopped new recording started.");
        }
        try {
            return kxeVar.a();
        } catch (IOException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 3460)).u("Error creating audio pipe.");
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
