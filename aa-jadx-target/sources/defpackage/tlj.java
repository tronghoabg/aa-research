package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tlj implements defpackage.tkv {
    public static final defpackage.tlh a = new defpackage.tlh();
    public static final defpackage.ypg b = defpackage.ypg.c("com/google/android/libraries/auto/template/icons/proxy/RegistrarIconFactory");
    public final j$.util.concurrent.ConcurrentHashMap c = new j$.util.concurrent.ConcurrentHashMap();
    private final android.content.Context d;

    public tlj(android.content.Context context) {
        this.d = context;
    }

    @Override // defpackage.tkv
    public final /* bridge */ /* synthetic */ androidx.core.graphics.drawable.IconCompat b(java.lang.Object obj) {
        tli tliVar = (tli) obj;
        tliVar.getClass();
        java.lang.String str = tliVar.a;
        java.lang.Object obj2 = this.c.get(str);
        if (obj2 == null) {
            throw new java.lang.IllegalStateException("Could not find delegate for id ".concat(str));
        }
        return ((defpackage.tkv) obj2).c(tliVar.b);
    }

    @Override // defpackage.tkv
    public final /* synthetic */ androidx.core.graphics.drawable.IconCompat c(android.net.Uri uri) {
        return defpackage.tna.m(this, uri);
    }

    @Override // defpackage.tkv
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final android.net.Uri a(tli tliVar) {
        android.net.Uri.Builder builderScheme = new android.net.Uri.Builder().scheme("content");
        defpackage.ypg ypgVar = com.google.android.libraries.auto.template.icons.proxy.ProxyContentProvider.a;
        android.net.Uri uriBuild = builderScheme.authority(java.lang.String.valueOf(this.d.getPackageName()).concat(".icons")).appendPath(tliVar.a).appendPath(tliVar.b.toString()).build();
        uriBuild.getClass();
        return uriBuild;
    }

    @Override // defpackage.tkv
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final tli d(android.net.Uri uri) {
        java.lang.String str = uri.getPathSegments().get(0);
        android.net.Uri uri2 = android.net.Uri.parse(uri.getPathSegments().get(1));
        str.getClass();
        uri2.getClass();
        return new tli(str, uri2);
    }
}
