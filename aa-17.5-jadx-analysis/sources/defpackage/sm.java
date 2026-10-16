package defpackage;

import android.content.Context;
import android.graphics.PathMeasure;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import androidx.car.app.media.CarAudioCallbackDelegate;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class sm {
    public final Object a;

    public sm(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new ean(view);
        } else {
            this.a = new eao();
        }
    }

    static int z(pvq pvqVar, int i) {
        if (i == 0) {
            i = 0;
        } else if (pvqVar != null) {
            pxy pxyVar = pxy.UNKNOWN;
            int i2 = i - 1;
            if (i2 != 8) {
                return i2 != 9 ? 4 : 38;
            }
            return 37;
        }
        if (pvqVar == null) {
            if (i == 0) {
                return 1;
            }
            pxy pxyVar2 = pxy.UNKNOWN;
            switch (i - 1) {
                case 1:
                    return 30;
                case 2:
                    return 31;
                case 3:
                    return 32;
                case 4:
                    return 33;
                case 5:
                    return 34;
                case 6:
                    return 35;
                case 7:
                    return 36;
                case 8:
                    return 37;
                case 9:
                    return 38;
                case 10:
                    return 39;
                default:
                    return 29;
            }
        }
        pxy pxyVar3 = pxy.UNKNOWN;
        switch (pvqVar.ordinal()) {
            case 1:
                return 5;
            case 2:
                return 6;
            case 3:
            default:
                return 28;
            case 4:
                return 7;
            case 5:
                return 8;
            case 6:
                return 9;
            case 7:
                return 10;
            case 8:
                return 11;
            case 9:
                return 12;
            case 10:
                return 13;
            case 11:
                return 14;
            case 12:
                return 15;
            case 13:
                return 16;
            case 14:
                return 17;
            case 15:
                return 18;
            case 16:
                return 19;
            case 17:
                return 20;
            case 18:
                return 21;
            case 19:
                return 22;
            case 20:
                return 23;
            case 21:
                return 24;
            case 22:
                return 25;
            case 23:
                return 26;
            case 24:
                return 27;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Type inference failed for: r8v1, types: [ackk, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(defpackage.pqu r9, defpackage.pqu r10, defpackage.pxy r11, defpackage.pqj r12, int r13, defpackage.pvq r14, int r15, j$.time.Duration r16, j$.time.Duration r17, j$.time.Duration r18) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm.A(pqu, pqu, pxy, pqj, int, pvq, int, j$.time.Duration, j$.time.Duration, j$.time.Duration):void");
    }

    public final long B(long j) {
        return ((AtomicLong) this.a).addAndGet(j);
    }

    public final void C(Object obj) {
        obj.getClass().getName();
        ((tzt) this.a).d((tob) obj);
    }

    public final int D() {
        return ((tzv) this.a).e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final yfq E() {
        yfq yfqVar = ((tzv) this.a).c;
        int i = ((yls) yfqVar).c;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new erb((tzx) yfqVar.get(i2)));
        }
        return yfq.o(arrayList);
    }

    public final Object F() {
        return ((tzv) this.a).b;
    }

    public final boolean G() {
        return ((tzv) this.a).d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zsl] */
    public final String H() {
        return this.a.a();
    }

    public final int I(sm smVar) {
        int i;
        zkt.n(smVar, "building");
        Object objF = smVar.F();
        Object obj = this.a;
        synchronized (obj) {
            acjs acjsVar = (acjs) ((tzt) obj).a.b.h(objF);
            i = acjsVar == null ? -1 : acjsVar.a;
        }
        return i == -1 ? smVar.D() : i;
    }

    public final sm J() {
        tzv tzvVar;
        Object obj = this.a;
        synchronized (obj) {
            tzvVar = ((tzt) obj).a.a;
        }
        if (tzvVar == null) {
            return null;
        }
        return new sm(tzvVar);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Object obj = this.a;
        if (obj != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", ((Integer) obj).intValue());
        }
        return bundle;
    }

    public final long b() {
        return c(roc.aA(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    public final long c(long j) {
        int i = (int) (j >> 32);
        if (Float.intBitsToFloat(i) <= BitmapDescriptorFactory.HUE_RED || Float.intBitsToFloat((int) (j & 4294967295L)) <= BitmapDescriptorFactory.HUE_RED) {
            crt.c("maximumVelocity should be a positive value. You specified=".concat(dlv.d(j)));
        }
        Object obj = this.a;
        tsu tsuVar = (tsu) obj;
        return roc.aA(((cro) tsuVar.c).a(Float.intBitsToFloat(i)), ((cro) tsuVar.b).a(Float.intBitsToFloat((int) (j & 4294967295L))));
    }

    public final void d(long j, long j2) {
        ((tsu) this.a).o(j, j2);
    }

    public final void e() {
        ((tsu) this.a).p();
    }

    public final float f() {
        return ((PathMeasure) this.a).getLength();
    }

    public final void g(float f, float f2, cjm cjmVar) {
        if (!(cjmVar instanceof cjm)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        ((PathMeasure) this.a).getSegment(f, f2, cjmVar.a, true);
    }

    public final void h(cjm cjmVar) {
        ((PathMeasure) this.a).setPath(cjmVar.a, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eap, java.lang.Object] */
    public final void i(int i, int i2, int i3, boolean z) {
        this.a.a(i, i2, i3, z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eap, java.lang.Object] */
    public final void j(int i, int i2, int i3, int i4) {
        this.a.b(i, i2, i3, i4);
    }

    public final dlp k() {
        return ckf.h(((Region) this.a).getBounds());
    }

    public final void l(dlp dlpVar) {
        ((Region) this.a).set(dlpVar.b, dlpVar.c, dlpVar.d, dlpVar.e);
    }

    public final boolean m() {
        return ((Region) this.a).isEmpty();
    }

    public final void n(dlp dlpVar) {
        ((Region) this.a).op(dlpVar.b, dlpVar.c, dlpVar.d, dlpVar.e, Region.Op.DIFFERENCE);
    }

    public final void o(String str) {
        ((ViewStructure) this.a).setClassName(str);
    }

    public final void p(CharSequence charSequence) {
        ((ViewStructure) this.a).setText(charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [djq, java.lang.Object] */
    public final void q() {
        ((fbf) this.a).b.i();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [djq, java.lang.Object] */
    public final void r() {
        fbf fbfVar = (fbf) this.a;
        if (fbfVar.f() != null) {
            fbfVar.b.j();
        }
    }

    public final boolean s(sm smVar) {
        Object obj = smVar.a;
        Region.Op op = Region.Op.INTERSECT;
        return ((Region) this.a).op((Region) obj, op);
    }

    public final boolean t(pyo pyoVar) {
        return pyn.a((Context) this.a, pyoVar);
    }

    public final synchronized yfq u() {
        return yfq.o(((ybm) this.a).v());
    }

    public final synchronized void v(pvo pvoVar) {
        Object obj = this.a;
        ((pvo) obj).a += pvoVar.a;
        ((pvo) obj).b += pvoVar.b;
        ((pvo) obj).c += pvoVar.c;
        ((pvo) obj).d += pvoVar.d;
        ((pvo) obj).e += pvoVar.e;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final ByteBuffer w() {
        ?? r3 = this.a;
        int iRemaining = 0;
        if (r3.isEmpty()) {
            return ByteBuffer.allocateDirect(0);
        }
        if (r3.size() == 1) {
            ByteBuffer byteBuffer = (ByteBuffer) r3.get(0);
            if (byteBuffer.hasRemaining()) {
                byteBuffer.flip();
            }
            r3.clear();
            byteBuffer.position(0);
            return byteBuffer;
        }
        for (ByteBuffer byteBuffer2 : r3) {
            byteBuffer2.flip();
            iRemaining += byteBuffer2.remaining();
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iRemaining);
        Iterator it = r3.iterator();
        while (it.hasNext()) {
            byteBufferAllocateDirect.put((ByteBuffer) it.next());
        }
        r3.clear();
        byteBufferAllocateDirect.flip();
        return byteBufferAllocateDirect;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void x(ByteBuffer byteBuffer) {
        this.a.add(byteBuffer);
    }

    public final uzy y() {
        uzz uzzVar = ((vaa) this.a).a;
        uzzVar.getClass();
        return uzzVar;
    }

    public sm(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public sm(byte[] bArr, char[] cArr) {
        this.a = new pvo();
    }

    public sm(sj sjVar) {
        this.a = CarAudioCallbackDelegate.create(sjVar);
    }

    public sm(char[] cArr) {
        this.a = new Region();
    }

    public sm(short[] sArr, byte[] bArr) {
        this.a = new yca(12, 3);
    }

    public sm() {
        this.a = new ParcelableSnapshotMutableState(afbe.a, bxp.c);
    }

    public sm(Object obj) {
        this.a = obj;
    }

    public sm(char[] cArr, byte[] bArr) {
        this.a = new aetl(16);
    }

    public sm(byte[] bArr) {
        this.a = new tsu((byte[]) null);
    }

    public sm(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new Stack();
    }

    public sm(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new vaa();
    }

    public sm(byte[] bArr, byte[] bArr2) {
        this.a = yrm.r(128);
    }

    public sm(short[] sArr, byte[] bArr, byte[] bArr2) {
        int i = yfq.d;
        this.a = new vaa(yls.a);
    }

    public sm(short[] sArr) {
        this.a = new ConcurrentHashMap();
    }

    public sm(nzj nzjVar) {
        this.a = new ymp(nzjVar);
    }

    public sm(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = new ArrayList();
    }

    public sm(tzv tzvVar) {
        zkt.n(tzvVar, "phoenixIndoorBuilding");
        tzv tzvVar2 = tzvVar.g;
        this.a = tzvVar2 != null ? tzvVar2 : tzvVar;
    }

    public sm(tzt tztVar) {
        zkt.n(tztVar, "phoenixIndoorMapController");
        this.a = tztVar;
    }

    public sm(byte[] bArr, short[] sArr) {
        this.a = new LinkedHashMap();
    }

    public sm(int[] iArr) {
        this.a = new AtomicLong();
    }
}
