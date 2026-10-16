package com.google.android.libraries.auto.template.icons.proxy;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import defpackage.afck;
import defpackage.afco;
import defpackage.affa;
import defpackage.ahnc;
import defpackage.ahni;
import defpackage.aitu;
import defpackage.aitx;
import defpackage.aium;
import defpackage.aiwh;
import defpackage.ajdk;
import defpackage.duq;
import defpackage.gqj;
import defpackage.tkh;
import defpackage.tkk;
import defpackage.tkm;
import defpackage.yob;
import java.io.IOException;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineExceptionHandler;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u0015¨\u0006\u0016"}, d2 = {"Lcom/google/android/libraries/auto/template/icons/proxy/ProxyContentProvider;", "Landroidx/core/content/FileProvider;", "context", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "registrarIconFactory", "Lcom/google/android/libraries/auto/template/icons/proxy/RegistrarIconFactory;", "openFile", "Landroid/os/ParcelFileDescriptor;", "uri", "Landroid/net/Uri;", "mode", "", "onCreate", "", "writeBitmapBlocking", "", "writeDescriptor", "Companion", "java.com.google.android.libraries.auto.template.icons.proxy_proxy"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProxyContentProvider extends duq {
    public static final yob a = yob.c("com/google/android/libraries/auto/template/icons/proxy/ProxyContentProvider");
    private static final CoroutineExceptionHandler c = new tkh(CoroutineExceptionHandler.c, 0);
    public tkm b;
    private final aitx d;

    public ProxyContentProvider() {
        aitu aituVar = aium.a;
        afco afcoVarPlus = ajdk.a.plus(c);
        afcoVarPlus.getClass();
        this.d = ahni.b(affa.w(new aiwh(null), afcoVarPlus));
    }

    @Override // defpackage.duq, android.content.ContentProvider
    public final boolean onCreate() {
        tkk tkkVar = tkm.a;
        Context context = getContext();
        context.getClass();
        this.b = tkkVar.a(context);
        return true;
    }

    @Override // defpackage.duq, android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws IOException {
        uri.getClass();
        str.getClass();
        ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
        parcelFileDescriptorArrCreatePipe.getClass();
        ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
        ahnc.d(this.d, null, 0, new gqj(this, uri, parcelFileDescriptorArrCreatePipe[1], (afck) null, 6), 3);
        parcelFileDescriptor.getClass();
        return parcelFileDescriptor;
    }
}
