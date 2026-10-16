package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class adoc extends aclh {
    public static final Logger a = Logger.getLogger(adoc.class.getName());
    private static final adoa g;
    private static final Class h;
    private static final Class i;
    public final boolean b;
    public final xvi c;
    public admc d;
    public Map e;
    public final boolean f;

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(2:28|3)|(2:30|4)|11|26|12|13|16|24|17|21|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        defpackage.adoc.a.logp(java.util.logging.Level.FINE, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "loadGoogleCredentialsClass", "Failed to load GoogleCredentials", (java.lang.Throwable) r0);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        defpackage.adoc.a.logp(java.util.logging.Level.FINE, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "loadAppEngineCredentials", "AppEngineCredentials not available in classloader", (java.lang.Throwable) r0);
     */
    static {
        /*
            java.lang.Class<adoc> r0 = defpackage.adoc.class
            java.lang.String r1 = r0.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            defpackage.adoc.a = r1
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 0
            java.lang.String r2 = "xvt"
            r3 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r3, r0)     // Catch: java.lang.ClassNotFoundException -> L2f
            adoa r3 = new adoa     // Catch: java.lang.NoSuchMethodException -> L1e java.lang.ClassNotFoundException -> L20
            r3.<init>(r2, r0)     // Catch: java.lang.NoSuchMethodException -> L1e java.lang.ClassNotFoundException -> L20
            goto L30
        L1e:
            r0 = move-exception
            goto L21
        L20:
            r0 = move-exception
        L21:
            r7 = r0
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r6 = "Failed to create JWT helper. This is unexpected"
            java.util.logging.Logger r2 = defpackage.adoc.a
            java.lang.String r4 = "io.grpc.auth.GoogleAuthLibraryCallCredentials"
            java.lang.String r5 = "createJwtHelperOrNull"
            r2.logp(r3, r4, r5, r6, r7)
        L2f:
            r3 = r1
        L30:
            defpackage.adoc.g = r3
            java.lang.String r0 = "xvm"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L3f
            java.lang.Class<xvi> r2 = defpackage.xvi.class
            java.lang.Class r0 = r0.asSubclass(r2)
            goto L4f
        L3f:
            r0 = move-exception
            r7 = r0
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            java.lang.String r6 = "Failed to load GoogleCredentials"
            java.util.logging.Logger r2 = defpackage.adoc.a
            java.lang.String r4 = "io.grpc.auth.GoogleAuthLibraryCallCredentials"
            java.lang.String r5 = "loadGoogleCredentialsClass"
            r2.logp(r3, r4, r5, r6, r7)
            r0 = r1
        L4f:
            defpackage.adoc.h = r0
            java.lang.String r0 = "com.google.auth.appengine.AppEngineCredentials"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L58
            goto L67
        L58:
            r0 = move-exception
            r7 = r0
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            java.lang.String r6 = "AppEngineCredentials not available in classloader"
            java.util.logging.Logger r2 = defpackage.adoc.a
            java.lang.String r4 = "io.grpc.auth.GoogleAuthLibraryCallCredentials"
            java.lang.String r5 = "loadAppEngineCredentials"
            r2.logp(r3, r4, r5, r6, r7)
        L67:
            defpackage.adoc.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adoc.<clinit>():void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public adoc(defpackage.xvi r12) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r11 = this;
            adoa r0 = defpackage.adoc.g
            r1 = 0
            r11.<init>(r1)
            java.lang.Class r2 = defpackage.adoc.h
            r3 = 0
            if (r2 == 0) goto L10
            boolean r2 = r2.isInstance(r12)
            goto L11
        L10:
            r2 = r3
        L11:
            if (r0 == 0) goto L80
            java.lang.Class r4 = r0.a
            boolean r4 = r4.isInstance(r12)
            if (r4 != 0) goto L1d
            goto L80
        L1d:
            java.lang.Class r4 = r0.a     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L6e
            java.lang.Object r4 = r4.cast(r12)     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L6e
            xvi r4 = (defpackage.xvi) r4     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L6e
            java.lang.reflect.Method r12 = r0.d     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            java.lang.Object r12 = r12.invoke(r4, r1)     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            java.util.Collection r12 = (java.util.Collection) r12     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            int r12 = r12.size()     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            if (r12 != 0) goto L67
            java.lang.reflect.Method r12 = r0.b     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            java.lang.Object r12 = r12.invoke(r1, r1)     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            java.util.List r5 = r0.e     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
        L3f:
            boolean r6 = r5.hasNext()     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            if (r6 == 0) goto L5e
            java.lang.Object r6 = r5.next()     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            adob r6 = (defpackage.adob) r6     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            java.lang.reflect.Method r7 = r6.b     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            java.lang.reflect.Method r6 = r6.a     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            java.lang.Object r6 = r6.invoke(r4, r1)     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            r8[r3] = r6     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            r7.invoke(r12, r8)     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            goto L3f
        L5c:
            r0 = move-exception
            goto L70
        L5e:
            java.lang.reflect.Method r0 = r0.c     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            java.lang.Object r12 = r0.invoke(r12, r1)     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            xvi r12 = (defpackage.xvi) r12     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            goto L80
        L67:
            r12 = r4
            goto L80
        L69:
            r0 = move-exception
            goto L70
        L6b:
            r0 = move-exception
            r10 = r0
            goto L73
        L6e:
            r0 = move-exception
            r4 = r12
        L70:
            r12 = r0
            r10 = r12
            r12 = r4
        L73:
            java.util.logging.Logger r5 = defpackage.adoc.a
            java.util.logging.Level r6 = java.util.logging.Level.WARNING
            java.lang.String r8 = "tryServiceAccountToJwt"
            java.lang.String r9 = "Failed converting service account credential to JWT. This is unexpected"
            java.lang.String r7 = "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper"
            r5.logp(r6, r7, r8, r9, r10)
        L80:
            r11.b = r2
            r11.c = r12
            java.lang.Class r0 = defpackage.adoc.i
            if (r0 != 0) goto L8b
            r11.f = r3
            return
        L8b:
            boolean r12 = r0.isInstance(r12)
            r11.f = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adoc.<init>(xvi):void");
    }

    private static void A(URI uri) throws adnr {
        try {
            new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), -1, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw new adnr(adnq.h.e("Unable to construct service URI after removing port").d(e));
        }
    }

    public static void z(String str, admf admfVar) throws adnr {
        try {
            URI uri = new URI("https", str, "/".concat(String.valueOf(admfVar.c)), null, null);
            if (uri.getPort() == 443) {
                A(uri);
            }
        } catch (URISyntaxException e) {
            throw new adnr(adnq.h.e("Unable to construct service URI for auth").d(e));
        }
    }
}
