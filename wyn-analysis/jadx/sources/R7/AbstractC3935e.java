package r7;

import E.C0421k;
import E.F;
import E.L;
import E.M;
import E.V;
import E.x;
import E0.l;
import Jd.j;
import K.AbstractC0682g;
import K.C0680e;
import K.t;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import R8.p;
import R8.s;
import Va.M6;
import Va.X7;
import W9.r;
import Z.k;
import a.AbstractC1304a;
import a1.C1315e;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.YuvImage;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import ba.C1521a;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.moloco.sdk.internal.publisher.C1915d;
import com.moloco.sdk.internal.publisher.H;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C2041b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C2042c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C2043d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.N;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.P;
import com.wynauto.wyn.R;
import e0.C2465q;
import e0.z;
import ef.InterfaceC2525i;
import ff.AbstractC2641B;
import ff.m;
import ff.o;
import ff.v;
import ff.w;
import gf.C2755b;
import h0.AbstractC2765c;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import j1.AbstractC3076d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import jf.InterfaceC3103c;
import kd.C3306b;
import kd.C3319o;
import kotlin.jvm.internal.AbstractC3340k;
import n1.ActionModeCallbackC3574h;
import p7.AbstractC3772b;
import q.Y;
import r7.AbstractC3935e;
import uc.InterfaceC4265b;
import uc.InterfaceC4269f;
import uc.InterfaceC4277n;
import z0.q;

