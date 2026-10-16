package a2;

import S1.A;
import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1321a implements S1.h {

    /* renamed from: a, reason: collision with root package name */
    public final S1.h f17145a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f17146b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f17147c;

    /* renamed from: d, reason: collision with root package name */
    public CipherInputStream f17148d;

    public C1321a(S1.h hVar, byte[] bArr, byte[] bArr2) {
        this.f17145a = hVar;
        this.f17146b = bArr;
        this.f17147c = bArr2;
    }

    @Override // S1.h
    public final void C(A a5) {
        a5.getClass();
        this.f17145a.C(a5);
    }

    @Override // S1.h
    public final void close() {
        if (this.f17148d != null) {
            this.f17148d = null;
            this.f17145a.close();
        }
    }

    @Override // S1.h
    public final Map d() {
        return this.f17145a.d();
    }

    @Override // S1.h
    public final Uri k() {
        return this.f17145a.k();
    }

    @Override // N1.InterfaceC0758g, t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        this.f17148d.getClass();
        int i11 = this.f17148d.read(bArr, i5, i10);
        if (i11 < 0) {
            return -1;
        }
        return i11;
    }

    @Override // S1.h
    public final long y(S1.k kVar) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f17146b, "AES"), new IvParameterSpec(this.f17147c));
                S1.j jVar = new S1.j(this.f17145a, kVar);
                this.f17148d = new CipherInputStream(jVar, cipher);
                if (jVar.f10867d) {
                    return -1L;
                }
                jVar.f10864a.y(jVar.f10865b);
                jVar.f10867d = true;
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e7) {
                throw new RuntimeException(e7);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
            throw new RuntimeException(e10);
        }
    }
}
