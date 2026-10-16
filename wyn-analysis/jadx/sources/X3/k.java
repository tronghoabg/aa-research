package X3;

import Ef.H;
import Ef.I0;
import Ef.S;
import Jf.n;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import b4.C1505a;
import b4.C1513i;
import ba.C1521a;
import c4.C1555h;
import d4.C2387a;
import e4.C2471a;
import ef.C2527k;
import ef.C2532p;
import ff.o;
import h4.C2775b;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import r7.AbstractC3935e;
import y3.C4552j;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16111a;

    /* renamed from: b, reason: collision with root package name */
    public final C2775b f16112b;

    /* renamed from: c, reason: collision with root package name */
    public final C2532p f16113c;

    /* renamed from: d, reason: collision with root package name */
    public final C1521a f16114d;

    /* renamed from: e, reason: collision with root package name */
    public final C2532p f16115e;

    /* renamed from: f, reason: collision with root package name */
    public final b f16116f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f16117g;

    public k(Context context, C2775b c2775b, C2532p c2532p, C2532p c2532p2, C2532p c2532p3, b bVar, k4.i iVar) {
        int i5 = 3;
        int i10 = 4;
        int i11 = 5;
        int i12 = 1;
        int i13 = 0;
        this.f16111a = context;
        this.f16112b = c2775b;
        this.f16113c = c2532p;
        I0 i0F = H.f();
        Lf.e eVar = S.f3698a;
        H.c(Fe.e.O(i0F, n.f6132a.f4117e).plus(new j(this)));
        iVar.getClass();
        k4.j jVar = new k4.j(this, context);
        C1521a c1521a = new C1521a(this, jVar);
        this.f16114d = c1521a;
        this.f16115e = c2532p;
        C8.i iVar2 = new C8.i(bVar);
        iVar2.f(new C2471a(2), HttpUrl.class);
        iVar2.f(new C2471a(i11), String.class);
        iVar2.f(new C2471a(i12), Uri.class);
        iVar2.f(new C2471a(i10), Uri.class);
        iVar2.f(new C2471a(i5), Integer.class);
        iVar2.f(new C2471a(i13), byte[].class);
        C2387a c2387a = new C2387a(1);
        ArrayList arrayList = (ArrayList) iVar2.f1941d;
        arrayList.add(new C2527k(c2387a, Uri.class));
        arrayList.add(new C2527k(new C2387a(0), File.class));
        iVar2.e(new C1513i(c2532p3, c2532p2), Uri.class);
        iVar2.e(new C1505a(i11), File.class);
        iVar2.e(new C1505a(i13), Uri.class);
        iVar2.e(new C1505a(i5), Uri.class);
        iVar2.e(new C1505a(6), Uri.class);
        iVar2.e(new C1505a(i10), Drawable.class);
        iVar2.e(new C1505a(i12), Bitmap.class);
        iVar2.e(new C1505a(2), ByteBuffer.class);
        Z3.c cVar = new Z3.c();
        ArrayList arrayList2 = (ArrayList) iVar2.f1943f;
        arrayList2.add(cVar);
        List listR = AbstractC3935e.R((ArrayList) iVar2.f1939b);
        this.f16116f = new b(listR, AbstractC3935e.R((ArrayList) iVar2.f1940c), AbstractC3935e.R(arrayList), AbstractC3935e.R((ArrayList) iVar2.f1942e), AbstractC3935e.R(arrayList2));
        this.f16117g = o.F0(listR, new C1555h(this, c1521a));
        new AtomicBoolean(false);
        context.registerComponentCallbacks(jVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (tg.b.i(r14, r0) == r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6 A[Catch: all -> 0x016d, TryCatch #9 {all -> 0x016d, blocks: (B:48:0x00cc, B:50:0x00d6, B:51:0x00d9, B:53:0x00e4, B:54:0x00f0), top: B:119:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4 A[Catch: all -> 0x016d, TryCatch #9 {all -> 0x016d, blocks: (B:48:0x00cc, B:50:0x00d6, B:51:0x00d9, B:53:0x00e4, B:54:0x00f0), top: B:119:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136 A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #8 {all -> 0x014c, blocks: (B:66:0x0130, B:68:0x0136, B:76:0x014f, B:78:0x0153), top: B:118:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014f A[Catch: all -> 0x014c, TRY_ENTER, TryCatch #8 {all -> 0x014c, blocks: (B:66:0x0130, B:68:0x0136, B:76:0x014f, B:78:0x0153), top: B:118:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017b A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #10 {all -> 0x018f, blocks: (B:92:0x0177, B:94:0x017b, B:99:0x0192, B:100:0x019b), top: B:121:0x0177 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0192 A[Catch: all -> 0x018f, TRY_ENTER, TryCatch #10 {all -> 0x018f, blocks: (B:92:0x0177, B:94:0x017b, B:99:0x0192, B:100:0x019b), top: B:121:0x0177 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(X3.k r12, h4.h r13, int r14, lf.AbstractC3464c r15) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.k.a(X3.k, h4.h, int, lf.c):java.lang.Object");
    }

    public static void b(h4.d dVar, C4552j c4552j, c cVar) {
        h4.h hVar = dVar.f36072b;
        cVar.getClass();
        hVar.getClass();
    }
}