/* renamed from: r7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3935e {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f44537a;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f44538b;

    public AbstractC3935e() {
        new ConcurrentHashMap();
    }

    public static i1.c A(Y y10) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            return new i1.c(Y0.c.m(y10));
        }
        TextPaint textPaint = new TextPaint(y10.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = y10.getBreakStrategy();
        int hyphenationFrequency = y10.getHyphenationFrequency();
        if (y10.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i5 < 28 || (y10.getInputType() & 15) != 3) {
                boolean z2 = y10.getLayoutDirection() == 1;
                switch (y10.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z2) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(Y0.c.c(Y0.a.d(y10.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new i1.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static void B(Context context) {
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (AbstractC2641B.w(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        boolean z2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        if (Build.VERSION.SDK_INT < 29) {
            Tasks.forResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        new r(context, z2, taskCompletionSource, 0).run();
        taskCompletionSource.getTask();
    }

    public static List C(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC3340k.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static List D(Object... elements) {
        AbstractC3340k.e(elements, "elements");
        return elements.length > 0 ? m.c0(elements) : v.f35432a;
    }

    public static List E(Object obj) {
        return obj != null ? C(obj) : v.f35432a;
    }

    public static final k F(C0740o c0740o, k modifier) {
        AbstractC3340k.e(c0740o, "<this>");
        AbstractC3340k.e(modifier, "modifier");
        if (modifier.v()) {
            return modifier;
        }
        c0740o.M(1219399079);
        k kVar = (k) modifier.p(Z.i.f16922a, new C0421k(c0740o, 4));
        c0740o.p(false);
        return kVar;
    }

    public static ArrayList G(Object... elements) {
        AbstractC3340k.e(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new ff.k(elements, true));
    }

    public static void H(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final List I(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : C(list.get(0)) : v.f35432a;
    }

    public static final void J(InterfaceC2525i interfaceC2525i, String str, int i5, int i10, String str2) {
        String strO = O(i5, i10, str);
        if (strO.length() == 0) {
            return;
        }
        ((ArrayList) interfaceC2525i.getValue()).add(new j(strO, str2));
    }

    public static void K(FlutterError flutterError) {
        N8.c cVarA = N8.c.a();
        StringBuilder sb2 = new StringBuilder("Recorded on-demand fatal events: ");
        s sVar = cVarA.f8600a;
        S3.s sVar2 = sVar.f10512c;
        sb2.append(((AtomicInteger) sVar2.f11009b).get());
        String string = sb2.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
        String str = "Dropped on-demand fatal events: " + ((AtomicInteger) sVar2.f11010c).get();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        sVar.f10524p.f11034a.b(new p(sVar, flutterError, 1));
    }

    public static void L(TextView textView, int i5) {
        AbstractC3076d.c(i5);
        if (Build.VERSION.SDK_INT >= 28) {
            Y0.c.p(textView, i5);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i5 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), i5 + i10, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void M(TextView textView, int i5) {
        AbstractC3076d.c(i5);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i5 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i5 - i10);
        }
    }

    public static void N(InterfaceC4269f binaryMessenger, final C3319o c3319o) {
        C8.i iVar;
        AbstractC3340k.e(binaryMessenger, "binaryMessenger");
        InterfaceC4277n c3306b = (c3319o == null || (iVar = c3319o.f39682a) == null) ? new C3306b() : iVar.q();
        Object obj = null;
        X7 x72 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedBy");
        if (c3319o != null) {
            final int i5 = 0;
            x72.n(new InterfaceC4265b() { // from class: kd.B
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    C3319o c3319o2 = c3319o;
                    switch (i5) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c3319o2.getClass();
                                listD = AbstractC3935e.C(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                if (th instanceof C3305a) {
                                    C3305a c3305a = th;
                                    listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                                } else {
                                    listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            c1521a.c(listD);
                            break;
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c3319o2.getClass();
                                listD2 = AbstractC3935e.C(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                if (th2 instanceof C3305a) {
                                    C3305a c3305a2 = th2;
                                    listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                                } else {
                                    listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            c1521a.c(listD2);
                            break;
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c3319o2.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listD3 = AbstractC3935e.C(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C3305a) {
                                    C3305a c3305a3 = th3;
                                    listD3 = AbstractC3935e.D(c3305a3.f39637a, c3305a3.f39638b, c3305a3.f39639c);
                                } else {
                                    listD3 = AbstractC3935e.D(th3.getClass().getSimpleName(), th3.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            c1521a.c(listD3);
                            break;
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c3319o2.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listD4 = AbstractC3935e.C(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c3319o2.f39682a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                }
                                listD5 = AbstractC3935e.C(x509Certificate);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                    }
                }
            });
        } else {
            x72.n(null);
        }
        X7 x73 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedTo");
        if (c3319o != null) {
            final int i10 = 1;
            x73.n(new InterfaceC4265b() { // from class: kd.B
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    C3319o c3319o2 = c3319o;
                    switch (i10) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c3319o2.getClass();
                                listD = AbstractC3935e.C(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                if (th instanceof C3305a) {
                                    C3305a c3305a = th;
                                    listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                                } else {
                                    listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            c1521a.c(listD);
                            break;
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c3319o2.getClass();
                                listD2 = AbstractC3935e.C(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                if (th2 instanceof C3305a) {
                                    C3305a c3305a2 = th2;
                                    listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                                } else {
                                    listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            c1521a.c(listD2);
                            break;
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c3319o2.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listD3 = AbstractC3935e.C(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C3305a) {
                                    C3305a c3305a3 = th3;
                                    listD3 = AbstractC3935e.D(c3305a3.f39637a, c3305a3.f39638b, c3305a3.f39639c);
                                } else {
                                    listD3 = AbstractC3935e.D(th3.getClass().getSimpleName(), th3.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            c1521a.c(listD3);
                            break;
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c3319o2.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listD4 = AbstractC3935e.C(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c3319o2.f39682a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                }
                                listD5 = AbstractC3935e.C(x509Certificate);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                    }
                }
            });
        } else {
            x73.n(null);
        }
        X7 x74 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotAfterMsSinceEpoch");
        if (c3319o != null) {
            final int i11 = 2;
            x74.n(new InterfaceC4265b() { // from class: kd.B
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    C3319o c3319o2 = c3319o;
                    switch (i11) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c3319o2.getClass();
                                listD = AbstractC3935e.C(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                if (th instanceof C3305a) {
                                    C3305a c3305a = th;
                                    listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                                } else {
                                    listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            c1521a.c(listD);
                            break;
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c3319o2.getClass();
                                listD2 = AbstractC3935e.C(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                if (th2 instanceof C3305a) {
                                    C3305a c3305a2 = th2;
                                    listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                                } else {
                                    listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            c1521a.c(listD2);
                            break;
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c3319o2.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listD3 = AbstractC3935e.C(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C3305a) {
                                    C3305a c3305a3 = th3;
                                    listD3 = AbstractC3935e.D(c3305a3.f39637a, c3305a3.f39638b, c3305a3.f39639c);
                                } else {
                                    listD3 = AbstractC3935e.D(th3.getClass().getSimpleName(), th3.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            c1521a.c(listD3);
                            break;
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c3319o2.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listD4 = AbstractC3935e.C(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c3319o2.f39682a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                }
                                listD5 = AbstractC3935e.C(x509Certificate);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                    }
                }
            });
        } else {
            x74.n(null);
        }
        X7 x75 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotBeforeMsSinceEpoch");
        if (c3319o != null) {
            final int i12 = 3;
            x75.n(new InterfaceC4265b() { // from class: kd.B
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    C3319o c3319o2 = c3319o;
                    switch (i12) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c3319o2.getClass();
                                listD = AbstractC3935e.C(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                if (th instanceof C3305a) {
                                    C3305a c3305a = th;
                                    listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                                } else {
                                    listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            c1521a.c(listD);
                            break;
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c3319o2.getClass();
                                listD2 = AbstractC3935e.C(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                if (th2 instanceof C3305a) {
                                    C3305a c3305a2 = th2;
                                    listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                                } else {
                                    listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            c1521a.c(listD2);
                            break;
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c3319o2.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listD3 = AbstractC3935e.C(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C3305a) {
                                    C3305a c3305a3 = th3;
                                    listD3 = AbstractC3935e.D(c3305a3.f39637a, c3305a3.f39638b, c3305a3.f39639c);
                                } else {
                                    listD3 = AbstractC3935e.D(th3.getClass().getSimpleName(), th3.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            c1521a.c(listD3);
                            break;
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c3319o2.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listD4 = AbstractC3935e.C(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c3319o2.f39682a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                }
                                listD5 = AbstractC3935e.C(x509Certificate);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                    }
                }
            });
        } else {
            x75.n(null);
        }
        X7 x76 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getX509Certificate");
        if (c3319o == null) {
            x76.n(null);
        } else {
            final int i13 = 4;
            x76.n(new InterfaceC4265b() { // from class: kd.B
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    C3319o c3319o2 = c3319o;
                    switch (i13) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c3319o2.getClass();
                                listD = AbstractC3935e.C(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                if (th instanceof C3305a) {
                                    C3305a c3305a = th;
                                    listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                                } else {
                                    listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            c1521a.c(listD);
                            break;
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c3319o2.getClass();
                                listD2 = AbstractC3935e.C(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                if (th2 instanceof C3305a) {
                                    C3305a c3305a2 = th2;
                                    listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                                } else {
                                    listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            c1521a.c(listD2);
                            break;
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c3319o2.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listD3 = AbstractC3935e.C(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C3305a) {
                                    C3305a c3305a3 = th3;
                                    listD3 = AbstractC3935e.D(c3305a3.f39637a, c3305a3.f39638b, c3305a3.f39639c);
                                } else {
                                    listD3 = AbstractC3935e.D(th3.getClass().getSimpleName(), th3.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            c1521a.c(listD3);
                            break;
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c3319o2.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listD4 = AbstractC3935e.C(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c3319o2.f39682a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                }
                                listD5 = AbstractC3935e.C(x509Certificate);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                    }
                }
            });
        }
    }

    public static final String O(int i5, int i10, String str) {
        String strSubstring = str.substring(i5, i10);
        AbstractC3340k.d(strSubstring, "substring(...)");
        return Bf.k.V0(strSubstring).toString();
    }

    public static void P() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final SpannableString Q(z0.b bVar, L0.b bVar2, E0.e fontFamilyResolver) {
        L0.b density = bVar2;
        AbstractC3340k.e(density, "density");
        AbstractC3340k.e(fontFamilyResolver, "fontFamilyResolver");
        String str = bVar.f48269a;
        SpannableString spannableString = new SpannableString(str);
        List list = bVar.f48270b;
        int size = list.size();
        int i5 = 0;
        while (i5 < size) {
            z0.a aVar = (z0.a) list.get(i5);
            z0.j jVar = (z0.j) aVar.f48265a;
            long jA = jVar.f48300a.a();
            K0.g bVar3 = jVar.f48300a;
            if (!C2465q.b(jA, bVar3.a())) {
                bVar3 = jA != C2465q.f34380i ? new K0.b(jA) : K0.f.f6318a;
            }
            long jA2 = bVar3.a();
            int i10 = aVar.f48266b;
            int i11 = aVar.f48267c;
            xg.g.P(spannableString, jA2, i10, i11);
            xg.g.Q(spannableString, jVar.f48301b, density, i10, i11);
            l lVar = jVar.f48302c;
            E0.j jVar2 = jVar.f48303d;
            if (lVar != null || jVar2 != null) {
                if (lVar == null) {
                    lVar = l.f2798d;
                }
                spannableString.setSpan(new StyleSpan(tg.b.z(lVar, jVar2 != null ? jVar2.f2794a : 0)), i10, i11, 33);
            }
            K0.d dVar = jVar.f48311m;
            if (dVar != null) {
                int i12 = dVar.f6316a;
                if ((i12 | 1) == i12) {
                    spannableString.setSpan(new UnderlineSpan(), i10, i11, 33);
                }
                if ((i12 | 2) == i12) {
                    spannableString.setSpan(new StrikethroughSpan(), i10, i11, 33);
                }
            }
            K0.h hVar = jVar.f48309j;
            if (hVar != null) {
                spannableString.setSpan(new ScaleXSpan(hVar.f6320a), i10, i11, 33);
            }
            xg.g.R(spannableString, jVar.k, i10, i11);
            long j8 = C2465q.f34380i;
            long j10 = jVar.f48310l;
            if (j10 != j8) {
                xg.g.S(spannableString, new BackgroundColorSpan(z.s(j10)), i10, i11);
            }
            i5++;
            density = bVar2;
        }
        int length = str.length();
        List list2 = bVar.f48272d;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Object obj = list2.get(i13);
            z0.a aVar2 = (z0.a) obj;
            if ((aVar2.f48265a instanceof q) && z0.c.b(0, length, aVar2.f48266b, aVar2.f48267c)) {
                arrayList.add(obj);
            }
        }
        int size3 = arrayList.size();
        for (int i14 = 0; i14 < size3; i14++) {
            z0.a aVar3 = (z0.a) arrayList.get(i14);
            q qVar = (q) aVar3.f48265a;
            AbstractC3340k.e(qVar, "<this>");
            qVar.getClass();
            TtsSpan ttsSpanBuild = new TtsSpan.VerbatimBuilder(null).build();
            AbstractC3340k.d(ttsSpanBuild, "builder.build()");
            spannableString.setSpan(ttsSpanBuild, aVar3.f48266b, aVar3.f48267c, 33);
        }
        return spannableString;
    }

    public static final List R(ArrayList arrayList) {
        int size = arrayList.size();
        return size != 0 ? size != 1 ? DesugarCollections.unmodifiableList(new ArrayList(arrayList)) : Collections.singletonList(o.q0(arrayList)) : v.f35432a;
    }

    public static final Map S(Map map) {
        int size = map.size();
        if (size == 0) {
            return w.f35433a;
        }
        if (size != 1) {
            return DesugarCollections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) o.p0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static ActionMode.Callback T(ActionMode.Callback callback) {
        return (!(callback instanceof ActionModeCallbackC3574h) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionModeCallbackC3574h) callback).f40785a;
    }

    public static ActionMode.Callback U(ActionMode.Callback callback, TextView textView) {
        int i5 = Build.VERSION.SDK_INT;
        return (i5 < 26 || i5 > 27 || (callback instanceof ActionModeCallbackC3574h) || callback == null) ? callback : new ActionModeCallbackC3574h(callback, textView);
    }

    public static ByteBuffer V(ByteBuffer byteBuffer) {
        int i5;
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit / 6;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iLimit);
        int i11 = 0;
        while (true) {
            i5 = i10 * 4;
            if (i11 >= i5) {
                break;
            }
            byteBufferAllocate.put(i11, byteBuffer.get(i11));
            i11++;
        }
        for (int i12 = 0; i12 < i10 + i10; i12++) {
            byteBufferAllocate.put(i5 + i12, byteBuffer.get((i12 / 2) + ((i12 % 2) * i10) + i5));
        }
        return byteBufferAllocate;
    }

    public static int W(int i5) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == i5) {
                return i11;
            }
        }
        return 1;
    }

    public static Bitmap X(Bitmap bitmap, int i5, int i10, int i11) {
        if (i5 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i10, i11);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i5);
        return Bitmap.createBitmap(bitmap, 0, 0, i10, i11, matrix, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
  0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.ClassLoader Y() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.AbstractC3935e.Y():java.lang.ClassLoader");
    }

    public static byte[] Z(int i5, int i10, byte[] bArr) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i5, i10, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, i5, i10), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (IOException e7) {
            Log.w("ImageConvertUtils", "Error closing ByteArrayOutputStream");
            throw new ua.a("Image conversion error from NV21 format", e7);
        }
    }

    public static final long a(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 76100) {
                if (iHashCode != 63085501) {
                    if (iHashCode == 347625656 && str.equals("LevelPlay")) {
                        return Fe.b.S(8, Cf.c.f2208d);
                    }
                } else if (str.equals("AdMob")) {
                    return Fe.b.S(8, Cf.c.f2208d);
                }
            } else if (str.equals("MAX")) {
                return Fe.b.S(8, Cf.c.f2208d);
            }
        }
        return Fe.b.S(60, Cf.c.f2208d);
    }

    public static final V.d b(long j8, long j10, long j11, Z.d dVar, F f10, long j12, AbstractC2765c abstractC2765c, AbstractC2765c abstractC2765c2, C0740o c0740o, int i5) {
        F f11;
        c0740o.M(447650301);
        long j13 = (i5 & 1) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31059c : j8;
        long j14 = (i5 & 2) != 0 ? j13 : j10;
        H.d dVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31061e;
        long j15 = (i5 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31060d : j11;
        Z.d dVar3 = (i5 & 16) != 0 ? Z.a.f16900a : dVar;
        if ((i5 & 32) != 0) {
            float f12 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31057a;
            f11 = new F(f12, f12, f12, f12);
        } else {
            f11 = f10;
        }
        V.d dVarB = V.e.b(c0740o, -545982054, new N(dVar3, f11, (i5 & 128) != 0 ? AbstractC2641B.H(R.drawable.ic_round_volume_off_24, c0740o) : abstractC2765c, (i5 & 256) != 0 ? AbstractC2641B.H(R.drawable.ic_round_volume_up_24, c0740o) : abstractC2765c2, (i5 & 64) != 0 ? ((C0680e) c0740o.j(AbstractC0682g.f6260a)).b() : j12, j13, j14, dVar2, j15));
        c0740o.p(false);
        return dVarB;
    }

    public static final V.d c(Z.d dVar, F f10, long j8, C0740o c0740o, int i5) {
        c0740o.M(716005120);
        if ((i5 & 1) != 0) {
            dVar = Z.a.f16907h;
        }
        if ((i5 & 2) != 0) {
            float f11 = 0;
            f10 = new F(f11, f11, f11, f11);
        }
        if ((i5 & 4) != 0) {
            j8 = ((C0680e) c0740o.j(AbstractC0682g.f6260a)).b();
        }
        V.d dVarB = V.e.b(c0740o, 1967084142, new P(dVar, f10, j8));
        c0740o.p(false);
        return dVarB;
    }

    public static final ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i8.l lVar = (i8.l) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", lVar.f36910a);
            bundle.putLong("event_timestamp", lVar.f36911b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final void e(k kVar, tf.l onClick, C0740o c0740o, int i5) {
        C0740o c0740o2;
        AbstractC3340k.e(onClick, "onClick");
        c0740o.N(1037954372);
        if ((((c0740o.e(kVar) ? 4 : 2) | i5 | (c0740o.e("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html") ? 32 : 16) | (c0740o.e(onClick) ? 256 : 128)) & 147) == 146 && c0740o.x()) {
            c0740o.I();
            c0740o2 = c0740o;
        } else {
            c0740o.M(-363689698);
            boolean zE = c0740o.e("Ad Badge");
            Object objF = c0740o.F();
            N.P p10 = C0732k.f7800a;
            if (zE || objF == p10) {
                objF = new C1915d(10);
                c0740o.U(objF);
            }
            c0740o.p(false);
            k requiredSize = Fe.g.J(kVar, false, (tf.l) objF);
            float f10 = 12;
            x xVar = L.f2700a;
            AbstractC3340k.e(requiredSize, "$this$requiredSize");
            k kVarG = requiredSize.g(new M(f10, f10, f10, f10, false));
            c0740o.M(-363682862);
            boolean zE2 = c0740o.e("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html") | c0740o.e(onClick);
            Object objF2 = c0740o.F();
            if (zE2 || objF2 == p10) {
                objF2 = new Af.q(onClick, 22);
                c0740o.U(objF2);
            }
            c0740o.p(false);
            c0740o2 = c0740o;
            t.a(AbstractC2641B.H(R.drawable.info_badge, c0740o), "Ad Badge", H.R(kVarG, null, (tf.a) objF2, 7), C2465q.f34380i, c0740o2, 3120);
        }
        C0729i0 c0729i0R = c0740o2.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new C2042c(kVar, onClick, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y r28, Z.k r29, final long r30, final tf.u r32, final tf.c r33, final tf.c r34, tf.c r35, final tf.u r36, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C2121s r37, final tf.s r38, tf.t r39, final tf.u r40, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S r41, boolean r42, N.C0740o r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.AbstractC3935e.f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y, Z.k, long, tf.u, tf.c, tf.c, tf.c, tf.u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s, tf.s, tf.t, tf.u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S, boolean, N.o, int, int):void");
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static final void h(tf.l lVar, k kVar, tf.l lVar2, C0740o c0740o, int i5) {
        int i10;
        c0740o.N(-459026854);
        if ((i5 & 6) == 0) {
            i10 = (c0740o.e(lVar) ? 4 : 2) | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            i10 |= c0740o.e(kVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i10 |= c0740o.e("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html") ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i10 |= c0740o.e(lVar2) ? 2048 : Segment.SHARE_MINIMUM;
        }
        if ((i10 & 1171) == 1170 && c0740o.x()) {
            c0740o.I();
        } else {
            AbstractC1304a.h(null, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f32411g, lVar, V.e.b(c0740o, -1810395910, new C2043d(kVar, lVar2)), c0740o, ((i10 << 6) & 896) | 3120, 1);
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new C2041b(lVar, kVar, lVar2, i5, 0);
        }
    }

    public static ArrayList i(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ff.k(objArr, true));
    }

    public static final long j(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 76100) {
                if (iHashCode != 63085501) {
                    if (iHashCode == 347625656 && str.equals("LevelPlay")) {
                        return Fe.b.S(26, Cf.c.f2208d);
                    }
                } else if (str.equals("AdMob")) {
                    return Fe.b.S(26, Cf.c.f2208d);
                }
            } else if (str.equals("MAX")) {
                return Fe.b.S(26, Cf.c.f2208d);
            }
        }
        return Fe.b.S(60, Cf.c.f2208d);
    }

    public static int k(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        AbstractC3340k.e(arrayList, "<this>");
        int size2 = arrayList.size();
        int i5 = 0;
        if (size < 0) {
            throw new IllegalArgumentException(N0.a.e("fromIndex (", 0, ") is greater than toIndex (", size, ")."));
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException(N0.a.e("toIndex (", size, ") is greater than size (", size2, ")."));
        }
        int i10 = size - 1;
        while (i5 <= i10) {
            int i11 = (i5 + i10) >>> 1;
            int iW = android.support.v4.media.session.b.W((Comparable) arrayList.get(i11), comparable);
            if (iW < 0) {
                i5 = i11 + 1;
            } else {
                if (iW <= 0) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return -(i5 + 1);
    }

    public static C2755b l(C2755b c2755b) {
        c2755b.g();
        c2755b.f35885c = true;
        return c2755b.f35884b > 0 ? c2755b : C2755b.f35882d;
    }

    public static final void m(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                Fe.b.d(th, th2);
            }
        }
    }

    public static final k n(k kVar, tf.q qVar) {
        AbstractC3340k.e(kVar, "<this>");
        return kVar.g(new Z.g(qVar));
    }

    public static C2755b t() {
        return new C2755b(10);
    }

    public static final String u(CharsetDecoder charsetDecoder, Pf.i iVar) {
        AbstractC3340k.e(charsetDecoder, "<this>");
        StringBuilder sb2 = new StringBuilder((int) Math.min(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, iVar.getBuffer().f9456c));
        Charset charset = charsetDecoder.charset();
        AbstractC3340k.b(charset);
        if (charset.equals(Bf.a.f1670a)) {
            sb2.append((CharSequence) Pf.j.g(iVar));
        } else {
            Fe.b.C(iVar);
            byte[] bArrF = Pf.j.f(iVar, -1);
            Charset charset2 = charsetDecoder.charset();
            AbstractC3340k.b(charset2);
            sb2.append((CharSequence) new String(bArrF, charset2));
        }
        return sb2.toString();
    }

    public static final void v(InterfaceC3103c interfaceC3103c, Throwable th) {
        if (th instanceof Ef.N) {
            th = ((Ef.N) th).f3687a;
        }
        interfaceC3103c.resumeWith(Fe.e.z(th));
        throw th;
    }

    public static final k w(k kVar) {
        AbstractC3340k.e(kVar, "<this>");
        return n(kVar, new V(3));
    }

    public static final Pf.a x(CharsetEncoder charsetEncoder, String input, int i5, int i10) {
        AbstractC3340k.e(input, "input");
        Pf.a aVar = new Pf.a();
        if (i5 < i10) {
            do {
                byte[] bArrR = AbstractC3772b.r(charsetEncoder, input, i5, i10);
                aVar.w(bArrR.length, bArrR);
                int length = bArrR.length;
                if (length < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                i5 += length;
            } while (i5 < i10);
        }
        return aVar;
    }

    public static int z(List list) {
        AbstractC3340k.e(list, "<this>");
        return list.size() - 1;
    }

    public abstract Typeface o(Context context, C1315e c1315e, Resources resources, int i5);

    public abstract Typeface p(Context context, h1.i[] iVarArr, int i5);

    public Typeface q(Context context, List list, int i5) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface r(Context context, InputStream inputStream) {
        File fileY = AbstractC2641B.y(context);
        if (fileY == null) {
            return null;
        }
        try {
            if (AbstractC2641B.m(fileY, inputStream)) {
                return Typeface.createFromFile(fileY.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileY.delete();
        }
    }

    public Typeface s(Context context, Resources resources, int i5, String str, int i10) {
        File fileY = AbstractC2641B.y(context);
        if (fileY == null) {
            return null;
        }
        try {
            if (AbstractC2641B.l(fileY, resources, i5)) {
                return Typeface.createFromFile(fileY.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileY.delete();
        }
    }

    public h1.i y(h1.i[] iVarArr, int i5) {
        new ae.d(1);
        int i10 = (i5 & 1) == 0 ? 400 : 700;
        boolean z2 = (i5 & 2) != 0;
        h1.i iVar = null;
        int i11 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (h1.i iVar2 : iVarArr) {
            int iAbs = (Math.abs(iVar2.f35960c - i10) * 2) + (iVar2.f35961d == z2 ? 0 : 1);
            if (iVar == null || i11 > iAbs) {
                iVar = iVar2;
                i11 = iAbs;
            }
        }
        return iVar;
    }
}
