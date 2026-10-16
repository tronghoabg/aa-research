package c2;

import N1.D;
import Q1.k;
import g2.AbstractC2671A;
import g2.z;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import l8.AbstractC3409K;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f19561a;

    /* renamed from: b, reason: collision with root package name */
    public long f19562b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19563c;

    public g(int i5, URL url, long j8) {
        this.f19561a = i5;
        this.f19563c = url;
        this.f19562b = j8;
    }

    public static byte[] b(byte b5, DataInputStream dataInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {b5, dataInputStream.readByte()};
        byteArrayOutputStream.write(bArr);
        while (true) {
            if (bArr[0] == 13 && bArr[1] == 10) {
                return byteArrayOutputStream.toByteArray();
            }
            bArr[0] = bArr[1];
            byte b10 = dataInputStream.readByte();
            bArr[1] = b10;
            byteArrayOutputStream.write(b10);
        }
    }

    public AbstractC3409K a(byte[] bArr) {
        long j8;
        k.c(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
        String str = new String(bArr, 0, bArr.length - 2, z.f35699g);
        ArrayList arrayList = (ArrayList) this.f19563c;
        arrayList.add(str);
        int i5 = this.f19561a;
        if (i5 == 1) {
            if (!AbstractC2671A.f35503a.matcher(str).matches() && !AbstractC2671A.f35504b.matcher(str).matches()) {
                return null;
            }
            this.f19561a = 2;
            return null;
        }
        if (i5 != 2) {
            throw new IllegalStateException();
        }
        try {
            Matcher matcher = AbstractC2671A.f35505c.matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                j8 = Long.parseLong(strGroup);
            } else {
                j8 = -1;
            }
            if (j8 != -1) {
                this.f19562b = j8;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f19562b > 0) {
                this.f19561a = 3;
                return null;
            }
            AbstractC3409K abstractC3409KJ = AbstractC3409K.j(arrayList);
            arrayList.clear();
            this.f19561a = 1;
            this.f19562b = 0L;
            return abstractC3409KJ;
        } catch (NumberFormatException e7) {
            throw D.b(str, e7);
        }
    }
}
