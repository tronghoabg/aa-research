package defpackage;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ahkp {
    private ahkp() {
    }

    public static Charset a(String str) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        try {
            return Charset.forName(str);
        } catch (UnsupportedCharsetException unused) {
            throw new UnsupportedEncodingException(str);
        }
    }

    public static void b(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str.concat(" is null"));
        }
    }

    public final ahkq readFrom(InputStream inputStream) {
        inputStream.getClass();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        afha afhaVar = new afha(1, dataInputStream.readInt());
        ArrayList arrayList = new ArrayList(woy.bp(afhaVar, 10));
        afbk it = afhaVar.iterator();
        while (((afgz) it).a) {
            it.a();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
        int[] iArrCp = woy.cp(arrayList);
        return new ahkq(Arrays.copyOf(iArrCp, iArrCp.length));
    }

    public /* synthetic */ ahkp(afeu afeuVar) {
        this();
    }
}
