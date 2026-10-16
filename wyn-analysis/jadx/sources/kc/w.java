package kc;

import E4.F;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import uc.InterfaceC4268e;
import uc.InterfaceC4269f;

/* loaded from: classes5.dex */
public final class w implements x {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4269f f39550a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f39551b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f39552c;

    /* renamed from: d, reason: collision with root package name */
    public final R1.i f39553d;

    public w(InterfaceC4269f interfaceC4269f) {
        HashMap map = new HashMap();
        this.f39552c = map;
        this.f39553d = new R1.i();
        this.f39550a = interfaceC4269f;
        Nc.d dVar = z.f39555a;
        y yVar = new y();
        yVar.f39554a = false;
        y yVar2 = new y[]{yVar}[0];
        yVar2.getClass();
        map.put(4294967556L, yVar2);
    }

    public final void a(t tVar, final F f10) throws UnsupportedEncodingException {
        long j8;
        long j10;
        byte[] bytes = null;
        InterfaceC4268e interfaceC4268e = f10 == null ? null : new InterfaceC4268e() { // from class: kc.u
            @Override // uc.InterfaceC4268e
            public final void a(ByteBuffer byteBuffer) {
                Boolean boolValueOf = Boolean.FALSE;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    if (byteBuffer.capacity() != 0) {
                        boolValueOf = Boolean.valueOf(byteBuffer.get() != 0);
                    }
                } else {
                    Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
                }
                f10.k(boolValueOf.booleanValue());
            }
        };
        try {
            String str = tVar.f39543g;
            if (str != null) {
                bytes = str.getBytes("UTF-8");
            }
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(length + 56);
            byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocateDirect.putLong(length);
            byteBufferAllocateDirect.putLong(tVar.f39537a);
            int i5 = tVar.f39538b;
            if (i5 == 1) {
                j8 = 0;
            } else if (i5 == 2) {
                j8 = 1;
            } else {
                if (i5 != 3) {
                    throw null;
                }
                j8 = 2;
            }
            byteBufferAllocateDirect.putLong(j8);
            byteBufferAllocateDirect.putLong(tVar.f39539c);
            byteBufferAllocateDirect.putLong(tVar.f39540d);
            byteBufferAllocateDirect.putLong(tVar.f39541e ? 1L : 0L);
            int i10 = tVar.f39542f;
            if (i10 == 1) {
                j10 = 0;
            } else if (i10 == 2) {
                j10 = 1;
            } else if (i10 == 3) {
                j10 = 2;
            } else if (i10 == 4) {
                j10 = 3;
            } else {
                if (i10 != 5) {
                    throw null;
                }
                j10 = 4;
            }
            byteBufferAllocateDirect.putLong(j10);
            if (bytes != null) {
                byteBufferAllocateDirect.put(bytes);
            }
            this.f39550a.j("flutter/keydata", byteBufferAllocateDirect, interfaceC4268e);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public final void b(boolean z2, Long l10, Long l11, long j8) throws UnsupportedEncodingException {
        t tVar = new t();
        tVar.f39537a = j8;
        tVar.f39538b = z2 ? 1 : 2;
        tVar.f39540d = l10.longValue();
        tVar.f39539c = l11.longValue();
        tVar.f39543g = null;
        tVar.f39541e = true;
        tVar.f39542f = 1;
        if (l11.longValue() != 0 && l10.longValue() != 0) {
            if (!z2) {
                l10 = null;
            }
            c(l11, l10);
        }
        a(tVar, null);
    }

    public final void c(Long l10, Long l11) {
        HashMap map = this.f39551b;
        if (l11 != null) {
            if (((Long) map.put(l10, l11)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) map.remove(l10)) == null) {
            throw new AssertionError("The key was empty");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ee  */
    @Override // kc.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(final android.view.KeyEvent r32, E4.F r33) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instructions count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kc.w.t(android.view.KeyEvent, E4.F):void");
    }
}
