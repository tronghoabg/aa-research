package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes3.dex */
public final class ahfm {
    private ahfm() {
    }

    public static final ajmz a(ajoa ajoaVar) {
        ajoaVar.getClass();
        return new ajnu(ajoaVar);
    }

    public static final ajna b(ajoc ajocVar) {
        ajocVar.getClass();
        return new ajnw(ajocVar);
    }

    public static final ajoa c(Socket socket) throws IOException {
        socket.getClass();
        ajoo ajooVar = new ajoo(socket);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.getClass();
        return new ajmt(ajooVar, new ajnq(outputStream, ajooVar));
    }

    public static final ajoa d(File file, boolean z) throws FileNotFoundException {
        return new ajnq(new FileOutputStream(file, z), new ajoe());
    }

    public static final ajoc e(InputStream inputStream) {
        inputStream.getClass();
        return new ajnm(inputStream, new ajoe());
    }

    public static final ajoc f(Socket socket) throws IOException {
        socket.getClass();
        ajoo ajooVar = new ajoo(socket);
        InputStream inputStream = socket.getInputStream();
        inputStream.getClass();
        return new ajmu(ajooVar, new ajnm(inputStream, ajooVar));
    }

    public final ahfn fromFieldNameAndDesc(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new ahfn(str + '#' + str2, null);
    }

    public final ahfn fromJvmMemberSignature(ahmn ahmnVar) {
        ahmnVar.getClass();
        if (ahmnVar instanceof ahmm) {
            ahmm ahmmVar = (ahmm) ahmnVar;
            return fromMethodNameAndDesc(ahmmVar.getName(), ahmmVar.getDesc());
        }
        if (!(ahmnVar instanceof ahml)) {
            throw new aezs();
        }
        ahml ahmlVar = (ahml) ahmnVar;
        return fromFieldNameAndDesc(ahmlVar.getName(), ahmlVar.getDesc());
    }

    public final ahfn fromMethod(ahld ahldVar, ahlv ahlvVar) {
        ahldVar.getClass();
        ahlvVar.getClass();
        return fromMethodNameAndDesc(ahldVar.getString(ahlvVar.getName()), ahldVar.getString(ahlvVar.getDesc()));
    }

    public final ahfn fromMethodNameAndDesc(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new ahfn(str.concat(str2), null);
    }

    public final ahfn fromMethodSignatureAndParameterIndex(ahfn ahfnVar, int i) {
        ahfnVar.getClass();
        return new ahfn(ahfnVar.getSignature() + '@' + i, null);
    }

    public /* synthetic */ ahfm(afeu afeuVar) {
        this();
    }
}
