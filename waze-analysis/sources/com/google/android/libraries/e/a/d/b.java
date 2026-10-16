package com.google.android.libraries.e.a.d;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class b implements a {
    protected Uri a(Uri uri) {
        throw null;
    }

    protected abstract a c();

    @Override // com.google.android.libraries.e.a.d.a
    public /* synthetic */ File d(Uri uri) {
        throw null;
    }

    @Override // com.google.android.libraries.e.a.d.a
    public InputStream e(Uri uri) {
        throw null;
    }

    @Override // com.google.android.libraries.e.a.d.a
    public boolean g(Uri uri) {
        throw null;
    }

    @Override // com.google.android.libraries.e.a.d.a
    public final OutputStream j(Uri uri) {
        return c().j(a(uri));
    }

    @Override // com.google.android.libraries.e.a.d.a
    public final void k(Uri uri) {
        c().k(a(uri));
    }

    @Override // com.google.android.libraries.e.a.d.a
    public final void l(Uri uri, Uri uri2) {
        c().l(a(uri), a(uri2));
    }
}
