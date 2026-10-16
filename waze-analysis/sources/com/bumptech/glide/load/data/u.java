package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class u extends q {

    /* renamed from: b, reason: collision with root package name */
    private static final UriMatcher f3492b;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f3492b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public u(ContentResolver contentResolver, Uri uri, boolean z) {
        super(contentResolver, uri, z);
    }

    private static final InputStream h(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // com.bumptech.glide.load.data.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object b(android.net.Uri r3, android.content.ContentResolver r4) throws java.io.IOException {
        /*
            r2 = this;
            android.content.UriMatcher r0 = com.bumptech.glide.load.data.u.f3492b
            int r0 = r0.match(r3)
            r1 = 1
            if (r0 == r1) goto L5a
            r1 = 3
            if (r0 == r1) goto L55
            r1 = 5
            if (r0 == r1) goto L5a
            boolean r2 = r2.f3487a
            if (r2 == 0) goto L50
            boolean r2 = com.bumptech.glide.load.n.m(r3)
            if (r2 == 0) goto L50
            boolean r2 = com.bumptech.glide.load.n.l()
            if (r2 == 0) goto L50
            android.content.res.AssetFileDescriptor r2 = com.bumptech.glide.load.n.j(r3, r4)
            if (r2 == 0) goto L3c
            java.io.FileInputStream r2 = r2.createInputStream()     // Catch: java.io.IOException -> L2a
            goto L64
        L2a:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Exception -> L2e
        L2e:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.String r4 = "Unable to create stream"
            r2.<init>(r4)
            java.lang.Throwable r2 = r2.initCause(r3)
            java.io.FileNotFoundException r2 = (java.io.FileNotFoundException) r2
            throw r2
        L3c:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "FileDescriptor is null for: "
            java.lang.String r3 = r4.concat(r3)
            r2.<init>(r3)
            throw r2
        L50:
            java.io.InputStream r2 = r4.openInputStream(r3)
            goto L64
        L55:
            java.io.InputStream r2 = h(r4, r3)
            goto L64
        L5a:
            android.net.Uri r2 = android.provider.ContactsContract.Contacts.lookupContact(r4, r3)
            if (r2 == 0) goto L7b
            java.io.InputStream r2 = h(r4, r2)
        L64:
            if (r2 == 0) goto L67
            return r2
        L67:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "InputStream is null for "
            java.lang.String r3 = r4.concat(r3)
            r2.<init>(r3)
            throw r2
        L7b:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.String r3 = "Contact cannot be found"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.u.b(android.net.Uri, android.content.ContentResolver):java.lang.Object");
    }

    @Override // com.bumptech.glide.load.data.q
    protected final /* synthetic */ void c(Object obj) throws IOException {
        ((InputStream) obj).close();
    }
}
