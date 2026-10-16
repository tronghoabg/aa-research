package com.google.android.libraries.auto.template.icons.proxy;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u0015¨\u0006\u0016"}, d2 = {"Lcom/google/android/libraries/auto/template/icons/proxy/ProxyContentProvider;", "Landroidx/core/content/FileProvider;", "context", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "registrarIconFactory", "Lcom/google/android/libraries/auto/template/icons/proxy/RegistrarIconFactory;", "openFile", "Landroid/os/ParcelFileDescriptor;", "uri", "Landroid/net/Uri;", "mode", "", "onCreate", "", "writeBitmapBlocking", "", "writeDescriptor", "Companion", "java.com.google.android.libraries.auto.template.icons.proxy_proxy"}, k = 1, mv = {defpackage.eie.FLOAT_FIELD_NUMBER, defpackage.eie.LONG_FIELD_NUMBER, defpackage.abnt.b}, xi = 48)
public final class ProxyContentProvider extends defpackage.dux {
    public static final defpackage.ypg a = defpackage.ypg.c("com/google/android/libraries/auto/template/icons/proxy/ProxyContentProvider");
    private static final kotlinx.coroutines.CoroutineExceptionHandler c = new defpackage.tle(kotlinx.coroutines.CoroutineExceptionHandler.c, 0);
    public defpackage.tlj b;
    private final aiuw d;

    public ProxyContentProvider() {
        aiut aiutVar = aivl.a;
        defpackage.afdo afdoVarPlus = ajek.a.plus(c);
        afdoVarPlus.getClass();
        this.d = ahoi.b(defpackage.afga.w(new aixg((aiwg) null), afdoVarPlus));
    }

    @Override // defpackage.dux, android.content.ContentProvider
    public final boolean onCreate() {
        defpackage.tlh tlhVar = defpackage.tlj.a;
        android.content.Context context = getContext();
        context.getClass();
        this.b = tlhVar.a(context);
        return true;
    }

    @Override // defpackage.dux, android.content.ContentProvider
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) throws java.io.IOException {
        uri.getClass();
        str.getClass();
        android.os.ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = android.os.ParcelFileDescriptor.createPipe();
        parcelFileDescriptorArrCreatePipe.getClass();
        android.os.ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
        ahoc.d(this.d, (defpackage.afdo) null, 0, new gqt(this, uri, parcelFileDescriptorArrCreatePipe[1], (defpackage.afdk) null, 6), 3);
        parcelFileDescriptor.getClass();
        return parcelFileDescriptor;
    }
}
