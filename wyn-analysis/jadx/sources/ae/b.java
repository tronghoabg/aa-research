package ae;

import G5.C0522c;
import Va.M6;
import android.content.Context;
import android.graphics.Path;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import g4.InterfaceC2703d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p.k;
import p.w;
import r7.InterfaceC3932b;
import r7.InterfaceC3933c;
import v6.l;
import wa.C4398a;
import y3.AbstractC4557o;
import y3.AbstractC4558p;
import y3.C4554l;

/* loaded from: classes5.dex */
public class b implements d0, InterfaceC2703d, w, InterfaceC3933c, L8.e {

    /* renamed from: a, reason: collision with root package name */
    public static b f17626a;

    public static FrameLayout a(Context context, WebView webView) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(webView, "webView");
        ViewParent parent = webView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.setBackgroundColor(0);
        webView.setVisibility(0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(webView, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public static final byte[] b(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                AbstractC3340k.d(byteArray, "use(...)");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static Path c(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f12, f13);
        return path;
    }

    public static void f(WebSettings webSettings, boolean z2) {
        l c4554l;
        if (!AbstractC4557o.f48017m.b()) {
            throw AbstractC4557o.a();
        }
        try {
            c4554l = new l((WebSettingsBoundaryInterface) tg.b.o(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) AbstractC4558p.f48018a.f46015a).convertSettings(webSettings)));
        } catch (ClassCastException e7) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e7;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e7);
            c4554l = new C4554l(null);
        }
        c4554l.c(z2);
    }

    @Override // p.w
    public boolean F(k kVar) {
        return false;
    }

    public boolean d(CharSequence charSequence) {
        return charSequence instanceof i1.d;
    }

    @Override // r7.InterfaceC3933c
    public C0522c e(Context context, String str, InterfaceC3932b interfaceC3932b) {
        int iA;
        C0522c c0522c = new C0522c();
        int iD = interfaceC3932b.d(context, str);
        c0522c.f4405a = iD;
        int i5 = 1;
        int i10 = 0;
        if (iD != 0) {
            iA = interfaceC3932b.a(context, str, false);
            c0522c.f4406b = iA;
        } else {
            iA = interfaceC3932b.a(context, str, true);
            c0522c.f4406b = iA;
        }
        int i11 = c0522c.f4405a;
        if (i11 == 0) {
            if (iA == 0) {
                i5 = 0;
            }
            c0522c.f4407c = i5;
            return c0522c;
        }
        i10 = i11;
        if (i10 >= iA) {
            i5 = -1;
        }
        c0522c.f4407c = i5;
        return c0522c;
    }

    @Override // androidx.lifecycle.d0
    public b0 j(Class cls, H1.c cVar) {
        return p(cls);
    }

    @Override // g4.InterfaceC2703d
    public boolean k() {
        return true;
    }

    @Override // L8.e
    public Object o(C6.l lVar) {
        return new xa.c(lVar.c(C4398a.class));
    }

    @Override // androidx.lifecycle.d0
    public b0 p(Class cls) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            AbstractC3340k.d(objNewInstance, "{\n            modelClass…).newInstance()\n        }");
            return (b0) objNewInstance;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(M6.n(cls, "Cannot create an instance of "), e7);
        } catch (InstantiationException e10) {
            throw new RuntimeException(M6.n(cls, "Cannot create an instance of "), e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(M6.n(cls, "Cannot create an instance of "), e11);
        }
    }

    @Override // androidx.lifecycle.d0
    public b0 q(KClass kClass, H1.c cVar) {
        return j(Fe.b.y(kClass), cVar);
    }

    @Override // g4.InterfaceC2703d
    public void shutdown() {
    }

    @Override // p.w
    public void l(k kVar, boolean z2) {
    }
}
