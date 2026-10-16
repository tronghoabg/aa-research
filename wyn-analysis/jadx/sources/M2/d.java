package M2;

import android.content.res.TypedArray;
import android.util.Base64;
import android.util.SparseArray;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import ka.AbstractC3256n;
import md.J;
import org.apache.tika.pipes.PipesConfigBase;
import u6.AbstractC4256a;

/* loaded from: classes.dex */
public final class d implements J5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7300a;

    /* renamed from: b, reason: collision with root package name */
    public int f7301b;

    /* renamed from: c, reason: collision with root package name */
    public int f7302c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7303d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7304e;

    public d(ByteString byteString, int i5, int i10) {
        this.f7300a = 4;
        if (i5 < 0 || i5 >= 8) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "Invalid padding: "));
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(i10, "Invalid hash count: "));
        }
        if (byteString.size() > 0 && i10 == 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(i10, "Invalid hash count: "));
        }
        if (byteString.size() == 0 && i5 != 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "Expected padding of 0 when bitmap length is 0, but got "));
        }
        this.f7303d = byteString;
        this.f7302c = i10;
        this.f7301b = (byteString.size() * 8) - i5;
        try {
            this.f7304e = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e7) {
            throw new RuntimeException("Missing MD5 MessageDigest provider: ", e7);
        }
    }

    public static d a(ByteString byteString, int i5, int i10) throws v9.e {
        if (i5 < 0 || i5 >= 8) {
            throw new v9.e(AbstractC3256n.g(i5, "Invalid padding: "));
        }
        if (i10 < 0) {
            throw new v9.e(AbstractC3256n.g(i10, "Invalid hash count: "));
        }
        if (byteString.size() > 0 && i10 == 0) {
            throw new v9.e(AbstractC3256n.g(i10, "Invalid hash count: "));
        }
        if (byteString.size() != 0 || i5 == 0) {
            return new d(byteString, i5, i10);
        }
        throw new v9.e(AbstractC3256n.g(i5, "Expected padding of 0 when bitmap length is 0, but got "));
    }

    public static long b(int i5, byte[] bArr) {
        long j8 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j8 |= (bArr[i5 + i10] & 255) << (i10 * 8);
        }
        return j8;
    }

    @Override // J5.e, s2.g
    public void s() {
        byte[] bArr = u6.v.f46726f;
        Y4.b bVar = (Y4.b) this.f7304e;
        bVar.getClass();
        bVar.y(bArr.length, bArr);
    }

    @Override // J5.e
    public J5.d t(J5.h hVar, long j8) {
        long j10 = hVar.f5646d;
        int iMin = (int) Math.min(this.f7302c, hVar.f5645c - j10);
        Y4.b bVar = (Y4.b) this.f7304e;
        bVar.x(iMin);
        hVar.c(bVar.f16679a, 0, iMin, false);
        int i5 = bVar.f16681c;
        long j11 = -1;
        long j12 = -1;
        long j13 = -9223372036854775807L;
        while (bVar.a() >= 188) {
            byte[] bArr = bVar.f16679a;
            int i10 = bVar.f16680b;
            while (i10 < i5 && bArr[i10] != 71) {
                i10++;
            }
            int i11 = i10 + 188;
            if (i11 > i5) {
                break;
            }
            long jK = ic.d.K(bVar, i10, this.f7301b);
            if (jK != -9223372036854775807L) {
                long jB = ((u6.t) this.f7303d).b(jK);
                if (jB > j8) {
                    return j13 == -9223372036854775807L ? new J5.d(-1, jB, j10) : new J5.d(0, -9223372036854775807L, j10 + j12);
                }
                j13 = jB;
                if (PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH + j13 > j8) {
                    return new J5.d(0, -9223372036854775807L, j10 + i10);
                }
                j12 = i10;
            }
            bVar.A(i11);
            j11 = i11;
        }
        return j13 != -9223372036854775807L ? new J5.d(-2, j13, j10 + j11) : J5.d.f5628d;
    }

    public String toString() {
        switch (this.f7300a) {
            case 4:
                return "BloomFilter{hashCount=" + this.f7302c + ", size=" + this.f7301b + ", bitmap=\"" + Base64.encodeToString(((ByteString) this.f7303d).toByteArray(), 2) + "\"}";
            default:
                return super.toString();
        }
    }

    public d(int i5, u6.t tVar, int i10) {
        this.f7300a = 1;
        this.f7301b = i5;
        this.f7303d = tVar;
        this.f7302c = i10;
        this.f7304e = new Y4.b();
    }

    public d(int i5, int i10, float[] fArr, float[] fArr2) {
        this.f7300a = 5;
        this.f7301b = i5;
        AbstractC4256a.e(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f7303d = fArr;
        this.f7304e = fArr2;
        this.f7302c = i10;
    }

    public d(d dVar) {
        this.f7300a = 6;
        float[] fArr = (float[]) dVar.f7303d;
        this.f7301b = fArr.length / 3;
        this.f7303d = AbstractC4256a.m(fArr);
        this.f7304e = AbstractC4256a.m((float[]) dVar.f7304e);
        int i5 = dVar.f7302c;
        if (i5 == 1) {
            this.f7302c = 5;
        } else if (i5 != 2) {
            this.f7302c = 4;
        } else {
            this.f7302c = 6;
        }
    }

    public d(String str, ByteBuffer byteBuffer, int i5, int i10) {
        this.f7300a = 3;
        this.f7301b = i5;
        this.f7303d = str;
        this.f7302c = i10;
        this.f7304e = byteBuffer;
    }

    public d(f8.m mVar, J j8) {
        this.f7300a = 2;
        this.f7303d = new SparseArray();
        this.f7304e = mVar;
        TypedArray typedArray = (TypedArray) j8.f40581b;
        this.f7301b = typedArray.getResourceId(26, 0);
        this.f7302c = typedArray.getResourceId(50, 0);
    }

    public d(int i5) {
        this.f7300a = 0;
        this.f7303d = new t[i5];
        this.f7302c = 0;
    }
}
