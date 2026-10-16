package a2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Trace;
import android.text.TextUtils;
import androidx.fragment.app.h0;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import b3.InterfaceC1503a;
import c8.C1577a;
import c8.C1587k;
import com.wynauto.wyn.R;
import f6.V;
import ge.InterfaceC2753a;
import j1.AbstractC3076d;
import java.io.IOException;
import java.util.Map;
import k0.InterfaceC3111a;
import kotlin.reflect.KClass;
import qe.C3892a;
import yc.C4592o;
import yc.InterfaceC4574D;

/* loaded from: classes.dex */
public final class k implements d0, InterfaceC1503a, d2.i, V, InterfaceC2753a, InterfaceC3111a, L8.e, InterfaceC4574D {

    /* renamed from: a, reason: collision with root package name */
    public static k f17188a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile k f17189b;

    public static k e(Context context, int i5) throws Resources.NotFoundException {
        AbstractC3076d.a("Cannot create a CalendarItemStyle with a styleResId of 0", i5 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i5, I7.a.f5409l);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        Ba.c.w(context, typedArrayObtainStyledAttributes, 4);
        Ba.c.w(context, typedArrayObtainStyledAttributes, 9);
        Ba.c.w(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        C1587k.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C1577a(0)).a();
        typedArrayObtainStyledAttributes.recycle();
        k kVar = new k();
        AbstractC3076d.c(rect.left);
        AbstractC3076d.c(rect.top);
        AbstractC3076d.c(rect.right);
        AbstractC3076d.c(rect.bottom);
        return kVar;
    }

    public static MediaCodec f(C6.l lVar) throws IOException {
        d2.m mVar = (d2.m) lVar.f1844a;
        StringBuilder sb2 = new StringBuilder("createCodec:");
        String str = mVar.f33992a;
        sb2.append(str);
        Trace.beginSection(sb2.toString());
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // d2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d2.j b(C6.l r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 0
            android.media.MediaCodec r0 = f(r6)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r1 = "configureCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r1 = r6.f1847d     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.view.Surface r1 = (android.view.Surface) r1     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r1 != 0) goto L25
            java.lang.Object r2 = r6.f1844a     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            d2.m r2 = (d2.m) r2     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            boolean r2 = r2.f33999h     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r2 == 0) goto L25
            int r2 = Q1.x.f9724a     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r3 = 35
            if (r2 < r3) goto L25
            r2 = 8
            goto L26
        L21:
            r6 = move-exception
            goto L49
        L23:
            r6 = move-exception
            goto L49
        L25:
            r2 = 0
        L26:
            java.lang.Object r3 = r6.f1845b     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaFormat r3 = (android.media.MediaFormat) r3     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r4 = r6.f1848e     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaCrypto r4 = (android.media.MediaCrypto) r4     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.configure(r3, r1, r4, r2)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r1 = "startCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.start()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            X2.j r1 = new X2.j     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r6 = r6.f1849f     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            Dd.c r6 = (Dd.c) r6     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r1.<init>(r0, r6)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            return r1
        L49:
            if (r0 == 0) goto L4e
            r0.release()
        L4e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.k.b(C6.l):d2.j");
    }

    @Override // b3.InterfaceC1503a
    public CharSequence d(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        editTextPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.f18742a.getString(R.string.not_set);
        }
        return null;
    }

    @Override // f6.V
    public int g(long j8) {
        return 0;
    }

    @Override // f6.V
    public int h(S3.s sVar, H5.h hVar, int i5) {
        hVar.f4893b = 4;
        return -4;
    }

    @Override // ge.InterfaceC2753a
    public Object i(Map map) {
        String strG = Fe.e.G("id", map);
        String strG2 = Fe.e.G("body", map);
        String strG3 = Fe.e.G("context_key", map);
        if (strG == null || strG2 == null || strG3 == null) {
            return null;
        }
        return new C3892a(strG, strG2, strG3);
    }

    @Override // f6.V
    public boolean isReady() {
        return true;
    }

    @Override // androidx.lifecycle.d0
    public b0 j(Class cls, H1.c cVar) {
        return p(cls);
    }

    @Override // L8.e
    public Object o(C6.l lVar) {
        return new ya.h();
    }

    @Override // androidx.lifecycle.d0
    public b0 p(Class cls) {
        return new h0(true);
    }

    @Override // androidx.lifecycle.d0
    public b0 q(KClass kClass, H1.c cVar) {
        return j(Fe.b.y(kClass), cVar);
    }

    @Override // f6.V
    public void a() {
    }

    @Override // yc.InterfaceC4574D, yc.InterfaceC4573C
    public void c(C4592o c4592o) {
    }
}
