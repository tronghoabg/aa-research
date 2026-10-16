package E4;

import A7.RunnableC0299w0;
import E5.C0441b;
import Hf.e0;
import Hf.k0;
import Hf.u0;
import Hf.x0;
import K8.C0694f;
import U8.v0;
import Va.M6;
import a2.C1323c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.media.ImageReader;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.ImageView;
import com.applovin.impl.Z0;
import com.google.android.gms.common.api.internal.AbstractC1699m;
import com.google.android.gms.internal.common.zzg;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C2103c;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.unity3d.services.core.network.model.HttpRequest;
import g2.AbstractC2671A;
import g2.C2672B;
import g2.C2693n;
import g2.C2694o;
import i.AbstractC2820a;
import io.ktor.utils.io.T;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import k1.S;
import k2.C3146c;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l2.C3379d;
import l8.AbstractC3403E;
import l8.AbstractC3437s;
import l8.C3407I;
import l8.C3410L;
import l8.C3411M;
import l8.h0;
import l8.j0;
import l8.t0;
import md.J;
import org.apache.tika.fork.ForkServer;
import q.AbstractC3827n0;
import q.C3830p;
import q2.C3861e;
import s2.AbstractC3991a;
import v9.AbstractC4335b;
import x.C4412e;
import y3.C4552j;

