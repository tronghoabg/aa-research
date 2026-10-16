package defpackage;

import android.os.Build;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import java.io.Serializable;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class ebh {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i) {
        view.setImportantForAutofill(8);
    }

    public static boolean c(View view) {
        return view.restoreDefaultFocus();
    }

    public static void d(Window window, boolean z) {
        int i;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 35) {
            window.setDecorFitsSystemWindows(z);
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
            return;
        }
        View decorView2 = window.getDecorView();
        int systemUiVisibility2 = decorView2.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility2 & (-257);
            z2 = true;
        } else {
            i = systemUiVisibility2 | 256;
            z2 = false;
        }
        decorView2.setSystemUiVisibility(i);
        window.setDecorFitsSystemWindows(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(java.io.File r4, defpackage.afec r5, defpackage.afck r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.egm
            if (r0 == 0) goto L13
            r0 = r6
            egm r0 = (defpackage.egm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            egm r0 = new egm
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.a
            defpackage.woy.dF(r6)     // Catch: java.io.IOException -> L29
            return r6
        L29:
            r5 = move-exception
            goto L42
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.woy.dF(r6)
            r0.a = r4     // Catch: java.io.IOException -> L29
            r0.c = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r4 = r5.invoke(r0)     // Catch: java.io.IOException -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            return r4
        L42:
            boolean r6 = r5 instanceof defpackage.eeq
            if (r6 != 0) goto La8
            r4.getClass()
            java.io.File r4 = (java.io.File) r4
            boolean r6 = r4.exists()
            if (r6 == 0) goto La3
            boolean r6 = r4.isFile()
            if (r6 == 0) goto L7d
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L6d
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L68
            java.io.IOException r4 = defpackage.dsy.e(r4, r5)
            goto La7
        L68:
            java.io.IOException r4 = defpackage.dsy.e(r4, r5)
            goto La7
        L6d:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L78
            java.io.IOException r4 = defpackage.dsy.e(r4, r5)
            goto La7
        L78:
            java.io.IOException r4 = defpackage.dsy.e(r4, r5)
            goto La7
        L7d:
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L93
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L8e
            java.io.IOException r4 = defpackage.dsy.e(r4, r5)
            goto La7
        L8e:
            java.io.IOException r4 = defpackage.dsy.e(r4, r5)
            goto La7
        L93:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L9e
            java.io.IOException r4 = defpackage.dsy.e(r4, r5)
            goto La7
        L9e:
            java.io.IOException r4 = defpackage.dsy.e(r4, r5)
            goto La7
        La3:
            java.io.IOException r4 = defpackage.dsy.e(r4, r5)
        La7:
            throw r4
        La8:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebh.e(java.io.File, afec, afck):java.lang.Object");
    }

    public static final boolean g(String str) {
        return str != null && str.length() > 0;
    }

    public static final String h(Class cls) {
        cls.getClass();
        Map map = evq.a;
        String strA = (String) map.get(cls);
        if (strA == null) {
            evo evoVar = (evo) cls.getAnnotation(evo.class);
            strA = evoVar != null ? evoVar.a() : null;
            if (!g(strA)) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(String.valueOf(cls.getSimpleName())));
            }
            map.put(cls, strA);
        }
        strA.getClass();
        return strA;
    }

    public static final euu i(View view) {
        euu euuVar = (euu) afrg.h(afrg.r(afrg.f(view, new dmw(18)), new dmw(19)));
        if (euuVar != null) {
            return euuVar;
        }
        throw new IllegalStateException(a.bm(view, "View ", " does not have a NavController set"));
    }

    public static final evm j(String str, String str2) throws ClassNotFoundException {
        String strSubstring;
        evm evmVar = evm.a;
        evm evkVar = null;
        if (!affa.f("integer", str)) {
            evmVar = evm.c;
            if (!affa.f("integer[]", str)) {
                evmVar = evm.d;
                if (!affa.f("List<Int>", str)) {
                    evmVar = evm.e;
                    if (!affa.f("long", str)) {
                        evmVar = evm.f;
                        if (!affa.f("long[]", str)) {
                            evmVar = evm.g;
                            if (!affa.f("List<Long>", str)) {
                                evmVar = evm.k;
                                if (!affa.f("boolean", str)) {
                                    evmVar = evm.l;
                                    if (!affa.f("boolean[]", str)) {
                                        evmVar = evm.m;
                                        if (!affa.f("List<Boolean>", str)) {
                                            evmVar = evm.n;
                                            if (!affa.f("string", str)) {
                                                evmVar = evm.o;
                                                if (!affa.f("string[]", str)) {
                                                    evmVar = evm.p;
                                                    if (!affa.f("List<String>", str)) {
                                                        evmVar = evm.h;
                                                        if (!affa.f("float", str)) {
                                                            evmVar = evm.i;
                                                            if (!affa.f("float[]", str)) {
                                                                evmVar = evm.j;
                                                                if (!affa.f("List<Float>", str)) {
                                                                    evmVar = null;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (evmVar != null) {
            return evmVar;
        }
        evm evmVar2 = evm.b;
        if (affa.f("reference", str)) {
            return evmVar2;
        }
        if (str.length() == 0) {
            return evm.n;
        }
        try {
            if (!str.startsWith(".") || str2 == null) {
                strSubstring = str;
            } else {
                strSubstring = str2 + str;
            }
            boolean zEndsWith = str.endsWith("[]");
            if (zEndsWith) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                strSubstring.getClass();
            }
            Class<?> cls = Class.forName(strSubstring);
            cls.getClass();
            if (Parcelable.class.isAssignableFrom(cls)) {
                evkVar = zEndsWith ? new evi(cls) : new evj(cls);
            } else if (Enum.class.isAssignableFrom(cls) && !zEndsWith) {
                evkVar = new evh(cls);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                evkVar = zEndsWith ? new evk(cls) : new evl(cls);
            }
            if (evkVar != null) {
                return evkVar;
            }
            throw new IllegalArgumentException(((Object) strSubstring) + " is not Serializable or Parcelable.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static final evm k(TypedValue typedValue, evm evmVar, evm evmVar2, String str, String str2) throws XmlPullParserException {
        if (evmVar == null || evmVar == evmVar2) {
            return evmVar == null ? evmVar2 : evmVar;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0080 -> B:24:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0083 -> B:24:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.List r6, defpackage.efd r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.eev
            if (r0 == 0) goto L13
            r0 = r8
            eev r0 = (defpackage.eev) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            eev r0 = new eev
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r5 = r0.c
            afcr r8 = defpackage.afcr.a
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L39
            if (r1 != r3) goto L31
            java.lang.Object r6 = r0.b
            affv r7 = r0.e
            defpackage.woy.dF(r5)     // Catch: java.lang.Throwable -> L2f
            goto L61
        L2f:
            r5 = move-exception
            goto L7c
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            java.lang.Object r6 = r0.a
            defpackage.woy.dF(r5)
            goto L57
        L3f:
            defpackage.woy.dF(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            eex r1 = new eex
            r1.<init>(r6, r5, r2)
            r0.a = r5
            r0.d = r4
            java.lang.Object r6 = r7.a(r1, r0)
            if (r6 == r8) goto L93
            r6 = r5
        L57:
            affv r5 = new affv
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
            r7 = r5
        L61:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L89
            java.lang.Object r5 = r6.next()
            afec r5 = (defpackage.afec) r5
            r0.a = r2     // Catch: java.lang.Throwable -> L2f
            r0.e = r7     // Catch: java.lang.Throwable -> L2f
            r0.b = r6     // Catch: java.lang.Throwable -> L2f
            r0.d = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            if (r5 != r8) goto L61
            goto L93
        L7c:
            java.lang.Object r1 = r7.a
            if (r1 != 0) goto L83
            r7.a = r5
            goto L61
        L83:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            defpackage.adqs.y(r1, r5)
            goto L61
        L89:
            java.lang.Object r5 = r7.a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 != 0) goto L92
            afak r5 = defpackage.afak.a
            return r5
        L92:
            throw r5
        L93:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebh.f(java.util.List, efd, afck):java.lang.Object");
    }
}
