package com.google.android.libraries.e.a.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.d.d.bi;
import com.google.d.d.bn;
import java.io.File;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends com.google.android.libraries.e.a.d.b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5811a;

    /* renamed from: d, reason: collision with root package name */
    private volatile String f5814d;

    /* renamed from: c, reason: collision with root package name */
    private final Object f5813c = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.libraries.e.a.d.a f5812b = new f(null);

    /* synthetic */ c(b bVar) {
        this.f5811a = b.a(bVar);
    }

    public static b b(Context context) {
        return new b(context);
    }

    private final boolean h(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.f5811a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    private static final void i() throws com.google.android.libraries.e.a.b.b {
        throw new com.google.android.libraries.e.a.b.b("Android backend cannot perform remote operations without a remote backend");
    }

    @Override // com.google.android.libraries.e.a.d.b
    protected final Uri a(Uri uri) throws com.google.android.libraries.e.a.b.c {
        if (h(uri)) {
            throw new com.google.android.libraries.e.a.b.c("Operation across authorities is not allowed.");
        }
        File fileD = d(uri);
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path(DomExceptionUtils.SEPARATOR);
        int i2 = bn.f7456d;
        bi biVar = new bi();
        builderPath.path(fileD.getAbsolutePath());
        return builderPath.encodedFragment(com.google.android.libraries.e.a.b.a.e.a(biVar.f())).build();
    }

    @Override // com.google.android.libraries.e.a.d.b
    protected final com.google.android.libraries.e.a.d.a c() {
        return this.f5812b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    @Override // com.google.android.libraries.e.a.d.b, com.google.android.libraries.e.a.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File d(android.net.Uri r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.e.a.a.c.d(android.net.Uri):java.io.File");
    }

    @Override // com.google.android.libraries.e.a.d.b, com.google.android.libraries.e.a.d.a
    public final InputStream e(Uri uri) throws com.google.android.libraries.e.a.b.b {
        if (!h(uri)) {
            return this.f5812b.e(a(uri));
        }
        i();
        throw null;
    }

    @Override // com.google.android.libraries.e.a.d.a
    public final String f() {
        return "android";
    }

    @Override // com.google.android.libraries.e.a.d.b, com.google.android.libraries.e.a.d.a
    public final boolean g(Uri uri) throws com.google.android.libraries.e.a.b.b {
        if (!h(uri)) {
            return this.f5812b.g(a(uri));
        }
        i();
        throw null;
    }
}
