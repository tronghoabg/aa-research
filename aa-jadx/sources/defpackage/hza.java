package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hza implements defpackage.hzq {
    private final /* synthetic */ int a;
    private final java.lang.Object b;
    private final java.lang.Object c;

    public hza(android.content.Context context, defpackage.hyz hyzVar, int i) {
        this.a = i;
        this.b = context.getApplicationContext();
        this.c = hyzVar;
    }

    private final android.net.Uri c(java.lang.Integer num) {
        try {
            return android.net.Uri.parse("android.resource://" + ((android.content.res.Resources) this.b).getResourcePackageName(num.intValue()) + "/" + num);
        } catch (android.content.res.Resources.NotFoundException e) {
            if (!android.util.Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            android.util.Log.w("ResourceLoader", "Received invalid resource id: ".concat(java.lang.String.valueOf(num)), e);
            return null;
        }
    }

    @Override // defpackage.hzq
    public final /* synthetic */ boolean a(java.lang.Object obj) {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            android.net.Uri uri = (android.net.Uri) obj;
            return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
        }
        if (i != 2) {
            android.net.Uri uri2 = (android.net.Uri) obj;
            return "android.resource".equals(uri2.getScheme()) && ((android.content.Context) this.b).getPackageName().equals(uri2.getAuthority());
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [hyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17, types: [hzq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [hzq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [hzq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [hyo, java.lang.Object] */
    @Override // defpackage.hzq
    public final /* synthetic */ defpackage.ndd b(java.lang.Object obj, int i, int i2, defpackage.huw huwVar) {
        int i3 = this.a;
        if (i3 == 0) {
            java.lang.Integer num = (java.lang.Integer) obj;
            android.content.res.Resources.Theme theme = (android.content.res.Resources.Theme) huwVar.b(defpackage.icr.a);
            return new defpackage.ndd(new defpackage.ifr(num), new defpackage.hyy(theme, theme != null ? theme.getResources() : ((android.content.Context) this.b).getResources(), this.c, num.intValue()));
        }
        if (i3 == 1) {
            android.net.Uri uri = (android.net.Uri) obj;
            return new defpackage.ndd(new defpackage.ifr(uri), this.c.a((android.content.res.AssetManager) this.b, uri.toString().substring(22)));
        }
        if (i3 == 2) {
            android.net.Uri uriC = c((java.lang.Integer) obj);
            if (uriC == null) {
                return null;
            }
            return this.c.b(uriC, i, i2, huwVar);
        }
        android.net.Uri uri2 = (android.net.Uri) obj;
        java.util.List<java.lang.String> pathSegments = uri2.getPathSegments();
        if (pathSegments.size() == 1) {
            try {
                int i4 = java.lang.Integer.parseInt(uri2.getPathSegments().get(0));
                if (i4 != 0) {
                    return this.c.b(java.lang.Integer.valueOf(i4), i, i2, huwVar);
                }
                if (android.util.Log.isLoggable("ResourceUriLoader", 5)) {
                    android.util.Log.w("ResourceUriLoader", defpackage.a.bX(uri2, "Failed to parse a valid non-0 resource id from: "));
                }
                return null;
            } catch (java.lang.NumberFormatException e) {
                if (android.util.Log.isLoggable("ResourceUriLoader", 5)) {
                    android.util.Log.w("ResourceUriLoader", "Failed to parse resource id from: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri2))), e);
                }
                return null;
            }
        }
        if (pathSegments.size() != 2) {
            if (android.util.Log.isLoggable("ResourceUriLoader", 5)) {
                android.util.Log.w("ResourceUriLoader", "Failed to parse resource uri: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri2))));
            }
            return null;
        }
        java.util.List<java.lang.String> pathSegments2 = uri2.getPathSegments();
        java.lang.String str = pathSegments2.get(0);
        java.lang.String str2 = pathSegments2.get(1);
        android.content.Context context = (android.content.Context) this.b;
        int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
        if (identifier != 0) {
            return this.c.b(java.lang.Integer.valueOf(identifier), i, i2, huwVar);
        }
        if (android.util.Log.isLoggable("ResourceUriLoader", 5)) {
            android.util.Log.w("ResourceUriLoader", "Failed to find resource id for: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri2))));
        }
        return null;
    }

    public hza(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public hza(android.content.Context context, defpackage.hzq hzqVar, int i) {
        this.a = i;
        this.b = context.getApplicationContext();
        this.c = hzqVar;
    }
}
