package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.manager.LifecycleLifecycle;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ieb {
    public final Object a;
    public final Object b;

    public ieb(csi csiVar) {
        csiVar.getClass();
        this.a = csiVar;
        this.b = getClass().getName() + "-" + csiVar;
    }

    public static final hwx j(ImageDecoder.Source source, int i, int i2, hum humVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new hzz(i, i2, humVar));
        if (hg$$ExternalSyntheticApiModelOutline0.m$2(drawableDecodeDrawable)) {
            return new icd(hg$$ExternalSyntheticApiModelOutline0.m306m((Object) drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: ".concat(String.valueOf(String.valueOf(drawableDecodeDrawable))));
    }

    public static final boolean k(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    public static final double v(a aVar, afdr afdrVar) {
        return aVar instanceof fti ? ((fti) aVar).a : ((Number) afdrVar.invoke()).doubleValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    private final synchronized List w(String str) {
        ?? r0 = this.b;
        if (!r0.contains(str)) {
            r0.add(str);
        }
        ?? r02 = this.a;
        List list = (List) r02.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        r02.put(str, arrayList);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized List a(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            List<kex> list = (List) this.a.get((String) it.next());
            if (list != null) {
                for (kex kexVar : list) {
                    if (kexVar.c(cls, cls2)) {
                        arrayList.add(kexVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            List<kex> list = (List) this.a.get((String) it.next());
            if (list != null) {
                for (kex kexVar : list) {
                    if (kexVar.c(cls, cls2)) {
                        Object obj = kexVar.a;
                        if (!arrayList.contains(obj)) {
                            arrayList.add(obj);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void c(String str, huo huoVar, Class cls, Class cls2) {
        w(str).add(new kex(cls, cls2, huoVar));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final synchronized void d(List list) {
        ?? r1 = this.b;
        ArrayList arrayList = new ArrayList((Collection) r1);
        r1.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r1.add((String) it.next());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (!list.contains(str)) {
                r1.add(str);
            }
        }
    }

    public final synchronized void e(huo huoVar, Class cls, Class cls2) {
        w("legacy_prepend_all").add(0, new kex(cls, cls2, huoVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [idl, java.lang.Object] */
    public final hss f(Context context, hrt hrtVar, ept eptVar, boolean z) {
        ify.f();
        ify.f();
        ?? r0 = this.a;
        hss hssVar = (hss) r0.get(eptVar);
        if (hssVar != null) {
            return hssVar;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(eptVar);
        hss hssVarA = this.b.a(hrtVar, lifecycleLifecycle, new idj(), context);
        r0.put(eptVar, hssVarA);
        lifecycleLifecycle.a(new idi(this, eptVar));
        if (!z) {
            return hssVarA;
        }
        hssVarA.k();
        return hssVarA;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hxe, java.lang.Object] */
    public final void g(Bitmap bitmap) {
        this.b.d(bitmap);
    }

    public final void h(byte[] bArr) {
        Object obj = this.a;
        if (obj == null) {
            return;
        }
        ((hxl) obj).c(bArr);
    }

    public final byte[] i(int i) {
        Object obj = this.a;
        return obj == null ? new byte[i] : (byte[]) ((hxl) obj).a(i, byte[].class);
    }

    public final synchronized List l(Class cls) {
        return ((hzm) this.a).c(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final synchronized List m(Class cls) {
        ?? r0 = ((gms) this.b).a;
        gms gmsVar = (gms) r0.get(cls);
        ?? r1 = gmsVar == null ? 0 : gmsVar.a;
        if (r1 != 0) {
            return r1;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((hzm) this.a).b(cls));
        if (((gms) r0.put(cls, new gms(listUnmodifiableList, (byte[]) null))) == null) {
            return listUnmodifiableList;
        }
        throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(String.valueOf(cls))));
    }

    public final synchronized void n(Class cls, Class cls2, hzi hziVar) {
        ((hzm) this.a).d(cls, cls2, hziVar);
        ((gms) this.b).b();
    }

    public final synchronized void o(Class cls, Class cls2, hzi hziVar) {
        ((hzm) this.a).e(cls, cls2, hziVar);
        ((gms) this.b).b();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [dzk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [dzk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [dzk, java.lang.Object] */
    public final String p(hui huiVar) {
        String str;
        Object obj = this.a;
        synchronized (obj) {
            str = (String) ((ifu) obj).f(huiVar);
        }
        if (str == null) {
            hya hyaVar = (hya) this.b.a();
            try {
                MessageDigest messageDigest = hyaVar.a;
                huiVar.a(messageDigest);
                byte[] bArrDigest = messageDigest.digest();
                char[] cArr = ify.b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i + i;
                        char[] cArr2 = ify.a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                this.b.b(hyaVar);
            }
        }
        Object obj2 = this.a;
        synchronized (obj2) {
            ((ifu) obj2).g(huiVar, str);
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Queue] */
    public final void q(String str) {
        ajju ajjuVar;
        synchronized (this) {
            ?? r1 = this.a;
            ajjuVar = (ajju) r1.get(str);
            a.al(ajjuVar, "Argument must not be null");
            int i = ajjuVar.a;
            if (i <= 0) {
                throw new IllegalStateException(a.bA(i, str, "Cannot release a lock that is not held, safeKey: ", ", interestedThreads: "));
            }
            int i2 = i - 1;
            ajjuVar.a = i2;
            if (i2 == 0) {
                ajju ajjuVar2 = (ajju) r1.remove(str);
                if (!ajjuVar2.equals(ajjuVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + ajjuVar.toString() + ", but actually removed: " + String.valueOf(ajjuVar2) + ", safeKey: " + str);
                }
                ?? r6 = ((htm) this.b).a;
                synchronized (r6) {
                    if (r6.size() < 10) {
                        r6.offer(ajjuVar2);
                    }
                }
            }
        }
        ajjuVar.b.unlock();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aizk, java.lang.Object] */
    public final void r() {
        this.b.c(new hjq(3, ""));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.Object r6, defpackage.afec r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.giq
            if (r0 == 0) goto L13
            r0 = r8
            giq r0 = (defpackage.giq) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            giq r0 = new giq
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            gjl r6 = r0.c
            defpackage.woy.dF(r8)
            goto L6e
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            gjl r6 = r0.c
            defpackage.woy.dF(r8)
            goto L5b
        L3a:
            defpackage.woy.dF(r8)
            java.lang.Object r8 = r5.b
            zu r8 = (defpackage.zu) r8
            java.lang.Object r8 = r8.b(r6)
            if (r8 == 0) goto L48
            return r8
        L48:
            gir r8 = new gir
            r2 = 0
            r8.<init>(r5, r6, r7, r2)
            r7 = r6
            gjl r7 = (defpackage.gjl) r7
            r0.c = r7
            r0.b = r4
            java.lang.Object r8 = defpackage.ahni.a(r8, r0)
            if (r8 == r1) goto L76
        L5b:
            r8.getClass()
            aiud r8 = (defpackage.aiud) r8
            r7 = r6
            gjl r7 = (defpackage.gjl) r7
            r0.c = r7
            r0.b = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L6e
            goto L76
        L6e:
            java.lang.Object r5 = r5.a
            j$.util.concurrent.ConcurrentHashMap r5 = (j$.util.concurrent.ConcurrentHashMap) r5
            r5.remove(r6)
            return r8
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ieb.s(java.lang.Object, afec, afck):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aizk, java.lang.Object] */
    public final void t() {
        this.b.c(true);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aizk, java.lang.Object] */
    public final void u() {
        this.b.c(false);
    }

    public ieb(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public ieb(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public ieb(fux fuxVar) {
        this.b = fuxVar;
        sw swVar = new sw();
        swVar.e("unused");
        swVar.d(new gec(this, 1));
        this.a = swVar.a();
    }

    public ieb(idl idlVar) {
        this.a = new HashMap();
        this.b = idlVar;
    }

    public ieb(byte[] bArr) {
        this.a = new AtomicReference();
        this.b = new yw();
    }

    public ieb() {
        this.b = new ArrayList();
        this.a = new HashMap();
    }

    public ieb(hxe hxeVar, hxl hxlVar) {
        this.b = hxeVar;
        this.a = hxlVar;
    }

    public ieb(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        aizk aizkVarD = aizq.d(0, 1, 2);
        this.b = aizkVarD;
        this.a = aizkVarD;
    }

    public ieb(geu geuVar, long j) {
        Handler handler = new Handler(Looper.getMainLooper());
        geg gegVar = new geg(geuVar, j);
        this.a = new gep(geuVar, gegVar, handler);
        this.b = new GestureDetector(geuVar, gegVar, handler);
    }

    public ieb(short[] sArr) {
        this.b = new zu(16);
        this.a = new ConcurrentHashMap();
    }

    public ieb(char[] cArr, byte[] bArr) {
        aizk aizkVarD = aizq.d(0, 1, 2);
        this.b = aizkVarD;
        this.a = aizkVarD;
    }

    public ieb(hdk hdkVar) {
        hrg hrgVar = new hrg();
        this.b = hdkVar;
        this.a = hrgVar;
    }

    public ieb(byte[] bArr, byte[] bArr2) {
        this.a = new HashMap();
        this.b = new htm((byte[]) null);
    }

    public ieb(char[] cArr) {
        this.a = new ifu(1000L);
        this.b = igf.a(10, new hxz(0));
    }

    public ieb(dzk dzkVar) {
        hzm hzmVar = new hzm(dzkVar);
        this.b = new gms((char[]) null);
        this.a = hzmVar;
    }
}
