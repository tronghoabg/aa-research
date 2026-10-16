package androidx.startup;

/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends android.content.ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        android.content.Context context = getContext();
        if (context == null) {
            throw new defpackage.fcr();
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        if (defpackage.fcp.a == null) {
            synchronized (defpackage.fcp.b) {
                if (defpackage.fcp.a == null) {
                    defpackage.fcp.a = new defpackage.fcp(context);
                }
            }
        }
        java.lang.Class<?> cls = getClass();
        defpackage.fcp fcpVar = defpackage.fcp.a;
        try {
            android.content.Context context2 = fcpVar.e;
            android.os.Bundle bundle = context2.getPackageManager().getProviderInfo(new android.content.ComponentName(context2, cls), 128).metaData;
            java.lang.String string = context2.getString(com.google.android.projection.gearhead.R.string.androidx_startup);
            if (bundle == null) {
                return true;
            }
            try {
                java.util.HashSet hashSet = new java.util.HashSet();
                for (java.lang.String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        java.lang.Class<?> cls2 = java.lang.Class.forName(str);
                        if (defpackage.fcq.class.isAssignableFrom(cls2)) {
                            fcpVar.d.add(cls2);
                        }
                    }
                }
                java.util.Iterator it = fcpVar.d.iterator();
                while (it.hasNext()) {
                    fcpVar.a((java.lang.Class) it.next(), hashSet);
                }
                return true;
            } catch (java.lang.ClassNotFoundException e) {
                throw new defpackage.fcr(e);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            throw new defpackage.fcr(e2);
        }
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }
}
