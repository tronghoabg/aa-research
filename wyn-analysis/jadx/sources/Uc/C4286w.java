package uc;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.fork.ForkServer;
import qf.C3893a;

/* renamed from: uc.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4286w implements InterfaceC4277n {

    /* renamed from: a, reason: collision with root package name */
    public static final C4286w f46765a = new C4286w();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f46766b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f46767c;

    static {
        f46766b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f46767c = Charset.forName("UTF8");
    }

    public static final void c(int i5, ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position() % i5;
        if (iPosition != 0) {
            byteBuffer.position((byteBuffer.position() + i5) - iPosition);
        }
    }

    public static final int d(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        int i5 = byteBuffer.get() & ForkServer.ERROR;
        return i5 < 254 ? i5 : i5 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    public static final void g(ByteArrayOutputStream byteArrayOutputStream, int i5) {
        int size = byteArrayOutputStream.size() % i5;
        if (size != 0) {
            for (int i10 = 0; i10 < i5 - size; i10++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    public static final void h(ByteArrayOutputStream byteArrayOutputStream, int i5) {
        if (f46766b) {
            byteArrayOutputStream.write(i5);
            byteArrayOutputStream.write(i5 >>> 8);
            byteArrayOutputStream.write(i5 >>> 16);
            byteArrayOutputStream.write(i5 >>> 24);
            return;
        }
        byteArrayOutputStream.write(i5 >>> 24);
        byteArrayOutputStream.write(i5 >>> 16);
        byteArrayOutputStream.write(i5 >>> 8);
        byteArrayOutputStream.write(i5);
    }

    public static final void i(ByteArrayOutputStream byteArrayOutputStream, long j8) {
        if (f46766b) {
            byteArrayOutputStream.write((byte) j8);
            byteArrayOutputStream.write((byte) (j8 >>> 8));
            byteArrayOutputStream.write((byte) (j8 >>> 16));
            byteArrayOutputStream.write((byte) (j8 >>> 24));
            byteArrayOutputStream.write((byte) (j8 >>> 32));
            byteArrayOutputStream.write((byte) (j8 >>> 40));
            byteArrayOutputStream.write((byte) (j8 >>> 48));
            byteArrayOutputStream.write((byte) (j8 >>> 56));
            return;
        }
        byteArrayOutputStream.write((byte) (j8 >>> 56));
        byteArrayOutputStream.write((byte) (j8 >>> 48));
        byteArrayOutputStream.write((byte) (j8 >>> 40));
        byteArrayOutputStream.write((byte) (j8 >>> 32));
        byteArrayOutputStream.write((byte) (j8 >>> 24));
        byteArrayOutputStream.write((byte) (j8 >>> 16));
        byteArrayOutputStream.write((byte) (j8 >>> 8));
        byteArrayOutputStream.write((byte) j8);
    }

    public static final void j(ByteArrayOutputStream byteArrayOutputStream, int i5) {
        if (i5 < 254) {
            byteArrayOutputStream.write(i5);
            return;
        }
        if (i5 > 65535) {
            byteArrayOutputStream.write(255);
            h(byteArrayOutputStream, i5);
            return;
        }
        byteArrayOutputStream.write(254);
        if (f46766b) {
            byteArrayOutputStream.write(i5);
            byteArrayOutputStream.write(i5 >>> 8);
        } else {
            byteArrayOutputStream.write(i5 >>> 8);
            byteArrayOutputStream.write(i5);
        }
    }

    @Override // uc.InterfaceC4277n
    public final ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        C3893a c3893a = new C3893a();
        k(c3893a, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(c3893a.size());
        byteBufferAllocateDirect.put(c3893a.a(), 0, c3893a.size());
        return byteBufferAllocateDirect;
    }

    @Override // uc.InterfaceC4277n
    public final Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object objE = e(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return objE;
    }

    public final Object e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return f(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public Object f(byte b5, ByteBuffer byteBuffer) {
        Charset charset = f46767c;
        int i5 = 0;
        switch (b5) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                byte[] bArr = new byte[d(byteBuffer)];
                byteBuffer.get(bArr);
                return new BigInteger(new String(bArr, charset), 16);
            case 6:
                c(8, byteBuffer);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                byte[] bArr2 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr2);
                return new String(bArr2, charset);
            case 8:
                byte[] bArr3 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr3);
                return bArr3;
            case 9:
                int iD = d(byteBuffer);
                int[] iArr = new int[iD];
                c(4, byteBuffer);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position((iD * 4) + byteBuffer.position());
                return iArr;
            case 10:
                int iD2 = d(byteBuffer);
                long[] jArr = new long[iD2];
                c(8, byteBuffer);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position((iD2 * 8) + byteBuffer.position());
                return jArr;
            case 11:
                int iD3 = d(byteBuffer);
                double[] dArr = new double[iD3];
                c(8, byteBuffer);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position((iD3 * 8) + byteBuffer.position());
                return dArr;
            case 12:
                int iD4 = d(byteBuffer);
                ArrayList arrayList = new ArrayList(iD4);
                while (i5 < iD4) {
                    arrayList.add(e(byteBuffer));
                    i5++;
                }
                return arrayList;
            case 13:
                int iD5 = d(byteBuffer);
                HashMap map = new HashMap();
                while (i5 < iD5) {
                    map.put(e(byteBuffer), e(byteBuffer));
                    i5++;
                }
                return map;
            case 14:
                int iD6 = d(byteBuffer);
                float[] fArr = new float[iD6];
                c(4, byteBuffer);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position((iD6 * 4) + byteBuffer.position());
                return fArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
    }

    public void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i5 = 0;
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            byteArrayOutputStream.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        boolean z2 = obj instanceof Number;
        Charset charset = f46767c;
        if (z2) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                h(byteArrayOutputStream, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                i(byteArrayOutputStream, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                g(byteArrayOutputStream, 8);
                i(byteArrayOutputStream, Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            } else {
                if (!(obj instanceof BigInteger)) {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                byteArrayOutputStream.write(5);
                byte[] bytes = ((BigInteger) obj).toString(16).getBytes(charset);
                j(byteArrayOutputStream, bytes.length);
                byteArrayOutputStream.write(bytes, 0, bytes.length);
                return;
            }
        }
        if (obj instanceof CharSequence) {
            byteArrayOutputStream.write(7);
            byte[] bytes2 = obj.toString().getBytes(charset);
            j(byteArrayOutputStream, bytes2.length);
            byteArrayOutputStream.write(bytes2, 0, bytes2.length);
            return;
        }
        if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            byte[] bArr = (byte[]) obj;
            j(byteArrayOutputStream, bArr.length);
            byteArrayOutputStream.write(bArr, 0, bArr.length);
            return;
        }
        if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            j(byteArrayOutputStream, iArr.length);
            g(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i5 < length) {
                h(byteArrayOutputStream, iArr[i5]);
                i5++;
            }
            return;
        }
        if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            j(byteArrayOutputStream, jArr.length);
            g(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i5 < length2) {
                i(byteArrayOutputStream, jArr[i5]);
                i5++;
            }
            return;
        }
        if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            j(byteArrayOutputStream, dArr.length);
            g(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i5 < length3) {
                i(byteArrayOutputStream, Double.doubleToLongBits(dArr[i5]));
                i5++;
            }
            return;
        }
        if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List list = (List) obj;
            j(byteArrayOutputStream, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k(byteArrayOutputStream, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            j(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                k(byteArrayOutputStream, entry.getKey());
                k(byteArrayOutputStream, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        byteArrayOutputStream.write(14);
        float[] fArr = (float[]) obj;
        j(byteArrayOutputStream, fArr.length);
        g(byteArrayOutputStream, 4);
        int length4 = fArr.length;
        while (i5 < length4) {
            h(byteArrayOutputStream, Float.floatToIntBits(fArr[i5]));
            i5++;
        }
    }
}
