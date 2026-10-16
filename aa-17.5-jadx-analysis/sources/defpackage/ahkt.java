package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public final class ahkt {
    public static void a(ajpb ajpbVar) throws IOException {
        InputStream inputStreamB;
        if (ajpbVar == null || !ajpbVar.i() || (inputStreamB = ajpbVar.b()) == null) {
            return;
        }
        inputStreamB.close();
    }

    public static byte[] b(String str, String str2) {
        ahgm.e(str, "Input");
        if (str2 == null) {
            throw new IllegalArgumentException("Charset may not be null");
        }
        if (ahku.b(str2)) {
            throw new IllegalArgumentException("Charset may not be empty");
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    public static final aezu<ahip, ahkq> readBuiltinsPackageFragment(InputStream inputStream) throws IOException {
        inputStream.getClass();
        try {
            ahkq from = ahkq.Companion.readFrom(inputStream);
            aezu<ahip, ahkq> aezuVar = new aezu<>(from.isCompatibleWithCurrentCompilerVersion() ? ahip.parseFrom(inputStream, ahgl.ExtensionRegistryLite(ahks.INSTANCE)) : null, from);
            affa.n(inputStream, null);
            return aezuVar;
        } finally {
        }
    }
}
