package ff;

import Ef.C0517x;
import Ef.H;
import Ef.L0;
import Ef.N;
import Jd.C0672f;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import Va.M6;
import Va.X7;
import Wf.X;
import Wf.q0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.media.AudioDeviceInfo;
import android.media.MicrophoneInfo;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import b1.C1494c;
import ba.C1521a;
import c7.C1566b;
import c7.C1575k;
import c7.C1576l;
import com.applovin.impl.T0;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C2051l;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import ef.C2515C;
import ef.C2527k;
import ff.AbstractC2641B;
import j1.AbstractC3076d;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import ka.AbstractC3230e0;
import kd.C3306b;
import kd.C3316l;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.K;
import kotlinx.serialization.KSerializer;
import lf.AbstractC3462a;
import org.apache.tika.metadata.HttpHeaders;
import p7.AbstractC3772b;
import q.p1;
import q.r1;
import r7.AbstractC3935e;
import uc.InterfaceC4265b;
import uc.InterfaceC4269f;
import uc.InterfaceC4277n;
import y1.C4521b;
import y1.C4529j;
import y1.C4530k;

/* renamed from: ff.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2641B {

    /* renamed from: a, reason: collision with root package name */
    public static volatile F6.r f35404a;

    public static boolean A(Context context, ComponentName componentName) {
        return B(context, p().setComponent(componentName));
    }

    public static boolean B(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    public static boolean C(Context context, String str) {
        return B(context, p().setAction(str));
    }

    public static int D(int i5) {
        return i5 < 0 ? i5 : i5 < 3 ? i5 + 1 : i5 < 1073741824 ? (int) ((i5 / 0.75f) + 1.0f) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public static Map E(C2527k pair) {
        AbstractC3340k.e(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.f34671a, pair.f34672b);
        AbstractC3340k.d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static MappedByteBuffer F(Context context, Uri uri) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final a2.v G(tf.a defaultFactory) {
        AbstractC3340k.e(defaultFactory, "defaultFactory");
        return new a2.v(defaultFactory);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:55:0x0182
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:113:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final h0.AbstractC2765c H(int r43, N.C0740o r44) {
        /*
            Method dump skipped, instructions count: 1374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ff.AbstractC2641B.H(int, N.o):h0.c");
    }

    public static void I(Context context, C6.l lVar, boolean z2) {
        Task taskForException;
        int i5;
        if (Build.VERSION.SDK_INT >= 29) {
            SharedPreferences sharedPreferencesW = w(context);
            if (sharedPreferencesW.contains("proxy_retention") && sharedPreferencesW.getBoolean("proxy_retention", false) == z2) {
                return;
            }
            C1566b c1566b = (C1566b) lVar.f1846c;
            if (c1566b.f19676c.e() >= 241100000) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("proxy_retention", z2);
                C1576l c1576lK = C1576l.k(c1566b.f19675b);
                synchronized (c1576lK) {
                    i5 = c1576lK.f19705a;
                    c1576lK.f19705a = i5 + 1;
                }
                taskForException = c1576lK.l(new C1575k(i5, 4, bundle, 0));
            } else {
                taskForException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
            }
            taskForException.addOnSuccessListener(new T0(1), new C8.e(2, context, z2));
        }
    }

    public static void J(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            p1.a(view, charSequence);
            return;
        }
        r1 r1Var = r1.k;
        if (r1Var != null && r1Var.f43883a == view) {
            r1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new r1(view, charSequence);
            return;
        }
        r1 r1Var2 = r1.f43882l;
        if (r1Var2 != null && r1Var2.f43883a == view) {
            r1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void K(InterfaceC4269f binaryMessenger, final C3316l c3316l) {
        C8.i iVar;
        AbstractC3340k.e(binaryMessenger, "binaryMessenger");
        InterfaceC4277n c3306b = (c3316l == null || (iVar = c3316l.f39674a) == null) ? new C3306b() : iVar.q();
        Object obj = null;
        X7 x72 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getCName");
        if (c3316l != null) {
            final int i5 = 0;
            x72.n(new InterfaceC4265b() { // from class: kd.C
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    C3316l c3316l2 = c3316l;
                    switch (i5) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                c3316l2.getClass();
                                listD = AbstractC3935e.C(dName.getCName());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                c3316l2.getClass();
                                listD2 = AbstractC3935e.C(dName2.getDName());
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
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                c3316l2.getClass();
                                listD3 = AbstractC3935e.C(dName3.getOName());
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
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                c3316l2.getClass();
                                listD4 = AbstractC3935e.C(dName4.getUName());
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
                    }
                }
            });
        } else {
            x72.n(null);
        }
        X7 x73 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getDName");
        if (c3316l != null) {
            final int i10 = 1;
            x73.n(new InterfaceC4265b() { // from class: kd.C
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    C3316l c3316l2 = c3316l;
                    switch (i10) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                c3316l2.getClass();
                                listD = AbstractC3935e.C(dName.getCName());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                c3316l2.getClass();
                                listD2 = AbstractC3935e.C(dName2.getDName());
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
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                c3316l2.getClass();
                                listD3 = AbstractC3935e.C(dName3.getOName());
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
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                c3316l2.getClass();
                                listD4 = AbstractC3935e.C(dName4.getUName());
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
                    }
                }
            });
        } else {
            x73.n(null);
        }
        X7 x74 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getOName");
        if (c3316l != null) {
            final int i11 = 2;
            x74.n(new InterfaceC4265b() { // from class: kd.C
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    C3316l c3316l2 = c3316l;
                    switch (i11) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                c3316l2.getClass();
                                listD = AbstractC3935e.C(dName.getCName());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                c3316l2.getClass();
                                listD2 = AbstractC3935e.C(dName2.getDName());
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
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                c3316l2.getClass();
                                listD3 = AbstractC3935e.C(dName3.getOName());
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
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                c3316l2.getClass();
                                listD4 = AbstractC3935e.C(dName4.getUName());
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
                    }
                }
            });
        } else {
            x74.n(null);
        }
        X7 x75 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getUName");
        if (c3316l == null) {
            x75.n(null);
        } else {
            final int i12 = 3;
            x75.n(new InterfaceC4265b() { // from class: kd.C
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    C3316l c3316l2 = c3316l;
                    switch (i12) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                c3316l2.getClass();
                                listD = AbstractC3935e.C(dName.getCName());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                c3316l2.getClass();
                                listD2 = AbstractC3935e.C(dName2.getDName());
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
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                c3316l2.getClass();
                                listD3 = AbstractC3935e.C(dName3.getOName());
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
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                c3316l2.getClass();
                                listD4 = AbstractC3935e.C(dName4.getUName());
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
                    }
                }
            });
        }
    }

    public static final Object L(Jf.q qVar, boolean z2, Jf.q qVar2, tf.p pVar) {
        Object c0517x;
        Object objL;
        try {
            if (pVar instanceof AbstractC3462a) {
                K.e(2, pVar);
                c0517x = pVar.invoke(qVar2, qVar);
            } else {
                c0517x = A6.h.S(pVar, qVar2, qVar);
            }
        } catch (N e7) {
            Throwable th = e7.f3687a;
            qVar.K(new C0517x(false, th));
            throw th;
        } catch (Throwable th2) {
            c0517x = new C0517x(false, th2);
        }
        kf.a aVar = kf.a.f39711a;
        if (c0517x == aVar || (objL = qVar.L(c0517x)) == H.f3672e) {
            return aVar;
        }
        qVar.b0();
        if (!(objL instanceof C0517x)) {
            return H.N(objL);
        }
        if (!z2) {
            Throwable th3 = ((C0517x) objL).f3788a;
            if ((th3 instanceof L0) && ((L0) th3).f3685a == qVar) {
                if (c0517x instanceof C0517x) {
                    throw ((C0517x) c0517x).f3788a;
                }
                return c0517x;
            }
        }
        throw ((C0517x) objL).f3788a;
    }

    public static final E.C M(C1494c c1494c) {
        return new E.C(c1494c.f19121a, c1494c.f19122b, c1494c.f19123c, c1494c.f19124d);
    }

    public static final Map N(Map map) {
        AbstractC3340k.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC3340k.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static boolean O(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    bundle2 = obj2;
                    bundle = obj;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !O((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                        return false;
                    }
                    for (int i5 = 0; i5 < length; i5++) {
                        if (!AbstractC1732v.m(Array.get(obj, i5), Array.get(obj2, i5))) {
                            return false;
                        }
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return bundle == null && bundle2 == null;
    }

    public static final Wf.E a(KSerializer kSerializer) {
        return new Wf.E(q0.f15625a, kSerializer, 1);
    }

    public static final V.d b(Z.d alignment, E.F padding, long j8, long j10, long j11, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z afterCountdownButtonPart, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar, com.moloco.sdk.internal.ortb.model.D d3, C0740o c0740o) {
        AbstractC3340k.e(alignment, "alignment");
        AbstractC3340k.e(padding, "padding");
        AbstractC3340k.e(afterCountdownButtonPart, "afterCountdownButtonPart");
        c0740o.M(-398768076);
        V.d dVarB = V.e.b(c0740o, -201776905, new C2051l(alignment, padding, cVar, afterCountdownButtonPart, j8, j10, j11, d3));
        c0740o.p(false);
        return dVarB;
    }

    public static String c(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static final void d(Jd.n nVar, MediationInfo mediationInfo) {
        String str = Build.VERSION.RELEASE;
        AbstractC3340k.e(nVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MolocoSDK/4.8.1;");
        if (mediationInfo != null) {
            sb2.append("Mediator/" + mediationInfo.getName() + ';');
        }
        if (str != null) {
            sb2.append("Android/" + str + ';');
        }
        String string = sb2.toString();
        AbstractC3340k.d(string, "toString(...)");
        nVar.z("X-Moloco-User-Agent", string);
    }

    public static final void e(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q htmlResource, final Z.k kVar, C0740o c0740o, final int i5) {
        AbstractC3340k.e(htmlResource, "htmlResource");
        c0740o.N(-1230364815);
        int i10 = (c0740o.e(htmlResource) ? 4 : 2) | i5 | (c0740o.e(kVar) ? 32 : 16);
        if ((i10 & 19) == 18 && c0740o.x()) {
            c0740o.I();
        } else {
            c0740o.M(-1944712831);
            Object objF = c0740o.F();
            if (objF == C0732k.f7800a) {
                Object obj = Z.f30049a.get(Integer.valueOf(htmlResource.f32077a));
                if (!(obj instanceof t0)) {
                    obj = null;
                }
                objF = (t0) obj;
                c0740o.U(objF);
            }
            t0 t0Var = (t0) objF;
            c0740o.p(false);
            if (t0Var == null) {
                C0729i0 c0729i0R = c0740o.r();
                if (c0729i0R != null) {
                    final int i11 = 0;
                    c0729i0R.f7788d = new tf.p(htmlResource, kVar, i5, i11) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.T

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f31813a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q f31814b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ Z.k f31815c;

                        {
                            this.f31813a = i11;
                        }

                        @Override // tf.p
                        public final Object invoke(Object obj2, Object obj3) {
                            int i12 = this.f31813a;
                            C0740o c0740o2 = (C0740o) obj2;
                            ((Integer) obj3).getClass();
                            switch (i12) {
                                case 0:
                                    AbstractC2641B.e(this.f31814b, this.f31815c, c0740o2, 1);
                                    break;
                                default:
                                    AbstractC2641B.e(this.f31814b, this.f31815c, c0740o2, 1);
                                    break;
                            }
                            return C2515C.f34653a;
                        }
                    };
                    return;
                }
                return;
            }
            A6.c.f(t0Var, kVar, null, c0740o, (i10 & 112) | 384);
        }
        C0729i0 c0729i0R2 = c0740o.r();
        if (c0729i0R2 != null) {
            final int i12 = 1;
            c0729i0R2.f7788d = new tf.p(htmlResource, kVar, i5, i12) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.T

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f31813a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q f31814b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Z.k f31815c;

                {
                    this.f31813a = i12;
                }

                @Override // tf.p
                public final Object invoke(Object obj2, Object obj3) {
                    int i122 = this.f31813a;
                    C0740o c0740o2 = (C0740o) obj2;
                    ((Integer) obj3).getClass();
                    switch (i122) {
                        case 0:
                            AbstractC2641B.e(this.f31814b, this.f31815c, c0740o2, 1);
                            break;
                        default:
                            AbstractC2641B.e(this.f31814b, this.f31815c, c0740o2, 1);
                            break;
                    }
                    return C2515C.f34653a;
                }
            };
        }
    }

    public static final Charset f(Gd.a aVar) {
        C0672f c0672fU;
        AbstractC3340k.e(aVar, "<this>");
        Jd.m mVarA = aVar.a();
        List list = Jd.p.f6064a;
        String str = mVarA.get("Content-Type");
        if (str != null) {
            C0672f c0672f = C0672f.f6051f;
            c0672fU = AbstractC3230e0.u(str);
        } else {
            c0672fU = null;
        }
        if (c0672fU != null) {
            return AbstractC3772b.i(c0672fU);
        }
        return null;
    }

    public static void g(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final Long h(Gd.a aVar) {
        AbstractC3340k.e(aVar, "<this>");
        Jd.m mVarA = aVar.a();
        List list = Jd.p.f6064a;
        String str = mVarA.get(HttpHeaders.CONTENT_LENGTH);
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    public static final C0672f i(Jd.r rVar) {
        AbstractC3340k.e(rVar, "<this>");
        Jd.n nVarA = rVar.a();
        List list = Jd.p.f6064a;
        String strE = nVarA.E("Content-Type");
        if (strE == null) {
            return null;
        }
        C0672f c0672f = C0672f.f6051f;
        return AbstractC3230e0.u(strE);
    }

    public static final void j(Fd.c cVar, C0672f type) {
        AbstractC3340k.e(type, "type");
        List list = Jd.p.f6064a;
        String value = type.toString();
        Jd.n nVar = cVar.f4047c;
        nVar.getClass();
        AbstractC3340k.e(value, "value");
        nVar.Y(value);
        List listD = nVar.D("Content-Type");
        listD.clear();
        listD.add(value);
    }

    public static ArrayList k(MicrophoneInfo.Coordinate3F coordinate3F) {
        return AbstractC3935e.i(Double.valueOf(coordinate3F.x), Double.valueOf(coordinate3F.y), Double.valueOf(coordinate3F.z));
    }

    public static boolean l(File file, Resources resources, int i5) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i5);
            try {
                boolean zM = m(file, inputStreamOpenRawResource);
                g(inputStreamOpenRawResource);
                return zM;
            } catch (Throwable th) {
                th = th;
                g(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean m(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e7) {
                e = e7;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[Segment.SHARE_MINIMUM];
            while (true) {
                int i5 = inputStream.read(bArr);
                if (i5 == -1) {
                    g(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i5);
            }
        } catch (IOException e10) {
            e = e10;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            g(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            g(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static C4530k n(Context context) {
        ProviderInfo providerInfo;
        h1.d dVar;
        ApplicationInfo applicationInfo;
        ab.b c4521b = Build.VERSION.SDK_INT >= 28 ? new C4521b() : new ab.b();
        PackageManager packageManager = context.getPackageManager();
        AbstractC3076d.d(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            dVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrD = c4521b.d(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrD) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new h1.d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e7) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e7);
            }
        }
        if (dVar == null) {
            return null;
        }
        return new C4530k(new C4529j(context, dVar));
    }

    public static F6.p o(n2.q qVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = qVar.length();
        int i5 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (qVar.m(i10, jElapsedRealtime)) {
                i5++;
            }
        }
        return new F6.p(1, 0, length, i5);
    }

    public static Intent p() {
        Intent intent = new Intent();
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(268435456);
        return intent;
    }

    public static final void q(cg.m mVar, cg.y yVar) throws IOException {
        try {
            IOException iOException = null;
            for (cg.y yVar2 : mVar.d(yVar)) {
                try {
                    if (mVar.e(yVar2).f10051c) {
                        q(mVar, yVar2);
                    }
                    mVar.a(yVar2);
                } catch (IOException e7) {
                    if (iOException == null) {
                        iOException = e7;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static Map r(AudioDeviceInfo device) {
        AbstractC3340k.e(device, "device");
        String address = Build.VERSION.SDK_INT >= 28 ? device.getAddress() : null;
        C2527k c2527k = new C2527k("id", Integer.valueOf(device.getId()));
        C2527k c2527k2 = new C2527k("productName", device.getProductName());
        C2527k c2527k3 = new C2527k("address", address);
        C2527k c2527k4 = new C2527k("isSource", Boolean.valueOf(device.isSource()));
        C2527k c2527k5 = new C2527k("isSink", Boolean.valueOf(device.isSink()));
        int[] sampleRates = device.getSampleRates();
        AbstractC3340k.d(sampleRates, "getSampleRates(...)");
        C2527k c2527k6 = new C2527k("sampleRates", z(sampleRates));
        int[] channelMasks = device.getChannelMasks();
        AbstractC3340k.d(channelMasks, "getChannelMasks(...)");
        C2527k c2527k7 = new C2527k("channelMasks", z(channelMasks));
        int[] channelIndexMasks = device.getChannelIndexMasks();
        AbstractC3340k.d(channelIndexMasks, "getChannelIndexMasks(...)");
        C2527k c2527k8 = new C2527k("channelIndexMasks", z(channelIndexMasks));
        int[] channelCounts = device.getChannelCounts();
        AbstractC3340k.d(channelCounts, "getChannelCounts(...)");
        C2527k c2527k9 = new C2527k("channelCounts", z(channelCounts));
        int[] encodings = device.getEncodings();
        AbstractC3340k.d(encodings, "getEncodings(...)");
        return AbstractC2640A.R(c2527k, c2527k2, c2527k3, c2527k4, c2527k5, c2527k6, c2527k7, c2527k8, c2527k9, new C2527k("encodings", z(encodings)), new C2527k("type", Integer.valueOf(device.getType())));
    }

    public static String s(List list) {
        AbstractC3340k.e(list, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = list.size();
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            i5++;
            if (i5 > 1) {
                sb2.append((CharSequence) ",");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        String string = sb2.toString();
        AbstractC3340k.d(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return string;
    }

    public static Long t(Object obj) {
        Long l10 = obj instanceof Long ? (Long) obj : null;
        if (l10 != null) {
            return l10;
        }
        if ((obj instanceof Integer ? (Integer) obj : null) != null) {
            return Long.valueOf(r2.intValue());
        }
        return null;
    }

    public static final KSerializer u(KSerializer kSerializer) {
        AbstractC3340k.e(kSerializer, "<this>");
        return kSerializer.getDescriptor().b() ? kSerializer : new X(kSerializer);
    }

    public static Object v(Object obj, Map map) {
        AbstractC3340k.e(map, "<this>");
        if (map instanceof z) {
            return ((z) map).b();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static SharedPreferences w(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final C2527k x(ae.h hVar) {
        int i5 = hVar == null ? -1 : Be.a.f1669a[hVar.ordinal()];
        if (i5 == 1) {
            return new C2527k(Integer.valueOf(R.anim.nc_slide_in_from_bottom), Integer.valueOf(R.anim.nc_slide_out_to_bottom));
        }
        if (i5 != 2) {
            return null;
        }
        return new C2527k(0, 0);
    }

    public static File y(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i5 = 0; i5 < 100; i5++) {
            File file = new File(cacheDir, str + i5);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static ArrayList z(int[] iArr) {
        return new ArrayList(m.J0(iArr));
    }
}