/* loaded from: classes.dex */
public final class n implements J5.e, s2.g, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j, jb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2937a;

    /* renamed from: b, reason: collision with root package name */
    public int f2938b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2939c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2940d;

    public n(int i5, Kd.a scope) {
        this.f2937a = 12;
        AbstractC3340k.e(scope, "scope");
        this.f2938b = i5;
        b7.k kVar = new b7.k(i5, scope);
        this.f2939c = kVar;
        this.f2940d = k0.x(new Hf.A((e0) kVar.f19398d, 2), scope, new u0(), i5 == 0 ? C2103c.f31671a : new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d(i5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01df, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static E4.n f(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E4.n.f(android.content.res.Resources, int, android.content.res.Resources$Theme):E4.n");
    }

    private final /* synthetic */ void o() {
    }

    private final /* synthetic */ void p() {
    }

    public static n q(String str) throws ProtocolException, NumberFormatException {
        int i5;
        String strSubstring;
        boolean zStartsWith = str.startsWith("HTTP/1.");
        qd.l lVar = qd.l.HTTP_1_0;
        if (zStartsWith) {
            i5 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                lVar = qd.l.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i5 = 4;
        }
        int i10 = i5 + 3;
        if (str.length() < i10) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i11 = Integer.parseInt(str.substring(i5, i10));
            if (str.length() <= i10) {
                strSubstring = "";
            } else {
                if (str.charAt(i10) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i5 + 4);
            }
            return new n(strSubstring, i11, 22, lVar);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static ArrayList u(Image image) {
        ArrayList arrayList = new ArrayList();
        for (Image.Plane plane : image.getPlanes()) {
            ByteBuffer buffer = plane.getBuffer();
            int iRemaining = buffer.remaining();
            byte[] bArr = new byte[iRemaining];
            buffer.get(bArr, 0, iRemaining);
            HashMap map = new HashMap();
            map.put("bytesPerRow", Integer.valueOf(plane.getRowStride()));
            map.put("bytesPerPixel", Integer.valueOf(plane.getPixelStride()));
            map.put("bytes", bArr);
            arrayList.add(map);
        }
        return arrayList;
    }

    public void A(Bundle bundle) {
        this.f2938b = 1;
        this.f2940d = bundle;
        for (Map.Entry entry : ((Map) this.f2939c).entrySet()) {
            ((AbstractC1699m) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void B(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.f2939c).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((AbstractC1699m) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    @Override // s2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s2.f I(s2.j r22, long r23) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E4.n.I(s2.j, long):s2.f");
    }

    @Override // jb.h
    public void a(jb.e eVar, Runnable runnable) {
        ((Handler) this.f2940d).post(runnable);
    }

    @Override // jb.h
    public void b() {
        HandlerThread handlerThread = (HandlerThread) this.f2939c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f2939c = null;
            this.f2940d = null;
        }
    }

    public void c() {
        C0694f c0694f;
        ImageView imageView = (ImageView) this.f2939c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC3827n0.a(drawable);
        }
        if (drawable == null || (c0694f = (C0694f) this.f2940d) == null) {
            return;
        }
        C3830p.e(drawable, c0694f, imageView.getDrawableState());
    }

    public R9.b d() {
        if ("".isEmpty()) {
            return new R9.b((String) this.f2939c, ((Long) this.f2940d).longValue(), this.f2938b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public j0 e() {
        C3411M c3411m = (C3411M) this.f2940d;
        if (c3411m != null) {
            throw c3411m.a();
        }
        j0 j0VarC = j0.c(this.f2938b, (Object[]) this.f2939c, this);
        C3411M c3411m2 = (C3411M) this.f2940d;
        if (c3411m2 == null) {
            return j0VarC;
        }
        throw c3411m2.a();
    }

    public long g(J5.h hVar) throws EOFException, InterruptedIOException {
        long j8;
        J5.n nVar;
        J5.p pVar;
        long j10;
        boolean zO;
        int iM;
        while (true) {
            long jG = hVar.g();
            j8 = hVar.f5645c;
            long j11 = j8 - 6;
            nVar = (J5.n) this.f2940d;
            pVar = (J5.p) this.f2939c;
            if (jG >= j11) {
                j10 = 6;
                break;
            }
            long jG2 = hVar.g();
            byte[] bArr = new byte[2];
            hVar.c(bArr, 0, 2, false);
            int i5 = ((bArr[0] & ForkServer.ERROR) << 8) | (bArr[1] & ForkServer.ERROR);
            int i10 = this.f2938b;
            if (i5 != i10) {
                hVar.f5648f = 0;
                hVar.b((int) (jG2 - hVar.f5646d), false);
                j10 = 6;
                zO = false;
            } else {
                j10 = 6;
                Y4.b bVar = new Y4.b(16);
                System.arraycopy(bArr, 0, bVar.f16679a, 0, 2);
                byte[] bArr2 = bVar.f16679a;
                int i11 = 0;
                for (int i12 = 2; i11 < 14 && (iM = hVar.m(i12 + i11, 14 - i11, bArr2)) != -1; i12 = 2) {
                    i11 += iM;
                }
                bVar.z(i11);
                hVar.f5648f = 0;
                hVar.b((int) (jG2 - hVar.f5646d), false);
                zO = v0.o(bVar, pVar, i10, nVar);
            }
            if (zO) {
                break;
            }
            hVar.b(1, false);
        }
        if (hVar.g() < j8 - j10) {
            return nVar.f5655a;
        }
        hVar.b((int) (j8 - hVar.g()), false);
        return pVar.k;
    }

    public long h(s2.j jVar) throws EOFException, InterruptedIOException {
        long j8;
        J5.n nVar;
        J5.p pVar;
        long j10;
        boolean zD;
        int iM;
        while (true) {
            long jG = jVar.g();
            j8 = jVar.f44897c;
            long j11 = j8 - 6;
            nVar = (J5.n) this.f2940d;
            pVar = (J5.p) this.f2939c;
            if (jG >= j11) {
                j10 = 6;
                break;
            }
            long jG2 = jVar.g();
            byte[] bArr = new byte[2];
            jVar.c(bArr, 0, 2, false);
            int i5 = ((bArr[0] & ForkServer.ERROR) << 8) | (bArr[1] & ForkServer.ERROR);
            int i10 = this.f2938b;
            if (i5 != i10) {
                jVar.f44900f = 0;
                jVar.b((int) (jG2 - jVar.f44898d), false);
                j10 = 6;
                zD = false;
            } else {
                j10 = 6;
                Q1.o oVar = new Q1.o(16);
                System.arraycopy(bArr, 0, oVar.f9702a, 0, 2);
                byte[] bArr2 = oVar.f9702a;
                int i11 = 0;
                for (int i12 = 2; i11 < 14 && (iM = jVar.m(i12 + i11, 14 - i11, bArr2)) != -1; i12 = 2) {
                    i11 += iM;
                }
                oVar.F(i11);
                jVar.f44900f = 0;
                jVar.b((int) (jG2 - jVar.f44898d), false);
                zD = AbstractC3991a.d(oVar, pVar, i10, nVar);
            }
            if (zD) {
                break;
            }
            jVar.b(1, false);
        }
        if (jVar.g() < j8 - j10) {
            return nVar.f5655a;
        }
        jVar.b((int) (j8 - jVar.g()), false);
        return pVar.k;
    }

    public Object i(int i5) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        switch (this.f2937a) {
            case 13:
                if (this.f2938b == -1) {
                    this.f2938b = 0;
                }
                while (true) {
                    int i10 = this.f2938b;
                    sparseArray = (SparseArray) this.f2939c;
                    if (i10 > 0 && i5 < sparseArray.keyAt(i10)) {
                        this.f2938b--;
                    }
                }
                while (this.f2938b < sparseArray.size() - 1 && i5 >= sparseArray.keyAt(this.f2938b + 1)) {
                    this.f2938b++;
                }
                return sparseArray.valueAt(this.f2938b);
            default:
                if (this.f2938b == -1) {
                    this.f2938b = 0;
                }
                while (true) {
                    int i11 = this.f2938b;
                    sparseArray2 = (SparseArray) this.f2939c;
                    if (i11 > 0 && i5 < sparseArray2.keyAt(i11)) {
                        this.f2938b--;
                    }
                }
                while (this.f2938b < sparseArray2.size() - 1 && i5 >= sparseArray2.keyAt(this.f2938b + 1)) {
                    this.f2938b++;
                }
                return sparseArray2.valueAt(this.f2938b);
        }
    }

    public String j() {
        StringBuilder sb2 = new StringBuilder("$");
        int i5 = this.f2938b + 1;
        for (int i10 = 0; i10 < i5; i10++) {
            Object obj = ((Object[]) this.f2939c)[i10];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!AbstractC3340k.a(serialDescriptor.getKind(), Uf.j.f12832q)) {
                    int i11 = ((int[]) this.f2940d)[i10];
                    if (i11 >= 0) {
                        sb2.append(".");
                        sb2.append(serialDescriptor.e(i11));
                    }
                } else if (((int[]) this.f2940d)[i10] != -1) {
                    sb2.append("[");
                    sb2.append(((int[]) this.f2940d)[i10]);
                    sb2.append("]");
                }
            } else if (obj != Yf.s.f16875a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        return sb2.toString();
    }

    public C2672B k(int i5, String str, Map map, Uri uri) {
        C2693n c2693n = (C2693n) this.f2940d;
        String str2 = c2693n.f35630c;
        int i10 = this.f2938b;
        this.f2938b = i10 + 1;
        C1323c c1323c = new C1323c(i10, str2, str);
        if (c2693n.f35640n != null) {
            Q1.k.h(c2693n.f35637j);
            try {
                c1323c.D(ApiHeadersProvider.AUTHORIZATION, c2693n.f35640n.a(c2693n.f35637j, uri, i5));
            } catch (N1.D e7) {
                C2693n.a(c2693n, new T(e7));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            c1323c.D((String) entry.getKey(), (String) entry.getValue());
        }
        return new C2672B(uri, i5, new C2694o(c1323c), "");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g
    public Hf.v0 l() {
        throw null;
    }

    public boolean m() {
        ColorStateList colorStateList;
        return ((Shader) this.f2939c) == null && (colorStateList = (ColorStateList) this.f2940d) != null && colorStateList.isStateful();
    }

    public void n(AttributeSet attributeSet, int i5) {
        int resourceId;
        ImageView imageView = (ImageView) this.f2939c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC2820a.f36443f;
        J jS = J.s(context, attributeSet, iArr, i5, 0);
        S.l(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) jS.f40581b, i5);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) jS.f40581b;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = Fe.g.B(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC3827n0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(jS.m(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC3827n0.c(typedArray.getInt(3, -1), null));
            }
            jS.v();
        } catch (Throwable th) {
            jS.v();
            throw th;
        }
    }

    public ArrayList r(Image image) {
        ArrayList arrayList = new ArrayList();
        Image.Plane[] planes = image.getPlanes();
        int width = image.getWidth();
        int height = image.getHeight();
        ((x4.d) this.f2940d).getClass();
        int i5 = width * height;
        byte[] bArr = new byte[((i5 / 4) * 2) + i5];
        ByteBuffer buffer = planes[1].getBuffer();
        ByteBuffer buffer2 = planes[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i10 = (i5 * 2) / 4;
        boolean z2 = buffer2.remaining() == i10 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z2) {
            planes[0].getBuffer().get(bArr, 0, i5);
            ByteBuffer buffer3 = planes[1].getBuffer();
            planes[2].getBuffer().get(bArr, i5, 1);
            buffer3.get(bArr, i5 + 1, i10 - 1);
        } else {
            x4.d.z(planes[0], width, height, bArr, 0, 1);
            x4.d.z(planes[1], width, height, bArr, i5 + 1, 2);
            x4.d.z(planes[2], width, height, bArr, i5, 2);
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        HashMap map = new HashMap();
        map.put("bytesPerRow", Integer.valueOf(image.getWidth()));
        map.put("bytesPerPixel", 1);
        map.put("bytes", byteBufferWrap.array());
        arrayList.add(map);
        return arrayList;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j
    public void reset() {
        b7.k kVar = (b7.k) this.f2939c;
        e0 e0VarC = ic.d.c(this.f2938b, (Kd.a) kVar.f19396b, null);
        x0 x0Var = (x0) kVar.f19397c;
        x0Var.getClass();
        x0Var.k(null, e0VarC);
    }

    @Override // J5.e, s2.g
    public void s() {
        switch (this.f2937a) {
            case 2:
                break;
            case 7:
                byte[] bArr = Q1.x.f9729f;
                Q1.o oVar = (Q1.o) this.f2940d;
                oVar.getClass();
                oVar.E(bArr.length, bArr);
                break;
        }
    }

    @Override // jb.h
    public void start() {
        HandlerThread handlerThread = new HandlerThread("Sqflite", this.f2938b);
        this.f2939c = handlerThread;
        handlerThread.start();
        this.f2940d = new Handler(((HandlerThread) this.f2939c).getLooper());
    }

    @Override // J5.e
    public J5.d t(J5.h hVar, long j8) throws EOFException, InterruptedIOException {
        long j10 = hVar.f5646d;
        long jG = g(hVar);
        long jG2 = hVar.g();
        hVar.b(Math.max(6, ((J5.p) this.f2939c).f5662d), false);
        long jG3 = g(hVar);
        return (jG > j8 || jG3 <= j8) ? jG3 <= j8 ? new J5.d(-2, jG3, hVar.g()) : new J5.d(-1, jG, j10) : new J5.d(0, -9223372036854775807L, jG2);
    }

    public String toString() {
        switch (this.f2937a) {
            case 8:
                return j();
            case 22:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((qd.l) this.f2939c) == qd.l.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
                sb2.append(' ');
                sb2.append(this.f2938b);
                String str = (String) this.f2940d;
                if (str != null) {
                    sb2.append(' ');
                    sb2.append(str);
                }
                return sb2.toString();
            case 23:
                StringBuilder sb3 = new StringBuilder();
                sb3.append((String) this.f2939c);
                sb3.append("://");
                int i5 = -1;
                if (((String) this.f2940d).indexOf(58) != -1) {
                    sb3.append('[');
                    sb3.append((String) this.f2940d);
                    sb3.append(']');
                } else {
                    sb3.append((String) this.f2940d);
                }
                int i10 = this.f2938b;
                if (i10 == -1) {
                    String str2 = (String) this.f2939c;
                    i10 = str2.equals("http") ? 80 : str2.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
                }
                String str3 = (String) this.f2939c;
                if (str3.equals("http")) {
                    i5 = 80;
                } else if (str3.equals(HttpRequest.DEFAULT_SCHEME)) {
                    i5 = 443;
                }
                if (i10 != i5) {
                    sb3.append(':');
                    sb3.append(i10);
                }
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public void v(Object obj, Object obj2) {
        int i5 = (this.f2938b + 1) * 2;
        Object[] objArr = (Object[]) this.f2939c;
        if (i5 > objArr.length) {
            this.f2939c = Arrays.copyOf(objArr, AbstractC3403E.f(objArr.length, i5));
        }
        AbstractC3437s.c(obj, obj2);
        Object[] objArr2 = (Object[]) this.f2939c;
        int i10 = this.f2938b;
        int i11 = i10 * 2;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.f2938b = i10 + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void w() throws NumberFormatException {
        Q1.k.h((C2672B) this.f2939c);
        C2694o c2694o = ((C2672B) this.f2939c).f35513c;
        HashMap map = new HashMap();
        C3410L c3410l = c2694o.f35646a;
        t0 it = ((h0) c3410l.f40060d.keySet()).iterator();
        while (true) {
            C3407I c3407i = (C3407I) it;
            if (!c3407i.hasNext()) {
                C2672B c2672b = (C2672B) this.f2939c;
                y(k(c2672b.f35512b, ((C2693n) this.f2940d).k, map, c2672b.f35511a));
                return;
            }
            String str = (String) c3407i.next();
            if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals(ApiHeadersProvider.AUTHORIZATION)) {
                map.put(str, (String) AbstractC3437s.j(c3410l.d(str)));
            }
        }
    }

    public C0441b x() {
        return new C0441b(this, s9.j.f45379c, false, 13);
    }

    public void y(C2672B c2672b) throws NumberFormatException {
        String strB = c2672b.f35513c.b("CSeq");
        strB.getClass();
        int i5 = Integer.parseInt(strB);
        C2693n c2693n = (C2693n) this.f2940d;
        Q1.k.g(c2693n.f35633f.get(i5) == null);
        c2693n.f35633f.append(i5, c2672b);
        c2693n.f35636i.b(AbstractC2671A.g(c2672b));
        this.f2939c = c2672b;
    }

    public void z(String str, AbstractC1699m abstractC1699m) {
        Map map = (Map) this.f2939c;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(M6.t(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, abstractC1699m);
        if (this.f2938b > 0) {
            new zzg(Looper.getMainLooper()).post(new RunnableC0299w0(this, abstractC1699m, str));
        }
    }

    public /* synthetic */ n(String str, int i5, int i10, Object obj) {
        this.f2937a = i10;
        this.f2939c = obj;
        this.f2938b = i5;
        this.f2940d = str;
    }

    public /* synthetic */ n(short s10, int i5) {
        this.f2937a = i5;
    }

    public n(int i5, char c10) {
        this.f2937a = i5;
        switch (i5) {
            case 11:
                this.f2939c = DesugarCollections.synchronizedMap(new C4412e(0));
                this.f2938b = 0;
                break;
            default:
                Object[] objArr = new Object[5];
                this.f2939c = objArr;
                this.f2940d = objArr;
                break;
        }
    }

    public n(int i5, C2694o c2694o, String str) {
        this.f2937a = 15;
        this.f2938b = i5;
        this.f2939c = c2694o;
        this.f2940d = str;
    }

    public n(ImageView imageView) {
        this.f2937a = 20;
        this.f2938b = 0;
        this.f2939c = imageView;
    }

    public n(Z0 z02) {
        this.f2937a = 13;
        this.f2939c = new SparseArray();
        this.f2940d = z02;
        this.f2938b = -1;
    }

    public n(C3146c c3146c) {
        this.f2937a = 17;
        this.f2939c = new SparseArray();
        this.f2940d = c3146c;
        this.f2938b = -1;
    }

    public n(Shader shader, ColorStateList colorStateList, int i5) {
        this.f2937a = 10;
        this.f2939c = shader;
        this.f2940d = colorStateList;
        this.f2938b = i5;
    }

    public n(int i5, int i10) {
        this.f2937a = i10;
        switch (i10) {
            case 18:
                this.f2939c = new Object[i5 * 2];
                this.f2938b = 0;
                break;
            case 19:
                this.f2938b = i5;
                this.f2939c = new HashSet();
                this.f2940d = new ArrayList();
                break;
            default:
                this.f2938b = i5;
                break;
        }
    }

    public n(J5.p pVar, int i5) {
        this.f2937a = 2;
        this.f2939c = pVar;
        this.f2938b = i5;
        this.f2940d = new J5.n();
    }

    public n(J5.p pVar, int i5, byte b5) {
        this.f2937a = 25;
        this.f2939c = pVar;
        this.f2938b = i5;
        this.f2940d = new J5.n();
    }

    public n(int i5, int i10, int i11) {
        this.f2937a = 1;
        this.f2938b = i11;
        this.f2939c = ImageReader.newInstance(i5, i10, i11 == 17 ? 35 : i11, 1);
        this.f2940d = new x4.d(22);
    }

    public n(int i5, Q1.u uVar) {
        this.f2937a = 7;
        this.f2938b = i5;
        this.f2939c = uVar;
        this.f2940d = new Q1.o();
    }

    public n(AbstractC4335b abstractC4335b, A2.d dVar) {
        this.f2937a = 24;
        this.f2940d = abstractC4335b;
        this.f2938b = 0;
        this.f2939c = dVar;
    }

    public n(S1.g gVar) {
        this.f2937a = 6;
        this.f2940d = C3379d.f39879j;
        this.f2939c = gVar;
        this.f2938b = 1;
    }

    public n(C2693n c2693n) {
        this.f2937a = 14;
        this.f2940d = c2693n;
    }

    public n(d7.j jVar) {
        this.f2937a = 0;
        this.f2940d = Z4.d.a(150, new C4552j(this, 6));
        this.f2939c = jVar;
    }

    public n(C3861e c3861e, d2.j jVar, int i5, long j8) {
        this.f2937a = 21;
        this.f2940d = c3861e;
        this.f2939c = jVar;
        this.f2938b = i5;
    }
}
