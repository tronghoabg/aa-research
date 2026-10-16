package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

/* loaded from: classes3.dex */
public final class zrp {
    public static final zrp a = new zrp();

    /* JADX WARN: Type inference failed for: r3v2, types: [abow, java.lang.Object] */
    public static final abow a(abpc abpcVar, DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        InputStream zrdVar = new zrd(dataInputStream, Math.abs(i));
        if (i < 0) {
            zrdVar = new GZIPInputStream(zrdVar);
        }
        try {
            return abpcVar.e(zrdVar);
        } finally {
            zrdVar.close();
        }
    }

    public static final void b(OutputStream outputStream, abow abowVar) throws IOException {
        new DataOutputStream(outputStream).writeInt(abowVar.m());
        abowVar.g(outputStream);
    }
}
